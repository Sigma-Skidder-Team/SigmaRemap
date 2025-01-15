// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.List;

public class Class6348 extends Class6346<Class7066>
{
    private static String[] field25390;
    private static final List<Class7096> field25391;
    private static final int field25392;
    private static final int field25393;
    public static final Class7096 field25394;
    public static final Class7096 field25395;
    
    public Class6348(final Class1851 class1851, final Class1868 class1852, final Class7066 class1853) {
        super(class1851, class1852, class1853);
    }
    
    @Override
    public void method18859(final Class1878 class1878, final Class1860 class1879) {
    }
    
    @Override
    public void method18873(final Class5507 class5507, final Class1860 class5508, final Class2126 class5509) {
    }
    
    @Override
    public int method18852() {
        return this.field25383.method6743() + 1;
    }
    
    @Override
    public void method18875(final Class1878 class1878) {
        final Class385 class1879 = new Class385();
        final int method7150 = class1878.method7150();
        final int method7151 = class1878.method7151();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = (method7150 << 4) + i;
                final int n2 = (method7151 << 4) + j;
                class1878.method6688(class1879.method1284(n, 60, n2), Class6348.field25395, 2);
                final Class7096 method7152 = method18887(n, n2);
                if (method7152 != null) {
                    class1878.method6688(class1879.method1284(n, 70, n2), method7152, 2);
                }
            }
        }
    }
    
    @Override
    public void method18861(final Class1851 class1851, final Class1860 class1852) {
    }
    
    @Override
    public int method18857(final int n, final int n2, final Class2020 class2020) {
        return 0;
    }
    
    public static Class7096 method18887(int n, int n2) {
        Class7096 field25394 = Class6348.field25394;
        if (n > 0) {
            if (n2 > 0) {
                if (n % 2 != 0) {
                    if (n2 % 2 != 0) {
                        n /= 2;
                        n2 /= 2;
                        if (n <= Class6348.field25392) {
                            if (n2 <= Class6348.field25393) {
                                final int method35648 = MathHelper.abs(n * Class6348.field25392 + n2);
                                if (method35648 < Class6348.field25391.size()) {
                                    field25394 = Class6348.field25391.get(method35648);
                                }
                            }
                        }
                    }
                }
            }
        }
        return field25394;
    }
    
    static {
        field25391 = StreamSupport.stream(Class90.field208.spliterator(), false).flatMap(class3833 -> class3833.method11876().method32902().stream()).collect((Collector<? super Object, ?, List<Class7096>>)Collectors.toList());
        field25392 = MathHelper.method35649(MathHelper.method35640((float)Class6348.field25391.size()));
        field25393 = MathHelper.method35649(Class6348.field25391.size() / (float)Class6348.field25392);
        field25394 = Class7521.field29147.method11878();
        field25395 = Class7521.field29517.method11878();
    }
}
