package net.minecraft.item;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.math.MathHelper;

public class MerchantOffer
{
    private final ItemStack buyingStackFirst;
    private final ItemStack buyingStackSecond;
    private final ItemStack sellingStack;
    private int uses;
    private final int maxUses;
    private boolean doesRewardEXP = true;
    private int specialPrice;
    private int demand;
    private float priceMultiplier;
    private int givenEXP = 1;

    public MerchantOffer(CompoundNBT p_i338_1_)
    {
        this.buyingStackFirst = ItemStack.read(p_i338_1_.getCompound("buy"));
        this.buyingStackSecond = ItemStack.read(p_i338_1_.getCompound("buyB"));
        this.sellingStack = ItemStack.read(p_i338_1_.getCompound("sell"));
        this.uses = p_i338_1_.getInt("uses");

        if (p_i338_1_.contains("maxUses", 99))
        {
            this.maxUses = p_i338_1_.getInt("maxUses");
        }
        else
        {
            this.maxUses = 4;
        }

        if (p_i338_1_.contains("rewardExp", 1))
        {
            this.doesRewardEXP = p_i338_1_.getBoolean("rewardExp");
        }

        if (p_i338_1_.contains("xp", 3))
        {
            this.givenEXP = p_i338_1_.getInt("xp");
        }

        if (p_i338_1_.contains("priceMultiplier", 5))
        {
            this.priceMultiplier = p_i338_1_.getFloat("priceMultiplier");
        }

        this.specialPrice = p_i338_1_.getInt("specialPrice");
        this.demand = p_i338_1_.getInt("demand");
    }

    public MerchantOffer(ItemStack p_i339_1_, ItemStack p_i339_2_, int p_i339_3_, int p_i339_4_, float p_i339_5_)
    {
        this(p_i339_1_, ItemStack.EMPTY, p_i339_2_, p_i339_3_, p_i339_4_, p_i339_5_);
    }

    public MerchantOffer(ItemStack p_i340_1_, ItemStack p_i340_2_, ItemStack p_i340_3_, int p_i340_4_, int p_i340_5_, float p_i340_6_)
    {
        this(p_i340_1_, p_i340_2_, p_i340_3_, 0, p_i340_4_, p_i340_5_, p_i340_6_);
    }

    public MerchantOffer(ItemStack p_i341_1_, ItemStack p_i341_2_, ItemStack p_i341_3_, int p_i341_4_, int p_i341_5_, int p_i341_6_, float p_i341_7_)
    {
        this(p_i341_1_, p_i341_2_, p_i341_3_, p_i341_4_, p_i341_5_, p_i341_6_, p_i341_7_, 0);
    }

    public MerchantOffer(ItemStack p_i342_1_, ItemStack p_i342_2_, ItemStack p_i342_3_, int p_i342_4_, int p_i342_5_, int p_i342_6_, float p_i342_7_, int p_i342_8_)
    {
        this.buyingStackFirst = p_i342_1_;
        this.buyingStackSecond = p_i342_2_;
        this.sellingStack = p_i342_3_;
        this.uses = p_i342_4_;
        this.maxUses = p_i342_5_;
        this.givenEXP = p_i342_6_;
        this.priceMultiplier = p_i342_7_;
        this.demand = p_i342_8_;
    }

    public ItemStack getBuyingStackFirst()
    {
        return this.buyingStackFirst;
    }

    public ItemStack func_222205_b()
    {
        int i = this.buyingStackFirst.getCount();
        ItemStack itemstack = this.buyingStackFirst.copy();
        int j = Math.max(0, MathHelper.floor((float)(i * this.demand) * this.priceMultiplier));
        itemstack.setCount(MathHelper.clamp(i + j + this.specialPrice, 1, this.buyingStackFirst.getItem().getMaxStackSize()));
        return itemstack;
    }

    public ItemStack getBuyingStackSecond()
    {
        return this.buyingStackSecond;
    }

    public ItemStack getSellingStack()
    {
        return this.sellingStack;
    }

    public void calculateDemand()
    {
        this.demand = this.demand + this.uses - (this.maxUses - this.uses);
    }

    public ItemStack getCopyOfSellingStack()
    {
        return this.sellingStack.copy();
    }

    public int getUses()
    {
        return this.uses;
    }

    public void resetUses()
    {
        this.uses = 0;
    }

    public int func_222214_i()
    {
        return this.maxUses;
    }

    public void increaseUses()
    {
        ++this.uses;
    }

    public int func_225482_k()
    {
        return this.demand;
    }

    public void increaseSpecialPrice(int add)
    {
        this.specialPrice += add;
    }

    public void resetSpecialPrice()
    {
        this.specialPrice = 0;
    }

    public int getSpecialPrice()
    {
        return this.specialPrice;
    }

    public void setSpecialPrice(int price)
    {
        this.specialPrice = price;
    }

    public float getPriceMultiplier()
    {
        return this.priceMultiplier;
    }

    public int getGivenExp()
    {
        return this.givenEXP;
    }

    public boolean hasNoUsesLeft()
    {
        return this.uses >= this.maxUses;
    }

    public void getMaxUses()
    {
        this.uses = this.maxUses;
    }

    public boolean func_226654_r_()
    {
        return this.uses > 0;
    }

    public boolean getDoesRewardExp()
    {
        return this.doesRewardEXP;
    }

    public CompoundNBT write()
    {
        CompoundNBT compoundnbt = new CompoundNBT();
        compoundnbt.put("buy", this.buyingStackFirst.write(new CompoundNBT()));
        compoundnbt.put("sell", this.sellingStack.write(new CompoundNBT()));
        compoundnbt.put("buyB", this.buyingStackSecond.write(new CompoundNBT()));
        compoundnbt.putInt("uses", this.uses);
        compoundnbt.putInt("maxUses", this.maxUses);
        compoundnbt.putBoolean("rewardExp", this.doesRewardEXP);
        compoundnbt.putInt("xp", this.givenEXP);
        compoundnbt.putFloat("priceMultiplier", this.priceMultiplier);
        compoundnbt.putInt("specialPrice", this.specialPrice);
        compoundnbt.putInt("demand", this.demand);
        return compoundnbt;
    }

    public boolean matches(ItemStack p_222204_1_, ItemStack p_222204_2_)
    {
        return this.equalIgnoringDamage(p_222204_1_, this.func_222205_b()) && p_222204_1_.getCount() >= this.func_222205_b().getCount() && this.equalIgnoringDamage(p_222204_2_, this.buyingStackSecond) && p_222204_2_.getCount() >= this.buyingStackSecond.getCount();
    }

    private boolean equalIgnoringDamage(ItemStack left, ItemStack right)
    {
        if (right.isEmpty() && left.isEmpty())
        {
            return true;
        }
        else
        {
            ItemStack itemstack = left.copy();

            if (itemstack.getItem().isDamageable())
            {
                itemstack.setDamage(itemstack.getDamage());
            }

            return ItemStack.areItemsEqual(itemstack, right) && (!right.hasTag() || itemstack.hasTag() && NBTUtil.areNBTEquals(right.getTag(), itemstack.getTag(), false));
        }
    }

    public boolean doTransaction(ItemStack p_222215_1_, ItemStack p_222215_2_)
    {
        if (!this.matches(p_222215_1_, p_222215_2_))
        {
            return false;
        }
        else
        {
            p_222215_1_.shrink(this.func_222205_b().getCount());

            if (!this.getBuyingStackSecond().isEmpty())
            {
                p_222215_2_.shrink(this.getBuyingStackSecond().getCount());
            }

            return true;
        }
    }
}
