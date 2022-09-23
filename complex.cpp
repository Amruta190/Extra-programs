#include<iostream>
using namespace std;
class Complex
{
    public:
    void sum(int,int,int,int);
    void difference(int,int,int,int);
    void multiply(int,int,int,int);
};
void Complex :: sum(int real1,int img1,int real2,int img2)
{
    cout<<"Sum is "<<real1+real2<<"+("<<img1+img2<<")i\n";
}
void Complex :: difference(int real1,int img1,int real2,int img2)
{
    cout<<"Difference is "<<real1-real2<<"+("<<img1-img2<<")i\n";
}
void Complex :: multiply(int real1,int img1,int real2,int img2)
{
    int t1=(real1*real2)-(img1*img2);
    int t2=(real1*img2)+(img1*real2);
    cout<<"Product is "<<t1<<"+("<<t2<<")i\n";
}
int main()
{
    int real1,img1,real2,img2;
    cout<<"Enter 1st complex number\n";
    cout<<"Enter real value : ";
    cin>>real1;
    cout<<"Enter imaginary value : ";
    cin>>img1;
    cout<<"Enter 2nd complex number\n";
    cout<<"Enter real value : ";
    cin>>real2;
    cout<<"Enter imaginary value : ";
    cin>>img2;
    Complex c;
    c.sum(real1,img1,real2,img2);
    c.difference(real1,img1,real2,img2);
    c.multiply(real1,img1,real2,img2);
}