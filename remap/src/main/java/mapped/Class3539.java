// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3539 extends Class3446
{
    private static String[] field16582;
    private final Class809 field16583;
    
    public Class3539(final Class809 field16583) {
        this.field16583 = field16583;
    }
    
    @Override
    public boolean method11013() {
        return this.field16583.field2391.method7134(this.field16583.method1938(), this.field16583.method1941(), this.field16583.method1945(), 10.0);
    }
    
    @Override
    public void method11016() {
        final Class9592 method6784 = this.field16583.field2391.method6784(new BlockPos(this.field16583));
        this.field16583.method4779(false);
        this.field16583.method4719(true);
        this.field16583.method4354(0);
        ((Class1849)this.field16583.field2391).method6903(new Class422(this.field16583.field2391, this.field16583.method1938(), this.field16583.method1941(), this.field16583.method1945(), true));
        this.method11091(method6784, this.field16583).method1778(this.field16583);
        for (int i = 0; i < 3; ++i) {
            final Class806 method6785 = this.method11090(method6784);
            this.method11091(method6784, method6785).method1778(method6785);
            method6785.method1738(this.field16583.method2633().nextGaussian() * 0.5, 0.0, this.field16583.method2633().nextGaussian() * 0.5);
        }
    }
    
    private Class806 method11090(final Class9592 class9592) {
        final Class809 class9593 = Class7499.field29024.method23371(this.field16583.field2391);
        class9593.method4188(this.field16583.field2391, class9592, Class2101.field12184, null, null);
        class9593.method1656(this.field16583.method1938(), this.field16583.method1941(), this.field16583.method1945());
        class9593.field2430 = 60;
        class9593.method4190();
        class9593.method4719(true);
        class9593.method4354(0);
        class9593.field2391.method6886(class9593);
        return class9593;
    }
    
    private Class782 method11091(final Class9592 class9592, final Class806 class9593) {
        final Class782 class9594 = Class7499.field29023.method23371(class9593.field2391);
        class9594.method4188(class9593.field2391, class9592, Class2101.field12184, null, null);
        class9594.method1656(class9593.method1938(), class9593.method1941(), class9593.method1945());
        class9594.field2430 = 60;
        class9594.method4190();
        if (class9594.method2718(Class2215.field13605).method27620()) {
            class9594.method1803(Class2215.field13605, new Class8321(Class7739.field31325));
        }
        class9594.method1803(Class2215.field13600, Class8742.method30224(class9594.method2633(), class9594.method2713(), (int)(5.0f + class9592.method35975() * class9594.method2633().nextInt(18)), false));
        class9594.method1803(Class2215.field13605, Class8742.method30224(class9594.method2633(), class9594.method2718(Class2215.field13605), (int)(5.0f + class9592.method35975() * class9594.method2633().nextInt(18)), false));
        class9594.field2391.method6886(class9594);
        return class9594;
    }
}
