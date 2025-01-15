// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.util.math.MathHelper;
import org.apache.commons.lang3.mutable.MutableInt;
import com.google.common.collect.Lists;
import java.util.function.Consumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Class9320
{
    private final Class6368[] field40020;
    private final Class122[] field40021;
    private final Predicate<Class7529> field40022;
    private final Class125[] field40023;
    private final BiFunction<Class8321, Class7529, Class8321> field40024;
    private final Class5770 field40025;
    private final Class5772 field40026;
    
    private Class9320(final Class6368[] field40020, final Class122[] field40021, final Class125[] field40022, final Class5770 field40023, final Class5772 field40024) {
        this.field40020 = field40020;
        this.field40021 = field40021;
        this.field40022 = Class7454.method22943((Predicate<Class7529>[])field40021);
        this.field40023 = field40022;
        this.field40024 = Class7463.method22991(field40022);
        this.field40025 = field40023;
        this.field40026 = field40024;
    }
    
    private void method34511(final Consumer<Class8321> consumer, final Class7529 class7529) {
        final Random method23586 = class7529.method23586();
        final ArrayList arrayList = Lists.newArrayList();
        final MutableInt mutableInt = new MutableInt();
        final Class6368[] field40020 = this.field40020;
        for (int length = field40020.length, i = 0; i < length; ++i) {
            field40020[i].method19016(class7529, class7532 -> {
                class7532.method21975(class7531.method23587());
                final int n;
                if (n > 0) {
                    list.add(class7532);
                    mutableInt2.add(n);
                }
                return;
            });
        }
        final int size = arrayList.size();
        if (mutableInt.intValue() != 0) {
            if (size != 0) {
                if (size != 1) {
                    int nextInt = method23586.nextInt(mutableInt.intValue());
                    for (final Class7182 class7530 : arrayList) {
                        nextInt -= class7530.method21975(class7529.method23587());
                        if (nextInt >= 0) {
                            continue;
                        }
                        class7530.method21974(consumer, class7529);
                    }
                }
                else {
                    ((Class7182)arrayList.get(0)).method21974(consumer, class7529);
                }
            }
        }
    }
    
    public void method34512(final Consumer<Class8321> consumer, final Class7529 class7529) {
        if (this.field40022.test(class7529)) {
            final Consumer<Class8321> method637 = Class125.method637(this.field40024, consumer, class7529);
            final Random method638 = class7529.method23586();
            for (int n = this.field40025.method17159(method638) + MathHelper.method35642(this.field40026.method17169(method638) * class7529.method23587()), i = 0; i < n; ++i) {
                this.method34511(method637, class7529);
            }
        }
    }
    
    public void method34513(final Class7790 class7790) {
        for (int i = 0; i < this.field40021.length; ++i) {
            this.field40021[i].method636(class7790.method25015(".condition[" + i + "]"));
        }
        for (int j = 0; j < this.field40023.length; ++j) {
            this.field40023[j].method636(class7790.method25015(".functions[" + j + "]"));
        }
        for (int k = 0; k < this.field40020.length; ++k) {
            this.field40020[k].method19015(class7790.method25015(".entries[" + k + "]"));
        }
    }
    
    public static Class4945 method34514() {
        return new Class4945();
    }
}
