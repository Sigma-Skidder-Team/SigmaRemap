// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4590 extends Class4574<Class5132>
{
    public Class4590(final Function<Dynamic<?>, ? extends Class5132> function) {
        super(function);
    }
    
    @Override
    public boolean method13594(final Class5507 class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        ((Class2317)random).method9440(class5508.method18880(), n, n2);
        return class5508.method18877(class5509, this) && random.nextDouble() < class5508.method18878(class5509, (Class4574<Class5132>)this).field22105;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5948::new;
    }
    
    @Override
    public String method13596() {
        return "Mineshaft";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
}
