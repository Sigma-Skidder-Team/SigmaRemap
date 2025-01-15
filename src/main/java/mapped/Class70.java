// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class70 extends Class61
{
    private static String[] field159;
    private short field160;
    
    public Class70(final String s) {
        this(s, (short)0);
    }
    
    public Class70(final String s, final short field160) {
        super(s);
        this.field160 = field160;
    }
    
    public Short method404() {
        return this.field160;
    }
    
    public void method405(final short field160) {
        this.field160 = field160;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field160 = dataInput.readShort();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeShort(this.field160);
    }
    
    @Override
    public Class70 clone() {
        return new Class70(this.method375(), this.method404());
    }
}
