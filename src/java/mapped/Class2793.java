package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;

public class Class2793<T extends ZombieEntity> extends Class2794<T> {
   private static String[] field17428;

   public Class2793(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.field17435 = new Class7219(this, 32, 48);
      this.field17435.method22675(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17435.method22679(-5.0F, 2.0F + var2, 0.0F);
      this.field17437 = new Class7219(this, 16, 48);
      this.field17437.method22675(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field17437.method22679(-1.9F, 12.0F + var2, 0.0F);
   }

   public Class2793(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      this.field17440 = Class2278.field14836;
      this.field17439 = Class2278.field14836;
      ItemStack var7 = var1.getHeldItem(Hand.MAIN_HAND);
      if (var7.getItem() == Items.field38144 && var1.method4307()) {
         if (var1.getPrimaryHand() != HandSide.field14418) {
            this.field17439 = Class2278.field14840;
         } else {
            this.field17440 = Class2278.field14840;
         }
      }

      super.method10997((T)var1, var2, var3, var4);
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method10998((T)var1, var2, var3, var4, var5, var6);
      if (this.field17439 == Class2278.field14840) {
         this.field17436.field31035 = this.field17436.field31035 * 0.5F - (float) Math.PI;
         this.field17436.field31036 = 0.0F;
      }

      if (this.field17440 == Class2278.field14840) {
         this.field17435.field31035 = this.field17435.field31035 * 0.5F - (float) Math.PI;
         this.field17435.field31036 = 0.0F;
      }

      if (this.field17442 > 0.0F) {
         this.field17435.field31035 = this.method11006(this.field17442, this.field17435.field31035, (float) (-Math.PI * 4.0 / 5.0))
            + this.field17442 * 0.35F * MathHelper.sin(0.1F * var4);
         this.field17436.field31035 = this.method11006(this.field17442, this.field17436.field31035, (float) (-Math.PI * 4.0 / 5.0))
            - this.field17442 * 0.35F * MathHelper.sin(0.1F * var4);
         this.field17435.field31037 = this.method11006(this.field17442, this.field17435.field31037, -0.15F);
         this.field17436.field31037 = this.method11006(this.field17442, this.field17436.field31037, 0.15F);
         this.field17438.field31035 = this.field17438.field31035 - this.field17442 * 0.55F * MathHelper.sin(0.1F * var4);
         this.field17437.field31035 = this.field17437.field31035 + this.field17442 * 0.55F * MathHelper.sin(0.1F * var4);
         this.field17432.field31035 = 0.0F;
      }
   }
}
