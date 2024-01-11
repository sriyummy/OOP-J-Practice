class Temperature
{
	public static void main(String args[])
	{
		float F = 68.0f, C = 34.0f;
		float conF = (F-32)*(0.555f);
		float conC = (C*(9/5))+32;
		System.out.println ("68 degrees Farenheit in Celcius: " + conF);
		System.out.println ("34 degrees Celcius in Farenheit: " + conC);
	}
}
		