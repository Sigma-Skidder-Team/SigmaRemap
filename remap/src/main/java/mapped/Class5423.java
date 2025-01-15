// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.List;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5423 extends Class5419<Class787>
{
    private static String[] field22608;
    private final float field22609;
    
    public Class5423(final float field22609) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629));
        this.field22609 = field22609;
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        return !class1849.method6994(new BlockPos(class1850));
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        final BlockPos class1851 = new BlockPos(class1850);
        final List<? super Object> list = BlockPos.getAllInBox(class1851.add(-1, -1, -1), class1851.add(1, 1, 1)).map((Function<? super BlockPos, ?>) BlockPos::toImmutable).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        Collections.shuffle(list);
        list.stream().filter(class1853 -> !class1852.method6994(class1853)).filter(class1856 -> class1854.method6732(class1856, class1855)).filter(p2 -> class1857.method6977(class1858)).findFirst().ifPresent(class1860 -> class1859.method2618().method1196(Class8233.field33809, new Class6949(class1860, this.field22609, 0)));
    }
}
