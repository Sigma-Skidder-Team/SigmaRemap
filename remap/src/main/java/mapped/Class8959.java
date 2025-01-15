// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8959
{
    private int field37658;
    private int field37659;
    private Class3820 field37660;
    private Class7207 field37661;
    private Class1998 field37662;
    private Class9082 field37663;
    
    public Class8959() {
        this.field37658 = 64;
        this.field37662 = Class1998.field11186;
    }
    
    public Class8959 method31781(final Class9082 field37663) {
        this.field37663 = field37663;
        return this;
    }
    
    public Class8959 method31782(final int field37658) {
        if (this.field37659 <= 0) {
            this.field37658 = field37658;
            return this;
        }
        throw new RuntimeException("Unable to have damage AND stack.");
    }
    
    public Class8959 method31783(final int n) {
        return (this.field37659 != 0) ? this : this.method31784(n);
    }
    
    public Class8959 method31784(final int field37659) {
        this.field37659 = field37659;
        this.field37658 = 1;
        return this;
    }
    
    public Class8959 method31785(final Class3820 field37660) {
        this.field37660 = field37660;
        return this;
    }
    
    public Class8959 method31786(final Class7207 field37661) {
        this.field37661 = field37661;
        return this;
    }
    
    public Class8959 method31787(final Class1998 field37662) {
        this.field37662 = field37662;
        return this;
    }
}
