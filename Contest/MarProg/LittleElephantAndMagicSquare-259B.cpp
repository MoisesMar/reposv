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
//    freopen("in","r",stdin);
    int magic[3][3];
    while(cin>>magic[0][0]>>magic[0][1]>>magic[0][2]){
        cin>>magic[1][0]>>magic[1][1]>>magic[1][2];
        cin>>magic[2][0]>>magic[2][1]>>magic[2][2];
        
        int a = magic[2][0]+magic[2][1];
        int b = magic[1][0]+magic[1][2];
        int c = magic[0][1]+magic[0][2];
        
        magic[2][2] = (b-a+c)/2;
        magic[1][1] = c-magic[2][2];
        magic[0][0] = b-magic[2][2];
        
        For(i,3){
            For(j,3){
                cout<<magic[i][j]<<" ";
            }
            cout<<endl;
        }
    }
    return 0;
}


