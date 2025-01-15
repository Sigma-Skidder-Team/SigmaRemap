// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Arrays;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.function.Predicate;
import java.util.function.Function;
import javax.annotation.Nullable;
import java.util.Random;
import java.util.Map;

public class Class802 extends Class789
{
    private static final Class8810<Byte> field4305;
    private static final Map<Class181, Class3832> field4306;
    private static final Map<Class181, float[]> field4307;
    private int field4308;
    private Class3492 field4309;
    
    private static float[] method4629(final Class181 class181) {
        if (class181 != Class181.field537) {
            final float[] method815 = class181.method815();
            return new float[] { method815[0] * 0.75f, method815[1] * 0.75f, method815[2] * 0.75f };
        }
        return new float[] { 0.9019608f, 0.9019608f, 0.9019608f };
    }
    
    public static float[] method4630(final Class181 class181) {
        return Class802.field4307.get(class181);
    }
    
    public Class802(final Class7499<? extends Class802> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4309 = new Class3492(this);
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3607(this, 1.25));
        this.field4114.method22062(2, new Class3587(this, 1.0));
        this.field4114.method22062(3, new Class3472(this, 1.1, Class120.method618(Class7739.field31315), false));
        this.field4114.method22062(4, new Class3456(this, 1.1));
        this.field4114.method22062(5, this.field4309);
        this.field4114.method22062(6, new Class3517(this, 1.0));
        this.field4114.method22062(7, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
    }
    
    @Override
    public void method4172() {
        this.field4308 = this.field4309.method11056();
        super.method4172();
    }
    
