// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.util.Direction;

import java.util.List;

public class Class9236
{
    private static String[] field39590;
    private final Class1847 field39591;
    private final BlockPos field39592;
    private final boolean field39593;
    private final BlockPos field39594;
    private final Direction field39595;
    private final List<BlockPos> field39596;
    private final List<BlockPos> field39597;
    private final Direction field39598;
    
    public Class9236(final Class1847 field39591, final BlockPos field39592, final Direction class179, final boolean field39593) {
        this.field39596 = Lists.newArrayList();
        this.field39597 = Lists.newArrayList();
        this.field39591 = field39591;
        this.field39592 = field39592;
        this.field39598 = class179;
        if (!(this.field39593 = field39593)) {
            this.field39595 = class179.getOpposite();
            this.field39594 = field39592.method1150(class179, 2);
        }
        else {
            this.field39595 = class179;
            this.field39594 = field39592.method1149(class179);
        }
    }
    
    public boolean method34052() {
        this.field39596.clear();
        this.field39597.clear();
        final Class7096 method6701 = this.field39591.method6701(this.field39594);
        if (Class3836.method11894(method6701, this.field39591, this.field39594, this.field39595, false, this.field39598)) {
            if (this.method34055(this.field39594, this.field39595)) {
                for (int i = 0; i < this.field39596.size(); ++i) {
                    final BlockPos class354 = this.field39596.get(i);
                    if (method34053(this.field39591.method6701(class354).method21696()) && !this.method34057(class354)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        else {
            if (this.field39593 && method6701.method21721() == Class2117.field12341) {
                this.field39597.add(this.field39594);
                return true;
            }
            return false;
        }
    }
    
    private static boolean method34053(final Class3833 class3833) {
        return class3833 == Class7521.field29516 || class3833 == Class7521.field29825;
    }
    
    private static boolean method34054(final Class3833 class3833, final Class3833 class3834) {
        return (class3833 != Class7521.field29825 || class3834 != Class7521.field29516) && (class3833 != Class7521.field29516 || class3834 != Class7521.field29825) && (method34053(class3833) || method34053(class3834));
    }
    
    private boolean method34055(final BlockPos class354, final Direction class355) {
        final Class7096 method6701 = this.field39591.method6701(class354);
        Class3833 class356 = method6701.method21696();
        if (method6701.method21706()) {
            return true;
        }
        if (!Class3836.method11894(method6701, this.field39591, class354, this.field39595, false, class355)) {
            return true;
        }
        if (class354.equals(this.field39592)) {
            return true;
        }
        if (this.field39596.contains(class354)) {
            return true;
        }
        int n = 1;
        if (n + this.field39596.size() > 12) {
            return false;
        }
        while (method34053(class356)) {
            final BlockPos method6702 = class354.method1150(this.field39595.getOpposite(), n);
            final Class3833 class357 = class356;
            final Class7096 method6703 = this.field39591.method6701(method6702);
            class356 = method6703.method21696();
            if (method6703.method21706()) {
                break;
            }
            if (!method34054(class357, class356)) {
                break;
            }
            if (!Class3836.method11894(method6703, this.field39591, method6702, this.field39595, false, this.field39595.getOpposite())) {
                break;
            }
            if (method6702.equals(this.field39592)) {
                break;
            }
            if (++n + this.field39596.size() <= 12) {
                continue;
            }
            return false;
        }
        int n2 = 0;
        for (int i = n - 1; i >= 0; --i) {
            this.field39596.add(class354.method1150(this.field39595.getOpposite(), i));
            ++n2;
        }
        int n3 = 1;
        while (true) {
            final BlockPos method6704 = class354.method1150(this.field39595, n3);
            final int index = this.field39596.indexOf(method6704);
            if (index > -1) {
                this.method34056(n2, index);
                for (int j = 0; j <= index + n2; ++j) {
                    final BlockPos class358 = this.field39596.get(j);
                    if (method34053(this.field39591.method6701(class358).method21696()) && !this.method34057(class358)) {
                        return false;
                    }
                }
                return true;
            }
            final Class7096 method6705 = this.field39591.method6701(method6704);
            if (method6705.method21706()) {
                return true;
            }
            if (!Class3836.method11894(method6705, this.field39591, method6704, this.field39595, true, this.field39595) || method6704.equals(this.field39592)) {
                return false;
            }
            if (method6705.method21721() == Class2117.field12341) {
                this.field39597.add(method6704);
                return true;
            }
            if (this.field39596.size() >= 12) {
                return false;
            }
            this.field39596.add(method6704);
            ++n2;
            ++n3;
        }
    }
    
    private void method34056(final int n, final int n2) {
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.field39596.subList(0, n2));
        arrayList2.addAll(this.field39596.subList(this.field39596.size() - n, this.field39596.size()));
        arrayList3.addAll(this.field39596.subList(n2, this.field39596.size() - n));
        this.field39596.clear();
        this.field39596.addAll(arrayList);
        this.field39596.addAll(arrayList2);
        this.field39596.addAll(arrayList3);
    }
    
    private boolean method34057(final BlockPos class354) {
        final Class7096 method6701 = this.field39591.method6701(class354);
        for (final Direction class355 : Direction.values()) {
            if (class355.getAxis() != this.field39595.getAxis()) {
                final BlockPos method6702 = class354.method1149(class355);
                if (method34054(this.field39591.method6701(method6702).method21696(), method6701.method21696())) {
                    if (!this.method34055(method6702, class355)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public List<BlockPos> method34058() {
        return this.field39596;
    }
    
    public List<BlockPos> method34059() {
        return this.field39597;
    }
}
