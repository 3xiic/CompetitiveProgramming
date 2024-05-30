#include<bits/stdc++.h>

using namespace std;

typedef long long int ll;

int main(){
    string s, pr;
    int casen = 1;

    while(true){
        cin>>s;
        if(s == "*") break;
        if(s == "Hajj") pr = "Hajj-e-Akbar";
        else pr = "Hajj-e-Asghar";

        cout<<"Case "<<casen<<": "<<pr<<endl;
        casen++;
    }

}
