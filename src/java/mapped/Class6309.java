// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;

public class Class6309
{
    private final Class8863 field25222;
    private final Class6309 field25223;
    private final Class6309 field25224;
    private final int field25225;
    private final List<Class6309> field25226;
    private Class6309 field25227;
    private Class6309 field25228;
    private int field25229;
    private float field25230;
    private float field25231;
    private float field25232;
    private float field25233;
    
    public Class6309(final Class8863 field25222, final Class6309 field25223, final Class6309 field25224, final int field25225, final int field25226) {
        this.field25226 = Lists.newArrayList();
        if (field25222.method31036() != null) {
            this.field25222 = field25222;
            this.field25223 = field25223;
            this.field25224 = field25224;
            this.field25225 = field25225;
            this.field25227 = this;
            this.field25229 = field25226;
            this.field25230 = -1.0f;
            Class6309 method18671 = null;
            final Iterator<Class8863> iterator = field25222.method31038().iterator();
            while (iterator.hasNext()) {
                method18671 = this.method18671(iterator.next(), method18671);
            }
            return;
        }
        throw new IllegalArgumentException("Can't position an invisible advancement!");
    }
    
    @Nullable
    private Class6309 method18671(final Class8863 class8863, Class6309 method18671) {
        if (class8863.method31036() == null) {
            final Iterator<Class8863> iterator = class8863.method31038().iterator();
            while (iterator.hasNext()) {
                method18671 = this.method18671(iterator.next(), method18671);
            }
        }
        else {
            method18671 = new Class6309(class8863, this, method18671, this.field25226.size() + 1, this.field25229 + 1);
            this.field25226.add(method18671);
        }
        return method18671;
    }
    
    private void method18672() {
        if (!this.field25226.isEmpty()) {
            Class6309 method18678 = null;
            for (final Class6309 class6309 : this.field25226) {
                class6309.method18672();
                method18678 = class6309.method18678((method18678 != null) ? method18678 : class6309);
            }
            this.method18675();
            final float field25230 = (this.field25226.get(0).field25230 + this.field25226.get(this.field25226.size() - 1).field25230) / 2.0f;
            if (this.field25224 == null) {
                this.field25230 = field25230;
            }
            else {
                this.field25230 = this.field25224.field25230 + 1.0f;
                this.field25231 = this.field25230 - field25230;
            }
        }
        else if (this.field25224 == null) {
            this.field25230 = 0.0f;
        }
        else {
            this.field25230 = this.field25224.field25230 + 1.0f;
        }
    }
    
    private float method18673(final float n, final int field25229, float n2) {
        this.field25230 += n;
        this.field25229 = field25229;
        if (this.field25230 < n2) {
            n2 = this.field25230;
        }
        final Iterator<Class6309> iterator = this.field25226.iterator();
        while (iterator.hasNext()) {
            n2 = iterator.next().method18673(n + this.field25231, field25229 + 1, n2);
        }
        return n2;
    }
    
    private void method18674(final float n) {
        this.field25230 += n;
        final Iterator<Class6309> iterator = this.field25226.iterator();
        while (iterator.hasNext()) {
            iterator.next().method18674(n);
        }
    }
    
    private void method18675() {
        float n = 0.0f;
        float n2 = 0.0f;
        for (int i = this.field25226.size() - 1; i >= 0; --i) {
            final Class6309 class6310;
            final Class6309 class6309 = class6310 = this.field25226.get(i);
            class6310.field25230 += n;
            final Class6309 class6311 = class6309;
            class6311.field25231 += n;
            n2 += class6309.field25232;
            n += class6309.field25233 + n2;
        }
    }
    
    @Nullable
    private Class6309 method18676() {
        if (this.field25228 == null) {
            return this.field25226.isEmpty() ? null : this.field25226.get(0);
        }
        return this.field25228;
    }
    
    @Nullable
    private Class6309 method18677() {
        if (this.field25228 == null) {
            return this.field25226.isEmpty() ? null : this.field25226.get(this.field25226.size() - 1);
        }
        return this.field25228;
    }
    
    private Class6309 method18678(Class6309 class6309) {
        if (this.field25224 != null) {
            Class6309 method18676 = this;
            Class6309 method18677 = this;
            Class6309 class6310 = this.field25224;
            Class6309 method18678 = this.field25223.field25226.get(0);
            float field25231 = this.field25231;
            float field25232 = this.field25231;
            float field25233 = class6310.field25231;
            float field25234 = method18678.field25231;
            while (class6310.method18677() != null && method18676.method18676() != null) {
                class6310 = class6310.method18677();
                method18676 = method18676.method18676();
                method18678 = method18678.method18676();
                method18677 = method18677.method18677();
                method18677.field25227 = this;
                final float n = class6310.field25230 + field25233 - (method18676.field25230 + field25231) + 1.0f;
                if (n > 0.0f) {
                    class6310.method18680(this, class6309).method18679(this, n);
                    field25231 += n;
                    field25232 += n;
                }
                field25233 += class6310.field25231;
                field25231 += method18676.field25231;
                field25234 += method18678.field25231;
                field25232 += method18677.field25231;
            }
            if (class6310.method18677() != null && method18677.method18677() == null) {
                method18677.field25228 = class6310.method18677();
                final Class6309 class6311 = method18677;
                class6311.field25231 += field25233 - field25232;
            }
            else {
                if (method18676.method18676() != null) {
                    if (method18678.method18676() == null) {
                        method18678.field25228 = method18676.method18676();
                        final Class6309 class6312 = method18678;
                        class6312.field25231 += field25231 - field25234;
                    }
                }
                class6309 = this;
            }
            return class6309;
        }
        return class6309;
    }
    
    private void method18679(final Class6309 class6309, final float n) {
        final float n2 = (float)(class6309.field25225 - this.field25225);
        if (n2 != 0.0f) {
            class6309.field25232 -= n / n2;
            this.field25232 += n / n2;
        }
        class6309.field25233 += n;
        class6309.field25230 += n;
        class6309.field25231 += n;
    }
    
    private Class6309 method18680(final Class6309 class6309, final Class6309 class6310) {
        return (this.field25227 != null && class6309.field25223.field25226.contains(this.field25227)) ? this.field25227 : class6310;
    }
    
    private void method18681() {
        if (this.field25222.method31036() != null) {
            this.field25222.method31036().method22526((float)this.field25229, this.field25230);
        }
        if (!this.field25226.isEmpty()) {
            final Iterator<Class6309> iterator = this.field25226.iterator();
            while (iterator.hasNext()) {
                iterator.next().method18681();
            }
        }
    }
    
    public static void method18682(final Class8863 class8863) {
        if (class8863.method31036() != null) {
            final Class6309 class8864 = new Class6309(class8863, null, null, 1, 0);
            class8864.method18672();
            final float method18673 = class8864.method18673(0.0f, 0, class8864.field25230);
            if (method18673 < 0.0f) {
                class8864.method18674(-method18673);
            }
            class8864.method18681();
            return;
        }
        throw new IllegalArgumentException("Can't position children of an invisible root!");
    }
}
