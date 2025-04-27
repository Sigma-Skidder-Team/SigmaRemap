// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.function.Supplier;
import java.util.function.Function;
import com.mojang.brigadier.StringReader;
import java.util.function.BiFunction;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonNull;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public abstract class Class8684<T extends Number>
{
    public static final SimpleCommandExceptionType field36495;
    public static final SimpleCommandExceptionType field36496;
    public final T field36497;
    public final T field36498;
    
    public Class8684(final T field36497, final T field36498) {
        this.field36497 = field36497;
        this.field36498 = field36498;
    }
    
    @Nullable
    public T method29742() {
        return this.field36497;
    }
    
    @Nullable
    public T method29743() {
        return this.field36498;
    }
    
    public boolean method29744() {
        return this.field36497 == null && this.field36498 == null;
    }
    
    public JsonElement method29745() {
        if (this.method29744()) {
            return JsonNull.INSTANCE;
        }
        if (this.field36497 != null && this.field36497.equals(this.field36498)) {
            return new JsonPrimitive(this.field36497);
        }
        final JsonObject jsonObject = new JsonObject();
        if (this.field36497 != null) {
            jsonObject.addProperty("min", this.field36497);
        }
        if (this.field36498 != null) {
            jsonObject.addProperty("max", this.field36498);
        }
        return jsonObject;
    }
    
    public static <T extends Number, R extends Class8684<T>> R method29746(final JsonElement jsonElement, final R r, final BiFunction<JsonElement, String, T> biFunction, final Class9321<T, R> class9321) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return r;
        }
        if (!Class9583.method35889(jsonElement)) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "value");
            return class9321.method34521(method35913.has("min") ? biFunction.apply(method35913.get("min"), "min") : null, method35913.has("max") ? biFunction.apply(method35913.get("max"), "max") : null);
        }
        final Number n = biFunction.apply(jsonElement, "value");
        return class9321.method34521((T)n, (T)n);
    }
    
    public static <T extends Number, R extends Class8684<T>> R method29747(final StringReader stringReader, final Class8561<T, R> class8561, final Function<String, T> function, final Supplier<DynamicCommandExceptionType> supplier, final Function<T, T> function2) throws CommandSyntaxException {
        if (!stringReader.canRead()) {
            throw Class8684.field36495.createWithContext(stringReader);
        }
        final int cursor = stringReader.getCursor();
        try {
            final Number n = method29750(method29748(stringReader, function, supplier), function2);
            Number n2;
            if (stringReader.canRead(2) && stringReader.peek() == '.' && stringReader.peek(1) == '.') {
                stringReader.skip();
                stringReader.skip();
                n2 = method29750(method29748(stringReader, function, supplier), function2);
                if (n == null && n2 == null) {
                    throw Class8684.field36495.createWithContext(stringReader);
                }
            }
            else {
                n2 = n;
            }
            if (n == null && n2 == null) {
                throw Class8684.field36495.createWithContext(stringReader);
            }
            return class8561.method28779(stringReader, (T)n, (T)n2);
        }
        catch (final CommandSyntaxException ex) {
            stringReader.setCursor(cursor);
            throw new CommandSyntaxException(ex.getType(), ex.getRawMessage(), ex.getInput(), cursor);
        }
    }
    
    @Nullable
    private static <T extends Number> T method29748(final StringReader stringReader, final Function<String, T> function, final Supplier<DynamicCommandExceptionType> supplier) throws CommandSyntaxException {
        final int cursor = stringReader.getCursor();
        while (stringReader.canRead() && method29749(stringReader)) {
            stringReader.skip();
        }
        final String substring = stringReader.getString().substring(cursor, stringReader.getCursor());
        if (substring.isEmpty()) {
            return null;
        }
        try {
            return function.apply(substring);
        }
        catch (final NumberFormatException ex) {
            throw supplier.get().createWithContext(stringReader, substring);
        }
    }
    
    private static boolean method29749(final StringReader stringReader) {
        final char peek = stringReader.peek();
        if (peek < '0' || peek > '9') {
            if (peek != '-') {
                return peek == '.' && (!stringReader.canRead(2) || stringReader.peek(1) != '.');
            }
        }
        return true;
    }
    
    @Nullable
    private static <T> T method29750(final T t, final Function<T, T> function) {
        return (t != null) ? function.apply(t) : null;
    }
    
    static {
        field36495 = new SimpleCommandExceptionType(new Class2259("argument.range.empty", new Object[0]));
        field36496 = new SimpleCommandExceptionType(new Class2259("argument.range.swapped", new Object[0]));
    }
}
