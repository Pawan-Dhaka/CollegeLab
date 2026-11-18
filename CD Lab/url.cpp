#include<iostream>
#include<string>
using namespace std;

int main(){
string a ;
cout<<"Enter your Url:"<<endl;
cin>>a;
int n = a.size();
if(a.substr(0,12)=="https://www." & (a.substr(n-4,n) == ".com" | a.substr(n-3,n) == ".in" ) ){
    cout<<"Given url: "<<a<<" is a valid Url.";
}else{
    cout<<"Sorry we can't reconginize your url.";
}
return 0;
}
