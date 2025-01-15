// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataOutput;

public class Class49 extends Class43
{
    public static final Class6068<Class49> field119;
    private final long field120;
    
    private Class49(final long field120) {
        this.field120 = field120;
    }
    
    public static Class49 method288(final long n) {
        return (n >= -128L && n <= 1024L) ? Class7458.field28767[(int)n + 128] : new Class49(n);
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.field120);
    }
    
    @Override
    public byte method260() {
        return 4;
    }
    
    @Override
    public Class6068<Class49> method261() {
        return Class49.field119;
    }
    
    @Override
    public String toString() {
        return this.field120 + "L";
    }
    
    public Class49 method289() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class49 && this.field120 == ((Class49)o).field120);
    }
    
    @Override
    public int hashCode() {
        return (int)(this.field120 ^ this.field120 >>> 32);
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        return new Class2260(String.valueOf(this.field120)).method8458(new Class2260("L").method8469(Class49.field101)).method8469(Class49.field100);
    }
    
    @Override
    public long method270() {
        return this.field120;
    }
    
    @Override
    public int method271() {
        return (int)(this.field120 & -1L);
    }
    
    @Override
    public short method272() {
        return (short)(this.field120 & 0xFFFFL);
    }
    
    @Override
    public byte method273() {
        return (byte)(this.field120 & 0xFFL);
    }
    
    @Override
    public double method274() {
        return (double)this.field120;
    }
    
    @Override
    public float method275() {
        return (float)this.field120;
    }
    
    @Override
    public Number method276() {
        return this.field120;
    }
    
    static {
        field119 = new Class6067();
    }
}
