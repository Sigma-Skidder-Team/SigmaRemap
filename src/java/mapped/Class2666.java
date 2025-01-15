// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2666 extends Class2466
{
    private static String[] field14791;
    public final /* synthetic */ Class2958 field14792;
    
    public Class2666(final Class2958 field14792) {
        this.field14792 = field14792;
    }
    
    @Override
    public void method9802(final Class8699 class8699) throws Exception {
        final int intValue = class8699.method29818(Class5260.field22296, 0);
        if (intValue != 3 && intValue != 20) {
            if (intValue == 27) {
                Class8378.method27918(class8699.method29824(Class5260.field22334));
            }
        }
        else {
            class8699.method29821(Class5260.field22312, 0, Class5213.method16325(class8699.method29824(Class5260.field22312)));
        }
        final int method22660 = Class7380.method22660(intValue);
        if (method22660 != intValue) {
            class8699.method29821(Class5260.field22296, 0, method22660);
        }
    }
}
