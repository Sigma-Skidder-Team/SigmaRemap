package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.block.AbstractBannerBlock;
import net.minecraft.block.BannerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.INameable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class BannerTileEntity extends TileEntity implements INameable
{
    @Nullable
    private ITextComponent name;
    @Nullable
    private DyeColor baseColor = DyeColor.WHITE;
    @Nullable
    private ListNBT patterns;
    private boolean patternDataSet;
    @Nullable
    private List<Pair<BannerPattern, DyeColor>> patternList;

    public BannerTileEntity()
    {
        super(TileEntityType.BANNER);
    }

    public BannerTileEntity(DyeColor p_i2132_1_)
    {
        this();
        this.baseColor = p_i2132_1_;
    }

    @Nullable
    public static ListNBT func_230139_a_(ItemStack p_230139_0_)
    {
        ListNBT listnbt = null;
        CompoundNBT compoundnbt = p_230139_0_.getChildTag("BlockEntityTag");

        if (compoundnbt != null && compoundnbt.contains("Patterns", 9))
        {
            listnbt = compoundnbt.getList("Patterns", 10).copy();
        }

        return listnbt;
    }

    public void loadFromItemStack(ItemStack p_195534_1_, DyeColor p_195534_2_)
    {
        this.patterns = func_230139_a_(p_195534_1_);
        this.baseColor = p_195534_2_;
        this.patternList = null;
        this.patternDataSet = true;
        this.name = p_195534_1_.hasDisplayName() ? p_195534_1_.getDisplayName() : null;
    }

    public ITextComponent getName()
    {
        return (ITextComponent)(this.name != null ? this.name : new TranslationTextComponent("block.minecraft.banner"));
    }

    @Nullable
    public ITextComponent getCustomName()
    {
        return this.name;
    }

    public void func_213136_a(ITextComponent p_213136_1_)
    {
        this.name = p_213136_1_;
    }

    public CompoundNBT write(CompoundNBT compound)
    {
        super.write(compound);

        if (this.patterns != null)
        {
            compound.put("Patterns", this.patterns);
        }

        if (this.name != null)
        {
            compound.putString("CustomName", ITextComponent.Serializer.toJson(this.name));
        }

        return compound;
    }

    public void read(CompoundNBT compound)
    {
        super.read(compound);

        if (compound.contains("CustomName", 8))
        {
            this.name = ITextComponent.Serializer.fromJson(compound.getString("CustomName"));
        }

        if (this.hasWorld())
        {
            this.baseColor = ((AbstractBannerBlock)this.getBlockState().getBlock()).getColor();
        }
        else
        {
            this.baseColor = null;
        }

        this.patterns = compound.getList("Patterns", 10);
        this.patternList = null;
        this.patternDataSet = true;
    }

    @Nullable
    public SUpdateTileEntityPacket getUpdatePacket()
    {
        return new SUpdateTileEntityPacket(this.pos, 6, this.getUpdateTag());
    }

    public CompoundNBT getUpdateTag()
    {
        return this.write(new CompoundNBT());
    }

    public static int getPatterns(ItemStack stack)
    {
        CompoundNBT compoundnbt = stack.getChildTag("BlockEntityTag");
        return compoundnbt != null && compoundnbt.contains("Patterns") ? compoundnbt.getList("Patterns", 10).size() : 0;
    }

    public List<Pair<BannerPattern, DyeColor>> getPatternList()
    {
        if (this.patternList == null && this.patternDataSet)
        {
            this.patternList = func_230138_a_(this.getBaseColor(this::getBlockState), this.patterns);
        }

        return this.patternList;
    }

    public static List<Pair<BannerPattern, DyeColor>> func_230138_a_(DyeColor p_230138_0_, @Nullable ListNBT p_230138_1_)
    {
        List<Pair<BannerPattern, DyeColor>> list = Lists.newArrayList();
        list.add(Pair.of(BannerPattern.BASE, p_230138_0_));

        if (p_230138_1_ != null)
        {
            for (int i = 0; i < p_230138_1_.size(); ++i)
            {
                CompoundNBT compoundnbt = p_230138_1_.getCompound(i);
                BannerPattern bannerpattern = BannerPattern.byHash(compoundnbt.getString("Pattern"));

                if (bannerpattern != null)
                {
                    int j = compoundnbt.getInt("Color");
                    list.add(Pair.of(bannerpattern, DyeColor.byId(j)));
                }
            }
        }

        return list;
    }

    public static void removeBannerData(ItemStack stack)
    {
        CompoundNBT compoundnbt = stack.getChildTag("BlockEntityTag");

        if (compoundnbt != null && compoundnbt.contains("Patterns", 9))
        {
            ListNBT listnbt = compoundnbt.getList("Patterns", 10);

            if (!listnbt.isEmpty())
            {
                listnbt.remove(listnbt.size() - 1);

                if (listnbt.isEmpty())
                {
                    stack.removeChildTag("BlockEntityTag");
                }
            }
        }
    }

    public ItemStack getItem(BlockState p_190615_1_)
    {
        ItemStack itemstack = new ItemStack(BannerBlock.forColor(this.getBaseColor(() ->
        {
            return p_190615_1_;
        })));

        if (this.patterns != null && !this.patterns.isEmpty())
        {
            itemstack.getOrCreateChildTag("BlockEntityTag").put("Patterns", this.patterns.copy());
        }

        if (this.name != null)
        {
            itemstack.setDisplayName(this.name);
        }

        return itemstack;
    }

    public DyeColor getBaseColor(Supplier<BlockState> p_195533_1_)
    {
        if (this.baseColor == null)
        {
            this.baseColor = ((AbstractBannerBlock)p_195533_1_.get().getBlock()).getColor();
        }

        return this.baseColor;
    }
}
