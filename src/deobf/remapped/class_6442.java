package remapped;

public class class_6442 extends class_2932 {
   private static String[] field_32881;
   public final class_7047 field_32882;
   public final boolean field_32880;

   public class_6442(class_7047 var1, boolean var2) {
      this.field_32882 = var1;
      this.field_32880 = var2;
   }

   @Override
   public boolean method_13435(class_7047 var1) {
      return !this.field_32880 ? var1.method_32379(this.field_32882) == 0.0 : var1.method_32379(this.field_32882) == 1.0;
   }

   @Override
   public double method_13436(class_7047 var1) {
      return this.field_32882.method_32376(var1);
   }
}
