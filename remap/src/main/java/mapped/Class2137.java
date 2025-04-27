// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class2137
{
    field12474(-1), 
    field12475(1, Class2137.field12474), 
    field12476(2, Class2137.field12474), 
    field12477(8, Class2137.field12474), 
    field12478(9, Class2137.field12474), 
    field12479(10, Class2137.field12474), 
    field12480(11, Class2137.field12474), 
    field12481(12, Class2137.field12474), 
    field12482(13, Class2137.field12474), 
    field12483(14, Class2137.field12474), 
    field12484(15, Class2137.field12474), 
    field12485(17, Class2137.field12474), 
    field12486(18, Class2137.field12474), 
    field12487(19, Class2137.field12474), 
    field12488(20, Class2137.field12474), 
    field12489(21, Class2137.field12474), 
    field12490(22, Class2137.field12474), 
    field12491(24, Class2137.field12479), 
    field12492(25, Class2137.field12474), 
    field12493(26, Class2137.field12481), 
    field12494(33, Class2137.field12474), 
    field12495(-1, Class2137.field12474), 
    field12496(-1, Class2137.field12495), 
    field12497(-1, Class2137.field12496), 
    field12498(-1, Class2137.field12497), 
    field12499(-1, Class2137.field12495), 
    field12500(30, Class2137.field12495), 
    field12501(34, Class2137.field12496), 
    field12502(35, Class2137.field12496), 
    field12503(36, Class2137.field12496), 
    field12504(-1, Class2137.field12474), 
    field12505(40, Class2137.field12504), 
    field12506(41, Class2137.field12474), 
    field12507(42, Class2137.field12504), 
    field12508(43, Class2137.field12504), 
    field12509(44, Class2137.field12504), 
    field12510(45, Class2137.field12504), 
    field12511(46, Class2137.field12504), 
    field12512(47, Class2137.field12504), 
    field12513(50, Class2137.field12496), 
    field12514(-1, Class2137.field12496), 
    field12515(51, Class2137.field12514), 
    field12516(5, Class2137.field12514), 
    field12517(6, Class2137.field12514), 
    field12518(52, Class2137.field12496), 
    field12519(53, Class2137.field12496), 
    field12520(54, Class2137.field12496), 
    field12521(23, Class2137.field12520), 
    field12522(27, Class2137.field12520), 
    field12523(55, Class2137.field12496), 
    field12524(56, Class2137.field12496), 
    field12525(57, Class2137.field12520), 
    field12526(58, Class2137.field12496), 
    field12527(59, Class2137.field12518), 
    field12528(60, Class2137.field12496), 
    field12529(61, Class2137.field12496), 
    field12530(62, Class2137.field12523), 
    field12531(63, Class2137.field12496), 
    field12532(64, Class2137.field12496), 
    field12533(65, Class2137.field12496), 
    field12534(66, Class2137.field12496), 
    field12535(67, Class2137.field12496), 
    field12536(68, Class2137.field12496), 
    field12537(4, Class2137.field12536), 
    field12538(99, Class2137.field12496), 
    field12539(69, Class2137.field12538), 
    field12540(90, Class2137.field12497), 
    field12541(91, Class2137.field12497), 
    field12542(92, Class2137.field12497), 
    field12543(93, Class2137.field12497), 
    field12544(94, Class2137.field12496), 
    field12545(95, Class2137.field12498), 
    field12546(96, Class2137.field12542), 
    field12547(97, Class2137.field12538), 
    field12548(98, Class2137.field12498), 
    field12549(-1, Class2137.field12497), 
    field12550(100, Class2137.field12549), 
    field12551(28, Class2137.field12549), 
    field12552(29, Class2137.field12549), 
    field12553(-1, Class2137.field12549), 
    field12554(31, Class2137.field12553), 
    field12555(32, Class2137.field12553), 
    field12556(103, Class2137.field12553), 
    field12557(101, Class2137.field12497), 
    field12558(102, Class2137.field12497), 
    field12559(120, Class2137.field12497), 
    field12560(200, Class2137.field12474), 
    field12561(-1, Class2137.field12474), 
    field12562(-1, Class2137.field12561), 
    field12563(-1, Class2137.field12474), 
    field12564(-1, Class2137.field12474), 
    field12565(-1, Class2137.field12474), 
    field12566(-1, Class2137.field12474), 
    field12567(-1, Class2137.field12474), 
    field12568(-1, Class2137.field12499), 
    field12569(-1, Class2137.field12474), 
    field12570(-1, Class2137.field12474);
    
    private static final Map<Integer, Class2137> field12571;
    private final int field12572;
    private final Class2137 field12573;
    
    Class2137(final int field12572) {
        this.field12572 = field12572;
        this.field12573 = null;
    }
    
    public static Optional<Class2137> method8292(final int i) {
        if (i != -1) {
            return (Optional<Class2137>)Optional.fromNullable((Object)Class2137.field12571.get(i));
        }
        return Optional.absent();
    }
    
    public boolean method8293(final Class2137... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (this.method8294(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public boolean method8294(final Class2137 class2137) {
        return this == class2137;
    }
    
    public boolean method8295(final Class2137 other) {
        Class2137 method8297 = this;
        while (!method8297.equals(other)) {
            method8297 = method8297.method8297();
            if (method8297 != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    Class2137(final int field12572, final Class2137 field12573) {
        this.field12572 = field12572;
        this.field12573 = field12573;
    }
    
    public int method8296() {
        return this.field12572;
    }
    
    public Class2137 method8297() {
        return this.field12573;
    }
    
    static {
        field12571 = new HashMap<Integer, Class2137>();
        for (final Class2137 class2137 : values()) {
            Class2137.field12571.put(class2137.field12572, class2137);
        }
    }
}
