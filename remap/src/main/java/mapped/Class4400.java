// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.io.IOException;

public class Class4400 implements Class4252<Class5800>
{
    private static String[] field19712;
    private String field19713;
    private ITextComponent field19714;
    private Class263 field19715;
    private int field19716;
    
    public Class4400() {
    }
    
    public Class4400(final Class9290 class9290, final int field19716) {
        this.field19713 = class9290.method34312();
        this.field19714 = class9290.method34314();
        this.field19715 = class9290.method34317();
        this.field19716 = field19716;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19713 = class8654.method29513(16);
        this.field19716 = class8654.readByte();
        if (this.field19716 == 0 || this.field19716 == 2) {
            this.field19714 = class8654.method29497();
            this.field19715 = class8654.method29499(Class263.class);
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29514(this.field19713);
        class8654.writeByte(this.field19716);
        if (this.field19716 == 0 || this.field19716 == 2) {
            class8654.method29498(this.field19714);
            class8654.method29500(this.field19715);
        }
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17356(this);
    }
    
    public String method13240() {
        return this.field19713;
    }
    
    public ITextComponent method13241() {
        return this.field19714;
    }
    
    public int method13242() {
        return this.field19716;
    }
    
    public Class263 method13243() {
        return this.field19715;
    }
}
