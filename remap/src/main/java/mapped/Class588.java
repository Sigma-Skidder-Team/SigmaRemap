// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class588 extends Widget implements Class587<Class120>
{
    private final Class3662<?> field3484;
    private final boolean field3485;
    public final List<Class8370> field3486;
    public final /* synthetic */ Class564 field3487;
    
    public Class588(final Class564 field3487, final int n, final int n2, final Class3662<?> field3488, final boolean field3489) {
        this.field3487 = field3487;
        super(n, n2, 200, 20, "");
        this.field3486 = Lists.newArrayList();
        this.field3424 = 24;
        this.field3425 = 24;
        this.field3484 = field3488;
        this.field3485 = field3489;
        this.method3456(field3488);
    }
    
    public void method3456(final Class3662<?> class3662) {
        this.method3455(3, 3, -1, class3662, class3662.method11294().iterator(), 0);
    }
    
    @Override
    public void method3440(final Iterator<Class120> iterator, final int n, final int n2, final int n3, final int n4) {
        final ItemStack[] method611 = iterator.next().method611();
        if (method611.length != 0) {
            this.field3486.add(new Class8370(this, 3 + n4 * 7, 3 + n3 * 7, method611));
        }
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        RenderSystem.enableAlphaTest();
        Class564.method3288(this.field3487).method5290().method5849(Class564.method3287());
        int n4 = 152;
        if (!this.field3485) {
            n4 += 26;
        }
        int n5 = Class564.method3289(this.field3487) ? 130 : 78;
        if (this.method3360()) {
            n5 += 26;
        }
        this.blit(this.field3426, this.field3427, n4, n5, this.field3424, this.field3425);
        for (final Class8370 class8370 : this.field3486) {
            RenderSystem.method30059();
            final int n6 = (int)((this.field3426 + class8370.field34328) / 0.42f - 3.0f);
            final int n7 = (int)((this.field3427 + class8370.field34329) / 0.42f - 3.0f);
            RenderSystem.method30063(0.42f, 0.42f, 1.0f);
            Class564.method3288(this.field3487).method5307().method6540(class8370.field34327[MathHelper.method35642(Class564.method3290(this.field3487) / 30.0f) % class8370.field34327.length], n6, n7);
            RenderSystem.method30060();
        }
        RenderSystem.disableAlphaTest();
    }
}
