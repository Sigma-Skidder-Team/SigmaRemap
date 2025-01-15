// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class2015
{
    field11454(1, Class2148.field12768), 
    field11455(2, Class2148.field12656), 
    field11456(3, Class2148.field12649), 
    field11457(10, Class2148.field12763), 
    field11458(50, Class2148.field12658), 
    field11459(51, Class2148.field12650), 
    field11460(60, Class2148.field12745), 
    field11461(61, Class2148.field12754), 
    field11462(62, Class2148.field12756), 
    field11463(63, Class2148.field12750), 
    field11464(64, Class2148.field12751), 
    field11465(65, Class2148.field12755), 
    field11466(66, Class2148.field12752), 
    field11467(67, Class2148.field12659), 
    field11468(68, Class2148.field12657), 
    field11469(70, Class2148.field12654), 
    field11470(71, Class2148.field12740), 
    field11471(72, Class2148.field12653), 
    field11472(73, Class2148.field12757), 
    field11473(75, Class2148.field12758), 
    field11474(76, Class2148.field12655), 
    field11475(77, Class2148.field12739), 
    field11476(78, Class2148.field12662), 
    field11477(79, Class2148.field12651), 
    field11478(90, Class2148.field12660), 
    field11479(91, Class2148.field12746), 
    field11480(93, Class2148.field12749), 
    field11481(94, Class2148.field12747);
    
    private static final Map<Integer, Class2015> field11482;
    private final int field11483;
    private final Class2148 field11484;
    
    public static Optional<Class2015> method8055(final int i) {
        if (i != -1) {
            return (Optional<Class2015>)Optional.fromNullable((Object)Class2015.field11482.get(i));
        }
        return (Optional<Class2015>)Optional.absent();
    }
    
    public static Optional<Class2148> method8056(final int n) {
        final Optional<Class2015> method8055 = method8055(n);
        if (method8055.isPresent()) {
            return (Optional<Class2148>)Optional.of((Object)((Class2015)method8055.get()).method8058());
        }
        return (Optional<Class2148>)Optional.absent();
    }
    
    private Class2015(final int field11483, final Class2148 field11484) {
        this.field11483 = field11483;
        this.field11484 = field11484;
    }
    
    public int method8057() {
        return this.field11483;
    }
    
    public Class2148 method8058() {
        return this.field11484;
    }
    
    static {
        field11482 = new HashMap<Integer, Class2015>();
        for (final Class2015 class2015 : values()) {
            Class2015.field11482.put(class2015.field11483, class2015);
        }
    }
}
