package remapped;

public class class_9725 implements class_857 {
   private static String[] field_49436;

   public class_9725(class_9194 var1) {
      this.field_49437 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41179, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41179, 1);
      if (var4 != 1010) {
         if (var4 == 2001) {
            int var6 = var5 & 4095;
            int var7 = var5 >> 12;
            var1.method_23257(class_8039.field_41179, 1, class_2750.method_12391(var6 << 4 | var7));
         }
      } else {
         var1.method_23257(class_8039.field_41179, 1, this.field_49437.field_47037.method_39635().method_28215().get(var5 << 4));
      }
   }
}
