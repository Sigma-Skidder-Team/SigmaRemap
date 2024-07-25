package remapped;

public class class_2331 extends class_3599 {
   private static String[] field_11639;
   private final class_7819 field_11641;
   private class_9359 field_11640;
   private boolean field_11642;

   public class_2331(class_7819 var1) {
      this.field_11641 = var1;
   }

   @Override
   public boolean method_16795() {
      class_9359 var3 = (class_9359)this.field_11641.method_41207();
      boolean var4 = var3 != null && !var3.method_37221() && !var3.field_3876.isFlying && !var3.method_37285();
      return !this.field_11641.method_41216() && var4 && this.field_11641.method_35417();
   }

   @Override
   public boolean method_16801() {
      return !this.field_11642;
   }

   @Override
   public void method_16796() {
      this.field_11640 = (class_9359)this.field_11641.method_41207();
      this.field_11642 = false;
   }

   @Override
   public void method_16794() {
      if (!this.field_11642
         && !this.field_11641.method_41209()
         && !this.field_11641.method_26920()
         && this.field_11641.method_37241().method_18909(this.field_11640.method_37241())) {
         this.field_11642 = this.field_11641.method_35416(this.field_11640);
      }
   }
}
