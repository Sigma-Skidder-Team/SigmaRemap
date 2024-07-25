package remapped;

public class class_2186 extends class_3622 {
   private static String[] field_10880;
   private final String field_10878;
   private final int field_10879;

   public class_2186(String var1, int var2) {
      super(var2);
      this.field_10878 = var1;
      this.field_10879 = this.field_17671.method_18547(var1);
   }

   @Override
   public void method_16870(float var1) {
   }

   @Override
   public int method_16874() {
      short var3 = 200;
      return Math.max(super.method_16874(), this.field_10879 + 14);
   }
}
