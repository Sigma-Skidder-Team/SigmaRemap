// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4262 implements Class4252<Class5800>
{
    private static String[] field19123;
    private ITextComponent field19124;
    
    public Class4262() {
    }
    
    public Class4262(final ITextComponent field19124) {
        this.field19124 = field19124;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19124 = class8654.method29497();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29498(this.field19124);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17290(this);
    }
    
    public ITextComponent method12793() {
        return this.field19124;
    }
}
