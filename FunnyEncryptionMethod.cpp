#include<bits/stdc++.h>

using namespace std;

typedef long long int ll;

string decimalToBinary(int decimal) {
    string binary = "";
    while(decimal > 0) {
    int rem = decimal % 2;
    binary = to_string(rem) + binary;
    decimal /= 2;
    }
    return binary;
}

int hexaToDecimal(string hexa) {
    int dec = 0, po = 0;
    for(int i = hexa.length()-1; i >= 0; i--){
        dec += pow(16, po) * (hexa[i] - '0');
        po++;
    }
    return dec;
}

int main(){
	int t;
	cin>>t;
	
	while(t--){
		int m;
		cin>>m;
		string s = "";
		s = decimalToBinary(m);
		auto b1 = count(s.begin(), s.end(), '1');
		s = decimalToBinary(hexaToDecimal(to_string(m)));
		auto b2 = count(s.begin(), s.end(), '1');
		cout<<b1<<" "<<b2<<endl;
	}
}