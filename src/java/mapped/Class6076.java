package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;

public class Class6076 extends Class6069 {
   private static final String[] field27316 = new String[]{"all", "undead", "arthropods"};
   private static final int[] field27317 = new int[]{1, 5, 5};
   private static final int[] field27318 = new int[]{11, 8, 8};
   private static final int[] field27319 = new int[]{20, 20, 20};
   public final int field27320;

   public Class6076(Class1937 var1, int var2, EquipmentSlotType... var3) {
      super(var1, Class2242.field14675, var3);
      this.field27320 = var2;
   }

   @Override
   public int method18807(int var1) {
      return field27317[this.field27320] + (var1 - 1) * field27318[this.field27320];
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + field27319[this.field27320];
   }

   @Override
   public int method18809() {
      return 5;
   }

   @Override
   public float method18815(int var1, CreatureAttribute var2) {
      if (this.field27320 != 0) {
         if (this.field27320 == 1 && var2 == CreatureAttribute.field33506) {
            return (float)var1 * 2.5F;
         } else {
            return this.field27320 == 2 && var2 == CreatureAttribute.field33507 ? (float)var1 * 2.5F : 0.0F;
         }
      } else {
         return 1.0F + (float)Math.max(0, var1 - 1) * 0.5F;
      }
   }

   @Override
   public boolean method18817(Class6069 var1) {
      return !(var1 instanceof Class6076);
   }

   @Override
   public boolean method18821(ItemStack var1) {
      return !(var1.getItem() instanceof Class3265) ? super.method18821(var1) : true;
   }

   @Override
   public void method18822(LivingEntity var1, Entity var2, int var3) {
      if (var2 instanceof LivingEntity) {
         LivingEntity var6 = (LivingEntity)var2;
         if (this.field27320 == 2 && var6.getCreatureAttribute() == CreatureAttribute.field33507) {
            int var7 = 20 + var1.getRNG().nextInt(10 * var3);
            var6.addPotionEffect(new EffectInstance(Effects.SLOWNESS, var7, 3));
         }
      }
   }
}
