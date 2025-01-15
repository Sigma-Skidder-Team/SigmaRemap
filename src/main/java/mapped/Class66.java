// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class66 extends Class61
{
    private static String[] field151;
    private double field152;
    
    public Class66(final String s) {
        this(s, 0.0);
    }
    
    public Class66(final String s, final double field152) {
        super(s);
        this.field152 = field152;
    }
    
    public Double method393() {
        return this.field152;
    }
    
    public void method394(final double field152) {
        this.field152 = field152;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field152 = dataInput.readDouble();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.field152);
    }
    
    @Override
    public Class66 clone() {
        return new Class66(this.method375(), this.method393());
    }
}
