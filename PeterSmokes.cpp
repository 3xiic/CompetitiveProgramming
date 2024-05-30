#include<bits/stdc++.h>

using namespace std;

int main(){
    int n, k;

    while(cin>>n>>k){
        int aux = n;
        while(n >= k){
            aux = aux + (n/k);
            n = (n/k) + (n%k);
        }
        cout<<aux<<endl;
    }
}
