#include<bits/stdc++.h>

using namespace std;

int main(){
    int t;
    cin>>t;
    int tc = 1;
    while(t--){
        int arr[3];
        for(int i = 0; i < 3; i++){
            cin>>arr[i];
        }

        sort(arr, arr+3);

        cout<<"Case "<<tc<<": "<<arr[1]<<endl;
        tc++;
    }

}
