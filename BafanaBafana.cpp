#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    int casen = 1;

    while(t--){
        int n, k, p;
        cin>>n>>k>>p;
        int prnt = (k+p)%n;
        if(prnt == 0) prnt = n;
        cout<<"Case "<<casen<<": "<<prnt<<endl;
        casen++;
    }

}
