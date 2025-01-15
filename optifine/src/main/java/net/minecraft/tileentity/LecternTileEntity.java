package net.minecraft.tileentity;

import javax.annotation.Nullable;
import net.minecraft.block.LecternBlock;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IClearable;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.LecternContainer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.WrittenBookItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.IIntArray;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class LecternTileEntity extends TileEntity implements IClearable, INamedContainerProvider
{
    private final IInventory field_214048_a = new IInventory()
    {
        public int getSizeInventory()
        {
            return 1;
        }
        public boolean isEmpty()
        {
            return LecternTileEntity.this.book.isEmpty();
        }
        public ItemStack getStackInSlot(int index)
        {
            return index == 0 ? LecternTileEntity.this.book : ItemStack.EMPTY;
        }
        public ItemStack decrStackSize(int index, int count)
        {
            if (index == 0)
            {
                ItemStack itemstack = LecternTileEntity.this.book.split(count);

                if (LecternTileEntity.this.book.isEmpty())
                {
                    LecternTileEntity.this.bookRemoved();
                }

                return itemstack;
            }
            else
            {
                return ItemStack.EMPTY;
            }
        }
        public ItemStack removeStackFromSlot(int index)
        {
            if (index == 0)
            {
                ItemStack itemstack = LecternTileEntity.this.book;
                LecternTileEntity.this.book = ItemStack.EMPTY;
                LecternTileEntity.this.bookRemoved();
                return itemstack;
            }
            else
            {
                return ItemStack.EMPTY;
            }
        }
        public void setInventorySlotContents(int index, ItemStack stack)
        {
        }
        public int getInventoryStackLimit()
        {
            return 1;
        }
        public void markDirty()
        {
            LecternTileEntity.this.markDirty();
        }
        public boolean isUsableByPlayer(PlayerEntity player)
        {
            if (LecternTileEntity.this.world.getTileEntity(LecternTileEntity.this.pos) != LecternTileEntity.this)
            {
                return false;
            }
            else
            {
                return player.getDistanceSq((double)LecternTileEntity.this.pos.getX() + 0.5D, (double)LecternTileEntity.this.pos.getY() + 0.5D, (double)LecternTileEntity.this.pos.getZ() + 0.5D) > 64.0D ? false : LecternTileEntity.this.hasBook();
            }
        }
        public boolean isItemValidForSlot(int index, ItemStack stack)
        {
            return false;
        }
        public void clear()
        {
        }
    };
    private final IIntArray field_214049_b = new IIntArray()
    {
        public int get(int index)
        {
            return index == 0 ? LecternTileEntity.this.page : 0;
        }
        public void set(int index, int value)
        {
            if (index == 0)
            {
                LecternTileEntity.this.setPage(value);
            }
        }
        public int size()
        {
            return 1;
        }
    };
    private ItemStack book = ItemStack.EMPTY;
    private int page;
    private int pages;

    public LecternTileEntity()
    {
        super(TileEntityType.LECTERN);
    }

    public ItemStack getBook()
    {
        return this.book;
    }

    public boolean hasBook()
    {
        Item item = this.book.getItem();
        return item == Items.WRITABLE_BOOK || item == Items.WRITTEN_BOOK;
    }

    public void setBook(ItemStack stack)
    {
        this.setBook(stack, (PlayerEntity)null);
    }

    private void bookRemoved()
    {
        this.page = 0;
        this.pages = 0;
        LecternBlock.setHasBook(this.getWorld(), this.getPos(), this.getBlockState(), false);
    }

    public void setBook(ItemStack stack, @Nullable PlayerEntity player)
    {
        this.book = this.ensureResolved(stack, player);
        this.page = 0;
        this.pages = WrittenBookItem.func_220049_j(this.book);
        this.markDirty();
    }

    private void setPage(int pageIn)
    {
        int i = MathHelper.clamp(pageIn, 0, this.pages - 1);

        if (i != this.page)
        {
            this.page = i;
            this.markDirty();
            LecternBlock.pulse(this.getWorld(), this.getPos(), this.getBlockState());
        }
    }

    public int getPage()
    {
        return this.page;
    }

    public int getComparatorSignalLevel()
    {
        float f = this.pages > 1 ? (float)this.getPage() / ((float)this.pages - 1.0F) : 1.0F;
        return MathHelper.floor(f * 14.0F) + (this.hasBook() ? 1 : 0);
    }

    private ItemStack ensureResolved(ItemStack stack, @Nullable PlayerEntity player)
    {
        if (this.world instanceof ServerWorld && stack.getItem() == Items.WRITTEN_BOOK)
        {
            WrittenBookItem.resolveContents(stack, this.createCommandSource(player), player);
        }

        return stack;
    }

    private CommandSource createCommandSource(@Nullable PlayerEntity player)
    {
        String s;
        ITextComponent itextcomponent;

        if (player == null)
        {
            s = "Lectern";
            itextcomponent = new StringTextComponent("Lectern");
        }
        else
        {
            s = player.getName().getString();
            itextcomponent = player.getDisplayName();
        }

        Vec3d vec3d = new Vec3d((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D);
        return new CommandSource(ICommandSource.DUMMY, vec3d, Vec2f.ZERO, (ServerWorld)this.world, 2, s, itextcomponent, this.world.getServer(), player);
    }

    public boolean onlyOpsCanSetNbt()
    {
        return true;
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);

        if (compound.contains("Book", 10))
        {
            this.book = this.ensureResolved(ItemStack.read(compound.getCompound("Book")), (PlayerEntity)null);
        }
        else
        {
            this.book = ItemStack.EMPTY;
        }

        this.pages = WrittenBookItem.func_220049_j(this.book);
        this.page = MathHelper.clamp(compound.getInt("Page"), 0, this.pages - 1);
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);

        if (!this.getBook().isEmpty())
        {
            compound.put("Book", this.getBook().write(new CompoundNBT()));
            compound.putInt("Page", this.page);
        }

        return compound;
    }

    public void clear()
    {
        this.setBook(ItemStack.EMPTY);
    }

    public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_)
    {
        return new LecternContainer(p_createMenu_1_, this.field_214048_a, this.field_214049_b);
    }

    public ITextComponent getDisplayName()
    {
        return new TranslationTextComponent("container.lectern");
    }
}
