// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.List;

public class Class646 extends Class645
{
    private static String[] field3663;
    private final Class1956 field3664;
    private float field3665;
    
    public Class646(final Class1956 field3664) {
        super(0, 0, 35, 27, false);
        this.field3664 = field3664;
        this.method3690(153, 2, 35, 0, Class581.field3462);
    }
    
    public void method3694(final Minecraft class869) {
        final Class6520 method4122 = class869.player.method4122();
        final List<Class9586> method4123 = method4122.method19689(this.field3664);
        if (class869.player.field3009 instanceof Class3426) {
            final Iterator<Class9586> iterator = method4123.iterator();
            while (iterator.hasNext()) {
                final Iterator<IRecipe<?>> iterator2 = iterator.next().method35946(method4122.method19705((Class3426<?>)class869.player.field3009)).iterator();
                while (iterator2.hasNext()) {
                    if (!method4122.method19699(iterator2.next())) {
                        continue;
                    }
                    this.field3665 = 15.0f;
                }
            }
        }
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        if (this.field3665 > 0.0f) {
            final float n4 = 1.0f + 0.1f * (float)Math.sin(this.field3665 / 15.0f * 3.1415927f);
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.field3426 + 8), (float)(this.field3427 + 12), 0.0f);
            RenderSystem.method30063(1.0f, n4, 1.0f);
            RenderSystem.translatef((float)(-(this.field3426 + 8)), (float)(-(this.field3427 + 12)), 0.0f);
        }
        final Minecraft method5277 = Minecraft.getInstance();
        method5277.method5290().method5849(this.field3657);
        RenderSystem.disableDepthTest();
        int field3659 = this.field3659;
        int field3660 = this.field3660;
        if (this.field3658) {
            field3659 += this.field3661;
        }
        if (this.method3360()) {
            field3660 += this.field3662;
        }
        int field3661 = this.field3426;
        if (this.field3658) {
            field3661 -= 2;
        }
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.blit(field3661, this.field3427, field3659, field3660, this.field3424, this.field3425);
        RenderSystem.enableDepthTest();
        this.method3695(method5277.getItemRenderer());
        if (this.field3665 > 0.0f) {
            RenderSystem.popMatrix();
            this.field3665 -= n3;
        }
    }
    
    private void method3695(final ItemRenderer class1796) {
        final List<ItemStack> method7942 = this.field3664.method7942();
        final int n = this.field3658 ? -2 : 0;
        if (method7942.size() != 1) {
            if (method7942.size() == 2) {
                class1796.method6540(method7942.get(0), this.field3426 + 3 + n, this.field3427 + 5);
                class1796.method6540(method7942.get(1), this.field3426 + 14 + n, this.field3427 + 5);
            }
        }
        else {
            class1796.method6540(method7942.get(0), this.field3426 + 9 + n, this.field3427 + 5);
        }
    }
    
    public Class1956 method3696() {
        return this.field3664;
    }
    
    public boolean method3697(final Class6520 class6520) {
        final List<Class9586> method19689 = class6520.method19689(this.field3664);
        this.field3432 = false;
        if (method19689 != null) {
            for (final Class9586 class6521 : method19689) {
                if (class6521.method35939() && class6521.method35944()) {
                    this.field3432 = true;
                    break;
                }
            }
        }
        return this.field3432;
    }
}
