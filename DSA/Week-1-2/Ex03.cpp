/*
    MSV: 23020161
    Ho va ten: Quach Duc Thien
*/
#include <bits/stdc++.h>
using namespace std;

// maximum number of elements in the array
const int maxn = (int) 1e5 + 11;

// number of elements in the array
int n;
int a[maxn];

void bubbleSort() {
    /*
        Bubble Sort Algorithm
        - Worst-case time complexity: O(n^2)
        - Best-case time complexity: O(n)
    */
    for(int i = 1; i <= n; i++) {
        bool swapped = false;
        for(int j = 1; j <= n - i; j++) {
            if(a[j] > a[j + 1]) {
                swap(a[j], a[j + 1]);
                swapped = true;
            }
        }
        if(!swapped) {
            break;
        }
    }
}

void insertionSort() {
    /*
        Insertion Sort Algorithm
        - Worst-case time complexity: O(n^2)
        - Best-case time complexity: O(n)
    */
    for(int i = 2; i <= n; i++) {
        int key = a[i];
        int j = i - 1;
        while(j >= 1 && a[j] > key) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = key;
    }
}

void selectionSort() {
    /*
        Selection Sort Algorithm
        - Worst-case time complexity: O(n^2)
        - Best-case time complexity: O(n^2)
    */
    for(int i = 1; i <= n; i++) {
        int minIndex = i;
        for(int j = i + 1; j <= n; j++) {
            if(a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
        swap(a[i], a[minIndex]);
    }
}

void mergeSort(int l, int r) {
    /*
        Merge Sort Algorithm
        - Worst-case time complexity: O(nlogn)
        - Best-case time complexity: O(nlogn)
    */
   if(l >= r) return;
    int mid = (l + r) >> 1;
    mergeSort(l, mid);
    mergeSort(mid + 1, r);
    int i = l, j = mid + 1, k = 0;
    
    // merge two sorted arrays
    vector<int> tmp(r - l + 1);
    
    while(i <= mid && j <= r) {
        if(a[i] < a[j]) {
            tmp[k++] = a[i++];
        } else {
            tmp[k++] = a[j++];
        }
    }
    while(i <= mid) {
        tmp[k++] = a[i++];
    }
    while(j <= r) {
        tmp[k++] = a[j++];
    }
    for(int i = l; i <= r; i++) {
        a[i] = tmp[i - l];
    }
}

void quickSort(int l, int r) {
    /*
        Quick Sort Algorithm
        - Worst-case time complexity: O(n^2)
        - Best-case time complexity: O(n)
    */
    if(l >= r) return;
    int pivot = a[(l + r) >> 1];
    int i = l, j = r;
    while(i <= j) {
        while(a[i] < pivot) i++;
        while(a[j] > pivot) j--;
        if(i <= j) {
            swap(a[i], a[j]);
            i++;
            j--;
        }
    }
    quickSort(l, j);
    quickSort(i, r);
}

void heapify(int i, int n) {
    int l = i << 1;
    int r = i << 1 | 1;
    int largest = i;
    if(l <= n && a[l] > a[largest]) {
        largest = l;
    }
    if(r <= n && a[r] > a[largest]) {
        largest = r;
    }
    if(largest != i) {
        swap(a[i], a[largest]);
        heapify(largest, n);
    }
}

void heapSort() {
    /*
        Heap Sort Algorithm
        - Worst-case time complexity: O(nlogn)
        - Best-case time complexity: O(nlogn)
    */
    for(int i = n >> 1; i >= 1; i--) {
        heapify(i, n);
    }
    for(int i = n; i >= 2; i--) {
        swap(a[1], a[i]);
        heapify(1, i - 1);
    }
}

void radixSort() {
    /*
        Radix Sort Algorithm
        - Worst-case time complexity: O(n * log10(max(a)))
        - Best-case time complexity: O(n * log10(max(a)))
    */
    int maxVal = *max_element(a + 1, a + n + 1);
    int exp = 1;
    while(maxVal / exp > 0) {
        vector<int> tmp(n + 1);
        vector<int> cnt(10, 0);
        for(int i = 1; i <= n; i++) {
            cnt[(a[i] / exp) % 10]++;
        }
        for(int i = 1; i < 10; i++) {
            cnt[i] += cnt[i - 1];
        }
        for(int i = n; i >= 1; i--) {
            tmp[cnt[(a[i] / exp) % 10]--] = a[i];
        }
        for(int i = 1; i <= n; i++) {
            a[i] = tmp[i];
        }
        exp *= 10;
    }
}

void printArray() {
    for(int i = 1; i <= n; i++) {
        cout << a[i] << " ";
    }
    cout << "\n";
}

int main() {
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    // read the number of elements in the array
    cin >> n;
    for(int i = 1; i <= n; i++) {
        cin >> a[i];
    }
    
    // Bubble Sort
    bubbleSort();

    // Insertion Sort
    // insertionSort();

    // // Selection Sort
    // selectionSort();

    // // Merge Sort
    // mergeSort(1, n);

    // // Quick Sort
    // quickSort(1, n);

    // // Heap Sort
    // heapSort();

    // // Radix Sort
    // radixSort();

    printArray();
    return 0;
}
