// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;

public class Class4577 extends Class4574<Class5122>
{
    public Class4577(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public ChunkPos method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        final int method21580 = class6346.method18876().method21580();
        final int method21581 = class6346.method18876().method21581();
        final int n5 = n + method21580 * n3;
        final int n6 = n2 + method21580 * n4;
        final int n7 = (n5 >= 0) ? n5 : (n5 - method21580 + 1);
        final int n8 = (n6 >= 0) ? n6 : (n6 - method21580 + 1);
        final int n9 = n7 / method21580;
        final int n10 = n8 / method21580;
        ((Class2317)random).method9441(class6346.method18880(), n9, n10, 10387319);
        return new ChunkPos(n9 * method21580 + (random.nextInt(method21580 - method21581) + random.nextInt(method21580 - method21581)) / 2, n10 * method21580 + (random.nextInt(method21580 - method21581) + random.nextInt(method21580 - method21581)) / 2);
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        final ChunkPos method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        if (n == method13593.field32290 && n2 == method13593.field32291) {
            final Iterator<Class3090> iterator = class5508.method18879().method7118(n * 16 + 9, class5508.method18853(), n2 * 16 + 9, 32).iterator();
            while (iterator.hasNext()) {
                if (class5508.method18877(iterator.next(), this)) {
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5942::new;
    }
    
    @Override
    public String method13596() {
        return "Mansion";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
}
