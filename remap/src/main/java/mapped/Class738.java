// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class738 extends Screen
{
    private final Screen field4004;
    private Class654 field4005;
    private Class654 field4006;
    private String field4007;
    private boolean field4008;
    
    public Class738(final Screen field4004) {
        super(new Class2259("lanServer.title"));
        this.field4007 = "survival";
        this.field4004 = field4004;
    }
    
    @Override
    public void init() {
        this.addButton(new Class654(this.width / 2 - 155, this.height - 28, 150, 20, Class8822.method30773("lanServer.start"), class654 -> {
            this.minecraft.displayGuiScreen(null);
            final int method24365 = Class7676.method24365();
            Class2259 class655;
            if (!this.minecraft.method5285().method1544(Class101.method594(this.field4007), this.field4008, method24365)) {
                class655 = new Class2259("commands.publish.failed");
            }
            else {
                class655 = new Class2259("commands.publish.started", method24365);
            }
            this.minecraft.field4647.method3807().method3761(class655);
            this.minecraft.method5227();
        }));
        this.addButton(new Class654(this.width / 2 + 5, this.height - 28, 150, 20, Class8822.method30773("gui.cancel"), class654 -> this.minecraft.displayGuiScreen(this.field4004)));
        this.field4006 = this.addButton(new Class654(this.width / 2 - 155, 100, 150, 20, Class8822.method30773("selectWorld.gameMode"), class654 -> {
            if (!"spectator".equals(this.field4007)) {
                if (!"creative".equals(this.field4007)) {
                    if (!"adventure".equals(this.field4007)) {
                        this.field4007 = "spectator";
                    }
                    else {
                        this.field4007 = "survival";
                    }
                }
                else {
                    this.field4007 = "adventure";
                }
            }
            else {
                this.field4007 = "creative";
            }
            this.method4054();
        }));
        this.field4005 = this.addButton(new Class654(this.width / 2 + 5, 100, 150, 20, Class8822.method30773("selectWorld.allowCommands"), class654 -> {
            this.field4008 = !this.field4008;
            this.method4054();
        }));
        this.method4054();
    }
    
    private void method4054() {
        this.field4006.method3367(Class8822.method30773("selectWorld.gameMode") + ": " + Class8822.method30773("selectWorld.gameMode." + this.field4007));
        this.field4005.method3367(Class8822.method30773("selectWorld.allowCommands", new Object[0]) + ' ' + Class8822.method30773(this.field4008 ? "options.on" : "options.off"));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 50, 16777215);
        this.drawCenteredString(this.font, Class8822.method30773("lanServer.otherPlayers"), this.width / 2, 82, 16777215);
        super.render(n, n2, n3);
    }
}
