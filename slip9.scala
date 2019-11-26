object slip9
{
    def main(args: Array[String])
    {
      
	var q=0;
        var st= Map("tony"->70,
                    "bruce"->60,
                    "peter"->30,
                    "natasha"->90,
                    "barton"->88)

  println("name        percentage")
        for ((k,v) <- st)
        println(k,v)

println("student with highest percent :")
        for ((k,v) <- st)
        {
		if(v>q)
		q=v;
        }
        for ((k,v) <- st)
        {
		if(v==q)
		println(k,v)
        }

    }
}
