// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class738 extends Class527
{
    private final Class527 field4004;
    private Class654 field4005;
    private Class654 field4006;
    private String field4007;
    private boolean field4008;
    
    public Class738(final Class527 field4004) {
        super(new Class2259("lanServer.title", new Object[0]));
        this.field4007 = "survival";
        this.field4004 = field4004;
    }
    
    @Override
    public void method2969() {
        this.method3029(new Class654(this.field3152 / 2 - 155, this.field3153 - 28, 150, 20, Class8822.method30773("lanServer.start", new Object[0]), class654 -> {
            this.field3150.method5244(null);
            final int method24365 = Class7676.method24365();
            Class2259 class655;
            if (!this.field3150.method5285().method1544(Class101.method594(this.field4007), this.field4008, method24365)) {
                class655 = new Class2259("commands.publish.failed", new Object[0]);
            }
            else {
                class655 = new Class2259("commands.publish.started", new Object[] { method24365 });
            }
            this.field3150.field4647.method3807().method3761(class655);
            this.field3150.method5227();
        }));
        this.method3029(new Class654(this.field3152 / 2 + 5, this.field3153 - 28, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.field3150.method5244(this.field4004)));
        this.field4006 = this.method3029(new Class654(this.field3152 / 2 - 155, 100, 150, 20, Class8822.method30773("selectWorld.gameMode", new Object[0]), class654 -> {
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
        this.field4005 = this.method3029(new Class654(this.field3152 / 2 + 5, 100, 150, 20, Class8822.method30773("selectWorld.allowCommands", new Object[0]), class654 -> {
            this.field4008 = !this.field4008;
            this.method4054();
        }));
        this.method4054();
    }
    
    private void method4054() {
        this.field4006.method3367(Class8822.method30773("selectWorld.gameMode", new Object[0]) + ": " + Class8822.method30773("selectWorld.gameMode." + this.field4007, new Object[0]));
        this.field4005.method3367(Class8822.method30773("selectWorld.allowCommands", new Object[0]) + ' ' + Class8822.method30773(this.field4008 ? "options.on" : "options.off", new Object[0]));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 50, 16777215);
        this.method3295(this.field3156, Class8822.method30773("lanServer.otherPlayers", new Object[0]), this.field3152 / 2, 82, 16777215);
        super.method2975(n, n2, n3);
    }
}
