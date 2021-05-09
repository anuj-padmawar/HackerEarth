
//Sample code to perform I/O:

#include <iostream>

using namespace std;

int main() {
	ios::sync_with_stdio(0); 
    cin.tie(0);
	int n, sum=0;
	cin >> n;
	long a[n];
	for(int i=0;i<n-1;i++)
	{
		cin>>a[i];
		sum=sum+a[i];
	}										// Reading input from STDIN
	cout <<  (n*n) - sum << endl;		// Writing output to STDOUT
}

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail


// Write your code here

