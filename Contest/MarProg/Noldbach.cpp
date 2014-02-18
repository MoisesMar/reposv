#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <climits>
#include <cassert>
#include <iostream>
#include <string>
#include <sstream>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <set>
#include <map>

using namespace std;

#define D(x) cout << #x << " : " << x << endl;

#define For(i,a) for(int i=0; i<a; i++)
#define Fori(i,a,b) for(int i=a; i<b; i++)
#define Forn(i,a,b,c) for(int i=a; i<b; i+=c)
#define pb push_back
#define mp make_pair

typedef long long int lld;
typedef vector<int> vi;
typedef vector<lld> vlld;
typedef vector<string> vs;
typedef pair<int,int> pii;
typedef vector<pii> vpii;

//funcion para calcular numeros primos
bool isPrime(int n){
    int raiz = ceil(sqrt(n));
    if(n==1) return false;
    if(n%2==0 and n!=2) return false;
    if(n%3==0 and n!=3) return false;
    Forn(i,5,n,2){
        if((n%i)==0) return false;
    }
    return true;
}

int main(){
    int primes[200]={0};
    int indVec = 0;
//    freopen("nold.in","r",stdin);    
    For(i,1000){
        if(isPrime(i)){
            primes[indVec] = i;
            indVec++;
        }
    }
    
    int n,k;
    while(cin>>n>>k){
        int nold=0;
        int sum=0;
        For(i,200){
            sum = primes[i]+primes[i+1]+1;
            if(sum>n || k==0) break;
            if(isPrime(sum)) nold++;
        }
        if(nold==k) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;
    }
}
