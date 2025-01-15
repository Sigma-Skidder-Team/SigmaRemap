// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.function.Predicate;
import java.util.EnumSet;

public class Class3524 extends Class3446
{
    private static String[] field16531;
    private int field16532;
    public final /* synthetic */ Class791 field16533;
    
    public Class3524(final Class791 field16533) {
        this.field16533 = field16533;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16532 <= this.field16533.field2424) {
            if (!this.field16533.method2625()) {
                if (!this.field16533.method1706()) {
                    if (this.field16533.method4414()) {
                        if (this.field16533.method4371() <= 0) {
                            return !this.field16533.field2391.method6739((Class<? extends Class399>)Class427.class, this.field16533.method1886().method18495(6.0, 6.0, 6.0), (Predicate<? super Class399>)Class791.method4427()).isEmpty() || !this.field16533.method2718(Class2215.field13600).method27620();
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16533.method1706() && (this.field16533.method4394() || Class791.method4428(this.field16533).nextInt(600) != 1) && Class791.method4429(this.field16533).nextInt(2000) != 1;
    }
    
    @Override
    public void method11016() {
        if (!this.field16533.method4374()) {
            if (!this.field16533.method2718(Class2215.field13600).method27620()) {
                Class791.method4430(this.field16533);
            }
        }
    }
    
    @Override
    public void method11015() {
        final List<Class399> method6739 = this.field16533.field2391.method6739((Class<? extends Class399>)Class427.class, this.field16533.method1886().method18495(8.0, 8.0, 8.0), (Predicate<? super Class399>)Class791.method4427());
        if (!method6739.isEmpty() && this.field16533.method2718(Class2215.field13600).method27620()) {
            this.field16533.method4150().method24725((Class399)method6739.get(0), 1.2000000476837158);
        }
        else if (!this.field16533.method2718(Class2215.field13600).method27620()) {
            Class791.method4430(this.field16533);
        }
        this.field16532 = 0;
    }
    
    @Override
    public void method11018() {
        final Class8321 method2718 = this.field16533.method2718(Class2215.field13600);
        if (!method2718.method27620()) {
            this.field16533.method1766(method2718);
            this.field16533.method1803(Class2215.field13600, Class8321.field34174);
            this.field16532 = this.field16533.field2424 + (this.field16533.method4394() ? (Class791.method4431(this.field16533).nextInt(50) + 10) : (Class791.method4432(this.field16533).nextInt(150) + 10)) * 20;
        }
        this.field16533.method4375(false);
    }
}
