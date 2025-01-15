package net.minecraft.entity.item.minecart;

import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootParameterSets;
import net.minecraft.world.storage.loot.LootParameters;
import net.minecraft.world.storage.loot.LootTable;

public abstract class ContainerMinecartEntity extends AbstractMinecartEntity implements IInventory, INamedContainerProvider
{
    private NonNullList<ItemStack> minecartContainerItems = NonNullList.withSize(36, ItemStack.EMPTY);
    private boolean dropContentsWhenDead = true;
    @Nullable
    private ResourceLocation lootTable;
    private long lootTableSeed;

    protected ContainerMinecartEntity(EntityType<?> p_i1920_1_, World p_i1920_2_)
    {
        super(p_i1920_1_, p_i1920_2_);
    }

    protected ContainerMinecartEntity(EntityType<?> p_i1921_1_, double p_i1921_2_, double p_i1921_4_, double p_i1921_6_, World p_i1921_8_)
    {
        super(p_i1921_1_, p_i1921_8_, p_i1921_2_, p_i1921_4_, p_i1921_6_);
    }

    public void killMinecart(DamageSource source)
    {
        super.killMinecart(source);

        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS))
        {
            InventoryHelper.dropInventoryItems(this.world, this, this);
        }
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.minecartContainerItems)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public ItemStack getStackInSlot(int index)
    {
        this.addLoot((PlayerEntity)null);
        return this.minecartContainerItems.get(index);
    }

    public ItemStack decrStackSize(int index, int count)
    {
        this.addLoot((PlayerEntity)null);
        return ItemStackHelper.getAndSplit(this.minecartContainerItems, index, count);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        this.addLoot((PlayerEntity)null);
        ItemStack itemstack = this.minecartContainerItems.get(index);

        if (itemstack.isEmpty())
        {
            return ItemStack.EMPTY;
        }
        else
        {
            this.minecartContainerItems.set(index, ItemStack.EMPTY);
            return itemstack;
        }
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        this.addLoot((PlayerEntity)null);
        this.minecartContainerItems.set(index, stack);

        if (!stack.isEmpty() && stack.getCount() > this.getInventoryStackLimit())
        {
            stack.setCount(this.getInventoryStackLimit());
        }
    }

    public boolean replaceItemInInventory(int inventorySlot, ItemStack itemStackIn)
    {
        if (inventorySlot >= 0 && inventorySlot < this.getSizeInventory())
        {
            this.setInventorySlotContents(inventorySlot, itemStackIn);
            return true;
        }
        else
        {
            return false;
        }
    }

    public void markDirty()
    {
    }

    public boolean isUsableByPlayer(PlayerEntity player)
    {
        if (this.removed)
        {
            return false;
        }
        else
        {
            return !(player.getDistanceSq(this) > 64.0D);
        }
    }

    @Nullable
    public Entity changeDimension(DimensionType destination)
    {
        this.dropContentsWhenDead = false;
        return super.changeDimension(destination);
    }

    public void remove()
    {
        if (!this.world.isRemote && this.dropContentsWhenDead)
        {
            InventoryHelper.dropInventoryItems(this.world, this, this);
        }

        super.remove();
    }

    protected void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);

        if (this.lootTable != null)
        {
            compound.putString("LootTable", this.lootTable.toString());

            if (this.lootTableSeed != 0L)
            {
                compound.putLong("LootTableSeed", this.lootTableSeed);
            }
        }
        else
        {
            ItemStackHelper.saveAllItems(compound, this.minecartContainerItems);
        }
    }

    protected void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.minecartContainerItems = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);

        if (compound.contains("LootTable", 8))
        {
            this.lootTable = new ResourceLocation(compound.getString("LootTable"));
            this.lootTableSeed = compound.getLong("LootTableSeed");
        }
        else
        {
            ItemStackHelper.loadAllItems(compound, this.minecartContainerItems);
        }
    }

    public boolean processInitialInteract(PlayerEntity player, Hand hand)
    {
        player.openContainer(this);
        return true;
    }

    protected void applyDrag()
    {
        float f = 0.98F;

        if (this.lootTable == null)
        {
            int i = 15 - Container.calcRedstoneFromInventory(this);
            f += (float)i * 0.001F;
        }

        this.setMotion(this.getMotion().mul((double)f, 0.0D, (double)f));
    }

    public void addLoot(@Nullable PlayerEntity player)
    {
        if (this.lootTable != null && this.world.getServer() != null)
        {
            LootTable loottable = this.world.getServer().getLootTableManager().getLootTableFromLocation(this.lootTable);
            this.lootTable = null;
            LootContext.Builder lootcontext$builder = (new LootContext.Builder((ServerWorld)this.world)).withParameter(LootParameters.POSITION, new BlockPos(this)).withSeed(this.lootTableSeed);

            if (player != null)
            {
                lootcontext$builder.withLuck(player.getLuck()).withParameter(LootParameters.THIS_ENTITY, player);
            }

            loottable.fillInventory(this, lootcontext$builder.build(LootParameterSets.CHEST));
        }
    }

    public void clear()
    {
        this.addLoot((PlayerEntity)null);
        this.minecartContainerItems.clear();
    }

    public void setLootTable(ResourceLocation lootTableIn, long lootTableSeedIn)
    {
        this.lootTable = lootTableIn;
        this.lootTableSeed = lootTableSeedIn;
    }

    @Nullable
    public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_)
    {
        if (this.lootTable != null && p_createMenu_3_.isSpectator())
        {
            return null;
        }
        else
        {
            this.addLoot(p_createMenu_2_.player);
            return this.createContainer(p_createMenu_1_, p_createMenu_2_);
        }
    }

    protected abstract Container createContainer(int id, PlayerInventory playerInventoryIn);
}
