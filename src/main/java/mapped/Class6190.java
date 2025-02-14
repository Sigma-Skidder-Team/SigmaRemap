package mapped;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class6190 implements Class6180 {
   public final Class4499 field27634;

   public Class6190(Class4499 var1) {
      this.field27634 = var1;
   }

   @Override
   public Class7255 method19088(Object var1) {
      Calendar var4;
      if (!(var1 instanceof Calendar)) {
         var4 = Calendar.getInstance(this.field27634.method14205() != null ? this.field27634.field21721 : TimeZone.getTimeZone("UTC"));
         var4.setTime((Date)var1);
      } else {
         var4 = (Calendar)var1;
      }

      int var5 = var4.get(1);
      int var6 = var4.get(2) + 1;
      int var7 = var4.get(5);
      int var8 = var4.get(11);
      int var9 = var4.get(12);
      int var10 = var4.get(13);
      int var11 = var4.get(14);
      StringBuilder var12 = new StringBuilder(String.valueOf(var5));

      while (var12.length() < 4) {
         var12.insert(0, "0");
      }

      var12.append("-");
      if (var6 < 10) {
         var12.append("0");
      }

      var12.append(String.valueOf(var6));
      var12.append("-");
      if (var7 < 10) {
         var12.append("0");
      }

      var12.append(String.valueOf(var7));
      var12.append("T");
      if (var8 < 10) {
         var12.append("0");
      }

      var12.append(String.valueOf(var8));
      var12.append(":");
      if (var9 < 10) {
         var12.append("0");
      }

      var12.append(String.valueOf(var9));
      var12.append(":");
      if (var10 < 10) {
         var12.append("0");
      }

      var12.append(String.valueOf(var10));
      if (var11 > 0) {
         if (var11 >= 10) {
            if (var11 >= 100) {
               var12.append(".");
            } else {
               var12.append(".0");
            }
         } else {
            var12.append(".00");
         }

         var12.append(String.valueOf(var11));
      }

      int var13 = var4.getTimeZone().getOffset(var4.get(0), var4.get(1), var4.get(2), var4.get(5), var4.get(7), var4.get(14));
      if (var13 != 0) {
         if (var13 >= 0) {
            var12.append('+');
         } else {
            var12.append('-');
            var13 *= -1;
         }

         int var14 = var13 / 60000;
         int var15 = var14 / 60;
         int var16 = var14 % 60;
         if (var15 < 10) {
            var12.append('0');
         }

         var12.append(var15);
         var12.append(':');
         if (var16 < 10) {
            var12.append('0');
         }

         var12.append(var16);
      } else {
         var12.append('Z');
      }

      return this.field27634.method14192(this.field27634.method14203(var1.getClass(), Class9757.field45639), var12.toString(), Class1857.field9898);
   }
}
