package homeWork2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shirts s = new Shirts("white", 'M');
		s.putOn();
		System.out.println(s.color);
		System.out.println(s.size);
		{
			s.putOn();
			System.out.print(" Trouser"+"ln");
			+"\ln";
		}
		Trousers p = new Trousers("Black", 'F');
		System.out.println(p.Color);
		System.out.println(p.size);
		
	}
	}


