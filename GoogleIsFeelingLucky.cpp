#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    int casen = 1;
    while(t--){
        int maxnum = -1, v;
        string s;
        
        int rep = 10;
        string pgs[10] = {""};
        int idx = 1;
        while (rep--){
            cin>>s>>v;
            if(v > maxnum){
                for(int i = 1; i < 10; i++){
                    if(pgs[i] == "") break;
                    pgs[i] = "";
                }
                idx = 1;
                maxnum = v;
                pgs[0] = s;
            }else if(v == maxnum){
                pgs[idx] = s;
                idx++;
            }
        }
        
        cout<<"Case #"<<casen<<": "<<endl;
        for(int i = 0; i < 10; i++){
            if(pgs[i] == "") break;
            cout<<pgs[i]<<endl;
        }
        
        casen++;
    }
}