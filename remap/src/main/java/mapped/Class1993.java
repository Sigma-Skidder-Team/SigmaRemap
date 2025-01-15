// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1993
{
    field11162("task", 0, TextFormatting.GREEN),
    field11163("challenge", 26, TextFormatting.DARK_PURPLE),
    field11164("goal", 52, TextFormatting.GREEN);
    
    private final String field11165;
    private final int field11166;
    private final TextFormatting field11167;
    
    private Class1993(final String field11165, final int field11166, final TextFormatting field11167) {
        this.field11165 = field11165;
        this.field11166 = field11166;
        this.field11167 = field11167;
    }
    
    public String method8015() {
        return this.field11165;
    }
    
    public int method8016() {
        return this.field11166;
    }
    
    public static Class1993 method8017(final String s) {
        for (final Class1993 class1993 : values()) {
            if (class1993.field11165.equals(s)) {
                return class1993;
            }
        }
        throw new IllegalArgumentException("Unknown frame type '" + s + "'");
    }
    
    public TextFormatting method8018() {
        return this.field11167;
    }
}
