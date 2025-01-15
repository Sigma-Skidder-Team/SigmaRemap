// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class7836
{
    private final char[] field32083;
    private int field32084;
    private final Runnable field32085;
    
    public Class7836(final char[] field32083, final Runnable field32084) {
        this.field32085 = field32084;
        if (field32083.length >= 1) {
            this.field32083 = field32083;
            this.field32084 = 0;
            return;
        }
        throw new IllegalArgumentException("Must have at least one char");
    }
    
    public boolean method25314(final char c) {
        if (c != this.field32083[this.field32084]) {
            this.method25315();
            return false;
        }
        ++this.field32084;
        if (this.field32084 != this.field32083.length) {
            return false;
        }
        this.method25315();
        this.field32085.run();
        return true;
    }
    
    public void method25315() {
        this.field32084 = 0;
    }
    
    @Override
    public String toString() {
        return "KeyCombo{chars=" + Arrays.toString(this.field32083) + ", matchIndex=" + this.field32084 + '}';
    }
}
