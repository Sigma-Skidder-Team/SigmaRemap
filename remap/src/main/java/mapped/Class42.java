// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;
import java.io.DataOutput;

public class Class42 implements Class41
{
    public static final Class6068<Class42> field102;
    public static final Class42 field103;
    
    private Class42() {
    }
    
    @Override
    public void method259(final DataOutput dataOutput) throws IOException {
    }
    
    @Override
    public byte method260() {
        return 0;
    }
    
    @Override
    public Class6068<Class42> method261() {
        return Class42.field102;
    }
    
    @Override
    public String toString() {
        return "END";
    }
    
    public Class42 method269() {
        return this;
    }
    
    @Override
    public ITextComponent method263(final String s, final int n) {
        return new Class2260("");
    }
    
    static {
        field102 = new Class6070();
        field103 = new Class42();
    }
}
