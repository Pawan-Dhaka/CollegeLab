#include <iostream>
#include <cstdlib>
#include <chrono>
#include <fstream>
#include <thread>

using namespace std;
using namespace chrono;

void merge(int arr[], int left, int mid, int right)
{
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int L[n1], R[n2];
    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
            arr[k++] = L[i++];
        else
            arr[k++] = R[j++];
    }

    while (i < n1)
        arr[k++] = L[i++];
    while (j < n2)
        arr[k++] = R[j++];
}

void mergeSort(int arr[], int left, int right)
{
    if (left < right)
    {
        int mid = (left + right) / 2;
        thread t1(mergeSort, arr, left, mid);
        mergeSort(arr, mid + 1, right);
        t1.join();
        merge(arr, left, mid, right);
    }
}

int main()
{
    srand(210);

    ofstream file("graph2.csv");
    file << "N,Time\n";

    for (int n = 100; n <= 10000; n += 1000)
    {
        int arr[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = rand();
        }
        auto start = high_resolution_clock::now();
        mergeSort(arr, 0, n - 1);
        auto end = high_resolution_clock::now();
        file << n << ","
             << duration_cast<microseconds>(end - start).count()
             << "\n";
    }

    file.close();
    return 0;
}