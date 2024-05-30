#include<bits/stdc++.h>

using namespace std;

typedef long long int ll;

int main(){
    ll a, b;

    while(true){
        cin>>a>>b;
        if(a == 0 && b == 0) break;

        int qcarr = 0, mod = 0;
        while(a || b){
            mod += a%10;
            mod += b%10;
            mod /= 10;
            qcarr += mod;
            a /= 10;
            b /= 10;
        }

        if(qcarr == 0) cout<<"No carry operation.";
        else if(qcarr == 1) cout<<"1 carry operation.";
        else cout<<qcarr<<" carry operations.";
        cout<<endl;
    }
}
