// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Predicate;

public class Class857 extends Class511
{
    private static final Class8396 field4565;
    private static final Class8396 field4566;
    private static final Class8396 field4567;
    private static final Class8396 field4568;
    private static final Class8396 field4569;
    private static final Class8396 field4570;
    public static final Class8810<Byte> field4571;
    public static final Class8810<Class8396> field4572;
    public static final Class8810<Class8396> field4573;
    public static final Class8810<Class8396> field4574;
    public static final Class8810<Class8396> field4575;
    public static final Class8810<Class8396> field4576;
    public static final Class8810<Class8396> field4577;
    private static final Predicate<Entity> field4578;
    private final Class2265<ItemStack> field4579;
    private final Class2265<ItemStack> field4580;
    private boolean field4581;
    public long field4582;
    private int field4583;
    private Class8396 field4584;
    private Class8396 field4585;
    private Class8396 field4586;
    private Class8396 field4587;
    private Class8396 field4588;
    private Class8396 field4589;
    
    public Class857(final EntityType<? extends Class857> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4579 = Class2265.method8507(2, ItemStack.field34174);
        this.field4580 = Class2265.method8507(4, ItemStack.field34174);
        this.field4584 = Class857.field4565;
        this.field4585 = Class857.field4566;
        this.field4586 = Class857.field4567;
        this.field4587 = Class857.field4568;
        this.field4588 = Class857.field4569;
        this.field4589 = Class857.field4570;
        this.field2420 = 0.0f;
    }
    
    public Class857(final Class1847 class1847, final double n, final double n2, final double n3) {
        this(EntityType.field28958, class1847);
        this.method1656(n, n2, n3);
    }
    
    @Override
    public void method1881() {
        final double method1938 = this.getPosX();
        final double method1939 = this.getPosY();
        final double method1940 = this.getPosZ();
        super.method1881();
        this.method1656(method1938, method1939, method1940);
    }
    
    private boolean method5148() {
        return !this.method5166() && !this.method1698();
    }
    
