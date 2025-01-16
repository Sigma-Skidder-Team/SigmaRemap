// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5090 extends RealmsScreen
{
    private final RealmsScreen field22001;
    private final boolean field22002;
    
    public Class5090(final RealmsScreen field22001, final boolean field22002) {
        this.field22001 = field22001;
        this.field22002 = field22002;
    }
    
    @Override
    public void init() {
        this.buttonsAdd(new Class5687(this, 0, this.width() / 2 - 100, Class7869.method25488(12), RealmsScreen.getLocalizedString("gui.back")));
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.drawCenteredString(RealmsScreen.getLocalizedString(this.field22002 ? "mco.client.outdated.title" : "mco.client.incompatible.title"), this.width() / 2, Class7869.method25488(3), 16711680);
        for (int n4 = this.field22002 ? 2 : 3, i = 0; i < n4; ++i) {
            this.drawCenteredString(RealmsScreen.getLocalizedString((this.field22002 ? "mco.client.outdated.msg.line" : "mco.client.incompatible.msg.line") + (i + 1)), this.width() / 2, Class7869.method25488(5) + i * 12, 16777215);
        }
        super.render(n, n2, n3);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 257) {
            if (n != 335) {
                if (n != 256) {
                    return super.keyPressed(n, n2, n3);
                }
            }
        }
        Realms.setScreen(this.field22001);
        return true;
    }
}
