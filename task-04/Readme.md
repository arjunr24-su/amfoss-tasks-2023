<h1>question 2</h1>
<pre>
a=0
b=0
c=0
for i in range(int(input())):
    x,y,z=map(int,input().split())
    a+=x
    b+=y
    c+=z
if (a,b,c)==(0,0,0):
    print("YES")
else:
    print("NO")
</pre>



<h2>question 6</h2>
<pre>
def main():
    n = int(input())
    travel_times = list(map(int, input().split()))


    min_time = min(travel_times)

    count_min_time = travel_times.count(min_time)

    if count_min_time == 1:

        town_index = travel_times.index(min_time) + 1
        print(town_index)
    else:
    
        print("Still Aetheria")

if __name__ == "__main__":
    main()
</pre>
<br>
<h1>question
</h1>
<pre>
    def count_difference(s):
    a = "amfoss"
    diff_count = 0
    for i in range(len(s)):
        if s[i] != a[i]:
            diff_count += 1
    return diff_count


t = int(input())


for _ in range(t):
    s = input().strip()
    print(count_difference(s))

</pre>
