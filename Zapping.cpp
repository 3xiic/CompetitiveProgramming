#include<bits/stdc++.h>

using namespace std;

int main(){
    int a, b;

    while(true){
        cin>>a>>b;
        if(a == -1 && b == -1) break;

        if(a < b){
            int aux = a;
            a = b;
            b = aux;
        }

        cout<<((a-b)<100-a+b?(a-b):(100-a+b))<<endl;

    }

}
