
public class TeaParty {
	
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
if (isWoman) {
return ("Hello Ms. Austen");
	}
if (isWoman==false&&isKnighted) {
return ("Hello Sir Isaac Newton");
}else {
	return ("Hello Mr. Orwell");
}
}
}
