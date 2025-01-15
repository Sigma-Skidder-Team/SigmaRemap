// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3656 extends Class3651
{
    private static final Class222[] field16932;
    private static final int[] field16933;
    
    public static List<Class7220> method11249() {
        final ArrayList list = new ArrayList(2);
        list.add(new Class3656("cobbleWallConnections").method11237("minecraft:cobblestone_wall"));
        list.add(new Class3656("cobbleWallConnections").method11237("minecraft:mossy_cobblestone_wall"));
        return list;
    }
    
    public Class3656(final String s) {
        super(s);
    }
    
    @Override
    public byte method11238(final Class9223 class9223) {
        byte method11238 = super.method11238(class9223);
        if (class9223.method34008("up").equals("true")) {
            method11238 |= 0x10;
        }
        return method11238;
    }
    
    @Override
    public byte method11239(final Class6108 class6108, final Class8322 class6109, final int n) {
        byte method11239 = super.method11239(class6108, class6109, n);
        if (this.method11250(class6108, class6109)) {
            method11239 |= 0x10;
        }
        return method11239;
    }
    
    public boolean method11250(final Class6108 class6108, final Class8322 class6109) {
        if (this.method11252(this.method11205(class6108, class6109.method27702(Class222.field776))) || this.method11252(this.method11205(class6108, class6109.method27702(Class222.field775)))) {
            return true;
        }
        final int method11251 = this.method11251(class6108, class6109);
        if (method11251 != 0 && method11251 != 15) {
            for (int i = 0; i < Class3656.field16932.length; ++i) {
                if ((method11251 & 1 << i) != 0x0 && (method11251 & 1 << Class3656.field16933[i]) == 0x0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    private int method11251(final Class6108 class6108, final Class8322 class6109) {
        int n = 0;
        for (int i = 0; i < Class3656.field16932.length; ++i) {
            if (this.method11252(this.method11205(class6108, class6109.method27702(Class3656.field16932[i])))) {
                n |= 1 << i;
            }
        }
        return n;
    }
    
    private boolean method11252(final int i) {
        return this.method11241().contains(i);
    }
    
    static {
        field16932 = new Class222[] { Class222.field773, Class222.field771, Class222.field772, Class222.field774 };
        field16933 = new int[] { 3, 2, 1, 0 };
    }
}
