// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class3645 extends Class3643
{
    private static Set<Integer> field16915;
    private static Map<Short, Integer> field16916;
    private static Map<Integer, Integer> field16917;
    
    public static Class7220 method11209() {
        return new Class7223(new Class3645());
    }
    
    private static short method11210(final Class9223 class9223) {
        return (short)((short)((short)((short)((short)(0x0 | method11211(class9223.method34008("east"))) | method11211(class9223.method34008("north")) << 2) | method11211(class9223.method34008("south")) << 4) | method11211(class9223.method34008("west")) << 6) | Integer.valueOf(class9223.method34008("power")) << 8);
    }
    
    private static int method11211(final String s) {
        switch (s) {
            case "none": {
                return 0;
            }
            case "side": {
                return 1;
            }
            case "up": {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int i) {
        final Integer n = Class3645.field16916.get((short)((short)((short)((short)((short)(0x0 | this.method11212(class6108, class6109, Class222.field773)) | this.method11212(class6108, class6109, Class222.field771) << 2) | this.method11212(class6108, class6109, Class222.field772) << 4) | this.method11212(class6108, class6109, Class222.field774) << 6) | Class3645.field16917.get(i) << 8));
        return (n != null) ? n : i;
    }
    
    private int method11212(final Class6108 class6108, final Class8322 class6109, final Class222 class6110) {
        final Class8322 method27702 = class6109.method27702(class6110);
        if (this.method11213(class6110, this.method11205(class6108, method27702))) {
            return 1;
        }
        if (Class3645.field16915.contains(this.method11205(class6108, method27702.method27702(Class222.field775))) && !Class8881.field37363.contains(this.method11205(class6108, class6109.method27702(Class222.field775)))) {
            return 2;
        }
        if (Class3645.field16915.contains(this.method11205(class6108, method27702.method27702(Class222.field776))) && !Class8881.field37363.contains(this.method11205(class6108, method27702))) {
            return 1;
        }
        return 0;
    }
    
    private boolean method11213(final Class222 class222, final int i) {
        final Class8614 class223 = Class8881.field37362.get(i);
        return class223 != null && class223.method29216("redstoneConnections", class222.method851(), false);
    }
    
    static {
        Class3645.field16915 = new HashSet<Integer>();
        Class3645.field16916 = new HashMap<Short, Integer>();
        Class3645.field16917 = new HashMap<Integer, Integer>();
    }
}
