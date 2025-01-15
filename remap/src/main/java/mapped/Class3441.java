// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;

public class Class3441 extends Class3418
{
    private static String[] field16251;
    private static final Logger field16252;
    private final Class446 field16253;
    private final Class446 field16254;
    private final Class6546 field16255;
    private final Class7318 field16256;
    private int field16257;
    private String field16258;
    private final Class512 field16259;
    
    public Class3441(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3441(final int n, final Class464 class464, final Class7318 field16256) {
        super(Class8471.field34762, n);
        this.field16253 = new Class470();
        this.field16254 = new Class482(this, 2);
        this.field16255 = Class6546.method19836();
        this.field16256 = field16256;
        this.field16259 = class464.field2744;
        this.method10871(this.field16255);
        this.method10870(new Class6601(this.field16254, 0, 27, 47));
        this.method10870(new Class6601(this.field16254, 1, 76, 47));
        this.method10870(new Class6606(this, this.field16253, 2, 134, 47, field16256));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 8 + k * 18, 142));
        }
    }
    
    @Override
    public void method10855(final Class446 class446) {
        super.method10855(class446);
        if (class446 == this.field16254) {
            this.method10995();
        }
    }
    
    public void method10995() {
        final ItemStack method2157 = this.field16254.method2157(0);
        this.field16255.method19833(1);
        int n = 0;
        final int n2 = 0;
        int n3 = 0;
        if (method2157.method27620()) {
            this.field16253.method2160(0, ItemStack.field34174);
            this.field16255.method19833(0);
        }
        else {
            ItemStack class8321 = method2157.method27641();
            final ItemStack method2158 = this.field16254.method2157(1);
            final Map<Class6257, Integer> method2159 = Class8742.method30196(class8321);
            final int n4 = n2 + method2157.method27680() + (method2158.method27620() ? 0 : method2158.method27680());
            this.field16257 = 0;
            if (!method2158.method27620()) {
                final boolean b = method2158.method27622() == Class7739.field31534 && !Class4034.method12225(method2158).isEmpty();
                if (class8321.method27630() && class8321.method27622().method11738(method2157, method2158)) {
                    int n5 = Math.min(class8321.method27632(), class8321.method27634() / 4);
                    if (n5 <= 0) {
                        this.field16253.method2160(0, ItemStack.field34174);
                        this.field16255.method19833(0);
                        return;
                    }
                    int field16257;
                    for (field16257 = 0; n5 > 0 && field16257 < method2158.method27690(); n5 = Math.min(class8321.method27632(), class8321.method27634() / 4), ++field16257) {
                        class8321.method27633(class8321.method27632() - n5);
                        ++n;
                    }
                    this.field16257 = field16257;
                }
                else {
                    if (!b && (class8321.method27622() != method2158.method27622() || !class8321.method27630())) {
                        this.field16253.method2160(0, ItemStack.field34174);
                        this.field16255.method19833(0);
                        return;
                    }
                    if (class8321.method27630() && !b) {
                        int n6 = class8321.method27634() - (method2157.method27634() - method2157.method27632() + (method2158.method27634() - method2158.method27632() + class8321.method27634() * 12 / 100));
                        if (n6 < 0) {
                            n6 = 0;
                        }
                        if (n6 < class8321.method27632()) {
                            class8321.method27633(n6);
                            n += 2;
                        }
                    }
                    final Map<Class6257, Integer> method2160 = Class8742.method30196(method2158);
                    boolean b2 = false;
                    boolean b3 = false;
                    for (final Class6257 class8322 : method2160.keySet()) {
                        if (class8322 != null) {
                            final int b4 = method2159.containsKey(class8322) ? method2159.get(class8322) : 0;
                            final int intValue = method2160.get(class8322);
                            int method2161 = (b4 == intValue) ? (intValue + 1) : Math.max(intValue, b4);
                            boolean method2162 = class8322.method18600(method2157);
                            if (this.field16259.field3025.field27304 || method2157.method27622() == Class7739.field31534) {
                                method2162 = true;
                            }
                            for (final Class6257 class8323 : method2159.keySet()) {
                                if (class8323 != class8322 && !class8322.method18596(class8323)) {
                                    method2162 = false;
                                    ++n;
                                }
                            }
                            if (!method2162) {
                                b3 = true;
                            }
                            else {
                                b2 = true;
                                if (method2161 > class8322.method18588()) {
                                    method2161 = class8322.method18588();
                                }
                                method2159.put(class8322, method2161);
                                int max = 0;
                                switch (Class8796.field36986[class8322.method18592().ordinal()]) {
                                    case 1: {
                                        max = 1;
                                        break;
                                    }
                                    case 2: {
                                        max = 2;
                                        break;
                                    }
                                    case 3: {
                                        max = 4;
                                        break;
                                    }
                                    case 4: {
                                        max = 8;
                                        break;
                                    }
                                }
                                if (b) {
                                    max = Math.max(1, max / 2);
                                }
                                n += max * method2161;
                                if (method2157.method27690() <= 1) {
                                    continue;
                                }
                                n = 40;
                            }
                        }
                    }
                    if (b3 && !b2) {
                        this.field16253.method2160(0, ItemStack.field34174);
                        this.field16255.method19833(0);
                        return;
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.field16258)) {
                if (method2157.method27667()) {
                    n3 = 1;
                    n += n3;
                    class8321.method27666();
                }
            }
            else if (!this.field16258.equals(method2157.method27664().getString())) {
                n3 = 1;
                n += n3;
                class8321.method27665(new Class2260(this.field16258));
            }
            this.field16255.method19833(n4 + n);
            if (n <= 0) {
                class8321 = ItemStack.field34174;
            }
            if (n3 == n && n3 > 0 && this.field16255.method19832() >= 40) {
                this.field16255.method19833(39);
            }
            if (this.field16255.method19832() >= 40 && !this.field16259.field3025.field27304) {
                class8321 = ItemStack.field34174;
            }
            if (!class8321.method27620()) {
                int n7 = class8321.method27680();
                if (!method2158.method27620() && n7 < method2158.method27680()) {
                    n7 = method2158.method27680();
                }
                if (n3 != n || n3 == 0) {
                    n7 = method10996(n7);
                }
                class8321.method27681(n7);
                Class8742.method30198(method2159, class8321);
            }
            this.field16253.method2160(0, class8321);
            this.method10876();
        }
    }
    
    public static int method10996(final int n) {
        return n * 2 + 1;
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16256.method22437((class514, p2) -> this.method10881(class513, class514, this.field16254));
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return this.field16256.method22436((class515, class517) -> class515.method6701(class517).method21755(Class7188.field27905) && class513.method1733(class517.getX() + 0.5, class517.getY() + 0.5, class517.getZ() + 0.5) <= 64.0, Boolean.valueOf(true));
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n != 2) {
                    if (n != 0 && n != 1) {
                        if (n >= 3) {
                            if (n < 39) {
                                if (!this.method10888(method20053, 0, 2, false)) {
                                    return ItemStack.field34174;
                                }
                            }
                        }
                    }
                    else if (!this.method10888(method20053, 3, 39, false)) {
                        return ItemStack.field34174;
                    }
                }
                else {
                    if (!this.method10888(method20053, 3, 39, true)) {
                        return ItemStack.field34174;
                    }
                    class514.method20049(method20053, class513);
                }
                if (!method20053.method27620()) {
                    class514.method20056();
                }
                else {
                    class514.method20055(ItemStack.field34174);
                }
                if (method20053.method27690() == class513.method27690()) {
                    return ItemStack.field34174;
                }
                class514.method20047(class512, method20053);
            }
        }
        return class513;
    }
    
    public void method10997(final String field16258) {
        this.field16258 = field16258;
        if (this.method10878(2).method20054()) {
            final ItemStack method20053 = this.method10878(2).method20053();
            if (!StringUtils.isBlank((CharSequence)field16258)) {
                method20053.method27665(new Class2260(this.field16258));
            }
            else {
                method20053.method27666();
            }
        }
        this.method10995();
    }
    
    public int method10998() {
        return this.field16255.method19832();
    }
    
    static {
        field16252 = LogManager.getLogger();
    }
}
