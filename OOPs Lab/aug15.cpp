//***********There are 4 code in this file**************/
// #include<iostream>
// using namespace std;
// int main(){
//     int a,b,c;
// cout<<"Enter a :"<<endl;
// cin>>a;
// cout<<"Enter b :"<<endl;
// cin>>b;
// cout<<"Enter c :"<<endl;
// cin>>c;
// cout<<a<<"/"<<b<<"-"<<c<<"="<<(float)a/b-c<<endl;
// return 0;
// }/

// #include<iostream>
// using namespace std;
// class student{
// string name;
// int roll_no ;
// int marks;
// public:
// void setdata(string h, int a, int b){
// name=h;
// roll_no=a;
// marks=b;
// }
// void display(){
//     cout<<"Name : "<<name<<endl;
//     cout<<"Roll no.: "<<(roll_no-roll_no%1000)/1000<<"/"<<roll_no%1000<<endl;
//     cout<<"Marks : "<<marks<<endl;
// }
// };
// int main(){
//     student pawan;
//     pawan.setdata("Pawan",24480 , 98);
//     pawan.display();
// return 0;
// }

// #include<iostream>
// using namespace std;
// int main(){
// int x;
// cout<<"Enter you tempr in *F : "<<endl;
// cin>>x;
// cout<<x<<"*F = "<<(x-32)*5/9<<"*C"<<endl;
// return 0;
// }

// #include <iostream>
// using namespace std;
// struct book
// {
//     string title;
//     string author;
//     int price;
// };
// int main()
// {
//     book b[3];
//     for (int i = 0; i < 3; i++)
//     {
//         cout << "Enter book name" << endl;
//         cin >> b[i].title;
//         cout << "Enter author name" << endl;
//         cin >> b[i].author;
//         cout << "Enter price " << endl;
//         cin >> b[i].price;
//     }
//     for (int i = 0; i < 3; i++)
//     {
//         cout << "Book name: " << b[i].title << endl;
//         cout << "Book author:" << b[i].author << endl;
//         cout << "Book Price: " << b[i].price << endl;
//     }
//     return 0;
// }