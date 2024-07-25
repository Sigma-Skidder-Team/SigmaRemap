package remapped;

public class class_8187 extends class_2451 {
   private static String[] field_41897;

   public class_8187(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_6414 var6 = var4.method_28262(var5).method_8360();
      if (!var6.method_29299(class_2351.field_11728)) {
         return class_6910.field_35521;
      } else {
         class_704 var7 = var1.method_21868();
         if (!var4.field_33055 && var7 != null) {
            method_37511(var7, var4, var5);
         }

         return class_6910.method_31659(var4.field_33055);
      }
   }

   public static class_6910 method_37511(class_704 var0, World var1, BlockPos var2) {
      class_8008 var5 = null;
      boolean var6 = false;
      double var7 = 7.0;
      int var9 = var2.method_12173();
      int var10 = var2.method_12165();
      int var11 = var2.method_12185();

      for (class_5886 var13 : var1.<class_5886>method_25868(
         class_5886.class,
         new class_4092((double)var9 - 7.0, (double)var10 - 7.0, (double)var11 - 7.0, (double)var9 + 7.0, (double)var10 + 7.0, (double)var11 + 7.0)
      )) {
         if (var13.method_26922() == var0) {
            if (var5 == null) {
               var5 = class_8008.method_36331(var1, var2);
            }

            var13.method_26901(var5, true);
            var6 = true;
         }
      }

      return !var6 ? class_6910.field_35521 : class_6910.field_35520;
   }
}
