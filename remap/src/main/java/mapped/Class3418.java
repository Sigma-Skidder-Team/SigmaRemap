// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Set;
import java.util.List;

public abstract class Class3418
{
    private final NonNullList<ItemStack> field16150;
    public final List<Class6601> field16151;
    private final List<Class6546> field16152;
    private final Class8471<?> field16153;
    public final int field16154;
    private short field16155;
    private int field16156;
    private int field16157;
    private final Set<Class6601> field16158;
    private final List<Class514> field16159;
    private final Set<PlayerEntity> field16160;
    
    public Class3418(final Class8471<?> field16153, final int field16154) {
        this.field16150 = NonNullList.create();
        this.field16151 = Lists.newArrayList();
        this.field16152 = Lists.newArrayList();
        this.field16156 = -1;
        this.field16158 = Sets.newHashSet();
        this.field16159 = Lists.newArrayList();
        this.field16160 = Sets.newHashSet();
        this.field16153 = field16153;
        this.field16154 = field16154;
    }
    
    public static boolean method10866(final Class7318 class7318, final PlayerEntity class7319, final Block class7320) {
        return class7318.method22436((class7325, class7326) -> class7325.getBlockState(class7326).method21696() == class7321 && class7323.method1733(class7326.getX() + 0.5, class7326.getY() + 0.5, class7326.getZ() + 0.5) <= 64.0, Boolean.valueOf(true));
    }
    
    public Class8471<?> method10867() {
        if (this.field16153 != null) {
            return this.field16153;
        }
        throw new UnsupportedOperationException("Unable to construct this menu by type");
    }
    
    public static void method10868(final IInventory class446, final int i) {
        final int method2239 = class446.getSizeInventory();
        if (method2239 >= i) {
            return;
        }
        throw new IllegalArgumentException("Container size " + method2239 + " is smaller than expected " + i);
    }
    
    public static void method10869(final Class7604 class7604, final int i) {
        final int method23904 = class7604.method23904();
        if (method23904 >= i) {
            return;
        }
        throw new IllegalArgumentException("Container data count " + method23904 + " is smaller than expected " + i);
    }
    
    public Class6601 method10870(final Class6601 class6601) {
        class6601.field26174 = this.field16151.size();
        this.field16151.add(class6601);
        this.field16150.add(ItemStack.EMPTY);
        return class6601;
    }
    
    public Class6546 method10871(final Class6546 class6546) {
        this.field16152.add(class6546);
        return class6546;
    }
    
    public void method10872(final Class7604 class7604) {
        for (int i = 0; i < class7604.method23904(); ++i) {
            this.method10871(Class6546.method19834(class7604, i));
        }
    }
    
    public void method10873(final Class514 class514) {
        if (!this.field16159.contains(class514)) {
            this.field16159.add(class514);
            class514.method2930(this, this.method10875());
            this.method10876();
        }
    }
    
    public void method10874(final Class514 class514) {
        this.field16159.remove(class514);
    }
    
    public NonNullList<ItemStack> method10875() {
        final NonNullList<Object> method8506 = NonNullList.create();
        for (int i = 0; i < this.field16151.size(); ++i) {
            method8506.add(this.field16151.get(i).method20053());
        }
        return (NonNullList<ItemStack>)method8506;
    }
    
