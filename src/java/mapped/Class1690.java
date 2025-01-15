// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.zip.DataFormatException;
import java.io.IOException;
import java.io.EOFException;
import java.util.zip.Inflater;

public final class Class1690 implements Class1682
{
    private final Class1681 field9544;
    private final Inflater field9545;
    private int field9546;
    private boolean field9547;
    
    public Class1690(final Class1682 class1682, final Inflater inflater) {
        this(Class8753.method30275(class1682), inflater);
    }
    
    public Class1690(final Class1681 field9544, final Inflater field9545) {
        if (field9544 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (field9545 != null) {
            this.field9544 = field9544;
            this.field9545 = field9545;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long lng) throws IOException {
        if (lng < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + lng);
        }
        if (this.field9547) {
            throw new IllegalStateException("closed");
        }
        if (lng == 0L) {
            return 0L;
        }
        while (true) {
            final boolean method6046 = this.method6046();
            try {
                final Class9258 method6047 = class1680.method6013(1);
                final int inflate = this.field9545.inflate(method6047.field39713, method6047.field39715, 8192 - method6047.field39715);
                if (inflate > 0) {
                    final Class9258 class1681 = method6047;
                    class1681.field39715 += inflate;
                    class1680.field9512 += inflate;
                    return inflate;
                }
                if (this.field9545.finished() || this.field9545.needsDictionary()) {
                    this.method6047();
                    if (method6047.field39714 == method6047.field39715) {
                        class1680.field9511 = method6047.method34162();
                        Class9141.method33335(method6047);
                    }
                    return -1L;
                }
                if (method6046) {
                    throw new EOFException("source exhausted prematurely");
                }
                continue;
            }
            catch (final DataFormatException cause) {
                throw new IOException(cause);
            }
        }
    }
    
    public boolean method6046() throws IOException {
        if (!this.field9545.needsInput()) {
            return false;
        }
        this.method6047();
        if (this.field9545.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (!this.field9544.method5951()) {
            final Class9258 field9511 = this.field9544.method5926().field9511;
            this.field9546 = field9511.field39715 - field9511.field39714;
            this.field9545.setInput(field9511.field39713, field9511.field39714, this.field9546);
            return false;
        }
        return true;
    }
    
    private void method6047() throws IOException {
        if (this.field9546 != 0) {
            final int n = this.field9546 - this.field9545.getRemaining();
            this.field9546 -= n;
            this.field9544.method5995(n);
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9544.method5921();
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9547) {
            this.field9545.end();
            this.field9547 = true;
            this.field9544.close();
        }
    }
}
