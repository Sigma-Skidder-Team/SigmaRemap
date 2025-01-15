// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class7000 implements ArgumentType<Class1932>
{
    private static final Collection<String> field27308;
    private static final DynamicCommandExceptionType field27309;
    private static final DynamicCommandExceptionType field27310;
    private static final DynamicCommandExceptionType field27311;
    
    public static Class7000 method21429() {
        return new Class7000();
    }
    
    public static Class8863 method21430(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final Class1932 class1932 = (Class1932)commandContext.getArgument(s, (Class)Class1932.class);
        final Class8863 method6398 = ((Class7492)commandContext.getSource()).method23255().method1566().method6398(class1932);
        if (method6398 != null) {
            return method6398;
        }
        throw Class7000.field27309.create((Object)class1932);
    }
    
    public static Class3662<?> method21431(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        return (Class3662)((Class7492)commandContext.getSource()).method23255().method1577().method6382((Class1932)commandContext.getArgument(s, (Class)Class1932.class)).orElseThrow(() -> Class7000.field27310.create((Object)class1932));
    }
    
    public static Class122 method21432(final CommandContext<Class7492> commandContext, final String s) throws CommandSyntaxException {
        final Class1932 class1932 = (Class1932)commandContext.getArgument(s, (Class)Class1932.class);
        final Class122 method6409 = ((Class7492)commandContext.getSource()).method23255().method1582().method6409(class1932);
        if (method6409 != null) {
            return method6409;
        }
        throw Class7000.field27311.create((Object)class1932);
    }
    
    public static Class1932 method21433(final CommandContext<Class7492> commandContext, final String s) {
        return (Class1932)commandContext.getArgument(s, (Class)Class1932.class);
    }
    
    public Class1932 parse(final StringReader stringReader) throws CommandSyntaxException {
        return Class1932.method7799(stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class7000.field27308;
    }
    
    static {
        field27308 = Arrays.asList("foo", "foo:bar", "012");
        field27309 = new DynamicCommandExceptionType(o -> {
            new Class2259("advancement.advancementNotFound", new Object[] { o });
            return;
        });
        field27310 = new DynamicCommandExceptionType(o3 -> {
            new Class2259("recipe.notFound", new Object[] { o3 });
            return;
        });
        field27311 = new DynamicCommandExceptionType(o5 -> {
            new Class2259("predicate.unknown", new Object[] { o5 });
            return;
        });
    }
}
