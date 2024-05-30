#include <bits/stdc++.h>

using namespace std;


int main()
{
    int t;
    cin>>t;
    int casen = 1;
    while(t--){
        int n;
        cin>>n;
        int arr[n];
        
        for(int i = 0; i< n; i++){
            cin>>arr[i];
        }
        
        sort(arr, arr+n);
        
        cout<<"Case "<<casen<<": "<<arr[n/2]<<endl;
        
        casen++;
    }
}