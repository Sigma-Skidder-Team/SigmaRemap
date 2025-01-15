// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class Class3433 extends Class3418
{
    private static String[] field16216;
    private final Class446 field16217;
    private final Class7318 field16218;
    private final Random field16219;
    private final Class6546 field16220;
    public final int[] field16221;
    public final int[] field16222;
    public final int[] field16223;
    
    public Class3433(final int n, final Class464 class464) {
        this(n, class464, Class7318.field28308);
    }
    
    public Class3433(final int n, final Class464 class464, final Class7318 field16218) {
        super(Class8471.field34767, n);
        this.field16217 = new Class444(this, 2);
        this.field16219 = new Random();
        this.field16220 = Class6546.method19836();
        this.field16221 = new int[3];
        this.field16222 = new int[] { -1, -1, -1 };
        this.field16223 = new int[] { -1, -1, -1 };
        this.field16218 = field16218;
        this.method10870(new Class6624(this, this.field16217, 0, 15, 47));
        this.method10870(new Class6608(this, this.field16217, 1, 35, 47));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.method10870(new Class6601(class464, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.method10870(new Class6601(class464, k, 8 + k * 18, 142));
        }
        this.method10871(Class6546.method19835(this.field16221, 0));
        this.method10871(Class6546.method19835(this.field16221, 1));
        this.method10871(Class6546.method19835(this.field16221, 2));
        this.method10871(this.field16220).method19833(class464.field2744.method2872());
        this.method10871(Class6546.method19835(this.field16222, 0));
        this.method10871(Class6546.method19835(this.field16222, 1));
        this.method10871(Class6546.method19835(this.field16222, 2));
        this.method10871(Class6546.method19835(this.field16223, 0));
        this.method10871(Class6546.method19835(this.field16223, 1));
        this.method10871(Class6546.method19835(this.field16223, 2));
    }
    
    @Override
    public void method10855(final Class446 class446) {
        if (class446 == this.field16217) {
            final ItemStack method2157 = class446.method2157(0);
            if (!method2157.method27620() && method2157.method27673()) {
                this.field16218.method22437((class448, class449) -> {
                    int j = 0;
                    int n = 0;
                    while (j <= 1) {
                        int k = 0;
                        while (k <= 1) {
                            if (j != 0 || k != 0) {
                                if (!(!class448.method6961(class449.add(k, 0, j)))) {
                                    if (!(!class448.method6961(class449.add(k, 1, j)))) {
                                        if (class448.method6701(class449.add(k * 2, 0, j * 2)).method21696() == Class7521.field29284) {
                                            ++n;
                                        }
                                        if (class448.method6701(class449.add(k * 2, 1, j * 2)).method21696() == Class7521.field29284) {
                                            ++n;
                                        }
                                        if (k != 0) {
                                            if (j != 0) {
                                                if (class448.method6701(class449.add(k * 2, 0, j)).method21696() == Class7521.field29284) {
                                                    ++n;
                                                }
                                                if (class448.method6701(class449.add(k * 2, 1, j)).method21696() == Class7521.field29284) {
                                                    ++n;
                                                }
                                                if (class448.method6701(class449.add(k, 0, j * 2)).method21696() == Class7521.field29284) {
                                                    ++n;
                                                }
                                                if (class448.method6701(class449.add(k, 1, j * 2)).method21696() == Class7521.field29284) {
                                                    ++n;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ++k;
                        }
                        ++j;
                    }
                    this.field16219.setSeed(this.field16220.method19832());
                    int l = 0;
                    while (l < 3) {
                        this.field16221[l] = Class8742.method30223(this.field16219, l, n, class447);
                        this.field16222[l] = -1;
                        this.field16223[l] = -1;
                        if (this.field16221[l] < l + 1) {
                            this.field16221[l] = 0;
                        }
                        ++l;
                    }
                    int n2 = 0;
                    while (n2 < 3) {
                        if (this.field16221[n2] > 0) {
                            this.method10951(class447, n2, this.field16221[n2]);
                            final List list;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    final Class6827 class450 = list.get(this.field16219.nextInt(list.size()));
                                    this.field16222[n2] = Class90.field209.method504(class450.field26818);
                                    this.field16223[n2] = class450.field26819;
                                }
                            }
                        }
                        ++n2;
                    }
                    this.method10876();
                });
            }
            else {
                for (int i = 0; i < 3; ++i) {
                    this.field16221[i] = 0;
                    this.field16222[i] = -1;
                    this.field16223[i] = -1;
                }
            }
        }
    }
    
    @Override
    public boolean method10877(final Class512 class512, final int n) {
        final ItemStack method2157 = this.field16217.method2157(0);
        final ItemStack method2158 = this.field16217.method2157(1);
        final int n2 = n + 1;
        if (method2158.method27620() || method2158.method27690() < n2) {
            if (!class512.field3025.field27304) {
                return false;
            }
        }
        if (this.field16221[n] > 0) {
            if (!method2157.method27620()) {
                if (class512.field3026 < n2 || class512.field3026 < this.field16221[n]) {
                    if (!class512.field3025.field27304) {
                        return false;
                    }
                }
                this.field16218.method22437((class516, class517) -> {
                    this.method10951(class513, n3, this.field16221[n3]);
                    final List list;
                    if (!list.isEmpty()) {
                        class514.method2873(class513, n4);
                        final boolean b = class513.method27622() == Class7739.field31370;
                        ItemStack class518 = null;
                        if (!(!b)) {
                            class518 = new ItemStack(Class7739.field31534);
                            this.field16217.method2160(0, class518);
                        }
                        int i = 0;
                        while (i < list.size()) {
                            final Class6827 class519 = list.get(i);
                            if (!b) {
                                class518.method27674(class519.field26818, class519.field26819);
                            }
                            else {
                                Class4034.method12226(class518, class519);
                            }
                            ++i;
                        }
                        if (!class514.field3025.field27304) {
                            class515.method27693(n4);
                            if (!(!class515.method27620())) {
                                this.field16217.method2160(1, ItemStack.field34174);
                            }
                        }
                        class514.method2857(Class8276.field34039);
                        if (!(!(class514 instanceof Class513))) {
                            Class7770.field31783.method13730((Class513)class514, class518, n4);
                        }
                        this.field16217.method2161();
                        this.field16220.method19833(class514.method2872());
                        this.method10855(this.field16217);
                        class516.method6705(null, class517, Class8520.field35150, Class286.field1582, 1.0f, class516.field10062.nextFloat() * 0.1f + 0.9f);
                    }
                    return;
                });
                return true;
            }
        }
        return false;
    }
    
    private List<Class6827> method10951(final ItemStack class8321, final int n, final int n2) {
        this.field16219.setSeed(this.field16220.method19832() + n);
        final List<Class6827> method30225 = Class8742.method30225(this.field16219, class8321, n2, false);
        if (class8321.method27622() == Class7739.field31370) {
            if (method30225.size() > 1) {
                method30225.remove(this.field16219.nextInt(method30225.size()));
            }
        }
        return method30225;
    }
    
    public int method10952() {
        final ItemStack method2157 = this.field16217.method2157(1);
        return method2157.method27620() ? 0 : method2157.method27690();
    }
    
    public int method10953() {
        return this.field16220.method19832();
    }
    
    @Override
    public void method10859(final Class512 class512) {
        super.method10859(class512);
        this.field16218.method22437((p1, p2) -> this.method10881(class513, class513.field2391, this.field16217));
    }
    
    @Override
    public boolean method10854(final Class512 class512) {
        return Class3418.method10866(this.field16218, class512, Class7521.field29398);
    }
    
    @Override
    public ItemStack method10858(final Class512 class512, final int n) {
        ItemStack class513 = ItemStack.field34174;
        final Class6601 class514 = this.field16151.get(n);
        if (class514 != null) {
            if (class514.method20054()) {
                final ItemStack method20053 = class514.method20053();
                class513 = method20053.method27641();
                if (n != 0) {
                    if (n != 1) {
                        if (method20053.method27622() != Class7739.field31389) {
                            if (this.field16151.get(0).method20054() || !this.field16151.get(0).method20046(method20053)) {
                                return ItemStack.field34174;
                            }
                            if (method20053.method27656() && method20053.method27690() == 1) {
                                this.field16151.get(0).method20055(method20053.method27641());
                                method20053.method27691(0);
                            }
                            else if (!method20053.method27620()) {
                                this.field16151.get(0).method20055(new ItemStack(method20053.method27622()));
                                method20053.method27693(1);
                            }
                        }
                        else if (!this.method10888(method20053, 1, 2, true)) {
                            return ItemStack.field34174;
                        }
                    }
                    else if (!this.method10888(method20053, 2, 38, true)) {
                        return ItemStack.field34174;
                    }
                }
                else if (!this.method10888(method20053, 2, 38, true)) {
                    return ItemStack.field34174;
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
}
