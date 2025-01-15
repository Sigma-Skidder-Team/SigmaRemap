// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.text.DateFormat;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class5071 extends Class5046
{
    private static final Logger field21750;
    private static int field21751;
    private final Class5076 field21752;
    private List<Class7426> field21753;
    private String field21754;
    private Class5057 field21755;
    private int field21756;
    private final int field21757;
    private Class5611 field21758;
    private Class5611 field21759;
    private Class5611 field21760;
    private Boolean field21761;
    private final Class7437 field21762;
    private Class5066 field21763;
    
    public Class5071(final Class5076 field21752, final Class7437 field21753, final int field21754) {
        this.field21753 = Collections.emptyList();
        this.field21756 = -1;
        this.field21761 = false;
        this.field21752 = field21752;
        this.field21762 = field21753;
        this.field21757 = field21754;
    }
    
    @Override
    public void method15369() {
        this.method15444(true);
        this.field21755 = new Class5057(this);
        if (Class5071.field21751 != -1) {
            this.field21755.method15529(Class5071.field21751);
        }
        new Class898(this, "Realms-fetch-backups").start();
        this.method15627();
    }
    
    private void method15625() {
        if (this.field21753.size() > 1) {
            for (int i = 0; i < this.field21753.size() - 1; ++i) {
                final Class7426 class7426 = this.field21753.get(i);
                final Class7426 class7427 = this.field21753.get(i + 1);
                if (!class7426.field28632.isEmpty()) {
                    if (!class7427.field28632.isEmpty()) {
                        for (final String s : class7426.field28632.keySet()) {
                            if (!s.contains("Uploaded") && class7427.field28632.containsKey(s)) {
                                if (class7426.field28632.get(s).equals(class7427.field28632.get(s))) {
                                    continue;
                                }
                                this.method15626(class7426, s);
                            }
                            else {
                                this.method15626(class7426, s);
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void method15626(final Class7426 class7426, final String s) {
        if (!s.contains("Uploaded")) {
            class7426.field28633.put(s, class7426.field28632.get(s));
        }
        else {
            class7426.field28633.put(s, DateFormat.getDateTimeInstance(3, 3).format(class7426.field28629));
            class7426.method22849(true);
        }
    }
    
    private void method15627() {
        this.method15431(this.field21758 = new Class5691(this, 2, this.method15421() - 135, Class7869.method25488(1), 120, 20, Class5046.method15438("mco.backup.button.download")));
        this.method15431(this.field21759 = new Class5656(this, 3, this.method15421() - 135, Class7869.method25488(3), 120, 20, Class5046.method15438("mco.backup.button.restore")));
        this.method15431(this.field21760 = new Class5692(this, 4, this.method15421() - 135, Class7869.method25488(5), 120, 20, Class5046.method15438("mco.backup.changes.tooltip")));
        this.method15431(new Class5648(this, 0, this.method15421() - 100, this.method15422() - 35, 85, 20, Class5046.method15438("gui.back")));
        this.method15428(this.field21755);
        this.method15428(this.field21763 = new Class5066(Class5046.method15438("mco.configure.world.backup"), this.method15421() / 2, 12, 16777215));
        this.method15434(this.field21755);
        this.method15628();
        this.method15446();
    }
    
    private void method15628() {
        this.field21759.method16919(this.method15630());
        this.field21760.method16919(this.method15629());
    }
    
    private boolean method15629() {
        return this.field21756 != -1 && !this.field21753.get(this.field21756).field28633.isEmpty();
    }
    
    private boolean method15630() {
        return this.field21756 != -1 && !this.field21762.field28684;
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
        Class7847.method25362(this.field21752);
        return true;
    }
    
    private void method15631(final int field21756) {
        if (field21756 >= 0) {
            if (field21756 < this.field21753.size()) {
                if (!this.field21762.field28684) {
                    this.field21756 = field21756;
                    final Date field21757 = this.field21753.get(field21756).field28629;
                    Class7847.method25362(new Class5084(this, Class2039.field11627, Class5046.method15439("mco.configure.world.restore.question.line1", DateFormat.getDateTimeInstance(3, 3).format(field21757), Class8428.method28149(System.currentTimeMillis() - field21757.getTime())), Class5046.method15438("mco.configure.world.restore.question.line2"), true, 1));
                }
            }
        }
    }
    
    private void method15632() {
        Class7847.method25362(new Class5084(this, Class2039.field11628, Class5046.method15438("mco.configure.world.restore.download.question.line1"), Class5046.method15438("mco.configure.world.restore.download.question.line2"), true, 2));
    }
    
    private void method15633() {
        final Class5049 class5049 = new Class5049(this.field21752.method15711(), new Class1337(this.field21762.field28675, this.field21757, this.field21762.field28677 + " (" + this.field21762.field28683.get(this.field21762.field28688).method22842(this.field21762.field28688) + ")", this));
        class5049.method15466();
        Class7847.method25362(class5049);
    }
    
    @Override
    public void method15437(final boolean b, final int n) {
        if (b && n == 1) {
            this.method15634();
        }
        else if (n != 1) {
            if (b && n == 2) {
                this.method15633();
            }
            else {
                Class7847.method25362(this);
            }
        }
        else {
            this.field21756 = -1;
            Class7847.method25362(this);
        }
    }
    
    private void method15634() {
        final Class7426 class7426 = this.field21753.get(this.field21756);
        this.field21756 = -1;
        final Class5049 class7427 = new Class5049(this.field21752.method15711(), new Class1335(class7426, this.field21762.field28675, this.field21752));
        class7427.method15466();
        Class7847.method25362(class7427);
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.field21754 = null;
        this.method15413();
        this.field21755.method15510(n, n2, n3);
        this.field21763.method15593(this);
        this.method15407(Class5046.method15438("mco.configure.world.backup"), (this.method15421() - 150) / 2 - 90, 20, 10526880);
        if (this.field21761) {
            this.method15407(Class5046.method15438("mco.backup.nobackups"), 20, this.method15422() / 2 - 10, 16777215);
        }
        this.field21758.method16917(!this.field21761);
        super.method15383(n, n2, n3);
        if (this.field21754 != null) {
            this.method15635(this.field21754, n, n2);
        }
    }
    
    public void method15635(final String s, final int n, final int n2) {
        if (s != null) {
            final int n3 = n + 12;
            final int n4 = n2 - 12;
            this.method15412(n3 - 3, n4 - 3, n3 + this.method15424(s) + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.method15425(s, n3, n4, 16777215);
        }
    }
    
    static {
        field21750 = LogManager.getLogger();
        Class5071.field21751 = -1;
    }
}
