package remapped;

public class class_1010 implements class_8743 {
   private static String[] field_5184;
   private final class_6331 field_5186;
   private final class_1331 field_5185;

   public class_1010(class_6331 var1, class_1331 var2) {
      this.field_5186 = var1;
      this.field_5185 = var2;
   }

   @Override
   public class_6331 method_40140() {
      return this.field_5186;
   }

   @Override
   public double method_61() {
      return (double)this.field_5185.method_12173() + 0.5;
   }

   @Override
   public double method_60() {
      return (double)this.field_5185.method_12165() + 0.5;
   }

   @Override
   public double method_62() {
      return (double)this.field_5185.method_12185() + 0.5;
   }

   @Override
   public class_1331 method_40142() {
      return this.field_5185;
   }

   @Override
   public class_2522 method_40141() {
      return this.field_5186.method_28262(this.field_5185);
   }

   @Override
   public <T extends class_3757> T method_40143() {
      return (T)this.field_5186.method_28260(this.field_5185);
   }
}
