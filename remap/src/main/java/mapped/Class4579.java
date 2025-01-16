// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.ChunkPos;

import java.util.function.Function;
import java.util.List;

public class Class4579 extends Class4574<Class5122>
{
    private static final List<Class6828> field20069;
    
    public Class4579(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public ChunkPos method13593(final Class6346<?> class6346, final Random random, final int n, final int n2, final int n3, final int n4) {
        final int method21567 = class6346.method18876().method21567();
        final int method21568 = class6346.method18876().method21568();
        final int n5 = n + method21567 * n3;
        final int n6 = n2 + method21567 * n4;
        final int n7 = (n5 >= 0) ? n5 : (n5 - method21567 + 1);
        final int n8 = (n6 >= 0) ? n6 : (n6 - method21567 + 1);
        final int n9 = n7 / method21567;
        final int n10 = n8 / method21567;
        ((Class2317)random).method9441(class6346.method18880(), n9, n10, 10387313);
        return new ChunkPos(n9 * method21567 + (random.nextInt(method21567 - method21568) + random.nextInt(method21567 - method21568)) / 2, n10 * method21567 + (random.nextInt(method21567 - method21568) + random.nextInt(method21567 - method21568)) / 2);
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        final ChunkPos method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        if (n == method13593.field32290 && n2 == method13593.field32291) {
            final Iterator<Class3090> iterator = class5508.method18879().method7118(n * 16 + 9, class5508.method18853(), n2 * 16 + 9, 16).iterator();
            while (iterator.hasNext()) {
                if (class5508.method18877(iterator.next(), this)) {
                    continue;
                }
                return false;
            }
            for (final Class3090 class5510 : class5508.method18879().method7118(n * 16 + 9, class5508.method18853(), n2 * 16 + 9, 29)) {
                if (class5510.method9870() != Class2140.field12596 && class5510.method9870() != Class2140.field12598) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5945::new;
    }
    
    @Override
    public String method13596() {
        return "Monument";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
    
    @Override
    public List<Class6828> method13530() {
        return Class4579.field20069;
    }
    
    static {
        field20069 = Lists.newArrayList((Object[])new Class6828[] { new Class6828(EntityType.field28988, 1, 2, 4) });
    }
}
