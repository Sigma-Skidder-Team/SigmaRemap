// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class75 extends Class61
{
    private static String[] field167;
    private long[] field168;
    
    public Class75(final String s) {
        this(s, new long[0]);
    }
    
    public Class75(final String s, final long[] field168) {
        super(s);
        this.field168 = field168;
    }
    
    public long[] method425() {
        return this.field168.clone();
    }
    
    public void method426(final long[] array) {
        if (array != null) {
            this.field168 = array.clone();
        }
    }
    
    public long method427(final int n) {
        return this.field168[n];
    }
    
    public void method428(final int n, final long n2) {
        this.field168[n] = n2;
    }
    
    public int method429() {
        return this.field168.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field168 = new long[dataInput.readInt()];
        for (int i = 0; i < this.field168.length; ++i) {
            this.field168[i] = dataInput.readLong();
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field168.length);
        for (int i = 0; i < this.field168.length; ++i) {
            dataOutput.writeLong(this.field168[i]);
        }
    }
    
    @Override
    public Class75 clone() {
        return new Class75(this.method375(), this.method425());
    }
}
