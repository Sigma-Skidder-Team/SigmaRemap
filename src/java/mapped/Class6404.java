// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6404 implements Class6423
{
    private static String[] field25523;
    
    @Override
    public final Class8321 method19090(final Class5491 class5491, final Class8321 class5492) {
        final Class8321 method19087 = this.method19087(class5491, class5492);
        this.method19088(class5491);
        this.method19092(class5491, class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859));
        return method19087;
    }
    
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        method19091(class5491.method16763(), class5492.method27621(1), 6, class5491.method16765().method21772((Class7111<Class179>)Class3955.field17859), Class3955.method12072(class5491));
        return class5492;
    }
    
    public static void method19091(final Class1847 class1847, final Class8321 class1848, final int n, final Class179 class1849, final Class5488 class1850) {
        final double method16760 = class1850.method16760();
        final double method16761 = class1850.method16761();
        final double method16762 = class1850.method16762();
        double n2;
        if (class1849.method790() != Class111.field352) {
            n2 = method16761 - 0.15625;
        }
        else {
            n2 = method16761 - 0.125;
        }
        final Class427 class1851 = new Class427(class1847, method16760, n2, method16762, class1848);
        final double n3 = class1847.field10062.nextDouble() * 0.1 + 0.2;
        class1851.method1937(class1847.field10062.nextGaussian() * 0.007499999832361937 * n + class1849.method785() * n3, class1847.field10062.nextGaussian() * 0.007499999832361937 * n + 0.20000000298023224, class1847.field10062.nextGaussian() * 0.007499999832361937 * n + class1849.method787() * n3);
        class1847.method6886(class1851);
    }
    
    public void method19088(final Class5491 class5491) {
        class5491.method16763().method6955(1000, class5491.method16764(), 0);
    }
    
    public void method19092(final Class5491 class5491, final Class179 class5492) {
        class5491.method16763().method6955(2000, class5491.method16764(), class5492.method779());
    }
}
