// Project Name: Password Manager

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void generatePassword(int length){
	const char charset[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*"; // �ifre olu�tururken kullan�lacak karakter seti
	char password[length+1];
	
	srand((unsigned int) time(NULL)); //Rastgele say� �retecinin ba�lat�lmas�
	
	for(int i = 0; i<length; i++){
		int randomIndex = rand() % (sizeof(charset) - 1);
		password[i] = charset[randomIndex];
	} // �ifrenin olu�turulmas�
	
	password[length] = '\0'; //Son karakter olarak null byte girilmesi
	
	printf("Olu�turulan �ifre: %s\n", password);
	
}

int main(){
	int length;
	printf("�ifre uzunlu�unu girin: ");
	scanf("%d",&length);
	generatePassword(length);
	return 0;
}
