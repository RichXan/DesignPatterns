package Stockss;

public class Fund {
	Stock1 s1;
	Stock2 s2;
	Stock3 s3;
	Stock4 s4;
	public Fund() {
		s1 = new Stock1();
		s2 = new Stock2();
		s3 = new Stock3();
		s4 = new Stock4();
		
	}
    public void buy(){
    	s1.buy();
    	s2.buy();
    	s3.buy();
    	s4.buy();
    }

    public void returns(){
    	s1.sell();
    	s2.sell();
    	s3.sell();
    	s4.sell();
    }

}
