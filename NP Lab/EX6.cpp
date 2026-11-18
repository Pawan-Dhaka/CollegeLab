#include <iostream>
#include <string>
using namespace std;
int main()
{
    char a[30], fs[30] = " ", t[3], sd, ed, x[3], s[3], d[3], y[3], ds[50] = " ";
    int i, len;
    cout << "Enter Charater to be shiffted:" << endl;
    cin >> a;
    cout << "Enter a Charater that represents starting delimiter :" << endl;
    cin >> &sd;
    cout << "Enter a Charater that represents ending delimiter :" << endl;
    cin >> &ed;
    x[0] = s[0] = s[1] = sd;
    x[1] = s[2] = '\0';
    y[0] = d[0] = d[1] = sd;
    d[1] = y[2] = '\0';
    strcat(fs, x);
    for (i = 0; i < strlen(a); i++)
    {
        t[0] = a[i];
        t[1] = '\0';
        if (t[0] == sd)
        {
            strcat(fs, s);
        }
        else if (t[0] == ed)
        {
            strcat(fs, d);
        }
        else
        {
            strcat(fs, t);
        }}
        strcat(fs,y);
        cout<<"After stuffing - "<<fs;
        len=strlen(fs);
        for ( i = 2; i < len-1; i++)
        {
            fs[i-1]=fs[i];
        }
        fs[i-1]='\0';
        cout<<"\nAfter De stuffing:"<<fs;
        
    

    return 0;
}