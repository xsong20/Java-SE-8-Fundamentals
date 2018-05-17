package LocalDateTimeSample;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
	public static void main(String[] args) {
		LocalDateTime myDate = LocalDateTime.now();
		myDate.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(myDate);
		myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		System.out.println(myDate);
	}

}
