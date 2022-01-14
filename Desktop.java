package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("The Size is not large but is compact one");
	}

	public static void main(String[] args) {
		
		Desktop assemblePart = new Desktop();
		assemblePart.computerModel();
		assemblePart.desktopSize();
		
	}
}
