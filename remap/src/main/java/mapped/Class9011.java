// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9011
{
    private static String[] field38041;
    
    public static boolean method32262(final PlayerEntity playerEntity) {
        return method32263(Minecraft.method5277().player) == method32263(playerEntity);
    }
    
    public static int method32263(final PlayerEntity playerEntity) {
        final Class6749 class513 = (Class6749) playerEntity.getTeam();
        return (class513 != null && class513.getColor().getColor() != null) ? class513.getColor().getColor() : 16777215;
    }
}
