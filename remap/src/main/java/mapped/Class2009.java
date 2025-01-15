// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2009
{
    field11409("old"), 
    field11410("new"), 
    field11411("compatible");
    
    private final Class2250 field11412;
    private final Class2250 field11413;
    
    private Class2009(final String s) {
        this.field11412 = new Class2259("resourcePack.incompatible." + s, new Object[0]);
        this.field11413 = new Class2259("resourcePack.incompatible.confirm." + s, new Object[0]);
    }
    
    public boolean method8043() {
        return this == Class2009.field11411;
    }
    
    public static Class2009 method8044(final int n) {
        if (n >= Class9528.method35579().getPackVersion()) {
            return (n <= Class9528.method35579().getPackVersion()) ? Class2009.field11411 : Class2009.field11410;
        }
        return Class2009.field11409;
    }
    
    public Class2250 method8045() {
        return this.field11412;
    }
    
    public Class2250 method8046() {
        return this.field11413;
    }
}
