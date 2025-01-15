// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.util.Direction;

public class Class3964 extends Class3833
{
    public static final Class7115 field17908;
    public static final Class7113 field17909;
    public static final Class7702 field17910;
    public static final Class7702 field17911;
    public static final Class7702 field17912;
    private static Class8691 field17913;
    
    public Class3964(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3964.field17908, Direction.NORTH)).method21773((Class7111<Comparable>)Class3964.field17909, false));
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return class7096.method21772((Class7111<Boolean>)Class3964.field17909) ? Class3964.field17912 : Class3964.field17910;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3964.field17908, class7074.method21644().getOpposite())).method21773((Class7111<Comparable>)Class3964.field17909, false);
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098) {
        return class7096.method21772((Class7111<Boolean>)Class3964.field17909) ? 15 : 0;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3964.field17908, class7097.method8142(class7096.method21772((Class7111<Direction>)Class3964.field17908)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Direction>)Class3964.field17908)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3964.field17908, Class3964.field17909);
    }
    
    public static Class8691 method12093() {
        if (Class3964.field17913 == null) {
            Class3964.field17913 = Class9512.method35439().method35438("?vvv?", ">???<", ">???<", ">???<", "?^^^?").method35440('?', Class7990.method26069(Class169.field490)).method35440('^', Class7990.method26069(Class169.method766(Class7521.field29402).method768((Class7111<Comparable>)Class3964.field17909, (Predicate<Object>)Predicates.equalTo((Object)true)).method768((Class7111<Comparable>)Class3964.field17908, (Predicate<Object>)Predicates.equalTo((Object) Direction.SOUTH)))).method35440('>', Class7990.method26069(Class169.method766(Class7521.field29402).method768((Class7111<Comparable>)Class3964.field17909, (Predicate<Object>)Predicates.equalTo((Object)true)).method768((Class7111<Comparable>)Class3964.field17908, (Predicate<Object>)Predicates.equalTo((Object) Direction.WEST)))).method35440('v', Class7990.method26069(Class169.method766(Class7521.field29402).method768((Class7111<Comparable>)Class3964.field17909, (Predicate<Object>)Predicates.equalTo((Object)true)).method768((Class7111<Comparable>)Class3964.field17908, (Predicate<Object>)Predicates.equalTo((Object) Direction.NORTH)))).method35440('<', Class7990.method26069(Class169.method766(Class7521.field29402).method768((Class7111<Comparable>)Class3964.field17909, (Predicate<Object>)Predicates.equalTo((Object)true)).method768((Class7111<Comparable>)Class3964.field17908, (Predicate<Object>)Predicates.equalTo((Object) Direction.EAST)))).method35441();
        }
        return Class3964.field17913;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17908 = Class3892.field17564;
        field17909 = Class8970.field37726;
        field17910 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
        field17911 = Class3833.method11778(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
        field17912 = Class7698.method24492(Class3964.field17910, Class3964.field17911);
    }
}
