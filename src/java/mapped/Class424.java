// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Iterator;

public class Class424 extends Class399
{
    private Class7096 field2573;
    public int field2574;
    public boolean field2575;
    private boolean field2576;
    private boolean field2577;
    private int field2578;
    private float field2579;
    public Class51 field2580;
    public static final Class8810<Class354> field2581;
    
    public Class424(final Class7499<? extends Class424> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2573 = Class7521.field29175.method11878();
        this.field2575 = true;
        this.field2578 = 40;
        this.field2579 = 2.0f;
    }
    
    public Class424(final Class1847 class1847, final double field2392, final double field2393, final double field2394, final Class7096 field2395) {
        this(Class7499.field28983, class1847);
        this.field2573 = field2395;
        this.field2386 = true;
        this.method1656(field2392, field2393 + (1.0f - this.method1931()) / 2.0f, field2394);
        this.method1936(Class5487.field22769);
        this.field2392 = field2392;
        this.field2393 = field2393;
        this.field2394 = field2394;
        this.method2067(new Class354(this));
    }
    
    @Override
    public boolean method1847() {
        return false;
    }
    
    public void method2067(final Class354 class354) {
        this.field2432.method33569(Class424.field2581, class354);
    }
    
    public Class354 method2068() {
        return this.field2432.method33568(Class424.field2581);
    }
    
    @Override
    public boolean method1700() {
        return false;
    }
    
    @Override
    public void method1649() {
        this.field2432.method33565(Class424.field2581, Class354.field2173);
    }
    
    @Override
    public boolean method1749() {
        return !this.field2410;
    }
    
