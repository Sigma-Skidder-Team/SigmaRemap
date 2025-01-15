// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import com.google.common.cache.CacheLoader;
import net.minecraft.util.math.MathHelper;

public class Class6048 extends CacheLoader<Long, List<Class9341>>
{
    private static String[] field24600;
    
    private Class6048() {
    }
    
    public List<Class9341> load(final Long n) {
        final List<? super Integer> list = IntStream.range(0, 10).boxed().collect((Collector<? super Integer, ?, List<? super Integer>>)Collectors.toList());
        Collections.shuffle(list, new Random(n));
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < 10; ++i) {
            final int method35644 = MathHelper.floor(42.0 * Math.cos(2.0 * (-3.141592653589793 + 0.3141592653589793 * i)));
            final int method35645 = MathHelper.floor(42.0 * Math.sin(2.0 * (-3.141592653589793 + 0.3141592653589793 * i)));
            final int intValue = list.get(i);
            arrayList.add(new Class9341(method35644, method35645, 2 + intValue / 3, 76 + intValue * 3, intValue == 1 || intValue == 2));
        }
        return arrayList;
    }
}
