// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.Logger;

public class Class5091 extends Class5046
{
    private static final Logger field22003;
    private final Class5046 field22004;
    private final Class5079 field22005;
    private final Class7437 field22006;
    private Class5611 field22007;
    private boolean field22008;
    private final String field22009 = "https://minecraft.net/realms/terms";
    
    public Class5091(final Class5046 field22004, final Class5079 field22005, final Class7437 field22006) {
        this.field22004 = field22004;
        this.field22005 = field22005;
        this.field22006 = field22006;
    }
    
    @Override
    public void method15369() {
        this.method15444(true);
        final int n = this.method15421() / 4;
        final int n2 = this.method15421() / 4 - 2;
        final int n3 = this.method15421() / 2 + 4;
        this.method15431(this.field22007 = new Class5677(this, 1, n, Class7869.method25488(12), n2, 20, Class5046.method15438("mco.terms.buttons.agree")));
        this.method15431(new Class5679(this, 2, n3, Class7869.method25488(12), n2, 20, Class5046.method15438("mco.terms.buttons.disagree")));
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        Class7847.method25362(this.field22004);
        return true;
    }
    
    private void method15965() {
        final Class9513 method35444 = Class9513.method35444();
        try {
            method35444.method35479();
            final Class5049 class5049 = new Class5049(this.field22004, new Class1341(this.field22005, this.field22004, this.field22006, new ReentrantLock()));
            class5049.method15466();
            Class7847.method25362(class5049);
        }
        catch (final Class2330 class5050) {
            Class5091.field22003.error("Couldn't agree to TOS");
        }
    }
    
    @Override
    public boolean method15368(final double n, final double n2, final int n3) {
        if (!this.field22008) {
            return super.method15368(n, n2, n3);
        }
        Class7847.method25376("https://minecraft.net/realms/terms");
        Class8428.method28148("https://minecraft.net/realms/terms");
        return true;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(Class5046.method15438("mco.terms.title"), this.method15421() / 2, 17, 16777215);
        this.method15407(Class5046.method15438("mco.terms.sentence.1"), this.method15421() / 2 - 120, Class7869.method25488(5), 16777215);
        final int method15424 = this.method15424(Class5046.method15438("mco.terms.sentence.1"));
        final int n4 = this.method15421() / 2 - 121 + method15424;
        final int method15425 = Class7869.method25488(5);
        final int n5 = n4 + this.method15424("mco.terms.sentence.2") + 1;
        final int n6 = method15425 + 1 + this.method15423();
        Label_0242: {
            if (n4 <= n) {
                if (n <= n5) {
                    if (method15425 <= n2) {
                        if (n2 <= n6) {
                            this.field22008 = true;
                            this.method15407(" " + Class5046.method15438("mco.terms.sentence.2"), this.method15421() / 2 - 120 + method15424, Class7869.method25488(5), 7107012);
                            break Label_0242;
                        }
                    }
                }
            }
            this.field22008 = false;
            this.method15407(" " + Class5046.method15438("mco.terms.sentence.2"), this.method15421() / 2 - 120 + method15424, Class7869.method25488(5), 3368635);
        }
        super.method15383(n, n2, n3);
    }
    
    static {
        field22003 = LogManager.getLogger();
    }
}