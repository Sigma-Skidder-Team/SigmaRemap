package remapped;

public class class_1368 {
   private static String[] field_7440;
   private float field_7442;
   private float field_7441;
   private boolean field_7439;

   private class_1368(class_487 var1, float var2, float var3) {
      this.field_7443 = var1;
      this.field_7439 = false;
      this.field_7441 = var2;
      this.field_7442 = var3;
   }

   public float method_6336() {
      return (float)((double)this.field_7441 + Math.random() * (double)(this.field_7442 - this.field_7441));
   }

   public boolean method_6331() {
      return this.field_7439;
   }

   public void method_6334(boolean var1) {
      this.field_7439 = var1;
   }

   public float method_6333() {
      return this.field_7442;
   }

   public void method_6332(float var1) {
      this.field_7442 = var1;
   }

   public float method_6335() {
      return this.field_7441;
   }

   public void method_6338(float var1) {
      this.field_7441 = var1;
   }
}
