// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class63 extends Class61
{
    private static String[] field145;
    private short[] field146;
    
    public Class63(final String s) {
        this(s, new short[0]);
    }
    
    public Class63(final String s, final short[] field146) {
        super(s);
        this.field146 = field146;
    }
    
    public short[] method381() {
        return this.field146.clone();
    }
    
    public void method382(final short[] array) {
        if (array != null) {
            this.field146 = array.clone();
        }
    }
    
    public short method383(final int n) {
        return this.field146[n];
    }
    
    public void method384(final int n, final short n2) {
        this.field146[n] = n2;
    }
    
    public int method385() {
        return this.field146.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field146 = new short[dataInput.readInt()];
        for (int i = 0; i < this.field146.length; ++i) {
            this.field146[i] = dataInput.readShort();
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field146.length);
        for (int i = 0; i < this.field146.length; ++i) {
            dataOutput.writeShort(this.field146[i]);
        }
    }
    
    @Override
    public Class63 clone() {
        return new Class63(this.method375(), this.method381());
    }
}
