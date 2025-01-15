// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4173 extends Class4158<Class463>
{
    public static final Class3687 field18589;
    private final Class5917 field18590;
    
    public Class4173(final Class9550 class9550) {
        super(class9550);
        this.field18590 = new Class5917();
    }
    
    public void method12496(final Class463 class463, final float n, final Class7351 class464, final Class7807 class465, final int n2, final int n3) {
        class464.method22567();
        class464.method22564(0.5, 0.75, 0.5);
        final float n4 = class463.field2727 + n;
        class464.method22564(0.0, 0.1f + MathHelper.sin(n4 * 0.1f) * 0.01f, 0.0);
        float n5;
        for (n5 = class463.field2734 - class463.field2735; n5 >= 3.1415927f; n5 -= 6.2831855f) {}
        while (n5 < -3.1415927f) {
            n5 += 6.2831855f;
        }
        class464.method22566(Vector3f.field38718.method33327(-(class463.field2735 + n5 * n)));
        class464.method22566(Vector3f.ZP.rotationDegrees(80.0f));
        final float method35700 = MathHelper.method35700(n, class463.field2729, class463.field2728);
        this.field18590.method17788(n4, MathHelper.method35653(MathHelper.method35686(method35700 + 0.25f) * 1.6f - 0.3f, 0.0f, 1.0f), MathHelper.method35653(MathHelper.method35686(method35700 + 0.75f) * 1.6f - 0.3f, 0.0f, 1.0f), MathHelper.method35700(n, class463.field2733, class463.field2732));
        this.field18590.method17787(class464, Class4173.field18589.method11334(class465, Class6332::method18767), n2, n3, 1.0f, 1.0f, 1.0f, 1.0f);
        class464.method22568();
    }
    
    static {
        field18589 = new Class3687(Class1774.field9853, new Class1932("entity/enchanting_table_book"));
    }
}
