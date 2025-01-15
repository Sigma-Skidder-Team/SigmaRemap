package net.optifine;

import java.util.Arrays;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ItemOverrideProperty
{
    private ResourceLocation location;
    private float[] values;

    public ItemOverrideProperty(ResourceLocation location, float[] values)
    {
        this.location = location;
        this.values = (float[])values.clone();
        Arrays.sort(this.values);
    }

    public Integer getValueIndex(ItemStack stack, World world, LivingEntity entity)
    {
        Item item = stack.getItem();
        IItemPropertyGetter iitempropertygetter = item.getPropertyGetter(this.location);

        if (iitempropertygetter == null)
        {
            return null;
        }
        else
        {
            float f = iitempropertygetter.call(stack, world, entity);
            int i = Arrays.binarySearch(this.values, f);
            return i;
        }
    }

    public ResourceLocation getLocation()
    {
        return this.location;
    }

    public float[] getValues()
    {
        return this.values;
    }

    public String toString()
    {
        return "location: " + this.location + ", values: [" + Config.arrayToString(this.values) + "]";
    }
}
