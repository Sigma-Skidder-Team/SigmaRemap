package remapped;

public class class_4730 extends class_305 {
   private static String[] field_22925;
   private final class_2522 field_22924;

   public class_4730(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_22924 = var1.method_29260();
   }

   @Override
   public void method_1360(World var1, class_1331 var2, class_2522 var3, class_2522 var4, class_1453 var5) {
      if (method_21848(var1, var2, var4)) {
         var1.method_7513(var2, this.field_22924, 3);
      }
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      World var4 = var1.method_21862();
      class_1331 var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      return !method_21848(var4, var5, var6) ? super.method_29302(var1) : this.field_22924;
   }

   private static boolean method_21848(class_6163 var0, class_1331 var1, class_2522 var2) {
      return method_21849(var2) || method_21850(var0, var1);
   }

   private static boolean method_21850(class_6163 var0, class_1331 var1) {
      boolean var4 = false;
      class_2921 var5 = var1.method_6089();

      for (Direction var9 : Direction.values()) {
         class_2522 var10 = var0.method_28262(var5);
         if (var9 != Direction.field_802 || method_21849(var10)) {
            var5.method_13371(var1, var9);
            var10 = var0.method_28262(var5);
            if (method_21849(var10) && !var10.method_8308(var0, var1, var9.method_1046())) {
               var4 = true;
               break;
            }
         }
      }

      return var4;
   }

   private static boolean method_21849(class_2522 var0) {
      return var0.method_8364().method_22007(class_6503.field_33094);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return !method_21850(var4, var5) ? super.method_10763(var1, var2, var3, var4, var5, var6) : this.field_22924;
   }

   @Override
   public int method_1358(class_2522 var1, class_6163 var2, class_1331 var3) {
      return var1.method_8323(var2, var3).field_8060;
   }
}
