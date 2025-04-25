// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.List;

public class Class647 extends Widget
{
    private static final ResourceLocation field3666;
    private Class3426<?> field3667;
    private Class6521 field3668;
    private Class9586 field3669;
    private float field3670;
    private float field3671;
    private int field3672;
    
    public Class647() {
        super(0, 0, 25, 25, "");
    }
    
    public void method3698(final Class9586 field3669, final Class9257 class9257) {
        this.field3669 = field3669;
        this.field3667 = (Class3426)class9257.method34160().player.field3009;
        this.field3668 = class9257.method34161();
        final List<IRecipe<?>> method35946 = field3669.method35946(this.field3668.method19705(this.field3667));
        final Iterator<IRecipe<?>> iterator = method35946.iterator();
        while (iterator.hasNext()) {
            if (!this.field3668.method19699(iterator.next())) {
                continue;
            }
            class9257.method34159(method35946);
            this.field3671 = 15.0f;
            break;
        }
    }
    
    public Class9586 method3699() {
        return this.field3669;
    }
    
    public void method3700(final int field3426, final int field3427) {
        this.field3426 = field3426;
        this.field3427 = field3427;
    }
    
    @Override
    public void method3353(final int n, final int n2, final float n3) {
        if (!Screen.method3046()) {
            this.field3670 += n3;
        }
        final Minecraft method5277 = Minecraft.getInstance();
        method5277.method5290().method5849(Class647.field3666);
        int n4 = 29;
        if (!this.field3669.method35943()) {
            n4 += 25;
        }
        int n5 = 206;
        if (this.field3669.method35946(this.field3668.method19705(this.field3667)).size() > 1) {
            n5 += 25;
        }
        final boolean b = this.field3671 > 0.0f;
        if (b) {
            final float n6 = 1.0f + 0.1f * (float)Math.sin(this.field3671 / 15.0f * 3.1415927f);
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)(this.field3426 + 8), (float)(this.field3427 + 12), 0.0f);
            RenderSystem.method30063(n6, n6, 1.0f);
            RenderSystem.translatef((float)(-(this.field3426 + 8)), (float)(-(this.field3427 + 12)), 0.0f);
            this.field3671 -= n3;
        }
        this.blit(this.field3426, this.field3427, n4, n5, this.field3424, this.field3425);
        final List<IRecipe<?>> method5278 = this.method3701();
        this.field3672 = MathHelper.method35642(this.field3670 / 30.0f) % method5278.size();
        final ItemStack method5279 = method5278.get(this.field3672).getRecipeOutput();
        int n7 = 4;
        if (this.field3669.method35949()) {
            if (this.method3701().size() > 1) {
                method5277.getItemRenderer().method6540(method5279, this.field3426 + n7 + 1, this.field3427 + n7 + 1);
                --n7;
            }
        }
        method5277.getItemRenderer().method6540(method5279, this.field3426 + n7, this.field3427 + n7);
        if (b) {
            RenderSystem.popMatrix();
        }
    }
    
    private List<IRecipe<?>> method3701() {
        final List<IRecipe<?>> method35947 = this.field3669.method35947(true);
        if (!this.field3668.method19705(this.field3667)) {
            method35947.addAll(this.field3669.method35947(false));
        }
        return method35947;
    }
    
    public boolean method3702() {
        return this.method3701().size() == 1;
    }
    
    public IRecipe<?> method3703() {
        return this.method3701().get(this.field3672);
    }
    
    public List<String> method3704(final Screen class527) {
        final List<String> method3030 = class527.getTooltipFromItem(this.method3701().get(this.field3672).getRecipeOutput());
        if (this.field3669.method35946(this.field3668.method19705(this.field3667)).size() > 1) {
            method3030.add(Class8822.method30773("gui.recipebook.moreRecipes", new Object[0]));
        }
        return method3030;
    }
    
    @Override
    public int method3364() {
        return 25;
    }
    
    @Override
    public boolean method3358(final int n) {
        return n == 0 || n == 1;
    }
    
    static {
        field3666 = new ResourceLocation("textures/gui/recipe_book.png");
    }
}
