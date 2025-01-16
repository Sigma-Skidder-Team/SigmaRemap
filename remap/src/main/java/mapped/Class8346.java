// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;
import java.util.Iterator;

public class Class8346
{
    private static String[] field34256;
    
    public static Iterator<Class8974> method27814(final Class1848 class1848, final double n, final Entity class1849, final int n2, final Class9112 class1850) {
        final float method33913 = Class9216.method33913();
        if (method33913 > 0.0f && method33913 < (n2 - 1) * 16) {
            final int n3 = MathHelper.ceil(method33913 / 16.0f) + 1;
            final float method33914 = class1848.method6713((float)n);
            final float n4 = Class9216.field39375 * MathHelper.field41103;
            final float n5 = (method33914 > MathHelper.field41101 && method33914 < 3.0f * MathHelper.field41101) ? (method33914 + MathHelper.field41099) : method33914;
            final float n6 = -MathHelper.sin(n5);
            final float n7 = MathHelper.cos(n5) * MathHelper.cos(n4);
            final float n8 = -MathHelper.cos(n5) * MathHelper.sin(n4);
            final BlockPos class1851 = new BlockPos(MathHelper.floor(class1849.getPosX()) >> 4, MathHelper.floor(class1849.getPosY()) >> 4, MathHelper.floor(class1849.getPosZ()) >> 4);
            return new Class7246(class1850, class1851.add(-n6 * n3, -n7 * n3, -n8 * n3), class1851.add(n6 * n2, n7 * n2, n8 * n2), n3, n3);
        }
        return Arrays.asList(class1850.field38610).iterator();
    }
}
