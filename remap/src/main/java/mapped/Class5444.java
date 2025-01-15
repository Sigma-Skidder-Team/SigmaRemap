// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Map;
import com.google.common.collect.ImmutableMap;

public class Class5444 extends Class5419<Class759>
{
    private static String[] field22661;
    private Class9468 field22662;
    private Class354 field22663;
    private float field22664;
    private int field22665;
    
    public Class5444(final int n) {
        super((Map)ImmutableMap.of((Object)Class8233.field33813, (Object)Class1952.field10629, (Object)Class8233.field33809, (Object)Class1952.field10628), n);
    }
    
    public boolean method16590(final Class1849 class1849, final Class759 class1850) {
        final Class365<?> method2618 = class1850.method2618();
        final Class6949 class1851 = method2618.method1198(Class8233.field33809).get();
        if (!this.method16630(class1850, class1851) && this.method16629(class1850, class1851, class1849.method6754())) {
            this.field22663 = class1851.method21335().method19204();
            return true;
        }
        method2618.method1195(Class8233.field33809);
        return false;
    }
    
    public boolean method16580(final Class1849 class1849, final Class759 class1850, final long n) {
        if (this.field22662 != null && this.field22663 != null) {
            final Optional<Class6949> method1198 = class1850.method2618().method1198(Class8233.field33809);
            if (!class1850.method4150().method24731()) {
                if (method1198.isPresent()) {
                    if (!this.method16630(class1850, method1198.get())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public void method16581(final Class1849 class1849, final Class759 class1850, final long n) {
        class1850.method4150().method24733();
        class1850.method2618().method1195(Class8233.field33809);
        class1850.method2618().method1195(Class8233.field33813);
        this.field22662 = null;
    }
    
    public void method16591(final Class1849 class1849, final Class759 class1850, final long n) {
        class1850.method2618().method1196(Class8233.field33813, this.field22662);
        class1850.method4150().method24726(this.field22662, this.field22664);
        this.field22665 = class1849.method6790().nextInt(10);
    }
    
    public void method16582(final Class1849 class1849, final Class759 class1850, final long n) {
        --this.field22665;
        if (this.field22665 <= 0) {
            final Class9468 method24727 = class1850.method4150().method24727();
            final Class365<?> method24728 = class1850.method2618();
            if (this.field22662 != method24727) {
                this.field22662 = method24727;
                method24728.method1196(Class8233.field33813, method24727);
            }
            if (method24727 != null) {
                if (this.field22663 != null) {
                    final Class6949 class1851 = method24728.method1198(Class8233.field33809).get();
                    if (class1851.method21335().method19204().method1083(this.field22663) > 4.0) {
                        if (this.method16629(class1850, class1851, class1849.method6754())) {
                            this.field22663 = class1851.method21335().method19204();
                            this.method16591(class1849, class1850, n);
                        }
                    }
                }
            }
        }
    }
    
    private boolean method16629(final Class759 class759, final Class6949 class760, final long l) {
        final Class354 method19204 = class760.method21335().method19204();
        this.field22662 = class759.method4150().method24721(method19204, 0);
        this.field22664 = class760.method21336();
        if (!this.method16630(class759, class760)) {
            final Class365<?> method19205 = class759.method2618();
            if (this.field22662 == null || !this.field22662.method35228()) {
                if (!method19205.method1193(Class8233.field33822)) {
                    method19205.method1196(Class8233.field33822, l);
                }
            }
            else {
                method19205.method1197((Class8233<Object>)Class8233.field33822, Optional.empty());
            }
            if (this.field22662 != null) {
                return true;
            }
            final Class5487 method19206 = Class7775.method24905((Class787)class759, 10, 7, new Class5487(method19204));
            if (method19206 != null) {
                this.field22662 = class759.method4150().method24719(method19206.field22770, method19206.field22771, method19206.field22772, 0);
                return this.field22662 != null;
            }
        }
        return false;
    }
    
    private boolean method16630(final Class759 class759, final Class6949 class760) {
        return class760.method21335().method19204().method1086(new Class354(class759)) <= class760.method21337();
    }
}
