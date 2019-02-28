
public class Runner {
public static void main(String[] args) {
	Vault v=new Vault();
	  SecretAgent s=new SecretAgent();
	int code=  s.crackCode(v);
	System.out.println("the secret code is "+code);
	System.out.println(v.tryCode(code));
}
}

