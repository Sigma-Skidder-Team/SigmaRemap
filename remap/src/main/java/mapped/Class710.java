// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class710 extends Class703
{
    private static final Class6469[] field3883;
    private Widget field3884;
    
    public Class710(final Screen class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.accessibility.title", new Object[0]));
    }
    
    @Override
    public void init() {
        int n = 0;
        for (final Class6469 class6469 : Class710.field3883) {
            final Widget method3029 = this.addButton(class6469.method19362(this.minecraft.gameSettings, this.width / 2 - 155 + n % 2 * 160, this.height / 6 + 24 * (n >> 1), 150));
            if (class6469 == Class6469.field25726) {
                this.field3884 = method3029;
                method3029.field3431 = NarratorChatListener.field32404.method25560();
            }
            ++n;
        }
        this.addButton(new Class654(this.width / 2 - 100, this.height / 6 + 144, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.minecraft.displayGuiScreen(this.field3868)));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 20, 16777215);
        super.render(n, n2, n3);
    }
    
    public void method3922() {
        this.field3884.method3367(Class6469.field25726.method19486(this.field3869));
    }
    
    static {
        field3883 = new Class6469[] { Class6469.field25726, Class6469.field25742, Class6469.field25719, Class6469.field25729, Class6469.field25708, Class6469.field25730, Class6469.field25744, Class6469.field25745 };
    }
}
