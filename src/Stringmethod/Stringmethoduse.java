package Stringmethod;

public class Stringmethoduse {

	public static void main(String[] args) {

		// length method use
		String name = "Velocity";
		System.out.println(name.length());  // for same class
		
		int S =name.length();    //to use length we will create object of string      //& in printing stat- we will call it by objname.length
		System.out.println(S);  // for another class
	 System.out.println("===============");
	 
	 
		String name1= "pune";
		System.out.println(name1.length());
		
		 int p = name1.length();
		 System.out.println(p);
		
		System.out.println("==============");
		
		//System.out.println(lengthofstring);
		
		// to upper case method use
		
		System.out.println(name);
		
		String m=name.toUpperCase();
		System.out.println(m);
		System.out.println("*****************");
		
		// to lower case method
		
		System.out.println(m.toLowerCase());
		
	//	String n=new m.toLowerCase();
	//	System.out.println(n);
		System.out.println("***************");
		
		//equals method         ==case sensitive + to check memory same location 
		
		String a= "VELOCITY";
        String b= "VELOCITY";
        String c=new String ("VELOCITY");
        String d= new String("VELOCITY");
        String e= new String("VELOCITY");
        // == compare memory location of two operater
        // equals method compare character sequence of two object
        System.out.println(a==b);
		System.out.println(c==d);
		System.out.println("===========");
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println("========");
		boolean result =a.equals(c);
		System.out.println("a and c are " +result);
		System.out.println(d.equals(a)); // checking character sequence along
		System.out.println("==============");
		
		//equals ignore case            =igone case sensitive in this   //= only check char sequence
		
		String city="Pune";
		String locality="Pune";
		String dist="pune";
        System.out.println(city.equalsIgnoreCase(dist));		
        System.out.println(city.equalsIgnoreCase(locality));
		System.out.println("=============");
		
		//contains () method use           //to check sequence
		
		String k="katraj";
	System.out.println(k.contains("kat"));
	System.out.println(k.contains("kt"));
	System.out.println("*********************");
	
	//isEmpty method use                //only empty for true other false  //space count
	
	String j="test";
	String q="";
	String r="null";
	System.out.println(j.isEmpty());
	System.out.println(q.isEmpty());
	System.out.println(r.isEmpty());
	
	
	System.out.println("*************************");
	
	//isBlank             // any one character then is it false  other than true blank.
	System.out.println(q.isBlank());
	System.out.println(r.isBlank());
	System.out.println("*******************");
	
	//charAt methoduse
	
	String country= "INDIA";
	country.charAt(2);
	
	System.out.println(country.charAt(2));
	
	//char requiredChar = new country.charAt(4);
	//System.out.println(	country.charAt(2));
	System.out.println("********************");
	
	// endsWith method use
	
	System.out.println(country.endsWith("IND"));
	System.out.println(country.endsWith("IA"));
	System.out.println(country.endsWith("A"));
	System.out.println("****************");

	//startsWith method use
	
	System.out.println(country.startsWith("IND"));
	System.out.println(country.startsWith("INDIA"));
	System.out.println(country.startsWith("A"));

	System.out.println(country.startsWith("A" ,3));    //start to see from 3 index no
	System.out.println(country.startsWith("IN" ,0));
	System.out.println("*************************");
	
	
	//substring method use
	
	String testing ="VELOCITY CORPORATE TRAINING CENTER";
	String resultofstring = testing.substring(28);
	System.out.println("resultofstring");
    System.out.println(testing.substring(9, 18));	
    
    System.out.println("*********************");
    
    // concat method use
    
    String x="swapnil";
    String y ="rajesh";
    System.out.println(x.concat(y));
    System.out.println(x.concat(y));
    System.out.println("***************************");
    
    //indexof method use 
    
      String state ="Maharashtra";
      System.out.println(state.indexOf('a'));  ///index occurance
      System.out.println(state.indexOf('a',4)); // next occurance after that letter
      System.out.println("***********");
      
      //lastindexof method use
      System.out.println(state.lastIndexOf('a'));  //last valu
      System.out.println("***********************");
      
      // replace method use
      
      String tal ="pune mumbai nagpur";
      System.out.println(tal.replace('p', 't'));
      System.out.println(tal.replace("pu", "ku"));
      System.out.println(tal.replaceAll(" ", "x"));
      System.out.println("*************************");
      
      //split method use
     
    //  String tal ="punemumbainagpur";
     // System.out.println(tal.split(e));
      
      
      



	
	

	}

}
