// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Class1338 extends LongRunningTask
{
    private final String field7330;
    private final String field7331;
    private final long field7332;
    private final RealmsScreen field7333;
    
    public Class1338(final long field7332, final String field7333, final String field7334, final RealmsScreen field7335) {
        this.field7332 = field7332;
        this.field7330 = field7333;
        this.field7331 = field7334;
        this.field7333 = field7335;
    }
    
    @Override
    public void run() {
        this.func_224989_b(RealmsScreen.getLocalizedString("mco.create.world.wait"));
        final RealmsClient method35444 = RealmsClient.func_224911_a();
        try {
            method35444.method35452(this.field7332, this.field7330, this.field7331);
            Realms.setScreen(this.field7333);
        }
        catch (final RealmsServiceException class2330) {
            RealmsTasks.getLogger().error("Couldn't create world");
            this.func_224986_a(class2330.toString());
        }
        catch (final UnsupportedEncodingException ex) {
            RealmsTasks.getLogger().error("Couldn't create world");
            this.func_224986_a(ex.getLocalizedMessage());
        }
        catch (final IOException ex2) {
            RealmsTasks.getLogger().error("Could not parse response creating world");
            this.func_224986_a(ex2.getLocalizedMessage());
        }
        catch (final Exception ex3) {
            RealmsTasks.getLogger().error("Could not create world");
            this.func_224986_a(ex3.getLocalizedMessage());
        }
    }
}
