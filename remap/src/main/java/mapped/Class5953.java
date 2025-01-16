// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Reader;
import com.google.gson.stream.JsonReader;
import com.mojang.brigadier.StringReader;
import javax.annotation.Nullable;
import com.google.gson.JsonPrimitive;
import java.util.Map;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import java.lang.reflect.Field;
import com.google.gson.Gson;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponent;

public class Class5953 implements JsonDeserializer<ITextComponent>, JsonSerializer<ITextComponent>
{
    private static final Gson field24452;
    private static final Field field24453;
    private static final Field field24454;
    
    public ITextComponent deserialize(final JsonElement obj, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (obj.isJsonPrimitive()) {
            return new StringTextComponent(obj.getAsString());
        }
        if (obj.isJsonObject()) {
            final JsonObject asJsonObject = obj.getAsJsonObject();
            TextComponent class2251;
            if (!asJsonObject.has("text")) {
                if (!asJsonObject.has("translate")) {
                    if (!asJsonObject.has("score")) {
                        if (!asJsonObject.has("selector")) {
                            if (!asJsonObject.has("keybind")) {
                                if (!asJsonObject.has("nbt")) {
                                    throw new JsonParseException("Don't know how to turn " + obj + " into a Component");
                                }
                                final String method35895 = Class9583.method35895(asJsonObject, "nbt");
                                final boolean method35896 = Class9583.method35901(asJsonObject, "interpret", false);
                                if (!asJsonObject.has("block")) {
                                    if (!asJsonObject.has("entity")) {
                                        if (!asJsonObject.has("storage")) {
                                            throw new JsonParseException("Don't know how to turn " + obj + " into a Component");
                                        }
                                        class2251 = new Class2258(method35895, method35896, new ResourceLocation(Class9583.method35895(asJsonObject, "storage")));
                                    }
                                    else {
                                        class2251 = new Class2256(method35895, method35896, Class9583.method35895(asJsonObject, "entity"));
                                    }
                                }
                                else {
                                    class2251 = new Class2257(method35895, method35896, Class9583.method35895(asJsonObject, "block"));
                                }
                            }
                            else {
                                class2251 = new Class2261(Class9583.method35895(asJsonObject, "keybind"));
                            }
                        }
                        else {
                            class2251 = new Class2252(Class9583.method35895(asJsonObject, "selector"));
                        }
                    }
                    else {
                        final JsonObject method35897 = Class9583.method35914(asJsonObject, "score");
                        if (!method35897.has("name") || !method35897.has("objective")) {
                            throw new JsonParseException("A score component needs a least a name and an objective");
                        }
                        class2251 = new Class2254(Class9583.method35895(method35897, "name"), Class9583.method35895(method35897, "objective"));
                        if (method35897.has("value")) {
                            ((Class2254)class2251).method8477(Class9583.method35895(method35897, "value"));
                        }
                    }
                }
                else {
                    final String method35898 = Class9583.method35895(asJsonObject, "translate");
                    if (!asJsonObject.has("with")) {
                        class2251 = new Class2259(method35898, new Object[0]);
                    }
                    else {
                        final JsonArray method35899 = Class9583.method35917(asJsonObject, "with");
                        final Object[] array = new Object[method35899.size()];
                        for (int i = 0; i < array.length; ++i) {
                            array[i] = this.deserialize(method35899.get(i), type, jsonDeserializationContext);
                            if (array[i] instanceof StringTextComponent) {
                                final StringTextComponent class2252 = (StringTextComponent)array[i];
                                if (class2252.getStyle().method30409()) {
                                    if (class2252.getSiblings().isEmpty()) {
                                        array[i] = class2252.getText();
                                    }
                                }
                            }
                        }
                        class2251 = new Class2259(method35898, array);
                    }
                }
            }
            else {
                class2251 = new StringTextComponent(Class9583.method35895(asJsonObject, "text"));
            }
            if (asJsonObject.has("extra")) {
                final JsonArray method35900 = Class9583.method35917(asJsonObject, "extra");
                if (method35900.size() <= 0) {
                    throw new JsonParseException("Unexpected empty array of components");
                }
                for (int j = 0; j < method35900.size(); ++j) {
                    class2251.appendSibling(this.deserialize(method35900.get(j), type, jsonDeserializationContext));
                }
            }
            class2251.setStyle((Style)jsonDeserializationContext.deserialize(obj, (Type) Style.class));
            return class2251;
        }
        if (!obj.isJsonArray()) {
            throw new JsonParseException("Don't know how to turn " + obj + " into a Component");
        }
        final JsonArray asJsonArray = obj.getAsJsonArray();
        ITextComponent class2253 = null;
        for (final JsonElement jsonElement : asJsonArray) {
            final ITextComponent deserialize = this.deserialize(jsonElement, jsonElement.getClass(), jsonDeserializationContext);
            if (class2253 != null) {
                class2253.appendSibling(deserialize);
            }
            else {
                class2253 = deserialize;
            }
        }
        return class2253;
    }
    
