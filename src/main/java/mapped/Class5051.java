// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;

public class Class5051 extends Class5046
{
    private final Class5046 field21693;
    private final int field21694 = 0;
    private final Class7426 field21695;
    private final List<String> field21696;
    private Class5055 field21697;
    public String[] field21698;
    public String[] field21699;
    
    public Class5051(final Class5046 field21693, final Class7426 field21694) {
        this.field21696 = Lists.newArrayList();
        this.field21698 = new String[] { Class5046.method15438("options.difficulty.peaceful"), Class5046.method15438("options.difficulty.easy"), Class5046.method15438("options.difficulty.normal"), Class5046.method15438("options.difficulty.hard") };
        this.field21699 = new String[] { Class5046.method15438("selectWorld.gameMode.survival"), Class5046.method15438("selectWorld.gameMode.creative"), Class5046.method15438("selectWorld.gameMode.adventure") };
        this.field21693 = field21693;
        this.field21695 = field21694;
        if (field21694.field28633 != null) {
            final Iterator<Map.Entry<String, String>> iterator = field21694.field28633.entrySet().iterator();
            while (iterator.hasNext()) {
                this.field21696.add(((Map.Entry<String, V>)iterator.next()).getKey());
            }
        }
    }
    
    @Override
    public void method15375() {
    }
    
    @Override
    public void method15369() {
        this.method15444(true);
        this.method15431(new Class5627(this, 0, this.method15421() / 2 - 100, this.method15422() / 4 + 120 + 24, Class5046.method15438("gui.back")));
        this.method15428(this.field21697 = new Class5055(this));
        this.method15434(this.field21697);
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
        Class7847.method25362(this.field21693);
        return true;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        this.method15405("Changes from last backup", this.method15421() / 2, 10, 16777215);
        this.field21697.method15497(n, n2, n3);
        super.method15383(n, n2, n3);
    }
    
    private String method15483(final String s, final String s2) {
        final String lowerCase = s.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("game") && lowerCase.contains("mode")) {
            return this.method15485(s2);
        }
        return (lowerCase.contains("game") && lowerCase.contains("difficulty")) ? this.method15484(s2) : s2;
    }
    
    private String method15484(final String s) {
        try {
            return this.field21698[Integer.parseInt(s)];
        }
        catch (final Exception ex) {
            return "UNKNOWN";
        }
    }
    
    private String method15485(final String s) {
        try {
            return this.field21699[Integer.parseInt(s)];
        }
        catch (final Exception ex) {
            return "UNKNOWN";
        }
    }
}
