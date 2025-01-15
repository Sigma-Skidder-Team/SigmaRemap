// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;

public class Class7407
{
    private static String[] field28538;
    private final ByteArrayOutputStream field28539;
    private final DataOutputStream field28540;
    
    public Class7407(final int size) {
        this.field28539 = new ByteArrayOutputStream(size);
        this.field28540 = new DataOutputStream(this.field28539);
    }
    
    public void method22761(final byte[] b) throws IOException {
        this.field28540.write(b, 0, b.length);
    }
    
    public void method22762(final String s) throws IOException {
        this.field28540.writeBytes(s);
        this.field28540.write(0);
    }
    
    public void method22763(final int b) throws IOException {
        this.field28540.write(b);
    }
    
    public void method22764(final short i) throws IOException {
        this.field28540.writeShort(Short.reverseBytes(i));
    }
    
    public byte[] method22765() {
        return this.field28539.toByteArray();
    }
    
    public void method22766() {
        this.field28539.reset();
    }
}
