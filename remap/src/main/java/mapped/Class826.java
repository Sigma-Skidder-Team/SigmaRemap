// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.UUID;

public class Class826 extends Class827 implements Class825
{
    private static final Class8810<Boolean> field4416;
    private static final Class8810<Class8562> field4417;
    private int field4418;
    private UUID field4419;
    private Class41 field4420;
    private Class51 field4421;
    private int field4422;
    
    public Class826(final Class7499<? extends Class826> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.method4921(this.method4870().method28784(Class90.field240.method508(this.field2423)));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class826.field4416, false);
        this.field2432.method33565(Class826.field4417, new Class8562(Class7611.field30165, Class9334.field40060, 1));
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method295("VillagerData", this.method4870().method28786((com.mojang.datafixers.types.DynamicOps<Class41>)Class8453.field34721));
        if (this.field4421 != null) {
            class51.method295("Offers", this.field4421);
        }
        if (this.field4420 != null) {
            class51.method295("Gossips", this.field4420);
        }
        class51.method298("ConversionTime", this.method4913() ? this.field4418 : -1);
        if (this.field4419 != null) {
            class51.method300("ConversionPlayer", this.field4419);
        }
        class51.method298("Xp", this.field4422);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("VillagerData", 10)) {
            this.method4921(new Class8562((Dynamic<?>)new Dynamic((DynamicOps)Class8453.field34721, (Object)class51.method313("VillagerData"))));
        }
        if (class51.method316("Offers", 10)) {
            this.field4421 = class51.method327("Offers");
        }
        if (class51.method316("Gossips", 10)) {
            this.field4420 = class51.method328("Gossips", 10);
        }
        if (class51.method316("ConversionTime", 99)) {
            if (class51.method319("ConversionTime") > -1) {
                this.method4914(class51.method302("ConversionPlayer") ? class51.method301("ConversionPlayer") : null, class51.method319("ConversionTime"));
            }
        }
        if (class51.method316("Xp", 3)) {
            this.field4422 = class51.method319("Xp");
        }
    }
    
    @Override
    public void method1659() {
        if (!this.field2391.field10067) {
            if (this.method1768()) {
                if (this.method4913()) {
                    this.field4418 -= this.method4916();
                    if (this.field4418 <= 0) {
                        this.method4915((Class1849)this.field2391);
                    }
                }
            }
        }
        super.method1659();
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31341 && this.method2653(Class9439.field40491)) {
            if (!class512.field3025.field27304) {
                method2715.method27693(1);
            }
            if (!this.field2391.field10067) {
                this.method4914(class512.method1865(), this.field2423.nextInt(2401) + 3600);
                class512.method2708(class513, true);
            }
            return true;
        }
        return super.method4195(class512, class513);
    }
    
    @Override
    public boolean method4912() {
        return false;
    }
    
    @Override
    public boolean method4168(final double n) {
        return !this.method4913();
    }
    
    public boolean method4913() {
        return this.method1650().method33568(Class826.field4416);
    }
    
    private void method4914(final UUID field4419, final int field4420) {
        this.field4419 = field4419;
        this.field4418 = field4420;
        this.method1650().method33569(Class826.field4416, true);
        this.method2659(Class9439.field40491);
        this.method2655(new Class1948(Class9439.field40478, field4420, Math.min(this.field2391.method6954().method8235() - 1, 0)));
        this.field2391.method6761(this, (byte)16);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 16) {
            super.method1798(b);
        }
        else if (!this.method1696()) {
            this.field2391.method6708(this.getPosX(), this.method1944(), this.getPosZ(), Class8520.field35770, this.method1922(), 1.0f + this.field2423.nextFloat(), this.field2423.nextFloat() * 0.7f + 0.3f, false);
        }
    }
    
    private void method4915(final Class1849 class1849) {
        final Class824 class1850 = Class7499.field29042.method23371(class1849);
        for (final Class2215 class1851 : Class2215.values()) {
            final Class8321 method2718 = this.method2718(class1851);
            if (!method2718.method27620()) {
                if (!Class8742.method30217(method2718)) {
                    if (this.method4183(class1851) > 1.0) {
                        this.method1766(method2718);
                    }
                }
                else {
                    class1850.method1893(class1851.method8402() + 300, method2718);
                }
            }
        }
        class1850.method1852(this);
        class1850.method4869(this.method4870());
        if (this.field4420 != null) {
            class1850.method4900(this.field4420);
        }
        if (this.field4421 != null) {
            class1850.method4879(new Class57(this.field4421));
        }
        class1850.method4897(this.field4422);
        class1850.method4188(class1849, class1849.method6784(new BlockPos(class1850)), Class2101.field12182, null, null);
        if (this.method2625()) {
            class1850.method4354(-24000);
        }
        this.method1652();
        class1850.method4211(this.method4214());
        if (this.method1874()) {
            class1850.method1872(this.method1873());
            class1850.method1875(this.method1876());
        }
        if (this.method4194()) {
            class1850.method4190();
        }
        class1850.method1851(this.method1850());
        class1849.method6886(class1850);
        if (this.field4419 != null) {
            final Class512 method2719 = class1849.method7143(this.field4419);
            if (method2719 instanceof Class513) {
                Class7770.field31792.method13734((Class513)method2719, this, class1850);
                class1849.method6929(Class8156.field33590, method2719, class1850);
            }
        }
        class1850.method2655(new Class1948(Class9439.field40482, 200, 0));
        class1849.method6839(null, 1027, new BlockPos(this), 0);
    }
    
    private int method4916() {
        int n = 1;
        if (this.field2423.nextFloat() < 0.01f) {
            int n2 = 0;
            final Class385 class385 = new Class385();
            for (int i = (int)this.getPosX() - 4; i < (int)this.getPosX() + 4; ++i) {
                if (n2 >= 14) {
                    break;
                }
                for (int n3 = (int)this.getPosY() - 4; n3 < (int)this.getPosY() + 4 && n2 < 14; ++n3) {
                    for (int n4 = (int)this.getPosZ() - 4; n4 < (int)this.getPosZ() + 4 && n2 < 14; ++n4) {
                        final Class3833 method21696 = this.field2391.method6701(class385.method1284(i, n3, n4)).method21696();
                        if (method21696 == Class7521.field29381 || method21696 instanceof Class3900) {
                            if (this.field2423.nextFloat() < 0.3f) {
                                ++n;
                            }
                            ++n2;
                        }
                    }
                }
            }
        }
        return n;
    }
    
    @Override
    public float method2721() {
        return this.method2625() ? ((this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f + 2.0f) : ((this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f + 1.0f);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35768;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35772;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35771;
    }
    
    @Override
    public Class7795 method4917() {
        return Class8520.field35773;
    }
    
    @Override
    public Class8321 method4918() {
        return Class8321.field34174;
    }
    
    public void method4919(final Class51 field4421) {
        this.field4421 = field4421;
    }
    
    public void method4920(final Class41 field4420) {
        this.field4420 = field4420;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method4921(this.method4870().method28783(Class7611.method23913(class1851.method6959(new BlockPos(this)))));
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public void method4921(final Class8562 class8562) {
        if (this.method4870().method28781() != class8562.method28781()) {
            this.field4421 = null;
        }
        this.field2432.method33569(Class826.field4417, class8562);
    }
    
    @Override
    public Class8562 method4870() {
        return this.field2432.method33568(Class826.field4417);
    }
    
    public void method4922(final int field4422) {
        this.field4422 = field4422;
    }
    
    static {
        field4416 = Class9184.method33564(Class826.class, Class7709.field30661);
        field4417 = Class9184.method33564(Class826.class, Class7709.field30669);
    }
}
