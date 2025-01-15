// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;
import net.minecraft.entity.EntityType;

public class Class8605 implements ArgumentType<Class1932>
{
    private static final Collection<String> field36122;
    public static final DynamicCommandExceptionType field36123;
    
    public static Class8605 method29180() {
        return new Class8605();
    }
    
    public static Class1932 method29181(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return method29182((Class1932)commandContext.getArgument(s, (Class)Class1932.class));
    }
    
    private static Class1932 method29182(final Class1932 class1932) throws CommandSyntaxException {
        Class90.field210.method506(class1932).filter(EntityType::method23362).orElseThrow(() -> Class8605.field36123.create((Object)class1933));
        return class1932;
    }
    
    public Class1932 parse(final StringReader stringReader) throws CommandSyntaxException {
        return method29182(Class1932.method7799(stringReader));
    }
    
    public Collection<String> getExamples() {
        return Class8605.field36122;
    }
    
    static {
        field36122 = Arrays.asList("minecraft:pig", "cow");
        field36123 = new DynamicCommandExceptionType(o -> {
            new Class2259("entity.notFound", new Object[] { o });
            return;
        });
    }
}
