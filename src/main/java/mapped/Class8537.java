// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class Class8537
{
    private static final long field35825 = 1L;
    public int field35826;
    public int field35827;
    public HashMap<Integer, byte[]> field35828;
    
    public Class8537(final int field35826, final int field35827) {
        this.field35828 = new HashMap<Integer, byte[]>();
        this.field35826 = field35826;
        this.field35827 = field35827;
    }
    
    public Class8537(final ObjectInputStream objectInputStream) {
        this.field35828 = new HashMap<Integer, byte[]>();
        try {
            this.field35826 = objectInputStream.readInt();
            this.field35828 = (HashMap)objectInputStream.readObject();
            this.field35827 = objectInputStream.readInt();
        }
        catch (final IOException | ClassNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    public void method28638(final ByteBuffer byteBuffer, final Class7859 class7859) {
        final byte[] array = new byte[byteBuffer.capacity()];
        byteBuffer.get(array, 0, array.length);
        this.field35828.put(this.method28640(class7859), array);
    }
    
    public ByteBuffer method28639(final Class7859 class7859) {
        final byte[] array = this.field35828.get(this.method28640(class7859));
        return (array != null) ? ByteBuffer.wrap(array) : null;
    }
    
    public int method28640(final Class7859 class7859) {
        return Math.max(0, Math.min(Math.abs(class7859.field32290) % 32 * 32 + Math.abs(class7859.field32291) % 32, 1024));
    }
    
    public String method28641() {
        return this.field35826 + "c" + this.field35827 + ".jmap";
    }
    
    public void method28642(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.field35826);
        objectOutputStream.writeObject(this.field35828);
        objectOutputStream.writeInt(this.field35827);
    }
    
    public void method28643(final ObjectInputStream objectInputStream) {
        try {
            this.field35826 = objectInputStream.readInt();
            this.field35828 = (HashMap)objectInputStream.readObject();
            this.field35827 = objectInputStream.readInt();
        }
        catch (final IOException | ClassNotFoundException ex) {
            ((Throwable)ex).printStackTrace();
        }
    }
    
    public static Class2420 method28644(final Class7859 class7859) {
        return new Class2420((int)Math.floor(class7859.field32290 / 32.0), (int)Math.floor(class7859.field32291 / 32.0));
    }
}
