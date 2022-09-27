public class FormattedPrint
{
    public static void main(String[] args)
    {
        String name = "Austin David Suchanek";
        double salary = 4393.49394;
        int age = 18;

    for(int x = 0; x < 10; x++)
        System.out.printf("\nRecord: %-20s%5d%15.2f", name, age, salary);

        System.out.println(String.format("%15.2f", salary));
    }
}
