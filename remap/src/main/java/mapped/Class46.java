// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class46 extends Class43
{
    public static final Class46 field110;
    public static final Class6068<Class46> field111;
    private final float field112;
    
    private Class46(final float field112) {
        this.field112 = field112;
    }
    
    public static Class46 method281(final float n) {
        return (n != 0.0f) ? new Class46(n) : Class46.field110;
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeFloat(this.field112);
    }
    
    @Override
    public byte method260() {
        return 5;
    }
    
    @Override
    public Class6068<Class46> method261() {
        return Class46.field111;
    }
    
    @Override
    public String toString() {
        return this.field112 + "f";
    }
    
    public Class46 method282() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class46 && this.field112 == ((Class46)o).field112);
    }
    
    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.field112);
    }
    
    @Override
    public ITextComponent method263(final String s, final int n) {
        return new Class2260(String.valueOf(this.field112)).method8458(new Class2260("f").method8469(Class46.field101)).method8469(Class46.field100);
    }
    
    @Override
    public long method270() {
        return (long)this.field112;
    }
    
    @Override
    public int method271() {
        return MathHelper.method35642(this.field112);
    }
    
    @Override
    public short method272() {
        return (short)(MathHelper.method35642(this.field112) & 0xFFFF);
    }
    
    @Override
    public byte method273() {
        return (byte)(MathHelper.method35642(this.field112) & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.field112;
    }
    
    @Override
    public float method275() {
        return this.field112;
    }
    
    @Override
    public Number method276() {
        return this.field112;
    }
    
    static {
        field110 = new Class46(0.0f);
        field111 = new Class6077();
    }
}
