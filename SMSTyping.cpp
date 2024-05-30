#include<bits/stdc++.h>

using namespace std;

char onetime[] = {'a', 'd', 'g', 'j', 'm', 'p', 't', 'w', ' '};
char twotimes[] = {'b', 'e', 'h', 'k', 'n', 'q', 'u', 'x'};
char threetimes[] = {'c', 'f', 'i', 'l', 'o', 'r', 'v', 'y'};
char fourtimes[] = {'s', 'z'};

int comparate(char c){
    if(find(begin(onetime), end(onetime), c) != end(onetime)) return 1;
    if(find(begin(twotimes), end(twotimes), c) != end(twotimes)) return 2;
    if(find(begin(threetimes), end(threetimes), c) != end(threetimes)) return 3;
    if(find(begin(fourtimes), end(fourtimes), c) != end(fourtimes)) return 4;
    return 0;
}


int main(){
    int t;
    cin>>t;
    string skip;
    getline(cin, skip);
    int casen = 0;
    while(t--){
        string s;
        getline(cin, s);

        int prnt = 0;
        for(int i = 0; i < s.length(); i++){
            prnt += comparate(s[i]);
        }

        cout<<"Case #"<<++casen<<": "<<prnt<<endl;
    }
}
