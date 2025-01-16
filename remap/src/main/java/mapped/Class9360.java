// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Optional;

public class Class9360
{
    private static String[] field40144;
    public static final Class9360 field40145;
    private final ResourceLocation field40146;
    private boolean field40147;
    private Optional<Class8263> field40148;
    
    public Class9360(final ResourceLocation field40146) {
        this.field40148 = Optional.empty();
        this.field40146 = field40146;
    }
    
    public Class9360(final Class8263 value) {
        this.field40148 = Optional.empty();
        this.field40147 = true;
        this.field40146 = null;
        this.field40148 = Optional.of(value);
    }
    
    public Optional<Class8263> method34708(final Class1794 class1794) {
        if (!this.field40147) {
            if (this.field40146 != null) {
                this.field40148 = class1794.method6502(this.field40146);
            }
            this.field40147 = true;
        }
        return this.field40148;
    }
    
    @Nullable
    public ResourceLocation method34709() {
        return this.field40148.map(class8263 -> Class8263.method27446(class8263)).orElse(this.field40146);
    }
    
    static {
        field40145 = new Class9360((ResourceLocation)null);
    }
}
