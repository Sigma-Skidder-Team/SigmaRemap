// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.io.IOException;
import java.util.zip.Deflater;

public final class Class1709 implements Class1676
{
    private final Class1679 field9597;
    private final Deflater field9598;
    private boolean field9599;
    
    public Class1709(final Class1676 class1676, final Deflater deflater) {
        this(Class8753.method30276(class1676), deflater);
    }
    
    public Class1709(final Class1679 field9597, final Deflater field9598) {
        if (field9597 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (field9598 != null) {
            this.field9597 = field9597;
            this.field9598 = field9598;
            return;
        }
        throw new IllegalArgumentException("inflater == null");
    }
    
    @Override
    public void method5920(final Class1680 class1680, long a) throws IOException {
        Class9476.method35277(class1680.field9512, 0L, a);
        while (a > 0L) {
            final Class9258 field9511 = class1680.field9511;
            final int len = (int)Math.min(a, field9511.field39715 - field9511.field39714);
            this.field9598.setInput(field9511.field39713, field9511.field39714, len);
            this.method6066(false);
            class1680.field9512 -= len;
            final Class9258 class1681 = field9511;
            class1681.field39714 += len;
            if (field9511.field39714 == field9511.field39715) {
                class1680.field9511 = field9511.method34162();
                Class9141.method33335(field9511);
            }
            a -= len;
        }
    }
    
    @IgnoreJRERequirement
    private void method6066(final boolean b) throws IOException {
        final Class1680 method5926 = this.field9597.method5926();
        Class9258 method5927;
        while (true) {
            method5927 = method5926.method6013(1);
            final int n = b ? this.field9598.deflate(method5927.field39713, method5927.field39715, 8192 - method5927.field39715, 2) : this.field9598.deflate(method5927.field39713, method5927.field39715, 8192 - method5927.field39715);
            if (n <= 0) {
                if (!this.field9598.needsInput()) {
                    continue;
                }
                break;
            }
            else {
                final Class9258 class9258 = method5927;
                class9258.field39715 += n;
                final Class1680 class9259 = method5926;
                class9259.field9512 += n;
                this.field9597.method5947();
            }
        }
        if (method5927.field39714 == method5927.field39715) {
            method5926.field9511 = method5927.method34162();
            Class9141.method33335(method5927);
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.method6066(true);
        this.field9597.flush();
    }
    
    public void method6067() throws IOException {
        this.field9598.finish();
        this.method6066(false);
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9599) {
            return;
        }
        Throwable t = null;
        try {
            this.method6067();
        }
        catch (final Throwable t2) {
            t = t2;
        }
        try {
            this.field9598.end();
        }
        catch (final Throwable t3) {
            if (t == null) {
                t = t3;
            }
        }
        try {
            this.field9597.close();
        }
        catch (final Throwable t4) {
            if (t == null) {
                t = t4;
            }
        }
        this.field9599 = true;
        if (t != null) {
            Class9476.method35281(t);
        }
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9597.method5921();
    }
    
    @Override
    public String toString() {
        return "DeflaterSink(" + this.field9597 + ")";
    }
}
