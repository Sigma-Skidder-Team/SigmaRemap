// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.Comparator;

public class Class4463 implements Comparator<Entity>
{
    private static String[] field19818;
    public final /* synthetic */ Class3232 field19819;
    
    public Class4463(final Class3232 field19819) {
        this.field19819 = field19819;
    }
    
    @Override
    public int compare(final Entity class399, final Entity class400) {
        final float method30918 = Class8845.method30918(Class8845.method30922(class399).field32884, Class3232.method10196().field4684.field2399);
        final float method30919 = Class8845.method30918(Class8845.method30922(class400).field32884, Class3232.method10197().field4684.field2399);
        if (method30918 - method30919 < 0.0f) {
            return -1;
        }
        if (method30918 - method30919 != 0.0f) {
            return 1;
        }
        final float method30920 = Class3232.method10198().field4684.method1732(class399);
        final float method30921 = Class3232.method10199().field4684.method1732(class400);
        if (method30920 - method30921 < 0.0f) {
            return -1;
        }
        if (method30920 - method30921 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
