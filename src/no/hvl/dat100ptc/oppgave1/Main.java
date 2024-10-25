package no.hvl.dat100ptc.oppgave1;

public class Main {

	public static void main(String[] args) {
		
		// TODO
		
        GPSPoint gpsPoint = new GPSPoint(1, 2.0, 3.0, 5.0);

      
        System.out.println("TimeStamp: " + gpsPoint.getTime());

        
        gpsPoint.setTime(2);

      
        System.out.println(gpsPoint.toString());
		
	}

}
