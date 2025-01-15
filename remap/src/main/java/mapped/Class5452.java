// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.longs.Long2LongMap$Entry;
import java.util.Optional;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import net.minecraft.entity.LivingEntity;

public class Class5452 extends Class5419<LivingEntity>
{
    private static String[] field22684;
    private final float field22685;
    private final Long2LongMap field22686;
    private int field22687;
    private long field22688;
    
    public Class5452(final float field22685) {
        super((Map)ImmutableMap.of((Object)Class8233.field33809, (Object)Class1952.field10629, (Object)Class8233.field33800, (Object)Class1952.field10629));
        this.field22686 = (Long2LongMap)new Long2LongOpenHashMap();
        this.field22685 = field22685;
    }
    
    @Override
    public boolean method16538(final Class1849 class1849, final LivingEntity class1850) {
        if (class1849.method6754() - this.field22688 >= 20L) {
            final Class787 class1851 = (Class787)class1850;
            final Optional<BlockPos> method7205 = class1849.method6921().method7205(Class8912.field37476.method31396(), p0 -> true, new BlockPos(class1850), 48, Class2045.field11652);
            return method7205.isPresent() && method7205.get().distanceSq(new BlockPos(class1851)) > 4.0;
        }
        return false;
    }
    
    @Override
    public void method16539(final Class1849 class1849, final LivingEntity class1850, final long n) {
        this.field22687 = 0;
        this.field22688 = class1849.method6754() + class1849.method6790().nextInt(20);
        final Class787 class1851 = (Class787)class1850;
        final Class1883 method6921 = class1849.method6921();
        final Class9468 method6922 = class1851.method4150().method24720(method6921.method7203(Class8912.field37476.method31396(), class1852 -> {
            class1852.toLong();
            final long n2;
            if (!this.field22686.containsKey(n2)) {
                if (++this.field22687 < 5) {
                    this.field22686.put(n2, this.field22688 + 40L);
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
                class1850.method2618().method1196(Class8233.field33809, new Class6949(method6923, this.field22685, 1));
                Class9324.method34534(class1849, method6923);
            }
        }
        else if (this.field22687 < 5) {
            this.field22686.long2LongEntrySet().removeIf(long2LongMap$Entry -> long2LongMap$Entry.getLongValue() < this.field22688);
        }
    }
}
