// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8525
{
    private final BlockPos field35792;
    private final int field35793;
    private final int field35794;
    
    public Class8525(final BlockPos field35792, final int field35793, final int field35794) {
        this.field35792 = field35792;
        this.field35793 = field35793;
        this.field35794 = field35794;
    }
    
    public static Class8525 method28588(final Class51 class51) {
        return new Class8525(Class9346.method34645(class51.method327("Pos")), class51.method319("Rotation"), class51.method319("EntityId"));
    }
    
    public Class51 method28589() {
        final Class51 class51 = new Class51();
        class51.method295("Pos", Class9346.method34646(this.field35792));
        class51.method298("Rotation", this.field35793);
        class51.method298("EntityId", this.field35794);
        return class51;
    }
    
    public BlockPos method28590() {
        return this.field35792;
    }
    
    public int method28591() {
        return this.field35793;
    }
    
    public int method28592() {
        return this.field35794;
    }
    
    public String method28593() {
        return method28594(this.field35792);
    }
    
    public static String method28594(final BlockPos class354) {
        return "frame-" + class354.getX() + "," + class354.getY() + "," + class354.getZ();
    }
}
