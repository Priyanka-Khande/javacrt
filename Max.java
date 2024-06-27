Max.java
  Write a program to find the maximum element in an array.

Input Format

Integer corresponds to the size of the array. Read n elements line by line

Constraints

1<=n<=10^7

Output Format

Print maximum value

Sample Input 0

5
1
2
33
4
5
Sample Output 0

33
Sample Input 1

3
10
210
90
Sample Output 1

210
Submissions: 676
Max Score: 0
Difficulty: Medium
Rate This Challenge:

    
More
 
#
1
#include <stdio.h>
2
#include <string.h>
3
#include <math.h>
4
#include <stdlib.h>
5
​
6
int main()
7
{
8
​
9
           int n;
10
    scanf("%d",&n);
11
    int a[n],i;
12
    for(i=0;i<n;i++)
13
    {
14
        scanf("%d",&a[i]);
15
    }
16
    int max=a[0];
17
    for(i=1;i<n;i++)
18
    {
19
        if(max<a[i])
20
            max=a[i];
21
    }
22
    printf("%d",max);
23
    return 0;
24
    
25
}
26
​
