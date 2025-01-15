// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class4520 extends Class4515
{
    private final String field19933;
    private final Class2052 field19934;
    private final Class2181 field19935;
    
    public Class4520(final Class1795 class1795, final String s, final BlockPos class1796, final Class2052 class1797) {
        this(class1795, s, class1796, class1797, Class2181.field12917);
    }
    
    public Class4520(final Class1795 class1795, final String field19933, final BlockPos field19934, final Class2052 field19935, final Class2181 field19936) {
        super(Class9520.field40995, 0);
        this.field19933 = field19933;
        this.field19920 = field19934;
        this.field19934 = field19935;
        this.field19935 = field19936;
        this.method13517(class1795);
    }
    
    public Class4520(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40995, class1796);
        this.field19933 = class1796.method323("Template");
        this.field19934 = Class2052.valueOf(class1796.method323("Rot"));
        this.field19935 = Class2181.valueOf(class1796.method323("Mi"));
        this.method13517(class1795);
    }
    
    private void method13517(final Class1795 class1795) {
        this.method13510(class1795.method6518(new Class1932("woodland_mansion/" + this.field19933)), this.field19920, new Class9092().method32847(true).method32845(this.field19934).method32844(this.field19935).method32853(Class4106.field18207));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method306("Template", this.field19933);
        class51.method306("Rot", this.field19919.method32856().name());
        class51.method306("Mi", this.field19919.method32855().name());
    }
    
    @Override
    public void method13511(final String s, final BlockPos class354, final Class1851 class355, final Random random, final MutableBoundingBox class356) {
        if (s.startsWith("Chest")) {
            final Class2052 method32856 = this.field19919.method32856();
            Class7096 method32857 = Class7521.field29292.method11878();
            if ("ChestWest".equals(s)) {
                method32857 = ((Class7097<Object, Class7096>)method32857).method21773((Class7111<Comparable>)Class3865.field17497, method32856.method8142(Direction.WEST));
            }
            else if ("ChestEast".equals(s)) {
                method32857 = ((Class7097<Object, Class7096>)method32857).method21773((Class7111<Comparable>)Class3865.field17497, method32856.method8142(Direction.EAST));
            }
            else if ("ChestSouth".equals(s)) {
                method32857 = ((Class7097<Object, Class7096>)method32857).method21773((Class7111<Comparable>)Class3865.field17497, method32856.method8142(Direction.SOUTH));
            }
            else if ("ChestNorth".equals(s)) {
                method32857 = ((Class7097<Object, Class7096>)method32857).method21773((Class7111<Comparable>)Class3865.field17497, method32856.method8142(Direction.NORTH));
            }
            this.method13452(class355, class356, random, class354, Class9020.field38092, method32857);
        }
        else {
            Class772 class357 = null;
            switch (s) {
                case "Mage": {
                    class357 = EntityType.field28980.method23371(class355.method6744());
                    break;
                }
                case "Warrior": {
                    class357 = EntityType.field29044.method23371(class355.method6744());
                    break;
                }
                default: {
                    return;
                }
            }
            class357.method4190();
            class357.method1729(class354, 0.0f, 0.0f);
            class357.method4188(class355, class355.method6784(new BlockPos(class357)), Class2101.field12177, null, null);
            class355.method6886(class357);
            class355.method6688(class354, Class7521.field29147.method11878(), 2);
        }
    }
}
