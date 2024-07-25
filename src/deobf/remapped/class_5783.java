package remapped;

import java.util.UUID;
import javax.annotation.Nullable;

public abstract class class_5783 extends Entity {
   private UUID field_29207;
   private int field_29205;
   private boolean field_29206;

   public class_5783(EntityType<? extends class_5783> var1, World var2) {
      super(var1, var2);
   }

   public void method_26159(Entity var1) {
      if (var1 != null) {
         this.field_29207 = var1.method_37328();
         this.field_29205 = var1.method_37145();
      }
   }

   @Nullable
   public Entity method_26166() {
      if (this.field_29207 != null && this.world instanceof class_6331) {
         return ((class_6331)this.world).method_28925(this.field_29207);
      } else {
         return this.field_29205 == 0 ? null : this.world.method_29534(this.field_29205);
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      if (this.field_29207 != null) {
         var1.method_25964("Owner", this.field_29207);
      }

      if (this.field_29206) {
         var1.putBoolean("LeftOwner", true);
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      if (var1.method_25954("Owner")) {
         this.field_29207 = var1.method_25926("Owner");
      }

      this.field_29206 = var1.getBoolean("LeftOwner");
   }

   @Override
   public void method_37123() {
      if (!this.field_29206) {
         this.field_29206 = this.method_26162();
      }

      super.method_37123();
   }

   private boolean method_26162() {
      Entity var3 = this.method_26166();
      if (var3 != null) {
         for (Entity var5 : this.world
            .method_25867(this, this.method_37241().method_18929(this.method_37098()).method_18898(1.0), var0 -> !var0.method_37221() && var0.method_37167())) {
            if (var5.getLowestRidingEntity() == var3.getLowestRidingEntity()) {
               return false;
            }
         }
      }

      return true;
   }

   public void method_26161(double var1, double var3, double var5, float var7, float var8) {
      class_1343 var11 = new class_1343(var1, var3, var5)
         .method_6213()
         .method_6214(
            this.field_41717.nextGaussian() * 0.0075F * (double)var8,
            this.field_41717.nextGaussian() * 0.0075F * (double)var8,
            this.field_41717.nextGaussian() * 0.0075F * (double)var8
         )
         .method_6209((double)var7);
      this.method_37215(var11);
      float var12 = class_9299.method_42842(method_37266(var11));
      this.rotationYaw = (float)(class_9299.method_42821(var11.field_7336, var11.field_7334) * 180.0F / (float)Math.PI);
      this.rotationPitch = (float)(class_9299.method_42821(var11.field_7333, (double)var12) * 180.0F / (float)Math.PI);
      this.prevRotationYaw = this.rotationYaw;
      this.field_41762 = this.rotationPitch;
   }

   public void method_26158(Entity var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = -class_9299.method_42818(var3 * (float) (Math.PI / 180.0)) * class_9299.method_42840(var2 * (float) (Math.PI / 180.0));
      float var10 = -class_9299.method_42818((var2 + var4) * (float) (Math.PI / 180.0));
      float var11 = class_9299.method_42840(var3 * (float) (Math.PI / 180.0)) * class_9299.method_42840(var2 * (float) (Math.PI / 180.0));
      this.method_26161((double)var9, (double)var10, (double)var11, var5, var6);
      class_1343 var12 = var1.method_37098();
      this.method_37215(this.method_37098().method_6214(var12.field_7336, !var1.method_37360() ? var12.field_7333 : 0.0, var12.field_7334));
   }

   public void method_26160(class_7474 var1) {
      class_1430 var4 = var1.method_33990();
      if (var4 != class_1430.field_7718) {
         if (var4 == class_1430.field_7717) {
            this.method_26165((class_9529)var1);
         }
      } else {
         this.method_26163((class_5631)var1);
      }
   }

   public void method_26163(class_5631 var1) {
   }

   public void method_26165(class_9529 var1) {
      class_2522 var4 = this.world.method_28262(var1.method_43955());
      var4.method_8361(this.world, var4, var1, this);
   }

   @Override
   public void method_37162(double var1, double var3, double var5) {
      this.method_37214(var1, var3, var5);
      if (this.field_41762 == 0.0F && this.prevRotationYaw == 0.0F) {
         float var9 = class_9299.method_42842(var1 * var1 + var5 * var5);
         this.rotationPitch = (float)(class_9299.method_42821(var3, (double)var9) * 180.0F / (float)Math.PI);
         this.rotationYaw = (float)(class_9299.method_42821(var1, var5) * 180.0F / (float)Math.PI);
         this.field_41762 = this.rotationPitch;
         this.prevRotationYaw = this.rotationYaw;
         this.method_37144(this.getPosX(), this.method_37309(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
      }
   }

   public boolean method_26164(Entity var1) {
      if (!var1.method_37221() && var1.isAlive() && var1.method_37167()) {
         Entity var4 = this.method_26166();
         return var4 == null || this.field_29206 || !var4.method_37308(var1);
      } else {
         return false;
      }
   }

   public void method_26167() {
      class_1343 var3 = this.method_37098();
      float var4 = class_9299.method_42842(method_37266(var3));
      this.rotationPitch = method_26168(this.field_41762, (float)(class_9299.method_42821(var3.field_7333, (double)var4) * 180.0F / (float)Math.PI));
      this.rotationYaw = method_26168(this.prevRotationYaw, (float)(class_9299.method_42821(var3.field_7336, var3.field_7334) * 180.0F / (float)Math.PI));
   }

   public static float method_26168(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return class_9299.method_42795(0.2F, var0, var1);
   }
}
