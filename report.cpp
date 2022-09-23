#include<iostream>
using namespace std;
class Report
{
    int adno;
    char name[20];
    float marks[5],average;
    public:
    void READINFO();
    void GETAVG();
    void DISPLAYINFO();
};
void Report :: READINFO()
{
    cout<<"Enter adno : ";
    cin>>adno;
    cout<<"Enter name : ";
    cin>>name;
    cout<<"Enter 5 subjects marks : ";
    for(int i=0;i<5;i++)
        cin>>marks[i];
}
void Report :: GETAVG()
{
    for(int i=0;i<5;i++)
        average+=marks[i];
    average=average/5;
}
void Report :: DISPLAYINFO()
{
    cout<<"\n---------------------\n";
    cout<<"Adno : "<<adno;
    cout<<"\nName : "<<name;
    cout<<"\nMarks : ";
    for(int i=0;i<5;i++)
        cout<<marks[i]<<" ";
    cout<<"\nAverage : "<<average;
}
int main()
{
    Report r;
    r.READINFO();
    r.GETAVG();
    r.DISPLAYINFO();
}