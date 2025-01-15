// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class65 extends Class61
{
    private static String[] field149;
    private float field150;
    
    public Class65(final String s) {
        this(s, 0.0f);
    }
    
    public Class65(final String s, final float field150) {
        super(s);
        this.field150 = field150;
    }
    
    public Float method391() {
        return this.field150;
    }
    
    public void method392(final float field150) {
        this.field150 = field150;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field150 = dataInput.readFloat();
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.field150);
    }
    
    @Override
    public Class65 clone() {
        return new Class65(this.method375(), this.method391());
    }
}
