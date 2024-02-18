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



<h1>question 6</h1>
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

<h1>question7
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


<h1>Question 1</h1>
<pre>
    def check_winner(grid):
    
    for i in range(3):
        if grid[i][0] == grid[i][1] == grid[i][2]:
            return grid[i][0]
        if grid[0][i] == grid[1][i] == grid[2][i]:
            return grid[0][i]
    if grid[0][0] == grid[1][1] == grid[2][2]:
        return grid[0][0]
    if grid[0][2] == grid[1][1] == grid[2][0]:
        return grid[0][2]
    
    return "DRAW"


t = int(input())


for _ in range(t):
    grid = [input() for _ in range(3)]
    print(check_winner(grid))

</pre>
<br>

<h1>Question 8 </h1>
<pre>
def can_say_hello(s):
    target = "hello"
    i, j = 0, 0
    while i < len(s) and j < len(target):
        if s[i] == target[j]:
            j += 1
        i += 1
    return j == len(target)


s = input().strip()


if can_say_hello(s):
    print("YES")
else:
    print("NO")

    
</pre>
