// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5073 extends Class5046
{
    private static final Logger field21771;
    private final Class5046 field21772;
    private String field21773;
    private boolean field21774;
    private Class5059 field21775;
    private Class5066 field21776;
    private int field21777;
    private Class5611 field21778;
    private Class5611 field21779;
    
    public Class5073(final Class5046 field21772) {
        this.field21777 = -1;
        this.field21772 = field21772;
    }
    
    @Override
    public void method15369() {
        this.method15444(true);
        this.field21775 = new Class5059(this);
        new Class930(this, "Realms-pending-invitations-fetcher").start();
        this.method15431(this.field21778 = new Class5699(this, 1, this.method15421() / 2 - 174, this.method15422() - 32, 100, 20, Class5046.method15438("mco.invites.button.accept")));
        this.method15431(new Class5685(this, 0, this.method15421() / 2 - 50, this.method15422() - 32, 100, 20, Class5046.method15438("gui.done")));
        this.method15431(this.field21779 = new Class5642(this, 2, this.method15421() / 2 + 74, this.method15422() - 32, 100, 20, Class5046.method15438("mco.invites.button.reject")));
        this.method15428(this.field21776 = new Class5066(Class5046.method15438("mco.invites.title"), this.method15421() / 2, 12, 16777215));
        this.method15428(this.field21775);
        this.method15446();
        this.method15659();
    }
    
    @Override
    public void method15375() {
        super.method15375();
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        Class7847.method25362(new Class5079(this.field21772));
        return true;
    }
    
    private void method15655(final int n) {
        this.field21775.method15542(n);
    }
    
    private void method15656(final int n) {
        if (n < this.field21775.method15521()) {
            new Class925(this, "Realms-reject-invitation", n).start();
        }
    }
    
    private void method15657(final int n) {
        if (n < this.field21775.method15521()) {
            new Class912(this, "Realms-accept-invitation", n).start();
        }
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.field21773 = null;
        this.method15413();
        this.field21775.method15510(n, n2, n3);
        this.field21776.method15593(this);
        if (this.field21773 != null) {
            this.method15658(this.field21773, n, n2);
        }
        if (this.field21775.method15521() == 0) {
            if (this.field21774) {
                this.method15405(Class5046.method15438("mco.invites.nopending"), this.method15421() / 2, this.method15422() / 2 - 20, 16777215);
            }
        }
        super.method15383(n, n2, n3);
    }
    
    public void method15658(final String s, final int n, final int n2) {
        if (s != null) {
            final int n3 = n + 12;
            final int n4 = n2 - 12;
            this.method15412(n3 - 3, n4 - 3, n3 + this.method15424(s) + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.method15425(s, n3, n4, 16777215);
        }
    }
    
    private void method15659() {
        this.field21778.method16919(this.method15660(this.field21777));
        this.field21779.method16919(this.method15660(this.field21777));
    }
    
    private boolean method15660(final int n) {
        return n != -1;
    }
    
    public static String method15661(final Class7442 class7442) {
        return Class8428.method28149(System.currentTimeMillis() - class7442.field28707.getTime());
    }
    
    static {
        field21771 = LogManager.getLogger();
    }
}