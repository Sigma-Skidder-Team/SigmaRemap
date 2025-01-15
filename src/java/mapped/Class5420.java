// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2LongMap$Entry;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;

public class Class5420 extends Class5419<Class787>
{
    private static String[] field22596;
    private final Class8912 field22597;
    private final Class8233<Class363> field22598;
    private final boolean field22599;
    private long field22600;
    private final Long2LongMap field22601;
    private int field22602;
    
    public Class5420(final Class8912 field22597, final Class8233<Class363> field22598, final boolean field22599) {
        super((Map)ImmutableMap.of((Object)field22598, (Object)Class1952.field10629));
        this.field22601 = (Long2LongMap)new Long2LongOpenHashMap();
        this.field22597 = field22597;
        this.field22598 = field22598;
        this.field22599 = field22599;
    }
    
    public boolean method16553(final Class1849 class1849, final Class787 class1850) {
        return (!this.field22599 || !class1850.method2625()) && class1849.method6754() - this.field22600 >= 20L;
    }
    
    public void method16554(final Class1849 class1849, final Class787 class1850, final long n) {
        this.field22602 = 0;
        this.field22600 = class1849.method6754() + class1849.method6790().nextInt(20);
        final Class1883 method6921 = class1849.method6921();
        final Class9468 method6922 = class1850.method4150().method24720(method6921.method7203(this.field22597.method31396(), class1851 -> {
            class1851.method1132();
            final long n2;
            if (!this.field22601.containsKey(n2)) {
                if (++this.field22602 < 5) {
                    this.field22601.put(n2, this.field22600 + 40L);
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }, new Class354(class1850), 48, Class2045.field11650), this.field22597.method31397());
        if (method6922 != null && method6922.method35228()) {
            method6921.method7210(method6922.method35232()).ifPresent(p4 -> {
                class1852.method7206(this.field22597.method31396(), class1857 -> class1857.equals(class1856), class1853, 1);
                class1854.method2618().method1196(this.field22598, Class363.method1167(class1855.method6789().method20487(), class1853));
                Class9324.method34534(class1855, class1853);
            });
        }
        else if (this.field22602 < 5) {
            this.field22601.long2LongEntrySet().removeIf(long2LongMap$Entry -> long2LongMap$Entry.getLongValue() < this.field22600);
        }
    }
}
