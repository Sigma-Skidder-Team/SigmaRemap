// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class2200
{
    field13390("pink", TextFormatting.RED),
    field13391("blue", TextFormatting.BLUE),
    field13392("red", TextFormatting.DARK_RED),
    field13393("green", TextFormatting.GREEN),
    field13394("yellow", TextFormatting.YELLOW),
    field13395("purple", TextFormatting.DARK_BLUE),
    field13396("white", TextFormatting.WHITE);
    
    private final String field13397;
    private final TextFormatting field13398;
    
    private Class2200(final String field13397, final TextFormatting field13398) {
        this.field13397 = field13397;
        this.field13398 = field13398;
    }
    
    public TextFormatting method8371() {
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
