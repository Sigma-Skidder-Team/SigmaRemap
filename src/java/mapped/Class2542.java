package mapped;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class Class2542 extends ThreadLocal<DateFormat> {
   public DateFormat initialValue() {
      SimpleDateFormat var3 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
      var3.setLenient(false);
      var3.setTimeZone(Class9474.field44029);
      return var3;
   }
}
