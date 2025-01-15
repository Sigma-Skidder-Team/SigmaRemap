// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Class3651 extends Class3643
{
    private final String field16927;
    private Set<Integer> field16928;
    private Map<Byte, Integer> field16929;
    private static final Class3649 field16930;
    
    public Class3651(final String field16927) {
        this.field16928 = new HashSet<Integer>();
        this.field16929 = new HashMap<Byte, Integer>();
        this.field16927 = field16927;
    }
    
    public Class7220 method11237(final String s) {
        return new Class7230(this, s, this);
    }
    
    public byte method11238(final Class9223 class9223) {
        byte b = 0;
        if (class9223.method34008("east").equals("true")) {
            b |= 0x1;
        }
        if (class9223.method34008("north").equals("true")) {
            b |= 0x2;
        }
        if (class9223.method34008("south").equals("true")) {
            b |= 0x4;
        }
        if (class9223.method34008("west").equals("true")) {
            b |= 0x8;
        }
        return b;
    }
    
    public byte method11239(final Class6108 class6108, final Class8322 class6109, final int n) {
        byte b = 0;
        final boolean b2 = class6108.method18207(Class6651.class).method20208() < Class7906.field32460.method25613();
        if (this.method11240(Class222.field773, this.method11205(class6108, class6109.method27702(Class222.field773)), b2)) {
            b |= 0x1;
        }
        if (this.method11240(Class222.field771, this.method11205(class6108, class6109.method27702(Class222.field771)), b2)) {
            b |= 0x2;
        }
        if (this.method11240(Class222.field772, this.method11205(class6108, class6109.method27702(Class222.field772)), b2)) {
            b |= 0x4;
        }
        if (this.method11240(Class222.field774, this.method11205(class6108, class6109.method27702(Class222.field774)), b2)) {
            b |= 0x8;
        }
        return b;
    }
    
    @Override
    public int method11205(final Class6108 class6108, final Class8322 class6109) {
        return Class3651.field16930.method11202(class6108, class6109, super.method11205(class6108, class6109));
    }
    
    @Override
    public int method11202(final Class6108 class6108, final Class8322 class6109, final int n) {
        final Integer n2 = this.field16929.get(this.method11239(class6108, class6109, n));
        return (n2 != null) ? n2 : n;
    }
    
    public boolean method11240(final Class222 class222, final int i, final boolean b) {
        if (!this.field16928.contains(i)) {
            if (this.field16927 != null) {
                if (Class8881.field37362.containsKey(i)) {
                    if (Class8881.field37362.get(i).method29216(this.field16927, class222.method851(), b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public Set<Integer> method11241() {
        return this.field16928;
    }
    
    static {
        field16930 = new Class3649();
    }
}
