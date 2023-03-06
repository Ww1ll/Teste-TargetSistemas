#include <iostream>
#include <string>

using namespace std;

int main(){
	
	string caracteres;
	
	cout<<"\nInverter os caracteres de uma string";
	
	cout<<"\nDigite uma palavra ou frase: ";
	
	getline(cin, caracteres);
	
	for(int i = caracteres.size()-1; i >= 0; i--){
		cout<<caracteres[i];
	}
	
	
	return 0;
}
