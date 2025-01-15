// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import javax.annotation.Nullable;

public class Class8768
{
    private Class8768 field36857;
    private Class2116 field36858;
    private Boolean field36859;
    private Boolean field36860;
    private Boolean field36861;
    private Boolean field36862;
    private Boolean field36863;
    private Class9485 field36864;
    private Class9390 field36865;
    private String field36866;
    private static final Class8768 field36867;
    
    @Nullable
    public Class2116 method30403() {
        return (this.field36858 != null) ? this.field36858 : this.method30424().method30403();
    }
    
    public boolean method30404() {
        return (this.field36859 != null) ? this.field36859 : this.method30424().method30404();
    }
    
    public boolean method30405() {
        return (this.field36860 != null) ? this.field36860 : this.method30424().method30405();
    }
    
    public boolean method30406() {
        return (this.field36862 != null) ? this.field36862 : this.method30424().method30406();
    }
    
    public boolean method30407() {
        return (this.field36861 != null) ? this.field36861 : this.method30424().method30407();
    }
    
    public boolean method30408() {
        return (this.field36863 != null) ? this.field36863 : this.method30424().method30408();
    }
    
    public boolean method30409() {
        if (this.field36859 == null) {
            if (this.field36860 == null) {
                if (this.field36862 == null) {
                    if (this.field36861 == null) {
                        if (this.field36863 == null) {
                            if (this.field36858 == null) {
                                if (this.field36864 == null) {
                                    if (this.field36865 == null) {
                                        if (this.field36866 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Nullable
    public Class9485 method30410() {
        return (this.field36864 != null) ? this.field36864 : this.method30424().method30410();
    }
    
    @Nullable
    public Class9390 method30411() {
        return (this.field36865 != null) ? this.field36865 : this.method30424().method30411();
    }
    
    @Nullable
    public String method30412() {
        return (this.field36866 != null) ? this.field36866 : this.method30424().method30412();
    }
    
    public Class8768 method30413(final Class2116 field36858) {
        this.field36858 = field36858;
        return this;
    }
    
    public Class8768 method30414(final Boolean field36859) {
        this.field36859 = field36859;
        return this;
    }
    
    public Class8768 method30415(final Boolean field36860) {
        this.field36860 = field36860;
        return this;
    }
    
    public Class8768 method30416(final Boolean field36862) {
        this.field36862 = field36862;
        return this;
    }
    
    public Class8768 method30417(final Boolean field36861) {
        this.field36861 = field36861;
        return this;
    }
    
    public Class8768 method30418(final Boolean field36863) {
        this.field36863 = field36863;
        return this;
    }
    
    public Class8768 method30419(final Class9485 field36864) {
        this.field36864 = field36864;
        return this;
    }
    
    public Class8768 method30420(final Class9390 field36865) {
        this.field36865 = field36865;
        return this;
    }
    
    public Class8768 method30421(final String field36866) {
        this.field36866 = field36866;
        return this;
    }
    
    public Class8768 method30422(final Class8768 field36857) {
        this.field36857 = field36857;
        return this;
    }
    
    public String method30423() {
        if (!this.method30409()) {
            final StringBuilder sb = new StringBuilder();
            if (this.method30403() != null) {
                sb.append(this.method30403());
            }
            if (this.method30404()) {
                sb.append(Class2116.field12326);
            }
            if (this.method30405()) {
                sb.append(Class2116.field12329);
            }
            if (this.method30407()) {
                sb.append(Class2116.field12328);
            }
            if (this.method30408()) {
                sb.append(Class2116.field12325);
            }
            if (this.method30406()) {
                sb.append(Class2116.field12327);
            }
            return sb.toString();
        }
        return (this.field36857 == null) ? "" : this.field36857.method30423();
    }
    
    private Class8768 method30424() {
        return (this.field36857 != null) ? this.field36857 : Class8768.field36867;
    }
    
    @Override
    public String toString() {
        return "Style{hasParent=" + (this.field36857 != null) + ", color=" + this.field36858 + ", bold=" + this.field36859 + ", italic=" + this.field36860 + ", underlined=" + this.field36861 + ", obfuscated=" + this.field36863 + ", clickEvent=" + this.method30410() + ", hoverEvent=" + this.method30411() + ", insertion=" + this.method30412() + '}';
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class8768) {
            final Class8768 class8768 = (Class8768)o;
            if (this.method30404() == class8768.method30404()) {
                if (this.method30403() == class8768.method30403()) {
                    if (this.method30405() == class8768.method30405()) {
                        if (this.method30408() == class8768.method30408()) {
                            if (this.method30406() == class8768.method30406()) {
                                if (this.method30407() == class8768.method30407()) {
                                    if (this.method30410() == null) {
                                        if (class8768.method30410() != null) {
                                            return false;
                                        }
                                    }
                                    else if (!this.method30410().equals(class8768.method30410())) {
                                        return false;
                                    }
                                    if (this.method30411() == null) {
                                        if (class8768.method30411() != null) {
                                            return false;
                                        }
                                    }
                                    else if (!this.method30411().equals(class8768.method30411())) {
                                        return false;
                                    }
                                    if (this.method30412() == null) {
                                        if (class8768.method30412() == null) {
                                            return true;
                                        }
                                    }
                                    else if (this.method30412().equals(class8768.method30412())) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field36858, this.field36859, this.field36860, this.field36861, this.field36862, this.field36863, this.field36864, this.field36865, this.field36866);
    }
    
    public Class8768 method30425() {
        final Class8768 class8768 = new Class8768();
        class8768.field36859 = this.field36859;
        class8768.field36860 = this.field36860;
        class8768.field36862 = this.field36862;
        class8768.field36861 = this.field36861;
        class8768.field36863 = this.field36863;
        class8768.field36858 = this.field36858;
        class8768.field36864 = this.field36864;
        class8768.field36865 = this.field36865;
        class8768.field36857 = this.field36857;
        class8768.field36866 = this.field36866;
        return class8768;
    }
    
    public Class8768 method30426() {
        final Class8768 class8768 = new Class8768();
        class8768.method30414(this.method30404());
        class8768.method30415(this.method30405());
        class8768.method30416(this.method30406());
        class8768.method30417(this.method30407());
        class8768.method30418(this.method30408());
        class8768.method30413(this.method30403());
        class8768.method30419(this.method30410());
        class8768.method30420(this.method30411());
        class8768.method30421(this.method30412());
        return class8768;
    }
    
    static {
        field36867 = new Class8769();
    }
}
