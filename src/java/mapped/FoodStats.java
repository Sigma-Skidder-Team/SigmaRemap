package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameRules;

public class FoodStats {
   private int field45071 = 20;
   private float field45072;
   private float field45073;
   private int field45074;
   private int field45075 = 20;

   public FoodStats() {
      this.field45072 = 5.0F;
   }

   public void method37569(int var1, float var2) {
      this.field45071 = Math.min(var1 + this.field45071, 20);
      this.field45072 = Math.min(this.field45072 + (float)var1 * var2 * 2.0F, (float)this.field45071);
   }

   public void method37570(Item var1, ItemStack var2) {
      if (var1.isFood()) {
         Class9427 var5 = var1.method11745();
         this.method37569(var5.method36157(), var5.method36158());
      }
   }

   public void method37571(PlayerEntity var1) {
      Difficulty var4 = var1.world.method6997();
      this.field45075 = this.field45071;
      if (this.field45073 > 4.0F) {
         this.field45073 -= 4.0F;
         if (!(this.field45072 > 0.0F)) {
            if (var4 != Difficulty.PEACEFUL) {
               this.field45071 = Math.max(this.field45071 - 1, 0);
            }
         } else {
            this.field45072 = Math.max(this.field45072 - 1.0F, 0.0F);
         }
      }

      boolean var5 = var1.world.getGameRules().getBoolean(GameRules.field24231);
      if (var5 && this.field45072 > 0.0F && var1.method2934() && this.field45071 >= 20) {
         this.field45074++;
         if (this.field45074 >= 10) {
            float var6 = Math.min(this.field45072, 6.0F);
            var1.heal(var6 / 6.0F);
            this.method37576(var6);
            this.field45074 = 0;
         }
      } else if (var5 && this.field45071 >= 18 && var1.method2934()) {
         this.field45074++;
         if (this.field45074 >= 80) {
            var1.heal(1.0F);
            this.method37576(6.0F);
            this.field45074 = 0;
         }
      } else if (this.field45071 > 0) {
         this.field45074 = 0;
      } else {
         this.field45074++;
         if (this.field45074 >= 80) {
            if (var1.getHealth() > 10.0F || var4 == Difficulty.HARD || var1.getHealth() > 1.0F && var4 == Difficulty.NORMAL) {
               var1.attackEntityFrom(DamageSource.field39000, 1.0F);
            }

            this.field45074 = 0;
         }
      }
   }

   public void method37572(CompoundNBT var1) {
      if (var1.contains("foodLevel", 99)) {
         this.field45071 = var1.getInt("foodLevel");
         this.field45074 = var1.getInt("foodTickTimer");
         this.field45072 = var1.getFloat("foodSaturationLevel");
         this.field45073 = var1.getFloat("foodExhaustionLevel");
      }
   }

   public void method37573(CompoundNBT var1) {
      var1.putInt("foodLevel", this.field45071);
      var1.putInt("foodTickTimer", this.field45074);
      var1.putFloat("foodSaturationLevel", this.field45072);
      var1.putFloat("foodExhaustionLevel", this.field45073);
   }

   public int getFoodLevel() {
      return this.field45071;
   }

   public boolean method37575() {
      return this.field45071 < 20;
   }

   public void method37576(float var1) {
      this.field45073 = Math.min(this.field45073 + var1, 40.0F);
   }

   public float method37577() {
      return this.field45072;
   }

   public void method37578(int var1) {
      this.field45071 = var1;
   }

   public void method37579(float var1) {
      this.field45072 = var1;
   }
}
