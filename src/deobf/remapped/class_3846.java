package remapped;

public class class_3846 extends class_4106<class_5736, class_2786, class_3970, class_3970> {
   public static final class_3750 field_18773 = new class_3750();
   private class_1421 field_18775;

   public class_3846() {
      super(class_5736.class, class_2786.class, class_3970.class, class_3970.class);
   }

   @Override
   public void method_18998() {
      class_1960 var3 = new class_1960(this);
      class_5560.method_25258(this);
      class_537.method_2626(this);
      class_3271.method_14932(this);
      class_5619.method_25488(this);
      class_267 var4 = new class_267(this);
      var4.method_1194(class_5736.field_29003);
      var4.method_1194(class_5736.field_28995);
      new class_1739(this, var3::method_33115).method_7755(class_5736.field_28996);
      this.method_18992(class_3970.field_19215, new class_1558(this));
      this.field_18775 = new class_1421(this, class_5560::method_25260);
      this.field_18775.method_6520(class_5736.field_29064);
   }

   @Override
   public void method_19022() {
      int[] var3 = new int[17];
      short var4 = 501;

      for (int var5 = 0; var5 < 17; var5++) {
         var3[var5] = var4 + var5;
      }

      this.field_18775.method_6515(class_1121.field_6407, "minecraft:shulker_boxes", var3);
   }

   @Override
   public void method_19025(class_1455 var1) {
      var1.method_6737(new class_7556(var1));
   }

   public class_3750 method_17872() {
      return field_18773;
   }
}
