
public class SecretAgent {
int crackCode(Vault vault) {
	for (int i=0; i<1000000;i++) {
		if (vault.tryCode(i)==true) {
			return i;
		}
	}
	return -1;
  }
}
