// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class551 extends Screen
{
    private final boolean field3322;
    
    public Class551(final boolean field3322) {
        super(field3322 ? new Class2259("menu.game", new Object[0]) : new Class2259("menu.paused", new Object[0]));
        this.field3322 = field3322;
    }
    
    @Override
    public void init() {
        if (this.field3322) {
            this.method3245();
        }
    }
    
    private void method3245() {
        this.method3029(new Class654(this.width / 2 - 102, this.height / 4 + 24 - 16, 204, 20, Class8822.method30773("menu.returnToGame", new Object[0]), class654 -> {
            this.minecraft.method5244(null);
            this.minecraft.field4650.method26963();
        }));
        this.method3029(new Class654(this.width / 2 - 102, this.height / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.advancements", new Object[0]), class654 -> this.minecraft.method5244(new Class557(this.minecraft.field4684.field4069.method17374()))));
        this.method3029(new Class654(this.width / 2 + 4, this.height / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.stats", new Object[0]), class654 -> this.minecraft.method5244(new Class691(this, this.minecraft.field4684.method4121()))));
        this.method3029(new Class654(this.width / 2 - 102, this.height / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.sendFeedback", new Object[0]), class654 -> this.minecraft.method5244(new Class547(b -> {
            if (b) {
                Util.method27845().method980(s);
            }
            this.minecraft.method5244(this);
        }, s, true))));
        this.method3029(new Class654(this.width / 2 + 4, this.height / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.reportBugs", new Object[0]), class654 -> this.minecraft.method5244(new Class547(b -> {
            if (b) {
                Util.method27845().method980("https://aka.ms/snapshotbugs?ref=game");
            }
            this.minecraft.method5244(this);
        }, "https://aka.ms/snapshotbugs?ref=game", true))));
        this.method3029(new Class654(this.width / 2 - 102, this.height / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.options", new Object[0]), class654 -> this.minecraft.method5244(new Class550(this, this.minecraft.field4648))));
        this.method3029(new Class654(this.width / 2 + 4, this.height / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.shareToLan", new Object[0]), class654 -> this.minecraft.method5244(new Class738(this)))).field3431 = (this.minecraft.method5284() && !this.minecraft.method5285().method1539());
        final Class654 class654 = this.method3029(new Class654(this.width / 2 - 102, this.height / 4 + 120 - 16, 204, 20, Class8822.method30773("menu.returnToMenu", new Object[0]), class654 -> {
            final boolean method5283 = this.minecraft.method5283();
            final boolean method5284 = this.minecraft.method5311();
            class654.field3431 = false;
            this.minecraft.world.method6751();
            if (!method5283) {
                this.minecraft.method5264();
            }
            else {
                this.minecraft.method5265(new Class729(new Class2259("menu.savingLevel", new Object[0])));
            }
            if (!method5283) {
                if (!method5284) {
                    this.minecraft.method5244(new Class720(new Class548()));
                }
                else {
                    new Class5052().method15490(new Class548());
                }
            }
            else {
                this.minecraft.method5244(new Class548());
            }
        }));
        if (!this.minecraft.method5283()) {
            class654.method3367(Class8822.method30773("menu.disconnect", new Object[0]));
        }
    }
    
    @Override
    public void tick() {
        super.tick();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        if (!this.field3322) {
            this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 10, 16777215);
        }
        else {
            this.renderBackground();
            this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 40, 16777215);
        }
        super.method2975(n, n2, n3);
    }
}
