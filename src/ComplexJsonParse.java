
import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
public static void main(String[] args) {
	JsonPath js =new JsonPath(payload.CoursePrice());
	//js.getInt()
	int count= js.getInt("courses.size()");

	System.out.println(count);
	
	int totalamount =js.getInt("dashboard.purchaseAmount");
	System.out.println(totalamount);
String title=js.get("courses[0].title");
System.out.println(title);  

for(int i=0; i<count; i++) {
	String coursetitle= js.get("courses["+ i +"].title");
	System.out.println(js.get("courses["+ i + "].price").toString());
	System.out.println(coursetitle);
	
}

System.out.println("print no of copies to be sold by RPA");

for(int i=0; i<count; i++) {
	String coursetitle= js.get("courses["+ i +"].title");
if(coursetitle.equalsIgnoreCase("RPA"))
   {
   int copies =js.get("courses["+i+"].copies");
	System.out.println(copies);
  break;
}

}
}
}