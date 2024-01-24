class CountObjects
{
    static int count = 0;

    CountObjects()
	{
        count++;
    }

    public void displayCount()
	{
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args)
	{
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();

        obj1.displayCount();
        obj2.displayCount();
        obj3.displayCount();
    }
}
