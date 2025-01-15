// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutput;
import java.io.FilterOutputStream;

public class Class1720 extends FilterOutputStream implements DataOutput
{
    public Class1720(final OutputStream out) {
        super(out);
    }
    
    @Override
    public synchronized void write(final int n) throws IOException {
        this.out.write(n);
    }
    
    @Override
    public synchronized void write(final byte[] b, final int off, final int len) throws IOException {
        this.out.write(b, off, len);
    }
    
    @Override
    public void flush() throws IOException {
        this.out.flush();
    }
    
    @Override
    public void writeBoolean(final boolean b) throws IOException {
        this.out.write(b ? 1 : 0);
    }
    
    @Override
    public void writeByte(final int n) throws IOException {
        this.out.write(n);
    }
    
    @Override
    public void writeShort(final int n) throws IOException {
        this.out.write(n & 0xFF);
        this.out.write(n >>> 8 & 0xFF);
    }
    
    @Override
    public void writeChar(final int n) throws IOException {
        this.out.write(n & 0xFF);
        this.out.write(n >>> 8 & 0xFF);
    }
    
    @Override
    public void writeInt(final int n) throws IOException {
        this.out.write(n & 0xFF);
        this.out.write(n >>> 8 & 0xFF);
        this.out.write(n >>> 16 & 0xFF);
        this.out.write(n >>> 24 & 0xFF);
    }
    
    @Override
    public void writeLong(final long n) throws IOException {
        this.out.write((int)(n & 0xFFL));
        this.out.write((int)(n >>> 8 & 0xFFL));
        this.out.write((int)(n >>> 16 & 0xFFL));
        this.out.write((int)(n >>> 24 & 0xFFL));
        this.out.write((int)(n >>> 32 & 0xFFL));
        this.out.write((int)(n >>> 40 & 0xFFL));
        this.out.write((int)(n >>> 48 & 0xFFL));
        this.out.write((int)(n >>> 56 & 0xFFL));
    }
    
    @Override
    public void writeFloat(final float value) throws IOException {
        this.writeInt(Float.floatToIntBits(value));
    }
    
    @Override
    public void writeDouble(final double value) throws IOException {
        this.writeLong(Double.doubleToLongBits(value));
    }
    
    @Override
    public void writeBytes(final String s) throws IOException {
        for (int length = s.length(), i = 0; i < length; ++i) {
            this.out.write((byte)s.charAt(i));
        }
    }
    
    @Override
    public void writeChars(final String s) throws IOException {
        for (int length = s.length(), i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            this.out.write(char1 & '\u00ff');
            this.out.write(char1 >>> 8 & 0xFF);
        }
    }
    
    @Override
    public void writeUTF(final String s) throws IOException {
        final byte[] bytes = s.getBytes("UTF-8");
        this.writeShort(bytes.length);
        this.write(bytes);
    }
}
