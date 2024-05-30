#include<bits/stdc++.h>

using namespace std;

int main(){
    int casen = 1;
    while(true){
        int n;
        cin>>n;
        if(n < 0) break;

        int i = 0, aux = 1;

        while(aux < n){
            i++;
            aux *= 2;
        }


        cout<<"Case "<<casen<<": "<<i<<endl;
        casen++;
    }


}
