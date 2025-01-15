// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import java.util.Locale;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.UUID;
import java.util.function.Function;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Class5416 implements Class5414
{
    private static final SimpleCommandExceptionType field22585;
    public static final Function<String, Class6595> field22586;
    private final Class399 field22587;
    
    public Class5416(final Class399 field22587) {
        this.field22587 = field22587;
    }
    
    @Override
    public void method16525(final Class51 class51) throws CommandSyntaxException {
        if (!(this.field22587 instanceof Class512)) {
            final UUID method1865 = this.field22587.method1865();
            this.field22587.method1757(class51);
            this.field22587.method1864(method1865);
            return;
        }
        throw Class5416.field22585.create();
    }
    
    @Override
    public Class51 method16526() {
        return Class7103.method21808(this.field22587);
    }
    
    @Override
    public Class2250 method16527() {
        return new Class2259("commands.data.entity.modified", new Object[] { this.field22587.method1871() });
    }
    
    @Override
    public Class2250 method16528(final Class41 class41) {
        return new Class2259("commands.data.entity.query", new Object[] { this.field22587.method1871(), class41.method268() });
    }
    
    @Override
    public Class2250 method16529(final Class8570 class8570, final double d, final int i) {
        return new Class2259("commands.data.entity.get", new Object[] { class8570, this.field22587.method1871(), String.format(Locale.ROOT, "%.2f", d), i });
    }
    
    static {
        field22585 = new SimpleCommandExceptionType((Message)new Class2259("commands.data.entity.invalid", new Object[0]));
        field22586 = (s -> new Class6597(s));
    }
}
