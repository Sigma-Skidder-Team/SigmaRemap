// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Class4057 extends Item
{
    public Class4057(final Properties properties) {
        super(properties);
    }
    
    @Override
    public void addInformation(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final ITooltipFlag class8323) {
        final CompoundNBT method27660 = class8321.method27660("Explosion");
        if (method27660 != null) {
            method12262(method27660, list);
        }
    }
    
    public static void method12262(final CompoundNBT class51, final List<ITextComponent> list) {
        list.add(new Class2259("item.minecraft.firework_star.shape." + Class2141.method8302(class51.getByte("Type")).method8301()).applyTextStyle(TextFormatting.GRAY));
        final int[] method325 = class51.getIntArray("Colors");
        if (method325.length > 0) {
            list.add(method12263(new StringTextComponent("").applyTextStyle(TextFormatting.GRAY), method325));
        }
        final int[] method326 = class51.getIntArray("FadeColors");
        if (method326.length > 0) {
            list.add(method12263(new Class2259("item.minecraft.firework_star.fade_to").appendText(" ").applyTextStyle(TextFormatting.GRAY), method326));
        }
        if (class51.getBoolean("Trail")) {
            list.add(new Class2259("item.minecraft.firework_star.trail").applyTextStyle(TextFormatting.GRAY));
        }
        if (class51.getBoolean("Flicker")) {
            list.add(new Class2259("item.minecraft.firework_star.flicker").applyTextStyle(TextFormatting.GRAY));
        }
    }
    
    private static ITextComponent method12263(final ITextComponent class2250, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                class2250.appendText(", ");
            }
            class2250.appendSibling(method12264(array[i]));
        }
        return class2250;
    }
    
    private static ITextComponent method12264(final int n) {
        final Class181 method821 = Class181.method821(n);
        return (method821 != null) ? new Class2259("item.minecraft.firework_star." + method821.method814()) : new Class2259("item.minecraft.firework_star.custom_color");
    }
}
