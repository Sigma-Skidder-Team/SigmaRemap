// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4576 extends Class4574<Class5136>
{
    public Class4576(final Function<Dynamic<?>, ? extends Class5136> function) {
        super(function);
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        if (!class5508.method18877(class5509, this)) {
            return false;
        }
        ((Class2317)random).method9441(class5508.method18880(), n, n2, 10387320);
        return random.nextFloat() < class5508.method18878(class5509, this).field22115;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5937::new;
    }
    
    @Override
    public String method13596() {
        return "Buried_Treasure";
    }
    
    @Override
    public int method13597() {
        return 1;
    }
}
