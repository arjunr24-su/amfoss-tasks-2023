##question 2

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



# question 6
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
