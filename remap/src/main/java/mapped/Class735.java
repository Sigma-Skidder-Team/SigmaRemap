// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.List;

public class Class735 extends Screen
{
    private final ITextComponent field3992;
    private List<String> field3993;
    private final Screen field3994;
    private int field3995;
    
    public Class735(final Screen field3994, final String s, final ITextComponent field3995) {
        super(new Class2259(s, new Object[0]));
        this.field3994 = field3994;
        this.field3992 = field3995;
    }
    
    @Override
    public boolean shouldCloseOnEsc() {
        return false;
    }
    
    @Override
    public void init() {
        this.field3993 = this.font.method6626(this.field3992.getFormattedText(), this.width - 50);
        this.field3995 = this.field3993.size() * 9;
        this.addButton(new Class654(this.width / 2 - 100, Math.min(this.height / 2 + this.field3995 / 2 + 9, this.height - 30), 200, 20, Class8822.method30773("gui.toMenu", new Object[0]), class654 -> this.minecraft.displayGuiScreen(this.field3994)));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, this.height / 2 - this.field3995 / 2 - 18, 11184810);
        int n4 = this.height / 2 - this.field3995 / 2;
        if (this.field3993 != null) {
            final Iterator<String> iterator = this.field3993.iterator();
            while (iterator.hasNext()) {
                this.drawCenteredString(this.font, iterator.next(), this.width / 2, n4, 16777215);
                n4 += 9;
            }
        }
        super.render(n, n2, n3);
    }
}
