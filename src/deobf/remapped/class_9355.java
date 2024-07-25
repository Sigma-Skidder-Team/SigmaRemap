package remapped;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;

public class class_9355 extends class_2811 implements class_3449 {
   private static final class_7821<Boolean> field_47749 = class_8073.<Boolean>method_36641(class_9355.class, class_2734.field_13347);
   private static final class_7821<class_3047> field_47747 = class_8073.<class_3047>method_36641(class_9355.class, class_2734.field_13360);
   private int field_47746;
   private UUID field_47750;
   private class_8406 field_47744;
   private CompoundNBT field_47748;
   private int field_47751;

   public class_9355(EntityType<? extends class_9355> var1, World var2) {
      super(var1, var2);
      this.method_43207(this.method_15891().method_13909(class_8669.field_44425.method_24525(this.field_41717)));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_47749, false);
      this.field_41735.method_36634(field_47747, new class_3047(class_8853.field_45268, class_4466.field_21775, 1));
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      class_3047.field_14935
         .encodeStart(class_3504.field_17178, this.method_15891())
         .resultOrPartial(LOGGER::error)
         .ifPresent(var1x -> var1.put("VillagerData", var1x));
      if (this.field_47748 != null) {
         var1.put("Offers", this.field_47748);
      }

      if (this.field_47744 != null) {
         var1.put("Gossips", this.field_47744);
      }

      var1.method_25931("ConversionTime", !this.method_43208() ? -1 : this.field_47746);
      if (this.field_47750 != null) {
         var1.method_25964("ConversionPlayer", this.field_47750);
      }

      var1.method_25931("Xp", this.field_47751);
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      if (var1.contains("VillagerData", 10)) {
         DataResult var4 = class_3047.field_14935.parse(new Dynamic(class_3504.field_17178, var1.method_25929("VillagerData")));
         var4.resultOrPartial(LOGGER::error).ifPresent(this::method_43207);
      }

      if (var1.contains("Offers", 10)) {
         this.field_47748 = var1.getCompound("Offers");
      }

      if (var1.contains("Gossips", 10)) {
         this.field_47744 = var1.method_25927("Gossips", 10);
      }

      if (var1.contains("ConversionTime", 99) && var1.method_25947("ConversionTime") > -1) {
         this.method_43201(!var1.method_25954("ConversionPlayer") ? null : var1.method_25926("ConversionPlayer"), var1.method_25947("ConversionTime"));
      }

