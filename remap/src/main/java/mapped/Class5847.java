// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public abstract class Class5847<E extends Entity> extends Class5846<E>
{
    private float field23958;
    private float field23959;
    private float field23960;
    
    public Class5847() {
        this.field23958 = 1.0f;
        this.field23959 = 1.0f;
        this.field23960 = 1.0f;
    }
    
    public void method17572(final float field23958, final float field23959, final float field23960) {
        this.field23958 = field23958;
        this.field23959 = field23959;
        this.field23960 = field23960;
    }
    
    @Override
    public void method17564(final MatrixStack class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        super.method17564(class7351, class7352, n, n2, this.field23958 * n3, this.field23959 * n4, this.field23960 * n5, n6);
    }
}
