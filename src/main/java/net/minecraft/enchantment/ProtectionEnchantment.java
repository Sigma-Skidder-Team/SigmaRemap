package net.minecraft.enchantment;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;

public class ProtectionEnchantment extends Enchantment {
   private static String[] field27340;
   public final Type field27341;

   public ProtectionEnchantment(Rarity var1, Type var2, EquipmentSlotType... var3) {
      super(var1, var2 != Type.FALL ? EnchantmentType.ARMOR : EnchantmentType.ARMOR_FEET, var3);
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
      } else if (this.field27341 != Type.ALL) {
         if (this.field27341 == Type.FIRE && var2.method31141()) {
            return var1 * 2;
         } else if (this.field27341 == Type.FALL && var2 == DamageSource.field39002) {
            return var1 * 3;
         } else if (this.field27341 == Type.EXPLOSION && var2.method31131()) {
            return var1 * 2;
         } else {
            return this.field27341 == Type.PROJECTILE && var2.method31129() ? var1 * 2 : 0;
         }
      } else {
         return var1;
      }
   }

   @Override
   public boolean method18817(Enchantment var1) {
      if (!(var1 instanceof ProtectionEnchantment)) {
         return super.method18817(var1);
      } else {
         ProtectionEnchantment var4 = (ProtectionEnchantment)var1;
         return this.field27341 == var4.field27341 ? false : this.field27341 == Type.FALL || var4.field27341 == Type.FALL;
      }
   }

   public static int getFireTimeForEntity(LivingEntity var0, int var1) {
      int var4 = EnchantmentHelper.method26322(Enchantments.FIRE_PROTECTION, var0);
      if (var4 > 0) {
         var1 -= MathHelper.floor((float)var1 * (float)var4 * 0.15F);
      }

      return var1;
   }

   public static double method18835(LivingEntity var0, double var1) {
      int var5 = EnchantmentHelper.method26322(Enchantments.BLAST_PROTECTION, var0);
      if (var5 > 0) {
         var1 -= (double) MathHelper.floor(var1 * (double)((float)var5 * 0.15F));
      }

      return var1;
   }

   public enum Type {
      ALL("all", 1, 11),
      FIRE("fire", 10, 8),
      FALL("fall", 5, 6),
      EXPLOSION("explosion", 5, 8),
      PROJECTILE("projectile", 3, 6);

      private final String field12758;
      private final int field12759;
      private final int field12760;
      private static final Type[] field12761 = new Type[]{ALL, FIRE, FALL, EXPLOSION, PROJECTILE};

      private Type(String var3, int var4, int var5) {
         this.field12758 = var3;
         this.field12759 = var4;
         this.field12760 = var5;
      }

      public int method8221() {
         return this.field12759;
      }

      public int method8222() {
         return this.field12760;
      }
   }
}
