// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5089 extends RealmsScreen
{
    private final RealmsConfigureWorldScreen field21994;
    private final Class7437 field21995;
    private final int field21996 = 212;
    private Class5611 field21997;
    private Class5065 field21998;
    private Class5065 field21999;
    private Class5066 field22000;
    
    public Class5089(final RealmsConfigureWorldScreen field21994, final Class7437 field21995) {
        this.field21994 = field21994;
        this.field21995 = field21995;
    }
    
    @Override
    public void tick() {
        this.field21999.method15587();
        this.field21998.method15587();
        this.field21997.method16917(this.field21999.method15586() != null && !this.field21999.method15586().trim().isEmpty());
    }
    
    @Override
    public void init() {
        this.method15444(true);
        final int n = this.width() / 2 - 106;
        this.buttonsAdd(this.field21997 = new Class5624(this, 1, n - 2, Class7869.method25488(12), 106, 20, RealmsScreen.getLocalizedString("mco.configure.world.buttons.done")));
        this.buttonsAdd(new Class5647(this, 0, this.width() / 2 + 2, Class7869.method25488(12), 106, 20, RealmsScreen.getLocalizedString("gui.cancel")));
        this.buttonsAdd(new Class5688(this, 5, this.width() / 2 - 53, Class7869.method25488(0), 106, 20, RealmsScreen.getLocalizedString(this.field21995.field28679.equals(Class2153.field12792) ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open")));
        (this.field21999 = this.method15436(2, n, Class7869.method25488(4), 212, 20, RealmsScreen.getLocalizedString("mco.configure.world.name"))).method15591(32);
        if (this.field21995.method22872() != null) {
            this.field21999.method15588(this.field21995.method22872());
        }
        this.method15428(this.field21999);
        this.method15434(this.field21999);
        (this.field21998 = this.method15436(3, n, Class7869.method25488(8), 212, 20, RealmsScreen.getLocalizedString("mco.configure.world.description"))).method15591(32);
        if (this.field21995.method22871() != null) {
            this.field21998.method15588(this.field21995.method22871());
        }
        this.method15428(this.field21998);
        this.method15428(this.field22000 = new Class5066(RealmsScreen.getLocalizedString("mco.configure.world.settings.title"), this.width() / 2, 17, 16777215));
        this.method15446();
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public void confirmResult(final boolean b, final int n) {
        switch (n) {
            case 5: {
                if (b) {
                    this.field21994.method15706(this);
                    break;
                }
                Realms.setScreen(this);
                break;
            }
        }
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        switch (n) {
            case 256: {
                Realms.setScreen(this.field21994);
                return true;
            }
            default: {
                return super.keyPressed(n, n2, n3);
            }
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.field22000.method15593(this);
        this.method15407(RealmsScreen.getLocalizedString("mco.configure.world.name"), this.width() / 2 - 106, Class7869.method25488(3), 10526880);
        this.method15407(RealmsScreen.getLocalizedString("mco.configure.world.description"), this.width() / 2 - 106, Class7869.method25488(7), 10526880);
        this.field21999.method15590(n, n2, n3);
        this.field21998.method15590(n, n2, n3);
        super.render(n, n2, n3);
    }
    
    public void method15961() {
        this.field21994.method15704(this.field21999.method15586(), this.field21998.method15586());
    }
}
