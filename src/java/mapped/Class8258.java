// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.mojang.brigadier.Message;
import java.util.function.Predicate;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import com.mojang.brigadier.arguments.ArgumentType;

public class Class8258 implements ArgumentType<Class8570>
{
    private static final Collection<String> field33907;
    public static final SimpleCommandExceptionType field33908;
    public static final DynamicCommandExceptionType field33909;
    
    public static Class8258 method27403() {
        return new Class8258();
    }
    
    public static Class8570 method27404(final CommandContext<Class7492> commandContext, final String s) {
        return (Class8570)commandContext.getArgument(s, (Class)Class8570.class);
    }
    
    public Class8570 parse(final StringReader stringReader) throws CommandSyntaxException {
        final ArrayList arrayList = Lists.newArrayList();
        final int cursor = stringReader.getCursor();
        final Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        boolean b = true;
        while (stringReader.canRead() && stringReader.peek() != ' ') {
            final Class6102 method27405 = method27405(stringReader, b);
            arrayList.add(method27405);
            ((Object2IntMap)object2IntOpenHashMap).put((Object)method27405, stringReader.getCursor() - cursor);
            b = false;
            if (!stringReader.canRead()) {
                continue;
            }
            final char peek = stringReader.peek();
            if (peek == ' ') {
                continue;
            }
            if (peek == '[') {
                continue;
            }
            if (peek == '{') {
                continue;
            }
            stringReader.expect('.');
        }
        return new Class8570(stringReader.getString().substring(cursor, stringReader.getCursor()), (Class6102[])arrayList.toArray(new Class6102[0]), (Object2IntMap<Class6102>)object2IntOpenHashMap);
    }
    
    private static Class6102 method27405(final StringReader stringReader, final boolean b) throws CommandSyntaxException {
        switch (stringReader.peek()) {
            case '\"': {
                return method27406(stringReader, stringReader.readString());
            }
            case '[': {
                stringReader.skip();
                final char peek = stringReader.peek();
                if (peek == '{') {
                    final Class51 method16945 = new Class5704(stringReader).method16945();
                    stringReader.expect(']');
                    return new Class6107(method16945);
                }
                if (peek == ']') {
                    stringReader.skip();
                    return Class6101.field24757;
                }
                final int int1 = stringReader.readInt();
                stringReader.expect(']');
                return new Class6103(int1);
            }
            case '{': {
                if (!b) {
                    throw Class8258.field33908.createWithContext((ImmutableStringReader)stringReader);
                }
                return new Class6104(new Class5704(stringReader).method16945());
            }
            default: {
                return method27406(stringReader, method27407(stringReader));
            }
        }
    }
    
    private static Class6102 method27406(final StringReader stringReader, final String s) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '{') {
            return new Class6105(s, new Class5704(stringReader).method16945());
        }
        return new Class6106(s);
    }
    
    private static String method27407(final StringReader stringReader) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead() && method27408(stringReader.peek())) {
            stringReader.skip();
        }
        if (stringReader.getCursor() != cursor) {
            return stringReader.getString().substring(cursor, stringReader.getCursor());
        }
        throw Class8258.field33908.createWithContext((ImmutableStringReader)stringReader);
    }
    
    public Collection<String> getExamples() {
        return Class8258.field33907;
    }
    
    private static boolean method27408(final char c) {
        if (c != ' ') {
            if (c != '\"') {
                if (c != '[') {
                    if (c != ']') {
                        if (c != '.') {
                            if (c != '{') {
                                if (c != '}') {
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
    
    private static Predicate<Class41> method27409(final Class51 class51) {
        return class53 -> Class9346.method34642(class52, class53, true);
    }
    
    static {
        field33907 = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
        field33908 = new SimpleCommandExceptionType((Message)new Class2259("arguments.nbtpath.node.invalid", new Object[0]));
        field33909 = new DynamicCommandExceptionType(o -> {
            new Class2259("arguments.nbtpath.nothing_found", new Object[] { o });
            return;
        });
    }
}
