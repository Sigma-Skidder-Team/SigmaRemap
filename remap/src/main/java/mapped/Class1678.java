// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

public final class Class1678 implements Class1676
{
    private final Class1679 field9504;
    private final Deflater field9505;
    private final Class1709 field9506;
    private boolean field9507;
    private final CRC32 field9508;
    
    public Class1678(final Class1676 class1676) {
        this.field9508 = new CRC32();
        if (class1676 != null) {
            this.field9505 = new Deflater(-1, true);
            this.field9504 = Class8753.method30276(class1676);
            this.field9506 = new Class1709(this.field9504, this.field9505);
            this.method5923();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }
    
    @Override
    public void method5920(final Class1680 class1680, final long lng) throws IOException {
        if (lng < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + lng);
        }
        if (lng != 0L) {
            this.method5925(class1680, lng);
            this.field9506.method5920(class1680, lng);
        }
    }
    
    @Override
    public void flush() throws IOException {
        this.field9506.flush();
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9504.method5921();
    }
    
    @Override
    public void close() throws IOException {
        if (this.field9507) {
            return;
        }
        Throwable t = null;
        try {
            this.field9506.method6067();
            this.method5924();
        }
        catch (final Throwable t2) {
            t = t2;
        }
        try {
            this.field9505.end();
        }
        catch (final Throwable t3) {
            if (t == null) {
                t = t3;
            }
        }
        try {
            this.field9504.close();
        }
        catch (final Throwable t4) {
            if (t == null) {
                t = t4;
            }
        }
        this.field9507 = true;
        if (t != null) {
            Class9476.method35281(t);
        }
    }
    
    public Deflater method5922() {
        return this.field9505;
    }
    
    private void method5923() {
        final Class1680 method5926 = this.field9504.method5926();
        method5926.method6005(8075);
        method5926.method6004(8);
        method5926.method6004(0);
        method5926.method6007(0);
        method5926.method6004(0);
        method5926.method6004(0);
    }
    
    private void method5924() throws IOException {
        this.field9504.method5941((int)this.field9508.getValue());
        this.field9504.method5941((int)this.field9505.getBytesRead());
    }
    
    private void method5925(final Class1680 class1680, long a) {
        int len;
        for (Class9258 class1681 = class1680.field9511; a > 0L; a -= len, class1681 = class1681.field39718) {
            len = (int)Math.min(a, class1681.field39715 - class1681.field39714);
            this.field9508.update(class1681.field39713, class1681.field39714, len);
        }
    }
}
