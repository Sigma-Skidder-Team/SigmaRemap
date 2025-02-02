// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Properties
{
    private int field37658;
    private int field37659;
    private Item field37660;
    private Class7207 field37661;
    private Class1998 field37662;
    private Class9082 field37663;
    
    public Properties() {
        this.field37658 = 64;
        this.field37662 = Class1998.field11186;
    }
    
    public Properties method31781(final Class9082 field37663) {
        this.field37663 = field37663;
        return this;
    }
    
    public Properties method31782(final int field37658) {
        if (this.field37659 <= 0) {
            this.field37658 = field37658;
            return this;
        }
        throw new RuntimeException("Unable to have damage AND stack.");
    }
    
    public Properties method31783(final int n) {
        return (this.field37659 != 0) ? this : this.method31784(n);
    }
    
    public Properties method31784(final int field37659) {
        this.field37659 = field37659;
        this.field37658 = 1;
        return this;
    }
    
    public Properties method31785(final Item field37660) {
        this.field37660 = field37660;
        return this;
    }
    
    public Properties method31786(final Class7207 field37661) {
        this.field37661 = field37661;
        return this;
    }
    
    public Properties method31787(final Class1998 field37662) {
        this.field37662 = field37662;
        return this;
    }


    public static /* synthetic */ Class7207 method31788(Properties properties) {
        return properties.field37661;
    }

    public static /* synthetic */ Class1998 method31789(Properties properties) {
        return properties.field37662;
    }

    public static /* synthetic */ Item method31790(Properties properties) {
        return properties.field37660;
    }

    public static /* synthetic */ int method31791(Properties properties) {
        return properties.field37659;
    }

    public static /* synthetic */ int method31792(Properties properties) {
        return properties.field37658;
    }

    public static /* synthetic */ Class9082 method31793(Properties properties) {
        return properties.field37663;
    }
}
