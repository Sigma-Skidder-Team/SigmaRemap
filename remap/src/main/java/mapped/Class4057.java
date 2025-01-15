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
    public Class4057(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public void method11728(final ItemStack class8321, final World class8322, final List<ITextComponent> list, final Class1981 class8323) {
        final Class51 method27660 = class8321.method27660("Explosion");
        if (method27660 != null) {
            method12262(method27660, list);
        }
    }
    
    public static void method12262(final Class51 class51, final List<ITextComponent> list) {
        list.add(new Class2259("item.minecraft.firework_star.shape." + Class2141.method8302(class51.method317("Type")).method8301(), new Object[0]).applyTextStyle(TextFormatting.GRAY));
        final int[] method325 = class51.method325("Colors");
        if (method325.length > 0) {
            list.add(method12263(new StringTextComponent("").applyTextStyle(TextFormatting.GRAY), method325));
        }
        final int[] method326 = class51.method325("FadeColors");
        if (method326.length > 0) {
            list.add(method12263(new Class2259("item.minecraft.firework_star.fade_to", new Object[0]).appendText(" ").applyTextStyle(TextFormatting.GRAY), method326));
        }
        if (class51.method329("Trail")) {
            list.add(new Class2259("item.minecraft.firework_star.trail", new Object[0]).applyTextStyle(TextFormatting.GRAY));
        }
        if (class51.method329("Flicker")) {
            list.add(new Class2259("item.minecraft.firework_star.flicker", new Object[0]).applyTextStyle(TextFormatting.GRAY));
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
        return (method821 != null) ? new Class2259("item.minecraft.firework_star." + method821.method814(), new Object[0]) : new Class2259("item.minecraft.firework_star.custom_color", new Object[0]);
    }
}
