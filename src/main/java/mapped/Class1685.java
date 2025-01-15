// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public abstract class Class1685 implements Class1682
{
    public final Class8022 field9528;
    public boolean field9529;
    public final /* synthetic */ Class7812 field9530;
    
    private Class1685(final Class7812 field9530) {
        this.field9530 = field9530;
        this.field9528 = new Class8022(this.field9530.field32012.method5921());
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9528;
    }
    
    public final void method6041(final boolean b) throws IOException {
        if (this.field9530.field32014 == 6) {
            return;
        }
        if (this.field9530.field32014 == 5) {
            this.field9530.method25238(this.field9528);
            this.field9530.field32014 = 6;
            if (this.field9530.field32011 != null) {
                this.field9530.field32011.method31368(!b, this.field9530);
            }
            return;
        }
        throw new IllegalStateException("state: " + this.field9530.field32014);
    }
}
