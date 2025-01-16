// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public abstract class Class5921<E extends Entity> extends Class5844<E>
{
    private float field24321;
    private float field24322;
    private float field24323;
    
    public Class5921() {
        this.field24321 = 1.0f;
        this.field24322 = 1.0f;
        this.field24323 = 1.0f;
    }
    
    public void method17791(final float field24321, final float field24322, final float field24323) {
        this.field24321 = field24321;
        this.field24322 = field24322;
        this.field24323 = field24323;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        super.method17564(class7351, class7352, n, n2, this.field24321 * n3, this.field24322 * n4, this.field24323 * n5, n6);
    }
}
