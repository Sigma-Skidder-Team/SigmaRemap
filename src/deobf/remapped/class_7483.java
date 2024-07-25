package remapped;

public class class_7483 extends Entity implements class_3713 {
   private static final class_7821<ItemStack> field_38200 = class_8073.<ItemStack>method_36641(class_7483.class, class_2734.field_13357);
   private double field_38206;
   private double field_38204;
   private double field_38205;
   private int field_38201;
   private boolean field_38202;

   public class_7483(EntityType<? extends class_7483> var1, World var2) {
      super(var1, var2);
   }

   public class_7483(World var1, double var2, double var4, double var6) {
      this(EntityType.field_34323, var1);
      this.field_38201 = 0;
      this.method_37256(var2, var4, var6);
   }

   public void method_34038(ItemStack var1) {
      if (var1.method_27960() != class_4897.field_24519 || var1.method_28002()) {
         this.method_37372().method_36633(field_38200, Util.<ItemStack>method_44659(var1.method_27973(), var0 -> var0.method_28017(1)));
      }
   }

   private ItemStack method_34036() {
      return this.method_37372().<ItemStack>method_36640(field_38200);
   }

   @Override
   public ItemStack method_17246() {
      ItemStack var3 = this.method_34036();
      return !var3.method_28022() ? var3 : new ItemStack(class_4897.field_24519);
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_38200, ItemStack.EMPTY);
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = this.method_37241().method_18906() * 4.0;
      if (Double.isNaN(var5)) {
         var5 = 4.0;
      }

      var5 *= 64.0;
      return var1 < var5 * var5;
   }

   public void method_34037(BlockPos var1) {
      double var4 = (double)var1.method_12173();
      int var6 = var1.method_12165();
      double var7 = (double)var1.method_12185();
      double var9 = var4 - this.getPosX();
      double var11 = var7 - this.getPosZ();
      float var13 = class_9299.method_42842(var9 * var9 + var11 * var11);
      if (!(var13 > 12.0F)) {
         this.field_38206 = var4;
         this.field_38204 = (double)var6;
         this.field_38205 = var7;
      } else {
         this.field_38206 = this.getPosX() + var9 / (double)var13 * 12.0;
         this.field_38205 = this.getPosZ() + var11 / (double)var13 * 12.0;
         this.field_38204 = this.method_37309() + 8.0;
      }

      this.field_38201 = 0;
      this.field_38202 = this.field_41717.nextInt(5) > 0;
   }

   @Override
   public void method_37162(double var1, double var3, double var5) {
      this.method_37214(var1, var3, var5);
      if (this.field_41762 == 0.0F && this.prevRotationYaw == 0.0F) {
         float var9 = class_9299.method_42842(var1 * var1 + var5 * var5);
         this.rotationYaw = (float)(class_9299.method_42821(var1, var5) * 180.0F / (float)Math.PI);
         this.rotationPitch = (float)(class_9299.method_42821(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.prevRotationYaw = this.rotationYaw;
         this.field_41762 = this.rotationPitch;
      }
   }

   @Override
   public void method_37123() {
      super.method_37123();
      class_1343 var3 = this.method_37098();
      double var4 = this.getPosX() + var3.field_7336;
      double var6 = this.method_37309() + var3.field_7333;
      double var8 = this.getPosZ() + var3.field_7334;
      float var10 = class_9299.method_42842(method_37266(var3));
      this.rotationPitch = class_5783.method_26168(this.field_41762, (float)(class_9299.method_42821(var3.field_7333, (double)var10) * 180.0F / (float)Math.PI));
      this.rotationYaw = class_5783.method_26168(this.prevRotationYaw, (float)(class_9299.method_42821(var3.field_7336, var3.field_7334) * 180.0F / (float)Math.PI));
      if (!this.world.field_33055) {
         double var12 = this.field_38206 - var4;
         double var14 = this.field_38205 - var8;
         float var16 = (float)Math.sqrt(var12 * var12 + var14 * var14);
         float var17 = (float)class_9299.method_42821(var14, var12);
         double var18 = class_9299.method_42794(0.0025, (double)var10, (double)var16);
         double var20 = var3.field_7333;
         if (var16 < 1.0F) {
            var18 *= 0.8;
            var20 *= 0.8;
         }

         int var22 = !(this.method_37309() < this.field_38204) ? -1 : 1;
         var3 = new class_1343(Math.cos((double)var17) * var18, var20 + ((double)var22 - var20) * 0.015F, Math.sin((double)var17) * var18);
         this.method_37215(var3);
      }

      float var11 = 0.25F;
      if (!this.method_37285()) {
         this.world
            .method_43361(
               class_3090.field_15356,
               var4 - var3.field_7336 * 0.25 + this.field_41717.nextDouble() * 0.6 - 0.3,
               var6 - var3.field_7333 * 0.25 - 0.5,
               var8 - var3.field_7334 * 0.25 + this.field_41717.nextDouble() * 0.6 - 0.3,
               var3.field_7336,
               var3.field_7333,
               var3.field_7334
            );
      } else {
         for (int var23 = 0; var23 < 4; var23++) {
            this.world
               .method_43361(
                  class_3090.field_15340,
                  var4 - var3.field_7336 * 0.25,
                  var6 - var3.field_7333 * 0.25,
                  var8 - var3.field_7334 * 0.25,
                  var3.field_7336,
                  var3.field_7333,
                  var3.field_7334
               );
         }
      }

      if (this.world.field_33055) {
         this.method_37222(var4, var6, var8);
      } else {
         this.method_37256(var4, var6, var8);
         this.field_38201++;
         if (this.field_38201 > 80 && !this.world.field_33055) {
            this.method_37155(class_463.field_2048, 1.0F, 1.0F);
            this.method_37204();
            if (!this.field_38202) {
               this.world.method_43364(2003, this.method_37075(), 0);
            } else {
               this.world.method_7509(new class_91(this.world, this.getPosX(), this.method_37309(), this.getPosZ(), this.method_17246()));
            }
         }
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      ItemStack var4 = this.method_34036();
      if (!var4.method_28022()) {
         var1.put("Item", var4.method_27998(new CompoundNBT()));
      }
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      ItemStack var4 = ItemStack.method_28015(var1.getCompound("Item"));
      this.method_34038(var4);
   }

   @Override
   public float method_37193() {
      return 1.0F;
   }

   @Override
   public boolean method_37394() {
      return false;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this);
   }
}