    public void method10876() {
        for (int i = 0; i < this.field16151.size(); ++i) {
            final ItemStack method20053 = this.field16151.get(i).method20053();
            if (!ItemStack.method27643(this.field16150.get(i), method20053)) {
                final ItemStack method20054 = method20053.method27641();
                this.field16150.set(i, method20054);
                final Iterator<Class514> iterator = this.field16159.iterator();
                while (iterator.hasNext()) {
                    iterator.next().method2928(this, i, method20054);
                }
            }
        }
        for (int j = 0; j < this.field16152.size(); ++j) {
            final Class6546 class6546 = this.field16152.get(j);
            if (class6546.method19837()) {
                final Iterator<Class514> iterator2 = this.field16159.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().method2931(this, j, class6546.method19832());
                }
            }
        }
    }
    
    public boolean method10877(final PlayerEntity playerEntity, final int n) {
        return false;
    }
    
    public Class6601 getSlot(final int n) {
        return this.field16151.get(n);
    }
    
    public ItemStack method10858(final PlayerEntity playerEntity, final int n) {
        final Class6601 class513 = this.field16151.get(n);
        return (class513 == null) ? ItemStack.EMPTY : class513.method20053();
    }
    
    public ItemStack method10879(final int n, final int n2, final Class2133 class2133, final PlayerEntity class2134) {
        ItemStack class2135 = ItemStack.EMPTY;
        final Class464 field3006 = class2134.inventory;
        if (class2133 != Class2133.field12442) {
            if (this.field16157 == 0) {
                if ((class2133 == Class2133.field12437 || class2133 == Class2133.field12438) && (n2 == 0 || n2 == 1)) {
                    if (n != -999) {
                        if (class2133 != Class2133.field12438) {
                            if (n < 0) {
                                return ItemStack.EMPTY;
                            }
                            final Class6601 class2136 = this.field16151.get(n);
                            if (class2136 != null) {
                                final ItemStack method20053 = class2136.method20053();
                                final ItemStack method20054 = field3006.method2375();
                                if (!method20053.method27620()) {
                                    class2135 = method20053.method27641();
                                }
                                if (!method20053.method27620()) {
                                    if (class2136.method20061(class2134)) {
                                        if (!method20054.method27620()) {
                                            if (!class2136.method20046(method20054)) {
                                                if (method20054.method27628() > 1) {
                                                    if (method10880(method20053, method20054)) {
                                                        if (!method20053.method27620()) {
                                                            final int method20055 = method20053.method27690();
                                                            if (method20055 + method20054.method27690() <= method20054.method27628()) {
                                                                method20054.method27692(method20055);
                                                                if (class2136.method20060(method20055).method27620()) {
                                                                    class2136.method20055(ItemStack.EMPTY);
                                                                }
                                                                class2136.method20047(class2134, field3006.method2375());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else if (!method10880(method20053, method20054)) {
                                                if (method20054.method27690() <= class2136.method20058(method20054)) {
                                                    class2136.method20055(method20054);
                                                    field3006.method2374(method20053);
                                                }
                                            }
                                            else {
                                                int n3 = (n2 != 0) ? 1 : method20054.method27690();
                                                if (n3 > class2136.method20058(method20054) - method20053.method27690()) {
                                                    n3 = class2136.method20058(method20054) - method20053.method27690();
                                                }
                                                if (n3 > method20054.method27628() - method20053.method27690()) {
                                                    n3 = method20054.method27628() - method20053.method27690();
                                                }
                                                method20054.method27693(n3);
                                                method20053.method27692(n3);
                                            }
                                        }
                                        else if (!method20053.method27620()) {
                                            field3006.method2374(class2136.method20060((n2 != 0) ? ((method20053.method27690() + 1) / 2) : method20053.method27690()));
                                            if (method20053.method27620()) {
                                                class2136.method20055(ItemStack.EMPTY);
                                            }
                                            class2136.method20047(class2134, field3006.method2375());
                                        }
                                        else {
                                            class2136.method20055(ItemStack.EMPTY);
                                            field3006.method2374(ItemStack.EMPTY);
                                        }
                                    }
                                }
                                else if (!method20054.method27620()) {
                                    if (class2136.method20046(method20054)) {
                                        int method20056 = (n2 != 0) ? 1 : method20054.method27690();
                                        if (method20056 > class2136.method20058(method20054)) {
                                            method20056 = class2136.method20058(method20054);
                                        }
                                        class2136.method20055(method20054.method27621(method20056));
                                    }
                                }
                                class2136.method20056();
                            }
                        }
                        else {
                            if (n < 0) {
                                return ItemStack.EMPTY;
                            }
                            final Class6601 class2137 = this.field16151.get(n);
                            if (class2137 == null || !class2137.method20061(class2134)) {
                                return ItemStack.EMPTY;
                            }
                            for (ItemStack class2138 = this.method10858(class2134, n); !class2138.method27620() && ItemStack.method27645(class2137.method20053(), class2138); class2138 = this.method10858(class2134, n)) {
                                class2135 = class2138.method27641();
                            }
                        }
                    }
                    else if (!field3006.method2375().method27620()) {
                        if (n2 == 0) {
                            class2134.method2822(field3006.method2375(), true);
                            field3006.method2374(ItemStack.EMPTY);
                        }
                        if (n2 == 1) {
                            class2134.method2822(field3006.method2375().method27621(1), true);
                        }
                    }
                }
                else {
                    if (class2133 == Class2133.field12439) {
                        if (n2 >= 0) {
                            if (n2 < 9) {
                                final Class6601 class2139 = this.field16151.get(n);
                                final ItemStack method20057 = field3006.getStackInSlot(n2);
                                final ItemStack method20058 = class2139.method20053();
                                if (!method20057.method27620() || !method20058.method27620()) {
                                    if (!method20057.method27620()) {
                                        if (!method20058.method27620()) {
                                            if (class2139.method20061(class2134)) {
                                                if (class2139.method20046(method20057)) {
                                                    final int method20059 = class2139.method20058(method20057);
                                                    if (method20057.method27690() <= method20059) {
                                                        class2139.method20055(method20057);
                                                        field3006.method2160(n2, method20058);
                                                        class2139.method20047(class2134, method20058);
                                                    }
                                                    else {
                                                        class2139.method20055(method20057.method27621(method20059));
                                                        class2139.method20047(class2134, method20058);
                                                        if (!field3006.method2362(method20058)) {
                                                            class2134.method2822(method20058, true);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else if (class2139.method20046(method20057)) {
                                            final int method20060 = class2139.method20058(method20057);
                                            if (method20057.method27690() <= method20060) {
                                                class2139.method20055(method20057);
                                                field3006.method2160(n2, ItemStack.EMPTY);
                                            }
                                            else {
                                                class2139.method20055(method20057.method27621(method20060));
                                            }
                                        }
                                    }
                                    else if (class2139.method20061(class2134)) {
                                        field3006.method2160(n2, method20058);
                                        class2139.method20051(method20058.method27690());
                                        class2139.method20055(ItemStack.EMPTY);
                                        class2139.method20047(class2134, method20058);
                                    }
                                }
                                return class2135;
                            }
                        }
                    }
                    if (class2133 == Class2133.field12440) {
                        if (class2134.field3025.field27304) {
                            if (field3006.method2375().method27620()) {
                                if (n >= 0) {
                                    final Class6601 class2140 = this.field16151.get(n);
                                    if (class2140 != null) {
                                        if (class2140.method20054()) {
                                            final ItemStack method20061 = class2140.method20053().method27641();
                                            method20061.method27691(method20061.method27628());
                                            field3006.method2374(method20061);
                                        }
                                    }
                                    return class2135;
                                }
                            }
                        }
                    }
                    if (class2133 == Class2133.field12441) {
                        if (field3006.method2375().method27620()) {
                            if (n >= 0) {
                                final Class6601 class2141 = this.field16151.get(n);
                                if (class2141 != null) {
                                    if (class2141.method20054()) {
                                        if (class2141.method20061(class2134)) {
                                            final ItemStack method20062 = class2141.method20060((n2 != 0) ? class2141.method20053().method27690() : 1);
                                            class2141.method20047(class2134, method20062);
                                            class2134.method2822(method20062, true);
                                        }
                                    }
                                }
                                return class2135;
                            }
                        }
                    }
                    if (class2133 == Class2133.field12443) {
                        if (n >= 0) {
                            final Class6601 class2142 = this.field16151.get(n);
                            final ItemStack method20063 = field3006.method2375();
                            Label_2025: {
                                if (!method20063.method27620()) {
                                    if (class2142 != null) {
                                        if (class2142.method20054()) {
                                            if (class2142.method20061(class2134)) {
                                                break Label_2025;
                                            }
                                        }
                                    }
                                    final int n4 = (n2 != 0) ? (this.field16151.size() - 1) : 0;
                                    final int n5 = (n2 != 0) ? -1 : 1;
                                    for (int i = 0; i < 2; ++i) {
                                        for (int j = n4; j >= 0; j += n5) {
                                            if (j >= this.field16151.size()) {
                                                break;
                                            }
                                            if (method20063.method27690() >= method20063.method27628()) {
                                                break;
                                            }
                                            final Class6601 class2143 = this.field16151.get(j);
                                            if (class2143.method20054()) {
                                                if (method10894(class2143, method20063, true)) {
                                                    if (class2143.method20061(class2134)) {
                                                        if (this.method10857(method20063, class2143)) {
                                                            final ItemStack method20064 = class2143.method20053();
                                                            if (i != 0 || method20064.method27690() != method20064.method27628()) {
                                                                final int min = Math.min(method20063.method27628() - method20063.method27690(), method20064.method27690());
                                                                final ItemStack method20065 = class2143.method20060(min);
                                                                method20063.method27692(min);
                                                                if (method20065.method27620()) {
                                                                    class2143.method20055(ItemStack.EMPTY);
                                                                }
                                                                class2143.method20047(class2134, method20065);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.method10876();
                        }
                    }
                }
            }
            else {
                this.method10893();
            }
        }
        else {
            final int field3007 = this.field16157;
            this.field16157 = method10890(n2);
            if (field3007 != 1 || this.field16157 != 2) {
                if (field3007 != this.field16157) {
                    this.method10893();
                    return class2135;
                }
            }
            if (!field3006.method2375().method27620()) {
                if (this.field16157 != 0) {
                    if (this.field16157 != 1) {
                        if (this.field16157 != 2) {
                            this.method10893();
                        }
                        else {
                            if (!this.field16158.isEmpty()) {
                                final ItemStack method20066 = field3006.method2375().method27641();
                                int method20067 = field3006.method2375().method27690();
                                for (final Class6601 class2144 : this.field16158) {
                                    final ItemStack method20068 = field3006.method2375();
                                    if (class2144 == null) {
                                        continue;
                                    }
                                    if (!method10894(class2144, method20068, true)) {
                                        continue;
                                    }
                                    if (!class2144.method20046(method20068)) {
                                        continue;
                                    }
                                    if (this.field16156 != 2 && method20068.method27690() < this.field16158.size()) {
                                        continue;
                                    }
                                    if (!this.method10896(class2144)) {
                                        continue;
                                    }
                                    final ItemStack method20069 = method20066.method27641();
                                    final int n6 = class2144.method20054() ? class2144.method20053().method27690() : 0;
                                    method10895(this.field16158, this.field16156, method20069, n6);
                                    final int min2 = Math.min(method20069.method27628(), class2144.method20058(method20069));
                                    if (method20069.method27690() > min2) {
                                        method20069.method27691(min2);
                                    }
                                    method20067 -= method20069.method27690() - n6;
                                    class2144.method20055(method20069);
                                }
                                method20066.method27691(method20067);
                                field3006.method2374(method20066);
                            }
                            this.method10893();
                        }
                    }
                    else {
                        final Class6601 class2145 = this.field16151.get(n);
                        final ItemStack method20070 = field3006.method2375();
                        if (class2145 != null) {
                            if (method10894(class2145, method20070, true)) {
                                if (class2145.method20046(method20070)) {
                                    if (this.field16156 == 2 || method20070.method27690() > this.field16158.size()) {
                                        if (this.method10896(class2145)) {
                                            this.field16158.add(class2145);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    this.field16156 = method10889(n2);
                    if (!method10892(this.field16156, class2134)) {
                        this.method10893();
                    }
                    else {
                        this.field16157 = 1;
                        this.field16158.clear();
                    }
                }
            }
            else {
                this.method10893();
            }
        }
        return class2135;
    }
    
    public static boolean method10880(final ItemStack class8321, final ItemStack class8322) {
        return class8321.getItem() == class8322.getItem() && ItemStack.method27642(class8321, class8322);
    }
    
    public boolean method10857(final ItemStack class8321, final Class6601 class8322) {
        return true;
    }
    
    public void method10859(final PlayerEntity playerEntity) {
        final Class464 field3006 = playerEntity.inventory;
        if (!field3006.method2375().method27620()) {
            playerEntity.method2822(field3006.method2375(), false);
            field3006.method2374(ItemStack.EMPTY);
        }
    }
    
    public void method10881(final PlayerEntity playerEntity, final World class513, final IInventory class514) {
        if (playerEntity.method1768() && (playerEntity instanceof Class513 && ((Class513) playerEntity).method2936())) {
            for (int i = 0; i < class514.getSizeInventory(); ++i) {
                playerEntity.inventory.method2364(class513, class514.method2159(i));
            }
        }
        else {
            for (int j = 0; j < class514.getSizeInventory(); ++j) {
                playerEntity.method2822(class514.method2159(j), false);
            }
        }
    }
    
    public void method10855(final IInventory class446) {
        this.method10876();
    }
    
    public void method10882(final int n, final ItemStack class8321) {
        this.getSlot(n).method20055(class8321);
    }
    
    public void method10883(final List<ItemStack> list) {
        for (int i = 0; i < list.size(); ++i) {
            this.getSlot(i).method20055((ItemStack)list.get(i));
        }
    }
    
    public void method10884(final int n, final int n2) {
        this.field16152.get(n).method19833(n2);
    }
    
    public short method10885(final Class464 class464) {
        return (short)(++this.field16155);
    }
    
    public boolean method10886(final PlayerEntity playerEntity) {
        return !this.field16160.contains(playerEntity);
    }
    
    public void method10887(final PlayerEntity playerEntity, final boolean b) {
        if (!b) {
            this.field16160.add(playerEntity);
        }
        else {
            this.field16160.remove(playerEntity);
        }
    }
    
    public abstract boolean method10854(final PlayerEntity p0);
    
    public boolean method10888(final ItemStack class8321, final int n, final int n2, final boolean b) {
        boolean b2 = false;
        int n3 = n;
        if (b) {
            n3 = n2 - 1;
        }
        if (class8321.method27629()) {
            while (!class8321.method27620()) {
                if (!b) {
                    if (n3 >= n2) {
                        break;
                    }
                }
                else if (n3 < n) {
                    break;
                }
                final Class6601 class8322 = this.field16151.get(n3);
                final ItemStack method20053 = class8322.method20053();
                if (!method20053.method27620()) {
                    if (method10880(class8321, method20053)) {
                        final int n4 = method20053.method27690() + class8321.method27690();
                        if (n4 > class8321.method27628()) {
                            if (method20053.method27690() < class8321.method27628()) {
                                class8321.method27693(class8321.method27628() - method20053.method27690());
                                method20053.method27691(class8321.method27628());
                                class8322.method20056();
                                b2 = true;
                            }
                        }
                        else {
                            class8321.method27691(0);
                            method20053.method27691(n4);
                            class8322.method20056();
                            b2 = true;
                        }
                    }
                }
                if (!b) {
                    ++n3;
                }
                else {
                    --n3;
                }
            }
        }
        if (!class8321.method27620()) {
            int n5;
            if (!b) {
                n5 = n;
            }
            else {
                n5 = n2 - 1;
            }
            while (true) {
                if (!b) {
                    if (n5 >= n2) {
                        break;
                    }
                }
                else if (n5 < n) {
                    break;
                }
                final Class6601 class8323 = this.field16151.get(n5);
                if (class8323.method20053().method27620() && class8323.method20046(class8321)) {
                    if (class8321.method27690() <= class8323.method20057()) {
                        class8323.method20055(class8321.method27621(class8321.method27690()));
                    }
                    else {
                        class8323.method20055(class8321.method27621(class8323.method20057()));
                    }
                    class8323.method20056();
                    b2 = true;
                    break;
                }
                if (!b) {
                    ++n5;
                }
                else {
                    --n5;
                }
            }
        }
        return b2;
    }
    
    public static int method10889(final int n) {
        return n >> 2 & 0x3;
    }
    
    public static int method10890(final int n) {
        return n & 0x3;
    }
    
    public static int method10891(final int n, final int n2) {
        return (n & 0x3) | (n2 & 0x3) << 2;
    }
    
    public static boolean method10892(final int n, final PlayerEntity playerEntity) {
        return n == 0 || n == 1 || (n == 2 && playerEntity.field3025.field27304);
    }
    
    public void method10893() {
        this.field16157 = 0;
        this.field16158.clear();
    }
    
    public static boolean method10894(final Class6601 class6601, final ItemStack class6602, final boolean b) {
        final boolean b2 = class6601 == null || !class6601.method20054();
        if (!b2) {
            if (class6602.method27647(class6601.method20053())) {
                if (ItemStack.method27642(class6601.method20053(), class6602)) {
                    return class6601.method20053().method27690() + (b ? 0 : class6602.method27690()) <= class6602.method27628();
                }
            }
        }
        return b2;
    }
    
    public static void method10895(final Set<Class6601> set, final int n, final ItemStack class8321, final int n2) {
        switch (n) {
            case 0: {
                class8321.method27691(MathHelper.method35642(class8321.method27690() / (float)set.size()));
                break;
            }
            case 1: {
                class8321.method27691(1);
                break;
            }
            case 2: {
                class8321.method27691(class8321.getItem().method11708());
                break;
            }
        }
        class8321.method27692(n2);
    }
    
    public boolean method10896(final Class6601 class6601) {
        return true;
    }
    
    public static int method10897(final TileEntity tileEntity) {
        return (tileEntity instanceof IInventory) ? method10898((IInventory) tileEntity) : 0;
    }
    
    public static int method10898(final IInventory class446) {
        if (class446 != null) {
            int n = 0;
            float n2 = 0.0f;
            for (int i = 0; i < class446.getSizeInventory(); ++i) {
                final ItemStack method2157 = class446.getStackInSlot(i);
                if (!method2157.method27620()) {
                    n2 += method2157.method27690() / (float)Math.min(class446.method2254(), method2157.method27628());
                    ++n;
                }
            }
            return MathHelper.method35642(n2 / class446.getSizeInventory() * 14.0f) + ((n > 0) ? 1 : 0);
        }
        return 0;
    }
}
