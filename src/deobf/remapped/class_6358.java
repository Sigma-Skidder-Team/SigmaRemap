package remapped;

public final class class_6358 extends class_3893 {
   private static String[] field_32518;

   public class_6358(class_757 var1) {
      this.field_32519 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(var1 -> {
         class_6545 var4 = var1.<class_6545>method_23242(new class_9424());
         var1.method_23236(new class_8484(), var4);
         var4.method_29856(var4.method_29863());

         for (int var5 = 0; var5 < 16; var5++) {
            class_3929 var6 = var4.method_29869()[var5];
            if (var6 != null) {
               for (int var7 = 0; var7 < var6.method_18193(); var7++) {
                  int var8 = var6.method_18168(var7);
                  var6.method_18167(var7, var0.method_3424().method_28217(var8));
               }
            }
         }

         for (class_5287 var13 : var4.method_29864()) {
            class_6674 var15 = (class_6674)var13;
            int[] var9 = new int[256];
            class_4847.method_22288(9, var9.length, var15.method_30625(), (var1x, var2) -> var9[var1x] = var2);
            var15.method_30623(class_4847.method_22286(9, var9.length, var1x -> (long)var9[var1x]));
         }

         if (var4.method_29862() != null) {
            for (class_5531 var14 : var4.method_29862()) {
               class_7610.method_34523(var14);
            }
         }
      });
   }
}
