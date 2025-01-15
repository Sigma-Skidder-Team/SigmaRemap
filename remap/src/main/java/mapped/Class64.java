// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class64 extends Class61
{
    private static String[] field147;
    private float[] field148;
    
    public Class64(final String s) {
        this(s, new float[0]);
    }
    
    public Class64(final String s, final float[] field148) {
        super(s);
        this.field148 = field148;
    }
    
    public float[] method386() {
        return this.field148.clone();
    }
    
    public void method387(final float[] array) {
        if (array != null) {
            this.field148 = array.clone();
        }
    }
    
    public float method388(final int n) {
        return this.field148[n];
    }
    
    public void method389(final int n, final float n2) {
        this.field148[n] = n2;
    }
    
    public int method390() {
        return this.field148.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field148 = new float[dataInput.readInt()];
        for (int i = 0; i < this.field148.length; ++i) {
            this.field148[i] = dataInput.readFloat();
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field148.length);
        for (int i = 0; i < this.field148.length; ++i) {
            dataOutput.writeFloat(this.field148[i]);
        }
    }
    
    @Override
    public Class64 clone() {
        return new Class64(this.method375(), this.method386());
    }
}
