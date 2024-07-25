package remapped;

public class class_6647 implements Comparable {
   private int field_34394;
   private int field_34392;
   private float field_34398;
   private class_6647 field_34390;
   private float field_34397;
   private int field_34393;
   private boolean field_34399;
   private boolean field_34395;

   public class_6647(class_4509 var1, int var2, int var3) {
      this.field_34396 = var1;
      this.field_34394 = var2;
      this.field_34392 = var3;
   }

   public int method_30541(class_6647 var1) {
      this.field_34393 = var1.field_34393 + 1;
      this.field_34390 = var1;
      return this.field_34393;
   }

   @Override
   public int compareTo(Object var1) {
      class_6647 var4 = (class_6647)var1;
      float var5 = this.field_34397 + this.field_34398;
      float var6 = var4.field_34397 + var4.field_34398;
      if (!(var5 < var6)) {
         return !(var5 > var6) ? 0 : 1;
      } else {
         return -1;
      }
   }

   public void method_30531(boolean var1) {
      this.field_34399 = var1;
   }

   public boolean method_30535() {
      return this.field_34399;
   }

   public void method_30538(boolean var1) {
      this.field_34395 = var1;
   }

   public boolean method_30537() {
      return this.field_34395;
   }

   public void method_30542() {
      this.field_34395 = false;
      this.field_34399 = false;
      this.field_34398 = 0.0F;
      this.field_34393 = 0;
   }

   @Override
   public String toString() {
      return "[Node " + this.field_34394 + "," + this.field_34392 + "]";
   }
}
