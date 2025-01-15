package net.minecraft.item;

import com.google.common.collect.Multimap;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EntityPredicates;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ArmorItem extends Item
{
    private static final UUID[] ARMOR_MODIFIERS = new UUID[] {UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};
    public static final IDispenseItemBehavior DISPENSER_BEHAVIOR = new DefaultDispenseItemBehavior()
    {
        protected ItemStack dispenseStack(IBlockSource source, ItemStack stack)
        {
            return ArmorItem.func_226626_a_(source, stack) ? stack : super.dispenseStack(source, stack);
        }
    };
    protected final EquipmentSlotType slot;
    protected final int damageReduceAmount;
    protected final float toughness;
    protected final IArmorMaterial material;

    public static boolean func_226626_a_(IBlockSource p_226626_0_, ItemStack p_226626_1_)
    {
        BlockPos blockpos = p_226626_0_.getBlockPos().offset(p_226626_0_.getBlockState().get(DispenserBlock.FACING));
        List<LivingEntity> list = p_226626_0_.getWorld().getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(blockpos), EntityPredicates.NOT_SPECTATING.and(new EntityPredicates.ArmoredMob(p_226626_1_)));

        if (list.isEmpty())
        {
            return false;
        }
        else
        {
            LivingEntity livingentity = list.get(0);
            EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(p_226626_1_);
            ItemStack itemstack = p_226626_1_.split(1);
            livingentity.setItemStackToSlot(equipmentslottype, itemstack);

            if (livingentity instanceof MobEntity)
            {
                ((MobEntity)livingentity).setDropChance(equipmentslottype, 2.0F);
                ((MobEntity)livingentity).enablePersistence();
            }

            return true;
        }
    }

    public ArmorItem(IArmorMaterial p_i3508_1_, EquipmentSlotType p_i3508_2_, Item.Properties p_i3508_3_)
    {
        super(p_i3508_3_.defaultMaxDamage(p_i3508_1_.getDurability(p_i3508_2_)));
        this.material = p_i3508_1_;
        this.slot = p_i3508_2_;
        this.damageReduceAmount = p_i3508_1_.getDamageReductionAmount(p_i3508_2_);
        this.toughness = p_i3508_1_.getToughness();
        DispenserBlock.registerDispenseBehavior(this, DISPENSER_BEHAVIOR);
    }

    public EquipmentSlotType getEquipmentSlot()
    {
        return this.slot;
    }

    public int getItemEnchantability()
    {
        return this.material.getEnchantability();
    }

    public IArmorMaterial getArmorMaterial()
    {
        return this.material;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return this.material.getRepairMaterial().test(repair) || super.getIsRepairable(toRepair, repair);
    }

    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        EquipmentSlotType equipmentslottype = MobEntity.getSlotForItemStack(itemstack);
        ItemStack itemstack1 = playerIn.getItemStackFromSlot(equipmentslottype);

        if (itemstack1.isEmpty())
        {
            playerIn.setItemStackToSlot(equipmentslottype, itemstack.copy());
            itemstack.setCount(0);
            return ActionResult.resultSuccess(itemstack);
        }
        else
        {
            return ActionResult.resultFail(itemstack);
        }
    }

    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot)
    {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);

        if (equipmentSlot == this.slot)
        {
            multimap.put(SharedMonsterAttributes.ARMOR.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor modifier", (double)this.damageReduceAmount, AttributeModifier.Operation.ADDITION));
            multimap.put(SharedMonsterAttributes.ARMOR_TOUGHNESS.getName(), new AttributeModifier(ARMOR_MODIFIERS[equipmentSlot.getIndex()], "Armor toughness", (double)this.toughness, AttributeModifier.Operation.ADDITION));
        }

        return multimap;
    }

    public int getDamageReduceAmount()
    {
        return this.damageReduceAmount;
    }
}
