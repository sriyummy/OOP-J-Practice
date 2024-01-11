public class Units
{
    public static void main(String args[])
	{
        float litre = 1.7f, metre = 2.4f, gram = 0.7f;
        float milli = 0.001f;
        float centi = 0.01f;
        float deci = 0.1f;
        float kilo = 1000f;
        float deca = 10f;

        System.out.println("Litre in milliliter = " + (milli * litre));
        System.out.println("Litre in centiliter = " + (centi * litre));
        System.out.println("Litre in deciliter = " + (deci * litre));
        System.out.println("Litre in kilolitre = " + (kilo * litre));
        System.out.println("Litre in decalitre = " + (deca * litre));

        System.out.println("Metre in millimeter = " + (milli * metre));
        System.out.println("Metre in centimeter = " + (centi * metre));
        System.out.println("Metre in decimeter = " + (deci * metre));
        System.out.println("Metre in kilometer = " + (kilo * metre));
        System.out.println("Metre in decameter = " + (deca * metre));

        System.out.println("Gram in milligram = " + (milli * gram));
        System.out.println("Gram in centigram = " + (centi * gram));
        System.out.println("Gram in decigram = " + (deci * gram));
        System.out.println("Gram in kilogram = " + (kilo * gram));
        System.out.println("Gram in decagram = " + (deca * gram));
    }
}
