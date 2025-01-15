// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class68 extends Class61
{
    private static String[] field155;
    private int field156;
    
    public Class68(final String s) {
        this(s, 0);
    }
    
    public Class68(final String s, final int field156) {
        super(s);
        this.field156 = field156;
    }
    
    public Integer method400() {
        return this.field156;
    }
    
    public void method401(final int field156) {
        this.field156 = field156;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field156 = dataInput.readInt();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field156);
    }
    
    @Override
    public Class68 clone() {
        return new Class68(this.method375(), this.method400());
    }
}
