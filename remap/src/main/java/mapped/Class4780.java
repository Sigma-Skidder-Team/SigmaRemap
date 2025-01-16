// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix3f;
import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.MathHelper;

public class Class4780 extends Class4703<Class861>
{
    private static String[] field20409;
    
    public Class4780(final Class8551 class8551) {
        super(class8551);
    }
    
    public void method14140(final Class861 class861, final float n, final float n2, final MatrixStack class862, final IRenderTypeBuffer class863, final int n3) {
        class862.method22567();
        class862.method22566(Vector3f.YP.rotationDegrees(180.0f - n));
        final Class8539 field4601 = class861.field4601;
        class862.method22565(0.0625f, 0.0625f, 0.0625f);
        final Class4150 method25214 = class863.method25214(Class6332.method18767(this.method14141(class861)));
        final Class1786 method25215 = Minecraft.method5277().method5324();
        this.method14142(class862, method25214, class861, field4601.method28647(), field4601.method28648(), method25215.method6444(field4601), method25215.method6445());
        class862.method22568();
        super.method13951(class861, n, n2, class862, class863, n3);
    }
    
    public ResourceLocation method14141(final Class861 class861) {
        return Minecraft.method5277().method5324().method6445().method7504().method6340();
    }
    
    private void method14142(final MatrixStack class7351, final Class4150 class7352, final Class861 class7353, final int n, final int n2, final TextureAtlasSprite class7354, final TextureAtlasSprite class7355) {
        final Class8996 method22569 = class7351.getLast();
        final Matrix4f method22570 = method22569.getMatrix();
        final Matrix3f method22571 = method22569.method32112();
        final float n3 = -n / 2.0f;
        final float n4 = -n2 / 2.0f;
        final float method22572 = class7355.method7497();
        final float method22573 = class7355.method7498();
        final float method22574 = class7355.method7500();
        final float method22575 = class7355.method7501();
        final float method22576 = class7355.method7497();
        final float method22577 = class7355.method7498();
        final float method22578 = class7355.method7500();
        final float method22579 = class7355.method7502(1.0);
        final float method22580 = class7355.method7497();
        final float method22581 = class7355.method7499(1.0);
        final float method22582 = class7355.method7500();
        final float method22583 = class7355.method7501();
        final int n5 = n / 16;
        final int n6 = n2 / 16;
        final double n7 = 16.0 / n5;
        final double n8 = 16.0 / n6;
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n6; ++j) {
                final float n9 = n3 + (i + 1) * 16;
                final float n10 = n3 + i * 16;
                final float n11 = n4 + (j + 1) * 16;
                final float n12 = n4 + j * 16;
                int n13 = MathHelper.floor(class7353.getPosX());
                final int method22584 = MathHelper.floor(class7353.getPosY() + (n11 + n12) / 2.0f / 16.0f);
                int n14 = MathHelper.floor(class7353.getPosZ());
                final Direction method22585 = class7353.method1882();
                if (method22585 == Direction.NORTH) {
                    n13 = MathHelper.floor(class7353.getPosX() + (n9 + n10) / 2.0f / 16.0f);
                }
                if (method22585 == Direction.WEST) {
                    n14 = MathHelper.floor(class7353.getPosZ() - (n9 + n10) / 2.0f / 16.0f);
                }
                if (method22585 == Direction.SOUTH) {
                    n13 = MathHelper.floor(class7353.getPosX() - (n9 + n10) / 2.0f / 16.0f);
                }
                if (method22585 == Direction.EAST) {
                    n14 = MathHelper.floor(class7353.getPosZ() + (n9 + n10) / 2.0f / 16.0f);
                }
                final int method22586 = Class1656.method5776(class7353.world, new BlockPos(n13, method22584, n14));
                final float method22587 = class7354.method7499(n7 * (n5 - i));
                final float method22588 = class7354.method7499(n7 * (n5 - (i + 1)));
                final float method22589 = class7354.method7502(n8 * (n6 - j));
                final float method22590 = class7354.method7502(n8 * (n6 - (j + 1)));
                this.method14143(method22570, method22571, class7352, n9, n12, method22588, method22589, -0.5f, 0, 0, -1, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22587, method22589, -0.5f, 0, 0, -1, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22587, method22590, -0.5f, 0, 0, -1, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22588, method22590, -0.5f, 0, 0, -1, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22572, method22574, 0.5f, 0, 0, 1, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22573, method22574, 0.5f, 0, 0, 1, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22573, method22575, 0.5f, 0, 0, 1, method22586);
                this.method14143(method22570, method22571, class7352, n9, n12, method22572, method22575, 0.5f, 0, 0, 1, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22576, method22578, -0.5f, 0, 1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22577, method22578, -0.5f, 0, 1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22577, method22579, 0.5f, 0, 1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22576, method22579, 0.5f, 0, 1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n12, method22576, method22578, 0.5f, 0, -1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22577, method22578, 0.5f, 0, -1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22577, method22579, -0.5f, 0, -1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n12, method22576, method22579, -0.5f, 0, -1, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22581, method22582, 0.5f, -1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n12, method22581, method22583, 0.5f, -1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n12, method22580, method22583, -0.5f, -1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n9, n11, method22580, method22582, -0.5f, -1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22581, method22582, -0.5f, 1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22581, method22583, -0.5f, 1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n12, method22580, method22583, 0.5f, 1, 0, 0, method22586);
                this.method14143(method22570, method22571, class7352, n10, n11, method22580, method22582, 0.5f, 1, 0, 0, method22586);
            }
        }
    }
    
    private void method14143(final Matrix4f class6789, final Matrix3f class6790, final Class4150 class6791, final float n, final float n2, final float n3, final float n4, final float n5, final int n6, final int n7, final int n8, final int n9) {
        class6791.pos(class6789, n, n2, n5).method12399(255, 255, 255, 255).tex(n3, n4).method12441(Class1904.field10335).method12440(n9).method12445(class6790, (float)n6, (float)n7, (float)n8).endVertex();
    }
}
