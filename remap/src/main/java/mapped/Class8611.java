// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8611
{
    public static final int field36138 = 0;
    public static final int field36139 = 1;
    public static final int field36140 = 2;
    public static final int field36141 = 3;
    public static final Class8611 field36142;
    public static final Class8611 field36143;
    public static final Class8611 field36144;
    public static final Class8611 field36145;
    private final int field36146;
    
    public static Class8611 method29202(final int i) {
        switch (i) {
            case 1: {
                return Class8611.field36142;
            }
            case 2: {
                return Class8611.field36143;
            }
            case 0: {
                return Class8611.field36144;
            }
            case 3: {
                return Class8611.field36145;
            }
            default: {
                throw new IllegalArgumentException("Invalid channel code: " + i);
            }
        }
    }
    
    private Class8611(final int field36146) {
        this.field36146 = field36146;
        if (field36146 >= 0 && field36146 <= 3) {
            return;
        }
        throw new IllegalArgumentException("channels");
    }
    
    public int method29203() {
        return this.field36146;
    }
    
    public int method29204() {
        return (this.field36146 != 0) ? 1 : 2;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        if (o instanceof Class8611) {
            b = (((Class8611)o).field36146 == this.field36146);
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.field36146;
    }
    
    static {
        field36142 = new Class8611(1);
        field36143 = new Class8611(2);
        field36144 = new Class8611(0);
        field36145 = new Class8611(3);
    }
}
