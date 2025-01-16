// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class729 extends Screen
{
    private static String[] field3979;
    
    public Class729(final ITextComponent class2250) {
        super(class2250);
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderDirtBackground(0);
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 70, 16777215);
        super.render(n, n2, n3);
    }
}
