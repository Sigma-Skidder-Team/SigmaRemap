package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public final class class_4794 implements class_5289 {
   @Override
   public void method_24131(class_3872 var1, class_4003 var2) {
      if ((var1.field_18858 == 2 || var1.field_18858 == 3) && class_1741.method_7757(var1.field_18855)) {
         var1.field_18858 = var1.field_18858 != 2 ? 6 : 5;
      }

      if (class_3983.method_18374().isLoggable(Level.FINE)) {
         class_3983.method_18374().fine(String.format("encoding packet %s", var1));
      }

      if (5 != var1.field_18858 && 6 != var1.field_18858) {
         String var5 = this.method_22103(var1);
         var2.method_18482(new String[]{var5});
      } else {
         this.method_22102(var1, var2);
      }
   }

   private String method_22103(class_3872 var1) {
      StringBuilder var4 = new StringBuilder("" + var1.field_18858);
      if (5 == var1.field_18858 || 6 == var1.field_18858) {
         var4.append(var1.field_18857);
         var4.append("-");
      }

      if (var1.field_18859 != null && var1.field_18859.length() != 0 && !"/".equals(var1.field_18859)) {
         var4.append(var1.field_18859);
         var4.append(",");
      }

      if (var1.field_18861 >= 0) {
         var4.append(var1.field_18861);
      }

      if (var1.field_18855 != null) {
         var4.append(var1.field_18855);
      }

      if (class_3983.method_18374().isLoggable(Level.FINE)) {
         class_3983.method_18374().fine(String.format("encoded %s as %s", var1, var4));
      }

      return var4.toString();
   }

   private void method_22102(class_3872 var1, class_4003 var2) {
      class_2284 var5 = class_3364.method_15411(var1);
      String var6 = this.method_22103(var5.field_11411);
      ArrayList var7 = new ArrayList<byte[]>(Arrays.asList(var5.field_11412));
      var7.add(0, var6);
      var2.method_18482(var7.toArray());
   }
}
