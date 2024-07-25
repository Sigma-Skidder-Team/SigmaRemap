package remapped;

public class class_1890 extends class_3429 {
   private static String[] field_9559;

   public class_1890(EntityType<? extends class_1890> var1, World var2) {
      super(var1, var2);
   }

   public class_1890(World var1, class_5834 var2) {
      super(EntityType.field_34274, var2, var1);
   }

   public class_1890(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34274, var2, var4, var6, var1);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 == 3) {
         double var4 = 0.08;

         for (int var6 = 0; var6 < 8; var6++) {
            this.world
               .method_43361(
                  new class_8661(class_3090.field_15351, this.method_17246()),
                  this.getPosX(),
                  this.method_37309(),
                  this.getPosZ(),
                  ((double)this.field_41717.nextFloat() - 0.5) * 0.08,
                  ((double)this.field_41717.nextFloat() - 0.5) * 0.08,
                  ((double)this.field_41717.nextFloat() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   public void method_26163(class_5631 var1) {
      super.method_26163(var1);
      var1.method_25524().attackEntityFrom(DamageSource.method_28355(this, this.method_26166()), 0.0F);
   }

   @Override
   public void method_26160(class_7474 var1) {
      super.method_26160(var1);
      if (!this.world.field_33055) {
         if (this.field_41717.nextInt(8) == 0) {
            byte var4 = 1;
            if (this.field_41717.nextInt(32) == 0) {
               var4 = 4;
            }

            for (int var5 = 0; var5 < var4; var5++) {
               class_3024 var6 = EntityType.field_34263.method_30484(this.world);
               var6.method_8635(-24000);
               var6.method_37144(this.getPosX(), this.method_37309(), this.getPosZ(), this.rotationYaw, 0.0F);
               this.world.method_7509(var6);
            }
         }

         this.world.method_29587(this, (byte)3);
         this.method_37204();
      }
   }

   @Override
   public class_2451 method_15854() {
      return class_4897.field_24962;
   }
}
