// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import com.google.common.base.Optional;
import java.util.Map;

public enum Class268
{
    field1429(1, Class2072.field11889), 
    field1430(2, Class2072.field11856), 
    field1431(3, Class2072.field11947), 
    field1432(10, Class2072.field11890), 
    field1433(50, Class2072.field11869), 
    field1434(51, Class2072.field11944), 
    field1435(60, Class2072.field11860), 
    field1436(61, Class2072.field11861), 
    field1437(62, Class2072.field11948), 
    field1438(63, Class2072.field11862), 
    field1439(64, Class2072.field11863), 
    field1440(65, Class2072.field11864), 
    field1441(66, Class2072.field11868), 
    field1442(67, Class2072.field11873), 
    field1443(68, Class2072.field11954), 
    field1444(70, Class2072.field11870), 
    field1445(71, Class2072.field11867), 
    field1446(72, Class2072.field11865), 
    field1447(73, Class2072.field11945), 
    field1448(75, Class2072.field11866), 
    field1449(76, Class2072.field11871), 
    field1450(77, Class2072.field11858), 
    field1451(78, Class2072.field11881), 
    field1452(79, Class2072.field11875), 
    field1453(90, Class2072.field11949), 
    field1454(91, Class2072.field11872), 
    field1455(93, Class2072.field11874);
    
    private static final Map<Integer, Class268> field1456;
    private final int field1457;
    private final Class2072 field1458;
    
    public static Optional<Class268> method913(final int i) {
        if (i != -1) {
            return (Optional<Class268>)Optional.fromNullable((Object)Class268.field1456.get(i));
        }
        return Optional.absent();
    }
    
    public static Optional<Class2072> method914(final int n) {
        final Optional<Class268> method913 = method913(n);
        if (method913.isPresent()) {
            return (Optional<Class2072>)Optional.of((Object) method913.get().method916());
        }
        return Optional.absent();
    }
    
    Class268(final int field1457, final Class2072 field1458) {
        this.field1457 = field1457;
        this.field1458 = field1458;
    }
    
    public int method915() {
        return this.field1457;
    }
    
    public Class2072 method916() {
        return this.field1458;
    }
    
    static {
        field1456 = new HashMap<Integer, Class268>();
        for (final Class268 class268 : values()) {
            Class268.field1456.put(class268.field1457, class268);
        }
    }
}
