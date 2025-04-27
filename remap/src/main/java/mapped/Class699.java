// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class699 extends Class698
{
    private final Screen field3845;
    private final Class5760 field3846;
    private static Class6469[] field3847;
    private final Class8297 field3848;
    
    public Class699(final Screen field3845, final Class5760 field3846) {
        super(new StringTextComponent(Class8822.method30773("of.options.detailsTitle")));
        this.field3848 = new Class8297(this, new Class7298());
        this.field3845 = field3845;
        this.field3846 = field3846;
    }
    
    @Override
    public void init() {
        this.field3842.clear();
        for (int i = 0; i < Class699.field3847.length; ++i) {
            this.addButton(Class699.field3847[i].method19362(this.minecraft.gameSettings, this.width / 2 - 155 + i % 2 * 160, this.height / 6 + 21 * (i / 2) - 12, 150));
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
                    this.minecraft.displayGuiScreen(this.field3845);
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
        this.drawCenteredString(this.minecraft.fontRenderer, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(n, n2, n3);
        this.field3848.method27577(n, n2, this.field3842);
    }
    
    static {
        Class699.field3847 = new Class6469[] { Class6469.field25754, Class6469.field25755, Class6469.field25756, Class6469.field25757, Class6469.field25772, Class6469.field25773, Class6469.field25774, Class6469.field25795, Class6469.field25750, Class6469.field25751, Class6469.field25809, Class6469.field25803, Class6469.field25804, Class6469.field25737, Class6469.field25775, Class6469.field25812, Class6469.field25790, Class6469.field25705 };
    }
}
