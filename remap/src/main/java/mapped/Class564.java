// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class564 extends AbstractGui implements IRenderable, IGuiEventListener
{
    private static final ResourceLocation field3351;
    private final List<Class588> field3352;
    private boolean field3353;
    private int field3354;
    private int field3355;
    private Minecraft field3356;
    private Class9586 field3357;
    private IRecipe<?> field3358;
    private float field3359;
    private boolean field3360;
    
    public Class564() {
        this.field3352 = Lists.newArrayList();
    }
    
    public void method3280(final Minecraft field3356, final Class9586 field3357, final int field3358, final int field3359, final int n, final int n2, final float n3) {
        this.field3356 = field3356;
        this.field3357 = field3357;
        if (field3356.player.field3009 instanceof Class3429) {
            this.field3360 = true;
        }
        final boolean method19705 = field3356.player.method4122().method19705((Class3426<?>)field3356.player.field3009);
        final List<IRecipe<?>> method19706 = field3357.method35947(true);
        final List<IRecipe<?>> list = method19705 ? Collections.emptyList() : field3357.method35947(false);
        final int size = method19706.size();
        final int a = size + list.size();
        final int b = (a > 16) ? 5 : 4;
        final int n4 = (int)Math.ceil(a / (float)b);
        this.field3354 = field3358;
        this.field3355 = field3359;
        final float n5 = (float)(this.field3354 + Math.min(a, b) * 25);
        final float n6 = (float)(n + 50);
        if (n5 > n6) {
            this.field3354 -= (int)(n3 * (int)((n5 - n6) / n3));
        }
        final float n7 = (float)(this.field3355 + n4 * 25);
        final float n8 = (float)(n2 + 50);
        if (n7 > n8) {
            this.field3355 -= (int)(n3 * MathHelper.ceil((n7 - n8) / n3));
        }
        final float n9 = (float)this.field3355;
        final float n10 = (float)(n2 - 100);
        if (n9 < n10) {
            this.field3355 -= (int)(n3 * MathHelper.ceil((n9 - n10) / n3));
        }
        this.field3353 = true;
        this.field3352.clear();
        for (int i = 0; i < a; ++i) {
            final boolean b2 = i < size;
            final IRecipe class3662 = b2 ? method19706.get(i) : list.get(i - size);
            final int n11 = this.field3354 + 4 + 25 * (i % b);
            final int n12 = this.field3355 + 5 + 25 * (i / b);
            if (!this.field3360) {
                this.field3352.add(new Class588(n11, n12, class3662, b2));
            }
            else {
                this.field3352.add(new Class589(n11, n12, class3662, b2));
            }
        }
        this.field3358 = null;
    }
    
    @Override
    public boolean changeFocus(final boolean b) {
        return false;
    }
    
    public Class9586 method3282() {
        return this.field3357;
    }
    
    public IRecipe<?> method3283() {
        return this.field3358;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            for (final Class588 class588 : this.field3352) {
                if (!class588.mouseClicked(n, n2, n3)) {
                    continue;
                }
                this.field3358 = Class588.method3457(class588);
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public boolean isMouseOver(final double n, final double n2) {
        return false;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (this.field3353) {
            this.field3359 += n3;
            RenderSystem.enableBlend();
            RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            this.field3356.method5290().method5849(Class564.field3351);
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 170.0f);
            final int b = (this.field3352.size() > 16) ? 5 : 4;
            this.method3284(Math.min(this.field3352.size(), b), MathHelper.ceil(this.field3352.size() / (float)b), 24, 4, 82, 208);
            RenderSystem.disableBlend();
            final Iterator<Class588> iterator = this.field3352.iterator();
            while (iterator.hasNext()) {
                iterator.next().render(n, n2, n3);
            }
            RenderSystem.popMatrix();
        }
    }
    
    private void method3284(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.blit(this.field3354, this.field3355, n5, n6, n4, n4);
        this.blit(this.field3354 + n4 * 2 + n * n3, this.field3355, n5 + n3 + n4, n6, n4, n4);
        this.blit(this.field3354, this.field3355 + n4 * 2 + n2 * n3, n5, n6 + n3 + n4, n4, n4);
        this.blit(this.field3354 + n4 * 2 + n * n3, this.field3355 + n4 * 2 + n2 * n3, n5 + n3 + n4, n6 + n3 + n4, n4, n4);
        for (int i = 0; i < n; ++i) {
            this.blit(this.field3354 + n4 + i * n3, this.field3355, n5 + n4, n6, n3, n4);
            this.blit(this.field3354 + n4 + (i + 1) * n3, this.field3355, n5 + n4, n6, n4, n4);
            for (int j = 0; j < n2; ++j) {
                if (i == 0) {
                    this.blit(this.field3354, this.field3355 + n4 + j * n3, n5, n6 + n4, n4, n3);
                    this.blit(this.field3354, this.field3355 + n4 + (j + 1) * n3, n5, n6 + n4, n4, n4);
                }
                this.blit(this.field3354 + n4 + i * n3, this.field3355 + n4 + j * n3, n5 + n4, n6 + n4, n3, n3);
                this.blit(this.field3354 + n4 + (i + 1) * n3, this.field3355 + n4 + j * n3, n5 + n4, n6 + n4, n4, n3);
                this.blit(this.field3354 + n4 + i * n3, this.field3355 + n4 + (j + 1) * n3, n5 + n4, n6 + n4, n3, n4);
                this.blit(this.field3354 + n4 + (i + 1) * n3 - 1, this.field3355 + n4 + (j + 1) * n3 - 1, n5 + n4, n6 + n4, n4 + 1, n4 + 1);
                if (i == n - 1) {
                    this.blit(this.field3354 + n4 * 2 + n * n3, this.field3355 + n4 + j * n3, n5 + n3 + n4, n6 + n4, n4, n3);
                    this.blit(this.field3354 + n4 * 2 + n * n3, this.field3355 + n4 + (j + 1) * n3, n5 + n3 + n4, n6 + n4, n4, n4);
                }
            }
            this.blit(this.field3354 + n4 + i * n3, this.field3355 + n4 * 2 + n2 * n3, n5 + n4, n6 + n3 + n4, n3, n4);
            this.blit(this.field3354 + n4 + (i + 1) * n3, this.field3355 + n4 * 2 + n2 * n3, n5 + n4, n6 + n3 + n4, n4, n4);
        }
    }
    
    public void method3285(final boolean field3353) {
        this.field3353 = field3353;
    }
    
    public boolean method3286() {
        return this.field3353;
    }
    
    static {
        field3351 = new ResourceLocation("textures/gui/recipe_book.png");
    }
}
