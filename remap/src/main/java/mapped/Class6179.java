// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Class6179 extends Class6173
{
    private static String[] field24978;
    private final Class5901 field24979;
    private final Class6332 field24980;
    
    private Class6179(final World class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
        this.field24979 = new Class5879();
        this.field24980 = Class6332.method18773(Class4765.field20392);
        this.field24952 = 0.0f;
        this.field24951 = 30;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25662;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        final float n2 = (this.field24950 + n) / this.field24951;
        final float n3 = 0.05f + 0.5f * MathHelper.sin(n2 * 3.1415927f);
        final MatrixStack class4152 = new MatrixStack();
        class4152.method22566(class4151.method18165());
        class4152.method22566(Vector3f.XP.rotationDegrees(150.0f * n2 - 60.0f));
        class4152.method22565(-1.0f, -1.0f, 1.0f);
        class4152.method22564(0.0, -1.1009999513626099, 1.5);
        final IRenderTypeBuffer.Impl method11006 = Minecraft.getInstance().method5333().method11006();
        this.field24979.method17564(class4152, method11006.method25214(this.field24980), 15728880, Class1904.field10335, 1.0f, 1.0f, 1.0f, n3);
        method11006.finish();
    }
}
