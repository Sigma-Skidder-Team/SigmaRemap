// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2158
{
    field12815("file"), 
    field12816("event");
    
    private final String field12817;
    
    private Class2158(final String field12817) {
        this.field12817 = field12817;
    }
    
    public static Class2158 method8324(final String anObject) {
        for (final Class2158 class2158 : values()) {
            if (class2158.field12817.equals(anObject)) {
                return class2158;
            }
        }
        return null;
    }
}
