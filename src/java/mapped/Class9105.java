// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class9105<T>
{
    private final String field38562;
    private final Comparator<T> field38563;
    private final long field38564;
    public static final Class9105<Class315> field38565;
    public static final Class9105<Class315> field38566;
    public static final Class9105<Class7859> field38567;
    public static final Class9105<Class7859> field38568;
    public static final Class9105<Class7859> field38569;
    public static final Class9105<Class354> field38570;
    public static final Class9105<Integer> field38571;
    public static final Class9105<Class7859> field38572;
    
    public static <T> Class9105<T> method32911(final String s, final Comparator<T> comparator) {
        return new Class9105<T>(s, comparator, 0L);
    }
    
    public static <T> Class9105<T> method32912(final String s, final Comparator<T> comparator, final int n) {
        return new Class9105<T>(s, comparator, n);
    }
    
    public Class9105(final String field38562, final Comparator<T> field38563, final long field38564) {
        this.field38562 = field38562;
        this.field38563 = field38563;
        this.field38564 = field38564;
    }
    
    @Override
    public String toString() {
        return this.field38562;
    }
    
    public Comparator<T> method32913() {
        return this.field38563;
    }
    
    public long method32914() {
        return this.field38564;
    }
    
    static {
        field38565 = method32911("start", (p0, p1) -> 0);
        field38566 = method32911("dragon", (p0, p1) -> 0);
        field38567 = method32911("player", Comparator.comparingLong(Class7859::method25422));
        field38568 = method32911("forced", Comparator.comparingLong(Class7859::method25422));
        field38569 = method32911("light", Comparator.comparingLong(Class7859::method25422));
        field38570 = method32912("portal", Class352::compareTo, 300);
        field38571 = method32912("post_teleport", Integer::compareTo, 5);
        field38572 = method32912("unknown", Comparator.comparingLong(Class7859::method25422), 1);
    }
}
