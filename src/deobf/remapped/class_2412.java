package remapped;

public class class_2412 {
   private boolean field_11995;
   private int field_11998;
   private float field_11996;

   public class_2412() {
      this(false, 519, 0.0F);
   }

   public class_2412(boolean var1) {
      this(var1, 519, 0.0F);
   }

   public class_2412(boolean var1, int var2, float var3) {
      this.field_11995 = var1;
      this.field_11998 = var2;
      this.field_11996 = var3;
   }

   public void method_10975(boolean var1, int var2, float var3) {
      this.field_11995 = var1;
      this.field_11998 = var2;
      this.field_11996 = var3;
   }

   public void method_10974(class_2412 var1) {
      this.field_11995 = var1.field_11995;
      this.field_11998 = var1.field_11998;
      this.field_11996 = var1.field_11996;
   }

   public void method_10970(int var1, float var2) {
      this.field_11998 = var1;
      this.field_11996 = var2;
   }

   public void method_10967(boolean var1) {
      this.field_11995 = var1;
   }

   public void method_10966() {
      this.field_11995 = true;
   }

   public void method_10969() {
      this.field_11995 = false;
   }

   public boolean method_10968() {
      return this.field_11995;
   }

   public int method_10973() {
      return this.field_11998;
   }

   public float method_10972() {
      return this.field_11996;
   }

   public void method_10971() {
      if (this.field_11995) {
         GlStateManager.enableAlphaTest();
         GlStateManager.alphaFunc(this.field_11998, this.field_11996);
      } else {
         GlStateManager.method_8801();
      }
   }

   @Override
   public String toString() {
      return "enabled: " + this.field_11995 + ", func: " + this.field_11998 + ", ref: " + this.field_11996;
   }
}
