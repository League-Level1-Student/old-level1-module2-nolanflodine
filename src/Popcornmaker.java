

	import javax.swing.JOptionPane;

	public class Popcornmaker {
	public static void main(String[] args) {
	Microwave m=new Microwave();
	int cookTime=Integer.parseInt(JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?"));
	String flavor=JOptionPane.showInputDialog("What flavor popcorn do you want?");
	m.putInMicrowave(null);
	m.setTime(cookTime);
	m.startMicrowave();
	Popcorn p=new Popcorn(flavor);
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.applyHeat();
	p.eat();
	}
	}



