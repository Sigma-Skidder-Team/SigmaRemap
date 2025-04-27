// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Class5221 extends Class5207
{
    private List<Class5207> field22237;
    private Class6108 field22238;
    
    public Class5221(final Class6108 class6108) {
        this.method16307(class6108);
    }
    
    @Override
    public void method16306() {
        (this.field22237 = new CopyOnWriteArrayList<Class5207>()).add(Class8626.field36205);
    }
    
    @Override
    public void method16307(final Class6108 field22238) {
        this.field22238 = field22238;
        final Class6651 class6651 = new Class6651(field22238);
        class6651.method20217(this);
        field22238.method18209(class6651);
        final Iterator<Class5207> iterator = this.field22237.iterator();
        while (iterator.hasNext()) {
            iterator.next().method16307(field22238);
        }
    }
    
    public void method16334(final Class5207 class5207) {
        if (this.field22237 == null) {
            throw new NullPointerException("Tried to add protocol to early");
        }
        this.field22237.add(class5207);
        class5207.method16307(this.field22238);
        final ArrayList list = new ArrayList();
        for (final Class5207 class5208 : this.field22237) {
            if (!Class8626.method29282(class5208)) {
                continue;
            }
            list.add(class5208);
        }
        this.field22237.removeAll(list);
        this.field22237.addAll(list);
    }
    
    @Override
    public void method16318(final Class2128 class2128, final Class2044 class2129, final Class8699 class2130) throws Exception {
        final int method29848 = class2130.method29848();
        final ArrayList list = new ArrayList(this.field22237);
        if (class2128 == Class2128.field12427) {
            Collections.reverse(list);
        }
        class2130.method29838(class2128, class2129, 0, list);
        super.method16318(class2128, class2129, class2130);
        if (Class8563.method28794().method33559()) {
            String name = "UNKNOWN";
            final int method29849 = this.field22238.method18207(Class6651.class).method20208();
            final int method29850 = this.field22238.method18207(Class6651.class).method20207();
            if (method29849 >= Class7906.field32452.method25613()) {
                if (method29849 <= Class7906.field32456.method25613()) {
                    Class2006 class2131;
                    if (method29849 > Class7906.field32452.method25613()) {
                        class2131 = Class2006.method8030(class2129, class2128, method29848);
                    }
                    else if (class2128 != Class2128.field12428) {
                        class2131 = Class2006.method8031(class2129, class2128, method29848);
                    }
                    else {
                        class2131 = Class2006.method8030(class2129, class2128, method29848);
                    }
                    if (class2131 != null) {
                        if (class2131 == Class2006.field11343) {
                            return;
                        }
                        if (class2131 == Class2006.field11379) {
                            return;
                        }
                        if (class2131 == Class2006.field11342) {
                            return;
                        }
                        if (class2131 == Class2006.field11292) {
                            return;
                        }
                        if (class2131 == Class2006.field11349) {
                            return;
                        }
                        if (class2131 == Class2006.field11350) {
                            return;
                        }
                        if (class2131 == Class2006.field11348) {
                            return;
                        }
                        if (class2131 == Class2006.field11294) {
                            return;
                        }
                        if (class2131 == Class2006.field11295) {
                            return;
                        }
                        if (class2131 == Class2006.field11293) {
                            return;
                        }
                        name = class2131.name();
                    }
                }
            }
            final String string = name + "[" + method29850 + "]";
            final Class9366 method29851 = Class8563.method28793();
            final String method29852 = class2130.method29841().method18207(Class6651.class).method20209();
            method29851.method34742().log(Level.INFO, "{0}{1}: {2} {3} -> {4} [{5}] Value: {6}", new Object[] { (method29852 == null) ? "" : (method29852 + " "), class2128, class2129, method29848, class2130.method29848(), string, class2130 });
        }
    }
    
    public boolean method16335(final Class<? extends Class5207> obj) {
        final Iterator<Class5207> iterator = this.field22237.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().getClass().equals(obj)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    public boolean method16336(final Object o, final List list) throws Exception {
        for (final Class5207 class5207 : this.field22237) {
            if (!class5207.method16308(o.getClass())) {
                continue;
            }
            class5207.method16309(this.field22238, o, list);
            return true;
        }
        return false;
    }
    
    public List<Class5207> method16337() {
        return this.field22237;
    }
    
    public void method16338() {
        this.method16337().clear();
        this.method16306();
    }
}
