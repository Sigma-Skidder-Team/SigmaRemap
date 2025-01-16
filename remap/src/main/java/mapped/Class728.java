// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class728 extends Screen
{
    private final String field3978;
    
    public Class728(final ITextComponent class2250, final String field3978) {
        super(class2250);
        this.field3978 = field3978;
    }
    
    @Override
    public void init() {
        super.init();
        this.addButton(new Class654(this.width / 2 - 100, 140, 200, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.minecraft.displayGuiScreen(null)));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.fillGradient(0, 0, this.width, this.height, -12574688, -11530224);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 90, 16777215);
        this.drawCenteredString(this.font, this.field3978, this.width / 2, 110, 16777215);
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
}
