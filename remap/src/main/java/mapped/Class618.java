// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.List;

public class Class618 extends Class608<Class638>
{
    public final /* synthetic */ Class696 field3591;
    
    public Class618(final Class696 field3591) {
        this.field3591 = field3591;
        super(field3591.minecraft, field3591.width, field3591.height, 43, field3591.height - 60, 24);
        for (int i = 0; i < Class696.method3893(field3591).method21590().size(); ++i) {
            this.method3536(new Class638(this, null));
        }
    }
    
    public void method3594(final Class638 class638) {
        super.method3531(class638);
        if (class638 != null) {
            final Item method11704 = Class696.method3893(this.field3591).method21590().get(Class696.method3893(this.field3591).method21590().size() - this.children().indexOf(class638) - 1).method33115().method21696().method11704();
            if (method11704 != Items.AIR) {
                NarratorChatListener.field32404.method25556(new Class2259("narrator.select", method11704.method11729(new ItemStack(method11704))).getString());
            }
        }
    }
    
    @Override
    public void method3556(final int n) {
        super.method3556(n);
        this.field3591.method3887();
    }
    
    @Override
    public boolean method3561() {
        return this.field3591.getFocused() == this;
    }
    
    @Override
    public int method3555() {
        return this.field3543 - 70;
    }
    
    public void method3595() {
        final int index = this.children().indexOf(((Class604<Object>)this).method3530());
        this.method3533();
        for (int i = 0; i < Class696.method3893(this.field3591).method21590().size(); ++i) {
            this.method3536(new Class638(this, null));
        }
        final List<Class638> method3040 = this.children();
        if (index >= 0) {
            if (index < method3040.size()) {
                this.method3594(method3040.get(index));
            }
        }
    }
}
