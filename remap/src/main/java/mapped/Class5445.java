// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.Lists;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class5445 extends Class5419<Class824>
{
    private static String[] field22666;
    private BlockPos field22667;
    private boolean field22668;
    private boolean field22669;
    private long field22670;
    private int field22671;
    private final List<BlockPos> field22672;
    
    public Class5445() {
        super((Map)ImmutableMap.of((Object)Class8233.field33810, (Object)Class1952.field10629, (Object)Class8233.field33809, (Object)Class1952.field10629, (Object)Class8233.field33803, (Object)Class1952.field10628));
        this.field22672 = Lists.newArrayList();
    }
    
    public boolean method16559(final Class1849 class1849, final Class824 class1850) {
        if (!class1849.method6765().method31216(Class8878.field37316)) {
            return false;
        }
        if (class1850.method4870().method28781() == Class9334.field40065) {
            this.field22668 = class1850.method4888();
            this.field22669 = false;
            final Class443 method4837 = class1850.method4837();
            for (int method4838 = method4837.method2239(), i = 0; i < method4838; ++i) {
                final ItemStack method4839 = method4837.method2157(i);
                if (method4839.method27620()) {
                    this.field22669 = true;
                    break;
                }
                if (method4839.getItem() == Items.field31314 || method4839.getItem() == Items.field31576) {
                    this.field22669 = true;
                    break;
                }
            }
            final Mutable class1851 = new Mutable(class1850);
            this.field22672.clear();
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    for (int l = -1; l <= 1; ++l) {
                        class1851.method1286(class1850.getPosX() + j, class1850.getPosY() + k, class1850.getPosZ() + l);
                        if (this.method16632(class1851, class1849)) {
                            this.field22672.add(new BlockPos(class1851));
                        }
                    }
                }
            }
            this.field22667 = this.method16631(class1849);
            if (this.field22668 || this.field22669) {
                if (this.field22667 != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Nullable
    private BlockPos method16631(final Class1849 class1849) {
        return this.field22672.isEmpty() ? null : this.field22672.get(class1849.method6790().nextInt(this.field22672.size()));
    }
    
    private boolean method16632(final BlockPos class354, final Class1849 class355) {
        final BlockState method6701 = class355.method6701(class354);
        final Class3833 method6702 = method6701.method21696();
        final Class3833 method6703 = class355.method6701(class354.method1139()).method21696();
        if (method6702 instanceof Class3878) {
            if (((Class3878)method6702).method11956(method6701)) {
                if (this.field22669) {
                    return true;
                }
            }
        }
        if (method6701.method21706()) {
            if (method6703 instanceof Class4021) {
                if (this.field22668) {
                    return true;
                }
            }
        }
        return false;
        b = true;
        return b;
    }
    
    public void method16561(final Class1849 class1849, final Class824 class1850, final long n) {
        if (n > this.field22670) {
            if (this.field22667 != null) {
                class1850.method2618().method1196((Class8233<Class6439>)Class8233.field33810, new Class6439(this.field22667));
                class1850.method2618().method1196(Class8233.field33809, new Class6949(new Class6439(this.field22667), 0.5f, 1));
            }
        }
    }
    
    public void method16563(final Class1849 class1849, final Class824 class1850, final long n) {
        class1850.method2618().method1195(Class8233.field33810);
        class1850.method2618().method1195(Class8233.field33809);
        this.field22671 = 0;
        this.field22670 = n + 40L;
    }
    
    public void method16562(final Class1849 class1849, final Class824 class1850, final long n) {
        if (this.field22667 != null) {
            if (n > this.field22670) {
                final BlockState method6701 = class1849.method6701(this.field22667);
                final Class3833 method6702 = method6701.method21696();
                final Class3833 method6703 = class1849.method6701(this.field22667.method1139()).method21696();
                if (method6702 instanceof Class3878) {
                    if (((Class3878)method6702).method11956(method6701)) {
                        if (this.field22669) {
                            class1849.method6691(this.field22667, true, class1850);
                        }
                    }
                }
                if (method6701.method21706()) {
                    if (method6703 instanceof Class4021) {
                        if (this.field22668) {
                            final Class443 method6704 = class1850.method4837();
                            int i = 0;
                            while (i < method6704.method2239()) {
                                final ItemStack method6705 = method6704.method2157(i);
                                int n2 = 0;
                                if (!method6705.method27620()) {
                                    if (method6705.getItem() != Items.field31314) {
                                        if (method6705.getItem() != Items.field31518) {
                                            if (method6705.getItem() != Items.field31517) {
                                                if (method6705.getItem() == Items.field31576) {
                                                    class1849.method6688(this.field22667, Class7521.field29636.method11878(), 3);
                                                    n2 = 1;
                                                }
                                            }
                                            else {
                                                class1849.method6688(this.field22667, Class7521.field29445.method11878(), 3);
                                                n2 = 1;
                                            }
                                        }
                                        else {
                                            class1849.method6688(this.field22667, Class7521.field29446.method11878(), 3);
                                            n2 = 1;
                                        }
                                    }
                                    else {
                                        class1849.method6688(this.field22667, Class7521.field29297.method11878(), 3);
                                        n2 = 1;
                                    }
                                }
                                if (n2 == 0) {
                                    ++i;
                                }
                                else {
                                    class1849.method6706(null, this.field22667.getX(), this.field22667.getY(), this.field22667.getZ(), Class8520.field35104, Class286.field1582, 1.0f, 1.0f);
                                    method6705.method27693(1);
                                    if (!method6705.method27620()) {
                                        break;
                                    }
                                    method6704.method2160(i, ItemStack.field34174);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (method6702 instanceof Class3878) {
                    if (!((Class3878)method6702).method11956(method6701)) {
                        this.field22672.remove(this.field22667);
                        this.field22667 = this.method16631(class1849);
                        if (this.field22667 != null) {
                            this.field22670 = n + 20L;
                            class1850.method2618().method1196(Class8233.field33809, new Class6949(new Class6439(this.field22667), 0.5f, 1));
                            class1850.method2618().method1196((Class8233<Class6439>)Class8233.field33810, new Class6439(this.field22667));
                        }
                    }
                }
            }
        }
        ++this.field22671;
    }
    
    public boolean method16560(final Class1849 class1849, final Class824 class1850, final long n) {
        return this.field22671 < 200;
    }
}
