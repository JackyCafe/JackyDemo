import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {
	 public static void main(String args[]) {
	        //Object serialization 物件序列化
	        try {
	            MyClass object1 = new MyClass("Hello");
	            System.out.println("物件1: " + object1);
	            FileOutputStream fos = new FileOutputStream("Cat");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(object1);
	            oos.flush();
	            oos.close();
	
	        }catch(Exception e){}
	 
	 
	        try {
	            MyClass object2;
	            FileInputStream fis = new FileInputStream("Cat");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            object2 = (MyClass) ois.readObject();
	            
	            ois.close();
	            System.out.println("物件2: "+object2.s+object2.i);
	        } catch (Exception e) {
	        }
	 
	 }
	 
	 
}
	 
	 class MyClass implements Serializable
	 { 
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		String s;
	    int i;
	    double d;
	    
	    public MyClass(String s ) {
	        this.s = s;
	        this.i = 100;
//	        this.d = d;
	    }
	 
	    @Override
	    public String toString() {
	        return "s=" + s ;
	    }
	 
	 }
	 
	 

