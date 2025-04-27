// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;

public class Class4578 extends Class4574<Class5122>
{
    public Class4578(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public ChunkPos method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        final int method21578 = class6346.method18876().method21578();
        final int method21579 = class6346.method18876().method21579();
        final int n5 = n + method21578 * n3;
        final int n6 = n2 + method21578 * n4;
        final int n7 = (n5 >= 0) ? n5 : (n5 - method21578 + 1);
        final int n8 = (n6 >= 0) ? n6 : (n6 - method21578 + 1);
        final int n9 = n7 / method21578;
        final int n10 = n8 / method21578;
        ((Class2317)random).method9441(class6346.method18880(), n9, n10, 10387313);
        return new ChunkPos(n9 * method21578 + (random.nextInt(method21578 - method21579) + random.nextInt(method21578 - method21579)) / 2, n10 * method21578 + (random.nextInt(method21578 - method21579) + random.nextInt(method21578 - method21579)) / 2);
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Biome class5509) {
        final ChunkPos method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        return n == method13593.field32290 && n2 == method13593.field32291 && class5508.method18877(class5509, this) && method13601(n, n2, class5508) >= 60;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5943::new;
    }
    
    @Override
    public String method13596() {
        return "EndCity";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
    
    private static int method13601(final int n, final int n2, final Class6346<?> class6346) {
        final Class2052 class6347 = Class2052.values()[new Random(n + n2 * 10387313L).nextInt(Class2052.values().length)];
        int n3 = 5;
        int n4 = 5;
        if (class6347 != Class2052.field11708) {
            if (class6347 != Class2052.field11709) {
                if (class6347 == Class2052.field11710) {
                    n4 = -5;
                }
            }
            else {
                n3 = -5;
                n4 = -5;
            }
        }
        else {
            n3 = -5;
        }
        final int n5 = (n << 4) + 7;
        final int n6 = (n2 << 4) + 7;
        return Math.min(Math.min(class6346.method18884(n5, n6, HeightmapType.field11521), class6346.method18884(n5, n6 + n4, HeightmapType.field11521)), Math.min(class6346.method18884(n5 + n3, n6, HeightmapType.field11521), class6346.method18884(n5 + n3, n6 + n4, HeightmapType.field11521)));
    }
}
