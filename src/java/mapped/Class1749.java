// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInput;
import java.io.FilterInputStream;

public class Class1749 extends FilterInputStream implements DataInput
{
    public Class1749(final InputStream in) {
        super(in);
    }
    
    @Override
    public int read(final byte[] b) throws IOException {
        return this.in.read(b, 0, b.length);
    }
    
    @Override
    public int read(final byte[] b, final int off, final int len) throws IOException {
        return this.in.read(b, off, len);
    }
    
    @Override
    public void readFully(final byte[] array) throws IOException {
        this.readFully(array, 0, array.length);
    }
    
    @Override
    public void readFully(final byte[] b, final int n, final int n2) throws IOException {
        if (n2 >= 0) {
            int read;
            for (int i = 0; i < n2; i += read) {
                read = this.in.read(b, n + i, n2 - i);
                if (read < 0) {
                    throw new EOFException();
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int skipBytes(final int n) throws IOException {
        int n2;
        int n3;
        for (n2 = 0; n2 < n && (n3 = (int)this.in.skip(n - n2)) > 0; n2 += n3) {}
        return n2;
    }
    
    @Override
    public boolean readBoolean() throws IOException {
        final int read = this.in.read();
        if (read >= 0) {
            return read != 0;
        }
        throw new EOFException();
    }
    
    @Override
    public byte readByte() throws IOException {
        final int read = this.in.read();
        if (read >= 0) {
            return (byte)read;
        }
        throw new EOFException();
    }
    
    @Override
    public int readUnsignedByte() throws IOException {
        final int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }
    
    @Override
    public short readShort() throws IOException {
        final int read = this.in.read();
        final int read2 = this.in.read();
        if ((read | read2) >= 0) {
            return (short)(read | read2 << 8);
        }
        throw new EOFException();
    }
    
    @Override
    public int readUnsignedShort() throws IOException {
        final int read = this.in.read();
        final int read2 = this.in.read();
        if ((read | read2) >= 0) {
            return read | read2 << 8;
        }
        throw new EOFException();
    }
    
    @Override
    public char readChar() throws IOException {
        final int read = this.in.read();
        final int read2 = this.in.read();
        if ((read | read2) >= 0) {
            return (char)(read | read2 << 8);
        }
        throw new EOFException();
    }
    
    @Override
    public int readInt() throws IOException {
        final int read = this.in.read();
        final int read2 = this.in.read();
        final int read3 = this.in.read();
        final int read4 = this.in.read();
        if ((read | read2 | read3 | read4) >= 0) {
            return read | read2 << 8 | read3 << 16 | read4 << 24;
        }
        throw new EOFException();
    }
    
    @Override
    public long readLong() throws IOException {
        final long n = this.in.read();
        final long n2 = this.in.read();
        final long n3 = this.in.read();
        final long n4 = this.in.read();
        final long n5 = this.in.read();
        final long n6 = this.in.read();
        final long n7 = this.in.read();
        final long n8 = this.in.read();
        if ((n | n2 | n3 | n4 | n5 | n6 | n7 | n8) >= 0L) {
            return n | n2 << 8 | n3 << 16 | n4 << 24 | n5 << 32 | n6 << 40 | n7 << 48 | n8 << 56;
        }
        throw new EOFException();
    }
    
    @Override
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public String readLine() throws IOException {
        throw new UnsupportedOperationException("Use readUTF.");
    }
    
    @Override
    public String readUTF() throws IOException {
        final byte[] bytes = new byte[this.readUnsignedShort()];
        this.readFully(bytes);
        return new String(bytes, "UTF-8");
    }
}