    @Override
    public boolean method2749() {
        return super.method2749() && this.method5148();
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class857.field4571, (Byte)0);
        this.field2432.method33565(Class857.field4572, Class857.field4565);
        this.field2432.method33565(Class857.field4573, Class857.field4566);
        this.field2432.method33565(Class857.field4574, Class857.field4567);
        this.field2432.method33565(Class857.field4575, Class857.field4568);
        this.field2432.method33565(Class857.field4576, Class857.field4569);
        this.field2432.method33565(Class857.field4577, Class857.field4570);
    }
    
    @Override
    public Iterable<ItemStack> method1800() {
        return this.field4579;
    }
    
    @Override
    public Iterable<ItemStack> method1801() {
        return this.field4580;
    }
    
    @Override
    public ItemStack method2718(final Class2215 class2215) {
        switch (Class8831.field37129[class2215.method8401().ordinal()]) {
            case 1: {
                return this.field4579.get(class2215.method8402());
            }
            case 2: {
                return this.field4580.get(class2215.method8402());
            }
            default: {
                return ItemStack.field34174;
            }
        }
    }
    
    @Override
    public void method1803(final Class2215 class2215, final ItemStack class2216) {
        switch (Class8831.field37129[class2215.method8401().ordinal()]) {
            case 1: {
                this.method2642(class2216);
                this.field4579.set(class2215.method8402(), class2216);
                break;
            }
            case 2: {
                this.method2642(class2216);
                this.field4580.set(class2215.method8402(), class2216);
                break;
            }
        }
    }
    
    @Override
    public boolean method1893(final int n, final ItemStack class8321) {
        Class2215 class8322;
        if (n != 98) {
            if (n != 99) {
                if (n != 100 + Class2215.field13605.method8402()) {
                    if (n != 100 + Class2215.field13604.method8402()) {
                        if (n != 100 + Class2215.field13603.method8402()) {
                            if (n != 100 + Class2215.field13602.method8402()) {
                                return false;
                            }
                            class8322 = Class2215.field13602;
                        }
                        else {
                            class8322 = Class2215.field13603;
                        }
                    }
                    else {
                        class8322 = Class2215.field13604;
                    }
                }
                else {
                    class8322 = Class2215.field13605;
                }
            }
            else {
                class8322 = Class2215.field13601;
            }
        }
        else {
            class8322 = Class2215.field13600;
        }
        if (!class8321.method27620()) {
            if (!Class759.method4210(class8322, class8321)) {
                if (class8322 != Class2215.field13605) {
                    return false;
                }
            }
        }
        this.method1803(class8322, class8321);
        return true;
    }
    
    @Override
    public boolean method2779(final ItemStack class8321) {
        final Class2215 method4185 = Class759.method4185(class8321);
        return this.method2718(method4185).method27620() && !this.method5152(method4185);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        final Class52 class52 = new Class52();
        for (final ItemStack class53 : this.field4580) {
            final Class51 e = new Class51();
            if (!class53.method27620()) {
                class53.method27627(e);
            }
            ((AbstractList<Class51>)class52).add(e);
        }
        class51.method295("ArmorItems", class52);
        final Class52 class54 = new Class52();
        for (final ItemStack class55 : this.field4579) {
            final Class51 e2 = new Class51();
            if (!class55.method27620()) {
                class55.method27627(e2);
            }
            ((AbstractList<Class51>)class54).add(e2);
        }
        class51.method295("HandItems", class54);
        class51.method312("Invisible", this.method1823());
        class51.method312("Small", this.method5160());
        class51.method312("ShowArms", this.method5162());
        class51.method298("DisabledSlots", this.field4583);
        class51.method312("NoBasePlate", this.method5164());
        if (this.method5166()) {
            class51.method312("Marker", this.method5166());
        }
        class51.method295("Pose", this.method5150());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("ArmorItems", 9)) {
            final Class52 method328 = class51.method328("ArmorItems", 10);
            for (int i = 0; i < this.field4580.size(); ++i) {
                this.field4580.set(i, ItemStack.method27619(method328.method346(i)));
            }
        }
        if (class51.method316("HandItems", 9)) {
            final Class52 method329 = class51.method328("HandItems", 10);
            for (int j = 0; j < this.field4579.size(); ++j) {
                this.field4579.set(j, ItemStack.method27619(method329.method346(j)));
            }
        }
        this.method1828(class51.method329("Invisible"));
        this.method5159(class51.method329("Small"));
        this.method5161(class51.method329("ShowArms"));
        this.field4583 = class51.method319("DisabledSlots");
        this.method5163(class51.method329("NoBasePlate"));
        this.method5165(class51.method329("Marker"));
        this.field2421 = !this.method5148();
        this.method5149(class51.method327("Pose"));
    }
    
    private void method5149(final Class51 class51) {
        final Class52 method328 = class51.method328("Head", 5);
        this.method5168(method328.isEmpty() ? Class857.field4565 : new Class8396(method328));
        final Class52 method329 = class51.method328("Body", 5);
        this.method5169(method329.isEmpty() ? Class857.field4566 : new Class8396(method329));
        final Class52 method330 = class51.method328("LeftArm", 5);
        this.method5170(method330.isEmpty() ? Class857.field4567 : new Class8396(method330));
        final Class52 method331 = class51.method328("RightArm", 5);
        this.method5171(method331.isEmpty() ? Class857.field4568 : new Class8396(method331));
        final Class52 method332 = class51.method328("LeftLeg", 5);
        this.method5172(method332.isEmpty() ? Class857.field4569 : new Class8396(method332));
        final Class52 method333 = class51.method328("RightLeg", 5);
        this.method5173(method333.isEmpty() ? Class857.field4570 : new Class8396(method333));
    }
    
    private Class51 method5150() {
        final Class51 class51 = new Class51();
        if (!Class857.field4565.equals(this.field4584)) {
            class51.method295("Head", this.field4584.method27996());
        }
        if (!Class857.field4566.equals(this.field4585)) {
            class51.method295("Body", this.field4585.method27996());
        }
        if (!Class857.field4567.equals(this.field4586)) {
            class51.method295("LeftArm", this.field4586.method27996());
        }
        if (!Class857.field4568.equals(this.field4587)) {
            class51.method295("RightArm", this.field4587.method27996());
        }
        if (!Class857.field4569.equals(this.field4588)) {
            class51.method295("LeftLeg", this.field4588.method27996());
        }
        if (!Class857.field4570.equals(this.field4589)) {
            class51.method295("RightLeg", this.field4589.method27996());
        }
        return class51;
    }
    
    @Override
    public boolean method1750() {
        return false;
    }
    
    @Override
    public void method2741(final Entity class399) {
    }
    
    @Override
    public void method2739() {
        final List<Entity> method6737 = this.field2391.method6737(this, this.method1886(), Class857.field4578);
        for (int i = 0; i < method6737.size(); ++i) {
            final Entity class399 = method6737.get(i);
            if (this.method1734(class399) <= 0.2) {
                class399.method1737(this);
            }
        }
    }
    
    @Override
    public Class2201 method1898(final Class512 class512, final Vec3d class513, final Class316 class514) {
        final ItemStack method2715 = class512.method2715(class514);
        if (this.method5166() || method2715.method27622() == Class7739.field31552) {
            return Class2201.field13402;
        }
        if (class512.method1639()) {
            return Class2201.field13400;
        }
        if (!class512.field2391.field10067) {
            final Class2215 method2716 = Class759.method4185(method2715);
            if (!method2715.method27620()) {
                if (this.method5152(method2716)) {
                    return Class2201.field13403;
                }
                if (method2716.method8401() == Class295.field1681 && !this.method5162()) {
                    return Class2201.field13403;
                }
                if (this.method5153(class512, method2716, method2715, class514)) {
                    return Class2201.field13400;
                }
            }
            else {
                final Class2215 method2717 = this.method5151(class513);
                final Class2215 class515 = this.method5152(method2717) ? method2716 : method2717;
                if (this.method2717(class515) && this.method5153(class512, class515, method2715, class514)) {
                    return Class2201.field13400;
                }
            }
            return Class2201.field13402;
        }
        return Class2201.field13401;
    }
    
    private Class2215 method5151(final Vec3d class5487) {
        Class2215 class5488 = Class2215.field13600;
        final boolean method5160 = this.method5160();
        final double n = method5160 ? (class5487.y * 2.0) : class5487.y;
        final Class2215 field13602 = Class2215.field13602;
        if (n >= 0.1) {
            if (n < 0.1 + (method5160 ? 0.8 : 0.45)) {
                if (this.method2717(field13602)) {
                    class5488 = Class2215.field13602;
                    return class5488;
                }
            }
        }
        if (n >= 0.9 + (method5160 ? 0.3 : 0.0)) {
            if (n < 0.9 + (method5160 ? 1.0 : 0.7)) {
                if (this.method2717(Class2215.field13604)) {
                    class5488 = Class2215.field13604;
                    return class5488;
                }
            }
        }
        if (n >= 0.4) {
            if (n < 0.4 + (method5160 ? 1.0 : 0.8)) {
                if (this.method2717(Class2215.field13603)) {
                    class5488 = Class2215.field13603;
                    return class5488;
                }
            }
        }
        if (n >= 1.6 && this.method2717(Class2215.field13605)) {
            class5488 = Class2215.field13605;
        }
        else if (!this.method2717(Class2215.field13600)) {
            if (this.method2717(Class2215.field13601)) {
                class5488 = Class2215.field13601;
            }
        }
        return class5488;
    }
    
    private boolean method5152(final Class2215 class2215) {
        return (this.field4583 & 1 << class2215.method8403()) != 0x0 || (class2215.method8401() == Class295.field1681 && !this.method5162());
    }
    
    private boolean method5153(final Class512 class512, final Class2215 class513, final ItemStack class514, final Class316 class515) {
        final ItemStack method2718 = this.method2718(class513);
        if (!method2718.method27620() && (this.field4583 & 1 << class513.method8403() + 8) != 0x0) {
            return false;
        }
        if (method2718.method27620() && (this.field4583 & 1 << class513.method8403() + 16) != 0x0) {
            return false;
        }
        if (class512.field3025.field27304) {
            if (method2718.method27620()) {
                if (!class514.method27620()) {
                    final ItemStack method2719 = class514.method27641();
                    method2719.method27691(1);
                    this.method1803(class513, method2719);
                    return true;
                }
            }
        }
        if (class514.method27620() || class514.method27690() <= 1) {
            this.method1803(class513, class514);
            class512.method2716(class515, method2718);
            return true;
        }
        if (method2718.method27620()) {
            final ItemStack method2720 = class514.method27641();
            method2720.method27691(1);
            this.method1803(class513, method2720);
            class514.method27693(1);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method1740(final Class7929 obj, final float n) {
        if (this.field2391.field10067 || this.field2410) {
            return false;
        }
        if (!Class7929.field32574.equals(obj)) {
            if (!this.method1849(obj)) {
                if (!this.field4581) {
                    if (!this.method5166()) {
                        if (obj.method25707()) {
                            this.method5157(obj);
                            this.method1652();
                            return false;
                        }
                        if (Class7929.field32562.equals(obj)) {
                            if (!this.method1804()) {
                                this.method1664(5);
                            }
                            else {
                                this.method5155(obj, 0.15f);
                            }
                            return false;
                        }
                        if (Class7929.field32564.equals(obj) && this.method2664() > 0.5f) {
                            this.method5155(obj, 4.0f);
                            return false;
                        }
                        final boolean b = obj.method25713() instanceof Class402;
                        final boolean b2 = b && ((Class402)obj.method25713()).method1983() > 0;
                        if (!"player".equals(obj.method25720()) && !b) {
                            return false;
                        }
                        if (obj.method25714() instanceof Class512 && !((Class512)obj.method25714()).field3025.field27305) {
                            return false;
                        }
                        if (!obj.method25725()) {
                            final long method6754 = this.field2391.method6754();
                            if (method6754 - this.field4582 > 5L && !b) {
                                this.field2391.method6761(this, (byte)32);
                                this.field4582 = method6754;
                            }
                            else {
                                this.method5156(obj);
                                this.method5154();
                                this.method1652();
                            }
                            return true;
                        }
                        this.method5158();
                        this.method5154();
                        this.method1652();
                        return b2;
                    }
                }
            }
            return false;
        }
        this.method1652();
        return false;
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 32) {
            super.method1798(b);
        }
        else if (this.field2391.field10067) {
            this.field2391.method6708(this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field34989, this.method1922(), 0.3f, 1.0f, false);
            this.field4582 = this.field2391.method6754();
        }
    }
    
    @Override
    public boolean method1753(final double n) {
        double v = this.method1886().method18507() * 4.0;
        if (Double.isNaN(v) || v == 0.0) {
            v = 4.0;
        }
        final double n2 = v * 64.0;
        return n < n2 * n2;
    }
    
    private void method5154() {
        if (this.field2391 instanceof Class1849) {
            ((Class1849)this.field2391).method6911(new Class6911(Class8432.field34600, Class7521.field29160.method11878()), this.getPosX(), this.method1942(0.6666666666666666), this.getPosZ(), 10, this.method1930() / 4.0f, this.method1931() / 4.0f, this.method1930() / 4.0f, 0.05);
        }
    }
    
    private void method5155(final Class7929 class7929, final float n) {
        final float n2 = this.method2664() - n;
        if (n2 > 0.5f) {
            this.method2665(n2);
        }
        else {
            this.method5157(class7929);
            this.method1652();
        }
    }
    
    private void method5156(final Class7929 class7929) {
        Class3833.method11839(this.field2391, new BlockPos(this), new ItemStack(Class7739.field31546));
        this.method5157(class7929);
    }
    
    private void method5157(final Class7929 class7929) {
        this.method5158();
        this.method2675(class7929);
        for (int i = 0; i < this.field4579.size(); ++i) {
            final ItemStack class7930 = this.field4579.get(i);
            if (!class7930.method27620()) {
                Class3833.method11839(this.field2391, new BlockPos(this).method1137(), class7930);
                this.field4579.set(i, ItemStack.field34174);
            }
        }
        for (int j = 0; j < this.field4580.size(); ++j) {
            final ItemStack class7931 = this.field4580.get(j);
            if (!class7931.method27620()) {
                Class3833.method11839(this.field2391, new BlockPos(this).method1137(), class7931);
                this.field4580.set(j, ItemStack.field34174);
            }
        }
    }
    
    private void method5158() {
        this.field2391.method6706(null, this.getPosX(), this.getPosY(), this.getPosZ(), Class8520.field34987, this.method1922(), 1.0f, 1.0f);
    }
    
    @Override
    public float method2735(final float n, final float n2) {
        this.field2952 = this.field2401;
        this.field2951 = this.field2399;
        return 0.0f;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return class291.field34098 * (this.method2625() ? 0.5f : 0.9f);
    }
    
    @Override
    public double method1776() {
        return this.method5166() ? 0.0 : 0.10000000149011612;
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (this.method5148()) {
            super.method2729(class5487);
        }
    }
    
    @Override
    public void method1846(final float n) {
        this.field2401 = n;
        this.field2952 = n;
        this.field2953 = n;
        this.field2954 = n;
    }
    
    @Override
    public void method1845(final float n) {
        this.field2401 = n;
        this.field2952 = n;
        this.field2953 = n;
        this.field2954 = n;
    }
    
    @Override
    public void method1659() {
        super.method1659();
        final Class8396 class8396 = this.field2432.method33568(Class857.field4572);
        if (!this.field4584.equals(class8396)) {
            this.method5168(class8396);
        }
        final Class8396 class8397 = this.field2432.method33568(Class857.field4573);
        if (!this.field4585.equals(class8397)) {
            this.method5169(class8397);
        }
        final Class8396 class8398 = this.field2432.method33568(Class857.field4574);
        if (!this.field4586.equals(class8398)) {
            this.method5170(class8398);
        }
        final Class8396 class8399 = this.field2432.method33568(Class857.field4575);
        if (!this.field4587.equals(class8399)) {
            this.method5171(class8399);
        }
        final Class8396 class8400 = this.field2432.method33568(Class857.field4576);
        if (!this.field4588.equals(class8400)) {
            this.method5172(class8400);
        }
        final Class8396 class8401 = this.field2432.method33568(Class857.field4577);
        if (!this.field4589.equals(class8401)) {
            this.method5173(class8401);
        }
    }
    
    @Override
    public void method2644() {
        this.method1828(this.field4581);
    }
    
    @Override
    public void method1828(final boolean field4581) {
        super.method1828(this.field4581 = field4581);
    }
    
    @Override
    public boolean method2625() {
        return this.method5160();
    }
    
    @Override
    public void method1648() {
        this.method1652();
    }
    
    @Override
    public boolean method1899() {
        return this.method1823();
    }
    
    @Override
    public Class2117 method1921() {
        return this.method5166() ? Class2117.field12343 : super.method1921();
    }
    
    private void method5159(final boolean b) {
        this.field2432.method33569(Class857.field4571, this.method5167(this.field2432.method33568(Class857.field4571), 1, b));
    }
    
    public boolean method5160() {
        return (this.field2432.method33568(Class857.field4571) & 0x1) != 0x0;
    }
    
    private void method5161(final boolean b) {
        this.field2432.method33569(Class857.field4571, this.method5167(this.field2432.method33568(Class857.field4571), 4, b));
    }
    
    public boolean method5162() {
        return (this.field2432.method33568(Class857.field4571) & 0x4) != 0x0;
    }
    
    private void method5163(final boolean b) {
        this.field2432.method33569(Class857.field4571, this.method5167(this.field2432.method33568(Class857.field4571), 8, b));
    }
    
    public boolean method5164() {
        return (this.field2432.method33568(Class857.field4571) & 0x8) != 0x0;
    }
    
    private void method5165(final boolean b) {
        this.field2432.method33569(Class857.field4571, this.method5167(this.field2432.method33568(Class857.field4571), 16, b));
    }
    
    public boolean method5166() {
        return (this.field2432.method33568(Class857.field4571) & 0x10) != 0x0;
    }
    
    private byte method5167(final byte b, final int n, final boolean b2) {
        byte b3;
        if (!b2) {
            b3 = (byte)(b & ~n);
        }
        else {
            b3 = (byte)(b | n);
        }
        return b3;
    }
    
    public void method5168(final Class8396 field4584) {
        this.field4584 = field4584;
        this.field2432.method33569(Class857.field4572, field4584);
    }
    
    public void method5169(final Class8396 field4585) {
        this.field4585 = field4585;
        this.field2432.method33569(Class857.field4573, field4585);
    }
    
    public void method5170(final Class8396 field4586) {
        this.field4586 = field4586;
        this.field2432.method33569(Class857.field4574, field4586);
    }
    
    public void method5171(final Class8396 field4587) {
        this.field4587 = field4587;
        this.field2432.method33569(Class857.field4575, field4587);
    }
    
    public void method5172(final Class8396 field4588) {
        this.field4588 = field4588;
        this.field2432.method33569(Class857.field4576, field4588);
    }
    
    public void method5173(final Class8396 field4589) {
        this.field4589 = field4589;
        this.field2432.method33569(Class857.field4577, field4589);
    }
    
    public Class8396 method5174() {
        return this.field4584;
    }
    
    public Class8396 method5175() {
        return this.field4585;
    }
    
    public Class8396 method5176() {
        return this.field4586;
    }
    
    public Class8396 method5177() {
        return this.field4587;
    }
    
    public Class8396 method5178() {
        return this.field4588;
    }
    
    public Class8396 method5179() {
        return this.field4589;
    }
    
    @Override
    public boolean method1749() {
        return super.method1749() && !this.method5166();
    }
    
    @Override
    public boolean method1848(final Entity class399) {
        return class399 instanceof Class512 && !this.field2391.method6760((Class512)class399, new BlockPos(this));
    }
    
    @Override
    public Class2226 method2755() {
        return Class2226.field13698;
    }
    
    @Override
    public Class7795 method2685(final int n) {
        return Class8520.field34988;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field34989;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return Class8520.field34987;
    }
    
    @Override
    public void method1834(final Class422 class422) {
    }
    
    @Override
    public boolean method2776() {
        return false;
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class857.field4571.equals(class8810)) {
            this.method1881();
            this.preventEntitySpawning = !this.method5166();
        }
        super.method1880(class8810);
    }
    
    @Override
    public boolean method2777() {
        return false;
    }
    
    @Override
    public Class8295 method1933(final Class290 class290) {
        return this.method1642().method23376().method27561(this.method5166() ? 0.0f : (this.method2625() ? 0.5f : 1.0f));
    }
    
    static {
        field4565 = new Class8396(0.0f, 0.0f, 0.0f);
        field4566 = new Class8396(0.0f, 0.0f, 0.0f);
        field4567 = new Class8396(-10.0f, 0.0f, -10.0f);
        field4568 = new Class8396(-15.0f, 0.0f, 10.0f);
        field4569 = new Class8396(-1.0f, 0.0f, -1.0f);
        field4570 = new Class8396(1.0f, 0.0f, 1.0f);
        field4571 = Class9184.method33564(Class857.class, Class7709.field30653);
        field4572 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4573 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4574 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4575 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4576 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4577 = Class9184.method33564(Class857.class, Class7709.field30663);
        field4578 = (class399 -> class399 instanceof Class428 && ((Class428)class399).method2139() == Class2080.field12024);
    }
}
