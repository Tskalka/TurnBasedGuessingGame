import java.util.Random;

// In charge of creating and getting a random number and returning it for the director
public class RandomNumber {
    private static int generatedNumber = 0;
    Random ran = new Random();


    public int GetRandom(int upper)
    {
        generatedNumber = ran.nextInt(upper);
        return generatedNumber;
    }

}
