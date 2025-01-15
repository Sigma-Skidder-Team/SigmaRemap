// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public class Class2257 extends Class2255
{
    private final String field13806;
    private final Class5346 field13807;
    
    public Class2257(final String s, final boolean b, final String field13806) {
        super(s, b);
        this.field13806 = field13806;
        this.field13807 = this.method8489(this.field13806);
    }
    
    @Nullable
    private Class5346 method8489(final String s) {
        try {
            return Class8330.method27767().parse(new StringReader(s));
        }
        catch (final CommandSyntaxException ex) {
            return null;
        }
    }
    
    private Class2257(final String s, final Class8570 class8570, final boolean b, final String field13806, final Class5346 field13807) {
        super(s, class8570, b);
        this.field13806 = field13806;
        this.field13807 = field13807;
    }
    
    @Nullable
    public String method8490() {
        return this.field13806;
    }
    
    @Override
    public Class2250 method8465() {
        return new Class2257(this.field13802, this.field13803, this.field13801, this.field13806, this.field13807);
    }
    
    @Override
    public Stream<Class51> method8481(final Class7492 class7492) {
        if (this.field13807 != null) {
            final Class1849 method23250 = class7492.method23250();
            final BlockPos method23251 = this.field13807.method16506(class7492);
            if (method23250.method6731(method23251)) {
                final Class436 method23252 = method23250.method6727(method23251);
                if (method23252 != null) {
                    return Stream.of(method23252.method2180(new Class51()));
                }
            }
        }
        return Stream.empty();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2257) {
            final Class2257 class2257 = (Class2257)o;
            if (Objects.equals(this.field13806, class2257.field13806)) {
                if (Objects.equals(this.field13802, class2257.field13802)) {
                    if (super.equals(o)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "BlockPosArgument{pos='" + this.field13806 + '\'' + "path='" + this.field13802 + '\'' + ", siblings=" + this.field13791 + ", style=" + this.method8456() + '}';
    }
}
