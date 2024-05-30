#include<bits/stdc++.h>

using namespace std;

int bubbleSort(int arr[], int tam){
    int cont = 0;
    for(int i = 0; i < tam; i++){
        for(int j = 0; j < tam - 1; j++){
            if(arr[j] > arr[j+1]){
                int aux = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = aux;
                cont++;
            }
        }
    }
    return cont;
}

int main(){
    int n;
    while(cin>>n){
        int arr[n];
        for(int i = 0; i < n; i++){
            cin>>arr[i];
        }
        cout<<"Minimum exchange operations : "<<bubbleSort(arr, n)<<endl;
    }
}
