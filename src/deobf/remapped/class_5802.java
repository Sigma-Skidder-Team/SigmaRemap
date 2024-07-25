package remapped;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface class_5802 {
   DecimalFormat field_29297 = class_9665.<DecimalFormat>method_44659(
      new DecimalFormat("########0.00"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   class_5802 field_29298 = NumberFormat.getIntegerInstance(Locale.US)::format;
   class_5802 field_29299 = var0 -> field_29297.format((double)var0 * 0.1);
   class_5802 field_29296 = var0 -> {
      double var3 = (double)var0 / 100.0;
      double var5 = var3 / 1000.0;
      if (!(var5 > 0.5)) {
         return !(var3 > 0.5) ? var0 + " cm" : field_29297.format(var3) + " m";
      } else {
         return field_29297.format(var5) + " km";
      }
   };
   class_5802 field_29300 = var0 -> {
      double var3 = (double)var0 / 20.0;
      double var5 = var3 / 60.0;
      double var7 = var5 / 60.0;
      double var9 = var7 / 24.0;
      double var11 = var9 / 365.0;
      if (!(var11 > 0.5)) {
         if (!(var9 > 0.5)) {
            if (!(var7 > 0.5)) {
               return !(var5 > 0.5) ? var3 + " s" : field_29297.format(var5) + " m";
            } else {
               return field_29297.format(var7) + " h";
            }
         } else {
            return field_29297.format(var9) + " d";
         }
      } else {
         return field_29297.format(var11) + " y";
      }
   };

   String method_26292(int var1);
}
