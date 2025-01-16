// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

import java.util.Iterator;
import java.util.List;

public class Class5070 extends RealmsScreen
{
    private final String field21745;
    private final ITextComponent field21746;
    private List<String> field21747;
    private final RealmsScreen field21748;
    private int field21749;
    
    public Class5070(final RealmsScreen field21748, final String s, final ITextComponent field21749) {
        this.field21748 = field21748;
        this.field21745 = RealmsScreen.getLocalizedString(s);
        this.field21746 = field21749;
    }
    
    @Override
    public void init() {
        Realms.method25369(false);
        Realms.method25371();
        Realms.narrateNow(this.field21745 + ": " + this.field21746.getString());
        this.field21747 = this.method15426(this.field21746.getFormattedText(), this.width() - 50);
        this.field21749 = this.field21747.size() * this.method15423();
        this.buttonsAdd(new Class5620(this, 0, this.width() / 2 - 100, this.height() / 2 + this.field21749 / 2 + this.method15423(), RealmsScreen.getLocalizedString("gui.back")));
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21748);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.drawCenteredString(this.field21745, this.width() / 2, this.height() / 2 - this.field21749 / 2 - this.method15423() * 2, 11184810);
        int n4 = this.height() / 2 - this.field21749 / 2;
        if (this.field21747 != null) {
            final Iterator<String> iterator = this.field21747.iterator();
            while (iterator.hasNext()) {
                this.drawCenteredString(iterator.next(), this.width() / 2, n4, 16777215);
                n4 += this.method15423();
            }
        }
        super.render(n, n2, n3);
    }
}
