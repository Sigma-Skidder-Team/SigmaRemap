package remapped;

public final class class_4844 extends class_3893 {
   private static String[] field_24171;

   public class_4844(class_5476 var1) {
      this.field_24170 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         int var4 = var1.<Integer>method_23261(class_8039.field_41157);
         int var5 = 0;

         for (int var6 = 0; var6 < var4; var6++) {
            String var7 = var1.<String>method_23242(class_8039.field_41171);
            String var8 = var1.<String>method_23242(class_8039.field_41171);
            if (!class_5830.method_26385().contains(var8)) {
               var1.method_23236(class_8039.field_41171, var8);
               var1.method_23236(class_8039.field_41171, var7);
               var0.method_24892(var1, var8);
            } else {
               var5++;
            }
         }

         var1.method_23257(class_8039.field_41157, 0, var4 - var5);
      });
   }
}