    @Override
    public void method1659() {
        if (!this.field2573.method21706()) {
            final Class3833 method21696 = this.field2573.method21696();
            if (this.field2574++ == 0) {
                final Class354 class354 = new Class354(this);
                if (this.field2391.method6701(class354).method21696() != method21696) {
                    if (!this.field2391.field10067) {
                        this.method1652();
                        return;
                    }
                }
                else {
                    this.field2391.method6690(class354, false);
                }
            }
            if (!this.method1698()) {
                this.method1936(this.method1935().method16744(0.0, -0.04, 0.0));
            }
            this.method1671(Class2160.field12826, this.method1935());
            Label_0060: {
                if (!this.field2391.field10067) {
                    Class354 method21697 = new Class354(this);
                    final boolean b = this.field2573.method21696() instanceof Class3988;
                    boolean b2 = b && this.field2391.method6702(method21697).method21793(Class7324.field28319);
                    final double method21698 = this.method1935().method16753();
                    if (b) {
                        if (method21698 > 1.0) {
                            final Class7005 method21699 = this.field2391.method6987(new Class8478(new Class5487(this.field2392, this.field2393, this.field2394), this.method1934(), Class2040.field11632, Class2191.field13326, this));
                            if (method21699.method21449() != Class2165.field12880) {
                                if (this.field2391.method6702(method21699.method21447()).method21793(Class7324.field28319)) {
                                    method21697 = method21699.method21447();
                                    b2 = true;
                                }
                            }
                        }
                    }
                    if (!this.field2404 && !b2) {
                        if (!this.field2391.field10067) {
                            Label_0461: {
                                if (this.field2574 > 100) {
                                    if (method21697.method1075() < 1) {
                                        break Label_0461;
                                    }
                                    if (method21697.method1075() > 256) {
                                        break Label_0461;
                                    }
                                }
                                if (this.field2574 <= 600) {
                                    break Label_0060;
                                }
                            }
                            if (this.field2575) {
                                if (this.field2391.method6765().method31216(Class8878.field37321)) {
                                    this.method1764(method21696);
                                }
                            }
                            this.method1652();
                        }
                    }
                    else {
                        final Class7096 method21700 = this.field2391.method6701(method21697);
                        this.method1936(this.method1935().method16751(0.7, -0.5, 0.7));
                        if (method21700.method21696() != Class7521.field29264) {
                            this.method1652();
                            if (this.field2576) {
                                if (method21696 instanceof Class3986) {
                                    ((Class3986)method21696).method12133(this.field2391, method21697);
                                }
                            }
                            else {
                                final boolean method21701 = method21700.method21750(new Class7073(this.field2391, method21697, Class179.field511, Class8321.field34174, Class179.field512));
                                final boolean b3 = Class3986.method12131(this.field2391.method6701(method21697.method1139())) && (!b || !b2);
                                final boolean b4 = this.field2573.method21752(this.field2391, method21697) && !b3;
                                if (method21701 && b4) {
                                    if (this.field2573.method21771((Class7111<Comparable>)Class8970.field37747)) {
                                        if (this.field2391.method6702(method21697).method21779() == Class7558.field29976) {
                                            this.field2573 = ((Class7097<O, Class7096>)this.field2573).method21773((Class7111<Comparable>)Class8970.field37747, true);
                                        }
                                    }
                                    if (!this.field2391.method6688(method21697, this.field2573, 3)) {
                                        if (this.field2575) {
                                            if (this.field2391.method6765().method31216(Class8878.field37321)) {
                                                this.method1764(method21696);
                                            }
                                        }
                                    }
                                    else {
                                        if (method21696 instanceof Class3986) {
                                            ((Class3986)method21696).method12132(this.field2391, method21697, this.field2573, method21700);
                                        }
                                        if (this.field2580 != null) {
                                            if (method21696 instanceof Class3840) {
                                                final Class436 method21702 = this.field2391.method6727(method21697);
                                                if (method21702 != null) {
                                                    final Class51 method21703 = method21702.method2180(new Class51());
                                                    for (final String anObject : this.field2580.method293()) {
                                                        final Class41 method21704 = this.field2580.method313(anObject);
                                                        if ("x".equals(anObject)) {
                                                            continue;
                                                        }
                                                        if ("y".equals(anObject)) {
                                                            continue;
                                                        }
                                                        if ("z".equals(anObject)) {
                                                            continue;
                                                        }
                                                        method21703.method295(anObject, method21704.method265());
                                                    }
                                                    method21702.method2179(method21703);
                                                    method21702.method2161();
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (this.field2575) {
                                    if (this.field2391.method6765().method31216(Class8878.field37321)) {
                                        this.method1764(method21696);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.method1936(this.method1935().method16748(0.98));
        }
        else {
            this.method1652();
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (this.field2577) {
            final int method35649 = Class9546.method35649(n - 1.0f);
            if (method35649 > 0) {
                final ArrayList arrayList = Lists.newArrayList((Iterable)this.field2391.method7127(this, this.method1886()));
                final boolean method35650 = this.field2573.method21755(Class7188.field27905);
                final Class7929 class7929 = method35650 ? Class7929.field32578 : Class7929.field32579;
                final Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    ((Class399)iterator.next()).method1740(class7929, (float)Math.min(Class9546.method35642(method35649 * this.field2579), this.field2578));
                }
                if (method35650) {
                    if (this.field2423.nextFloat() < 0.05000000074505806 + method35649 * 0.05) {
                        final Class7096 method35651 = Class3990.method12139(this.field2573);
                        if (method35651 != null) {
                            this.field2573 = method35651;
                        }
                        else {
                            this.field2576 = true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method1761(final Class51 class51) {
        class51.method295("BlockState", Class9346.method34649(this.field2573));
        class51.method298("Time", this.field2574);
        class51.method312("DropItem", this.field2575);
        class51.method312("HurtEntities", this.field2577);
        class51.method304("FallHurtAmount", this.field2579);
        class51.method298("FallHurtMax", this.field2578);
        if (this.field2580 != null) {
            class51.method295("TileEntityData", this.field2580);
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.field2573 = Class9346.method34647(class51.method327("BlockState"));
        this.field2574 = class51.method319("Time");
        if (!class51.method316("HurtEntities", 99)) {
            if (this.field2573.method21755(Class7188.field27905)) {
                this.field2577 = true;
            }
        }
        else {
            this.field2577 = class51.method329("HurtEntities");
            this.field2579 = class51.method321("FallHurtAmount");
            this.field2578 = class51.method319("FallHurtMax");
        }
        if (class51.method316("DropItem", 99)) {
            this.field2575 = class51.method329("DropItem");
        }
        if (class51.method316("TileEntityData", 10)) {
            this.field2580 = class51.method327("TileEntityData");
        }
        if (this.field2573.method21706()) {
            this.field2573 = Class7521.field29175.method11878();
        }
    }
    
    public Class1847 method2069() {
        return this.field2391;
    }
    
    public void method2070(final boolean field2577) {
        this.field2577 = field2577;
    }
    
    @Override
    public boolean method1863() {
        return false;
    }
    
    @Override
    public void method1862(final Class5204 class5204) {
        super.method1862(class5204);
        class5204.method16297("Immitating BlockState", this.field2573.toString());
    }
    
    public Class7096 method2071() {
        return this.field2573;
    }
    
    @Override
    public boolean method1905() {
        return true;
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this, Class3833.method11774(this.method2071()));
    }
    
    static {
        field2581 = Class9184.method33564(Class424.class, Class7709.field30664);
    }
}
