package remapped;

public class class_3540 extends class_8059 {
   private static String[] field_17310;
   private boolean field_17311;
   private boolean field_17312;

   public class_3540(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false, new class_1742(class_3054.field_15007, 20, 40, 18, class_798.field_4282, 200, 1));
      this.method_16325();
   }

   private void method_16325() {
      this.method_36563().method_7776(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_29506(int var1, int var2, int var3) {
      this.method_36563().method_7774();
      this.method_16323(this.method_36563().method_7777());
   }

   public boolean method_16326() {
      return this.field_17311;
   }

   public void method_16327(boolean var1) {
      this.field_17311 = var1;
   }

   public boolean method_16328() {
      return this.field_17312;
   }

   public void method_16323(boolean var1) {
      this.method_16324(var1, true);
   }

   public void method_16324(boolean var1, boolean var2) {
      if (var1 != this.method_16328()) {
         if (var1 && !this.method_36563().method_7777() || !var1 && this.method_36563().method_7777()) {
            this.method_36563().method_7774();
         }

         this.field_17312 = var1;
         if (var2) {
            this.method_8235();
         }
      }
   }
}
