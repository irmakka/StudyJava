import java.util.Random;



import java.util.Scanner;
  public class study{
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int []array= {1,2,3,4};
    for(int i=0;i<array.length;i++)
    System.out.print(array[i]);
    System.out.print("\n");
    char check;
    int positionNumber=0;
     int position,number;   
    do{
        System.out.print("Enter the number you want to change:"+"\n");
         number= scan.nextInt();
         System.out.print("Enter the place you want it to be:"+"\n");
         position=scan.nextInt();
        for(  int i=0;i<array.length;i++){
            if(array[i]==number){
              positionNumber=i;
            }

        }
        if( positionNumber >position-1){
          for(int j=positionNumber; j>position-1;j--){
              array[j]=array[j-1];
          }
               array[position-1]=number;
        }
           else{
            for(int i=positionNumber;i<position-1;i++){
              array[i]=array[i+1];
            }
             array[position-1]=number;

           }

        for(int i=0;i<array.length;i++)
        System.out.print(array[i]);
      
       check= scan.next().charAt(0);

    } while(check=='y'|| check=='Y');
      
   scan.close();
 } 
   

//Deleting  
  /* 
public static void main(String[] args) {
int[]array= new int[5];
Scanner get= new Scanner(System.in);
for(int i=0;i<array.length;i++){
    System.out.printf("Entere the %d . number of the array",i+1);
  array[i]=get.nextInt();}
System.out.print("Which basamak you want to delete:"+"\n");
 int basamak=get.nextInt();
 basamak--;
 for(int i=basamak;i<array.length-1;i++)
  array[i]=array[i+1];
 
 for(int i=0;i<array.length-1;i++)
 System.out.print(array[i]);

*/
/* 
public static void main(String[] args) {*/
// to change place   
/* 
int array[]={1,2,3,4}
int basamak=get.nextInt();
int number=get.nextInt();
basamak--;

for(int i=array.length-1;i>basamak;i--){

array[i]=array[i-1];
}
array[basamak]=number;
for(int i=0;i<array.length;i++){
  System.out.print(array[i]);
}
get.close();
*/
/* 

// Sıralamak için küçükten büyüğe
int []array= new int [5];
int temp;
for(int i=0;i<array.length;i++){
  array[i]=get.nextInt();
}
// 1 3 8 5 2
  for(int i=0;i<array.length;i++){
    for(int j=i+1;j<array.length;j++){
        if(array[i]>array[j]){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;

        }
    } 
  }
  for(int i=0;i<array.length;i++){
    System.out.print(array[i]);
  }
  */
  
/*

// STRİNGİN KENDİSİYLE TERSİ Aynı mı diye bakıyor 
boolean check=true;
int count1=5;
while(check && count1>0){

  String reverse="";
  System.out.print("\n"+"Enter string:");
  String str= get.next();
  count1--;
  for(int i=str.length()-1;i>=0;i--){
    reverse+=str.charAt(i);
  }
  int a=0;
   for(int i=0;i<str.length();i++){
    if(reverse.charAt(i)==str.charAt(i))
           a++;
} 
if(a==str.length()){
  System.out.print("Congrat");
  check=false;
}
else
 System.out.printf(" %d . Rights stayed",count1);
} 




*/
//Printing only alphabets  in String
/* 
String str=get.next();
String end="";
for(int i=0;i<str.length();i++){
if(str.charAt(i)>='a'&& str.charAt(i)<='z'|| str.charAt(i)>='A'&& str.charAt(i)<='Z'){
    end+=str.charAt(i);
}
}
for(int i=0;i<end.length();i++)
System.out.print(end.charAt(i));
*/
//Remove white spaces in 
/* 
String str= get.nextLine();
char arrayChar[]=new char[str.length()];
for(int i=0;i<str.length();i++){
  arrayChar[i]=str.charAt(i);
}
int a=0;
for(int i=0;i<arrayChar.length;i++){
  if(arrayChar[i]!=' '){
       a++;
    }
  }
    char arrayFinal[]=new char [a];
    a=0;
  for(int i=0;i<arrayChar.length;i++){
    if(arrayChar[i]!=' '){
     arrayFinal[a++] = arrayChar[i];
    }
  }
String temp="";
for(int i=0;i<arrayFinal.length;i++)
temp+=arrayFinal[i];
System.out.print(temp);
get.close();
*/
//Find min and max
 /* 
 int size=get.nextInt();
 int []array= new int[size];
 for(int i=0;i<size;i++){
  array[i]=get.nextInt();
 }
  int minimum=array[0];
  int max=array[0];
   for(int i=0;i<size;i++){
    if(array[i]<minimum){
      minimum=array[i];
    }
     if( array[i]>max){
       max=array[i];
     }
    }
    System.out.print(minimum+"\t");
    System.out.print(max);
   }*/
//İKİZ ASALLAR
/* 
for(int i=3;i<100;i++){
  int check=1;
  for(int j=2;j<=i/2;j++){
    if(i%j==0)
     check=0; 
  }
  if(check==1){
    check=1;
     for( int k=2;k<(i+2)/2;k++){
      if((i+2)%k==0){
        check=0;
      }
     }
     if(check==1){
      System.out.printf("%d \t %d\n",i,i+2);
     
     }    
  }
}
*/
}





