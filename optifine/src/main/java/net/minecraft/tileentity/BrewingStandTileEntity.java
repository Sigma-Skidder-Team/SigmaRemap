package net.minecraft.tileentity;

import java.util.Arrays;
import javax.annotation.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.BrewingStandBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.BrewingStandContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.PotionBrewing;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BrewingStandTileEntity extends LockableTileEntity implements ISidedInventory, ITickableTileEntity
{
    private static final int[] SLOTS_FOR_UP = new int[] {3};
    private static final int[] SLOTS_FOR_DOWN = new int[] {0, 1, 2, 3};
    private static final int[] OUTPUT_SLOTS = new int[] {0, 1, 2, 4};
    private NonNullList<ItemStack> brewingItemStacks = NonNullList.withSize(5, ItemStack.EMPTY);
    private int brewTime;
    private boolean[] filledSlots;
    private Item ingredientID;
    private int fuel;
    protected final IIntArray field_213954_a = new IIntArray()
    {
        public int get(int index)
        {
            switch (index)
            {
                case 0:
                    return BrewingStandTileEntity.this.brewTime;

                case 1:
                    return BrewingStandTileEntity.this.fuel;

                default:
                    return 0;
            }
        }
        public void set(int index, int value)
        {
            switch (index)
            {
                case 0:
                    BrewingStandTileEntity.this.brewTime = value;
                    break;

                case 1:
                    BrewingStandTileEntity.this.fuel = value;
            }
        }
        public int size()
        {
            return 2;
        }
    };

    public BrewingStandTileEntity()
    {
        super(TileEntityType.BREWING_STAND);
    }

    protected ITextComponent getDefaultName()
    {
        return new TranslationTextComponent("container.brewing");
    }

    public int getSizeInventory()
    {
        return this.brewingItemStacks.size();
    }

    public boolean isEmpty()
    {
        for (ItemStack itemstack : this.brewingItemStacks)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public void tick()
    {
        ItemStack itemstack = this.brewingItemStacks.get(4);

        if (this.fuel <= 0 && itemstack.getItem() == Items.BLAZE_POWDER)
        {
            this.fuel = 20;
            itemstack.shrink(1);
            this.markDirty();
        }

        boolean flag = this.canBrew();
        boolean flag1 = this.brewTime > 0;
        ItemStack itemstack1 = this.brewingItemStacks.get(3);

        if (flag1)
        {
            --this.brewTime;
            boolean flag2 = this.brewTime == 0;

            if (flag2 && flag)
            {
                this.brewPotions();
                this.markDirty();
            }
            else if (!flag)
            {
                this.brewTime = 0;
                this.markDirty();
            }
            else if (this.ingredientID != itemstack1.getItem())
            {
                this.brewTime = 0;
                this.markDirty();
            }
        }
        else if (flag && this.fuel > 0)
        {
            --this.fuel;
            this.brewTime = 400;
            this.ingredientID = itemstack1.getItem();
            this.markDirty();
        }

        if (!this.world.isRemote)
        {
            boolean[] aboolean = this.createFilledSlotsArray();

            if (!Arrays.equals(aboolean, this.filledSlots))
            {
                this.filledSlots = aboolean;
                BlockState blockstate = this.world.getBlockState(this.getPos());

                if (!(blockstate.getBlock() instanceof BrewingStandBlock))
                {
                    return;
                }

                for (int i = 0; i < BrewingStandBlock.HAS_BOTTLE.length; ++i)
                {
                    blockstate = blockstate.with(BrewingStandBlock.HAS_BOTTLE[i], Boolean.valueOf(aboolean[i]));
                }

                this.world.setBlockState(this.pos, blockstate, 2);
            }
        }
    }

    public boolean[] createFilledSlotsArray()
    {
        boolean[] aboolean = new boolean[3];

        for (int i = 0; i < 3; ++i)
        {
            if (!this.brewingItemStacks.get(i).isEmpty())
            {
                aboolean[i] = true;
            }
        }

        return aboolean;
    }

    private boolean canBrew()
    {
        ItemStack itemstack = this.brewingItemStacks.get(3);

        if (itemstack.isEmpty())
        {
            return false;
        }
        else if (!PotionBrewing.isReagent(itemstack))
        {
            return false;
        }
        else
        {
            for (int i = 0; i < 3; ++i)
            {
                ItemStack itemstack1 = this.brewingItemStacks.get(i);

                if (!itemstack1.isEmpty() && PotionBrewing.hasConversions(itemstack1, itemstack))
                {
                    return true;
                }
            }

            return false;
        }
    }

    private void brewPotions()
    {
        ItemStack itemstack = this.brewingItemStacks.get(3);

        for (int i = 0; i < 3; ++i)
        {
            this.brewingItemStacks.set(i, PotionBrewing.doReaction(itemstack, this.brewingItemStacks.get(i)));
        }

        itemstack.shrink(1);
        BlockPos blockpos = this.getPos();

        if (itemstack.getItem().hasContainerItem())
        {
            ItemStack itemstack1 = new ItemStack(itemstack.getItem().getContainerItem());

            if (itemstack.isEmpty())
            {
                itemstack = itemstack1;
            }
            else if (!this.world.isRemote)
            {
                InventoryHelper.spawnItemStack(this.world, (double)blockpos.getX(), (double)blockpos.getY(), (double)blockpos.getZ(), itemstack1);
            }
        }

        this.brewingItemStacks.set(3, itemstack);
        this.world.playEvent(1035, blockpos, 0);
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);
        this.brewingItemStacks = NonNullList.withSize(this.getSizeInventory(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(compound, this.brewingItemStacks);
        this.brewTime = compound.getShort("BrewTime");
        this.fuel = compound.getByte("Fuel");
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);
        compound.putShort("BrewTime", (short)this.brewTime);
        ItemStackHelper.saveAllItems(compound, this.brewingItemStacks);
        compound.putByte("Fuel", (byte)this.fuel);
        return compound;
    }

    public ItemStack getStackInSlot(int index)
    {
        return index >= 0 && index < this.brewingItemStacks.size() ? this.brewingItemStacks.get(index) : ItemStack.EMPTY;
    }

    public ItemStack decrStackSize(int index, int count)
    {
        return ItemStackHelper.getAndSplit(this.brewingItemStacks, index, count);
    }

    public ItemStack removeStackFromSlot(int index)
    {
        return ItemStackHelper.getAndRemove(this.brewingItemStacks, index);
    }

    public void setInventorySlotContents(int index, ItemStack stack)
    {
        if (index >= 0 && index < this.brewingItemStacks.size())
        {
            this.brewingItemStacks.set(index, stack);
        }
    }

    public boolean isUsableByPlayer(PlayerEntity player)
    {
        if (this.world.getTileEntity(this.pos) != this)
        {
            return false;
        }
        else
        {
            return !(player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) > 64.0D);
        }
    }

    public boolean isItemValidForSlot(int index, ItemStack stack)
    {
        if (index == 3)
        {
            return PotionBrewing.isReagent(stack);
        }
        else
        {
            Item item = stack.getItem();

            if (index == 4)
            {
                return item == Items.BLAZE_POWDER;
            }
            else
            {
                return (item == Items.POTION || item == Items.SPLASH_POTION || item == Items.LINGERING_POTION || item == Items.GLASS_BOTTLE) && this.getStackInSlot(index).isEmpty();
            }
        }
    }

    public int[] getSlotsForFace(Direction side)
    {
        if (side == Direction.UP)
        {
            return SLOTS_FOR_UP;
        }
        else
        {
            return side == Direction.DOWN ? SLOTS_FOR_DOWN : OUTPUT_SLOTS;
        }
    }

    public boolean canInsertItem(int index, ItemStack itemStackIn, @Nullable Direction direction)
    {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    public boolean canExtractItem(int index, ItemStack stack, Direction direction)
    {
        if (index == 3)
        {
            return stack.getItem() == Items.GLASS_BOTTLE;
        }
        else
        {
            return true;
        }
    }

    public void clear()
    {
        this.brewingItemStacks.clear();
    }

    protected Container createMenu(int id, PlayerInventory player)
    {
        return new BrewingStandContainer(id, player, this, this.field_213954_a);
    }
}
