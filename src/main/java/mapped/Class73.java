// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class73 extends Class61
{
    private static String[] field164;
    private double[] field165;
    
    public Class73(final String s) {
        this(s, new double[0]);
    }
    
    public Class73(final String s, final double[] field165) {
        super(s);
        this.field165 = field165;
    }
    
    public double[] method410() {
        return this.field165.clone();
    }
    
    public void method411(final double[] array) {
        if (array != null) {
            this.field165 = array.clone();
        }
    }
    
    public double method412(final int n) {
        return this.field165[n];
    }
    
    public void method413(final int n, final double n2) {
        this.field165[n] = n2;
    }
    
    public int method414() {
        return this.field165.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field165 = new double[dataInput.readInt()];
        for (int i = 0; i < this.field165.length; ++i) {
            this.field165[i] = dataInput.readDouble();
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field165.length);
        for (int i = 0; i < this.field165.length; ++i) {
            dataOutput.writeDouble(this.field165[i]);
        }
    }
    
    @Override
    public Class73 clone() {
        return new Class73(this.method375(), this.method410());
    }
}
