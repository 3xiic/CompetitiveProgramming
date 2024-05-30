#include<bits/stdc++.h>

using namespace std;

int main(){
    string seq, ssq;

    while(cin>>ssq>>seq){
        if(seq.find(ssq) != std::string::npos) cout<<"Yes";
        else{
            int posSub = 0;
            for(int i = 0; i < seq.length(); i++){
                if(seq[i] == ssq[posSub]){
                    posSub++;
                }
            }

            cout<<(posSub == ssq.length()?"Yes":"No");
        }
        cout<<endl;
    }
}
