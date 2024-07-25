package remapped;

import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class class_8990 extends class_5467 {
   public static final class_7821<Byte> field_46032 = class_8073.<Byte>method_36641(class_8990.class, class_2734.field_13361);
   public static final class_7821<Optional<UUID>> field_46033 = class_8073.<Optional<UUID>>method_36641(class_8990.class, class_2734.field_13348);
   private boolean field_46034;

   public class_8990(EntityType<? extends class_8990> var1, World var2) {
      super(var1, var2);
      this.method_41210();
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_46032, (byte)0);
      this.field_41735.method_36634(field_46033, Optional.<UUID>empty());
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      if (this.method_41211() != null) {
         var1.method_25964("Owner", this.method_41211());
      }

      var1.putBoolean("Sitting", this.field_46034);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      UUID var4;
      if (var1.method_25954("Owner")) {
         var4 = var1.method_25926("Owner");
      } else {
         String var5 = var1.method_25965("Owner");
         var4 = class_6860.method_31462(this.method_37268(), var5);
      }

      if (var4 != null) {
         try {
            this.method_41218(var4);
            this.method_41217(true);
         } catch (Throwable var6) {
            this.method_41217(false);
         }
      }

      this.field_46034 = var1.getBoolean("Sitting");
      this.method_41214(this.field_46034);
   }

   @Override
   public boolean method_26887(PlayerEntity var1) {
      return !this.method_26920();
   }

   public void method_41213(boolean var1) {
      class_2427 var4 = class_3090.field_15348;
      if (!var1) {
         var4 = class_3090.field_15376;
      }

      for (int var5 = 0; var5 < 7; var5++) {
         double var6 = this.field_41717.nextGaussian() * 0.02;
         double var8 = this.field_41717.nextGaussian() * 0.02;
         double var10 = this.field_41717.nextGaussian() * 0.02;
         this.world.method_43361(var4, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), var6, var8, var10);
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 7) {
         if (var1 != 6) {
            super.method_37336(var1);
         } else {
            this.method_41213(false);
         }
      } else {
         this.method_41213(true);
      }
   }

   public boolean method_41215() {
      return (this.field_41735.<Byte>method_36640(field_46032) & 4) != 0;
   }

   public void method_41217(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_46032);
      if (!var1) {
         this.field_41735.method_36633(field_46032, (byte)(var4 & -5));
      } else {
         this.field_41735.method_36633(field_46032, (byte)(var4 | 4));
      }

      this.method_41210();
   }

   public void method_41210() {
   }

   public boolean method_41209() {
      return (this.field_41735.<Byte>method_36640(field_46032) & 1) != 0;
   }

   public void method_41214(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_46032);
      if (!var1) {
         this.field_41735.method_36633(field_46032, (byte)(var4 & -2));
      } else {
         this.field_41735.method_36633(field_46032, (byte)(var4 | 1));
      }
   }

   @Nullable
   public UUID method_41211() {
      return this.field_41735.<Optional<UUID>>method_36640(field_46033).orElse((UUID)null);
   }

   public void method_41218(UUID var1) {
      this.field_41735.method_36633(field_46033, Optional.<UUID>ofNullable(var1));
   }

   public void method_41212(PlayerEntity var1) {
      this.method_41217(true);
      this.method_41218(var1.method_37328());
      if (var1 instanceof class_9359) {
         class_8807.field_45047.method_36292((class_9359)var1, this);
      }
   }

   @Nullable
   public LivingEntity method_41207() {
      try {
         UUID var3 = this.method_41211();
         return var3 == null ? null : this.world.method_25862(var3);
      } catch (IllegalArgumentException var4) {
         return null;
      }
   }

   @Override
   public boolean method_26608(LivingEntity var1) {
      return !this.method_41206(var1) ? super.method_26608(var1) : false;
   }

   public boolean method_41206(LivingEntity var1) {
      return var1 == this.method_41207();
   }

   public boolean method_41219(LivingEntity var1, LivingEntity var2) {
      return true;
   }

   @Override
   public class_5086 method_37095() {
      if (this.method_41215()) {
         LivingEntity var3 = this.method_41207();
         if (var3 != null) {
            return var3.method_37095();
         }
      }

      return super.method_37095();
   }

   @Override
   public boolean method_37344(Entity var1) {
      if (this.method_41215()) {
         LivingEntity var4 = this.method_41207();
         if (var1 == var4) {
            return true;
         }

         if (var4 != null) {
            return var4.method_37344(var1);
         }
      }

      return super.method_37344(var1);
   }

   @Override
   public void method_26452(DamageSource var1) {
      if (!this.world.field_33055 && this.world.getGameRules().getBoolean(GameRules.SHOW_DEATH_MESSAGES) && this.method_41207() instanceof class_9359) {
         this.method_41207().method_26286(this.method_26476().method_15870(), Util.NIL_UUID);
      }

      super.method_26452(var1);
   }

   public boolean method_41216() {
      return this.field_46034;
   }

   public void method_41208(boolean var1) {
      this.field_46034 = var1;
   }
}
