package remapped;

import java.util.List;

public class class_8008 extends class_4641 {
   private static String[] field_41028;

   public class_8008(EntityType<? extends class_8008> var1, World var2) {
      super(var1, var2);
   }

   public class_8008(World var1, BlockPos var2) {
      super(EntityType.field_34275, var1, var2);
      this.method_37256((double)var2.getX() + 0.5, (double)var2.method_12165() + 0.5, (double)var2.method_12185() + 0.5);
      float var5 = 0.125F;
      float var6 = 0.1875F;
      float var7 = 0.25F;
      this.method_37094(
         new Box(
            this.getPosX() - 0.1875,
            this.method_37309() - 0.25 + 0.125,
            this.getPosZ() - 0.1875,
            this.getPosX() + 0.1875,
            this.method_37309() + 0.25 + 0.125,
            this.getPosZ() + 0.1875
         )
      );
      this.field_41722 = true;
   }

   @Override
   public void method_37256(double var1, double var3, double var5) {
      super.method_37256((double) MathHelper.floor(var1) + 0.5, (double) MathHelper.floor(var3) + 0.5, (double) MathHelper.floor(var5) + 0.5);
   }

   @Override
   public void method_21474() {
      this.method_37222(
         (double)this.field_22661.getX() + 0.5, (double)this.field_22661.method_12165() + 0.5, (double)this.field_22661.method_12185() + 0.5
      );
   }

   @Override
   public void method_21468(Direction var1) {
   }

   @Override
   public int method_21470() {
      return 9;
   }

   @Override
   public int method_21473() {
      return 9;
   }

   @Override
   public float method_37279(class_7653 var1, class_6097 var2) {
      return -0.0625F;
   }

   @Override
   public boolean method_37176(double var1) {
      return var1 < 1024.0;
   }

   @Override
   public void method_21475(Entity var1) {
      this.method_37155(SoundEvents.field_2211, 1.0F, 1.0F);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
   }

   @Override
   public class_6910 method_37128(PlayerEntity var1, Hand var2) {
      if (this.world.field_33055) {
         return class_6910.field_35520;
      } else {
         boolean var5 = false;
         double var6 = 7.0;
         List var8 = this.world
            .<MobEntity>method_25868(
               MobEntity.class,
               new Box(
                  this.getPosX() - 7.0,
                  this.method_37309() - 7.0,
                  this.getPosZ() - 7.0,
                  this.getPosX() + 7.0,
                  this.method_37309() + 7.0,
                  this.getPosZ() + 7.0
               )
            );

         for (MobEntity var10 : var8) {
            if (var10.method_26922() == var1) {
               var10.method_26901(this, true);
               var5 = true;
            }
         }

         if (!var5) {
            this.method_37204();
            if (var1.playerAbilities.isCreativeMode) {
               for (MobEntity var12 : var8) {
                  if (var12.method_26920() && var12.method_26922() == this) {
                     var12.method_26916(true, false);
                  }
               }
            }
         }

         return class_6910.field_35518;
      }
   }

   @Override
   public boolean method_21472() {
      return this.world.method_28262(this.field_22661).method_8360().method_29299(class_2351.field_11728);
   }

   public static class_8008 method_36331(World var0, BlockPos var1) {
      int var4 = var1.getX();
      int var5 = var1.method_12165();
      int var6 = var1.method_12185();

      for (class_8008 var8 : var0.<class_8008>method_25868(
         class_8008.class,
         new Box((double)var4 - 1.0, (double)var5 - 1.0, (double)var6 - 1.0, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)
      )) {
         if (var8.method_21469().equals(var1)) {
            return var8;
         }
      }

      class_8008 var9 = new class_8008(var0, var1);
      var0.method_7509(var9);
      var9.method_21471();
      return var9;
   }

   @Override
   public void method_21471() {
      this.method_37155(SoundEvents.field_2543, 1.0F, 1.0F);
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this, this.getType(), 0, this.method_21469());
   }

   @Override
   public class_1343 method_37202(float var1) {
      return this.method_37280(var1).method_6214(0.0, 0.2, 0.0);
   }
}
