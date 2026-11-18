//***********There are 9 code in this file**************/
// #include<iostream>
// using namespace std;
// class student{
//     private:
//     int a,b;
//     public:
//     void sum(int x , int y){
//         a=x;
//         b=y;
//         int c = a+b;
//         cout<<"sum of "<<a<<" and "<<b<<" will be - "<<c<<endl;
//     }
// };
// int main(){
// //class- set of members and fuctions
// // 2 attribute - data member , data fuction
// // by default members are private
// student pawan;
// pawan.sum(5,6);
// return 0;
// }

// #include<iostream>
// using namespace std;
// class student{
//     string name;
//     int age;
//     public:
//     void setAdd(string h, int a){
//         name=h;
//         age = a;
//     }
//     void display(){
//         cout<<name<<" "<<age<<endl;
//     }
// };
// int main(){
// student s;
// s.setAdd("pawan",16);
// s.display();
// return 0;
// }

// #include <iostream>
// using namespace std;
// class student
// {
//     string name;
//     int age;
// public:
//     void setAdd(string h, int a);
//     void display();
// };
// void student ::setAdd(string h, int a)
// {
//     name = h;
//     age = a;
// }
// void student ::display()
// {
//     cout << name << " " << age << endl;
// }
// int main()
// {
//     student s;
//     s.setAdd("pawan", 16);
//     s.display();
//     return 0;
// }

// swapping using call by reference

// #include<iostream>
// using namespace std;
// class Swap{
//     public:
//     void swapnum(int &a, int &b){
//         int temp = a;
//         a=b;
//         b= temp;
//     }
// };
// int main(){
// int a= 12, b =67;
// Swap s;
// s.swapnum(a,b),
// cout<<"a= "<<a<<" and "<<" b = "<<b;
// return 0;
// }
// Constuctor
// special member , same name as class name, it initillize values
// #include<iostream>
// using namespace std;
// class student {
//     string name;
//     int age;
//     public:
//     student(){
//         name="Pawan";
//         age= 20;
//     }
//     void display(){
//         cout<<name<<" and "<<age<<endl;
//     }
// };
// int main(){
//     student pawan;
//     pawan.display();
// return 0;
// }

// #include <iostream>
// using namespace std;
// class student
// {
//     string name;
//     int age;
// public:
//     student(string h, int a)
//     {
//         name = h;
//         age = a;
//     }
//     void display()
//     {
//         cout << name << " and " << age << endl;
//     }
// };
// int main()
// {
//     student pawan("pawan", 18);
//     pawan.display();
//     return 0;
// }

// #include <iostream>
// using namespace std;
// class student
// {
//     string name;
//     int age;
// public:
//     student(string h, int a)
//     {
//         name = h;
//         age = a;
//     }
//     student(const student &obj)
//     {
//         name = obj.name;
//         age = obj.age;
//     }
//     void display()
//     {
//         cout << name << " and " << age << endl;
//     }
// };
// int main()
// {
//     student pawan("pawan", 18);
//     student hari = pawan;
//     pawan.display();
//     hari.display();
//     return 0;
// }

// WAP of contructor overloading of bank acc system
// WAP online order system ,
//  default order
//  order with item only
//  order with item + quantity
// item quantity , price

// #include<iostream>
// using namespace std;
// class BOB{
//     string name;
//     int acc_num;
//     int balance;
//     public:
//     BOB(){
// cout<<"No details are available"<<endl;
//     }
//     BOB(string str){
// name=str;
// acc_num = 0;
// balance = 0;
//     }
//     BOB(string str , int a ){
// name=str;
// acc_num = a;
// balance = 0;
//     }
//     BOB(string str , int a , int b ){
// name=str;
// acc_num = a;
// balance = b;
//     }
//     void display(){
//         cout<<"Name : "<<name<<endl;
//         if(acc_num != 0 ){
//             cout<<"Account Number : "<<acc_num<<endl;
//         }
//         if (balance != 0 ){
//             cout<< balance: "< balance<<"/- RUpees only"<<endl;
//         }
//     }
// };
// int main(){
//     BOB pawan("Pawan",100012023);
//     pawan.display();
//     BOB kosh("Kosh",100012023 , 12145);
//     kosh.display();
// return 0;
// }

// #include <iostream>
// using namespace std;
// class wallmart
// {
//     string name;
//     string item;
//     int item_num;
//     int money;
// public:
//     wallmart()
//     {
//      cout<<"Not details are available..."<<endl;
//     }
//     wallmart(string str)
//     {
//         name = str;
//         item = "NOT AVAILABLE";
//         item_num = 0;
//         money = 0;
//     }
//     wallmart(string str, string it1)
//     {
//         name = str;
//         item = it1;
//         item_num = 0;
//         money = 0;
//     }
//     wallmart(string str, string it1, int a)
//     {
//         name = str;
//         item = it1;
//         item_num = a;
//         money = 0;
//     }
//     wallmart(string str, string it1, int a, int b)
//     {
//         name = str;
//         item = it1;
//         item_num = a;
//         money = b;
//     }
//     void display()
//     {
//         cout << "Name: " << name << endl;
//         cout << "Item: " << item << endl;
//         if (item_num != 0)
//         {
//             cout << "Quantity:" << item_num << endl;
//         }
//         if (money != 0)
//         {
//             cout << "Total:" << money << "/-Rupees Only" << endl;
//         }
//     }
// };
// int main()
// {
//     wallmart pawan("Pawan");
//     pawan.display();
//     cout << endl
//          << endl;
//     wallmart kosh("Lalit", "cake", 1, 250);
//     kosh.display();
//     return 0;
// }