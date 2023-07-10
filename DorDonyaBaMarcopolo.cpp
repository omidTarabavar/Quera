#include <iostream>
using namespace std;
long long sum = 0;
int main()
{
	int t,n,m,temp,temp1,temp2;
	cin >> t;
	for(int q = 0; q < t; q++){
		sum = 0;
		cin >> n >> m;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
			{
				if(i == n - 2 && j == m - 1)
					cin >> temp1; 	
				else if(i == n - 1 && j == m - 2)
					cin >> temp2;
				else
				{
					cin >> temp;
					sum += temp;
				}					
			}
		if(n % 2 == 0 && m % 2 == 0)
			cout << sum + max(temp1,temp2) << endl;
		else
			cout << sum + temp1 + temp2 << endl;
	}
}