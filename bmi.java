import java.util.Scanner; 
class bmi 
{ 
  public static void main(String[]args) 
  { 
   Scanner sc = new Scanner(System.in); 
  { 
   System.out.print("Input your weight(Kg.) : ");  //รับค่าน้ำหนักมาเป็นกิโลกรัม
   double weight = sc.nextDouble(); 
   System.out.print("Input your height(Cm.) : ");  //รับค่าส่วนสูงมาเป็นเซ็นติเมตร
   double height = sc.nextDouble(); 
   double h = (height / 100);              //ในการหาค่า BMI ต้องใช้ส่วนสูงเป็นเมตร จึงนำส่วนสูงที่ได้มาหาร 100
   double bmi = weight / (h * h);         //สูตรในการหาค่า BMI คือ น้ำหนักตัว(กิโลกรัม) หารด้วยส่วนสูง(เมตร)ยกกำลังสอง
   System.out.print("Your BMI is : "+bmi); 
  }
  } 
}