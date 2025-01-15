package net.minecraft.item;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;

public class DyeItem extends Item
{
    private static final Map<DyeColor, DyeItem> COLOR_DYE_ITEM_MAP = Maps.newEnumMap(DyeColor.class);
    private final DyeColor dyeColor;

    public DyeItem(DyeColor data, Item.Properties p_i1389_2_)
    {
        super(p_i1389_2_);
        this.dyeColor = data;
        COLOR_DYE_ITEM_MAP.put(data, this);
    }

    public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity target, Hand hand)
    {
        if (target instanceof SheepEntity)
        {
            SheepEntity sheepentity = (SheepEntity)target;

            if (sheepentity.isAlive() && !sheepentity.getSheared() && sheepentity.getFleeceColor() != this.dyeColor)
            {
                sheepentity.setFleeceColor(this.dyeColor);
                stack.shrink(1);
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    public DyeColor getDyeColor()
    {
        return this.dyeColor;
    }

    public static DyeItem getItem(DyeColor color)
    {
        return COLOR_DYE_ITEM_MAP.get(color);
    }
}
