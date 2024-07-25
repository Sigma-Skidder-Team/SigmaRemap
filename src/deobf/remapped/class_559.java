package remapped;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;

public class class_559 extends class_4575 {
   private Calendar field_3313;

   public Calendar method_2677() {
      return this.field_3313;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      class_8437 var4 = (class_8437)var1;
      String var5 = var4.method_38816();
      Matcher var6 = class_3229.method_14788().matcher(var5);
      if (!var6.matches()) {
         var6 = class_3229.method_14785().matcher(var5);
         if (var6.matches()) {
            String var23 = var6.group(1);
            String var24 = var6.group(2);
            String var25 = var6.group(3);
            String var10 = var6.group(4);
            String var11 = var6.group(5);
            String var12 = var6.group(6);
            String var13 = var6.group(7);
            if (var13 != null) {
               var12 = var12 + "." + var13;
            }

            double var14 = Double.parseDouble(var12);
            int var16 = (int)Math.round(Math.floor(var14));
            int var17 = (int)Math.round((var14 - (double)var16) * 1000.0);
            String var18 = var6.group(8);
            String var19 = var6.group(9);
            TimeZone var20;
            if (var18 == null) {
               var20 = TimeZone.getTimeZone("UTC");
            } else {
               String var21 = var19 == null ? "00" : ":" + var19;
               var20 = TimeZone.getTimeZone("GMT" + var18 + var21);
            }

            this.field_3313 = Calendar.getInstance(var20);
            this.field_3313.set(1, Integer.parseInt(var23));
            this.field_3313.set(2, Integer.parseInt(var24) - 1);
            this.field_3313.set(5, Integer.parseInt(var25));
            this.field_3313.set(11, Integer.parseInt(var10));
            this.field_3313.set(12, Integer.parseInt(var11));
            this.field_3313.set(13, var16);
            this.field_3313.set(14, var17);
            return this.field_3313.getTime();
         } else {
            throw new class_5251("Unexpected timestamp: " + var5);
         }
      } else {
         String var7 = var6.group(1);
         String var8 = var6.group(2);
         String var9 = var6.group(3);
         this.field_3313 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
         this.field_3313.clear();
         this.field_3313.set(1, Integer.parseInt(var7));
         this.field_3313.set(2, Integer.parseInt(var8) - 1);
         this.field_3313.set(5, Integer.parseInt(var9));
         return this.field_3313.getTime();
      }
   }
}
