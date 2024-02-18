document.getElementById('getWeather').addEventListener('click', function() {
    var location = document.getElementById('location').value;
    chrome.runtime.sendMessage({location: location});
  });
  