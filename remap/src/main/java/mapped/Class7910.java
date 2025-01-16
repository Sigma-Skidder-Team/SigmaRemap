// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class7910 extends Class7909<Block>
{
    private static String[] field32483;
    private int field32484;
    private Class7909<Block> field32485;
    
    public Class7910(final ResourceLocation class1932) {
        super(class1932);
        this.field32484 = -1;
    }
    
    public boolean method25622(final Block class3833) {
        if (this.field32484 != Class7188.method22060()) {
            this.field32485 = Class7188.method22061().method18461(this.method25621());
            this.field32484 = Class7188.method22060();
        }
        return this.field32485.method25618(class3833);
    }
    
    @Override
    public Collection<Block> method25616() {
        if (this.field32484 != Class7188.method22060()) {
            this.field32485 = Class7188.method22061().method18461(this.method25621());
            this.field32484 = Class7188.method22060();
        }
        return this.field32485.method25616();
    }
    
    @Override
    public Collection<Class6967<Block>> method25617() {
        if (this.field32484 != Class7188.method22060()) {
            this.field32485 = Class7188.method22061().method18461(this.method25621());
            this.field32484 = Class7188.method22060();
        }
        return this.field32485.method25617();
    }
}
