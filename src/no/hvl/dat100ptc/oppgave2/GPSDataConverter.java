package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 

	public static int toSeconds(String timestr) {
		
		String timePart = timestr.substring(TIME_STARTINDEX, TIME_STARTINDEX + 8);
		String [] timeComponent = timePart.split(":");
		
		int hr = Integer.parseInt(timeComponent[0]);
		int min = Integer.parseInt(timeComponent[1]);
		int sec = Integer.parseInt(timeComponent[2]);
		
		return hr * 3600 + min * 60 + sec;
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		int time = toSeconds(timeStr);
        double latitude = Double.parseDouble(latitudeStr);
        double longitude = Double.parseDouble(longitudeStr);
        double elevation = Double.parseDouble(elevationStr);
        
       
        return new GPSPoint(time, latitude, longitude, elevation);
	
		
	}
	
}
