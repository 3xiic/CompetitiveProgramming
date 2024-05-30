#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int r;
        cin>>r;

        int s[r];
        for(int i = 0; i < r; i++){
            cin>>s[i];
        }

        sort(s, s + r);
        int pr = 0;
        for(int i = 0; i < r; i++){
            pr += abs(s[r/2] - s[i]);
        }

        cout<<pr<<endl;
    }
}
