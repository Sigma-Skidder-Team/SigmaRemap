package remapped;

import java.io.UnsupportedEncodingException;

public class class_2122 implements class_4650 {
   public class_2122(class_8200 var1) {
      this.field_10635 = var1;
   }

   @Override
   public class_1621 method_21502(Object var1) {
      class_9592 var4 = class_9592.field_48876;
      class_7587 var5 = null;
      String var6 = var1.toString();
      if (!class_8907.method_40979(var6)) {
         var4 = class_9592.field_48884;

         char[] var9;
         try {
            byte[] var7 = var6.getBytes("UTF-8");
            String var8 = new String(var7, "UTF-8");
            if (!var8.equals(var6)) {
               throw new class_5251("invalid string value has occurred");
            }

            var9 = class_5055.method_23302(var7);
         } catch (UnsupportedEncodingException var10) {
            throw new class_5251(var10);
         }

         var6 = String.valueOf(var9);
         var5 = class_7587.field_38644;
      }

      if (this.field_10635.field_443 == class_7587.field_38646 && class_8200.field_41963.matcher(var6).find()) {
         var5 = class_7587.field_38644;
      }

      return this.field_10635.method_590(var4, var6, var5);
   }
}
