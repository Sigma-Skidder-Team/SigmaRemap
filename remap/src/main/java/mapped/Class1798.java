// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.IOException;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

public class Class1798<T extends LivingEntity & Class825, M extends Class5845<T> & Class5858> extends Class1799<T, M> implements Class1657
{
    private static final Int2ObjectMap<Class1932> field9961;
    private final Object2ObjectMap<Class7611, Class235> field9962;
    private final Object2ObjectMap<Class9334, Class235> field9963;
    private final Class6580 field9964;
    private final String field9965;
    
    public Class1798(final Class4778<T, M> class4778, final Class6580 field9964, final String field9965) {
        super(class4778);
        this.field9962 = (Object2ObjectMap<Class7611, Class235>)new Object2ObjectOpenHashMap();
        this.field9963 = (Object2ObjectMap<Class9334, Class235>)new Object2ObjectOpenHashMap();
        this.field9964 = field9964;
        this.field9965 = field9965;
        field9964.method19930(this);
    }
    
    public void method6551(final Class7351 class7351, final Class7807 class7352, final int n, final T t, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!t.method1823()) {
            final Class8562 method4870 = t.method4870();
            final Class7611 method4871 = method4870.method28780();
            final Class9334 method4872 = method4870.method28781();
            final Class235 method4873 = this.method6553(this.field9962, "type", Class90.field239, method4871);
            final Class235 method4874 = this.method6553(this.field9963, "profession", Class90.field240, method4872);
            final Class5845<T> method4875 = this.method6559();
            ((Class5858)method4875).method17589(method4874 == Class235.field897 || (method4874 == Class235.field898 && method4873 != Class235.field899));
            Class1799.method6558(method4875, this.method6552("type", Class90.field239.method503(method4871)), class7351, class7352, n, t, 1.0f, 1.0f, 1.0f);
            ((Class5858)method4875).method17589(true);
            if (method4872 != Class9334.field40060) {
                if (!t.method2625()) {
                    Class1799.method6558(method4875, this.method6552("profession", Class90.field240.method503(method4872)), class7351, class7352, n, t, 1.0f, 1.0f, 1.0f);
                    if (method4872 != Class9334.field40071) {
                        Class1799.method6558(method4875, this.method6552("profession_level", (Class1932)Class1798.field9961.get(MathHelper.method35651(method4870.method28782(), 1, Class1798.field9961.size()))), class7351, class7352, n, t, 1.0f, 1.0f, 1.0f);
                    }
                }
            }
        }
    }
    
    private Class1932 method6552(final String str, final Class1932 class1932) {
        return new Class1932(class1932.method7798(), "textures/entity/" + this.field9965 + "/" + str + "/" + class1932.method7797() + ".png");
    }
    
    public <K> Class235 method6553(final Object2ObjectMap<K, Class235> object2ObjectMap, final String s, final Class93<K> class93, final K k) {
        return (Class235)object2ObjectMap.computeIfAbsent((Object)k, p3 -> {
            try {
                this.field9964.method19933(this.method6552(s2, class94.method503(o2)));
                try {
                    final Class1671 class96;
                    final Class7483 class95 = class96.method5888((Class5092<Class7483>)Class7483.field28905);
                    if (class95 != null) {
                        class95.method23155();
                        return;
                    }
                    else {
                        return Class235.field897;
                    }
                }
                catch (final Throwable t) {
                    throw t;
                }
                finally {
                    final Class1671 class96;
                    if (class96 != null) {
                        final Throwable t2;
                        if (t2 != null) {
                            try {
                                class96.close();
                            }
                            catch (final Throwable exception) {
                                t2.addSuppressed(exception);
                            }
                        }
                        else {
                            class96.close();
                        }
                    }
                }
            }
            catch (final IOException ex) {}
            return Class235.field897;
        });
    }
    
    @Override
    public void method5691(final Class6582 class6582) {
        this.field9963.clear();
        this.field9962.clear();
    }
    
    static {
        field9961 = Class8349.method27851((Int2ObjectMap)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
            int2ObjectOpenHashMap.put(1, (Object)new Class1932("stone"));
            int2ObjectOpenHashMap.put(2, (Object)new Class1932("iron"));
            int2ObjectOpenHashMap.put(3, (Object)new Class1932("gold"));
            int2ObjectOpenHashMap.put(4, (Object)new Class1932("emerald"));
            int2ObjectOpenHashMap.put(5, (Object)new Class1932("diamond"));
        });
    }
}
