package remapped;

public class class_7851 extends AbstractMinecartEntity {
   private static final class_7821<Boolean> field_39787 = class_8073.<Boolean>method_36641(class_7851.class, class_2734.field_13347);
   private int field_39789;
   public double field_39788;
   public double field_39786;
   private static final class_8137 field_39785 = class_8137.method_37019(class_4897.field_24917, class_4897.field_24862);

   public class_7851(EntityType<? extends class_7851> var1, World var2) {
      super(var1, var2);
   }

   public class_7851(World var1, double var2, double var4, double var6) {
      super(EntityType.field_34311, var1, var2, var4, var6);
   }

   @Override
   public class_3481 method_4737() {
      return class_3481.field_17068;
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_39787, false);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (!this.world.method_22567()) {
         if (this.field_39789 > 0) {
            this.field_39789--;
         }

         if (this.field_39789 <= 0) {
            this.field_39788 = 0.0;
            this.field_39786 = 0.0;
         }

         this.method_35523(this.field_39789 > 0);
      }

      if (this.method_35522() && this.field_41717.nextInt(4) == 0) {
         this.world.method_43361(class_3090.field_15319, this.getPosX(), this.method_37309() + 0.8, this.getPosZ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public double method_4757() {
      return 0.2;
   }

   @Override
   public void method_4743(DamageSource var1) {
      super.method_4743(var1);
      if (!var1.method_28367() && this.world.getGameRules().getBoolean(GameRules.field_1024)) {
         this.method_37312(class_4783.field_23883);
      }
   }

   @Override
   public void method_4750(BlockPos var1, class_2522 var2) {
      double var5 = 1.0E-4;
      double var7 = 0.001;
      super.method_4750(var1, var2);
      class_1343 var9 = this.method_37098();
      double var10 = method_37266(var9);
      double var12 = this.field_39788 * this.field_39788 + this.field_39786 * this.field_39786;
      if (var12 > 1.0E-4 && var10 > 0.001) {
         double var14 = (double) MathHelper.sqrt(var10);
         double var16 = (double) MathHelper.sqrt(var12);
         this.field_39788 = var9.field_7336 / var14 * var16;
         this.field_39786 = var9.field_7334 / var14 * var16;
      }
   }

   @Override
   public void method_4755() {
      double var3 = this.field_39788 * this.field_39788 + this.field_39786 * this.field_39786;
      if (!(var3 > 1.0E-7)) {
         this.method_37215(this.method_37098().method_6210(0.98, 0.0, 0.98));
      } else {
         var3 = (double) MathHelper.sqrt(var3);
         this.field_39788 /= var3;
         this.field_39786 /= var3;
         this.method_37215(this.method_37098().method_6210(0.8, 0.0, 0.8).method_6214(this.field_39788, 0.0, this.field_39786));
      }

      super.method_4755();
   }

   @Override
   public class_6910 method_37128(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (field_39785.test(var5) && this.field_39789 + 3600 <= 32000) {
         if (!var1.playerAbilities.isCreativeMode) {
            var5.method_27970(1);
         }

         this.field_39789 += 3600;
      }

      if (this.field_39789 > 0) {
         this.field_39788 = this.getPosX() - var1.getPosX();
         this.field_39786 = this.getPosZ() - var1.getPosZ();
      }

      return class_6910.method_31659(this.world.field_33055);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.method_25923("PushX", this.field_39788);
      var1.method_25923("PushZ", this.field_39786);
      var1.method_25958("Fuel", (short)this.field_39789);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field_39788 = var1.method_25932("PushX");
      this.field_39786 = var1.method_25932("PushZ");
      this.field_39789 = var1.method_25956("Fuel");
   }

   public boolean method_35522() {
      return this.field_41735.<Boolean>method_36640(field_39787);
   }

   public void method_35523(boolean var1) {
      this.field_41735.method_36633(field_39787, var1);
   }

   @Override
   public class_2522 method_4752() {
      return class_4783.field_23883
         .method_29260()
         .method_10308(class_3744.field_18523, Direction.field_818)
         .method_10308(class_3744.field_18522, Boolean.valueOf(this.method_35522()));
   }
}
