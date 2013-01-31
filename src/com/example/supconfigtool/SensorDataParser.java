package com.example.supconfigtool;

public class SensorDataParser
{
	private static String rawSensorData = new String();
	
	public static void addData(String newData)
	{
		rawSensorData += newData;
	}

	public static String getData()
	{
		String sensorData = null;
		int startIndex = rawSensorData.indexOf('$');
		if (startIndex != -1)
		{
			int endIndex = rawSensorData.indexOf('#', startIndex);
			if (endIndex != -1)
			{
				sensorData = rawSensorData.substring(startIndex, endIndex + 1);
				rawSensorData = rawSensorData.substring(endIndex + 1, rawSensorData.length());
			}
		}
		return sensorData;
	}
}