      if (var1.contains("Xp", 3)) {
         this.field_47751 = var1.method_25947("Xp");
      }
   }

   @Override
   public void method_37123() {
      if (!this.world.field_33055 && this.isAlive() && this.method_43208()) {
         int var3 = this.method_43202();
         this.field_47746 -= var3;
         if (this.field_47746 <= 0) {
            this.method_43204((class_6331)this.world);
         }
      }

      super.method_37123();
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() != class_4897.field_25037) {
         return super.method_26857(var1, var2);
      } else if (!this.isPotionActive(Effects.field_19737)) {
         return class_6910.field_35518;
      } else {
         if (!var1.playerAbilities.isCreativeMode) {
            var5.method_27970(1);
         }

         if (!this.world.field_33055) {
            this.method_43201(var1.method_37328(), this.field_41717.nextInt(2401) + 3600);
         }

         return class_6910.field_35520;
      }
   }

   @Override
   public boolean method_12795() {
      return false;
   }

   @Override
   public boolean method_26911(double var1) {
      return !this.method_43208() && this.field_47751 == 0;
   }

   public boolean method_43208() {
      return this.method_37372().<Boolean>method_36640(field_47749);
   }

   private void method_43201(UUID var1, int var2) {
      this.field_47750 = var1;
      this.field_47746 = var2;
      this.method_37372().method_36633(field_47749, true);
      this.removeEffect(Effects.field_19737);
      this.method_26558(new class_2250(Effects.field_19733, var2, Math.min(this.world.method_43370().method_2097() - 1, 0)));
      this.world.method_29587(this, (byte)16);
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 16) {
         super.method_37336(var1);
      } else if (!this.method_37378()) {
         this.world
            .method_29527(
               this.getPosX(),
               this.method_37388(),
               this.getPosZ(),
               class_463.field_2499,
               this.method_37197(),
               1.0F + this.field_41717.nextFloat(),
               this.field_41717.nextFloat() * 0.7F + 0.3F,
               false
            );
      }
   }

   private void method_43204(class_6331 var1) {
      class_7666 var4 = this.<class_7666>method_26898(EntityType.field_34276, false);

      for (class_6943 var8 : class_6943.values()) {
         ItemStack var9 = this.method_26520(var8);
         if (!var9.method_28022()) {
            if (!class_2931.method_13421(var9)) {
               double var10 = (double)this.method_26913(var8);
               if (var10 > 1.0) {
                  this.method_37310(var9);
               }
            } else {
               var4.method_37166(var8.method_31767() + 300, var9);
            }
         }
      }

      var4.method_34716(this.method_15891());
      if (this.field_47744 != null) {
         var4.method_34710(this.field_47744);
      }

      if (this.field_47748 != null) {
         var4.method_34699(new class_2795(this.field_47748));
      }

      var4.method_34713(this.field_47751);
      var4.method_26864(var1, var1.method_43368(var4.method_37075()), class_2417.field_12041, (class_8733)null, (CompoundNBT)null);
      if (this.field_47750 != null) {
         PlayerEntity var12 = var1.method_25862(this.field_47750);
         if (var12 instanceof class_9359) {
            class_8807.field_45048.method_39403((class_9359)var12, this, var4);
            var1.method_28955(class_3894.field_18945, var12, var4);
         }
      }

      var4.method_26558(new class_2250(Effects.NAUSEA, 200, 0));
      if (!this.method_37378()) {
         var1.method_43365((PlayerEntity)null, 1027, this.method_37075(), 0);
      }
   }

   private int method_43202() {
      int var3 = 1;
      if (this.field_41717.nextFloat() < 0.01F) {
         int var4 = 0;
         class_2921 var5 = new class_2921();

         for (int var6 = (int)this.getPosX() - 4; var6 < (int)this.getPosX() + 4 && var4 < 14; var6++) {
            for (int var7 = (int)this.method_37309() - 4; var7 < (int)this.method_37309() + 4 && var4 < 14; var7++) {
               for (int var8 = (int)this.getPosZ() - 4; var8 < (int)this.getPosZ() + 4 && var4 < 14; var8++) {
                  class_6414 var9 = this.world.method_28262(var5.method_13362(var6, var7, var8)).method_8360();
                  if (var9 == class_4783.field_23817 || var9 instanceof class_3633) {
                     if (this.field_41717.nextFloat() < 0.3F) {
                        var3++;
                     }

                     var4++;
                  }
               }
            }
         }
      }

      return var3;
   }

   @Override
   public float method_26547() {
      return !this.method_26449()
         ? (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 1.0F
         : (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F + 2.0F;
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2159;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2379;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_1950;
   }

   @Override
   public class_8461 method_12805() {
      return class_463.field_1933;
   }

   @Override
   public ItemStack method_12796() {
      return ItemStack.EMPTY;
   }

   public void method_43206(CompoundNBT var1) {
      this.field_47748 = var1;
   }

   public void method_43205(class_8406 var1) {
      this.field_47744 = var1;
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_43207(this.method_15891().method_13914(class_8853.method_40719(var1.method_2754(this.method_37075()))));
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   public void method_43207(class_3047 var1) {
      class_3047 var4 = this.method_15891();
      if (var4.method_13910() != var1.method_13910()) {
         this.field_47748 = null;
      }

      this.field_41735.method_36633(field_47747, var1);
   }

   @Override
   public class_3047 method_15891() {
      return this.field_41735.<class_3047>method_36640(field_47747);
   }

   public void method_43203(int var1) {
      this.field_47751 = var1;
   }
}
