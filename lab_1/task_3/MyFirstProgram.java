class MyFirstClass {
	public static void main(String[] args) {
		MySecondClass o = new MySecondClass();
		System.out.println(o.sum());
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				o.setFirstElement(i);
				o.setSecondElement(j);
				System.out.print(o.sum());
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}

class MySecondClass {
	
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