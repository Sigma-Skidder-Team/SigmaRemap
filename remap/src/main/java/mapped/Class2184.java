// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class2184
{
    field12931(1, Class1974.field10888), 
    field12932(2, Class1974.field10860), 
    field12933(3, Class1974.field10932), 
    field12934(10, Class1974.field10889), 
    field12935(50, Class1974.field10873), 
    field12936(51, Class1974.field10929), 
    field12937(60, Class1974.field10876), 
    field12938(61, Class1974.field10865), 
    field12939(62, Class1974.field10933), 
    field12940(63, Class1974.field10866), 
    field12941(64, Class1974.field10867), 
    field12942(65, Class1974.field10868), 
    field12943(66, Class1974.field10872), 
    field12944(67, Class1974.field10878), 
    field12945(70, Class1974.field10874), 
    field12946(71, Class1974.field10871), 
    field12947(72, Class1974.field10869), 
    field12948(73, Class1974.field10930), 
    field12949(75, Class1974.field10870), 
    field12950(76, Class1974.field10875), 
    field12951(77, Class1974.field10862), 
    field12952(78, Class1974.field10885), 
    field12953(90, Class1974.field10934), 
    field12954(91, Class1974.field10877), 
    field12955(93, Class1974.field10879);
    
    private static final Map<Integer, Class2184> field12956;
    private final int field12957;
    private final Class1974 field12958;
    
    public static Optional<Class2184> method8348(final int i) {
        if (i != -1) {
            return (Optional<Class2184>)Optional.fromNullable((Object)Class2184.field12956.get(i));
        }
        return Optional.absent();
    }
    
    public static Optional<Class1974> method8349(final int n) {
        final Optional<Class2184> method8348 = method8348(n);
        if (method8348.isPresent()) {
            return (Optional<Class1974>)Optional.of((Object) method8348.get().method8351());
        }
        return Optional.absent();
    }
    
    Class2184(final int field12957, final Class1974 field12958) {
        this.field12957 = field12957;
        this.field12958 = field12958;
    }
    
    public int method8350() {
        return this.field12957;
    }
    
    public Class1974 method8351() {
        return this.field12958;
    }
    
    static {
        field12956 = new HashMap<Integer, Class2184>();
        for (final Class2184 class2184 : values()) {
            Class2184.field12956.put(class2184.field12957, class2184);
        }
    }
}
