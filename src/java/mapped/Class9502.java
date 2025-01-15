// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.google.gson.JsonParseException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class9502 implements ArgumentType<Class2250>
{
    private static final Collection<String> field40881;
    public static final DynamicCommandExceptionType field40882;
    
    private Class9502() {
    }
    
    public static Class2250 method35389(final CommandContext<Class7492> commandContext, final String s) {
        return (Class2250)commandContext.getArgument(s, (Class)Class2250.class);
    }
    
    public static Class9502 method35390() {
        return new Class9502();
    }
    
    public Class2250 parse(final StringReader stringReader) throws CommandSyntaxException {
        try {
            final Class2250 method17874 = Class5953.method17874(stringReader);
            if (method17874 == null) {
                throw Class9502.field40882.createWithContext((ImmutableStringReader)stringReader, (Object)"empty");
            }
            return method17874;
        }
        catch (final JsonParseException ex) {
            throw Class9502.field40882.createWithContext((ImmutableStringReader)stringReader, (Object)((ex.getCause() != null) ? ex.getCause().getMessage() : ex.getMessage()));
        }
    }
    
    public Collection<String> getExamples() {
        return Class9502.field40881;
    }
    
    static {
        field40881 = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
        field40882 = new DynamicCommandExceptionType(o -> {
            new Class2259("argument.component.invalid", new Object[] { o });
            return;
        });
    }
}
