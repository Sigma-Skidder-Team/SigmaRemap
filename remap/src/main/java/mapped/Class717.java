// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class717 extends Class698
{
    private final Screen field3924;
    private final Class5760 field3925;
    private static Class6469[] field3926;
    private final Class8297 field3927;
    
    public Class717(final Screen field3924, final Class5760 field3925) {
        super(new StringTextComponent(Class8822.method30773("of.options.performanceTitle")));
        this.field3927 = new Class8297(this, new Class7298());
        this.field3924 = field3924;
        this.field3925 = field3925;
    }
    
    @Override
    public void init() {
        this.field3842.clear();
        for (int i = 0; i < Class717.field3926.length; ++i) {
            final Class6469 class6469 = Class717.field3926[i];
            final Widget method3029 = this.addButton(class6469.method19362(this.minecraft.gameSettings, this.width / 2 - 155 + i % 2 * 160, this.height / 6 + 21 * (i / 2) - 12, 150));
            if (class6469 == Class6469.field25817) {
                method3029.field3431 = false;
            }
        }
        this.addButton(new Class673(200, this.width / 2 - 100, this.height / 6 + 168 + 11, Class8822.method30773("gui.done")));
    }
    
    @Override
    public void method3896(final Widget class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.minecraft.gameSettings.method17121();
                    this.minecraft.displayGuiScreen(this.field3924);
                }
            }
        }
    }
    
    @Override
    public void removed() {
        this.minecraft.gameSettings.method17121();
        super.removed();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.field3843, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(n, n2, n3);
        this.field3927.method27577(n, n2, this.field3842);
    }
    
    static {
        Class717.field3926 = new Class6469[] { Class6469.field25753, Class6469.field25779, Class6469.field25808, Class6469.field25807, Class6469.field25776, Class6469.field25777, Class6469.field25817, Class6469.field25805, Class6469.field25819 };
    }
}
