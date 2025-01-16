// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class4517 extends Class4515
{
    private final String field19923;
    private final Class2052 field19852;
    private final boolean field19924;
    
    public Class4517(final Class1795 class1795, final String field19923, final BlockPos field19924, final Class2052 field19925, final boolean field19926) {
        super(Class9520.field40994, 0);
        this.field19923 = field19923;
        this.field19920 = field19924;
        this.field19852 = field19925;
        this.field19924 = field19926;
        this.method13513(class1795);
    }
    
    public Class4517(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40994, class1796);
        this.field19923 = class1796.method323("Template");
        this.field19852 = Class2052.valueOf(class1796.method323("Rot"));
        this.field19924 = class1796.method329("OW");
        this.method13513(class1795);
    }
    
    private void method13513(final Class1795 class1795) {
        this.method13510(class1795.method6518(new ResourceLocation("end_city/" + this.field19923)), this.field19920, (this.field19924 ? Class7699.method24525() : Class7699.method24526()).method32843().method32845(this.field19852));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method306("Template", this.field19923);
        class51.method306("Rot", this.field19852.name());
        class51.method312("OW", this.field19924);
    }
    
    @Override
    public void method13511(final String s, final BlockPos class354, final Class1851 class355, final Random random, final MutableBoundingBox class356) {
        if (!s.startsWith("Chest")) {
            if (!s.startsWith("Sentry")) {
                if (s.startsWith("Elytra")) {
                    final Class862 class357 = new Class862(class355.method6744(), class354, this.field19852.method8142(Direction.SOUTH));
                    class357.method5200(new ItemStack(Items.field31584), false);
                    class355.method6886(class357);
                }
            }
            else {
                final Class841 class358 = EntityType.field29020.method23371(class355.method6744());
                class358.setPosition(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5);
                class358.method5020(class354);
                class355.method6886(class358);
            }
        }
        else {
            final BlockPos method1139 = class354.method1139();
            if (class356.isVecInside(method1139)) {
                Class456.method2323(class355, random, method1139, Class9020.field38065);
            }
        }
    }
}
