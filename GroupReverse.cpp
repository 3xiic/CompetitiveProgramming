#include<bits/stdc++.h>

using namespace std;

int main(){
    int g;
    string s;
    while(true){
        cin>>g;
        if(g == 0) break;

        cin>>s;
        string r[g];
        int posi = 0;
        int tam = s.length()/g;
        string pri = "";
        for(int i = 0; i < g; i++){
            r[i] = s.substr(posi, tam);
            posi += tam;
            reverse(r[i].begin(), r[i].end());
            pri += r[i];
        }

        cout<<pri<<endl;

    }

}
