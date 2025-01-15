// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.io.Serializable;

public class Class2318 implements Serializable
{
    private static String[] field14048;
    private static final long field14049 = -2831273345165209113L;
    public String field14050;
    public transient ByteBuffer field14051;
    
    public Class2318(final String field14050, final ByteBuffer field14051) {
        this.field14051 = field14051;
        this.field14050 = field14050;
    }
    
    public ByteBuffer method9443() {
        return this.field14051;
    }
    
    private void method9444(final ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.field14051.capacity());
        objectOutputStream.write(this.field14051.array());
    }
    
    private void method9445(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        final int int1 = objectInputStream.readInt();
        final byte[] array = new byte[int1];
        objectInputStream.read(array, 0, int1);
        this.field14051 = ByteBuffer.wrap(array, 0, int1);
    }
    
    public String method9446() {
        return this.field14050;
    }
}
