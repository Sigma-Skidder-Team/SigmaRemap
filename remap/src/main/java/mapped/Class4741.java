// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4741 extends Class4712<Class838, Class5845<Class838>>
{
    private static final ResourceLocation field20357;
    private int field20358;
    private final Class5893<Class838> field20359;
    private final Class5883<Class838> field20360;
    private final Class5889<Class838> field20361;
    
    public Class4741(final Class8551 class8551) {
        super(class8551, new Class5889(), 0.2f);
        this.field20359 = new Class5893<Class838>();
        this.field20360 = new Class5883<Class838>();
        this.field20361 = new Class5889<Class838>();
        this.field20358 = 3;
    }
    
    public ResourceLocation method14066(final Class838 class838) {
        return Class4741.field20357;
    }
    
    public void method14067(final Class838 class838, final float n, final float n2, final MatrixStack class839, final IRenderTypeBuffer class840, final int n3) {
        final int method4988 = class838.method4988();
        if (method4988 != this.field20358) {
            if (method4988 != 0) {
                if (method4988 != 1) {
                    this.field20301 = this.field20361;
                }
                else {
                    this.field20301 = this.field20360;
                }
            }
            else {
                this.field20301 = this.field20359;
            }
        }
        this.field20358 = method4988;
        this.field20284 = 0.1f + 0.1f * method4988;
        super.method14006(class838, n, n2, class839, class840, n3);
    }
    
    public void method14068(final Class838 class838, final MatrixStack class839, final float n, final float n2, final float n3) {
        class839.method22564(0.0, MathHelper.cos(n * 0.05f) * 0.08f, 0.0);
        super.method13985(class838, class839, n, n2, n3);
    }
    
    static {
        field20357 = new ResourceLocation("textures/entity/fish/pufferfish.png");
    }
}
