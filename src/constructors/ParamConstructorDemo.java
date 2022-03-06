package constructors;

	class Std{
		int id;
		String name;

		Std(int i,String n)
		{
		id=i;
		name=n;
		}

		void display() {
		System.out.println(id+" "+name);
		}
	}

	public class ParamConstructorDemo {
	public static void main(String[] args) {

		Std std1=new Std(9,"pranathi");
		Std std2=new Std(60,"chinni");
		std1.display();
		std2.display();
	}
	}


