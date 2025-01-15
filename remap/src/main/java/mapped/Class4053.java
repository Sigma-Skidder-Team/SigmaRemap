// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.List;

public interface Class4053
{
    default boolean method12251(final ItemStack class8321) {
        final Class51 method27660 = class8321.method27660("display");
        return method27660 != null && method27660.method316("color", 99);
    }
    
    default int method12252(final ItemStack class8321) {
        final Class51 method27660 = class8321.method27660("display");
        return (method27660 != null && method27660.method316("color", 99)) ? method27660.method319("color") : 10511680;
    }
    
    default void method12253(final ItemStack class8321) {
        final Class51 method27660 = class8321.method27660("display");
        if (method27660 != null) {
            if (method27660.method315("color")) {
                method27660.method330("color");
            }
        }
    }
    
    default void method12254(final ItemStack class8321, final int n) {
        class8321.method27659("display").method298("color", n);
    }
    
    default ItemStack method12255(final ItemStack class8321, final List<Class3829> list) {
        ItemStack class8322 = ItemStack.field34174;
        final int[] array = new int[3];
        int n = 0;
        int n2 = 0;
        Class4053 class8323 = null;
        final Item method27622 = class8321.getItem();
        if (method27622 instanceof Class4053) {
            class8323 = (Class4053)method27622;
            class8322 = class8321.method27641();
            class8322.method27691(1);
            if (class8323.method12251(class8321)) {
                final int method27623 = class8323.method12252(class8322);
                final float a = (method27623 >> 16 & 0xFF) / 255.0f;
                final float a2 = (method27623 >> 8 & 0xFF) / 255.0f;
                final float b = (method27623 & 0xFF) / 255.0f;
                n += (int)(Math.max(a, Math.max(a2, b)) * 255.0f);
                array[0] += (int)(a * 255.0f);
                array[1] += (int)(a2 * 255.0f);
                array[2] += (int)(b * 255.0f);
                ++n2;
            }
            final Iterator<Class3829> iterator = list.iterator();
            while (iterator.hasNext()) {
                final float[] method27624 = iterator.next().method11767().method815();
                final int a3 = (int)(method27624[0] * 255.0f);
                final int a4 = (int)(method27624[1] * 255.0f);
                final int b2 = (int)(method27624[2] * 255.0f);
                n += Math.max(a3, Math.max(a4, b2));
                final int[] array2 = array;
                final int n3 = 0;
                array2[n3] += a3;
                final int[] array3 = array;
                final int n4 = 1;
                array3[n4] += a4;
                final int[] array4 = array;
                final int n5 = 2;
                array4[n5] += b2;
                ++n2;
            }
        }
        if (class8323 != null) {
            final int a5 = array[0] / n2;
            final int a6 = array[1] / n2;
            final int b3 = array[2] / n2;
            final float n6 = n / (float)n2;
            final float n7 = (float)Math.max(a5, Math.max(a6, b3));
            class8323.method12254(class8322, (((int)(a5 * n6 / n7) << 8) + (int)(a6 * n6 / n7) << 8) + (int)(b3 * n6 / n7));
            return class8322;
        }
        return ItemStack.field34174;
    }
}
