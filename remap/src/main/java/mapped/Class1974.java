// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class1974
{
    field10859(-1), 
    field10860(1, Class1974.field10859), 
    field10861(2, Class1974.field10859), 
    field10862(8, Class1974.field10859), 
    field10863(9, Class1974.field10859), 
    field10864(10, Class1974.field10859), 
    field10865(11, Class1974.field10859), 
    field10866(12, Class1974.field10859), 
    field10867(13, Class1974.field10859), 
    field10868(14, Class1974.field10859), 
    field10869(15, Class1974.field10859), 
    field10870(17, Class1974.field10859), 
    field10871(18, Class1974.field10859), 
    field10872(19, Class1974.field10859), 
    field10873(20, Class1974.field10859), 
    field10874(21, Class1974.field10859), 
    field10875(22, Class1974.field10859), 
    field10876(23, Class1974.field10864), 
    field10877(24, Class1974.field10864), 
    field10878(25, Class1974.field10859), 
    field10879(26, Class1974.field10866), 
    field10880(-1, Class1974.field10859), 
    field10881(-1, Class1974.field10880), 
    field10882(-1, Class1974.field10881), 
    field10883(-1, Class1974.field10882), 
    field10884(-1, Class1974.field10880), 
    field10885(30, Class1974.field10880), 
    field10886(-1, Class1974.field10859), 
    field10887(40, Class1974.field10886), 
    field10888(41, Class1974.field10859), 
    field10889(42, Class1974.field10886), 
    field10890(43, Class1974.field10886), 
    field10891(44, Class1974.field10886), 
    field10892(45, Class1974.field10886), 
    field10893(46, Class1974.field10886), 
    field10894(47, Class1974.field10886), 
    field10895(50, Class1974.field10881), 
    field10896(51, Class1974.field10881), 
    field10897(52, Class1974.field10881), 
    field10898(53, Class1974.field10881), 
    field10899(54, Class1974.field10881), 
    field10900(55, Class1974.field10881), 
    field10901(56, Class1974.field10881), 
    field10902(57, Class1974.field10899), 
    field10903(58, Class1974.field10881), 
    field10904(59, Class1974.field10897), 
    field10905(60, Class1974.field10881), 
    field10906(61, Class1974.field10881), 
    field10907(62, Class1974.field10900), 
    field10908(63, Class1974.field10881), 
    field10909(64, Class1974.field10881), 
    field10910(65, Class1974.field10881), 
    field10911(66, Class1974.field10881), 
    field10912(67, Class1974.field10881), 
    field10913(68, Class1974.field10881), 
    field10914(99, Class1974.field10881), 
    field10915(69, Class1974.field10914), 
    field10916(90, Class1974.field10882), 
    field10917(91, Class1974.field10882), 
    field10918(92, Class1974.field10882), 
    field10919(93, Class1974.field10882), 
    field10920(94, Class1974.field10881), 
    field10921(95, Class1974.field10883), 
    field10922(96, Class1974.field10918), 
    field10923(97, Class1974.field10914), 
    field10924(98, Class1974.field10883), 
    field10925(100, Class1974.field10882), 
    field10926(101, Class1974.field10882), 
    field10927(102, Class1974.field10882), 
    field10928(120, Class1974.field10882), 
    field10929(200, Class1974.field10859), 
    field10930(-1, Class1974.field10859), 
    field10931(-1, Class1974.field10930), 
    field10932(-1, Class1974.field10859), 
    field10933(-1, Class1974.field10859), 
    field10934(-1, Class1974.field10859), 
    field10935(-1, Class1974.field10859), 
    field10936(-1, Class1974.field10859), 
    field10937(-1, Class1974.field10884), 
    field10938(-1, Class1974.field10859);
    
    private static final Map<Integer, Class1974> field10939;
    private final int field10940;
    private final Class1974 field10941;
    
    private Class1974(final int field10940) {
        this.field10940 = field10940;
        this.field10941 = null;
    }
    
    public static Optional<Class1974> method7983(final int i) {
        if (i != -1) {
            return (Optional<Class1974>)Optional.fromNullable((Object)Class1974.field10939.get(i));
        }
        return (Optional<Class1974>)Optional.absent();
    }
    
    private Class1974(final int field10940, final Class1974 field10941) {
        this.field10940 = field10940;
        this.field10941 = field10941;
    }
    
    public int method7984() {
        return this.field10940;
    }
    
    public Class1974 method7985() {
        return this.field10941;
    }
    
    static {
        field10939 = new HashMap<Integer, Class1974>();
        for (final Class1974 class1974 : values()) {
            Class1974.field10939.put(class1974.field10940, class1974);
        }
    }
}
