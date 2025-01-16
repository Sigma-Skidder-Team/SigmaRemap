// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5082 extends RealmsScreen
{
    private final RealmsServer field21880;
    private final RealmsMainScreen field21881;
    private Class5065 field21882;
    private Class5065 field21883;
    private Class5611 field21884;
    private Class5066 field21885;
    
    public Class5082(final RealmsServer field21880, final RealmsMainScreen field21881) {
        this.field21880 = field21880;
        this.field21881 = field21881;
    }
    
    @Override
    public void tick() {
        if (this.field21882 != null) {
            this.field21882.method15587();
        }
        if (this.field21883 != null) {
            this.field21883.method15587();
        }
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.buttonsAdd(this.field21884 = new Class5646(this, 0, this.width() / 2 - 100, this.height() / 4 + 120 + 17, 97, 20, RealmsScreen.getLocalizedString("mco.create.world")));
        this.buttonsAdd(new Class5670(this, 1, this.width() / 2 + 5, this.height() / 4 + 120 + 17, 95, 20, RealmsScreen.getLocalizedString("gui.cancel")));
        this.field21884.method16917(false);
        this.method15428(this.field21882 = this.method15436(3, this.width() / 2 - 100, 65, 200, 20, RealmsScreen.getLocalizedString("mco.configure.world.name")));
        this.method15434(this.field21882);
        this.method15428(this.field21883 = this.method15436(4, this.width() / 2 - 100, 115, 200, 20, RealmsScreen.getLocalizedString("mco.configure.world.description")));
        this.method15428(this.field21885 = new Class5066(RealmsScreen.getLocalizedString("mco.selectServer.create"), this.width() / 2, 11, 16777215));
        this.method15446();
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean charTyped(final char c, final int n) {
        this.field21884.method16917(this.method15860());
        return false;
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        switch (n) {
            case 256: {
                Realms.setScreen(this.field21881);
                return true;
            }
            default: {
                this.field21884.method16917(this.method15860());
                return false;
            }
        }
    }
    
    private void method15859() {
        if (this.method15860()) {
            final Class5078 class5078 = new Class5078(this.field21881, this.field21880, this.field21881.method15796(), RealmsScreen.getLocalizedString("mco.selectServer.create"), RealmsScreen.getLocalizedString("mco.create.world.subtitle"), 10526880, RealmsScreen.getLocalizedString("mco.create.world.skip"));
            class5078.method15723(RealmsScreen.getLocalizedString("mco.create.world.reset.title"));
            final Class5049 class5079 = new Class5049(this.field21881, new Class1338(this.field21880.id, this.field21882.method15586(), this.field21883.method15586(), class5078));
            class5079.method15466();
            Realms.setScreen(class5079);
        }
    }
    
    private boolean method15860() {
        return this.field21882.method15586() != null && !this.field21882.method15586().trim().isEmpty();
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.field21885.method15593(this);
        this.method15407(RealmsScreen.getLocalizedString("mco.configure.world.name"), this.width() / 2 - 100, 52, 10526880);
        this.method15407(RealmsScreen.getLocalizedString("mco.configure.world.description"), this.width() / 2 - 100, 102, 10526880);
        if (this.field21882 != null) {
            this.field21882.method15590(n, n2, n3);
        }
        if (this.field21883 != null) {
            this.field21883.method15590(n, n2, n3);
        }
        super.render(n, n2, n3);
    }
}
