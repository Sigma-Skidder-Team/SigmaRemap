package net.minecraft.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SwordItem extends TieredItem implements IVanishable {
   private final float attackDamage;
   private final Multimap<Attribute, AttributeModifier> attributeModifiers;

   public SwordItem(IItemTier var1, int var2, float var3, Properties var4) {
      super(var1, var4);
      this.attackDamage = (float)var2 + var1.getAttackDamage();
      Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
      builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
      builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)var3, AttributeModifier.Operation.ADDITION));
      this.attributeModifiers = builder.build();
   }

   public float getAttackDamage() {
      return this.attackDamage;
   }

   @Override
   public boolean canPlayerBreakBlockWhileHolding(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      return !var4.isCreative();
   }

   @Override
   public float getDestroySpeed(ItemStack var1, BlockState state) {
      if (state.isIn(Blocks.COBWEB)) {
         return 15.0F;
      } else {
         Material material = state.getMaterial();
         return material != Material.PLANTS
               && material != Material.TALL_PLANTS
               && material != Material.CORAL
               && !state.isIn(BlockTags.LEAVES)
               && material != Material.GOURD
            ? 1.0F
            : 1.5F;
      }
   }

   @Override
   public boolean hitEntity(ItemStack var1, LivingEntity var2, LivingEntity var3) {
      var1.damageItem(1, var3, var0 -> var0.sendBreakAnimation(EquipmentSlotType.MAINHAND));
      return true;
   }

   @Override
   public boolean onBlockDestroyed(ItemStack var1, World var2, BlockState var3, BlockPos var4, LivingEntity var5) {
      if (var3.getBlockHardness(var2, var4) != 0.0F) {
         var1.damageItem(2, var5, var0 -> var0.sendBreakAnimation(EquipmentSlotType.MAINHAND));
      }

      return true;
   }

   @Override
   public boolean canHarvestBlock(BlockState var1) {
      return var1.isIn(Blocks.COBWEB);
   }

   @Override
   public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlotType var1) {
      return var1 != EquipmentSlotType.MAINHAND ? super.getAttributeModifiers(var1) : this.attributeModifiers;
   }
}
