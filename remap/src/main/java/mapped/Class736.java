// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.Hash$Strategy;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.dimension.DimensionType;

public class Class736 extends Class527
{
    private static final Object2IntMap<DimensionType> field3996;
    private final BooleanConsumer field3997;
    private final Class9495 field3998;
    
    public Class736(final BooleanConsumer field3997, final String s, final Class7952 class7952, final boolean b) {
        super(new Class2259("optimizeWorld.title", new Object[] { class7952.method25791(s).method29549() }));
        this.field3997 = field3997;
        this.field3998 = new Class9495(s, class7952, class7952.method25791(s), b);
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.method3029(new Class654(this.field3152 / 2 - 100, this.field3153 / 4 + 150, 200, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> {
            this.field3998.method35335();
            this.field3997.accept(false);
        }));
    }
    
    @Override
    public void method2992() {
        if (this.field3998.method35338()) {
            this.field3997.accept(true);
        }
    }
    
    @Override
    public void method2971() {
        this.field3998.method35335();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        this.method3295(this.field3156, this.field3148.getFormattedText(), this.field3152 / 2, 20, 16777215);
        final int n4 = this.field3152 / 2 - 150;
        final int n5 = this.field3152 / 2 + 150;
        final int n6 = this.field3153 / 4 + 100;
        final int n7 = n6 + 10;
        this.method3295(this.field3156, this.field3998.method35344().getFormattedText(), this.field3152 / 2, n6 - 9 - 2, 10526880);
        if (this.field3998.method35341() > 0) {
            Class565.method3293(n4 - 1, n6 - 1, n5 + 1, n7 + 1, -16777216);
            this.method3297(this.field3156, Class8822.method30773("optimizeWorld.info.converted", this.field3998.method35342()), n4, 40, 10526880);
            this.method3297(this.field3156, Class8822.method30773("optimizeWorld.info.skipped", this.field3998.method35343()), n4, 52, 10526880);
            this.method3297(this.field3156, Class8822.method30773("optimizeWorld.info.total", this.field3998.method35341()), n4, 64, 10526880);
            int n8 = 0;
            for (final DimensionType class383 : DimensionType.method1269()) {
                final int method35642 = MathHelper.method35642(this.field3998.method35339(class383) * (n5 - n4));
                Class565.method3293(n4 + n8, n6, n4 + n8 + method35642, n7, Class736.field3996.getInt((Object)class383));
                n8 += method35642;
            }
            this.method3295(this.field3156, this.field3998.method35342() + this.field3998.method35343() + " / " + this.field3998.method35341(), this.field3152 / 2, n6 + 18 + 2, 10526880);
            this.method3295(this.field3156, MathHelper.method35642(this.field3998.method35340() * 100.0f) + "%", this.field3152 / 2, n6 + (n7 - n6) / 2 - 4, 10526880);
        }
        super.method2975(n, n2, n3);
    }
    
    static {
        field3996 = Util.method27851((Object2IntMap)new Object2IntOpenCustomHashMap((Hash$Strategy) Util.method27852()), object2IntOpenCustomHashMap -> {
            object2IntOpenCustomHashMap.put((Object) DimensionType.field2223, -13408734);
            object2IntOpenCustomHashMap.put((Object) DimensionType.field2224, -10075085);
            object2IntOpenCustomHashMap.put((Object) DimensionType.field2225, -8943531);
            object2IntOpenCustomHashMap.defaultReturnValue(-2236963);
        });
    }
}
