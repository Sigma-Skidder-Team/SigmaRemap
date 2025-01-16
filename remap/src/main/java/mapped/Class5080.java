// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5080 extends RealmsScreen
{
    private static final Logger field21869;
    private Class5065 field21870;
    private final RealmsServer field21871;
    private final RealmsConfigureWorldScreen field21872;
    private final RealmsScreen field21873;
    private final int field21874 = 0;
    private final int field21875 = 1;
    private Class5611 field21876;
    private final int field21877 = 2;
    private String field21878;
    private boolean field21879;
    
    public Class5080(final RealmsConfigureWorldScreen field21872, final RealmsScreen field21873, final RealmsServer field21874) {
        this.field21872 = field21872;
        this.field21873 = field21873;
        this.field21871 = field21874;
    }
    
    @Override
    public void tick() {
        this.field21870.method15587();
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.buttonsAdd(this.field21876 = new Class5675(this, 0, this.width() / 2 - 100, Class7869.method25488(10), RealmsScreen.getLocalizedString("mco.configure.world.buttons.invite")));
        this.buttonsAdd(new Class5693(this, 1, this.width() / 2 - 100, Class7869.method25488(12), RealmsScreen.getLocalizedString("gui.cancel")));
        this.method15434(this.field21870 = this.method15436(2, this.width() / 2 - 100, Class7869.method25488(2), 200, 20, RealmsScreen.getLocalizedString("mco.configure.world.invite.profile.name")));
        this.method15428(this.field21870);
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    private void method15855() {
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        if (this.field21870.method15586() != null && !this.field21870.method15586().isEmpty()) {
            try {
                final RealmsServer method35445 = method35444.method35458(this.field21871.id, this.field21870.method15586().trim());
                if (method35445 != null) {
                    this.field21871.field28682 = method35445.field28682;
                    Realms.setScreen(new Class5069(this.field21872, this.field21871));
                }
                else {
                    this.method15856(RealmsScreen.getLocalizedString("mco.configure.world.players.error"));
                }
            }
            catch (final Exception ex) {
                Class5080.field21869.error("Couldn't invite user");
                this.method15856(RealmsScreen.getLocalizedString("mco.configure.world.players.error"));
            }
        }
        else {
            this.method15856(RealmsScreen.getLocalizedString("mco.configure.world.players.error"));
        }
    }
    
    private void method15856(final String field21878) {
        this.field21879 = true;
        Realms.narrateNow(this.field21878 = field21878);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.keyPressed(n, n2, n3);
        }
        Realms.setScreen(this.field21873);
        return true;
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15407(RealmsScreen.getLocalizedString("mco.configure.world.invite.profile.name"), this.width() / 2 - 100, Class7869.method25488(1), 10526880);
        if (this.field21879) {
            this.drawCenteredString(this.field21878, this.width() / 2, Class7869.method25488(5), 16711680);
        }
        this.field21870.method15590(n, n2, n3);
        super.render(n, n2, n3);
    }
    
    static {
        field21869 = LogManager.getLogger();
    }
}
