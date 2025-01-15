// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.DataOutput;

public class Class47 extends Class43
{
    public static final Class6068<Class47> field113;
    public static final Class47 field114;
    public static final Class47 field115;
    private final byte field116;
    
    private Class47(final byte field116) {
        this.field116 = field116;
    }
    
    public static Class47 method283(final byte b) {
        return Class8548.method28694()[128 + b];
    }
    
    public static Class47 method284(final boolean b) {
        return b ? Class47.field115 : Class47.field114;
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.field116);
    }
    
    @Override
    public byte method260() {
        return 1;
    }
    
    @Override
    public Class6068<Class47> method261() {
        return Class47.field113;
    }
    
    @Override
    public String toString() {
        return this.field116 + "b";
    }
    
    public Class47 method285() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class47 && this.field116 == ((Class47)o).field116);
    }
    
    @Override
    public int hashCode() {
        return this.field116;
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        return new Class2260(String.valueOf(this.field116)).method8458(new Class2260("b").method8469(Class47.field101)).method8469(Class47.field100);
    }
    
    @Override
    public long method270() {
        return this.field116;
    }
    
    @Override
    public int method271() {
        return this.field116;
    }
    
    @Override
    public short method272() {
        return this.field116;
    }
    
    @Override
    public byte method273() {
        return this.field116;
    }
    
    @Override
    public double method274() {
        return this.field116;
    }
    
    @Override
    public float method275() {
        return this.field116;
    }
    
    @Override
    public Number method276() {
        return this.field116;
    }
    
    static {
        field113 = new Class6072();
        field114 = method283((byte)0);
        field115 = method283((byte)1);
    }
}
