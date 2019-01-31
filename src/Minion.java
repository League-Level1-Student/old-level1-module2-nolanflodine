
public class Minion {

		private String name; 
		private int eyes; 
		private String color; 
		private String master;
public Minion(String name, int i, String string2, String string3) {
			// TODO Auto-generated constructor stub
	this.name=name;
	eyes=i;
color=string2;
master=string3;
}
String getName() {
	return name;
}
 void setName(String name) {
	 this.name = name;

}
int getEyes() {
	return eyes;
}
void setEyes(int eyes) {
this.eyes=eyes;
}
String getColor() {
	return color;
}
void setColor(String color) {
	this.color=color;
}
String getMaster() {
	return master;
}
void setMaster(String master) {
this.master = master;
}
}
