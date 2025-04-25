// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.NonNullList;

public class Class4163 extends Class4158<Class448>
{
    private static String[] field18550;
    
    public Class4163(final Class9550 class9550) {
        super(class9550);
    }
    
    public void method12469(final Class448 class448, final float n, final MatrixStack class449, final IRenderTypeBuffer class450, final int n2, final int n3) {
        final Direction class451 = class448.method2194().get((IProperty<Direction>)Class3918.field17763);
        final NonNullList<ItemStack> method2270 = class448.method2270();
        for (int i = 0; i < method2270.size(); ++i) {
            final ItemStack class452 = method2270.get(i);
            if (class452 != ItemStack.EMPTY) {
                class449.method22567();
                class449.method22564(0.5, 0.44921875, 0.5);
                class449.method22566(Vector3f.YP.rotationDegrees(-Direction.byHorizontalIndex((i + class451.getHorizontalIndex()) % 4).getHorizontalAngle()));
                class449.method22566(Vector3f.XP.rotationDegrees(90.0f));
                class449.method22564(-0.3125, -0.3125, 0.0);
                class449.method22565(0.375f, 0.375f, 0.375f);
                Minecraft.getInstance().getItemRenderer().method6536(class452, Class2016.field11494, n2, n3, class449, class450);
                class449.method22568();
            }
        }
    }
}
