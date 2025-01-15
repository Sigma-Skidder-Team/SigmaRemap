// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Random;
import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.List;

public class Class3859 extends Class3833 implements Class3857
{
    private static String[] field17479;
    public static final Class7112 field17480;
    public final Class7257 field17481;
    private final List<Class7099> field17482;
    
    public Class3859(final Class7257 field17481, final Class9288 class9288) {
        super(class9288);
        this.field17481 = field17481;
        (this.field17482 = Lists.newArrayList()).add(field17481.method22177(false));
        for (int i = 1; i < 8; ++i) {
            this.field17482.add(field17481.method22175(8 - i, false));
        }
        this.field17482.add(field17481.method22175(8, true));
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3859.field17480, 0));
    }
    
    @Override
    public void method11821(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        class7097.method6702(class7098).method21789(class7097, class7098, random);
    }
    
    @Override
    public boolean method11818(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return false;
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return !this.field17481.method22166(Class7324.field28320);
    }
    
    @Override
    public Class7099 method11864(final Class7096 class7096) {
        return this.field17482.get(Math.min(class7096.method21772((Class7111<Integer>)Class3859.field17480), 8));
    }
    
    @Override
    public boolean method11807(final Class7096 class7096, final Class7096 class7097, final Direction class7098) {
        return class7097.method21756().method21779().method22165(this.field17481);
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public List<ItemStack> method11833(final Class7096 class7096, final Class9098 class7097) {
        return Collections.emptyList();
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class7698.method24486();
    }
    
    @Override
    public int method11826(final Class1852 class1852) {
        return this.field17481.method22156(class1852);
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class7096 class7099, final boolean b) {
        if (this.method11926(class7097, class7098, class7096)) {
            class7097.method6834().method21345(class7098, class7096.method21756().method21779(), this.method11826(class7097));
        }
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7096.method21756().method21780() || class7098.method21756().method21780()) {
            class7099.method6834().method21345(class7100, class7096.method21756().method21779(), this.method11826(class7099));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public void method11825(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Class3833 class7099, final BlockPos class7100, final boolean b) {
        if (this.method11926(class7097, class7098, class7096)) {
            class7097.method6834().method21345(class7098, class7096.method21756().method21779(), this.method11826(class7097));
        }
    }
    
    public boolean method11926(final Class1847 class1847, final BlockPos class1848, final Class7096 class1849) {
        if (this.field17481.method22166(Class7324.field28320)) {
            int n = 0;
            for (final Direction class1850 : Direction.values()) {
                if (class1850 != Direction.DOWN && class1847.method6702(class1848.method1149(class1850)).method21793(Class7324.field28319)) {
                    n = 1;
                    break;
                }
            }
            if (n != 0) {
                final Class7099 method6702 = class1847.method6702(class1848);
                if (method6702.method21780()) {
                    class1847.method6692(class1848, Class7521.field29286.method11878());
                    this.method11927(class1847, class1848);
                    return false;
                }
                if (method6702.method21782(class1847, class1848) >= 0.44444445f) {
                    class1847.method6692(class1848, Class7521.field29159.method11878());
                    this.method11927(class1847, class1848);
                    return false;
                }
            }
        }
        return true;
    }
    
    private void method11927(final Class1851 class1851, final BlockPos class1852) {
        class1851.method6955(1501, class1852, 0);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3859.field17480);
    }
    
    @Override
    public Class7255 method11922(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853) {
        if (class1853.method21772((Class7111<Integer>)Class3859.field17480) != 0) {
            return Class7558.field29974;
        }
        class1851.method6688(class1852, Class7521.field29147.method11878(), 11);
        return this.field17481;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
        if (this.field17481.method22166(Class7324.field28320)) {
            class7099.method1722();
        }
    }
    
    static {
        field17480 = Class8970.field37786;
    }
}
