package mapped;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public interface Class8762 {
   DecimalFormat field39446 = Util.<DecimalFormat>method38508(
      new DecimalFormat("########0.00"), var0 -> var0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT))
   );
   Class8762 field39447 = NumberFormat.getIntegerInstance(Locale.US)::format;
   Class8762 field39448 = var0 -> field39446.format((double)var0 * 0.1);
   Class8762 field39449 = var0 -> {
      double var3 = (double)var0 / 100.0;
      double var5 = var3 / 1000.0;
      if (!(var5 > 0.5)) {
         return !(var3 > 0.5) ? var0 + " cm" : field39446.format(var3) + " m";
      } else {
         return field39446.format(var5) + " km";
      }
   };
   Class8762 field39450 = var0 -> {
      double var3 = (double)var0 / 20.0;
      double var5 = var3 / 60.0;
      double var7 = var5 / 60.0;
      double var9 = var7 / 24.0;
      double var11 = var9 / 365.0;
      if (!(var11 > 0.5)) {
         if (!(var9 > 0.5)) {
            if (!(var7 > 0.5)) {
               return !(var5 > 0.5) ? var3 + " s" : field39446.format(var5) + " m";
            } else {
               return field39446.format(var7) + " h";
            }
         } else {
            return field39446.format(var9) + " d";
         }
      } else {
         return field39446.format(var11) + " y";
      }
   };

   String method31615(int var1);
}
