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
		int p;
		cin>>p;
		vector<int> divisor(p);
		for(int i=0; i<p; ++i)
			cin>>divisor[i];
		sort(divisor.begin(), divisor.end());
		if(p==1)
			answer = divisor[0]*divisor[0];
		else
			answer = divisor[0]*divisor[p-1];
		
		cout<<"#"<<case_num++<<' '<<answer<<'\n';
	}
}
