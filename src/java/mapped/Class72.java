// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class72 extends Class61
{
    private static String[] field162;
    private byte field163;
    
    public Class72(final String s) {
        this(s, (byte)0);
    }
    
    public Class72(final String s, final byte field163) {
        super(s);
        this.field163 = field163;
    }
    
    public Byte method408() {
        return this.field163;
    }
    
    public void method409(final byte field163) {
        this.field163 = field163;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field163 = dataInput.readByte();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.field163);
    }
    
    @Override
    public Class72 clone() {
        return new Class72(this.method375(), this.method408());
    }
}
