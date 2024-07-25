package remapped;

public class class_6889 extends class_3429 {
   private static String[] field_35445;

   public class_6889(EntityType<? extends class_6889> var1, World var2) {
      super(var1, var2);
   }

   public class_6889(World var1, class_5834 var2) {
      super(EntityType.field_34247, var2, var1);
   }

   public class_6889(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34247, var2, var4, var6, var1);
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24601;
   }

   private class_5079 method_31573() {
      ItemStack var3 = this.method_15853();
      return (class_5079)(!var3.method_28022() ? new class_8661(class_3090.field_15351, var3) : class_3090.field_15370);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 == 3) {
         class_5079 var4 = this.method_31573();

         for (int var5 = 0; var5 < 8; var5++) {
            this.world.method_43361(var4, this.getPosX(), this.method_37309(), this.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      Entity var4 = var1.method_25524();
      int var5 = !(var4 instanceof class_2806) ? 0 : 3;
      var4.attackEntityFrom(DamageSource.method_28355(this, this.method_26166()), (float)var5);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         this.world.method_29587(this, (byte)3);
         this.method_37204();
      }
   }
}
