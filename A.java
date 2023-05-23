class A{   //parent class
	void money(){
		System.out.println("1 million dollars"); 
	}	
}
class B{  //parent class
	void clothes(){
		System.out.println("The child gets clothes");
	}

}


class D extends A,B{
	public static void main(String[] args){
		 A a = new A();
		 a.money(); 
		System.out.println("*******************************");
		 D d = new D();
		 d.money();


	}
}