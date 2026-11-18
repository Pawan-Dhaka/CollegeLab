// Write a program to implement a friend function

// #include <iostream>
// using namespace std;
// class student
// {
//     int a;
//     int b;
// public:
//     void setvalue(int x, int y)
//     {
//         a = x;
//         b = y;
//     }
//     friend float mean (student a );
// };
// float mean(student a){
//     return (a.a+a.b)/2;
// }

// int main()
// {
//     student pawan;
//     pawan.setvalue(6, 8);
//     cout<<mean(pawan)<<endl;
//     return 0;
// }

#include <iostream>
using namespace std;
class student2;
class student
{
    int a;

public:
    void setvalue()
    {
        a = 654;
    }

    friend float max(student, student2);
};
class student2
{
    int b;

public:
    void setvalue()
    {

        b = 65;
    }
    friend float max(student, student2);
};
float max(student p, student2 q)
{
    if (p.a > q.b)
        return p.a;
    else
        return q.b;
}

int main()
{
    student fg;
    fg.setvalue();

    student2 ty;
    ty.setvalue();
    cout << "Max Num is : " << max(fg, ty);
    return 0;
}