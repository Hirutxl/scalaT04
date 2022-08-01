object Q1
{

    def amnt_of_intrst(k:Double):Double=
    {
        k match{
            case k if k<=20000 => k*0.02;
            case k if k<=200000 => k*0.04;
            case k if k<=2000000 => k*0.035;
            case k if k>2000000 => k*0.065;
        }
    }

    def main(args:Array[String]):Int =
    {
        printf("Enter amount of deposit : ");
        var k = scala.io.StdIn.readDouble();
        printf("amount of interest that the money earns in a year : %.4f/=",amnt_of_intrst(k));

        return 0;
    }
}