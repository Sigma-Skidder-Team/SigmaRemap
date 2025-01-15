// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2114
{
    field12298, 
    field12299, 
    field12300, 
    field12301, 
    field12302, 
    field12303;
    
    public Class5147 method8241(final String s) {
        switch (Class9490.field40790[this.ordinal()]) {
            case 1: {
                return new Class5153(s);
            }
            case 2: {
                return new Class5153(s);
            }
            case 3: {
                return new Class5154(s);
            }
            case 4: {
                return new Class5149(s);
            }
            case 5: {
                return new Class5151(s);
            }
            case 6: {
                return new Class5155(s);
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    public void method8242(final Class327 class327, final Class5147 class328) {
        switch (Class9490.field40790[this.ordinal()]) {
            case 1: {
                this.method8243((Class326)class327, (Class5153)class328);
                return;
            }
            case 2: {
                this.method8244((Class328)class327, (Class5153)class328);
                return;
            }
            case 3: {
                this.method8245((Class328)class327, (Class5154)class328);
                return;
            }
            case 4: {
                this.method8246((Class335)class327, (Class5149)class328);
                return;
            }
            case 5: {
                this.method8247((Class335)class327, (Class5151)class328);
                return;
            }
            case 6: {
                this.method8248((Class335)class327, (Class5155)class328);
                return;
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    private void method8243(final Class326 class326, final Class5153 class327) {
        class327.method16099(class326.method1006() ? 1 : 0);
    }
    
    private void method8244(final Class328 class328, final Class5153 class329) {
        class329.method16099((int)class328.method1009());
    }
    
    private void method8245(final Class328 class328, final Class5154 class329) {
        class329.method16101(class328.method1009());
    }
    
    private void method8246(final Class335 class335, final Class5149 class336) {
        final float[] method1014 = class335.method1014();
        if (method1014.length == 2) {
            class336.method16091(method1014[0], method1014[1]);
            return;
        }
        throw new RuntimeException("Value length is not 2, length: " + method1014.length);
    }
    
    private void method8247(final Class335 class335, final Class5151 class336) {
        final float[] method1014 = class335.method1014();
        if (method1014.length == 3) {
            class336.method16095(method1014[0], method1014[1], method1014[2]);
            return;
        }
        throw new RuntimeException("Value length is not 3, length: " + method1014.length);
    }
    
    private void method8248(final Class335 class335, final Class5155 class336) {
        final float[] method1014 = class335.method1014();
        if (method1014.length == 4) {
            class336.method16103(method1014[0], method1014[1], method1014[2], method1014[3]);
            return;
        }
        throw new RuntimeException("Value length is not 4, length: " + method1014.length);
    }
    
    public boolean method8249(final Class2212 class2212) {
        switch (Class9490.field40790[this.ordinal()]) {
            case 1: {
                return class2212 == Class2212.field13485;
            }
            case 2: {
                return class2212 == Class2212.field13483;
            }
            case 3: {
                return class2212 == Class2212.field13483;
            }
            case 4:
            case 5:
            case 6: {
                return class2212 == Class2212.field13484;
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    public static Class2114 method8250(final String anObject) {
        final Class2114[] values = values();
        for (int i = 0; i < values.length; ++i) {
            final Class2114 class2114 = values[i];
            if (class2114.name().toLowerCase().equals(anObject)) {
                return class2114;
            }
        }
        return null;
    }
}
