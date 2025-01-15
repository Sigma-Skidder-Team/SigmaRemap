// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;

public final class Class2306 implements Class2305
{
    public final Class2309 field13978;
    public final Class6817 field13979;
    public final Class8648 field13980;
    public final Class8596 field13981;
    public final boolean field13982;
    private boolean field13983;
    
    public Class2306(final Class2309 field13978, final Class8596 field13979, final boolean field13980) {
        final Class8856 method9414 = field13978.method9414();
        this.field13978 = field13978;
        this.field13981 = field13979;
        this.field13982 = field13980;
        this.field13979 = new Class6817(field13978, field13980);
        this.field13980 = method9414.method31009(this);
    }
    
    @Override
    public Class8596 method9343() {
        return this.field13981;
    }
    
    @Override
    public Class1753 method9344() throws IOException {
        synchronized (this) {
            if (this.field13983) {
                throw new IllegalStateException("Already Executed");
            }
            this.field13983 = true;
        }
        this.method9349();
        try {
            this.field13978.method9409().method32093(this);
            final Class1753 method9353 = this.method9353();
            if (method9353 == null) {
                throw new IOException("Canceled");
            }
            return method9353;
        }
        finally {
            this.field13978.method9409().method32095(this);
        }
    }
    
    private void method9349() {
        this.field13979.method20864(Class6550.method19842().method19848("response.body().close()"));
    }
    
    @Override
    public void method9345(final Class6394 class6394) {
        synchronized (this) {
            if (this.field13983) {
                throw new IllegalStateException("Already Executed");
            }
            this.field13983 = true;
        }
        this.method9349();
        this.field13978.method9409().method32089(new Class1577(this, class6394));
    }
    
    @Override
    public void method9346() {
        this.field13979.method20862();
    }
    
    @Override
    public synchronized boolean method9347() {
        return this.field13983;
    }
    
    @Override
    public boolean method9348() {
        return this.field13979.method20863();
    }
    
    @Override
    public Class2306 clone() {
        return new Class2306(this.field13978, this.field13981, this.field13982);
    }
    
    public Class8904 method9350() {
        return this.field13979.method20865();
    }
    
    public String method9351() {
        return (this.method9348() ? "canceled " : "") + (this.field13982 ? "web socket" : "call") + " to " + this.method9352();
    }
    
    public String method9352() {
        return this.field13981.method29109().method30956();
    }
    
    public Class1753 method9353() throws IOException {
        final ArrayList list = new ArrayList();
        list.addAll(this.field13978.method9412());
        list.add(this.field13979);
        list.add(new Class6813(this.field13978.method9395()));
        list.add(new Class6815(this.field13978.method9397()));
        list.add(new Class6818(this.field13978));
        if (!this.field13982) {
            list.addAll(this.field13978.method9413());
        }
        list.add(new Class6816(this.field13982));
        return new Class8712(list, null, null, null, 0, this.field13981).method29906(this.field13981);
    }
}
