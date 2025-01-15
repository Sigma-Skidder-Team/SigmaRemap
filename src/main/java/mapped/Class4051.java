// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4051 extends Class3820
{
    private final int field18142;
    private final String field18143;
    
    public Class4051(final int field18142, final String str, final Class8959 class8959) {
        super(class8959);
        this.field18142 = field18142;
        this.field18143 = "textures/entity/horse/armor/horse_armor_" + str + ".png";
    }
    
    public Class1932 method12249() {
        return new Class1932(this.field18143);
    }
    
    public int method12250() {
        return this.field18142;
    }
}
