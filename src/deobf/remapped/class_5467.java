package remapped;

import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class class_5467 extends class_1899 {
   private int field_27875;
   private UUID field_27876;

   public class_5467(class_6629<? extends class_5467> var1, World var2) {
      super(var1, var2);
      this.method_26895(class_1108.field_6357, 16.0F);
      this.method_26895(class_1108.field_6352, -1.0F);
   }

   @Override
   public void method_26919() {
      if (this.method_8634() != 0) {
         this.field_27875 = 0;
      }

      super.method_26919();
   }

   @Override
   public void method_26606() {
      super.method_26606();
      if (this.method_8634() != 0) {
         this.field_27875 = 0;
      }

      if (this.field_27875 > 0) {
         this.field_27875--;
         if (this.field_27875 % 10 == 0) {
            double var3 = this.field_41717.nextGaussian() * 0.02;
            double var5 = this.field_41717.nextGaussian() * 0.02;
            double var7 = this.field_41717.nextGaussian() * 0.02;
            this.field_41768.method_43361(class_3090.field_15348, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), var3, var5, var7);
         }
      }
   }

   @Override
   public boolean method_37181(class_6199 var1, float var2) {
      if (!this.method_37180(var1)) {
         this.field_27875 = 0;
         return super.method_37181(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public float method_21376(class_1331 var1, class_4924 var2) {
      return !var2.method_28262(var1.method_6100()).method_8350(class_4783.field_23259) ? var2.method_22566(var1) - 0.5F : 10.0F;
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.method_25931("InLove", this.field_27875);
      if (this.field_27876 != null) {
         var1.method_25964("LoveCause", this.field_27876);
      }
   }

   @Override
   public double method_37106() {
      return 0.14;
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.field_27875 = var1.method_25947("InLove");
      this.field_27876 = !var1.method_25954("LoveCause") ? null : var1.method_25926("LoveCause");
   }

   public static boolean method_24872(class_6629<? extends class_5467> var0, class_9379 var1, class_2417 var2, class_1331 var3, Random var4) {
      return var1.method_28262(var3.method_6100()).method_8350(class_4783.field_23259) && var1.method_25261(var3, 0) > 8;
   }

   @Override
   public int method_26850() {
      return 120;
   }

   @Override
   public boolean method_26911(double var1) {
      return false;
   }

   @Override
   public int method_26427(class_704 var1) {
      return 1 + this.field_41768.field_33033.nextInt(3);
   }

   public boolean method_24866(ItemStack var1) {
      return var1.method_27960() == class_4897.field_24813;
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (this.method_24866(var5)) {
         int var6 = this.method_8634();
         if (!this.field_41768.field_33055 && var6 == 0 && this.method_24870()) {
            this.method_24867(var1, var5);
            this.method_24869(var1);
            return class_6910.field_35520;
         }

         if (this.method_26449()) {
            this.method_24867(var1, var5);
            this.method_8633((int)((float)(-var6 / 20) * 0.1F), true);
            return class_6910.method_31659(this.field_41768.field_33055);
         }

         if (this.field_41768.field_33055) {
            return class_6910.field_35518;
         }
      }

      return super.method_26857(var1, var2);
   }

   public void method_24867(class_704 var1, ItemStack var2) {
      if (!var1.playerAbilities.isCreativeMode) {
         var2.method_27970(1);
      }
   }

   public boolean method_24870() {
      return this.field_27875 <= 0;
   }

   public void method_24869(class_704 var1) {
      this.field_27875 = 600;
      if (var1 != null) {
         this.field_27876 = var1.method_37328();
      }

      this.field_41768.method_29587(this, (byte)18);
   }

   public void method_24868(int var1) {
      this.field_27875 = var1;
   }

   public int method_24871() {
      return this.field_27875;
   }

   @Nullable
   public class_9359 method_24877() {
      if (this.field_27876 != null) {
         class_704 var3 = this.field_41768.method_25862(this.field_27876);
         return !(var3 instanceof class_9359) ? null : (class_9359)var3;
      } else {
         return null;
      }
   }

   public boolean method_24875() {
      return this.field_27875 > 0;
   }

   public void method_24876() {
      this.field_27875 = 0;
   }

   public boolean method_24873(class_5467 var1) {
      if (var1 != this) {
         return var1.getClass() != this.getClass() ? false : this.method_24875() && var1.method_24875();
      } else {
         return false;
      }
   }

   public void method_24874(class_6331 var1, class_5467 var2) {
      class_1899 var5 = this.method_8638(var1, var2);
      if (var5 != null) {
         class_9359 var6 = this.method_24877();
         if (var6 == null && var2.method_24877() != null) {
            var6 = var2.method_24877();
         }

         if (var6 != null) {
            var6.method_3209(class_6234.field_31883);
            class_8807.field_45072.method_5733(var6, this, var2, var5);
         }

         this.method_8635(6000);
         var2.method_8635(6000);
         this.method_24876();
         var2.method_24876();
         var5.method_26910(true);
         var5.method_37144(this.method_37302(), this.method_37309(), this.method_37156(), 0.0F, 0.0F);
         var1.method_7065(var5);
         var1.method_29587(this, (byte)18);
         if (var1.method_29537().method_1285(class_291.field_1033)) {
            var1.method_7509(new class_5614(var1, this.method_37302(), this.method_37309(), this.method_37156(), this.method_26594().nextInt(7) + 1));
         }
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 18) {
         super.method_37336(var1);
      } else {
         for (int var4 = 0; var4 < 7; var4++) {
            double var5 = this.field_41717.nextGaussian() * 0.02;
            double var7 = this.field_41717.nextGaussian() * 0.02;
            double var9 = this.field_41717.nextGaussian() * 0.02;
            this.field_41768.method_43361(class_3090.field_15348, this.method_37361(1.0), this.method_37255() + 0.5, this.method_37383(1.0), var5, var7, var9);
         }
      }
   }
}
