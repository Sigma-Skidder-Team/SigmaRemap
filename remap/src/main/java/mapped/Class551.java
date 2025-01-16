// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class551 extends Class527
{
    private final boolean field3322;
    
    public Class551(final boolean field3322) {
        super(field3322 ? new Class2259("menu.game", new Object[0]) : new Class2259("menu.paused", new Object[0]));
        this.field3322 = field3322;
    }
    
    @Override
    public void method2969() {
        if (this.field3322) {
            this.method3245();
        }
    }
    
    private void method3245() {
        this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 / 4 + 24 - 16, 204, 20, Class8822.method30773("menu.returnToGame", new Object[0]), class654 -> {
            this.field3150.method5244(null);
            this.field3150.field4650.method26963();
        }));
        this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.advancements", new Object[0]), class654 -> this.field3150.method5244(new Class557(this.field3150.field4684.field4069.method17374()))));
        this.method3029(new Class654(this.field3152 / 2 + 4, this.field3153 / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.stats", new Object[0]), class654 -> this.field3150.method5244(new Class691(this, this.field3150.field4684.method4121()))));
        this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.sendFeedback", new Object[0]), class654 -> this.field3150.method5244(new Class547(b -> {
            if (b) {
                Util.method27845().method980(s);
            }
            this.field3150.method5244(this);
        }, s, true))));
        this.method3029(new Class654(this.field3152 / 2 + 4, this.field3153 / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.reportBugs", new Object[0]), class654 -> this.field3150.method5244(new Class547(b -> {
            if (b) {
                Util.method27845().method980("https://aka.ms/snapshotbugs?ref=game");
            }
            this.field3150.method5244(this);
        }, "https://aka.ms/snapshotbugs?ref=game", true))));
        this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.options", new Object[0]), class654 -> this.field3150.method5244(new Class550(this, this.field3150.field4648))));
        this.method3029(new Class654(this.field3152 / 2 + 4, this.field3153 / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.shareToLan", new Object[0]), class654 -> this.field3150.method5244(new Class738(this)))).field3431 = (this.field3150.method5284() && !this.field3150.method5285().method1539());
        final Class654 class654 = this.method3029(new Class654(this.field3152 / 2 - 102, this.field3153 / 4 + 120 - 16, 204, 20, Class8822.method30773("menu.returnToMenu", new Object[0]), class654 -> {
            final boolean method5283 = this.field3150.method5283();
            final boolean method5284 = this.field3150.method5311();
            class654.field3431 = false;
            this.field3150.field4683.method6751();
            if (!method5283) {
                this.field3150.method5264();
            }
            else {
                this.field3150.method5265(new Class729(new Class2259("menu.savingLevel", new Object[0])));
            }
            if (!method5283) {
                if (!method5284) {
                    this.field3150.method5244(new Class720(new Class548()));
                }
                else {
                    new Class5052().method15490(new Class548());
                }
            }
            else {
                this.field3150.method5244(new Class548());
            }
        }));
        if (!this.field3150.method5283()) {
            class654.method3367(Class8822.method30773("menu.disconnect", new Object[0]));
        }
    }
    
    @Override
    public void method2992() {
        super.method2992();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (!this.field3322) {
            this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 10, 16777215);
        }
        else {
            this.method3041();
            this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 40, 16777215);
        }
        super.method2975(n, n2, n3);
    }
}
