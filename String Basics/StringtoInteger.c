/*
String to Integer
*/
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100]="311";
    int n=strlen(str);
    int num=0;
    for(int i=0;i<n;i++){
        num=num*10+str[i]-48;
    }
    printf("%d",num);
}
