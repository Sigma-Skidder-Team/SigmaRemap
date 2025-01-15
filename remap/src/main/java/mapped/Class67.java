// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class67 extends Class61
{
    private static String[] field153;
    private byte[] field154;
    
    public Class67(final String s) {
        this(s, new byte[0]);
    }
    
    public Class67(final String s, final byte[] field154) {
        super(s);
        this.field154 = field154;
    }
    
    public byte[] method395() {
        return this.field154.clone();
    }
    
    public void method396(final byte[] array) {
        if (array != null) {
            this.field154 = array.clone();
        }
    }
    
    public byte method397(final int n) {
        return this.field154[n];
    }
    
    public void method398(final int n, final byte b) {
        this.field154[n] = b;
    }
    
    public int method399() {
        return this.field154.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        dataInput.readFully(this.field154 = new byte[dataInput.readInt()]);
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field154.length);
        dataOutput.write(this.field154);
    }
    
    @Override
    public Class67 clone() {
        return new Class67(this.method375(), this.method395());
    }
}
