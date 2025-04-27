// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public class Class6431 implements Class6432<Class6632>
{
    private static String[] field25547;
    private final Long2IntLinkedOpenHashMap field25548;
    private final int field25549;
    private final Class8488 field25550;
    private final long field25551;
    private long field25552;
    
    public Class6431(final int field25549, final long seed, final long n) {
        this.field25551 = method19191(seed, n);
        this.field25550 = new Class8488(new Random(seed));
        (this.field25548 = new Long2IntLinkedOpenHashMap(16, 0.25f)).defaultReturnValue(Integer.MIN_VALUE);
        this.field25549 = field25549;
    }
    
    public Class6632 method19185(final Class8610 class8610) {
        return new Class6632(this.field25548, this.field25549, class8610);
    }
    
    public Class6632 method19186(final Class8610 class8610, final Class6632 class8611) {
        return new Class6632(this.field25548, Math.min(1024, class8611.method20075() * 4), class8610);
    }
    
    public Class6632 method19187(final Class8610 class8610, final Class6632 class8611, final Class6632 class8612) {
        return new Class6632(this.field25548, Math.min(1024, Math.max(class8611.method20075(), class8612.method20075()) * 4), class8610);
    }
    
    @Override
    public void method19188(final long n, final long n2) {
        this.field25552 = Class9398.method34927(Class9398.method34927(Class9398.method34927(Class9398.method34927(this.field25551, n), n2), n), n2);
    }
    
    @Override
    public int method19189(final int n) {
        final int n2 = (int)Math.floorMod(this.field25552 >> 24, n);
        this.field25552 = Class9398.method34927(this.field25552, this.field25551);
        return n2;
    }
    
    @Override
    public Class8488 method19190() {
        return this.field25550;
    }
    
    private static long method19191(final long n, final long n2) {
        final long method34927 = Class9398.method34927(Class9398.method34927(Class9398.method34927(n2, n2), n2), n2);
        return Class9398.method34927(Class9398.method34927(Class9398.method34927(n, method34927), method34927), method34927);
    }
}
