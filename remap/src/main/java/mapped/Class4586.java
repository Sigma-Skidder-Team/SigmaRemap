// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;
import java.util.List;

public class Class4586 extends Class4582<Class5122>
{
    private static final List<Class6828> field20073;
    
    public Class4586(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    @Override
    public String method13596() {
        return "Pillager_Outpost";
    }
    
    @Override
    public int method13597() {
        return 3;
    }
    
    @Override
    public List<Class6828> method13530() {
        return Class4586.field20073;
    }
    
    @Override
    public boolean method13594(final Class5507 class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        final Class7859 method13593 = this.method13593(class5508, random, n, n2, 0, 0);
        if (n == method13593.field32290) {
            if (n2 == method13593.field32291) {
                random.setSeed((long)(n >> 4 ^ n2 >> 4 << 4) ^ class5508.method18880());
                random.nextInt();
                if (random.nextInt(5) != 0) {
                    return false;
                }
                if (class5508.method18877(class5509, this)) {
                    for (int i = n - 10; i <= n + 10; ++i) {
                        for (int j = n2 - 10; j <= n2 + 10; ++j) {
                            if (Class4535.field19972.method13594(class5507, class5508, random, i, j, class5507.method16810(new BlockPos((i << 4) + 9, 0, (j << 4) + 9)))) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public Class6378 method13595() {
        return Class5939::new;
    }
    
    @Override
    public int method13605() {
        return 165745296;
    }
    
    static {
        field20073 = Lists.newArrayList((Object[])new Class6828[] { new Class6828(Class7499.field29045, 1, 1, 1) });
    }
}
