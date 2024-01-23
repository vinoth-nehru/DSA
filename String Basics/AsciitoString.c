/*
Ascii array to string;
*/
#include <stdio.h>
#include <string.h>
int main()
{
    int arr[5]={97,98,99,100,101};
    char str[100];
    // printf("Enter a string:\n");
    // scanf("%[^\n]s",str);
    for(int i=0;i<5;i++){
        str[i]=arr[i];
    }
    printf("%s",str);
    
}
