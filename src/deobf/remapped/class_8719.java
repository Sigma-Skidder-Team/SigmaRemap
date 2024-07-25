package remapped;

public class class_8719 extends class_1837 {
   private static String[] field_44703;
   private final class_4359 field_44702;

   public class_8719(class_2354 var1, double var2, int var4, float var5) {
      super(var1, var2, var4, var5);
      this.field_44702 = (class_4359)var1;
   }

   @Override
   public boolean method_16795() {
      return super.method_16795() && this.field_44702.method_26446().method_27960() == class_4897.field_25086;
   }

   @Override
   public void method_16796() {
      super.method_16796();
      this.field_44702.method_26891(true);
      this.field_44702.method_26462(Hand.MAIN_HAND);
   }

   @Override
   public void method_16793() {
      super.method_16793();
      this.field_44702.method_26529();
      this.field_44702.method_26891(false);
   }
}
