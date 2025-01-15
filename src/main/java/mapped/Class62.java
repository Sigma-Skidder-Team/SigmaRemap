// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.DataOutput;
import java.io.IOException;
import java.io.DataInput;

public class Class62 extends Class61
{
    private static String[] field143;
    private int[] field144;
    
    public Class62(final String s) {
        this(s, new int[0]);
    }
    
    public Class62(final String s, final int[] field144) {
        super(s);
        this.field144 = field144;
    }
    
    public int[] method376() {
        return this.field144.clone();
    }
    
    public void method377(final int[] array) {
        if (array != null) {
            this.field144 = array.clone();
        }
    }
    
    public int method378(final int n) {
        return this.field144[n];
    }
    
    public void method379(final int n, final int n2) {
        this.field144[n] = n2;
    }
    
    public int method380() {
        return this.field144.length;
    }
    
    @Override
    public void method372(final DataInput dataInput) throws IOException {
        this.field144 = new int[dataInput.readInt()];
        for (int i = 0; i < this.field144.length; ++i) {
            this.field144[i] = dataInput.readInt();
        }
    }
    
    @Override
    public void method373(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field144.length);
        for (int i = 0; i < this.field144.length; ++i) {
            dataOutput.writeInt(this.field144[i]);
        }
    }
    
    @Override
    public Class62 clone() {
        return new Class62(this.method375(), this.method376());
    }
}
