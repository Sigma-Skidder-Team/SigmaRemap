// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;

public class Class4791 extends Class4703<Class862>
{
    private static final Class1933 field20427;
    private static final Class1933 field20428;
    private final Minecraft field20429;
    private final ItemRenderer field20430;
    private static double field20431;
    
    public Class4791(final Class8551 class8551, final ItemRenderer field20430) {
        super(class8551);
        this.field20429 = Minecraft.method5277();
        this.field20430 = field20430;
    }
    
    public void method14168(final Class862 class862, final float n, final float n2, final MatrixStack class863, final IRenderTypeBuffer class864, final int i) {
        super.method13951(class862, n, n2, class863, class864, i);
        class863.method22567();
        final Direction method1882 = class862.method1882();
        final Vec3d method1883 = this.method14169(class862, n2);
        class863.method22564(-method1883.getX(), -method1883.getY(), -method1883.getZ());
        class863.method22564(method1882.getXOffset() * 0.46875, method1882.getYOffset() * 0.46875, method1882.getZOffset() * 0.46875);
        class863.method22566(Vector3f.XP.rotationDegrees(class862.rotationPitch));
        class863.method22566(Vector3f.YP.rotationDegrees(180.0f - class862.rotationYaw));
        final Class1658 method1884 = this.field20429.method5305();
        final Class1790 method1885 = method1884.method5787().method35429();
        final Class1933 class865 = (class862.method5198().getItem() instanceof Class4094) ? Class4791.field20428 : Class4791.field20427;
        class863.method22567();
        class863.method22564(-0.5, -0.5, -0.5);
        method1884.method5793().method33363(class863.getLast(), class864.method25214(Class8752.method30263()), null, method1885.method6451(class865), 1.0f, 1.0f, 1.0f, i, Class1904.field10335);
        class863.method22568();
        final ItemStack method1886 = class862.method5198();
        if (!method1886.method27620()) {
            final boolean b = method1886.getItem() instanceof Class4094;
            class863.method22564(0.0, 0.0, 0.4375);
            class863.method22566(Vector3f.ZP.rotationDegrees((b ? (class862.method5201() % 4 * 2) : class862.method5201()) * 360.0f / 8.0f));
            if (!Class9570.method35840(Class9570.field41411, class862, this, class863, class864, i)) {
                if (!b) {
                    class863.method22565(0.5f, 0.5f, 0.5f);
                    if (this.method14173(class862)) {
                        this.field20430.method6536(method1886, Class2016.field11494, i, Class1904.field10335, class863, class864);
                    }
                }
                else {
                    class863.method22566(Vector3f.ZP.rotationDegrees(180.0f));
                    class863.method22565(0.0078125f, 0.0078125f, 0.0078125f);
                    class863.method22564(-64.0, -64.0, 0.0);
                    final Class6356 method1887 = Class7667.method24307(method1886, class862.world);
                    class863.method22564(0.0, 0.0, -1.0);
                    if (method1887 != null) {
                        this.field20429.field4644.method5822().method7391(class863, class864, method1887, true, i);
                    }
                }
            }
        }
        class863.method22568();
    }
    
    public Vec3d method14169(final Class862 class862, final float n) {
        return new Vec3d(class862.method1882().getXOffset() * 0.3f, -0.25, class862.method1882().getZOffset() * 0.3f);
    }
    
    public ResourceLocation method14170(final Class862 class862) {
        return Class1774.field9853;
    }
    
    public boolean method14171(final Class862 class862) {
        if (Minecraft.method5270()) {
            if (!class862.method5198().method27620()) {
                if (class862.method5198().method27667()) {
                    if (this.field20283.field35908 == class862) {
                        final double method28715 = this.field20283.method28715(class862);
                        final float n = class862.method1812() ? 32.0f : 64.0f;
                        return method28715 < n * n;
                    }
                }
            }
        }
        return false;
    }
    
    public void method14172(final Class862 class862, final String s, final MatrixStack class863, final IRenderTypeBuffer class864, final int n) {
        super.method13958(class862, class862.method5198().method27664().getFormattedText(), class863, class864, n);
    }
    
    private boolean method14173(final Class862 class862) {
        if (!Class9216.field39049) {
            if (!Config.field36033) {
                final Entity method5303 = this.field20429.method5303();
                if (class862.method1733(method5303.getPosX(), method5303.getPosY(), method5303.getPosZ()) > Class4791.field20431) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public static void method14174() {
        final Minecraft method5277 = Minecraft.method5277();
        final double max = Math.max(6.0 * method5277.method5332().method7695() / Config.method28867(method5277.gameSettings.field23471, 1.0, 120.0), 16.0);
        Class4791.field20431 = max * max;
    }
    
    static {
        field20427 = new Class1933("item_frame", "map=false");
        field20428 = new Class1933("item_frame", "map=true");
        Class4791.field20431 = 4096.0;
    }
}
