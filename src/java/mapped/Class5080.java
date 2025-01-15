// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5080 extends Class5046
{
    private static final Logger field21869;
    private Class5065 field21870;
    private final Class7437 field21871;
    private final Class5076 field21872;
    private final Class5046 field21873;
    private final int field21874 = 0;
    private final int field21875 = 1;
    private Class5611 field21876;
    private final int field21877 = 2;
    private String field21878;
    private boolean field21879;
    
    public Class5080(final Class5076 field21872, final Class5046 field21873, final Class7437 field21874) {
        this.field21872 = field21872;
        this.field21873 = field21873;
        this.field21871 = field21874;
    }
    
    @Override
    public void method15375() {
        this.field21870.method15587();
    }
    
    @Override
    public void method15369() {
        this.method15444(true);
        this.method15431(this.field21876 = new Class5675(this, 0, this.method15421() / 2 - 100, Class7869.method25488(10), Class5046.method15438("mco.configure.world.buttons.invite")));
        this.method15431(new Class5693(this, 1, this.method15421() / 2 - 100, Class7869.method25488(12), Class5046.method15438("gui.cancel")));
        this.method15434(this.field21870 = this.method15436(2, this.method15421() / 2 - 100, Class7869.method25488(2), 200, 20, Class5046.method15438("mco.configure.world.invite.profile.name")));
        this.method15428(this.field21870);
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    private void method15855() {
        final Class9513 method35444 = Class9513.method35444();
        if (this.field21870.method15586() != null && !this.field21870.method15586().isEmpty()) {
            try {
                final Class7437 method35445 = method35444.method35458(this.field21871.field28675, this.field21870.method15586().trim());
                if (method35445 != null) {
                    this.field21871.field28682 = method35445.field28682;
                    Class7847.method25362(new Class5069(this.field21872, this.field21871));
                }
                else {
                    this.method15856(Class5046.method15438("mco.configure.world.players.error"));
                }
            }
            catch (final Exception ex) {
                Class5080.field21869.error("Couldn't invite user");
                this.method15856(Class5046.method15438("mco.configure.world.players.error"));
            }
        }
        else {
            this.method15856(Class5046.method15438("mco.configure.world.players.error"));
        }
    }
    
    private void method15856(final String field21878) {
        this.field21879 = true;
        Class7847.method25381(this.field21878 = field21878);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        Class7847.method25362(this.field21873);
        return true;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15407(Class5046.method15438("mco.configure.world.invite.profile.name"), this.method15421() / 2 - 100, Class7869.method25488(1), 10526880);
        if (this.field21879) {
            this.method15405(this.field21878, this.method15421() / 2, Class7869.method25488(5), 16711680);
        }
        this.field21870.method15590(n, n2, n3);
        super.method15383(n, n2, n3);
    }
    
    static {
        field21869 = LogManager.getLogger();
    }
}
