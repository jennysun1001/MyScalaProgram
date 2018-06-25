object foobar
{
    def main(args: Array[String]){
    var a = null;
    for (a <- 1 to 100)
    {
        if(a % 15 == 0)
        {
            println("foobar");  
        }
        else if(a % 3 == 0)
        {
            println("Foo");
        }
        else if(a % 5 == 0)
        {
            println("bar");
        }
        else
        {
            println("Not foobar lol");
        }
    }
}
}