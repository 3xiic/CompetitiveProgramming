#include<bits/stdc++.h>
using namespace std;

int main(){
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(2);
    int n;
    cin>>n;
    while(n--){
        int k;
        cin>>k;
        double arr[k];
        char ch[k];
        for(int i = 0; i < k; i++){
            cin>>ch[i]>>arr[i];
            arr[i] /= 100;
        }

        int m;
        cin>>m;
        double price = 0;
        m++;
        while(m--){
            string s;
            getline(cin, s);
            for(int i = 0; i < k; i++){
                auto cou = count(s.begin(), s.end(), ch[i]);
                price += cou * arr[i];
            }
        }
        cout<<price<<"$"<<endl;
    }
}
