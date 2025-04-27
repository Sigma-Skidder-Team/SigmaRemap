// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6435
{
    private final int field25560;
    private final int field25561;
    private final int field25562;
    private final String field25563;
    
    public Class6435(final int n, final int n2) {
        this(n, n2, 0);
    }
    
    public Class6435(final int n, final int n2, final int n3) {
        this(n, n2, n3, null);
    }
    
    public Class6435(final int field25560, final int field25561, final int field25562, final String field25563) {
        this.field25560 = field25560;
        this.field25561 = field25561;
        this.field25562 = field25562;
        this.field25563 = field25563;
    }
    
    public int method19197() {
        return this.field25560;
    }
    
    public int method19198() {
        return this.field25561;
    }
    
    public int method19199() {
        return this.field25562;
    }
    
    public int method19200() {
        if (this.field25561 <= 9) {
            return (this.field25562 <= 9) ? (this.field25560 * 100 + this.field25561 * 10 + this.field25562) : (this.field25560 * 100 + this.field25561 * 10 + 9);
        }
        return this.field25560 * 100 + this.field25561;
    }
    
    @Override
    public String toString() {
        return (this.field25563 != null) ? (this.field25560 + "." + this.field25561 + "." + this.field25562 + this.field25563) : (this.field25560 + "." + this.field25561 + "." + this.field25562);
    }
}
