// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.Iterator;
import com.google.common.base.Objects;
import java.util.Collections;
import com.google.common.collect.Sets;
import java.util.Set;

public class Class6879 extends Class6880
{
    private static String[] field26951;
    private final Set<Class513> field26952;
    private final Set<Class513> field26953;
    private boolean field26954;
    
    public Class6879(final Class2250 class2250, final Class2200 class2251, final Class342 class2252) {
        super(Class9546.method35691(), class2250, class2251, class2252);
        this.field26952 = Sets.newHashSet();
        this.field26953 = Collections.unmodifiableSet((Set<? extends Class513>)this.field26952);
        this.field26954 = true;
    }
    
    @Override
    public void method21064(final float n) {
        if (n != this.field26957) {
            super.method21064(n);
            this.method21071(Class1994.field11171);
        }
    }
    
    @Override
    public void method21065(final Class2200 class2200) {
        if (class2200 != this.field26958) {
            super.method21065(class2200);
            this.method21071(Class1994.field11173);
        }
    }
    
    @Override
    public void method21066(final Class342 class342) {
        if (class342 != this.field26959) {
            super.method21066(class342);
            this.method21071(Class1994.field11173);
        }
    }
    
    @Override
    public Class6880 method21067(final boolean b) {
        if (b != this.field26960) {
            super.method21067(b);
            this.method21071(Class1994.field11174);
        }
        return this;
    }
    
    @Override
    public Class6880 method21068(final boolean b) {
        if (b != this.field26961) {
            super.method21068(b);
            this.method21071(Class1994.field11174);
        }
        return this;
    }
    
    @Override
    public Class6880 method21069(final boolean b) {
        if (b != this.field26962) {
            super.method21069(b);
            this.method21071(Class1994.field11174);
        }
        return this;
    }
    
    @Override
    public void method21070(final Class2250 class2250) {
        if (!Objects.equal((Object)class2250, (Object)this.field26956)) {
            super.method21070(class2250);
            this.method21071(Class1994.field11172);
        }
    }
    
    private void method21071(final Class1994 class1994) {
        if (this.field26954) {
            final Class4301 class1995 = new Class4301(class1994, this);
            final Iterator<Class513> iterator = this.field26952.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3039.method17469(class1995);
            }
        }
    }
    
    public void method21049(final Class513 class513) {
        if (this.field26952.add(class513)) {
            if (this.field26954) {
                class513.field3039.method17469(new Class4301(Class1994.field11169, this));
            }
        }
    }
    
    public void method21051(final Class513 class513) {
        if (this.field26952.remove(class513)) {
            if (this.field26954) {
                class513.field3039.method17469(new Class4301(Class1994.field11170, this));
            }
        }
    }
    
    public void method21052() {
        if (!this.field26952.isEmpty()) {
            final Iterator iterator = Lists.newArrayList((Iterable)this.field26952).iterator();
            while (iterator.hasNext()) {
                this.method21051((Class513)iterator.next());
            }
        }
    }
    
    public boolean method21072() {
        return this.field26954;
    }
    
    public void method21073(final boolean field26954) {
        if (field26954 != this.field26954) {
            this.field26954 = field26954;
            final Iterator<Class513> iterator = this.field26952.iterator();
            while (iterator.hasNext()) {
                iterator.next().field3039.method17469(new Class4301(field26954 ? Class1994.field11169 : Class1994.field11170, this));
            }
        }
    }
    
    public Collection<Class513> method21074() {
        return this.field26953;
    }
}
