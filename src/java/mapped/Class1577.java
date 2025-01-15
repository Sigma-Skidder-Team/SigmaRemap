// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public final class Class1577 extends Class1574
{
    private final Class6394 field8823;
    public final /* synthetic */ Class2306 field8824;
    
    public Class1577(final Class2306 field8824, final Class6394 field8825) {
        this.field8824 = field8824;
        super("OkHttp %s", new Object[] { field8824.method9352() });
        this.field8823 = field8825;
    }
    
    public String method5661() {
        return this.field8824.field13981.method29109().method30936();
    }
    
    public Class8596 method5662() {
        return this.field8824.field13981;
    }
    
    public Class2306 method5663() {
        return this.field8824;
    }
    
    @Override
    public void method5660() {
        boolean b = false;
        try {
            final Class1753 method9353 = this.field8824.method9353();
            if (this.field8824.field13979.method20863()) {
                b = true;
                this.field8823.method19086(this.field8824, new IOException("Canceled"));
            }
            else {
                b = true;
                this.field8823.method19085(this.field8824, method9353);
            }
        }
        catch (final IOException ex) {
            if (b) {
                Class6550.method19842().method19846(4, "Callback failure for " + this.field8824.method9351(), ex);
            }
            else {
                this.field8823.method19086(this.field8824, ex);
            }
        }
        finally {
            this.field8824.field13978.method9409().method32094(this);
        }
    }
}
