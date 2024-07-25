package remapped;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class class_2916 extends ThreadLocal<DateFormat> {
   public DateFormat initialValue() {
      SimpleDateFormat var3 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
      var3.setLenient(false);
      var3.setTimeZone(class_8515.field_43584);
      return var3;
   }
}
