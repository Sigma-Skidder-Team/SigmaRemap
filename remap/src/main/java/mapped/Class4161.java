// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;

public class Class4161 extends Class4158<Class435>
{
    private static String[] field18546;
    private final Class5917 field18547;
    
    public Class4161(final Class9550 class9550) {
        super(class9550);
        this.field18547 = new Class5917();
    }
    
    public void method12466(final Class435 class435, final float n, final Class7351 class436, final Class7807 class437, final int n2, final int n3) {
        final Class7096 method2194 = class435.method2194();
        if (method2194.method21772((Class7111<Boolean>)Class3930.field17800)) {
            class436.method22567();
            class436.method22564(0.5, 1.0625, 0.5);
            class436.method22566(Vector3f.YP.rotationDegrees(-method2194.method21772((Class7111<Direction>)Class3930.field17798).rotateY().getHorizontalAngle()));
            class436.method22566(Vector3f.ZP.rotationDegrees(67.5f));
            class436.method22564(0.0, -0.125, 0.0);
            this.field18547.method17788(0.0f, 0.1f, 0.9f, 1.2f);
            this.field18547.method17787(class436, Class4173.field18589.method11334(class437, Class6332::method18767), n2, n3, 1.0f, 1.0f, 1.0f, 1.0f);
            class436.method22568();
        }
    }
}
