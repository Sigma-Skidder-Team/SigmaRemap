// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class638 extends Class623<Class638>
{
    public final /* synthetic */ Class618 field3637;
    
    private Class638(final Class618 field3637) {
        this.field3637 = field3637;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final Class9127 class9127 = Class696.method3893(this.field3637.field3591).method21590().get(Class696.method3893(this.field3637.field3591).method21590().size() - n - 1);
        final Block method21696 = class9127.method33115().getBlock();
        Item class9128 = method21696.method11704();
        if (class9128 == Items.AIR) {
            if (method21696 != Class7521.field29173) {
                if (method21696 == Class7521.field29174) {
                    class9128 = Items.field31351;
                }
            }
            else {
                class9128 = Items.field31350;
            }
        }
        final ItemStack class9129 = new ItemStack(class9128);
        final String method21697 = class9128.method11729(class9129).getFormattedText();
        this.method3666(n3, n2, class9129);
        this.field3637.field3591.font.method6610(method21697, (float)(n3 + 18 + 5), (float)(n2 + 3), 16777215);
        String s;
        if (n != 0) {
            if (n != Class696.method3893(this.field3637.field3591).method21590().size() - 1) {
                s = Class8822.method30773("createWorld.customize.flat.layer", class9127.method33114());
            }
            else {
                s = Class8822.method30773("createWorld.customize.flat.layer.bottom", class9127.method33114());
            }
        }
        else {
            s = Class8822.method30773("createWorld.customize.flat.layer.top", class9127.method33114());
        }
        this.field3637.field3591.font.method6610(s, (float)(n3 + 2 + 213 - this.field3637.field3591.font.method6617(s)), (float)(n2 + 3), 16777215);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 != 0) {
            return false;
        }
        this.field3637.method3594(this);
        this.field3637.field3591.method3887();
        return true;
    }
    
    private void method3666(final int n, final int n2, final ItemStack class8321) {
        this.method3667(n + 1, n2 + 1);
        Class8726.method30046();
        if (!class8321.method27620()) {
            this.field3637.field3591.itemRenderer.method6538(class8321, n + 2, n2 + 2);
        }
        Class8726.method30047();
    }
    
    private void method3667(final int n, final int n2) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class618.method3596(this.field3637).method5290().method5849(Class565.field3362);
        Class565.method3299(n, n2, this.field3637.field3591.method3303(), 0.0f, 0.0f, 18, 18, 128, 128);
    }
}
