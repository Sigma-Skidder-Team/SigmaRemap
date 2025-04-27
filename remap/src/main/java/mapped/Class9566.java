// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import lombok.NonNull;

public class Class9566
{
    private String field41156;
    private String field41157;
    private int field41158;
    private int field41159;
    private float field41160;
    private int field41161;
    private Class7562[] field41162;
    private Class7562[][] field41163;
    private Class7562 field41164;
    
    public Class9566(final String field41156) {
        if (field41156 != null) {
            this.field41156 = field41156;
            return;
        }
        throw new NullPointerException("type is marked non-null but is null");
    }
    
    @NonNull
    public String method35788() {
        return this.field41156;
    }
    
    public String method35789() {
        return this.field41157;
    }
    
    public int method35790() {
        return this.field41158;
    }
    
    public int method35791() {
        return this.field41159;
    }
    
    public float method35792() {
        return this.field41160;
    }
    
    public int method35793() {
        return this.field41161;
    }
    
    public Class7562[] method35794() {
        return this.field41162;
    }
    
    public Class7562[][] method35795() {
        return this.field41163;
    }
    
    public Class7562 method35796() {
        return this.field41164;
    }
    
    public void method35797(final String field41156) {
        if (field41156 != null) {
            this.field41156 = field41156;
            return;
        }
        throw new NullPointerException("type is marked non-null but is null");
    }
    
    public void method35798(final String field41157) {
        this.field41157 = field41157;
    }
    
    public void method35799(final int field41158) {
        this.field41158 = field41158;
    }
    
    public void method35800(final int field41159) {
        this.field41159 = field41159;
    }
    
    public void method35801(final float field41160) {
        this.field41160 = field41160;
    }
    
    public void method35802(final int field41161) {
        this.field41161 = field41161;
    }
    
    public void method35803(final Class7562[] field41162) {
        this.field41162 = field41162;
    }
    
    public void method35804(final Class7562[][] field41163) {
        this.field41163 = field41163;
    }
    
    public void method35805(final Class7562 field41164) {
        this.field41164 = field41164;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Class9566)) {
            return false;
        }
        final Class9566 class9566 = (Class9566)o;
        if (class9566.method35806(this)) {
            final String method35788 = this.method35788();
            final String method35789 = class9566.method35788();
            if (method35788 != null) {
                if (!method35788.equals(method35789)) {
                    return false;
                }
            }
            else if (method35789 != null) {
                return false;
            }
            final String method35790 = this.method35789();
            final String method35791 = class9566.method35789();
            if (method35790 != null) {
                if (!method35790.equals(method35791)) {
                    return false;
                }
            }
            else if (method35791 != null) {
                return false;
            }
            if (this.method35790() != class9566.method35790()) {
                return false;
            }
            if (this.method35791() != class9566.method35791()) {
                return false;
            }
            if (Float.compare(this.method35792(), class9566.method35792()) != 0) {
                return false;
            }
            if (this.method35793() != class9566.method35793()) {
                return false;
            }
            if (!Arrays.deepEquals(this.method35794(), class9566.method35794())) {
                return false;
            }
            if (Arrays.deepEquals(this.method35795(), class9566.method35795())) {
                final Class7562 method35792 = this.method35796();
                final Class7562 method35793 = class9566.method35796();
                if (method35792 != null) {
                    return method35792.equals(method35793);
                }
                else return method35793 == null;
            }
            return false;
        }
        return false;
    }
    
    public boolean method35806(final Object o) {
        return o instanceof Class9566;
    }
    
    @Override
    public int hashCode() {
        final int n = 1;
        final String method35788 = this.method35788();
        final int n2 = n * 59 + ((method35788 != null) ? method35788.hashCode() : 43);
        final String method35789 = this.method35789();
        final int n3 = ((((((n2 * 59 + ((method35789 != null) ? method35789.hashCode() : 43)) * 59 + this.method35790()) * 59 + this.method35791()) * 59 + Float.floatToIntBits(this.method35792())) * 59 + this.method35793()) * 59 + Arrays.deepHashCode(this.method35794())) * 59 + Arrays.deepHashCode(this.method35795());
        final Class7562 method35790 = this.method35796();
        return n3 * 59 + ((method35790 != null) ? method35790.hashCode() : 43);
    }
    
    @Override
    public String toString() {
        return "RecipeData.Recipe(type=" + this.method35788() + ", group=" + this.method35789() + ", width=" + this.method35790() + ", height=" + this.method35791() + ", experience=" + this.method35792() + ", cookingTime=" + this.method35793() + ", ingredient=" + Arrays.deepToString(this.method35794()) + ", ingredients=" + Arrays.deepToString(this.method35795()) + ", result=" + this.method35796() + ")";
    }
}
