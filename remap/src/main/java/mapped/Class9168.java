// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.ImmutableList;
import javax.annotation.Nullable;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.function.Function;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class Class9168
{
    private static String[] field38838;
    public static final Class9168 field38839;
    private final List<Class6559> field38840;
    private final List<Class6313> field38841;
    private Class7974 field38842;
    public static ResourceLocation field38843;
    
    private Class9168() {
        this.field38840 = Lists.newArrayList();
        this.field38841 = Collections.emptyList();
    }
    
    public Class9168(final Class7637 class7637, final Class7685 class7638, final Function<ResourceLocation, Class7684> function, final List<Class6559> list) {
        this(class7637, class7638, function, class7637.method24030()::method1415, list);
    }
    
    public Class9168(final Class7637 class7637, final Class7684 class7638, final Function<ResourceLocation, Class7684> function, final Function<Class3687, TextureAtlasSprite> function2, final List<Class6559> list) {
        this.field38840 = Lists.newArrayList();
        Collections.reverse(this.field38841 = (List<Class6313>)list.stream().map(class7640 -> Objects.equals(function3.apply(class7640.method19882()), b) ? null : class7639.method24021(class7640.method19882(), Class2122.field12371, function4)).collect(Collectors.toList()));
        for (int i = list.size() - 1; i >= 0; --i) {
            this.field38840.add(list.get(i));
        }
        if (this.field38840.size() > 65) {
            this.field38842 = Class7974.method25917(this.field38840);
        }
    }
    
    @Nullable
    public Class6313 method33469(final Class6313 class6313, final ItemStack class6314, final World class6315, final LivingEntity class6316) {
        final boolean method28987 = Config.method28987();
        if (method28987) {
            Class9168.field38843 = null;
        }
        if (!this.field38840.isEmpty()) {
            if (this.field38842 != null) {
                final Integer method28988 = this.field38842.method25914(class6314, class6315, class6316);
                if (method28988 != null) {
                    final int intValue = method28988;
                    if (intValue >= 0) {
                        if (intValue < this.field38841.size()) {
                            if (method28987) {
                                Class9168.field38843 = this.field38840.get(intValue).method19882();
                            }
                            final Class6313 class6317 = this.field38841.get(intValue);
                            if (class6317 != null) {
                                return class6317;
                            }
                        }
                    }
                    return class6313;
                }
            }
            int i = 0;
            while (i < this.field38840.size()) {
                final Class6559 class6318 = this.field38840.get(i);
                if (!class6318.method19883(class6314, class6315, class6316)) {
                    ++i;
                }
                else {
                    final Class6313 class6319 = this.field38841.get(i);
                    if (method28987) {
                        Class9168.field38843 = class6318.method19882();
                    }
                    if (this.field38842 != null) {
                        this.field38842.method25915(class6314, class6315, class6316, i);
                    }
                    if (class6319 != null) {
                        return class6319;
                    }
                    return class6313;
                }
            }
            if (this.field38842 != null) {
                this.field38842.method25915(class6314, class6315, class6316, Class7974.field32809);
            }
        }
        return class6313;
    }
    
    public ImmutableList<Class6559> method33470() {
        return (ImmutableList<Class6559>)ImmutableList.copyOf((Collection)this.field38840);
    }
    
    static {
        field38839 = new Class9168();
        Class9168.field38843 = null;
    }
}
