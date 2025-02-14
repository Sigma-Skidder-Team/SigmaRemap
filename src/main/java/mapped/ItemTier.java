package mapped;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;

import java.util.function.Supplier;

public enum ItemTier implements IItemTier {
   WOOD(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
   STONE(1, 131, 4.0F, 1.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
   IRON(2, 250, 6.0F, 2.0F, 14, () -> Ingredient.fromItems(Items.IRON_INGOT)),
   DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> Ingredient.fromItems(Items.DIAMOND)),
   GOLD(0, 32, 12.0F, 0.0F, 22, () -> Ingredient.fromItems(Items.GOLD_INGOT)),
   NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> Ingredient.fromItems(Items.NETHERITE_INGOT));

   private final int harvestLevel;
   private final int maxUses;
   private final float efficiency;
   private final float attackDamage;
   private final int enchantability;
   private final LazyValue<Ingredient> repairMaterial;

   ItemTier(
           int harvestLevelIn, int maxUsesIn,
           float efficiencyIn, float attackDamage,
           int enchantabilityIn, Supplier<Ingredient> repairIngredient) {
      this.harvestLevel = harvestLevelIn;
      this.maxUses = maxUsesIn;
      this.efficiency = efficiencyIn;
      this.attackDamage = attackDamage;
      this.enchantability = enchantabilityIn;
      this.repairMaterial = new LazyValue<>(repairIngredient);
   }

   @Override
   public int method9010() {
      return this.maxUses;
   }

   @Override
   public float getEfficiency() {
      return this.efficiency;
   }

   @Override
   public float getAttackDamage() {
      return this.attackDamage;
   }

   @Override
   public int method9013() {
      return this.harvestLevel;
   }

   @Override
   public int method9014() {
      return this.enchantability;
   }

   @Override
   public Ingredient method9015() {
      return this.repairMaterial.getValue();
   }
}
