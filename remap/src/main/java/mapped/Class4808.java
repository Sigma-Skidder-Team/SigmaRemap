// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.UglyClickGUICategory;

public class Class4808 extends Class4807
{
    public Class4822 field20528;
    public int field20529;
    
    public Class4808(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final Category[] array) {
        super(customGuiScreen, s, n - 296, n2 - 346, 592, 692);
        this.field20529 = 0;
        for (final Module class4804 : Client.getInstance().moduleManager().getModuleMap().values()) {
            if (class4804.method9916()) {
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (class4804.getCategoryBasedOnMode().equals(array[i])) {
                        this.method14327(class4804);
                    }
                }
            }
        }
        final Class4886 class4805;
        this.addToList(class4805 = new Class4886(this, "exit", this.method14276() - 47, 18));
        class4805.doThis((class4803, n) -> {
            if (this.field20528 == null) {
                ((Class4799)this.getParent()).method14197();
                return;
            }
            this.field20528.method14435();
        });
        this.setListening(false);
    }
    
    private void method14327(final Module class3167) {
        final int n = this.field20529 % 3;
        final int n2 = (int)Math.floor(this.field20529 / 3.0f);
        final int n3 = 170;
        final int n4 = 80;
        this.addToList(new Class4883(this, class3167.getName(), 40 + n3 * n, 72 + n4 * n2, n3, n4, class3167));
        ++this.field20529;
    }
    
    public void method14328(final Module class3167) {
        this.runThisOnDimensionUpdate(() -> {
            if (this.field20528 == null) {
                final Class4822 field20528 = new Class4822(this, "settings", 5, 70, this.method14276() - 10, this.method14278() - 75, class3168);
                this.addToList(this.field20528 = field20528);
                this.field20528.method14301(true);
            }
        });
    }
    
    @Override
    public void draw(final float n) {
        super.draw(n);
        if (this.field20528 == null) {
            for (final CustomGuiScreen customGuiScreen : this.method14250()) {
                if (!(customGuiScreen instanceof Class4883)) {
                    continue;
                }
                if (this.field20527.calcPercent() != 1.0f) {
                    continue;
                }
                if (!customGuiScreen.method14236(this.method14320(), this.method14321())) {
                    continue;
                }
                RenderUtil.drawString(Class9493.field40808, 20.0f, (float)(this.method14278() - 26), ((Class4883) customGuiScreen).field20878.getDesc(), -14540254);
                RenderUtil.startScissor(5.0f, (float)(this.method14278() - 27), 12.0f, 24.0f);
                RenderUtil.method26905(5.0f, (float)(this.method14278() - 27), 24.0f, 24.0f, UglyClickGUICategory.xmark);
                RenderUtil.endScissor();
                break;
            }
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.field20528 != null) {
            if (this.field20528.method14436()) {
                this.runThisOnDimensionUpdate(() -> {
                    this.method14245(this.field20528);
                    this.field20528 = null;
                });
            }
        }
    }
}
