#include<iostream>
using namespace std;

int main(){
long a;
cout<<"Enter Your Number"<<endl;
cin>>a;
int count = 0; 
bool isinvalid = false;
for (int i = 0; i < 10; i++)
{
    
    if(a%10 == 1 | a%10 == 2 | a%10 == 3 | a%10 == 4 | a%10 == 5 | a%10 == 6 | a%10 == 7 | a%10 == 7 | a%10 == 8 | a%10 == 9| a%10 == 0   ){
        count++;
        if (count==10 & a%10 == 0 )
        {
        cout<<"Invalid Number";
        count--;
        isinvalid = true;
        }  
    }
    a /= 10;
}
if (count == 10 & a == 0)
{
   cout<<"Valid Number";
} else if(isinvalid != true){
    cout<<"Invalid Number";
}


return 0;
}