// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public final class Class8703
{
    private static String[] field36563;
    public static final int field36564 = 65535;
    public static final int field36565 = 1;
    public static final int field36566 = 2;
    public static final int field36567 = 4;
    public static final int field36568 = 5;
    public static final int field36569 = 6;
    public static final int field36570 = 7;
    public static final int field36571 = 10;
    private int field36572;
    private final int[] field36573;
    
    public Class8703() {
        this.field36573 = new int[10];
    }
    
    public void method29860() {
        this.field36572 = 0;
        Arrays.fill(this.field36573, 0);
    }
    
    public Class8703 method29861(final int n, final int n2) {
        if (n < this.field36573.length) {
            this.field36572 |= 1 << n;
            this.field36573[n] = n2;
            return this;
        }
        return this;
    }
    
    public boolean method29862(final int n) {
        return (this.field36572 & 1 << n) != 0x0;
    }
    
    public int method29863(final int n) {
        return this.field36573[n];
    }
    
    public int method29864() {
        return Integer.bitCount(this.field36572);
    }
    
    public int method29865() {
        return ((0x2 & this.field36572) == 0x0) ? -1 : this.field36573[1];
    }
    
    public boolean method29866(final boolean b) {
        return (((0x4 & this.field36572) == 0x0) ? (b ? 1 : 0) : this.field36573[2]) == 1;
    }
    
    public int method29867(final int n) {
        return ((0x10 & this.field36572) == 0x0) ? n : this.field36573[4];
    }
    
    public int method29868(final int n) {
        return ((0x20 & this.field36572) == 0x0) ? n : this.field36573[5];
    }
    
    public int method29869(final int n) {
        return ((0x40 & this.field36572) == 0x0) ? n : this.field36573[6];
    }
    
    public int method29870() {
        return ((0x80 & this.field36572) == 0x0) ? 65535 : this.field36573[7];
    }
    
    public void method29871(final Class8703 class8703) {
        for (int i = 0; i < 10; ++i) {
            if (class8703.method29862(i)) {
                this.method29861(i, class8703.method29863(i));
            }
        }
    }
}
