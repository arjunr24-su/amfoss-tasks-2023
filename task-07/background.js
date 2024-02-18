chrome.runtime.onMessage.addListener((request, sender, sendResponse) => {
    fetch('http://api.weatherapi.com/v1/current.json?key=c40d9942617667d05a8c43304e48eb6c&q=' + request.location)
      .then(response => response.json())
      .then(data => {
        chrome.runtime.sendMessage({weather: data.current.temp_c + '°C'});
      });
  });
  