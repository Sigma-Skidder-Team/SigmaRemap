// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2082
{
    field12039(0), 
    field12040(1), 
    field12041(2), 
    field12042(3), 
    field12043(7), 
    field12044(8);
    
    public final int field12045;
    
    private Class2082(final int field12045) {
        this.field12045 = field12045;
    }
    
    public static Class2082 method8204(final int n) {
        for (final Class2082 class2082 : values()) {
            if (class2082.field12045 == n) {
                return class2082;
            }
        }
        return null;
    }
}
