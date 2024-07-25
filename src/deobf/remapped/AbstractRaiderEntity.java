package remapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class AbstractRaiderEntity extends class_4607 {
   public static final class_7821<Boolean> field_19606 = class_8073.<Boolean>method_36641(AbstractRaiderEntity.class, class_2734.field_13347);
   private static final Predicate<class_91> field_19607 = var0 -> !var0.method_258()
         && var0.isAlive()
         && ItemStack.method_27982(var0.method_264(), class_2452.method_11292());
   public class_2452 field_19610;
   private int field_19611;
   private boolean field_19608;
   private int field_19609;

   public AbstractRaiderEntity(EntityType<? extends AbstractRaiderEntity> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      super.registerGoals();
      this.goalSelector.addGoal(1, new class_9110<AbstractRaiderEntity>(this, this));
      this.goalSelector.addGoal(3, new class_3230<AbstractRaiderEntity>(this));
      this.goalSelector.addGoal(4, new class_3882(this, 1.05F, 1));
      this.goalSelector.addGoal(5, new class_6082(this, this));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_19606, false);
   }

   public abstract void method_18602(int var1, boolean var2);

   public boolean method_18593() {
      return this.field_19608;
   }

   public void method_18585(boolean var1) {
      this.field_19608 = var1;
   }

   @Override
   public void method_26606() {
      if (this.world instanceof class_6331 && this.isAlive()) {
         class_2452 var3 = this.method_18589();
         if (this.method_18593()) {
            if (var3 != null) {
               class_5834 var4 = this.method_17809();
               if (var4 != null && (var4.getType() == EntityType.field_34300 || var4.getType() == EntityType.field_34298)) {
                  this.field_29658 = 0;
               }
            } else if (this.world.method_29546() % 20L == 0L) {
               class_2452 var5 = ((class_6331)this.world).method_28984(this.method_37075());
               if (var5 != null && class_8996.method_41275(this, var5)) {
                  var5.method_11275(var5.method_11262(), this, (BlockPos)null, true);
               }
            }
         }
      }

      super.method_26606();
   }

   @Override
   public void method_5203() {
      this.field_29658 += 2;
   }

   @Override
   public void method_26452(DamageSource var1) {
      if (this.world instanceof class_6331) {
         Entity var4 = var1.method_28372();
         class_2452 var5 = this.method_18589();
         if (var5 != null) {
            if (this.method_21359()) {
               var5.method_11287(this.method_18592());
            }

            if (var4 != null && var4.getType() == EntityType.field_34300) {
               var5.method_11304(var4);
            }

            var5.method_11289(this, false);
         }

         if (this.method_21359() && var5 == null && ((class_6331)this.world).method_28984(this.method_37075()) == null) {
            ItemStack var6 = this.method_26520(class_6943.field_35704);
            PlayerEntity var7 = null;
            if (!(var4 instanceof PlayerEntity)) {
               if (var4 instanceof class_9408) {
                  class_9408 var8 = (class_9408)var4;
                  class_5834 var9 = var8.method_41207();
                  if (var8.method_41215() && var9 instanceof PlayerEntity) {
                     var7 = (PlayerEntity)var9;
                  }
               }
            } else {
               var7 = (PlayerEntity)var4;
            }

            if (!var6.method_28022() && ItemStack.method_27982(var6, class_2452.method_11292()) && var7 != null) {
               class_2250 var11 = var7.method_26553(Effects.field_19721);
               int var12 = 1;
               if (var11 == null) {
                  var12--;
               } else {
                  var12 += var11.method_10333();
                  var7.method_26421(Effects.field_19721);
               }

               var12 = class_9299.method_42829(var12, 0, 4);
               class_2250 var10 = new class_2250(Effects.field_19721, 120000, var12, false, false, true);
               if (!this.world.method_29537().method_1285(class_291.field_1045)) {
                  var7.method_26558(var10);
               }
            }
         }
      }

      super.method_26452(var1);
   }

   @Override
   public boolean method_21350() {
      return !this.method_18600();
   }

   public void method_18587(class_2452 var1) {
      this.field_19610 = var1;
   }

   @Nullable
   public class_2452 method_18589() {
      return this.field_19610;
   }

   public boolean method_18600() {
      return this.method_18589() != null && this.method_18589().method_11306();
   }

   public void method_18590(int var1) {
      this.field_19611 = var1;
   }

   public int method_18592() {
      return this.field_19611;
   }

   public boolean method_18596() {
      return this.field_41735.<Boolean>method_36640(field_19606);
   }

   public void method_18594(boolean var1) {
      this.field_41735.method_36633(field_19606, var1);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("Wave", this.field_19611);
      var1.putBoolean("CanJoinRaid", this.field_19608);
      if (this.field_19610 != null) {
         var1.putInt("RaidId", this.field_19610.method_11288());
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.field_19611 = var1.method_25947("Wave");
      this.field_19608 = var1.getBoolean("CanJoinRaid");
      if (var1.contains("RaidId", 3)) {
         if (this.world instanceof class_6331) {
            this.field_19610 = ((class_6331)this.world).method_28985().method_41269(var1.method_25947("RaidId"));
         }

         if (this.field_19610 != null) {
            this.field_19610.method_11276(this.field_19611, this, false);
            if (this.method_21359()) {
               this.field_19610.method_11281(this.field_19611, this);
            }
         }
      }
   }

   @Override
   public void method_26902(class_91 var1) {
      ItemStack var4 = var1.method_264();
      boolean var5 = this.method_18600() && this.method_18589().method_11282(this.method_18592()) != null;
      if (this.method_18600() && !var5 && ItemStack.method_27982(var4, class_2452.method_11292())) {
         class_6943 var6 = class_6943.field_35704;
         ItemStack var7 = this.method_26520(var6);
         double var8 = (double)this.method_26913(var6);
         if (!var7.method_28022() && (double)Math.max(this.field_41717.nextFloat() - 0.1F, 0.0F) < var8) {
            this.method_37310(var7);
         }

         this.method_26562(var1);
         this.method_37349(var6, var4);
         this.method_26467(var1, var4.method_27997());
         var1.method_37204();
         this.method_18589().method_11281(this.method_18592(), this);
         this.method_21354(true);
      } else {
         super.method_26902(var1);
      }
   }

   @Override
   public boolean method_26911(double var1) {
      return this.method_18589() != null ? false : super.method_26911(var1);
   }

   @Override
   public boolean method_26915() {
      return super.method_26915() || this.method_18589() != null;
   }

   public int method_18595() {
      return this.field_19609;
   }

   public void method_18588(int var1) {
      this.field_19609 = var1;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      if (this.method_18600()) {
         this.method_18589().method_11290();
      }

      return super.attackEntityFrom(var1, var2);
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_18585(this.getType() != EntityType.field_34220 || var3 != class_2417.field_12031);
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   public abstract class_8461 method_18591();
}
