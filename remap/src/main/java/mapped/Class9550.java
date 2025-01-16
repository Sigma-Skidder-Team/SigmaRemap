// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import net.minecraft.world.World;

import java.util.Map;

public class Class9550
{
    public final Map<Class5412<?>, Class4158<?>> field41125;
    public static final Class9550 field41126;
    private final Class4148 field41127;
    private Class1844 field41128;
    public Class1663 field41129;
    public World field41130;
    public Class6092 field41131;
    public RayTraceResult field41132;
    public TileEntity field41133;
    
    private Class9550() {
        this.field41125 = Maps.newHashMap();
        this.field41127 = new Class4148(256);
        this.method35723(Class5412.field22548, new Class4159(this));
        this.method35723(Class5412.field22549, new Class4157(this));
        this.method35723(Class5412.field22550, new Class4162(this));
        this.method35723((Class5412<TileEntity>)Class5412.field22542, new Class4167<TileEntity>(this));
        this.method35723((Class5412<TileEntity>)Class5412.field22544, new Class4167<TileEntity>(this));
        this.method35723((Class5412<TileEntity>)Class5412.field22543, new Class4167<TileEntity>(this));
        this.method35723(Class5412.field22552, new Class4173(this));
        this.method35723(Class5412.field22569, new Class4161(this));
        this.method35723((Class5412<TileEntity>)Class5412.field22553, new Class4171<TileEntity>(this));
        this.method35723(Class5412.field22561, new Class4172(this));
        this.method35723(Class5412.field22554, new Class4168(this));
        this.method35723(Class5412.field22555, new Class4174(this));
        this.method35723(Class5412.field22559, new Class4165(this));
        this.method35723(Class5412.field22560, new Class4170(this));
        this.method35723(Class5412.field22563, new Class4160(new Class5876<Object>(), this));
        this.method35723(Class5412.field22564, new Class4169(this));
        this.method35723(Class5412.field22565, new Class4164(this));
        this.method35723(Class5412.field22570, new Class4166(this));
        this.method35723(Class5412.field22572, new Class4163(this));
    }
    
    private <E extends TileEntity> void method35723(final Class5412<E> class5412, final Class4158<E> class5413) {
        this.field41125.put(class5412, class5413);
    }
    
    @Nullable
    public <E extends TileEntity> Class4158<E> method35724(final E e) {
        return (Class4158)this.field41125.get(e.getType());
    }
    
    public void method35725(final World class1847, final Class1663 field41129, final Class1844 field41130, final Class6092 field41131, final RayTraceResult field41132) {
        if (this.field41130 != class1847) {
            this.method35730(class1847);
        }
        this.field41129 = field41129;
        this.field41131 = field41131;
        this.field41128 = field41130;
        this.field41132 = field41132;
    }
    
    public <E extends TileEntity> void method35726(final E e, final float n, final Class7351 class7351, final Class7807 class7352) {
        if (e.method2191(this.field41131.method18161().x, this.field41131.method18161().y, this.field41131.method18161().z) < e.method2192()) {
            if (this.method35724(e) != null) {
                if (e.hasWorld()) {
                    if (e.getType().method16523(e.method2194().getBlock())) {
                        method35729(e, () -> {
                            if (!(!Class8880.method31235())) {
                                Class8880.method31237();
                            }
                            method35727(class7353, class7354, n2, class7355, class7356);
                            if (!(!Class8880.method31235())) {
                                if (!(!Class8880.method31239())) {
                                    Class8880.method31240();
                                    method35727(class7353, class7354, n2, class7355, class7356);
                                    Class8880.method31241();
                                }
                                Class8880.method31242();
                            }
                        });
                    }
                }
            }
        }
    }
    
    private static <T extends TileEntity> void method35727(final Class4158<T> class4158, final T t, final float n, final Class7351 class4159, final Class7807 class4160) {
        final World method2186 = t.method2186();
        int method2187;
        if (method2186 == null) {
            method2187 = 15728880;
        }
        else {
            method2187 = Class1656.method5776(method2186, t.getPos());
        }
        class4158.method12454(t, n, class4159, class4160, method2187, Class1904.field10335);
    }
    
    public <E extends TileEntity> boolean method35728(final E e, final Class7351 class7351, final Class7807 class7352, final int n, final int n2) {
        if (this.method35724(e) != null) {
            method35729(e, () -> {
                class7353.method12454(this.field41133 = field41133, 0.0f, class7354, class7355, n3, n4);
                this.field41133 = null;
                return;
            });
            return false;
        }
        return true;
    }
    
    private static void method35729(final TileEntity tileEntity, final Runnable runnable) {
        try {
            runnable.run();
        }
        catch (final Throwable t) {
            final CrashReport method24421 = CrashReport.makeCrashReport(t, "Rendering Block Entity");
            tileEntity.method2202(method24421.makeCategory("Block Entity Details"));
            throw new ReportedException(method24421);
        }
    }
    
    public void method35730(final World field41130) {
        this.field41130 = field41130;
        if (field41130 == null) {
            this.field41131 = null;
        }
    }
    
    public Class1844 method35731() {
        return this.field41128;
    }
    
    public Class4158 method35732(final Class5412 class5412) {
        return this.field41125.get(class5412);
    }
    
    public synchronized <T extends TileEntity> void method35733(final Class5412<T> class5412, final Class4158<? super T> class5413) {
        this.field41125.put(class5412, class5413);
    }
    
    static {
        field41126 = new Class9550();
    }
}
