package net.minecraft.item;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.tileentity.SkullTileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;

public class SkullItem extends WallOrFloorItem
{
    public SkullItem(Block p_i1731_1_, Block p_i1731_2_, Item.Properties p_i1731_3_)
    {
        super(p_i1731_1_, p_i1731_2_, p_i1731_3_);
    }

    public ITextComponent getDisplayName(ItemStack stack)
    {
        if (stack.getItem() == Items.PLAYER_HEAD && stack.hasTag())
        {
            String s = null;
            CompoundNBT compoundnbt = stack.getTag();

            if (compoundnbt.contains("SkullOwner", 8))
            {
                s = compoundnbt.getString("SkullOwner");
            }
            else if (compoundnbt.contains("SkullOwner", 10))
            {
                CompoundNBT compoundnbt1 = compoundnbt.getCompound("SkullOwner");

                if (compoundnbt1.contains("Name", 8))
                {
                    s = compoundnbt1.getString("Name");
                }
            }

            if (s != null)
            {
                return new TranslationTextComponent(this.getTranslationKey() + ".named", s);
            }
        }

        return super.getDisplayName(stack);
    }

    public boolean updateItemStackNBT(CompoundNBT nbt)
    {
        super.updateItemStackNBT(nbt);

        if (nbt.contains("SkullOwner", 8) && !StringUtils.isBlank(nbt.getString("SkullOwner")))
        {
            GameProfile gameprofile = new GameProfile((UUID)null, nbt.getString("SkullOwner"));
            gameprofile = SkullTileEntity.updateGameProfile(gameprofile);
            nbt.put("SkullOwner", NBTUtil.writeGameProfile(new CompoundNBT(), gameprofile));
            return true;
        }
        else
        {
            return false;
        }
    }
}
