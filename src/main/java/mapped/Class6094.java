// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6094 extends Class6093
{
    private static String[] field24729;
    private final Class5760 field24730;
    
    public Class6094(final Class5760 field24730) {
        this.field24730 = field24730;
    }
    
    @Override
    public void method18176(final boolean b) {
        this.field24723 = this.field24730.field23435.method1056();
        this.field24724 = this.field24730.field23437.method1056();
        this.field24725 = this.field24730.field23436.method1056();
        this.field24726 = this.field24730.field23438.method1056();
        this.field24722 = ((this.field24723 != this.field24724) ? (this.field24723 ? 1.0f : -1.0f) : 0.0f);
        this.field24721 = ((this.field24725 != this.field24726) ? (this.field24725 ? 1.0f : -1.0f) : 0.0f);
        this.field24727 = this.field24730.field23439.method1056();
        this.field24728 = this.field24730.field23440.method1056();
        if (b) {
            this.field24721 *= (float)0.3;
            this.field24722 *= (float)0.3;
        }
    }
}
