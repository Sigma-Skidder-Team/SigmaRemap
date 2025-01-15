// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.ImmutableSet;

public class Class9334
{
    public static final Class9334 field40060;
    public static final Class9334 field40061;
    public static final Class9334 field40062;
    public static final Class9334 field40063;
    public static final Class9334 field40064;
    public static final Class9334 field40065;
    public static final Class9334 field40066;
    public static final Class9334 field40067;
    public static final Class9334 field40068;
    public static final Class9334 field40069;
    public static final Class9334 field40070;
    public static final Class9334 field40071;
    public static final Class9334 field40072;
    public static final Class9334 field40073;
    public static final Class9334 field40074;
    private final String field40075;
    private final Class8912 field40076;
    private final ImmutableSet<Item> field40077;
    private final ImmutableSet<Class3833> field40078;
    private final Class7795 field40079;
    
    private Class9334(final String field40075, final Class8912 field40076, final ImmutableSet<Item> field40077, final ImmutableSet<Class3833> field40078, final Class7795 field40079) {
        this.field40075 = field40075;
        this.field40076 = field40076;
        this.field40077 = field40077;
        this.field40078 = field40078;
        this.field40079 = field40079;
    }
    
    public Class8912 method34575() {
        return this.field40076;
    }
    
    public ImmutableSet<Item> method34576() {
        return this.field40077;
    }
    
    public ImmutableSet<Class3833> method34577() {
        return this.field40078;
    }
    
    @Nullable
    public Class7795 method34578() {
        return this.field40079;
    }
    
    @Override
    public String toString() {
        return this.field40075;
    }
    
    public static Class9334 method34579(final String s, final Class8912 class8912, final Class7795 class8913) {
        return method34580(s, class8912, (ImmutableSet<Item>)ImmutableSet.of(), (ImmutableSet<Class3833>)ImmutableSet.of(), class8913);
    }
    
    public static Class9334 method34580(final String s, final Class8912 class8912, final ImmutableSet<Item> set, final ImmutableSet<Class3833> set2, final Class7795 class8913) {
        return Class90.method512(Class90.field240, new Class1932(s), new Class9334(s, class8912, set, set2, class8913));
    }
    
    static {
        field40060 = method34579("none", Class8912.field37461, null);
        field40061 = method34579("armorer", Class8912.field37462, Class8520.field35682);
        field40062 = method34579("butcher", Class8912.field37463, Class8520.field35683);
        field40063 = method34579("cartographer", Class8912.field37464, Class8520.field35684);
        field40064 = method34579("cleric", Class8912.field37465, Class8520.field35685);
        field40065 = method34580("farmer", Class8912.field37466, (ImmutableSet<Item>)ImmutableSet.of((Object) Items.field31315, (Object) Items.field31314, (Object) Items.field31576), (ImmutableSet<Class3833>)ImmutableSet.of((Object)Class7521.field29298), Class8520.field35686);
        field40066 = method34579("fisherman", Class8912.field37467, Class8520.field35687);
        field40067 = method34579("fletcher", Class8912.field37468, Class8520.field35688);
        field40068 = method34579("leatherworker", Class8912.field37469, Class8520.field35689);
        field40069 = method34579("librarian", Class8912.field37470, Class8520.field35690);
        field40070 = method34579("mason", Class8912.field37471, Class8520.field35691);
        field40071 = method34579("nitwit", Class8912.field37472, null);
        field40072 = method34579("shepherd", Class8912.field37473, Class8520.field35692);
        field40073 = method34579("toolsmith", Class8912.field37474, Class8520.field35693);
        field40074 = method34579("weaponsmith", Class8912.field37475, Class8520.field35694);
    }
}
