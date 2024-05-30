#include<stdio.h>

int GCD(int a, int b) {
    return b == 0 ? a : GCD(b, a % b);
}

int main(){
    int values[500];
    for(int v = 1; v < 500; v++){
        int g = 0;
        for (int i = 1; i < v+1; i++){
            for (int j = i+1; j <= v+1; j++){
                g += GCD(i, j);
            }
        }
        values[v] = g;
    }


    int n;
    while(scanf("%d", &n) && n!=0){
        printf("%d\n", values[n-1]);
    }
}