    @Override
    public void method2736() {
        if (this.field2391.field10067) {
            this.field4308 = Math.max(0, this.field4308 - 1);
        }
        super.method2736();
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(8.0);
        this.method2710(Class8107.field33408).method23941(0.23000000417232513);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class802.field4305, (Byte)0);
    }
    
    @Override
    public Class1932 method4161() {
        if (this.method4636()) {
            return this.method1642().method23368();
        }
        switch (Class7128.field27777[this.method4634().ordinal()]) {
            default: {
                return Class9020.field38100;
            }
            case 2: {
                return Class9020.field38101;
            }
            case 3: {
                return Class9020.field38102;
            }
            case 4: {
                return Class9020.field38103;
            }
            case 5: {
                return Class9020.field38104;
            }
            case 6: {
                return Class9020.field38105;
            }
            case 7: {
                return Class9020.field38106;
            }
            case 8: {
                return Class9020.field38107;
            }
            case 9: {
                return Class9020.field38108;
            }
            case 10: {
                return Class9020.field38109;
            }
            case 11: {
                return Class9020.field38110;
            }
            case 12: {
                return Class9020.field38111;
            }
            case 13: {
                return Class9020.field38112;
            }
            case 14: {
                return Class9020.field38113;
            }
            case 15: {
                return Class9020.field38114;
            }
            case 16: {
                return Class9020.field38115;
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 10) {
            super.method1798(b);
        }
        else {
            this.field4308 = 40;
        }
    }
    
    public float method4631(final float n) {
        if (this.field4308 <= 0) {
            return 0.0f;
        }
        if (this.field4308 >= 4 && this.field4308 <= 36) {
            return 1.0f;
        }
        return (this.field4308 >= 4) ? (-(this.field4308 - 40 - n) / 4.0f) : ((this.field4308 - n) / 4.0f);
    }
    
    public float method4632(final float n) {
        if (this.field4308 > 4 && this.field4308 <= 36) {
            return 0.62831855f + 0.21991149f * Class9546.method35638((this.field4308 - 4 - n) / 32.0f * 28.7f);
        }
        return (this.field4308 <= 0) ? (this.field2400 * 0.017453292f) : 0.62831855f;
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31426) {
            if (!this.method4636()) {
                if (!this.method2625()) {
                    this.method4633();
                    if (!this.field2391.field10067) {
                        method2715.method27636(1, class512, class515 -> class515.method2795(class514));
                    }
                    return true;
                }
            }
        }
        return super.method4195(class512, class513);
    }
    
    public void method4633() {
        if (!this.field2391.field10067) {
            this.method4637(true);
            for (int n = 1 + this.field2423.nextInt(3), i = 0; i < n; ++i) {
                final Class427 method1765 = this.method1765(Class802.field4306.get(this.method4634()), 1);
                if (method1765 != null) {
                    method1765.method1936(method1765.method1935().method16744((this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.1f, this.field2423.nextFloat() * 0.05f, (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.1f));
                }
            }
        }
        this.method1695(Class8520.field35543, 1.0f, 1.0f);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("Sheared", this.method4636());
        class51.method296("Color", (byte)this.method4634().method813());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4637(class51.method329("Sheared"));
        this.method4635(Class181.method819(class51.method317("Color")));
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35540;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35542;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35541;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(Class8520.field35544, 0.15f, 1.0f);
    }
    
    public Class181 method4634() {
        return Class181.method819(this.field2432.method33568(Class802.field4305) & 0xF);
    }
    
    public void method4635(final Class181 class181) {
        this.field2432.method33569(Class802.field4305, (byte)((this.field2432.method33568(Class802.field4305) & 0xF0) | (class181.method813() & 0xF)));
    }
    
    public boolean method4636() {
        return (this.field2432.method33568(Class802.field4305) & 0x10) != 0x0;
    }
    
    public void method4637(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class802.field4305);
        if (!b) {
            this.field2432.method33569(Class802.field4305, (byte)(byteValue & 0xFFFFFFEF));
        }
        else {
            this.field2432.method33569(Class802.field4305, (byte)(byteValue | 0x10));
        }
    }
    
    public static Class181 method4638(final Random random) {
        final int nextInt = random.nextInt(100);
        if (nextInt < 5) {
            return Class181.field552;
        }
        if (nextInt < 10) {
            return Class181.field544;
        }
        if (nextInt < 15) {
            return Class181.field545;
        }
        if (nextInt >= 18) {
            return (random.nextInt(500) != 0) ? Class181.field537 : Class181.field543;
        }
        return Class181.field549;
    }
    
    public Class802 method4639(final Class788 class788) {
        final Class802 class789 = (Class802)class788;
        final Class802 class790 = Class7499.field29019.method23371(this.field2391);
        class790.method4635(this.method4640(this, class789));
        return class790;
    }
    
    @Override
    public void method4154() {
        this.method4637(false);
        if (this.method2625()) {
            this.method4353(60);
        }
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method4635(method4638(class1851.method6790()));
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    private Class181 method4640(final Class789 class789, final Class789 class790) {
        return this.field2391.method6792().method6378(Class8976.field37843, method4641(((Class802)class789).method4634(), ((Class802)class790).method4634()), this.field2391).map(class792 -> class792.method11290(class791)).map((Function<? super Object, ?>)Class8321::method27622).filter(Class3829.class::isInstance).map((Function<? super Object, ?>)Class3829.class::cast).map((Function<? super Object, ? extends Class181>)Class3829::method11767).orElseGet(() -> this.field2391.field10062.nextBoolean() ? class793 : class794);
    }
    
    private static Class473 method4641(final Class181 class181, final Class181 class182) {
        final Class473 class183 = new Class473(new Class3419(null, -1), 2, 1);
        class183.method2160(0, new Class8321(Class3829.method11768(class181)));
        class183.method2160(1, new Class8321(Class3829.method11768(class182)));
        return class183;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 0.95f * class291.field34098;
    }
    
    static {
        field4305 = Class9184.method33564(Class802.class, Class7709.field30653);
        field4306 = Class8349.method27851(Maps.newEnumMap((Class)Class181.class), enumMap -> {
            enumMap.put(Class181.field537, Class7521.field29248);
            enumMap.put(Class181.field538, Class7521.field29249);
            enumMap.put(Class181.field539, Class7521.field29250);
            enumMap.put(Class181.field540, Class7521.field29251);
            enumMap.put(Class181.field541, Class7521.field29252);
            enumMap.put(Class181.field542, Class7521.field29253);
            enumMap.put(Class181.field543, Class7521.field29254);
            enumMap.put(Class181.field544, Class7521.field29255);
            enumMap.put(Class181.field545, Class7521.field29256);
            enumMap.put(Class181.field546, Class7521.field29257);
            enumMap.put(Class181.field547, Class7521.field29258);
            enumMap.put(Class181.field548, Class7521.field29259);
            enumMap.put(Class181.field549, Class7521.field29260);
            enumMap.put(Class181.field550, Class7521.field29261);
            enumMap.put(Class181.field551, Class7521.field29262);
            enumMap.put(Class181.field552, Class7521.field29263);
            return;
        });
        field4307 = Maps.newEnumMap((Map)Arrays.stream(Class181.values()).collect(Collectors.toMap(class181 -> class181, (Function<? super Class181, ?>)Class802::method4629)));
    }
}
