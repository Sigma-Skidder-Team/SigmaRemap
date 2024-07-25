package remapped;

public final class class_8902 extends class_3893 {
   private static String[] field_45646;

   public class_8902(class_4106 var1) {
      this.field_45645 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         class_6545 var4 = var1.<class_6545>method_23242(new class_8484());
         var1.method_23236(new class_8628(), var4);

         for (int var5 = 0; var5 < 16; var5++) {
            class_3929 var6 = var4.method_29869()[var5];
            if (var6 != null) {
               for (int var7 = 0; var7 < var6.method_18193(); var7++) {
                  int var8 = var6.method_18168(var7);
                  var6.method_18167(var7, var0.method_19008().method_28217(var8));
               }
            }
         }
      });
   }
}
