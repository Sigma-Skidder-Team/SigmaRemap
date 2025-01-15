// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class550 extends Class527
{
    private static final Class6469[] field3316;
    private final Class527 field3317;
    private final Class5760 field3318;
    private Class654 field3319;
    private Class667 field3320;
    private Class2113 field3321;
    
    public Class550(final Class527 field3317, final Class5760 field3318) {
        super(new Class2259("options.title", new Object[0]));
        this.field3317 = field3317;
        this.field3318 = field3318;
    }
    
    @Override
    public void method2969() {
        int n = 0;
        final Class6469[] field3316 = Class550.field3316;
        for (int length = field3316.length, i = 0; i < length; ++i) {
            this.method3029(field3316[i].method19362(this.field3150.field4648, this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 - 12 + 24 * (n >> 1), 150));
            ++n;
        }
        if (this.field3150.field4683 == null) {
            this.method3029(new Class657(this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 - 12 + 24 * (n >> 1), 150, 20, Class6469.field25740, Class6469.field25740.method19363(this.field3318), class654 -> {
                Class6469.field25740.method19359(this.field3318);
                this.field3318.method17121();
                class654.method3367(Class6469.field25740.method19363(this.field3318));
            }));
        }
        else {
            this.field3321 = this.field3150.field4683.method6954();
            this.field3319 = this.method3029(new Class654(this.field3152 / 2 - 155 + n % 2 * 160, this.field3153 / 6 - 12 + 24 * (n >> 1), 150, 20, this.method3231(this.field3321), class654 -> {
                this.field3321 = Class2113.method8237(this.field3321.method8235() + 1);
                this.field3150.method5269().method17292(new Class4338(this.field3321));
                this.field3319.method3367(this.method3231(this.field3321));
            }));
            if (this.field3150.method5284() && !this.field3150.field4683.method6764().method29568()) {
                this.field3319.method3365(this.field3319.method3364() - 20);
                (this.field3320 = this.method3029(new Class667(this.field3319.field3426 + this.field3319.method3364(), this.field3319.field3427, class654 -> this.field3150.method5244(new Class546(this::method3232, new Class2259("difficulty.lock.title", new Object[0]), new Class2259("difficulty.lock.question", new Object[] { new Class2259("options.difficulty." + this.field3150.field4683.method6764().method29597().method8239(), new Object[0]) })))))).method3732(this.field3150.field4683.method6764().method29599());
                this.field3320.field3431 = !this.field3320.method3731();
                this.field3319.field3431 = !this.field3320.method3731();
            }
            else {
                this.field3319.field3431 = false;
            }
        }
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 6 + 48 - 6, 150, 20, Class8822.method30773("options.skinCustomisation", new Object[0]), class654 -> this.field3150.method5244(new Class708(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 / 6 + 48 - 6, 150, 20, Class8822.method30773("options.sounds", new Object[0]), class654 -> this.field3150.method5244(new Class709(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 6 + 72 - 6, 150, 20, Class8822.method30773("options.video", new Object[0]), class654 -> this.field3150.method5244(new Class700(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 / 6 + 72 - 6, 150, 20, Class8822.method30773("options.controls", new Object[0]), class654 -> this.field3150.method5244(new Class705(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 6 + 96 - 6, 150, 20, Class8822.method30773("options.language", new Object[0]), class654 -> this.field3150.method5244(new Class704(this, this.field3318, this.field3150.method5295()))));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 / 6 + 96 - 6, 150, 20, Class8822.method30773("options.chat.title", new Object[0]), class654 -> this.field3150.method5244(new Class707(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 / 6 + 120 - 6, 150, 20, Class8822.method30773("options.resourcepack", new Object[0]), class654 -> this.field3150.method5244(new Class711(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 / 6 + 120 - 6, 150, 20, Class8822.method30773("options.accessibility.title", new Object[0]), class654 -> this.field3150.method5244(new Class710(this, this.field3318))));
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 6 + 168, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.field3150.method5244(this.field3317)));
    }
    
    public String method3231(final Class2113 class2113) {
        return new Class2259("options.difficulty", new Object[0]).appendText(": ").appendSibling(class2113.method8236()).getFormattedText();
    }
    
    private void method3232(final boolean b) {
        this.field3150.method5244(this);
        if (b) {
            if (this.field3150.field4683 != null) {
                this.field3150.method5269().method17292(new Class4291(true));
                this.field3320.method3732(true);
                this.field3320.field3431 = false;
                this.field3319.field3431 = false;
            }
        }
    }
    
    @Override
    public void method2971() {
        this.field3318.method17121();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 15, 16777215);
        super.method2975(n, n2, n3);
    }
    
    static {
        field3316 = new Class6469[] { Class6469.field25711 };
    }
}
