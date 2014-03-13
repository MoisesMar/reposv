#include<iostream>
#include<cstdlib>
#include<cstdio>
#include<cstring>

using namespace std;

#define D(x) cout << #x << " : " << x << endl;

#define For(i,a) for(int i=0; i<a; i++)


int compare (const void * a, const void * b){
    return ( *(int*)a - *(int*)b );
}

int main(){
    string suma;
    int sumandos[100];
//    freopen("in","r",stdin);
    while(cin>>suma){
        int j=0;
        for(int i=0;i<suma.size(); i+=2){
            sumandos[j]=suma[i]-'0';
            j++;
        }
        
        qsort(sumandos,j,sizeof(int),compare);
        
        For(i,j){
            if(i<j-1) cout<<sumandos[i]<<"+";
            else cout <<sumandos[i];
        }
        cout<<endl;
    }
}


