package remapped;

public class class_5567 extends class_4785<class_5567> {
   private static String[] field_28292;

   public class_5567(class_7367 var1) {
      this.field_28293 = var1;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      class_382 var13 = (class_382)class_6107.method_28065().get(var2);
      this.method_25281(var1, var4, var3, var13.field_1555);
      this.field_28293.field_37637.field_948.method_45378(var1, var13.field_1553, (float)(var4 + 18 + 5), (float)(var3 + 6), 16777215);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.method_25280();
      }

      return false;
   }

   private void method_25280() {
      this.field_28293.method_33543(this);
      class_382 var3 = (class_382)class_6107.method_28065().get(this.field_28293.method_41183().indexOf(this));
      class_6433 var4 = class_6107.method_28058(this.field_28293.field_37637)
         .field_49281
         .field_33523
         .method_3062()
         .<class_6325>method_28813(class_8669.field_44359);
      class_6107.method_28056(this.field_28293.field_37637, var3.field_1552.apply(var4));
      class_6107.method_28059(this.field_28293.field_37637).method_8281(class_6107.method_28060(var4, class_6107.method_28064(this.field_28293.field_37637)));
      class_6107.method_28059(this.field_28293.field_37637).method_8253();
   }

   private void method_25281(class_7966 var1, int var2, int var3, class_2451 var4) {
      this.method_25279(var1, var2 + 1, var3 + 1);
      class_3542.method_16381();
      this.field_28293.field_37637.field_945.method_40264(new class_6098(var4), var2 + 2, var3 + 2);
      class_3542.method_16443();
   }

   private void method_25279(class_7966 var1, int var2, int var3) {
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_7367.method_33544(this.field_28293).method_8577().method_35674(class_2089.field_10506);
      class_2089.method_9779(var1, var2, var3, this.field_28293.field_37637.method_9777(), 0.0F, 0.0F, 18, 18, 128, 128);
   }
}
