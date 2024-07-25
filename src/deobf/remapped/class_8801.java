package remapped;

public class class_8801 extends class_3558 {
   private static String[] field_45022;
   private final class_4931 field_45023;

   private class_8801(class_1799 var1) {
      super(var1);
      this.field_45024 = var1;
      this.field_45023 = new class_4931().method_22607(16.0).method_22602().method_22608().method_22603().method_22601();
   }

   @Override
   public boolean method_16795() {
      if (super.method_16795()) {
         int var3 = this.field_45024
            .field_41768
            .<class_2519>method_25863(class_2519.class, this.field_45023, this.field_45024, this.field_45024.method_37241().method_18898(16.0))
            .size();
         return class_1799.method_8002(this.field_45024).nextInt(8) + 1 > var3;
      } else {
         return false;
      }
   }

   @Override
   public int method_16545() {
      return 100;
   }

   @Override
   public int method_16541() {
      return 340;
   }

   @Override
   public void method_16543() {
      class_6331 var3 = (class_6331)this.field_45024.field_41768;

      for (int var4 = 0; var4 < 3; var4++) {
         class_1331 var5 = this.field_45024
            .method_37075()
            .method_6104(-2 + class_1799.method_8005(this.field_45024).nextInt(5), 1, -2 + class_1799.method_8003(this.field_45024).nextInt(5));
         class_2519 var6 = class_6629.field_34277.method_30484(this.field_45024.field_41768);
         var6.method_37253(var5, 0.0F, 0.0F);
         var6.method_26864(var3, this.field_45024.field_41768.method_43368(var5), class_2417.field_12027, (class_8733)null, (class_5734)null);
         var6.method_11469(this.field_45024);
         var6.method_11470(var5);
         var6.method_11467(20 * (30 + class_1799.method_7998(this.field_45024).nextInt(90)));
         var3.method_7065(var6);
      }
   }

   @Override
   public class_8461 method_16540() {
      return class_463.field_2120;
   }

   @Override
   public class_248 method_16544() {
      return class_248.field_873;
   }
}
