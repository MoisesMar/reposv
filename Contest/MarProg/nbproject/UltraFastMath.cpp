#include<iostream>
#include<cstring>
#include<cstdio>

using namespace std;

int main(){
    string num1,num2;
    freopen("in","r",stdin);
    while(cin>>num1>>num2){
        string out="";
        for(int i=0; i<num1.size(); i++){
            if(num1[i]==num2[i])out+="0";
            else out+="1";
        }
        cout <<out<<endl;
    }
}
