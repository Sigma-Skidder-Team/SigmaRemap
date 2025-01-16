// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;

public class Class7911 extends Class7909<Class7255>
{
    private static String[] field32486;
    private int field32487;
    private Class7909<Class7255> field32488;
    
    public Class7911(final ResourceLocation class1932) {
        super(class1932);
        this.field32487 = -1;
    }
    
    public boolean method25623(final Class7255 class7255) {
        if (this.field32487 != Class7324.method22481()) {
            this.field32488 = Class7324.method22482().method18461(this.method25621());
            this.field32487 = Class7324.method22481();
        }
        return this.field32488.method25618(class7255);
    }
    
    @Override
    public Collection<Class7255> method25616() {
        if (this.field32487 != Class7324.method22481()) {
            this.field32488 = Class7324.method22482().method18461(this.method25621());
            this.field32487 = Class7324.method22481();
        }
        return this.field32488.method25616();
    }
    
    @Override
    public Collection<Class6967<Class7255>> method25617() {
        if (this.field32487 != Class7324.method22481()) {
            this.field32488 = Class7324.method22482().method18461(this.method25621());
            this.field32487 = Class7324.method22481();
        }
        return this.field32488.method25617();
    }
}
