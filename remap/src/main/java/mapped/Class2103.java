// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2103
{
    field12195("\r\n"), 
    field12196("\r"), 
    field12197("\n");
    
    private String field12198;
    
    private Class2103(final String field12198) {
        this.field12198 = field12198;
    }
    
    public String method8223() {
        return this.field12198;
    }
    
    @Override
    public String toString() {
        return "Line break: " + this.name();
    }
    
    public static Class2103 method8224() {
        final String property = System.getProperty("line.separator");
        for (final Class2103 class2103 : values()) {
            if (class2103.field12198.equals(property)) {
                return class2103;
            }
        }
        return Class2103.field12197;
    }
}
