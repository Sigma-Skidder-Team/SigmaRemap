// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.TrueTypeFont;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Panel extends Class4825
{
    private static String[] field20591;
    private final List<Class9397> field20747;
    
    public Panel(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final boolean b) {
        super(customGuiScreen, s, n, n2, n3, n4, b);
        this.field20747 = new ArrayList<Class9397>();
    }
    
    public Panel(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final boolean b) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, b);
        this.field20747 = new ArrayList<Class9397>();
    }
    
    public Panel(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final boolean b) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, b);
        this.field20747 = new ArrayList<Class9397>();
    }
    
    public Panel(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805, final boolean b) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, b);
        this.field20747 = new ArrayList<Class9397>();
    }
    
    public final void method14516(final Class9397 class9397) {
        this.field20747.add(class9397);
    }
    
    public final void method14517() {
        final Iterator<Class9397> iterator = this.field20747.iterator();
        while (iterator.hasNext()) {
            iterator.next().method34926(this);
        }
    }

    public static interface Class9397
    {
        void method34926(final Panel p0);
    }
}
