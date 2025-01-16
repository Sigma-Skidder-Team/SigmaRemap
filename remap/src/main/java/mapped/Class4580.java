// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;

public class Class4580 extends Class4574<Class5115>
{
    public Class4580(final Function<Dynamic<?>, ? extends Class5115> function) {
        super(function);
    }
    
    @Override
    public ChunkPos method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        final int method21565 = class6346.method18876().method21565();
        final int method21566 = class6346.method18876().method21566();
        final int n5 = n + method21565 * n3;
        final int n6 = n2 + method21565 * n4;
        final int n7 = (n5 >= 0) ? n5 : (n5 - method21565 + 1);
        final int n8 = (n6 >= 0) ? n6 : (n6 - method21565 + 1);
        final int n9 = n7 / method21565;
        final int n10 = n8 / method21565;
        ((Class2317)random).method9441(class6346.method18880(), n9, n10, 10387312);
        return new ChunkPos(n9 * method21565 + random.nextInt(method21565 - method21566), n10 * method21565 + random.nextInt(method21565 - method21566));
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        final ChunkPos method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        return n == method13593.field32290 && n2 == method13593.field32291 && class5508.method18877(class5509, this);
    }
    
    @Override
    public Class6378 method13595() {
        return Class5940::new;
    }
    
    @Override
    public String method13596() {
        return "Village";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
}
