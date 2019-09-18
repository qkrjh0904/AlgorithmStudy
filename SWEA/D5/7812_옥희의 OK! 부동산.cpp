#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
	int t;
	cin>>t;
	int case_num=1;
	while( t-- != 0 ){
		int answer=0;
		int n, m;
		cin>>n>>m;
		vector<int> v(n);
		for(int i=0; i<n; ++i)
			cin>>v[i];
		
		for(int i=0; i<n; ++i){
			int temp_m = m;
			for(int j=0; i+j<n; j++){
				if(temp_m>=v[i+j]){
					temp_m -= v[i+j];
				}
				else
					break;
			}
			if(temp_m==0)
				answer++;
		}
		cout<<"#"<<case_num++<<' '<<answer<<'\n';
	}
}
