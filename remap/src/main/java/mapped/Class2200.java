// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2200
{
    field13390("pink", Class2116.field12321), 
    field13391("blue", Class2116.field12318), 
    field13392("red", Class2116.field12313), 
    field13393("green", Class2116.field12319), 
    field13394("yellow", Class2116.field12323), 
    field13395("purple", Class2116.field12310), 
    field13396("white", Class2116.field12324);
    
    private final String field13397;
    private final Class2116 field13398;
    
    private Class2200(final String field13397, final Class2116 field13398) {
        this.field13397 = field13397;
        this.field13398 = field13398;
    }
    
    public Class2116 method8371() {
        return this.field13398;
    }
    
    public String method8372() {
        return this.field13397;
    }
    
    public static Class2200 method8373(final String anObject) {
        for (final Class2200 class2200 : values()) {
            if (class2200.field13397.equals(anObject)) {
                return class2200;
            }
        }
        return Class2200.field13396;
    }
}
