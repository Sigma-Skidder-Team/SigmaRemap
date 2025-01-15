// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2373 extends IllegalArgumentException
{
    public Class2373(final Class2259 class2259, final String s) {
        super(String.format("Error parsing: %s: %s", class2259, s));
    }
    
    public Class2373(final Class2259 class2259, final int i) {
        super(String.format("Invalid index %d requested for %s", i, class2259));
    }
    
    public Class2373(final Class2259 class2259, final Throwable cause) {
        super(String.format("Error while parsing: %s", class2259), cause);
    }
}
