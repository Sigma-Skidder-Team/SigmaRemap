// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class554 extends Class527
{
    private final Class527 field3325;
    public final Class3416 field3326;
    private final ITextComponent field3327;
    private final boolean field3328;
    private final List<String> field3329;
    private final String field3330;
    private final String field3331;
    private final String field3332;
    private final String field3333;
    private Class682 field3334;
    
    public Class554(final Class527 field3325, final Class3416 field3326, final ITextComponent class2250, final ITextComponent field3327, final boolean field3328) {
        super(class2250);
        this.field3329 = Lists.newArrayList();
        this.field3325 = field3325;
        this.field3326 = field3326;
        this.field3327 = field3327;
        this.field3328 = field3328;
        this.field3330 = Class8822.method30773("selectWorld.backupEraseCache", new Object[0]);
        this.field3331 = Class8822.method30773("selectWorld.backupJoinConfirmButton", new Object[0]);
        this.field3332 = Class8822.method30773("selectWorld.backupJoinSkipButton", new Object[0]);
        this.field3333 = Class8822.method30773("gui.cancel", new Object[0]);
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field3329.clear();
        this.field3329.addAll(this.field3156.method6626(this.field3327.getFormattedText(), this.field3152 - 50));
        final int n = (this.field3329.size() + 1) * 9;
        this.method3029(new Class654(this.field3152 / 2 - 155, 100 + n, 150, 20, this.field3331, class654 -> this.field3326.method10853(true, this.field3334.method3743())));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 160, 100 + n, 150, 20, this.field3332, class654 -> this.field3326.method10853(false, this.field3334.method3743())));
        this.method3029(new Class654(this.field3152 / 2 - 155 + 80, 124 + n, 150, 20, this.field3333, class654 -> this.field3150.method5244(this.field3325)));
        this.field3334 = new Class682(this.field3152 / 2 - 155 + 80, 76 + n, 150, 20, this.field3330, false);
        if (this.field3328) {
            this.method3029(this.field3334);
        }
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 50, 16777215);
        int n4 = 70;
        final Iterator<String> iterator = this.field3329.iterator();
        while (iterator.hasNext()) {
            this.method3295(this.field3156, iterator.next(), this.field3152 / 2, n4, 16777215);
            n4 += 9;
        }
        super.method2975(n, n2, n3);
    }
    
    @Override
    public boolean method2989() {
        return false;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method2972(n, n2, n3);
        }
        this.field3150.method5244(this.field3325);
        return true;
    }
}