package remapped;

public class class_2065 extends class_3599 {
   private final class_5948 field_10424;

   public class_2065(class_5948 var1) {
      this.field_10424 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_10424.world.method_25866(this.field_10424.getPosX(), this.field_10424.method_37309(), this.field_10424.getPosZ(), 10.0);
   }

   @Override
   public void method_16794() {
      class_6331 var3 = (class_6331)this.field_10424.world;
      class_9589 var4 = var3.method_43368(this.field_10424.method_37075());
      this.field_10424.method_27190(false);
      this.field_10424.method_19041(true);
      this.field_10424.method_8635(0);
      class_900 var5 = class_6629.field_34224.method_30484(var3);
      var5.method_37195(this.field_10424.getPosX(), this.field_10424.method_37309(), this.field_10424.getPosZ());
      var5.method_3858(true);
      var3.method_7509(var5);
      class_6778 var6 = this.method_9646(var4, this.field_10424);
      var6.method_37353(this.field_10424);
      var3.method_7065(var6);

      for (int var7 = 0; var7 < 3; var7++) {
         class_4109 var8 = this.method_9647(var4);
         class_6778 var9 = this.method_9646(var4, var8);
         var9.method_37353(var8);
         var8.method_37186(this.field_10424.method_26594().nextGaussian() * 0.5, 0.0, this.field_10424.method_26594().nextGaussian() * 0.5);
         var3.method_7065(var8);
      }
   }

   private class_4109 method_9647(class_9589 var1) {
      class_5948 var4 = class_6629.field_34261.method_30484(this.field_10424.world);
      var4.method_26864((class_6331)this.field_10424.world, var1, class_2417.field_12032, (class_8733)null, (CompoundNBT)null);
      var4.method_37256(this.field_10424.getPosX(), this.field_10424.method_37309(), this.field_10424.getPosZ());
      var4.field_41749 = 60;
      var4.method_26883();
      var4.method_19041(true);
      var4.method_8635(0);
      return var4;
   }

   private class_6778 method_9646(class_9589 var1, class_4109 var2) {
      class_6778 var5 = class_6629.field_34241.method_30484(var2.world);
      var5.method_26864((class_6331)var2.world, var1, class_2417.field_12032, (class_8733)null, (CompoundNBT)null);
      var5.method_37256(var2.getPosX(), var2.method_37309(), var2.getPosZ());
      var5.field_41749 = 60;
      var5.method_26883();
      if (var5.method_26520(class_6943.field_35704).method_28022()) {
         var5.method_37349(class_6943.field_35704, new ItemStack(class_4897.field_24701));
      }

      var5.method_37349(
         class_6943.field_35707,
         class_2931.method_13426(
            var5.method_26594(), this.method_9648(var5.method_26446()), (int)(5.0F + var1.method_44284() * (float)var5.method_26594().nextInt(18)), false
         )
      );
      var5.method_37349(
         class_6943.field_35704,
         class_2931.method_13426(
            var5.method_26594(),
            this.method_9648(var5.method_26520(class_6943.field_35704)),
            (int)(5.0F + var1.method_44284() * (float)var5.method_26594().nextInt(18)),
            false
         )
      );
      return var5;
   }

   private ItemStack method_9648(ItemStack var1) {
      var1.method_27976("Enchantments");
      return var1;
   }
}
