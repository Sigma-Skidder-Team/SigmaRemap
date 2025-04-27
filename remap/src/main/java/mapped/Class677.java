// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class677 extends Class673
{
    private Class2222 field3713;
    
    public Class677(final Class2222 field3713, final int n, final int n2, final int n3, final int n4) {
        super(field3713.ordinal(), n, n2, n3, n4, method3740(field3713));
        this.field3713 = null;
        this.field3713 = field3713;
    }
    
    public Class2222 method3739() {
        return this.field3713;
    }
    
    private static String method3740(final Class2222 class2222) {
        final String string = Class8822.method30773(class2222.method8416()) + ": ";
        switch (Class7721.field30712[class2222.ordinal()]) {
            case 1: {
                return string + Class716.method3937(Class9216.field39317);
            }
            case 2: {
                return string + Class716.method3936(Class9216.field39313);
            }
            case 3: {
                return string + Class716.method3936(Class9216.field39314);
            }
            case 4: {
                return string + Class716.method3940(Class9216.field39304);
            }
            case 5: {
                return string + Class716.method3940(Class9216.field39305);
            }
            case 6: {
                return string + Class716.method3941(Class9216.field39303);
            }
            case 7: {
                return string + Class716.method3936(Class9216.field39302);
            }
            case 8: {
                return string + Class9216.field39316.method21681();
            }
            case 9: {
                return string + Class9216.field39315.method21681();
            }
            case 10: {
                return string + Class716.method3936(Class9216.field39312);
            }
            case 11: {
                return string + Class716.method3936(Class9216.field39301);
            }
            default: {
                return string + Class9216.method33706(class2222);
            }
        }
    }
    
    public void method3741() {
        this.method3367(method3740(this.field3713));
    }
}
