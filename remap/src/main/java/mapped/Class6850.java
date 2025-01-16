// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2LongMap$Entry;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import net.minecraft.util.math.BlockPos;

public class Class6850 extends Class6851<Class759>
{
    private static String[] field26874;
    private final Long2LongMap field26875;
    private int field26876;
    private long field26877;
    
    public Class6850() {
        super(20);
        this.field26875 = (Long2LongMap)new Long2LongOpenHashMap();
    }
    
    @Override
    public Set<Class8233<?>> method20953() {
        return (Set<Class8233<?>>)ImmutableSet.of((Object)Class8233.field33816);
    }
    
    public void method20954(final Class1849 class1849, final Class759 class1850) {
        if (class1850.method2625()) {
            this.field26876 = 0;
            this.field26877 = class1849.method6754() + class1849.method6790().nextInt(20);
            final Class1883 method6921 = class1849.method6921();
            final Class9468 method6922 = class1850.method4150().method24720(method6921.method7203(Class8912.field37476.method31396(), class1851 -> {
                class1851.toLong();
                final long n;
                if (!this.field26875.containsKey(n)) {
                    if (++this.field26876 < 5) {
                        this.field26875.put(n, this.field26877 + 40L);
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }, new BlockPos(class1850), 48, Class2045.field11652), Class8912.field37476.method31397());
            if (method6922 != null && method6922.method35228()) {
                final BlockPos method6923 = method6922.method35232();
                if (method6921.method7210(method6923).isPresent()) {
                    class1850.method2618().method1196(Class8233.field33816, method6923);
                }
            }
            else if (this.field26876 < 5) {
                this.field26875.long2LongEntrySet().removeIf(long2LongMap$Entry -> long2LongMap$Entry.getLongValue() < this.field26877);
            }
        }
    }
}
