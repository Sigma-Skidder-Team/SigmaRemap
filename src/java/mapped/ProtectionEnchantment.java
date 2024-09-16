package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;

public class ProtectionEnchantment extends Class6069 {
   private static String[] field27340;
   public final Class1957 field27341;

   public ProtectionEnchantment(Class1937 var1, Class1957 var2, EquipmentSlotType... var3) {
      super(var1, var2 != Class1957.field12755 ? Class2242.field14670 : Class2242.field14671, var3);
      this.field27341 = var2;
   }

   @Override
   public int method18807(int var1) {
      return this.field27341.method8221() + (var1 - 1) * this.field27341.method8222();
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + this.field27341.method8222();
   }

   @Override
   public int method18809() {
      return 4;
   }

   @Override
   public int method18814(int var1, DamageSource var2) {
      if (var2.method31135()) {
         return 0;
      } else if (this.field27341 != Class1957.field12753) {
         if (this.field27341 == Class1957.field12754 && var2.method31141()) {
            return var1 * 2;
         } else if (this.field27341 == Class1957.field12755 && var2 == DamageSource.field39002) {
            return var1 * 3;
         } else if (this.field27341 == Class1957.field12756 && var2.method31131()) {
            return var1 * 2;
         } else {
            return this.field27341 == Class1957.field12757 && var2.method31129() ? var1 * 2 : 0;
         }
      } else {
         return var1;
      }
   }

   @Override
   public boolean method18817(Class6069 var1) {
      if (!(var1 instanceof ProtectionEnchantment)) {
         return super.method18817(var1);
      } else {
         ProtectionEnchantment var4 = (ProtectionEnchantment)var1;
         return this.field27341 == var4.field27341 ? false : this.field27341 == Class1957.field12755 || var4.field27341 == Class1957.field12755;
      }
   }

   public static int getFireTimeForEntity(LivingEntity var0, int var1) {
      int var4 = EnchantmentHelper.method26322(Class8122.field34897, var0);
      if (var4 > 0) {
         var1 -= MathHelper.method37767((float)var1 * (float)var4 * 0.15F);
      }

      return var1;
   }

   public static double method18835(LivingEntity var0, double var1) {
      int var5 = EnchantmentHelper.method26322(Class8122.field34899, var0);
      if (var5 > 0) {
         var1 -= (double) MathHelper.floor(var1 * (double)((float)var5 * 0.15F));
      }

      return var1;
   }
}
