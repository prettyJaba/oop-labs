package myfirstpackage;

public class MySecondClass {
	
	//поля
	private int firstElement;
	private int secondElement;
	
	//методы
	public int getFirstElement() {
		return firstElement;
}
	public int getSecondElement() {
		return secondElement;
}
	public void setFirstElement(int firstElement) {
		this.firstElement = firstElement;
}
	public void setSecondElement(int secondElement) {
		this.secondElement = secondElement;
}

	//конструктор
	public MySecondClass(int firstElement, int secondElement) {
   		this.firstElement = firstElement;
   		this.secondElement = secondElement;
	}
	public MySecondClass() {
   		firstElement = 0;
   		secondElement = 0;
	}


	//метод в соответствии с вариантом
	public int sum() {
		return firstElement + secondElement;
	}
}