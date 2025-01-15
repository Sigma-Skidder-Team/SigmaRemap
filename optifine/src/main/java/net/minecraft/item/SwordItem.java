package net.minecraft.item;

import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SwordItem extends TieredItem
{
    private final float attackDamage;
    private final float attackSpeed;

    public SwordItem(IItemTier p_i3214_1_, int p_i3214_2_, float p_i3214_3_, Item.Properties p_i3214_4_)
    {
        super(p_i3214_1_, p_i3214_4_);
        this.attackSpeed = p_i3214_3_;
        this.attackDamage = (float)p_i3214_2_ + p_i3214_1_.getAttackDamage();
    }

    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player)
    {
        return !player.isCreative();
    }

    public float getDestroySpeed(ItemStack stack, BlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.COBWEB)
        {
            return 15.0F;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.TALL_PLANTS && material != Material.CORAL && !state.isIn(BlockTags.LEAVES) && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
    {
        stack.damageItem(1, attacker, (p_220045_0_) ->
        {
            p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
    {
        if (state.getBlockHardness(worldIn, pos) != 0.0F)
        {
            stack.damageItem(2, entityLiving, (p_220044_0_) ->
            {
                p_220044_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }

        return true;
    }

    public boolean canHarvestBlock(BlockState blockIn)
    {
        return blockIn.getBlock() == Blocks.COBWEB;
    }

    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);

        if (equipmentSlot == EquipmentSlotType.MAINHAND)
        {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", (double)this.attackDamage, AttributeModifier.Operation.ADDITION));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", (double)this.attackSpeed, AttributeModifier.Operation.ADDITION));
        }

        return multimap;
    }
}
