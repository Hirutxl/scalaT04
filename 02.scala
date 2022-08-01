object Q2
{
    def chk_int(k:Int):Unit={
        k match{
            case k if k==0 => println("Zero");
            case k if k<0  => println("Negative");
            case k if k>0  => isEven(k);
        }
    }

    def isEven(k:Int):Unit={
        k%2==0 match{
            case true => println("Even");
            case false  => println("Odd");
        }
    }


    def main(args:Array[String]):Int =
    {
        printf("Enter integer : ");
        var k = scala.io.StdIn.readInt();
        chk_int(k);
        return 0;
    }
}