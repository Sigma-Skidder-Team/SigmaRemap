// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9011
{
    private static String[] field38041;
    
    public static boolean method32262(final Class512 class512) {
        return method32263(Class869.method5277().field4684) == method32263(class512);
    }
    
    public static int method32263(final Class512 class512) {
        final Class6749 class513 = (Class6749)class512.getTeam();
        return (class513 != null && class513.getColor().getColor() != null) ? class513.getColor().getColor() : 16777215;
    }
}
