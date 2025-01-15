// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6773 extends Class6772
{
    private static String[] field26602;
    private float field26603;
    private Class6772 field26604;
    private boolean field26605;
    
    public Class6773(final Class6772 class6772) {
        super(class6772.field26589, class6772.field26590, class6772.field26591);
        this.field26603 = Float.MAX_VALUE;
    }
    
    public Class6773(final int n, final int n2, final int n3) {
        super(n, n2, n3);
        this.field26603 = Float.MAX_VALUE;
    }
    
    public void method20674(final float field26603, final Class6772 field26604) {
        if (field26603 < this.field26603) {
            this.field26603 = field26603;
            this.field26604 = field26604;
        }
    }
    
    public Class6772 method20675() {
        return this.field26604;
    }
    
    public void method20676() {
        this.field26605 = true;
    }
    
    public boolean method20677() {
        return this.field26605;
    }
    
    public static Class6773 method20678(final PacketBuffer class8654) {
        final Class6773 class8655 = new Class6773(class8654.readInt(), class8654.readInt(), class8654.readInt());
        class8655.field26599 = class8654.readFloat();
        class8655.field26600 = class8654.readFloat();
        class8655.field26598 = class8654.readBoolean();
        class8655.field26601 = Class257.values()[class8654.readInt()];
        class8655.field26596 = class8654.readFloat();
        return class8655;
    }
}
