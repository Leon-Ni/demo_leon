/**
 * @author adminstrator
 *
 */
public class DateUtil {

	public static int calcDiffDay(long startTime, long endTime) {
		long interval = startTime - endTime;
		int day = (int) interval / (24 * 60 * 60 * 1000);
		return day;
	}

	public static int calcDiffHour(long startTime, long endTime) {
		long interval = startTime - endTime;
		int day = (int) interval / (24 * 60 * 60 * 1000);
		int hour = (int) (interval / (60 * 60 * 1000) - day * 24);
		return hour;
	}

	public static int calcDiffMin(long startTime, long endTime) {
		long interval = startTime - endTime;
		int day = (int) interval / (24 * 60 * 60 * 1000);
		int hour = (int) (interval / (60 * 60 * 1000) - day * 24);
		int min = (int) ((interval / (60 * 1000)) - day * 24 * 60 - hour * 60);
		return min;
	}

	public static int calcDiffSencond(long startTime, long endTime) {
		long interval = startTime - endTime;
		int day = (int) interval / (24 * 60 * 60 * 1000);
		int hour = (int) (interval / (60 * 60 * 1000) - day * 24);
		int min = (int) ((interval / (60 * 1000)) - day * 24 * 60 - hour * 60);
		int sencond = (int) (interval / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
		return sencond;
	}

}
