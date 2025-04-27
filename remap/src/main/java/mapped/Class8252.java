// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import com.google.common.base.Preconditions;
import java.util.Set;
import java.util.UUID;

public abstract class Class8252<T> extends Class8254<T>
{
    private final UUID field33893;
    private String field33894;
    private float field33895;
    private Class320 field33896;
    private Class2163 field33897;
    private final Set<UUID> field33898;
    private boolean field33899;
    private final Set<Class2205> field33900;
    
    public Class8252(final String field33894, final float field33895, final Class320 class320, final Class2163 class321) {
        Preconditions.checkNotNull((Object)field33894, "Title cannot be null");
        Preconditions.checkArgument(field33895 >= 0.0f && field33895 <= 1.0f, "Health must be between 0 and 1");
        this.field33893 = UUID.randomUUID();
        this.field33894 = field33894;
        this.field33895 = field33895;
        this.field33896 = ((class320 != null) ? class320 : Class320.field1899);
        this.field33897 = ((class321 != null) ? class321 : Class2163.field12867);
        this.field33898 = new HashSet<UUID>();
        this.field33900 = new HashSet<Class2205>();
        this.field33899 = true;
    }
    
    @Override
    public Class8254 method27368(final String field33894) {
        if (field33894 != null) {
            this.field33894 = field33894;
            this.method27384(Class2098.field12158);
            return this;
        }
        throw new NullPointerException("title is marked non-null but is null");
    }
    
    @Override
    public Class8254 method27369(float field33895) {
        if (field33895 >= 0.0f) {
            if (field33895 <= 1.0f) {
                field33895 = 1.0f;
            }
        }
        Preconditions.checkArgument(field33895 >= 0.0f && field33895 <= 1.0f, "Health must be between 0 and 1");
        this.field33895 = field33895;
        this.method27384(Class2098.field12157);
        return this;
    }
    
    @Override
    public Class320 method27370() {
        return this.field33896;
    }
    
    @Override
    public Class8254 method27371(final Class320 field33896) {
        if (field33896 != null) {
            this.field33896 = field33896;
            this.method27384(Class2098.field12159);
            return this;
        }
        throw new NullPointerException("color is marked non-null but is null");
    }
    
    @Override
    public Class8254 method27372(final Class2163 field33897) {
        if (field33897 != null) {
            this.field33897 = field33897;
            this.method27384(Class2098.field12159);
            return this;
        }
        throw new NullPointerException("style is marked non-null but is null");
    }
    
    @Override
    public Class8254 method27373(final UUID uuid) {
        if (!this.field33898.contains(uuid)) {
            this.field33898.add(uuid);
            if (this.field33899) {
                this.method27385(uuid, this.method27386(Class2098.field12155, Class8563.method28794().method33555(uuid)));
            }
        }
        return this;
    }
    
    @Override
    public Class8254 method27374(final UUID uuid) {
        if (this.field33898.contains(uuid)) {
            this.field33898.remove(uuid);
            this.method27385(uuid, this.method27386(Class2098.field12156, Class8563.method28794().method33555(uuid)));
        }
        return this;
    }
    
    @Override
    public Class8254 method27375(final Class2205 class2205) {
        if (class2205 != null) {
            if (!this.method27377(class2205)) {
                this.field33900.add(class2205);
            }
            this.method27384(Class2098.field12160);
            return this;
        }
        throw new NullPointerException("flag is marked non-null but is null");
    }
    
    @Override
    public Class8254 method27376(final Class2205 class2205) {
        if (class2205 != null) {
            if (this.method27377(class2205)) {
                this.field33900.remove(class2205);
            }
            this.method27384(Class2098.field12160);
            return this;
        }
        throw new NullPointerException("flag is marked non-null but is null");
    }
    
    @Override
    public boolean method27377(final Class2205 class2205) {
        if (class2205 != null) {
            return this.field33900.contains(class2205);
        }
        throw new NullPointerException("flag is marked non-null but is null");
    }
    
    @Override
    public Set<UUID> method27378() {
        return Collections.unmodifiableSet(this.field33898);
    }
    
    @Override
    public Class8254 method27379() {
        this.method27383(true);
        return this;
    }
    
    @Override
    public Class8254 method27380() {
        this.method27383(false);
        return this;
    }
    
    @Override
    public boolean method27381() {
        return this.field33899;
    }
    
    @Override
    public UUID method27382() {
        return this.field33893;
    }
    
    private void method27383(final boolean field33899) {
        if (this.field33899 != field33899) {
            this.field33899 = field33899;
            this.method27384(field33899 ? Class2098.field12155 : Class2098.field12156);
        }
    }
    
    private void method27384(final Class2098 class2098) {
        for (final UUID uuid : new ArrayList(this.field33898)) {
            this.method27385(uuid, this.method27386(class2098, Class8563.method28794().method33555(uuid)));
        }
    }
    
    private void method27385(final UUID uuid, final Class8699 class8699) {
        if (!Class8563.method28791().method31740(uuid) || Class8563.method28791().method31739(uuid) < Class7906.field32453.method25613()) {
            this.field33898.remove(uuid);
            return;
        }
        try {
            class8699.method29833(Class5224.class);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private Class8699 method27386(final Class2098 class2098, final Class6108 class2099) {
        try {
            final Class8699 class2100 = new Class8699(12, null, class2099);
            class2100.method29823(Class5260.field22310, this.field33893);
            class2100.method29823(Class5260.field22312, class2098.method8222());
            switch (Class8549.field35897[class2098.ordinal()]) {
                case 1: {
                    Class5224.field22245.method9789(class2100, this.field33894);
                    class2100.method29823(Class5260.field22302, this.field33895);
                    class2100.method29823(Class5260.field22312, this.field33896.method990());
                    class2100.method29823(Class5260.field22312, this.field33897.method8334());
                    class2100.method29823(Class5260.field22289, (byte)this.method27387());
                }
                case 3: {
                    class2100.method29823(Class5260.field22302, this.field33895);
                    break;
                }
                case 4: {
                    Class5224.field22245.method9789(class2100, this.field33894);
                    break;
                }
                case 5: {
                    class2100.method29823(Class5260.field22312, this.field33896.method990());
                    class2100.method29823(Class5260.field22312, this.field33897.method8334());
                    break;
                }
                case 6: {
                    class2100.method29823(Class5260.field22289, (byte)this.method27387());
                    break;
                }
            }
            return class2100;
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private int method27387() {
        int n = 0;
        final Iterator<Class2205> iterator = this.field33900.iterator();
        while (iterator.hasNext()) {
            n |= iterator.next().method8382();
        }
        return n;
    }
    
    public UUID method27388() {
        return this.field33893;
    }
    
    @Override
    public String method27389() {
        return this.field33894;
    }
    
    @Override
    public float method27390() {
        return this.field33895;
    }
    
    @Override
    public Class2163 method27391() {
        return this.field33897;
    }
    
    public Set<Class2205> method27392() {
        return this.field33900;
    }
}
