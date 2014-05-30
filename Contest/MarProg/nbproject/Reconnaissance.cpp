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


int main(){
    int sols[1000];
    int n,d;
//    freopen("nold.in","r",stdin);
    while(cin>>n>>d){
        int num;
        For(i,n){
            
            cin>>sols[i];
        }
        int pars=0;
        For(i,n){
            For(j,n){
                if(i!=j && abs(sols[i]-sols[j])<=d) {
                    pars++;
                }
            }
        }
        cout<<pars<<endl;
    }
}
