// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class611 extends Class608<Class637>
{
    public final /* synthetic */ Class561 field3565;
    
    public Class611(final Class561 field3565) {
        this.field3565 = field3565;
        super(field3565.minecraft, field3565.width, field3565.height, 80, field3565.height - 37, 24);
        for (int i = 0; i < Class561.method3276().size(); ++i) {
            this.method3536(new Class637(this));
        }
    }
    
    public void method3572(final Class637 class637) {
        super.method3531(class637);
        if (class637 != null) {
            NarratorChatListener.field32404.method25556(new Class2259("narrator.select", new Object[] { Class561.method3276().get(this.children().indexOf(class637)).field39913 }).getString());
        }
    }
    
    @Override
    public void method3556(final int n) {
        super.method3556(n);
        this.field3565.method3272(true);
    }
    
    @Override
    public boolean method3561() {
        return this.field3565.getFocused() == this;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (!super.keyPressed(n, n2, n3)) {
            if (n == 257 || n == 335) {
                if (this.method3530() != null) {
                    Class637.method3665(this.method3530());
                }
            }
            return false;
        }
        return true;
    }
}
