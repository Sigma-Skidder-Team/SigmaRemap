// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2283 implements Cloneable
{
    private Class8611 field13888;
    private final Class8408 field13889;
    
    public Class2283() {
        this.field13888 = Class8611.field36144;
        this.field13889 = new Class8408();
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException obj) {
            throw new InternalError(this + ": " + obj);
        }
    }
    
    public void method8829(final Class8611 field13888) {
        if (field13888 != null) {
            this.field13888 = field13888;
            return;
        }
        throw new NullPointerException("out");
    }
    
    public Class8611 method8830() {
        return this.field13888;
    }
    
    public Class8408 method8831() {
        return this.field13889;
    }
}
