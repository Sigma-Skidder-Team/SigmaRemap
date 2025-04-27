// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap$Entry;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import net.minecraft.util.math.MathHelper;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;

public class Class7875<T> implements Class7876<T>
{
    private final Class6058<T> field32323;
    private final Class7876<T> field32324;
    private final Class94<T> field32325;
    private final Function<CompoundNBT, T> field32326;
    private final Function<T, CompoundNBT> field32327;
    private final T field32328;
    public Class9217 field32329;
    private Class6058<T> field32330;
    private int field32331;
    private final ReentrantLock field32332;
    
    public void method25498() {
        if (this.field32332.isLocked() && !this.field32332.isHeldByCurrentThread()) {
            final String s = Thread.getAllStackTraces().keySet().stream().filter(Objects::nonNull).map(thread -> thread.getName() + ": \n\tat " + Arrays.stream(thread.getStackTrace()).map((Function<? super StackTraceElement, ?>)Object::toString).collect((Collector<? super Object, ?, String>)Collectors.joining("\n\tat "))).collect((Collector<? super Object, ?, String>)Collectors.joining("\n"));
            final CrashReport class7689 = new CrashReport("Writing into PalettedContainer from multiple threads", new IllegalStateException());
            class7689.makeCategory("Thread dumps").addDetail("Thread dumps", s);
            throw new ReportedException(class7689);
        }
        this.field32332.lock();
    }
    
    public void method25499() {
        this.field32332.unlock();
    }
    
    public Class7875(final Class6058<T> field32323, final Class94<T> field32324, final Function<CompoundNBT, T> field32325, final Function<T, CompoundNBT> field32326, final T field32327) {
        this.field32324 = ((p0, p1) -> 0);
        this.field32332 = new ReentrantLock();
        this.field32323 = field32323;
        this.field32325 = field32324;
        this.field32326 = field32325;
        this.field32327 = field32326;
        this.field32328 = field32327;
        this.method25501(4);
    }
    
    private static int method25500(final int n, final int n2, final int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
    
    private void method25501(final int field32331) {
        if (field32331 != this.field32331) {
            this.field32331 = field32331;
            if (this.field32331 > 4) {
                if (this.field32331 >= 9) {
                    this.field32330 = this.field32323;
                    this.field32331 = MathHelper.method35681(this.field32325.method564());
                }
                else {
                    this.field32330 = new Class6060<T>(this.field32325, this.field32331, this, this.field32326, this.field32327);
                }
            }
            else {
                this.field32331 = 4;
                this.field32330 = new Class6059<T>(this.field32325, this.field32331, this, this.field32326);
            }
            this.field32330.method18026(this.field32328);
            this.field32329 = new Class9217(this.field32331, 4096);
        }
    }
    
    @Override
    public int method25502(final int n, final T t) {
        this.method25498();
        final Class9217 field32329 = this.field32329;
        final Class6058<T> field32330 = this.field32330;
        this.method25501(n);
        for (int i = 0; i < field32329.method33929(); ++i) {
            final T method18028 = field32330.method18028(field32329.method33927(i));
            if (method18028 != null) {
                this.method25506(i, method18028);
            }
        }
        final int method18029 = this.field32330.method18026(t);
        this.method25499();
        return method18029;
    }
    
    public T method25503(final int n, final int n2, final int n3, final T t) {
        this.method25498();
        final Object method25505 = this.method25505(method25500(n, n2, n3), t);
        this.method25499();
        return (T)method25505;
    }
    
    public T method25504(final int n, final int n2, final int n3, final T t) {
        return this.method25505(method25500(n, n2, n3), t);
    }
    
    public T method25505(final int n, final T t) {
        final T method18028 = this.field32330.method18028(this.field32329.method33925(n, this.field32330.method18026(t)));
        return (method18028 != null) ? method18028 : this.field32328;
    }
    
    public void method25506(final int n, final T t) {
        this.field32329.method33926(n, this.field32330.method18026(t));
    }
    
    public T method25507(final int n, final int n2, final int n3) {
        return this.method25508(method25500(n, n2, n3));
    }
    
    public T method25508(final int n) {
        final T method18028 = this.field32330.method18028(this.field32329.method33927(n));
        return (method18028 != null) ? method18028 : this.field32328;
    }
    
    public void method25509(final PacketBuffer class8654) {
        this.method25498();
        final byte byte1 = class8654.readByte();
        if (this.field32331 != byte1) {
            this.method25501(byte1);
        }
        this.field32330.method18029(class8654);
        class8654.method29492(this.field32329.method33928());
        this.method25499();
    }
    
    public void method25510(final PacketBuffer class8654) {
        this.method25498();
        class8654.writeByte(this.field32331);
        this.field32330.method18030(class8654);
        class8654.method29491(this.field32329.method33928());
        this.method25499();
    }
    
    public void method25511(final ListNBT class52, final long[] array) {
        this.method25498();
        final int max = Math.max(4, MathHelper.method35681(class52.size()));
        if (max != this.field32331) {
            this.method25501(max);
        }
        this.field32330.method18032(class52);
        final int n = array.length * 64 / 4096;
        if (this.field32330 != this.field32323) {
            if (n != this.field32331) {
                final Class9217 class53 = new Class9217(n, 4096, array);
                for (int i = 0; i < 4096; ++i) {
                    this.field32329.method33926(i, class53.method33927(i));
                }
            }
            else {
                System.arraycopy(array, 0, this.field32329.method33928(), 0, array.length);
            }
        }
        else {
            final Class6060 class54 = new Class6060(this.field32325, max, this.field32324, this.field32326, this.field32327);
            class54.method18032(class52);
            final Class9217 class55 = new Class9217(max, 4096, array);
            for (int j = 0; j < 4096; ++j) {
                this.field32329.method33926(j, this.field32323.method18026((T)class54.method18028(class55.method33927(j))));
            }
        }
        this.method25499();
    }
    
    public void method25512(final CompoundNBT class51, final String s, final String s2) {
        this.method25498();
        final Class6060 class52 = new Class6060(this.field32325, this.field32331, this.field32324, this.field32326, this.field32327);
        T field32328 = this.field32328;
        int n = class52.method18026(this.field32328);
        final int[] array = new int[4096];
        for (int i = 0; i < 4096; ++i) {
            final T method25508 = this.method25508(i);
            if (method25508 != field32328) {
                field32328 = method25508;
                n = class52.method18026(method25508);
            }
            array[i] = n;
        }
        final ListNBT class53 = new ListNBT();
        class52.method18035(class53);
        class51.put(s, class53);
        final Class9217 class54 = new Class9217(Math.max(4, MathHelper.method35681(class53.size())), 4096);
        for (int j = 0; j < array.length; ++j) {
            class54.method33926(j, array[j]);
        }
        class51.putLongArray(s2, class54.method33928());
        this.method25499();
    }
    
    public int method25513() {
        return 1 + this.field32330.method18031() + PacketBuffer.method29484(this.field32329.method33929()) + this.field32329.method33928().length * 8;
    }
    
    public boolean method25514(final T t) {
        return this.field32330.method18027(t);
    }
    
    public void method25515(final Class6777<T> class6777) {
        final Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
        this.field32329.method33931(n2 -> int2IntMap.put(n2, int2IntMap.get(n2) + 1));
        ((Int2IntMap)int2IntOpenHashMap).int2IntEntrySet().forEach(int2IntMap$Entry -> class6778.method20684(this.field32330.method18028(int2IntMap$Entry.getIntKey()), int2IntMap$Entry.getIntValue()));
    }
}
