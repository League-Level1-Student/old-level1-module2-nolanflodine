
public class TeaMakerRunner {
public static void main(String[] args) {
TeaBag  t=new TeaBag("dog");
System.out.println(t.getFlavor());
Kettle k=new Kettle();
System.out.println(k.getWater());
k.boil();
Cup c = new Cup();
c.makeTea(t, k.getWater());
}
}
