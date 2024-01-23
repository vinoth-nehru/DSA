/*
Integer to String
*/
#include <stdio.h>
#include <string.h>
int main()
{
    int num=311,num1=311;
    char str[100];
    int n=0;
    while(num1>0){
        n++;
        num1/=10;
    }
    n=n-1;
    while(num>0){
        str[n--]=num%10+'0';
        num/=10;
    }
    printf("%s",str);
}
