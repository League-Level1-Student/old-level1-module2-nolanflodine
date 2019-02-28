import java.util.Random;

public class Vault {
private int code=random(1,1000000);

public  boolean tryCode(int i) {
if (i==code) {
	return true;
}
else {
return false;
}
}


private int random(int j, int k) {
	// TODO Auto-generated method stub
	return new Random().nextInt(k-j)+j;
}
}
