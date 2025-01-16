// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class4169 extends Class4158<Class437>
{
    private static String[] field18579;
    private final Class6300 field18580;
    private final Class6300 field18581;
    private final Class6300[] field18582;
    
    public Class4169(final Class9550 class9550) {
        super(class9550);
        this.field18582 = new Class6300[4];
        (this.field18580 = new Class6300(64, 64, 0, 0)).method18638(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f, 0.0f);
        (this.field18581 = new Class6300(64, 64, 0, 22)).method18638(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f, 0.0f);
        this.field18582[0] = new Class6300(64, 64, 50, 0);
        this.field18582[1] = new Class6300(64, 64, 50, 6);
        this.field18582[2] = new Class6300(64, 64, 50, 12);
        this.field18582[3] = new Class6300(64, 64, 50, 18);
        this.field18582[0].method18636(0.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f);
        this.field18582[1].method18636(0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f);
        this.field18582[2].method18636(-16.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f);
        this.field18582[3].method18636(-16.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f);
        this.field18582[0].field25183 = 1.5707964f;
        this.field18582[1].field25183 = 1.5707964f;
        this.field18582[2].field25183 = 1.5707964f;
        this.field18582[3].field25183 = 1.5707964f;
        this.field18582[0].field25185 = 0.0f;
        this.field18582[1].field25185 = 1.5707964f;
        this.field18582[2].field25185 = 4.712389f;
        this.field18582[3].field25185 = 3.1415927f;
    }
    
    public void method12483(final Class437 class437, final float n, final MatrixStack class438, final IRenderTypeBuffer class439, final int n2, final int n3) {
        final Class3687 class440 = Class8752.field36753[class437.method2213().method813()];
        final World method2186 = class437.method2186();
        if (method2186 == null) {
            this.method12484(class438, class439, true, Direction.SOUTH, class440, n2, n3, false);
            this.method12484(class438, class439, false, Direction.SOUTH, class440, n2, n3, true);
        }
        else {
            final Class7096 method2187 = class437.method2194();
            this.method12484(class438, class439, method2187.method21772(Class3900.field17599) == Class105.field323, method2187.method21772((IProperty<Direction>)Class3900.field17564), class440, Class8565.method28798(Class5412.field22564, Class3900::method11990, Class3900::method11989, Class3865.field17497, method2187, method2186, class437.getPos(), (p0, p1) -> false).method22074((Class6389<? super Class437, Int2IntFunction>)new Class6388<Object>()).get(n2), n3, false);
        }
    }
    
    private void method12484(final MatrixStack class7351, final IRenderTypeBuffer class7352, final boolean field25187, final Direction class7353, final Class3687 class7354, final int n, final int n2, final boolean b) {
        this.field18580.field25187 = field25187;
        this.field18581.field25187 = !field25187;
        this.field18582[0].field25187 = !field25187;
        this.field18582[1].field25187 = field25187;
        this.field18582[2].field25187 = !field25187;
        this.field18582[3].field25187 = field25187;
        class7351.method22567();
        class7351.method22564(0.0, 0.5625, b ? -1.0 : 0.0);
        class7351.method22566(Vector3f.XP.rotationDegrees(90.0f));
        class7351.method22564(0.5, 0.5, 0.5);
        class7351.method22566(Vector3f.ZP.rotationDegrees(180.0f + class7353.getHorizontalAngle()));
        class7351.method22564(-0.5, -0.5, -0.5);
        final Class4150 method11334 = class7354.method11334(class7352, Class6332::method18767);
        this.field18580.method18643(class7351, method11334, n, n2);
        this.field18581.method18643(class7351, method11334, n, n2);
        this.field18582[0].method18643(class7351, method11334, n, n2);
        this.field18582[1].method18643(class7351, method11334, n, n2);
        this.field18582[2].method18643(class7351, method11334, n, n2);
        this.field18582[3].method18643(class7351, method11334, n, n2);
        class7351.method22568();
    }
}
