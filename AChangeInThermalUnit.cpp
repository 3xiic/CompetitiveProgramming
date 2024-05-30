#include <bits/stdc++.h>

using namespace std;

typedef long long int ll;

double convertToC(double far){
    return (far)*5/9;
}


int main()
{
    ll t;
    cin>>t;
    int casen = 1;
    while(t--){
        double c, f;
        cin>>c>>f;
        cout<<"Case "<<casen<<": "<<fixed<<setprecision(2)<<c+convertToC(f)<<endl;
        casen++;
    }
}