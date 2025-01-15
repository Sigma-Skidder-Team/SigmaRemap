// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Class1338 extends Class1334
{
    private final String field7330;
    private final String field7331;
    private final long field7332;
    private final Class5046 field7333;
    
    public Class1338(final long field7332, final String field7333, final String field7334, final Class5046 field7335) {
        this.field7332 = field7332;
        this.field7330 = field7333;
        this.field7331 = field7334;
        this.field7333 = field7335;
    }
    
    @Override
    public void run() {
        this.method5621(Class5046.method15438("mco.create.world.wait"));
        final Class9513 method35444 = Class9513.method35444();
        try {
            method35444.method35452(this.field7332, this.field7330, this.field7331);
            Class7847.method25362(this.field7333);
        }
        catch (final Class2330 class2330) {
            Class8593.method29100().error("Couldn't create world");
            this.method5620(class2330.toString());
        }
        catch (final UnsupportedEncodingException ex) {
            Class8593.method29100().error("Couldn't create world");
            this.method5620(ex.getLocalizedMessage());
        }
        catch (final IOException ex2) {
            Class8593.method29100().error("Could not parse response creating world");
            this.method5620(ex2.getLocalizedMessage());
        }
        catch (final Exception ex3) {
            Class8593.method29100().error("Could not create world");
            this.method5620(ex3.getLocalizedMessage());
        }
    }
}
