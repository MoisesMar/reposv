#include <iostream>
#include <cstdlib>
#include <cstdio>

using namespace std;

int main(){
    //freopen("in","r",stdin);
    int n,k,i,x,punt=0,punt2;
    bool segFor=true;
    cin>>n>>k;
    
    for(i=0; i<k; i++){
        cin>>x;
        punt2=x;
        if(punt2 == 0){
           segFor = false;
           break; 
        }
        punt=punt2;
    }
    
    if(segFor)
    for(i=k; i<n; i++){
        cin>>x;
        if(punt!=x) break;
    }
    
    if(punt) cout<<i<<endl;
    else cout<<"0"<<endl;
}