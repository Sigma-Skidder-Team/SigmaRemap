// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.AbstractIterator;

public final class Class7248 extends AbstractIterator<Class354>
{
    private static String[] field28097;
    public final Class8243 field28098;
    public final Class385 field28099;
    public final /* synthetic */ int field28100;
    public final /* synthetic */ int field28101;
    public final /* synthetic */ int field28102;
    public final /* synthetic */ int field28103;
    public final /* synthetic */ int field28104;
    public final /* synthetic */ int field28105;
    
    public Class7248(final int field28100, final int field28101, final int field28102, final int field28103, final int field28104, final int field28105) {
        this.field28100 = field28100;
        this.field28101 = field28101;
        this.field28102 = field28102;
        this.field28103 = field28103;
        this.field28104 = field28104;
        this.field28105 = field28105;
        this.field28098 = new Class8243(this.field28100, this.field28101, this.field28102, this.field28103, this.field28104, this.field28105);
        this.field28099 = new Class385();
    }
    
    public Class354 computeNext() {
        return this.field28098.method27301() ? this.field28099.method1284(this.field28098.method27302(), this.field28098.method27303(), this.field28098.method27304()) : ((Class354)this.endOfData());
    }
}
