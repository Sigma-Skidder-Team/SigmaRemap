// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4573 extends Class4572<Class5144>
{
    public Class4573(final Function<Dynamic<?>, ? extends Class5144> function) {
        super(function);
    }
    
    public boolean method13584(final Class1851 class1851, final Class354 class1852, final Class5144 class1853) {
        return !class1853.field22136.contains(class1851.method6701(class1852));
    }
    
    public int method13585(final Class5144 class5144) {
        return class5144.field22137;
    }
    
    public Class354 method13586(final Random random, final Class354 class354, final Class5144 class355) {
        return class354.method1134(random.nextInt(class355.field22138) - random.nextInt(class355.field22138), random.nextInt(class355.field22139) - random.nextInt(class355.field22139), random.nextInt(class355.field22140) - random.nextInt(class355.field22140));
    }
    
    public Class7096 method13587(final Random random, final Class354 class354, final Class5144 class355) {
        return class355.field22133.method1164(random, class354);
    }
}
