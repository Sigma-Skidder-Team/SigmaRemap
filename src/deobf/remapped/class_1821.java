package remapped;

public class class_1821 implements class_8733 {
   private static String[] field_9246;
   private int field_9244;
   private final boolean field_9245;
   private final float field_9243;

   private class_1821(boolean var1, float var2) {
      this.field_9245 = var1;
      this.field_9243 = var2;
   }

   public class_1821(boolean var1) {
      this(var1, 0.05F);
   }

   public class_1821(float var1) {
      this(true, var1);
   }

   public int method_8062() {
      return this.field_9244;
   }

   public void method_8063() {
      this.field_9244++;
   }

   public boolean method_8060() {
      return this.field_9245;
   }

   public float method_8061() {
      return this.field_9243;
   }
}
