#include<bits/stdc++.h>

using namespace std;

int main(){
    cout.setf(ios::fixed);
    cout.setf(ios::showpoint);
    cout.precision(3);
    int c;
    cin>>c;
    while(c--){
        int n;
        double avg = 0;
        cin>>n;
        double arr[n];
        for(int i = 0; i < n; i++){
            cin>>arr[i];
            avg += arr[i];
        }

        avg /= n;
        sort(arr, arr + n);
        double perc = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > avg){
                perc = n - i;
                perc /= n;
                perc *= 100;
                break;
            }
        }
        cout<<perc<<"%"<<endl;
    }

}
