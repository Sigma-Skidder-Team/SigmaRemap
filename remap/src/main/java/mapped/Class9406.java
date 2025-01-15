// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import java.util.Set;

public class Class9406
{
    private static String[] field40366;
    private final Class9049 field40367;
    private final Entity field40368;
    private final int field40369;
    private Class353 field40370;
    private final Set<Class513> field40371;
    public final /* synthetic */ Class388 field40372;
    
    public Class9406(final Class388 field40372, final Entity field40373, final int field40374, final int n, final boolean b) {
        this.field40372 = field40372;
        this.field40371 = Sets.newHashSet();
        this.field40367 = new Class9049(Class388.method1408(field40372), field40373, n, b, this::method34982);
        this.field40368 = field40373;
        this.field40369 = field40374;
        this.field40370 = Class353.method1091(field40373);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class9406 && ((Class9406)o).field40368.method1643() == this.field40368.method1643();
    }
    
    @Override
    public int hashCode() {
        return this.field40368.method1643();
    }
    
    public void method34982(final Class4252<?> class4252) {
        final Iterator<Class513> iterator = this.field40371.iterator();
        while (iterator.hasNext()) {
            iterator.next().field3039.method17469(class4252);
        }
    }
    
    public void method34983(final Class4252<?> class4252) {
        this.method34982(class4252);
        if (this.field40368 instanceof Class513) {
            ((Class513)this.field40368).field3039.method17469(class4252);
        }
    }
    
    public void method34984() {
        final Iterator<Class513> iterator = this.field40371.iterator();
        while (iterator.hasNext()) {
            this.field40367.method32539(iterator.next());
        }
    }
    
    public void method34985(final Class513 class513) {
        if (this.field40371.remove(class513)) {
            this.field40367.method32539(class513);
        }
    }
    
    public void method34986(final Class513 class513) {
        if (class513 != this.field40368) {
            final Vec3d method16741 = class513.method1934().subtract(this.field40367.method32544());
            final int min = Math.min(this.method34987(), (Class388.method1409(this.field40372) - 1) * 16);
            boolean b = false;
            Label_0130: {
                if (method16741.x >= -min) {
                    if (method16741.x <= min) {
                        if (method16741.z >= -min) {
                            if (method16741.z <= min) {
                                if (this.field40368.method1885(class513)) {
                                    b = true;
                                    break Label_0130;
                                }
                            }
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                if (this.field40371.remove(class513)) {
                    this.field40367.method32539(class513);
                }
            }
            else {
                boolean field2390 = this.field40368.field2390;
                if (!field2390) {
                    final Class7859 class514 = new Class7859(this.field40368.field2441, this.field40368.field2443);
                    final Class9298 method16742 = this.field40372.method1317(class514.method25422());
                    if (method16742 != null) {
                        if (method16742.method34345() != null) {
                            field2390 = (Class388.method1410(class514, class513, false) <= Class388.method1409(this.field40372));
                        }
                    }
                }
                if (field2390) {
                    if (this.field40371.add(class513)) {
                        this.field40367.method32540(class513);
                    }
                }
            }
        }
    }
    
    private int method34987() {
        final Collection<Entity> method1911 = this.field40368.method1911();
        int field40369 = this.field40369;
        final Iterator<Entity> iterator = method1911.iterator();
        while (iterator.hasNext()) {
            final int n = iterator.next().method1642().method23380() * 16;
            if (n <= field40369) {
                continue;
            }
            field40369 = n;
        }
        return field40369;
    }
    
    public void method34988(final List<Class513> list) {
        final Iterator<Class513> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.method34986(iterator.next());
        }
    }
}
