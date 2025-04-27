// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class2162
{
    field12836(1, Class2137.field12506), 
    field12837(2, Class2137.field12475), 
    field12838(3, Class2137.field12563), 
    field12839(10, Class2137.field12507), 
    field12840(50, Class2137.field12488), 
    field12841(51, Class2137.field12560), 
    field12842(60, Class2137.field12479), 
    field12843(61, Class2137.field12480), 
    field12844(62, Class2137.field12564), 
    field12845(63, Class2137.field12481), 
    field12846(64, Class2137.field12482), 
    field12847(65, Class2137.field12483), 
    field12848(66, Class2137.field12487), 
    field12849(67, Class2137.field12492), 
    field12850(68, Class2137.field12570), 
    field12851(70, Class2137.field12489), 
    field12852(71, Class2137.field12486), 
    field12853(72, Class2137.field12484), 
    field12854(73, Class2137.field12561), 
    field12855(75, Class2137.field12485), 
    field12856(76, Class2137.field12490), 
    field12857(77, Class2137.field12477), 
    field12858(78, Class2137.field12500), 
    field12859(79, Class2137.field12494), 
    field12860(90, Class2137.field12565), 
    field12861(91, Class2137.field12491), 
    field12862(93, Class2137.field12493);
    
    private static final Map<Integer, Class2162> field12863;
    private final int field12864;
    private final Class2137 field12865;
    
    public static Optional<Class2162> method8330(final int i) {
        if (i != -1) {
            return (Optional<Class2162>)Optional.fromNullable((Object)Class2162.field12863.get(i));
        }
        return Optional.absent();
    }
    
    public static Optional<Class2137> method8331(final int n) {
        final Optional<Class2162> method8330 = method8330(n);
        if (method8330.isPresent()) {
            return (Optional<Class2137>)Optional.of((Object) method8330.get().method8333());
        }
        return Optional.absent();
    }
    
    Class2162(final int field12864, final Class2137 field12865) {
        this.field12864 = field12864;
        this.field12865 = field12865;
    }
    
    public int method8332() {
        return this.field12864;
    }
    
    public Class2137 method8333() {
        return this.field12865;
    }
    
    static {
        field12863 = new HashMap<Integer, Class2162>();
        for (final Class2162 class2162 : values()) {
            Class2162.field12863.put(class2162.field12864, class2162);
        }
    }
}
