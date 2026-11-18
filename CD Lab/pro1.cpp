#include<iostream>
#include<string>
using namespace std;

int main(){
    string name = "PawanDhaka";
    // int num = sizeof(name);
    int num = name.length();
    cout<<"The total characters in "<<name<<" are "<<num<<endl;
    string op = "2+5-5*22a";
    int num2 = op.length();
    int count=0;
    for (int i = 0; i < num2; i++)
    {
        if (op[i] == '+' || op[i] == '-' || op[i] == '*' || op[i] == '/' || op[i] == '%')
        {
            count++;
        }
    }
    cout<<"Total operators in "<<op<<" are "<<count<<endl;
    return 0;
    
}