    private void method17868(final Style class8768, final JsonObject jsonObject, final JsonSerializationContext jsonSerializationContext) {
        final JsonElement serialize = jsonSerializationContext.serialize((Object)class8768);
        if (serialize.isJsonObject()) {
            for (final Map.Entry<String, V> entry : ((JsonObject)serialize).entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }
    
    public JsonElement serialize(final ITextComponent class2250, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        if (!class2250.getStyle().method30409()) {
            this.method17868(class2250.getStyle(), jsonObject, jsonSerializationContext);
        }
        if (!class2250.getSiblings().isEmpty()) {
            final JsonArray jsonArray = new JsonArray();
            for (final ITextComponent class2251 : class2250.getSiblings()) {
                jsonArray.add(this.serialize(class2251, class2251.getClass(), jsonSerializationContext));
            }
            jsonObject.add("extra", (JsonElement)jsonArray);
        }
        if (!(class2250 instanceof StringTextComponent)) {
            if (!(class2250 instanceof Class2259)) {
                if (!(class2250 instanceof Class2254)) {
                    if (!(class2250 instanceof Class2252)) {
                        if (!(class2250 instanceof Class2261)) {
                            if (!(class2250 instanceof Class2255)) {
                                throw new IllegalArgumentException("Don't know how to serialize " + class2250 + " as a Component");
                            }
                            final Class2255 class2252 = (Class2255)class2250;
                            jsonObject.addProperty("nbt", class2252.method8482());
                            jsonObject.addProperty("interpret", Boolean.valueOf(class2252.method8483()));
                            if (!(class2250 instanceof Class2257)) {
                                if (!(class2250 instanceof Class2256)) {
                                    if (!(class2250 instanceof Class2258)) {
                                        throw new IllegalArgumentException("Don't know how to serialize " + class2250 + " as a Component");
                                    }
                                    jsonObject.addProperty("storage", ((Class2258)class2250).method8491().toString());
                                }
                                else {
                                    jsonObject.addProperty("entity", ((Class2256)class2250).method8488());
                                }
                            }
                            else {
                                jsonObject.addProperty("block", ((Class2257)class2250).method8490());
                            }
                        }
                        else {
                            jsonObject.addProperty("keybind", ((Class2261)class2250).method8501());
                        }
                    }
                    else {
                        jsonObject.addProperty("selector", ((Class2252)class2250).method8472());
                    }
                }
                else {
                    final Class2254 class2253 = (Class2254)class2250;
                    final JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("name", class2253.method8475());
                    jsonObject2.addProperty("objective", class2253.method8476());
                    jsonObject2.addProperty("value", class2253.getUnformattedComponentText());
                    jsonObject.add("score", (JsonElement)jsonObject2);
                }
            }
            else {
                final Class2259 class2254 = (Class2259)class2250;
                jsonObject.addProperty("translate", class2254.method8496());
                if (class2254.method8497() != null) {
                    if (class2254.method8497().length > 0) {
                        final JsonArray jsonArray2 = new JsonArray();
                        for (final Object obj : class2254.method8497()) {
                            if (!(obj instanceof ITextComponent)) {
                                jsonArray2.add((JsonElement)new JsonPrimitive(String.valueOf(obj)));
                            }
                            else {
                                jsonArray2.add(this.serialize((ITextComponent)obj, ((ITextComponent)obj).getClass(), jsonSerializationContext));
                            }
                        }
                        jsonObject.add("with", (JsonElement)jsonArray2);
                    }
                }
            }
        }
        else {
            jsonObject.addProperty("text", ((StringTextComponent)class2250).getText());
        }
        return (JsonElement)jsonObject;
    }
    
    public static String method17869(final ITextComponent class2250) {
        return Class5953.field24452.toJson((Object)class2250);
    }
    
    public static JsonElement method17870(final ITextComponent class2250) {
        return Class5953.field24452.toJsonTree((Object)class2250);
    }
    
    @Nullable
    public static ITextComponent method17871(final String s) {
        return Class9583.method35925(Class5953.field24452, s, ITextComponent.class, false);
    }
    
    @Nullable
    public static ITextComponent method17872(final JsonElement jsonElement) {
        return (ITextComponent)Class5953.field24452.fromJson(jsonElement, (Class) ITextComponent.class);
    }
    
    @Nullable
    public static ITextComponent method17873(final String s) {
        return Class9583.method35925(Class5953.field24452, s, ITextComponent.class, true);
    }
    
    public static ITextComponent method17874(final StringReader stringReader) {
        try {
            final JsonReader jsonReader = new JsonReader((Reader)new java.io.StringReader(stringReader.getRemaining()));
            jsonReader.setLenient(false);
            final ITextComponent class2250 = (ITextComponent)Class5953.field24452.getAdapter((Class) ITextComponent.class).read(jsonReader);
            stringReader.setCursor(stringReader.getCursor() + method17875(jsonReader));
            return class2250;
        }
        catch (final StackOverflowError | IOException ex) {
            throw new JsonParseException((Throwable)ex);
        }
    }
    
    private static int method17875(final JsonReader jsonReader) {
        try {
            return Class5953.field24453.getInt(jsonReader) - Class5953.field24454.getInt(jsonReader) + 1;
        }
        catch (final IllegalAccessException cause) {
            throw new IllegalStateException("Couldn't read position of JsonReader", cause);
        }
    }
    
    static {
        field24452 = Util.method27850(() -> {
            final GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.disableHtmlEscaping();
            gsonBuilder.registerTypeHierarchyAdapter((Class) ITextComponent.class, (Object)new Class5953());
            gsonBuilder.registerTypeHierarchyAdapter((Class) Style.class, (Object)new Class5982());
            gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new Class8818());
            return gsonBuilder.create();
        });
        field24453 = Util.method27850(() -> {
            try {
                new JsonReader((Reader)new java.io.StringReader(""));
                JsonReader.class.getDeclaredField("pos");
                final Field field24455;
                field24455.setAccessible(true);
                return field24455;
            }
            catch (final NoSuchFieldException cause) {
                throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", cause);
            }
        });
        field24454 = Util.method27850(() -> {
            try {
                new JsonReader((Reader)new java.io.StringReader(""));
                JsonReader.class.getDeclaredField("lineStart");
                final Field field24456;
                field24456.setAccessible(true);
                return field24456;
            }
            catch (final NoSuchFieldException cause2) {
                throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", cause2);
            }
        });
    }
}
