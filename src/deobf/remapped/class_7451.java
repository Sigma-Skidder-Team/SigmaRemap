package remapped;

import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7451 extends class_4641 {
   private static final Logger field_37973 = LogManager.getLogger();
   private static final class_7821<ItemStack> field_37975 = class_8073.<ItemStack>method_36641(class_7451.class, class_2734.field_13357);
   private static final class_7821<Integer> field_37978 = class_8073.<Integer>method_36641(class_7451.class, class_2734.field_13366);
   private float field_37977 = 1.0F;
   private boolean field_37976;

   public class_7451(class_6629<? extends class_7451> var1, World var2) {
      super(var1, var2);
   }

   public class_7451(World var1, BlockPos var2, Direction var3) {
      super(class_6629.field_34319, var1, var2);
      this.method_21468(var3);
   }

   @Override
   public float method_37279(class_7653 var1, class_6097 var2) {
      return 0.0F;
   }

   @Override
   public void method_37329() {
      this.method_37372().method_36634(field_37975, ItemStack.EMPTY);
      this.method_37372().method_36634(field_37978, 0);
   }

   @Override
   public void method_21468(Direction var1) {
      Validate.notNull(var1);
      this.field_22663 = var1;
      if (!var1.method_1029().method_42629()) {
         this.rotationPitch = (float)(-90 * var1.method_1049().method_549());
         this.rotationYaw = 0.0F;
      } else {
         this.rotationPitch = 0.0F;
         this.rotationYaw = (float)(this.field_22663.method_1031() * 90);
      }

      this.field_41762 = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
      this.method_21474();
   }

   @Override
   public void method_21474() {
      if (this.field_22663 != null) {
         double var3 = 0.46875;
         double var5 = (double)this.field_22661.method_12173() + 0.5 - (double)this.field_22663.method_1041() * 0.46875;
         double var7 = (double)this.field_22661.method_12165() + 0.5 - (double)this.field_22663.method_1054() * 0.46875;
         double var9 = (double)this.field_22661.method_12185() + 0.5 - (double)this.field_22663.method_1034() * 0.46875;
         this.method_37222(var5, var7, var9);
         double var11 = (double)this.method_21470();
         double var13 = (double)this.method_21473();
         double var15 = (double)this.method_21470();
         class_9249 var17 = this.field_22663.method_1029();
         switch (var17) {
            case field_47215:
               var11 = 1.0;
               break;
            case field_47216:
               var13 = 1.0;
               break;
            case field_47219:
               var15 = 1.0;
         }

         var11 /= 32.0;
         var13 /= 32.0;
         var15 /= 32.0;
         this.method_37094(new Box(var5 - var11, var7 - var13, var9 - var15, var5 + var11, var7 + var13, var9 + var15));
      }
   }

   @Override
   public boolean method_21472() {
      if (!this.field_37976) {
         if (!this.world.method_6682(this)) {
            return false;
         } else {
            class_2522 var3 = this.world.method_28262(this.field_22661.method_6098(this.field_22663.method_1046()));
            return !var3.method_8362().method_24499() && (!this.field_22663.method_1029().method_42629() || !class_5877.method_26769(var3))
               ? false
               : this.world.method_25867(this, this.method_37241(), field_22662).isEmpty();
         }
      } else {
         return true;
      }
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      if (!this.field_37976) {
         super.method_37226(var1, var2);
      }
   }

   @Override
   public void method_37186(double var1, double var3, double var5) {
      if (!this.field_37976) {
         super.method_37186(var1, var3, var5);
      }
   }

   @Override
   public float method_37355() {
      return 0.0F;
   }

   @Override
   public void method_37250() {
      this.method_33911(this.method_33905());
      super.method_37250();
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (!this.field_37976) {
         if (!this.method_37180(var1)) {
            if (!var1.method_28367() && !this.method_33905().method_28022()) {
               if (!this.world.field_33055) {
                  this.method_33908(var1.method_28372(), false);
                  this.method_37155(class_463.field_2110, 1.0F, 1.0F);
               }

               return true;
            } else {
               return super.attackEntityFrom(var1, var2);
            }
         } else {
            return false;
         }
      } else {
         return var1 != DamageSource.field_31685 && !var1.method_28349() ? false : super.attackEntityFrom(var1, var2);
      }
   }

   @Override
   public int method_21470() {
      return 12;
   }

   @Override
   public int method_21473() {
      return 12;
   }

   @Override
   public boolean method_37176(double var1) {
      double var5 = 16.0;
      var5 = var5 * 64.0 * method_37345();
      return var1 < var5 * var5;
   }

   @Override
   public void method_21475(Entity var1) {
      this.method_37155(class_463.field_2425, 1.0F, 1.0F);
      this.method_33908(var1, true);
   }

   @Override
   public void method_21471() {
      this.method_37155(class_463.field_2052, 1.0F, 1.0F);
   }

   private void method_33908(Entity var1, boolean var2) {
      if (!this.field_37976) {
         ItemStack var5 = this.method_33905();
         this.method_33912(ItemStack.EMPTY);
         if (this.world.method_29537().method_1285(class_291.field_1024)) {
            if (var1 instanceof class_704) {
               class_704 var6 = (class_704)var1;
               if (var6.playerAbilities.isCreativeMode) {
                  this.method_33911(var5);
                  return;
               }
            }

            if (var2) {
               this.method_37312(class_4897.field_24463);
            }

            if (!var5.method_28022()) {
               var5 = var5.method_27973();
               this.method_33911(var5);
               if (this.field_41717.nextFloat() < this.field_37977) {
                  this.method_37310(var5);
               }
            }
         } else if (var1 == null) {
            this.method_33911(var5);
         }
      }
   }

   private void method_33911(ItemStack var1) {
      if (var1.method_27960() == class_4897.field_25262) {
         class_2134 var4 = class_2143.method_10005(var1, this.world);
         var4.method_9964(this.field_22661, this.method_37145());
         var4.method_32922(true);
      }

      var1.method_27992((Entity)null);
   }

   public ItemStack method_33905() {
      return this.method_37372().<ItemStack>method_36640(field_37975);
   }

   public void method_33912(ItemStack var1) {
      this.method_33906(var1, true);
   }

   public void method_33906(ItemStack var1, boolean var2) {
      if (!var1.method_28022()) {
         var1 = var1.method_27973();
         var1.method_28017(1);
         var1.method_27992(this);
      }

      this.method_37372().method_36633(field_37975, var1);
      if (!var1.method_28022()) {
         this.method_37155(class_463.field_2498, 1.0F, 1.0F);
      }

      if (var2 && this.field_22661 != null) {
         this.world.method_29523(this.field_22661, class_4783.field_23184);
      }
   }

   @Override
   public boolean method_37166(int var1, ItemStack var2) {
      if (var1 != 0) {
         return false;
      } else {
         this.method_33912(var2);
         return true;
      }
   }

   @Override
   public void method_37191(class_7821<?> var1) {
      if (var1.equals(field_37975)) {
         ItemStack var4 = this.method_33905();
         if (!var4.method_28022() && var4.method_27961() != this) {
            var4.method_27992(this);
         }
      }
   }

   public int method_33907() {
      return this.method_37372().<Integer>method_36640(field_37978);
   }

   public void method_33910(int var1) {
      this.method_33913(var1, true);
   }

   private void method_33913(int var1, boolean var2) {
      this.method_37372().method_36633(field_37978, var1 % 8);
      if (var2 && this.field_22661 != null) {
         this.world.method_29523(this.field_22661, class_4783.field_23184);
      }
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      if (!this.method_33905().method_28022()) {
         var1.put("Item", this.method_33905().method_27998(new CompoundNBT()));
         var1.method_25921("ItemRotation", (byte)this.method_33907());
         var1.putFloat("ItemDropChance", this.field_37977);
      }

      var1.method_25921("Facing", (byte)this.field_22663.method_1050());
      var1.putBoolean("Invisible", this.method_37109());
      var1.putBoolean("Fixed", this.field_37976);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      CompoundNBT var4 = var1.getCompound("Item");
      if (var4 != null && !var4.method_25940()) {
         ItemStack var5 = ItemStack.method_28015(var4);
         if (var5.method_28022()) {
            field_37973.warn("Unable to load item from: {}", var4);
         }

         ItemStack var6 = this.method_33905();
         if (!var6.method_28022() && !ItemStack.method_27982(var5, var6)) {
            this.method_33911(var6);
         }

         this.method_33906(var5, false);
         this.method_33913(var1.method_25950("ItemRotation"), false);
         if (var1.contains("ItemDropChance", 99)) {
            this.field_37977 = var1.getFloat("ItemDropChance");
         }
      }

      this.method_21468(Direction.method_1033(var1.method_25950("Facing")));
      this.method_37333(var1.getBoolean("Invisible"));
      this.field_37976 = var1.getBoolean("Fixed");
   }

   @Override
   public class_6910 method_37128(class_704 var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      boolean var6 = !this.method_33905().method_28022();
      boolean var7 = !var5.method_28022();
      if (!this.field_37976) {
         if (!this.world.field_33055) {
            if (var6) {
               this.method_37155(class_463.field_2457, 1.0F, 1.0F);
               this.method_33910(this.method_33907() + 1);
            } else if (var7 && !this.field_41751) {
               this.method_33912(var5);
               if (!var1.playerAbilities.isCreativeMode) {
                  var5.method_27970(1);
               }
            }

            return class_6910.field_35518;
         } else {
            return !var6 && !var7 ? class_6910.field_35521 : class_6910.field_35520;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   public int method_33909() {
      return !this.method_33905().method_28022() ? this.method_33907() % 8 + 1 : 0;
   }

   @Override
   public Packet<?> method_37142() {
      return new class_6589(this, this.method_37387(), this.field_22663.method_1050(), this.method_21469());
   }
}
