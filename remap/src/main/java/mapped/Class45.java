// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class45 extends Class43
{
    private static String[] field107;
    public static final Class6068<Class45> field108;
    private final int field109;
    
    private Class45(final int field109) {
        this.field109 = field109;
    }
    
    public static Class45 method279(final int n) {
        return (n >= -128 && n <= 1024) ? Class8849.field37206[n + 128] : new Class45(n);
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.field109);
    }
    
    @Override
    public byte method260() {
        return 3;
    }
    
    @Override
    public Class6068<Class45> method261() {
        return Class45.field108;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.field109);
    }
    
    public Class45 method280() {
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class45 && this.field109 == ((Class45)o).field109);
    }
    
    @Override
    public int hashCode() {
        return this.field109;
    }
    
    @Override
    public ITextComponent method263(final String s, final int n) {
        return new Class2260(String.valueOf(this.field109)).method8469(Class45.field100);
    }
    
    @Override
    public long method270() {
        return this.field109;
    }
    
    @Override
    public int method271() {
        return this.field109;
    }
    
    @Override
    public short method272() {
        return (short)(this.field109 & 0xFFFF);
    }
    
    @Override
    public byte method273() {
        return (byte)(this.field109 & 0xFF);
    }
    
    @Override
    public double method274() {
        return this.field109;
    }
    
    @Override
    public float method275() {
        return (float)this.field109;
    }
    
    @Override
    public Number method276() {
        return this.field109;
    }
    
    static {
        field108 = new Class6075();
    }
}
