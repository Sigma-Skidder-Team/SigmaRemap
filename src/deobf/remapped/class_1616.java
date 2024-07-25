package remapped;

public class class_1616 implements class_4617 {
   private static String[] field_8391;
   public int field_8390;

   public class_1616(int var1) {
      this.field_8390 = var1;
   }

   @Override
   public void method_21389(class_7038 var1) {
      if (var1.method_32134().size() > 0) {
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;

         for (int var7 = 0; var7 < var1.method_32134().size(); var7++) {
            class_7038 var8 = var1.method_32134().get(var7);
            if (var4 + var8.method_32109() + this.field_8390 > var1.method_32109()) {
               var4 = 0;
               var5 += var6;
            }

            var8.method_32117(var5);
            var8.method_32175(var4);
            var4 += var8.method_32109() + this.field_8390;
            var6 = Math.max(var8.method_32137(), var6);
         }
      }
   }
}
