package remapped;

import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class class_557 extends class_3757 implements class_5507, class_3745 {
   private final class_2831<ItemStack> field_3312 = class_2831.<ItemStack>method_12872(4, ItemStack.EMPTY);
   private final int[] field_3311 = new int[4];
   private final int[] field_3310 = new int[4];

   public class_557() {
      super(class_133.field_365);
   }

   @Override
   public void method_17353() {
      boolean var3 = this.method_17403().<Boolean>method_10313(class_8474.field_43423);
      boolean var4 = this.field_18364.field_33055;
      if (!var4) {
         if (!var3) {
            for (int var5 = 0; var5 < this.field_3312.size(); var5++) {
               if (this.field_3311[var5] > 0) {
                  this.field_3311[var5] = MathHelper.clamp(this.field_3311[var5] - 2, 0, this.field_3310[var5]);
               }
            }
         } else {
            this.method_2671();
         }
      } else if (var3) {
         this.method_2676();
      }
   }

   private void method_2671() {
      for (int var3 = 0; var3 < this.field_3312.size(); var3++) {
         ItemStack var4 = this.field_3312.get(var3);
         if (!var4.method_28022()) {
            this.field_3311[var3]++;
            if (this.field_3311[var3] >= this.field_3310[var3]) {
               class_4657 var6 = new class_4657(var4);
               ItemStack var7 = this.field_18364
                  .method_29549()
                  .<class_6867, class_5917>method_23138(class_1510.field_7996, var6, this.field_18364)
                  .<ItemStack>map(var1 -> var1.method_41042(var6))
                  .orElse(var4);
               BlockPos var8 = this.method_17399();
               class_1573.method_7100(this.field_18364, (double)var8.getX(), (double)var8.getY(), (double)var8.getZ(), var7);
               this.field_3312.set(var3, ItemStack.EMPTY);
               this.method_2669();
            }
         }
      }
   }

   private void method_2676() {
      World var3 = this.method_17402();
      if (var3 != null) {
         BlockPos var4 = this.method_17399();
         Random var5 = var3.field_33033;
         if (var5.nextFloat() < 0.11F) {
            for (int var6 = 0; var6 < var5.nextInt(2) + 2; var6++) {
               class_8474.method_39003(var3, var4, this.method_17403().<Boolean>method_10313(class_8474.field_43427), false);
            }
         }

         int var17 = this.method_17403().<Direction>method_10313(class_8474.field_43419).method_1031();

         for (int var7 = 0; var7 < this.field_3312.size(); var7++) {
            if (!this.field_3312.get(var7).method_28022() && var5.nextFloat() < 0.2F) {
               Direction var8 = Direction.method_1040(Math.floorMod(var7 + var17, 4));
               float var9 = 0.3125F;
               double var10 = (double)var4.getX()
                  + 0.5
                  - (double)((float)var8.method_1041() * 0.3125F)
                  + (double)((float)var8.method_1042().method_1041() * 0.3125F);
               double var12 = (double)var4.getY() + 0.5;
               double var14 = (double)var4.getZ()
                  + 0.5
                  - (double)((float)var8.method_1034() * 0.3125F)
                  + (double)((float)var8.method_1042().method_1034() * 0.3125F);

               for (int var16 = 0; var16 < 4; var16++) {
                  var3.method_43361(class_3090.field_15376, var10, var12, var14, 0.0, 5.0E-4, 0.0);
               }
            }
         }
      }
   }

   public class_2831<ItemStack> method_2670() {
      return this.field_3312;
   }

   @Override
   public void method_17394(class_2522 var1, CompoundNBT var2) {
      super.method_17394(var1, var2);
      this.field_3312.clear();
      class_3037.method_13882(var2, this.field_3312);
      if (var2.contains("CookingTimes", 11)) {
         int[] var5 = var2.method_25922("CookingTimes");
         System.arraycopy(var5, 0, this.field_3311, 0, Math.min(this.field_3310.length, var5.length));
      }

      if (var2.contains("CookingTotalTimes", 11)) {
         int[] var6 = var2.method_25922("CookingTotalTimes");
         System.arraycopy(var6, 0, this.field_3310, 0, Math.min(this.field_3310.length, var6.length));
      }
   }

   @Override
   public CompoundNBT method_17396(CompoundNBT var1) {
      this.method_2673(var1);
      var1.method_25969("CookingTimes", this.field_3311);
      var1.method_25969("CookingTotalTimes", this.field_3310);
      return var1;
   }

   private CompoundNBT method_2673(CompoundNBT var1) {
      super.method_17396(var1);
      class_3037.method_13879(var1, this.field_3312, true);
      return var1;
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 13, this.method_17414());
   }

   @Override
   public CompoundNBT method_17414() {
      return this.method_2673(new CompoundNBT());
   }

   public Optional<class_5917> method_2672(ItemStack var1) {
      return !this.field_3312.stream().noneMatch(ItemStack::method_28022)
         ? this.field_18364.method_29549().<class_6867, class_5917>method_23138(class_1510.field_7996, new class_4657(var1), this.field_18364)
         : Optional.<class_5917>empty();
   }

   public boolean method_2675(ItemStack var1, int var2) {
      for (int var5 = 0; var5 < this.field_3312.size(); var5++) {
         ItemStack var6 = this.field_3312.get(var5);
         if (var6.method_28022()) {
            this.field_3310[var5] = var2;
            this.field_3311[var5] = 0;
            this.field_3312.set(var5, var1.method_27953(1));
            this.method_2669();
            return true;
         }
      }

      return false;
   }

   private void method_2669() {
      this.method_17407();
      this.method_17402().method_29572(this.method_17399(), this.method_17403(), this.method_17403(), 3);
   }

   @Override
   public void method_24975() {
      this.field_3312.clear();
   }

   public void method_2674() {
      if (this.field_18364 != null) {
         if (!this.field_18364.field_33055) {
            class_1573.method_7101(this.field_18364, this.method_17399(), this.method_2670());
         }

         this.method_2669();
      }
   }
}
