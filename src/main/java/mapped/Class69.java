// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class69 extends Class61
{
    private static String[] field157;
    private long field158;
    
    public Class69(final String s) {
        this(s, 0L);
    }
    
    public Class69(final String s, final long field158) {
        super(s);
        this.field158 = field158;
    }
    
    public Long method402() {
        return this.field158;
    }
    
    public void method403(final long field158) {
        this.field158 = field158;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field158 = dataInput.readLong();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.field158);
    }
    
    @Override
    public Class69 clone() {
        return new Class69(this.method375(), this.method402());
    }
}
