// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class550 extends Screen
{
    private static final Class6469[] field3316;
    private final Screen field3317;
    private final Class5760 field3318;
    private Class654 field3319;
    private Class667 field3320;
    private Class2113 field3321;
    
    public Class550(final Screen field3317, final Class5760 field3318) {
        super(new Class2259("options.title"));
        this.field3317 = field3317;
        this.field3318 = field3318;
    }
    
    @Override
    public void init() {
        int n = 0;
        final Class6469[] field3316 = Class550.field3316;
        for (int length = field3316.length, i = 0; i < length; ++i) {
            this.addButton(field3316[i].method19362(this.minecraft.gameSettings, this.width / 2 - 155 + n % 2 * 160, this.height / 6 - 12 + 24 * (n >> 1), 150));
            ++n;
        }
        if (this.minecraft.world == null) {
            this.addButton(new Class657(this.width / 2 - 155 + n % 2 * 160, this.height / 6 - 12 + 24 * (n >> 1), 150, 20, Class6469.field25740, Class6469.field25740.method19363(this.field3318), class654 -> {
                Class6469.field25740.method19359(this.field3318);
                this.field3318.method17121();
                class654.method3367(Class6469.field25740.method19363(this.field3318));
            }));
        }
        else {
            this.field3321 = this.minecraft.world.method6954();
            this.field3319 = this.addButton(new Class654(this.width / 2 - 155 + n % 2 * 160, this.height / 6 - 12 + 24 * (n >> 1), 150, 20, this.method3231(this.field3321), class654 -> {
                this.field3321 = Class2113.method8237(this.field3321.method8235() + 1);
                this.minecraft.method5269().method17292(new Class4338(this.field3321));
                this.field3319.method3367(this.method3231(this.field3321));
            }));
            if (this.minecraft.method5284() && !this.minecraft.world.method6764().method29568()) {
                this.field3319.method3365(this.field3319.method3364() - 20);
                (this.field3320 = this.addButton(new Class667(this.field3319.field3426 + this.field3319.method3364(), this.field3319.field3427, class654 -> this.minecraft.displayGuiScreen(new Class546(this::method3232, new Class2259("difficulty.lock.title"), new Class2259("difficulty.lock.question", new Class2259("options.difficulty." + this.minecraft.world.method6764().method29597().method8239()))))))).method3732(this.minecraft.world.method6764().method29599());
                this.field3320.field3431 = !this.field3320.method3731();
                this.field3319.field3431 = !this.field3320.method3731();
            }
            else {
                this.field3319.field3431 = false;
            }
        }
        this.addButton(new Class654(this.width / 2 - 155, this.height / 6 + 48 - 6, 150, 20, Class8822.method30773("options.skinCustomisation"), class654 -> this.minecraft.displayGuiScreen(new Class708(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 + 5, this.height / 6 + 48 - 6, 150, 20, Class8822.method30773("options.sounds"), class654 -> this.minecraft.displayGuiScreen(new Class709(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 - 155, this.height / 6 + 72 - 6, 150, 20, Class8822.method30773("options.video"), class654 -> this.minecraft.displayGuiScreen(new Class700(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 + 5, this.height / 6 + 72 - 6, 150, 20, Class8822.method30773("options.controls"), class654 -> this.minecraft.displayGuiScreen(new Class705(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 - 155, this.height / 6 + 96 - 6, 150, 20, Class8822.method30773("options.language"), class654 -> this.minecraft.displayGuiScreen(new Class704(this, this.field3318, this.minecraft.method5295()))));
        this.addButton(new Class654(this.width / 2 + 5, this.height / 6 + 96 - 6, 150, 20, Class8822.method30773("options.chat.title"), class654 -> this.minecraft.displayGuiScreen(new Class707(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 - 155, this.height / 6 + 120 - 6, 150, 20, Class8822.method30773("options.resourcepack"), class654 -> this.minecraft.displayGuiScreen(new Class711(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 + 5, this.height / 6 + 120 - 6, 150, 20, Class8822.method30773("options.accessibility.title"), class654 -> this.minecraft.displayGuiScreen(new Class710(this, this.field3318))));
        this.addButton(new Class654(this.width / 2 - 100, this.height / 6 + 168, 200, 20, Class8822.method30773("gui.done"), class654 -> this.minecraft.displayGuiScreen(this.field3317)));
    }
    
    public String method3231(final Class2113 class2113) {
        return new Class2259("options.difficulty").appendText(": ").appendSibling(class2113.method8236()).getFormattedText();
    }
    
    private void method3232(final boolean b) {
        this.minecraft.displayGuiScreen(this);
        if (b) {
            if (this.minecraft.world != null) {
                this.minecraft.method5269().method17292(new Class4291(true));
                this.field3320.method3732(true);
                this.field3320.field3431 = false;
                this.field3319.field3431 = false;
            }
        }
    }
    
    @Override
    public void removed() {
        this.field3318.method17121();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 15, 16777215);
        super.render(n, n2, n3);
    }
    
    static {
        field3316 = new Class6469[] { Class6469.field25711 };
    }
}
