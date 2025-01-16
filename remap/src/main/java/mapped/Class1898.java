// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.chunk.IChunkLightProvider;

public class Class1898 extends Class1897<Class7500>
{
    private static String[] field10313;
    private static final Direction[] field10314;
    private final LongSet field10315;
    private final LongSet field10316;
    private final LongSet field10317;
    private final LongSet field10318;
    private volatile boolean field10319;
    
    public Class1898(final IChunkLightProvider class1908) {
        super(Class237.field911, class1908, new Class7500((Long2ObjectOpenHashMap<Class7281>)new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
        this.field10315 = (LongSet)new LongOpenHashSet();
        this.field10316 = (LongSet)new LongOpenHashSet();
        this.field10317 = (LongSet)new LongOpenHashSet();
        this.field10318 = (LongSet)new LongOpenHashSet();
    }
    
    @Override
    public int method7351(long n) {
        long n2 = Class353.method1111(n);
        int method1100 = Class353.method1100(n2);
        final Class7500 class7500 = (Class7500)this.field10305;
        final int value = Class7500.method23391(class7500).get(Class353.method1112(n2));
        if (value != Class7500.method23392(class7500) && method1100 < value) {
            Class7281 class7501 = this.method7349(class7500, n2);
            if (class7501 == null) {
                n = BlockPos.func_218288_f(n);
                while (class7501 == null) {
                    n2 = Class353.method1093(n2, Direction.UP);
                    if (++method1100 >= value) {
                        return 15;
                    }
                    n = BlockPos.offset(n, 0, 16, 0);
                    class7501 = this.method7349(class7500, n2);
                }
            }
            return class7501.method22322(Class353.method1096(BlockPos.unpackX(n)), Class353.method1096(BlockPos.unpackY(n)), Class353.method1096(BlockPos.unpackZ(n)));
        }
        return 15;
    }
    
    @Override
    public void method7358(final long n) {
        final int method1100 = Class353.method1100(n);
        if (Class7500.method23392((Class7500)this.field10306) > method1100) {
            Class7500.method23393((Class7500)this.field10306, method1100);
            Class7500.method23391((Class7500)this.field10306).defaultReturnValue(Class7500.method23392((Class7500)this.field10306));
        }
        final long method1101 = Class353.method1112(n);
        final int value = Class7500.method23391((Class7500)this.field10306).get(method1101);
        if (value < method1100 + 1) {
            Class7500.method23391((Class7500)this.field10306).put(method1101, method1100 + 1);
            if (this.field10318.contains(method1101)) {
                this.method7368(n);
                if (value > Class7500.method23392((Class7500)this.field10306)) {
                    this.method7367(Class353.method1116(Class353.method1099(n), value - 1, Class353.method1101(n)));
                }
                this.method7369();
            }
        }
    }
    
    private void method7367(final long n) {
        this.field10317.add(n);
        this.field10316.remove(n);
    }
    
    private void method7368(final long n) {
        this.field10316.add(n);
        this.field10317.remove(n);
    }
    
    private void method7369() {
        this.field10319 = (!this.field10316.isEmpty() || !this.field10317.isEmpty());
    }
    
    @Override
    public void method7359(final long n) {
        final long method1112 = Class353.method1112(n);
        final boolean contains = this.field10318.contains(method1112);
        if (contains) {
            this.method7367(n);
        }
        int method1113 = Class353.method1100(n);
        if (Class7500.method23391((Class7500)this.field10306).get(method1112) == method1113 + 1) {
            long method1114;
            for (method1114 = n; !this.method7347(method1114) && this.method7370(method1113); --method1113, method1114 = Class353.method1093(method1114, Direction.DOWN)) {}
            if (!this.method7347(method1114)) {
                Class7500.method23391((Class7500)this.field10306).remove(method1112);
            }
            else {
                Class7500.method23391((Class7500)this.field10306).put(method1112, method1113 + 1);
                if (contains) {
                    this.method7368(method1114);
                }
            }
        }
        if (contains) {
            this.method7369();
        }
    }
    
    @Override
    public void method7360(final long n, final boolean b) {
        this.method7364();
        if (b && this.field10318.add(n)) {
            final int value = Class7500.method23391((Class7500)this.field10306).get(n);
            if (value != Class7500.method23392((Class7500)this.field10306)) {
                this.method7368(Class353.method1116(Class353.method1099(n), value - 1, Class353.method1101(n)));
                this.method7369();
            }
        }
        else if (!b) {
            this.field10318.remove(n);
        }
    }
    
    @Override
    public boolean method7356() {
        return super.method7356() || this.field10319;
    }
    
    @Override
    public Class7281 method7354(final long n) {
        final Class7281 class7281 = (Class7281)this.field10309.get(n);
        if (class7281 != null) {
            return class7281;
        }
        long n2 = Class353.method1093(n, Direction.UP);
        final int value = Class7500.method23391((Class7500)this.field10306).get(Class353.method1112(n));
        if (value != Class7500.method23392((Class7500)this.field10306) && Class353.method1100(n2) < value) {
            Class7281 method7348;
            while ((method7348 = this.method7348(n2, true)) == null) {
                n2 = Class353.method1093(n2, Direction.UP);
            }
            return new Class7281(new Class7280(method7348, 0).method22321());
        }
        return new Class7281();
    }
    
    @Override
    public void method7357(final Class1890<Class7500, ?> class1890, final boolean b, final boolean b2) {
        super.method7357(class1890, b, b2);
        if (b) {
            if (!this.field10316.isEmpty()) {
                for (final long longValue : this.field10316) {
                    final int method7302 = this.method7302(longValue);
                    if (method7302 != 2 && !this.field10317.contains(longValue) && this.field10315.add(longValue)) {
                        if (method7302 == 1) {
                            this.method7355(class1890, longValue);
                            if (this.field10307.add(longValue)) {
                                ((Class7500)this.field10306).method23394(longValue);
                            }
                            Arrays.fill(this.method7348(longValue, true).method22321(), (byte)(-1));
                            final int method7303 = Class353.method1098(Class353.method1099(longValue));
                            final int method7304 = Class353.method1098(Class353.method1100(longValue));
                            final int method7305 = Class353.method1098(Class353.method1101(longValue));
                            for (final Direction class1891 : Class1898.field10314) {
                                final long method7306 = Class353.method1093(longValue, class1891);
                                if ((this.field10317.contains(method7306) || (!this.field10315.contains(method7306) && !this.field10316.contains(method7306))) && this.method7347(method7306)) {
                                    for (int j = 0; j < 16; ++j) {
                                        for (int k = 0; k < 16; ++k) {
                                            long n = 0L;
                                            long n2 = 0L;
                                            switch (Class7043.field27418[class1891.ordinal()]) {
                                                case 1: {
                                                    n = BlockPos.pack(method7303 + j, method7304 + k, method7305);
                                                    n2 = BlockPos.pack(method7303 + j, method7304 + k, method7305 - 1);
                                                    break;
                                                }
                                                case 2: {
                                                    n = BlockPos.pack(method7303 + j, method7304 + k, method7305 + 16 - 1);
                                                    n2 = BlockPos.pack(method7303 + j, method7304 + k, method7305 + 16);
                                                    break;
                                                }
                                                case 3: {
                                                    n = BlockPos.pack(method7303, method7304 + j, method7305 + k);
                                                    n2 = BlockPos.pack(method7303 - 1, method7304 + j, method7305 + k);
                                                    break;
                                                }
                                                default: {
                                                    n = BlockPos.pack(method7303 + 16 - 1, method7304 + j, method7305 + k);
                                                    n2 = BlockPos.pack(method7303 + 16, method7304 + j, method7305 + k);
                                                    break;
                                                }
                                            }
                                            class1890.method7320(n, n2, class1890.method7305(n, n2, 0), true);
                                        }
                                    }
                                }
                            }
                            for (int l = 0; l < 16; ++l) {
                                for (int n3 = 0; n3 < 16; ++n3) {
                                    final long method7307 = BlockPos.pack(Class353.method1098(Class353.method1099(longValue)) + l, Class353.method1098(Class353.method1100(longValue)), Class353.method1098(Class353.method1101(longValue)) + n3);
                                    final long method7308 = BlockPos.pack(Class353.method1098(Class353.method1099(longValue)) + l, Class353.method1098(Class353.method1100(longValue)) - 1, Class353.method1098(Class353.method1101(longValue)) + n3);
                                    class1890.method7320(method7307, method7308, class1890.method7305(method7307, method7308, 0), true);
                                }
                            }
                        }
                        else {
                            for (int n4 = 0; n4 < 16; ++n4) {
                                for (int n5 = 0; n5 < 16; ++n5) {
                                    class1890.method7320(Long.MAX_VALUE, BlockPos.pack(Class353.method1098(Class353.method1099(longValue)) + n4, Class353.method1098(Class353.method1100(longValue)) + 16 - 1, Class353.method1098(Class353.method1101(longValue)) + n5), 0, true);
                                }
                            }
                        }
                    }
                }
            }
            this.field10316.clear();
            if (!this.field10317.isEmpty()) {
                for (final long longValue2 : this.field10317) {
                    if (this.field10315.remove(longValue2) && this.method7347(longValue2)) {
                        for (int n6 = 0; n6 < 16; ++n6) {
                            for (int n7 = 0; n7 < 16; ++n7) {
                                class1890.method7320(Long.MAX_VALUE, BlockPos.pack(Class353.method1098(Class353.method1099(longValue2)) + n6, Class353.method1098(Class353.method1100(longValue2)) + 16 - 1, Class353.method1098(Class353.method1101(longValue2)) + n7), 15, false);
                            }
                        }
                    }
                }
            }
            this.field10317.clear();
            this.field10319 = false;
        }
    }
    
    public boolean method7370(final int n) {
        return n >= Class7500.method23392((Class7500)this.field10306);
    }
    
    public boolean method7371(final long n) {
        final int method1127 = BlockPos.unpackY(n);
        if ((method1127 & 0xF) == 0xF) {
            final long method1128 = Class353.method1112(Class353.method1111(n));
            return this.field10318.contains(method1128) && Class353.method1098(Class7500.method23391((Class7500)this.field10306).get(method1128)) == method1127 + 16;
        }
        return false;
    }
    
    public boolean method7372(final long n) {
        final int value = Class7500.method23391((Class7500)this.field10306).get(Class353.method1112(n));
        return value == Class7500.method23392((Class7500)this.field10306) || Class353.method1100(n) >= value;
    }
    
    public boolean method7373(final long n) {
        return this.field10318.contains(Class353.method1112(n));
    }
    
    static {
        field10314 = new Direction[] { Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
    }
}
