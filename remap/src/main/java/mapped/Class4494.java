// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Random;
import java.util.List;

public class Class4494 extends Class4493
{
    private static String[] field19886;
    public Class7530 field19887;
    public List<Class7530> field19888;
    public List<Class7530> field19889;
    public final List<Class4473> field19890;
    
    public Class4494(final Random random, final int n, final int n2) {
        super(random, n, n2);
        this.field19890 = Lists.newArrayList();
        this.field19888 = Lists.newArrayList();
        for (final Class7530 class7530 : Class6784.method20741()) {
            class7530.field29907 = 0;
            this.field19888.add(class7530);
        }
        this.field19889 = Lists.newArrayList();
        for (final Class7530 class7531 : Class6784.method20742()) {
            class7531.field29907 = 0;
            this.field19889.add(class7531);
        }
    }
    
    public Class4494(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40963, class1796);
        this.field19890 = Lists.newArrayList();
    }
}
