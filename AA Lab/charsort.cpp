 #include <iostream>
#include <cstdlib>
#include <chrono>
#include <fstream>
#include <string>
#include <vector>

using namespace std;
using namespace chrono;


string randomString(int length)
{
    string str = "";

    for (int i = 0; i < length; i++)
    {
        str += 'a' + rand() % 26;
    }

    return str;
}

void merge(vector<string>& arr, int left, int mid, int right)
{
    int n1 = mid - left + 1;
    int n2 = right - mid;

    vector<string> L(n1);
    vector<string> R(n2);

    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];

    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];

    int i = 0;
    int j = 0;
    int k = left;

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


void mergeSort(vector<string>& arr, int left, int right)
{
    if (left < right)
    {
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}


void printArray(vector<string>& arr)
{
    for (const string& s : arr)
        cout << s << " ";

    cout << endl;
}

int main()
{
    srand(210);
    ofstream file("graph3.csv");
    file << "N,Time\n";
    for (int n = 100; n <= 10000; n += 1000)
    {
        vector<string> arr(n);

        for (int i = 0; i < n; i++)
        {
            arr[i] = randomString(10);
        }

        auto start = high_resolution_clock::now();

        mergeSort(arr, 0, n - 1);

        auto end = high_resolution_clock::now();

        auto time = duration_cast<microseconds>(
            end - start
        ).count();

        file << n << "," << time << "\n";

        cout << "N = " << n
             << " | Time = " << time
             << " microseconds" << endl;
    }

    file.close();

    return 0;
}