// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4277 implements Class4252<Class5807>
{
    private static String[] field19186;
    private ITextComponent field19187;
    
    public Class4277() {
    }
    
    public Class4277(final ITextComponent field19187) {
        this.field19187 = field19187;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19187 = Class5953.method17873(class8654.method29513(262144));
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29498(this.field19187);
    }
    
    public void method12841(final Class5807 class5807) {
        class5807.method17406(this);
    }
    
    public ITextComponent method12842() {
        return this.field19187;
    }
}
