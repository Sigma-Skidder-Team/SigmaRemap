// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Random;

public class Class8430
{
    private static final Class8430 field34594;
    private final Random field34595;
    private final String[] field34596;
    
    private Class8430() {
        this.field34595 = new Random();
        this.field34596 = "the elder scrolls klaatu berata niktu xyzzy bless curse light darkness fire air earth water hot dry cold wet ignite snuff embiggen twist shorten stretch fiddle destroy imbue galvanize enchant free limited range of towards inside sphere cube self other ball mental physical grow shrink demon elemental spirit animal creature beast humanoid undead fresh stale phnglui mglwnafh cthulhu rlyeh wgahnagl fhtagnbaguette".split(" ");
    }
    
    public static Class8430 method28151() {
        return Class8430.field34594;
    }
    
    public String method28152(final Class1844 class1844, final int n) {
        final int n2 = this.field34595.nextInt(2) + 3;
        String s = "";
        for (int i = 0; i < n2; ++i) {
            if (i > 0) {
                s += " ";
            }
            s += this.field34596[this.field34595.nextInt(this.field34596.length)];
        }
        final List<String> method6626 = class1844.method6626(s, n);
        return StringUtils.join((Iterable)((method6626.size() < 2) ? method6626 : method6626.subList(0, 2)), " ");
    }
    
    public void method28153(final long seed) {
        this.field34595.setSeed(seed);
    }
    
    static {
        field34594 = new Class8430();
    }
}
