package remapped;

public class class_6907 extends class_2654 {
   private static String[] field_35505;
   private class_6215 field_35508;
   private boolean field_35507;
   private boolean field_35506;

   public class_6907(class_6486 var1, class_2034 var2, class_546 var3) {
      super(var1, var2, var3);
   }

   public class_6215 method_31647() {
      return this.field_35508;
   }

   public void method_31650(class_6215 var1) {
      this.field_35508 = var1;
   }

   public static class_6215 method_31649(class_2654 var0) {
      class_6274[] var3 = null;
      class_1315 var4 = var0.method_27338();
      if (var4 != null) {
         int var5 = (var4.method_5997() >> 4) + 1;
         var3 = new class_6274[var5];
         class_1315[] var6 = var0.method_27349();

         for (int var7 = 0; var7 < var5; var7++) {
            class_1315 var8 = var6[var7];
            if (var8 != null) {
               short var9 = var8.method_5991();
               short var10 = var8.method_5996();
               short var11 = var8.method_5990();
               var3[var7] = new class_6274(var9, var10, var11);
            }
         }
      }

      return new class_6215(var3);
   }

   @Override
   public void method_27342(class_8145 var1) {
      this.field_35507 = true;
      super.method_27342(var1);
   }

   @Override
   public void method_11996(boolean var1) {
      this.field_35507 = var1;
      super.method_11996(var1);
   }

   public boolean method_31648() {
      return this.field_35507;
   }

   @Override
   public void method_11981(boolean var1) {
      this.field_35506 = var1;
      super.method_11981(var1);
   }

   public boolean method_31651() {
      return this.field_35506;
   }
}
