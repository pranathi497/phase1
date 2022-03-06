package inner_class;

public class InnerClassAssisted3 {
	abstract class AnonymousInnerClass {
		   public abstract void display();
		}


		public class innerClassAssisted3 {

		public void main(String[] args) {
		AnonymousInnerClass i = new AnonymousInnerClass() {

		         public void display() {
		            System.out.println("Anonymous Inner Class");
		         }
		      };
		      i.display();
		   }
		}


}
