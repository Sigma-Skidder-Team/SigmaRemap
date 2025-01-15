// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public abstract class Class7180 implements Class7182
{
    public final /* synthetic */ Class6367 field27853;
    
    public Class7180(final Class6367 field27853) {
        this.field27853 = field27853;
    }
    
    @Override
    public int method21975(final float n) {
        return Math.max(MathHelper.method35642(this.field27853.field25468 + this.field27853.field25469 * n), 0);
    }
}
