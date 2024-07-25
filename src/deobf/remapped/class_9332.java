package remapped;

public abstract class class_9332 {
   private int field_47640;

   public static class_9332 method_43083(class_6844 var0, int var1) {
      return new class_247(var0, var1);
   }

   public static class_9332 method_43084(int[] var0, int var1) {
      return new class_417(var0, var1);
   }

   public static class_9332 method_43089() {
      return new class_3508();
   }

   public abstract int method_43085();

   public abstract void method_43087(int var1);

   public boolean method_43088() {
      int var3 = this.method_43085();
      boolean var4 = var3 != this.field_47640;
      this.field_47640 = var3;
      return var4;
   }
}
