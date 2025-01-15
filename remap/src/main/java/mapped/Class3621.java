// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.function.Function;
import java.util.List;

public class Class3621 extends Class3617
{
    private static String[] field16822;
    public final /* synthetic */ Class798 field16823;
    
    private Class3621(final Class798 field16823) {
        this.field16823 = field16823;
        super(field16823, null);
    }
    
    @Override
    public boolean method11137() {
        if (Class798.method4584(this.field16823) == 0) {
            if (!this.field16823.method4523()) {
                if (Class798.method4544(this.field16823)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11138() {
        return false;
    }
    
    @Override
    public void method11015() {
        Class798.method4559(this.field16823, 200);
        final List<BlockPos> method11148 = this.method11148();
        if (!method11148.isEmpty()) {
            for (final BlockPos class354 : method11148) {
                if (Class3620.method11146(Class798.method4585(this.field16823), class354)) {
                    continue;
                }
                Class798.method4546(this.field16823, class354);
                return;
            }
            Class3620.method11147(Class798.method4585(this.field16823));
            Class798.method4546(this.field16823, (BlockPos)method11148.get(0));
        }
    }
    
    private List<BlockPos> method11148() {
        return ((Class1849)this.field16823.world).method6921().method7200(class8912 -> class8912 == Class8912.field37478 || class8912 == Class8912.field37479, new BlockPos(this.field16823), 20, Class2045.field11652).map((Function<? super Class377, ?>)Class377::method1259).filter(class8913 -> Class798.method4586(this.field16823, class8913)).sorted(Comparator.comparingDouble(class8915 -> class8915.method1083(class8914))).collect((Collector<? super Object, ?, List<BlockPos>>)Collectors.toList());
    }
}
