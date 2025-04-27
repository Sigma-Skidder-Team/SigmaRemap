// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class551 extends Screen
{
    private final boolean field3322;
    
    public Class551(final boolean field3322) {
        super(field3322 ? new Class2259("menu.game") : new Class2259("menu.paused"));
        this.field3322 = field3322;
    }
    
    @Override
    public void init() {
        if (this.field3322) {
            this.method3245();
        }
    }
    
    private void method3245() {
        this.addButton(new Class654(this.width / 2 - 102, this.height / 4 + 24 - 16, 204, 20, Class8822.method30773("menu.returnToGame"), class654 -> {
            this.minecraft.displayGuiScreen(null);
            this.minecraft.field4650.method26963();
        }));
        this.addButton(new Class654(this.width / 2 - 102, this.height / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.advancements"), class654 -> this.minecraft.displayGuiScreen(new Class557(this.minecraft.player.field4069.method17374()))));
        this.addButton(new Class654(this.width / 2 + 4, this.height / 4 + 48 - 16, 98, 20, Class8822.method30773("gui.stats"), class654 -> this.minecraft.displayGuiScreen(new Class691(this, this.minecraft.player.method4121()))));
        this.addButton(new Class654(this.width / 2 - 102, this.height / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.sendFeedback"), class654 -> this.minecraft.displayGuiScreen(new Class547(b -> {
            if (b) {
                Util.method27845().method980(s);
            }
            this.minecraft.displayGuiScreen(this);
        }, s, true))));
        this.addButton(new Class654(this.width / 2 + 4, this.height / 4 + 72 - 16, 98, 20, Class8822.method30773("menu.reportBugs"), class654 -> this.minecraft.displayGuiScreen(new Class547(b -> {
            if (b) {
                Util.method27845().method980("https://aka.ms/snapshotbugs?ref=game");
            }
            this.minecraft.displayGuiScreen(this);
        }, "https://aka.ms/snapshotbugs?ref=game", true))));
        this.addButton(new Class654(this.width / 2 - 102, this.height / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.options"), class654 -> this.minecraft.displayGuiScreen(new Class550(this, this.minecraft.gameSettings))));
        this.addButton(new Class654(this.width / 2 + 4, this.height / 4 + 96 - 16, 98, 20, Class8822.method30773("menu.shareToLan"), class654 -> this.minecraft.displayGuiScreen(new Class738(this)))).field3431 = (this.minecraft.method5284() && !this.minecraft.method5285().method1539());
        final Class654 class654 = this.addButton(new Class654(this.width / 2 - 102, this.height / 4 + 120 - 16, 204, 20, Class8822.method30773("menu.returnToMenu"), class654 -> {
            final boolean method5283 = this.minecraft.method5283();
            final boolean method5284 = this.minecraft.method5311();
            class654.field3431 = false;
            this.minecraft.world.method6751();
            if (!method5283) {
                this.minecraft.method5264();
            }
            else {
                this.minecraft.method5265(new Class729(new Class2259("menu.savingLevel")));
            }
            if (!method5283) {
                if (!method5284) {
                    this.minecraft.displayGuiScreen(new Class720(new MainMenu()));
                }
                else {
                    new Class5052().method15490(new MainMenu());
                }
            }
            else {
                this.minecraft.displayGuiScreen(new MainMenu());
            }
        }));
        if (!this.minecraft.method5283()) {
            class654.method3367(Class8822.method30773("menu.disconnect"));
        }
    }
    
    @Override
    public void tick() {
        super.tick();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (!this.field3322) {
            this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 10, 16777215);
        }
        else {
            this.renderBackground();
            this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 40, 16777215);
        }
        super.render(n, n2, n3);
    }
}
