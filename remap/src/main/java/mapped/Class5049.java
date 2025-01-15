// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5049 extends Class5046
{
    private static final Logger field21667;
    private final int field21668 = 666;
    private final int field21669 = 667;
    private final Class5046 field21670;
    private final Class1334 field21671;
    private volatile String field21672;
    private volatile boolean field21673;
    private volatile String field21674;
    private volatile boolean field21675;
    private int field21676;
    private final Class1334 field21677;
    private final int field21678 = 212;
    public static final String[] field21679;
    
    public Class5049(final Class5046 field21670, final Class1334 class1334) {
        this.field21672 = "";
        this.field21670 = field21670;
        (this.field21677 = class1334).method5619(this);
        this.field21671 = class1334;
    }
    
    public void method15466() {
        final Thread thread = new Thread(this.field21671, "Realms-long-running-task");
        thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new Class8236(Class5049.field21667));
        thread.start();
    }
    
    @Override
    public void method15375() {
        super.method15375();
        Class7847.method25386(this.field21672);
        ++this.field21676;
        this.field21677.method5623();
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        this.method15467();
        return true;
    }
    
    @Override
    public void method15369() {
        this.field21677.method5624();
        this.method15431(new Class5686(this, 666, this.method15421() / 2 - 106, Class7869.method25488(12), 212, 20, Class5046.method15438("gui.cancel")));
    }
    
    private void method15467() {
        this.field21675 = true;
        this.field21677.method5625();
        Class7847.method25362(this.field21670);
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405(this.field21672, this.method15421() / 2, Class7869.method25488(3), 16777215);
        if (!this.field21673) {
            this.method15405(Class5049.field21679[this.field21676 % Class5049.field21679.length], this.method15421() / 2, Class7869.method25488(8), 8421504);
        }
        if (this.field21673) {
            this.method15405(this.field21674, this.method15421() / 2, Class7869.method25488(8), 16711680);
        }
        super.method15383(n, n2, n3);
    }
    
    public void method15468(final String field21674) {
        this.field21673 = true;
        Class7847.method25381(this.field21674 = field21674);
        this.method15433();
        this.method15431(new Class5683(this, 667, this.method15421() / 2 - 106, this.method15422() / 4 + 120 + 12, Class5046.method15438("gui.back")));
    }
    
    public void method15469(final String field21672) {
        this.field21672 = field21672;
    }
    
    public boolean method15470() {
        return this.field21675;
    }
    
    static {
        field21667 = LogManager.getLogger();
        field21679 = new String[] { "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _" };
    }
}
