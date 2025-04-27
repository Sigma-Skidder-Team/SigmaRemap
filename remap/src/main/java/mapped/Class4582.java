// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;

public abstract class Class4582<C extends Class5113> extends Class4574<C>
{
    public Class4582(final Function<Dynamic<?>, ? extends C> function) {
        super(function);
    }
    
    @Override
    public ChunkPos method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        final int method13603 = this.method13603(class6346);
        final int method13604 = this.method13604(class6346);
        final int n5 = n + method13603 * n3;
        final int n6 = n2 + method13603 * n4;
        final int n7 = (n5 >= 0) ? n5 : (n5 - method13603 + 1);
        final int n8 = (n6 >= 0) ? n6 : (n6 - method13603 + 1);
        final int n9 = n7 / method13603;
        final int n10 = n8 / method13603;
        ((Class2317)random).method9441(class6346.method18880(), n9, n10, this.method13605());
        return new ChunkPos(n9 * method13603 + random.nextInt(method13603 - method13604), n10 * method13603 + random.nextInt(method13603 - method13604));
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Biome class5509) {
        final ChunkPos method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        if (n == method13593.field32290) {
            if (n2 == method13593.field32291) {
                return class5508.method18877(class5509, this);
            }
        }
        return false;
    }
    
    public int method13603(final Class6346<?> class6346) {
        return class6346.method18876().method21572();
    }
    
    public int method13604(final Class6346<?> class6346) {
        return class6346.method18876().method21573();
    }
    
    public abstract int method13605();
}
