public enum Planet {
   	MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6),
    	MARS(6.421e+23, 3.3972e6),	JUPITER(1.9e+27,   7.1492e7), SATURN(5.688e+26, 6.0268e7),
    	URANUS(8.686e+25, 2.5559e7), NEPTUNE(1.024e+26, 2.4746e7);

   	private final double 질량, 반지름;

   	Planet(double m, double r) { 질량 = m; 반지름 = r; }
   	//속성 getters 
   	private double mass()		{return 질량;}
   	private double radius() 	{return 반지름;}

   	public static final double G = 6.6730E-11; 
   	double 표면중력가속도() { return G*질량/(반지름*반지름); }
   	double 표면무게(double 질량) { return 질량 * 표면중력가속도(); }

   	public static void main(String[] args) {
	  double 지구무게 = Double.parseDouble(args[0]);
	  double 지구질량 = 지구무게 / EARTH.표면중력가속도();

	  for (Planet p : Planet.values()) 
		System.out.printf(" %-8s에서의 무게: %5.1f%n", p, 지구질량 * p.표면중력가속도());
  	}
}