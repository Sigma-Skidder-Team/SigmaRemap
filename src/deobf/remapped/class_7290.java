package remapped;

import java.util.List;

public class class_7290 implements class_857 {
   private static String[] field_37291;

   public class_7290(class_6559 var1) {
      this.field_37290 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41179, 0);
      byte var5 = 0;
      if (var4 == 37 || var4 == 38 || var4 == 46) {
         var5 = 1;
      } else if (var4 == 36) {
         var5 = 2;
      }

      Integer[] var6 = new Integer[var5];

      for (int var7 = 0; var7 < var6.length; var7++) {
         var6[var7] = var1.<Integer>method_23242(class_8039.field_41157);
      }

      class_5167 var13 = class_1176.method_5214(var4, var6);
      if (var13 != null && var13.method_23691() != -1) {
         if (var13.method_23691() == 11) {
            int var8 = var1.<Integer>method_23248(class_8039.field_41179, 1);
            float var9 = var1.<Float>method_23248(class_8039.field_41146, 6);
            if (var8 == 0) {
               var1.method_23257(class_8039.field_41179, 1, 1);
               var1.method_23257(class_8039.field_41146, 6, 0.0F);
               List var10 = var13.method_23687();

               for (int var11 = 0; var11 < 3; var11++) {
                  float var12 = var1.<Float>method_23248(class_8039.field_41146, var11 + 3) * var9;
                  if (var12 == 0.0F && var11 == 0) {
                     var12 = 1.0F;
                  }

                  ((class_7579)var10.get(var11)).method_34441(var12);
                  var1.method_23257(class_8039.field_41146, var11 + 3, 0.0F);
               }
            }
         }

         var1.method_23257(class_8039.field_41179, 0, var13.method_23691());

         for (class_7579 var15 : var13.method_23687()) {
            var1.method_23236(var15.method_34443(), var15.method_34439());
         }
      } else {
         var1.method_23245();
      }
   }
}
