// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class6357 extends Class6354
{
    private final Map<Integer, Class8792> field25433;
    private final Class1849 field25434;
    private int field25435;
    private int field25436;
    
    public Class6357(final Class1849 field25434) {
        super(method18930(field25434.field10063));
        this.field25433 = Maps.newHashMap();
        this.field25434 = field25434;
        this.field25435 = 1;
        this.method18903();
    }
    
    public Class8792 method18925(final int i) {
        return this.field25433.get(i);
    }
    
    public void method18926() {
        ++this.field25436;
        final Iterator<Class8792> iterator = this.field25433.values().iterator();
        while (iterator.hasNext()) {
            final Class8792 class8792 = iterator.next();
            if (this.field25434.method6765().method31216(Class8878.field37338)) {
                class8792.method30632();
            }
            if (!class8792.method30621()) {
                class8792.method30633();
            }
            else {
                iterator.remove();
                this.method18903();
            }
        }
        if (this.field25436 % 200 == 0) {
            this.method18903();
        }
        Class9324.method34539(this.field25434, this.field25433.values());
    }
    
    public static boolean method18927(final Class776 class776, final Class8792 class777) {
        if (class776 != null) {
            if (class777 != null) {
                if (class777.method30624() != null) {
                    if (class776.method1768()) {
                        if (class776.method4288()) {
                            if (class776.method2640() <= 2400) {
                                if (class776.field2391.method6789().method20487() == class777.method30624().method6789().method20487()) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Nullable
    public Class8792 method18928(final Class513 class513) {
        if (class513.method1639()) {
            return null;
        }
        if (this.field25434.method6765().method31216(Class8878.field37338)) {
            return null;
        }
        if (class513.field2391.method6789().method20487() != Class383.field2224) {
            final Class354 class514 = new Class354(class513);
            final List<? super Class377> list = this.field25434.method6921().method7200(Class8912.field37458, class514, 64, Class2045.field11651).collect((Collector<? super Class377, ?, List<? super Class377>>)Collectors.toList());
            int n = 0;
            Class5487 class515 = Class5487.field22769;
            final Iterator<? super Class377> iterator = list.iterator();
            while (iterator.hasNext()) {
                final Class354 method1259 = iterator.next().method1259();
                class515 = class515.method16744(method1259.method1074(), method1259.method1075(), method1259.method1076());
                ++n;
            }
            Class354 class516;
            if (n <= 0) {
                class516 = class514;
            }
            else {
                class516 = new Class354(class515.method16748(1.0 / n));
            }
            final Class8792 method1260 = this.method18929(class513.method2940(), class516);
            boolean b = false;
            if (method1260.method30625()) {
                if (method1260.method30630() >= method1260.method30629()) {
                    class513.method2659(Class9439.field40504);
                    class513.field3039.method17469(new Class4264(class513, (byte)43));
                }
                else {
                    b = true;
                }
            }
            else {
                if (!this.field25433.containsKey(method1260.method30660())) {
                    this.field25433.put(method1260.method30660(), method1260);
                }
                b = true;
            }
            if (b) {
                method1260.method30631(class513);
                class513.field3039.method17469(new Class4264(class513, (byte)43));
                if (!method1260.method30620()) {
                    class513.method2857(Class8276.field34055);
                    Class7770.field31809.method13827(class513);
                }
            }
            this.method18903();
            return method1260;
        }
        return null;
    }
    
    private Class8792 method18929(final Class1849 class1849, final Class354 class1850) {
        final Class8792 method6927 = class1849.method6927(class1850);
        return (method6927 == null) ? new Class8792(this.method18931(), class1849, class1850) : method6927;
    }
    
    @Override
    public void method18901(final Class51 class51) {
        this.field25435 = class51.method319("NextAvailableID");
        this.field25436 = class51.method319("Tick");
        final Class52 method328 = class51.method328("Raids", 10);
        for (int i = 0; i < method328.size(); ++i) {
            final Class8792 class52 = new Class8792(this.field25434, method328.method346(i));
            this.field25433.put(class52.method30660(), class52);
        }
    }
    
    @Override
    public Class51 method18902(final Class51 class51) {
        class51.method298("NextAvailableID", this.field25435);
        class51.method298("Tick", this.field25436);
        final Class52 class52 = new Class52();
        for (final Class8792 class53 : this.field25433.values()) {
            final Class51 e = new Class51();
            class53.method30664(e);
            ((AbstractList<Class51>)class52).add(e);
        }
        class51.method295("Raids", class52);
        return class51;
    }
    
    public static String method18930(final Class6737 class6737) {
        return "raids" + class6737.method20487().method1271();
    }
    
    private int method18931() {
        return ++this.field25435;
    }
    
    @Nullable
    public Class8792 method18932(final Class354 class354, final int n) {
        Class8792 class355 = null;
        double n2 = n;
        for (final Class8792 class356 : this.field25433.values()) {
            final double method1083 = class356.method30658().method1083(class354);
            if (!class356.method30663()) {
                continue;
            }
            if (method1083 >= n2) {
                continue;
            }
            class355 = class356;
            n2 = method1083;
        }
        return class355;
    }
}
