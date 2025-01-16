// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;

import java.util.List;

public class Class4165 extends Class4158<Class465>
{
    private static String[] field18561;
    private final Class6300 field18562;
    private final Class6300 field18563;
    private final Class6300 field18564;
    
    public Class4165(final Class9550 class9550) {
        super(class9550);
        this.field18562 = method12471();
        (this.field18563 = new Class6300(64, 64, 44, 0)).method18638(-1.0f, -30.0f, -1.0f, 2.0f, 42.0f, 2.0f, 0.0f);
        (this.field18564 = new Class6300(64, 64, 0, 42)).method18638(-10.0f, -32.0f, -1.0f, 20.0f, 2.0f, 2.0f, 0.0f);
    }
    
    public static Class6300 method12471() {
        final Class6300 class6300 = new Class6300(64, 64, 0, 0);
        class6300.method18638(-10.0f, 0.0f, -2.0f, 20.0f, 40.0f, 1.0f, 0.0f);
        return class6300;
    }
    
    public void method12472(final Class465 class465, final float n, final MatrixStack class466, final IRenderTypeBuffer class467, final int n2, final int n3) {
        final List<Pair<Class230, Class181>> method2386 = class465.method2386();
        if (method2386 != null) {
            final boolean b = class465.method2186() == null;
            class466.method22567();
            long method2387;
            if (!b) {
                method2387 = class465.method2186().method6754();
                final Class7096 method2388 = class465.method2194();
                if (!(method2388.method21696() instanceof Class3946)) {
                    class466.method22564(0.5, -0.1666666716337204, 0.5);
                    class466.method22566(Vector3f.YP.rotationDegrees(-method2388.method21772((IProperty<Direction>)Class3945.field17839).getHorizontalAngle()));
                    class466.method22564(0.0, -0.3125, -0.4375);
                    this.field18563.field25187 = false;
                }
                else {
                    class466.method22564(0.5, 0.5, 0.5);
                    class466.method22566(Vector3f.YP.rotationDegrees(-method2388.method21772((IProperty<Integer>)Class3946.field17842) * 360 / 16.0f));
                    this.field18563.field25187 = true;
                }
            }
            else {
                method2387 = 0L;
                class466.method22564(0.5, 0.5, 0.5);
                this.field18563.field25187 = true;
            }
            class466.method22567();
            class466.method22565(0.6666667f, -0.6666667f, -0.6666667f);
            final Class4150 method2389 = Class7637.field30242.method11334(class467, Class6332::method18767);
            this.field18563.method18643(class466, method2389, n2, n3);
            this.field18564.method18643(class466, method2389, n2, n3);
            final BlockPos method2390 = class465.getPos();
            this.field18562.field25183 = (-0.0125f + 0.01f * MathHelper.cos(6.2831855f * ((Math.floorMod(method2390.getX() * 7 + method2390.getY() * 9 + method2390.getZ() * 13 + method2387, 100L) + n) / 100.0f))) * 3.1415927f;
            this.field18562.field25181 = -32.0f;
            method12473(class466, class467, n2, n3, this.field18562, Class7637.field30242, true, method2386);
            class466.method22568();
            class466.method22568();
        }
    }
    
    public static void method12473(final MatrixStack class7351, final IRenderTypeBuffer class7352, final int n, final int n2, final Class6300 class7353, final Class3687 class7354, final boolean b, final List<Pair<Class230, Class181>> list) {
        class7353.method18643(class7351, class7354.method11334(class7352, Class6332::method18767), n, n2);
        for (int n3 = 0; n3 < 17 && n3 < list.size(); ++n3) {
            final Pair pair = list.get(n3);
            final float[] method815 = ((Class181)pair.getSecond()).method815();
            class7353.method18644(class7351, new Class3687(b ? Class8752.field36736 : Class8752.field36737, ((Class230)pair.getFirst()).method857(b)).method11334(class7352, Class6332::method18777), n, n2, method815[0], method815[1], method815[2], 1.0f);
        }
    }
}
