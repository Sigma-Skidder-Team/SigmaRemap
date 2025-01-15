// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6253 implements Class6250
{
    public static final int field25101 = 0;
    public static final int field25102 = 1;
    public static final int field25103 = 2;
    public static final int field25104 = 3;
    public static final int field25105 = 4;
    private int field25106;
    private int field25107;
    private int field25108;
    
    public Class6253(final int field25108, final int field25109, final int field25110) {
        this.field25106 = field25109;
        this.field25107 = field25110;
        this.field25108 = field25108;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Class6253) {
            final Class6253 class6253 = (Class6253)o;
            if (class6253.field25108 == this.field25108) {
                if (class6253.field25106 == this.field25106) {
                    if (class6253.field25107 == this.field25107) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.field25106 + this.field25107 + this.field25108;
    }
}
