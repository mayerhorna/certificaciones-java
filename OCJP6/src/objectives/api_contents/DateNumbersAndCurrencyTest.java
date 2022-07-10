package objectives.api_contents;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateNumbersAndCurrencyTest {
	public static void main(String[] args) throws ParseException {
		Date fecha = new Date();
		long milisManiana =  fecha.getTime() + 1*24*60*60*1000;
		System.out.println(fecha);
		Date fechaManiana = new Date(milisManiana);
		System.out.println(fechaManiana);
		Calendar calendar = new GregorianCalendar();//Calendar.getInstance();
		calendar.add(Calendar.WEEK_OF_YEAR, 2);
		System.out.println(calendar.getTime());
		String[] timezonesIds = TimeZone.getAvailableIDs();
		for (String string : timezonesIds) {
			System.out.println(string);
		}
		
		Calendar calendarioEspaniol 
			= Calendar.getInstance(TimeZone.getTimeZone("Europe/Madrid"));
		System.out.println("Hora: " + calendarioEspaniol.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto: " + calendarioEspaniol.get(Calendar.MINUTE));
		
		System.out.println("DateFormat:");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String fechaConFormato = df.format(new Date());
		Date fechaComoObjeto = df.parse(fechaConFormato);
		System.out.println(fechaConFormato);
		
		System.out.println("SimpleDateFormat:");
		DateFormat df2 = new  SimpleDateFormat("yyyy-dd-MM");
		String fechaConFormato2 = df2.format(new Date());
		Date fechaSimple = df2.parse("10-01-2011");
		System.out.println(fechaConFormato2);
		System.out.println(fechaSimple); // 01/2012/12
		//Date fechaSimple = df2.parse("10-01-2011");
		
		System.out.println("NumberFormat: ");
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(5);
		String numeroConFormato = nf.format(8324.653924);
		System.out.println(numeroConFormato);
		
		
		Locale[] localidades = Locale.getAvailableLocales();
		for (Locale locale : localidades) {
			System.out.println(locale + "; " + locale.getDisplayCountry());
		}
		
		System.out.println("DateFormat with Locale");
		DateFormat dfL = DateFormat.getDateInstance(DateFormat.FULL, new Locale("it", "IT"));
		System.out.println(dfL.format(new Date()));
		
		System.out.println( "Locale: ");
		System.out.println(Locale.getDefault());
		System.out.println("NumberFormat with Locale");
		//Locale.setDefault(Locale.US);
		NumberFormat nfL = NumberFormat.getInstance(Locale.US);
		String nrConFormatoPeru = nfL.format(324324.32);
		System.out.println(nrConFormatoPeru);
		
		System.out.println("NumberFormat para monedas: ");
		NumberFormat nfMoneda = NumberFormat.getCurrencyInstance(Locale.US);
		String numeroConFormatoMoneda = nfMoneda.format(8324.65);
		Number numero = nfMoneda.parse("$1,324.65");
		System.out.println(numeroConFormatoMoneda);
		System.out.println(numero.doubleValue());
		//;new Locale().getVariant()
		
		Calendar calendarRoll = new GregorianCalendar();//Calendar.getInstance();
		calendarRoll.roll(Calendar.MONTH, 11);
		System.out.println(calendarRoll.getTime());
	}
}
