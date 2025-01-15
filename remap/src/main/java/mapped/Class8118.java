// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.context.CommandContext;
import java.util.function.Supplier;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import java.util.function.BiConsumer;

public class Class8118 extends Class8117<Class8118>
{
    private int field33454;
    
    private static Class8455<Class8118> method26713(final int n, final BiConsumer<Class394, Class8118> biConsumer) {
        return new Class8455<Class8118>(IntegerArgumentType::integer, class8455 -> new Class8118(class8455, n2), biConsumer, null);
    }
    
    private static Class8455<Class8118> method26714(final int n) {
        return method26713(n, (p0, p1) -> {});
    }
    
    public Class8118(final Class8455<Class8118> class8455, final int field33454) {
        super(class8455);
        this.field33454 = field33454;
    }
    
    @Override
    public void method26706(final CommandContext<Class7492> commandContext, final String s) {
        this.field33454 = IntegerArgumentType.getInteger((CommandContext)commandContext, s);
    }
    
    public int method26715() {
        return this.field33454;
    }
    
    @Override
    public String method26710() {
        return Integer.toString(this.field33454);
    }
    
    @Override
    public void method26709(final String s) {
        this.field33454 = method26716(s);
    }
    
    private static int method26716(final String s) {
        if (!s.isEmpty()) {
            try {
                return Integer.parseInt(s);
            }
            catch (final NumberFormatException ex) {
                Class8878.method31225().warn("Failed to parse integer {}", (Object)s);
            }
        }
        return 0;
    }
    
    @Override
    public int method26711() {
        return this.field33454;
    }
    
    public Class8118 method26717() {
        return this;
    }
}
