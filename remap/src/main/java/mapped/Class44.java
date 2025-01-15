// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.io.IOException;
import java.io.DataOutput;

public class Class44 extends Class43
{
    public static final Class44 field104;
    public static final Class6068<Class44> field105;
    private final double field106;
    
    private Class44(final double field106) {
        this.field106 = field106;
    }
    
    public static Class44 method277(final double n) {
        return (n != 0.0) ? new Class44(n) : Class44.field104;
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeDouble(this.field106);
    }
    
    @Override
    public byte method260() {
        return 6;
    }
    
    @Override
    public Class6068<Class44> method261() {
        return Class44.field105;
    }
    
    @Override
    public String toString() {
        return this.field106 + "d";
    }
    
    public Class44 method278() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class44 && this.field106 == ((Class44)o).field106);
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.field106);
        return (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public Class2250 method263(final String s, final int n) {
        return new Class2260(String.valueOf(this.field106)).method8458(new Class2260("d").method8469(Class44.field101)).method8469(Class44.field100);
    }
    
    @Override
    public long method270() {
        return (long)Math.floor(this.field106);
    }
    
    @Override
    public int method271() {
        return MathHelper.floor(this.field106);
    }
    
    @Override
    public short method272() {
        return (short)(MathHelper.floor(this.field106) & 0xFFFF);
    }
    
    @Override
    public byte method273() {
        return (byte)(MathHelper.floor(this.field106) & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.field106;
    }
    
    @Override
    public float method275() {
        return (float)this.field106;
    }
    
    @Override
    public Number method276() {
        return this.field106;
    }
    
    static {
        field104 = new Class44(0.0);
        field105 = new Class6069();
    }
}
