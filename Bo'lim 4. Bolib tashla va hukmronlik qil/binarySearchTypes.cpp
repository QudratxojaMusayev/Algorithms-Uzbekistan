#include<bits/stdc++.h>

using namespace std;

const int M = 100000007;
#define ll long long;

int simpleBinarySearch(vector<int> arr, int left, int right, int x) {
    if (left > right)
        return -1;
    int mid = left + (right - left) / 2;

    if (x == arr[mid]) {
        return mid;
    } 
    if (x < arr[mid]) {
        return simpleBinarySearch(arr, left, mid - 1, x);
    } 
    return simpleBinarySearch(arr, mid + 1, right, x);
}

int leftmostBinarySearch(vector<int> arr, int left, int right, int x) {
    if (left > right)
        return left;

    int mid = left + (right - left) / 2;
 
    if (x <= arr[mid]) {
        return leftmostBinarySearch(arr, left, mid - 1, x);
    } 
    return leftmostBinarySearch(arr, mid + 1, right, x);
}

int rightmostBinarySearch(vector<int> arr, int left, int right, int x) {
    if (left > right)
        return right;

    int mid = left + (right - left) / 2;
 
    if (x < arr[mid]) {
        return rightmostBinarySearch(arr, left, mid - 1, x);
    } 
    return rightmostBinarySearch(arr, mid + 1, right, x);
}

void solve() {
    vector<int> arr({1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 6, 7, 7, 9, 9, 9, 10});
    
    int x = 9;
    int left = 0;
    int right = arr.size() - 1;
    
    printf("Oddiy ikkilik qidiruv javobi: %d\n", simpleBinarySearch(arr, left, right, x));

    printf("Eng birinchi indeksni qaytaruvchi ikkilik qidiruv: %d\n", leftmostBinarySearch(arr, left, right, x));

    printf("Eng oxirgi indeksni qaytaruvchi ikkilik qidiruv: %d\n", rightmostBinarySearch(arr, left, right, x));

    // Tayyor funksiyalar 
    printf("Oddiy: %d\n", binary_search(arr.begin(), arr.end(), x));
    
    printf("Birinchi: %d\n", lower_bound(arr.begin(), arr.end(), x) - arr.begin());
    
    printf("Oxirgi: %d\n", upper_bound(arr.begin(), arr.end(), x) - arr.begin() - 1);
}

int main() {
    int t = 1;
    // cin >> t;
    for (int i = 0; i < t; i++) {
        solve();
    }
    return 0;
}

