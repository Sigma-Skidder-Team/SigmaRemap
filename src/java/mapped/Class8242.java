// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public class Class8242
{
    private static final int field33840 = 44;
    private static final int field33841 = 1380533830;
    private static final long field33842 = 6287401410857104416L;
    private static final int field33843 = 1684108385;
    private static final int field33844 = 255;
    private final RandomAccessFile field33845;
    private final int field33846;
    private final int field33847;
    private final int field33848;
    private int field33849;
    
    public Class8242(final File file, final int field33846, final int field33847, final int field33848) throws IOException {
        this.field33846 = field33846;
        this.field33847 = field33847;
        this.field33848 = field33848;
        this.field33849 = 0;
        (this.field33845 = new RandomAccessFile(file, "rw")).write(new byte[44]);
    }
    
    public void method27295(final byte[] array) throws IOException {
        this.method27296(array, 0, array.length);
    }
    
    public void method27296(final byte[] b, final int off, final int len) throws IOException {
        for (int i = off; i < off + b.length; i += 2) {
            final byte b2 = b[i + 1];
            b[i + 1] = b[i];
            b[i] = b2;
        }
        this.field33845.write(b, off, len);
        this.field33849 += b.length;
    }
    
    public void method27297(final short[] array) throws IOException {
        this.method27298(array, 0, array.length);
    }
    
    public void method27298(final short[] array, final int n, final int n2) throws IOException {
        for (int i = n; i < n + array.length; ++i) {
            this.field33845.write(array[i] & 0xFF);
            this.field33845.write(array[i] >> 8 & 0xFF);
            this.field33849 += 2;
        }
    }
    
    public void method27299() throws IOException {
        this.method27300();
        this.field33845.close();
    }
    
    private void method27300() throws IOException {
        this.field33845.seek(0L);
        final int n = (this.field33848 + 7) / 8;
        this.field33845.writeInt(1380533830);
        this.field33845.writeInt(Integer.reverseBytes(this.field33849 + 36));
        this.field33845.writeLong(6287401410857104416L);
        this.field33845.writeInt(Integer.reverseBytes(16));
        this.field33845.writeShort(Short.reverseBytes((short)1));
        this.field33845.writeShort(Short.reverseBytes((short)this.field33847));
        this.field33845.writeInt(Integer.reverseBytes(this.field33846));
        this.field33845.writeInt(Integer.reverseBytes(this.field33846 * this.field33847 * n));
        this.field33845.writeShort(Short.reverseBytes((short)(this.field33847 * n)));
        this.field33845.writeShort(Short.reverseBytes((short)this.field33848));
        this.field33845.writeInt(1684108385);
        this.field33845.writeInt(Integer.reverseBytes(this.field33849));
    }
}
