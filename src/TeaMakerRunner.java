
public class TeaMakerRunner {
public static void main(String[] args) {
TeaBag  t=new TeaBag("dog");
t.getFlavor();
Kettle k=new Kettle();
k.getWater();
k.boil();
Cup c = new Cup();
c.makeTea(t, k.getWater());
}
}
