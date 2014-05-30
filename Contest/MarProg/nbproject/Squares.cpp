#include<iostream>
#include<stdlib.h>
#include<stdio.h>

using namespace std;

#define D(x) cout << #x << " : " << x << endl;

#define For(i,a) for(int i=0; i<a; i++)


int compare (const void * a, const void * b){
    return ( *(int*)a - *(int*)b );
}

int main(){
    int squares[50];
    int n,k;
//    freopen("in","r",stdin);
    while(cin>>n>>k){
        For(i,n)cin>>squares[i];
        qsort(squares,n,sizeof(int),compare);
        if(n<k) cout<<-1<<endl;
        else cout<<squares[n-k]<<" 0"<<endl;
    }
}

