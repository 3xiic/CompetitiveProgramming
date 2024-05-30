#include <iostream>
#include <vector>

using namespace std;

void quickSort(vector<int>& arr, int left, int right) {
    if (left >= right) {
        return;
    }
    int pivot = arr[(left + right) / 2];
    int i = left, j = right;
    while (i <= j) {
        while (arr[i] < pivot) {
            i++;
        }
        while (arr[j] > pivot) {
            j--;
        }
        if (i <= j) {
            swap(arr[i], arr[j]);
            i++;
            j--;
        }
    }
    quickSort(arr, left, j);
    quickSort(arr, i, right);
}

int main() {
    
	ios_base::sync_with_stdio(false); 
    cin.tie(NULL);   
    int n;
    
    while (true) {
        cin >> n;
        if (n == 0) {
            break;
        }
        vector<int> ages(n);
        for (int i = 0; i < n; ++i) {
            cin >> ages[i];
        }
        quickSort(ages, 0, n - 1);
        for (int age : ages) {
            cout << age << " ";
        }
        cout << endl;
    }
    return 0;
}
