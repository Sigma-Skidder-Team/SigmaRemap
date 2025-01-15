// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class4057 extends Class3820
{
    public Class4057(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public void method11728(final ItemStack class8321, final Class1847 class8322, final List<ITextComponent> list, final Class1981 class8323) {
        final Class51 method27660 = class8321.method27660("Explosion");
        if (method27660 != null) {
            method12262(method27660, list);
        }
    }
    
    public static void method12262(final Class51 class51, final List<ITextComponent> list) {
        list.add(new Class2259("item.minecraft.firework_star.shape." + Class2141.method8302(class51.method317("Type")).method8301(), new Object[0]).method8469(Class2116.field12316));
        final int[] method325 = class51.method325("Colors");
        if (method325.length > 0) {
            list.add(method12263(new Class2260("").method8469(Class2116.field12316), method325));
        }
        final int[] method326 = class51.method325("FadeColors");
        if (method326.length > 0) {
            list.add(method12263(new Class2259("item.minecraft.firework_star.fade_to", new Object[0]).method8457(" ").method8469(Class2116.field12316), method326));
        }
        if (class51.method329("Trail")) {
            list.add(new Class2259("item.minecraft.firework_star.trail", new Object[0]).method8469(Class2116.field12316));
        }
        if (class51.method329("Flicker")) {
            list.add(new Class2259("item.minecraft.firework_star.flicker", new Object[0]).method8469(Class2116.field12316));
        }
    }
    
    private static ITextComponent method12263(final ITextComponent class2250, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                class2250.method8457(", ");
            }
            class2250.method8458(method12264(array[i]));
        }
        return class2250;
    }
    
    private static ITextComponent method12264(final int n) {
        final Class181 method821 = Class181.method821(n);
        return (method821 != null) ? new Class2259("item.minecraft.firework_star." + method821.method814(), new Object[0]) : new Class2259("item.minecraft.firework_star.custom_color", new Object[0]);
    }
}
