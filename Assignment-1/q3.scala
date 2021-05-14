object q3 extends App{
    def cost(x:Int):Double={
        var unitPrice :Double =24.95;
        if(x<50 || x==50)
        {
            return unitPrice*x*0.6+3*x;
        }
        else 
        {
            return unitPrice*50*0.6+ unitPrice*(x-50)*0.6 + 3*50 + 0.75*(x-50);
        }
    }
    println(cost(60));
}
