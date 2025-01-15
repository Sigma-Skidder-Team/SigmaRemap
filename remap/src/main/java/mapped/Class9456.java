// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.function.Function;
import java.util.Optional;
import java.util.Map;

public class Class9456
{
    public static final Map<String, Class9456> field40639;
    public static final Class9456 field40640;
    public static final Class9456 field40641;
    public static final Class9456 field40642;
    public static final Class9456 field40643;
    public static final Class9456 field40644;
    public static final Class9456 field40645;
    public static final Class9456 field40646;
    public static final Class9456 field40647;
    public static final Class9456 field40648;
    public static final Class9456 field40649;
    public static final Class9456 field40650;
    public static final Class9456[] field40651;
    public static final Class9456[] field40652;
    private final String field40653;
    private final boolean field40654;
    private final Class263 field40655;
    
    public Class9456(final String s) {
        this(s, false, Class263.field1256);
    }
    
    public Class9456(final String field40653, final boolean field40654, final Class263 field40655) {
        this.field40653 = field40653;
        this.field40654 = field40654;
        this.field40655 = field40655;
        Class9456.field40639.put(field40653, this);
    }
    
    public static Optional<Class9456> method35137(final String s) {
        if (!Class9456.field40639.containsKey(s)) {
            final int index = s.indexOf(58);
            return (Optional<Class9456>)((index >= 0) ? Class90.field238.method506(Class1932.method7794(s.substring(0, index), '.')).flatMap(class2248 -> method35138((Class2248<Object>)class2248, Class1932.method7794(s2.substring(n + 1), '.'))) : Optional.empty());
        }
        return Optional.of(Class9456.field40639.get(s));
    }
    
    private static <T> Optional<Class9456> method35138(final Class2248<T> class2248, final Class1932 class2249) {
        return class2248.method8448().method506(class2249).map((Function<? super T, ? extends Class9456>)class2248::method8449);
    }
    
    public String method35139() {
        return this.field40653;
    }
    
    public boolean method35140() {
        return this.field40654;
    }
    
    public Class263 method35141() {
        return this.field40655;
    }
    
    static {
        field40639 = Maps.newHashMap();
        field40640 = new Class9456("dummy");
        field40641 = new Class9456("trigger");
        field40642 = new Class9456("deathCount");
        field40643 = new Class9456("playerKillCount");
        field40644 = new Class9456("totalKillCount");
        field40645 = new Class9456("health", true, Class263.field1257);
        field40646 = new Class9456("food", true, Class263.field1256);
        field40647 = new Class9456("air", true, Class263.field1256);
        field40648 = new Class9456("armor", true, Class263.field1256);
        field40649 = new Class9456("xp", true, Class263.field1256);
        field40650 = new Class9456("level", true, Class263.field1256);
        field40651 = new Class9456[] { new Class9456("teamkill." + Class2116.field12309.method8258()), new Class9456("teamkill." + Class2116.field12310.method8258()), new Class9456("teamkill." + Class2116.field12311.method8258()), new Class9456("teamkill." + Class2116.field12312.method8258()), new Class9456("teamkill." + Class2116.field12313.method8258()), new Class9456("teamkill." + Class2116.field12314.method8258()), new Class9456("teamkill." + Class2116.field12315.method8258()), new Class9456("teamkill." + Class2116.field12316.method8258()), new Class9456("teamkill." + Class2116.field12317.method8258()), new Class9456("teamkill." + Class2116.field12318.method8258()), new Class9456("teamkill." + Class2116.field12319.method8258()), new Class9456("teamkill." + Class2116.field12320.method8258()), new Class9456("teamkill." + Class2116.field12321.method8258()), new Class9456("teamkill." + Class2116.field12322.method8258()), new Class9456("teamkill." + Class2116.field12323.method8258()), new Class9456("teamkill." + Class2116.field12324.method8258()) };
        field40652 = new Class9456[] { new Class9456("killedByTeam." + Class2116.field12309.method8258()), new Class9456("killedByTeam." + Class2116.field12310.method8258()), new Class9456("killedByTeam." + Class2116.field12311.method8258()), new Class9456("killedByTeam." + Class2116.field12312.method8258()), new Class9456("killedByTeam." + Class2116.field12313.method8258()), new Class9456("killedByTeam." + Class2116.field12314.method8258()), new Class9456("killedByTeam." + Class2116.field12315.method8258()), new Class9456("killedByTeam." + Class2116.field12316.method8258()), new Class9456("killedByTeam." + Class2116.field12317.method8258()), new Class9456("killedByTeam." + Class2116.field12318.method8258()), new Class9456("killedByTeam." + Class2116.field12319.method8258()), new Class9456("killedByTeam." + Class2116.field12320.method8258()), new Class9456("killedByTeam." + Class2116.field12321.method8258()), new Class9456("killedByTeam." + Class2116.field12322.method8258()), new Class9456("killedByTeam." + Class2116.field12323.method8258()), new Class9456("killedByTeam." + Class2116.field12324.method8258()) };
    }
}
