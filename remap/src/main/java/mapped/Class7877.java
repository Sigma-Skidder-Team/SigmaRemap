// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class7877
{
    private static String[] field32333;
    private IRecipe<?> field32334;
    private final List<Class7997> field32335;
    private float field32336;
    
    public Class7877() {
        this.field32335 = Lists.newArrayList();
    }
    
    public void method25520() {
        this.field32334 = null;
        this.field32335.clear();
        this.field32336 = 0.0f;
    }
    
    public void method25521(final Ingredient class120, final int n, final int n2) {
        this.field32335.add(new Class7997(this, class120, n, n2));
    }
    
    public Class7997 method25522(final int n) {
        return this.field32335.get(n);
    }
    
    public int method25523() {
        return this.field32335.size();
    }
    
    @Nullable
    public IRecipe<?> method25524() {
        return this.field32334;
    }
    
    public void method25525(final IRecipe<?> field32334) {
        this.field32334 = field32334;
    }
    
    public void method25526(final Minecraft class869, final int n, final int n2, final boolean b, final float n3) {
        if (!Screen.method3046()) {
            this.field32336 += n3;
        }
        for (int i = 0; i < this.field32335.size(); ++i) {
            final Class7997 class870 = this.field32335.get(i);
            final int n4 = class870.method26162() + n;
            final int n5 = class870.method26163() + n2;
            if (i == 0 && b) {
                AbstractGui.fill(n4 - 4, n5 - 4, n4 + 20, n5 + 20, 822018048);
            }
            else {
                AbstractGui.fill(n4, n5, n4 + 16, n5 + 16, 822018048);
            }
            final ItemStack method26164 = class870.method26164();
            final ItemRenderer method26165 = class869.getItemRenderer();
            method26165.method6541(class869.player, method26164, n4, n5);
            RenderSystem.method30009(516);
            AbstractGui.fill(n4, n5, n4 + 16, n5 + 16, 822083583);
            RenderSystem.method30009(515);
            if (i == 0) {
                method26165.method6542(class869.fontRenderer, method26164, n4, n5);
            }
        }
    }
}
