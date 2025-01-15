// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import javax.annotation.Nullable;
import java.util.Random;
import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;
import net.minecraft.world.World;

import java.util.function.Function;
import java.util.List;

public class Class4575 extends Class4574<Class5122>
{
    private boolean field20065;
    private Class7859[] field20066;
    private final List<Class5936> field20067;
    private long field20068;
    
    public Class4575(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
        this.field20067 = Lists.newArrayList();
    }
    
    @Override
    public boolean method13594(final BiomeManager class5507, final Class6346<?> class5508, final Random random, final int n, final int n2, final Class3090 class5509) {
        if (this.field20068 != class5508.method18880()) {
            this.method13598();
        }
        if (!this.field20065) {
            this.method13599(class5508);
            this.field20065 = true;
        }
        for (final Class7859 class5510 : this.field20066) {
            if (n == class5510.field32290 && n2 == class5510.field32291) {
                return true;
            }
        }
        return false;
    }
    
    private void method13598() {
        this.field20065 = false;
        this.field20066 = null;
        this.field20067.clear();
    }
    
    @Override
    public Class6378 method13595() {
        return Class5935::new;
    }
    
    @Override
    public String method13596() {
        return "Stronghold";
    }
    
    @Override
    public int method13597() {
        return 8;
    }
    
    @Nullable
    @Override
    public BlockPos method13591(final World class1847, final Class6346<? extends Class7065> class1848, final BlockPos class1849, final int n, final boolean b) {
        if (class1848.method18879().method7121(this)) {
            if (this.field20068 != class1847.method6753()) {
                this.method13598();
            }
            if (!this.field20065) {
                this.method13599(class1848);
                this.field20065 = true;
            }
            BlockPos class1850 = null;
            final Mutable class1851 = new Mutable();
            double n2 = Double.MAX_VALUE;
            for (final Class7859 class1852 : this.field20066) {
                class1851.setPos((class1852.field32290 << 4) + 8, 32, (class1852.field32291 << 4) + 8);
                final double method1083 = class1851.distanceSq(class1849);
                if (class1850 != null) {
                    if (method1083 < n2) {
                        class1850 = new BlockPos(class1851);
                        n2 = method1083;
                    }
                }
                else {
                    class1850 = new BlockPos(class1851);
                    n2 = method1083;
                }
            }
            return class1850;
        }
        return null;
    }
    
    private void method13599(final Class6346<?> class6346) {
        this.field20068 = class6346.method18880();
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class3090 class6347 : Class90.field217) {
            if (class6347 == null) {
                continue;
            }
            if (!class6346.method18877(class6347, this)) {
                continue;
            }
            arrayList.add(class6347);
        }
        final int method21569 = class6346.method18876().method21569();
        final int method21570 = class6346.method18876().method21570();
        int n = class6346.method18876().method21571();
        this.field20066 = new Class7859[method21570];
        int n2 = 0;
        for (final Class5936 class6348 : this.field20067) {
            if (n2 >= this.field20066.length) {
                continue;
            }
            this.field20066[n2++] = new Class7859(class6348.method17859(), class6348.method17860());
        }
        final Random random = new Random();
        random.setSeed(class6346.method18880());
        double n3 = random.nextDouble() * 3.141592653589793 * 2.0;
        final int n4;
        if ((n4 = n2) < this.field20066.length) {
            int n5 = 0;
            int n6 = 0;
            for (int i = 0; i < this.field20066.length; ++i) {
                final double n7 = 4 * method21569 + method21569 * n6 * 6 + (random.nextDouble() - 0.5) * method21569 * 2.5;
                int n8 = (int)Math.round(Math.cos(n3) * n7);
                int n9 = (int)Math.round(Math.sin(n3) * n7);
                final BlockPos method21571 = class6346.method18879().method7119((n8 << 4) + 8, class6346.method18853(), (n9 << 4) + 8, 112, arrayList, random);
                if (method21571 != null) {
                    n8 = method21571.getX() >> 4;
                    n9 = method21571.getZ() >> 4;
                }
                if (i >= n4) {
                    this.field20066[i] = new Class7859(n8, n9);
                }
                n3 += 6.283185307179586 / n;
                if (++n5 == n) {
                    ++n6;
                    n5 = 0;
                    n = Math.min(n + 2 * n / (n6 + 1), this.field20066.length - i);
                    n3 += random.nextDouble() * 3.141592653589793 * 2.0;
                }
            }
        }
    }
}
