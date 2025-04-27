// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

import com.mojang.datafixers.util.Either;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class9179 implements ArgumentType<Class8279>
{
    private static final Collection<String> field38896;
    private static final DynamicCommandExceptionType field38897;
    private static final DynamicCommandExceptionType field38898;
    
    public static Class9179 method33537() {
        return new Class9179();
    }
    
    public Class8279 parse(final StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '#') {
            stringReader.skip();
            return new Class8280(this, ResourceLocation.method7799(stringReader));
        }
        return new Class8278(this, ResourceLocation.method7799(stringReader));
    }
    
    private static Class8263 method33538(final CommandContext<Class7492> commandContext, final ResourceLocation class1932) throws CommandSyntaxException {
        return commandContext.getSource().method23255().method1567().method6502(class1932).orElseThrow(() -> Class9179.field38898.create((Object)class1933.toString()));
    }
    
    private static Class7909<Class8263> method33539(final CommandContext<Class7492> commandContext, final ResourceLocation class1932) throws CommandSyntaxException {
        final Class7909<Class8263> method18460 = commandContext.getSource().method23255().method1567().method6513().method18460(class1932);
        if (method18460 != null) {
            return method18460;
        }
        throw Class9179.field38897.create(class1932.toString());
    }
    
    public static Collection<Class8263> method33540(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class8279)commandContext.getArgument(s, (Class)Class8279.class)).method27517(commandContext);
    }
    
    public static Either<Class8263, Class7909<Class8263>> method33541(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return ((Class8279)commandContext.getArgument(s, (Class)Class8279.class)).method27518(commandContext);
    }
    
    public Collection<String> getExamples() {
        return Class9179.field38896;
    }
    
    static {
        field38896 = Arrays.asList("foo", "foo:bar", "#foo");
        field38897 = new DynamicCommandExceptionType(o -> {
            new Class2259("arguments.function.tag.unknown", o);
            return;
        });
        field38898 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("arguments.function.unknown", o3);
            return;
        });
    }
}
