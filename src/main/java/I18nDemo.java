import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class I18nDemo {
    public static void main(String[] args) {
        Locale viVN = new Locale("vi","VN");
        Locale jaJB = new Locale("ja","JB");
        double currency = 123456.789;

        String s1 = formatCurrencyByLocale(currency, viVN);
        System.out.println("s1 = " + s1);
        String s2 = formatCurrencyByLocale(currency, jaJB);
        System.out.println("s2 = " + s2);
    }



    public static String formatCurrencyByLocale(
            double currency, Locale locale
    ){
        NumberFormat formatter = NumberFormat.getInstance(locale);
        return formatter.format(currency);
    }

}
