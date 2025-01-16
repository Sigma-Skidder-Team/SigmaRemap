// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3632 extends Class3628
{
    private static String[] field16857;
    private final Class819 field16868;
    
    public Class3632(final Class819 field16868) {
        super(field16868, PlayerEntity.class, 8.0f);
        this.field16868 = field16868;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16868.method4824()) {
            return false;
        }
        this.field16859 = this.field16868.method4823();
        return true;
    }
}
