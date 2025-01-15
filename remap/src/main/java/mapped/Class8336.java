// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Iterator;
import java.util.Set;
import java.util.BitSet;

public class Class8336
{
    private final BitSet field34227;
    private static final int field34228;
    private long field34229;
    
    public Class8336() {
        this.field34227 = new BitSet();
    }
    
    public void method27779(final Set<Direction> set) {
        for (final Direction class179 : set) {
            final Iterator<Direction> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                this.method27780(class179, iterator2.next(), true);
            }
        }
    }
    
    public void method27780(final Direction class179, final Direction class180, final boolean b) {
        this.method27784(class179.ordinal() + class180.ordinal() * Class8336.field34228, b);
        this.method27784(class180.ordinal() + class179.ordinal() * Class8336.field34228, b);
    }
    
    public void method27781(final boolean b) {
        if (!b) {
            this.field34229 = 0L;
        }
        else {
            this.field34229 = -1L;
        }
    }
    
    public boolean method27782(final Direction class179, final Direction class180) {
        return this.method27783(class179.ordinal() + class180.ordinal() * Class8336.field34228);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(' ');
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            sb.append(' ').append(values[i].toString().toUpperCase().charAt(0));
        }
        sb.append('\n');
        for (final Direction class179 : Direction.values()) {
            sb.append(class179.toString().toUpperCase().charAt(0));
            for (final Direction class180 : Direction.values()) {
                if (class179 != class180) {
                    sb.append(' ').append((char)(this.method27782(class179, class180) ? 89 : 110));
                }
                else {
                    sb.append("  ");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
    
    private boolean method27783(final int n) {
        return (this.field34229 & (long)(1 << n)) != 0x0L;
    }
    
    private void method27784(final int n, final boolean b) {
        if (!b) {
            this.method27786(n);
        }
        else {
            this.method27785(n);
        }
    }
    
    private void method27785(final int n) {
        this.field34229 |= 1 << n;
    }
    
    private void method27786(final int n) {
        this.field34229 &= ~(1 << n);
    }
    
    static {
        field34228 = Direction.values().length;
    }
}
