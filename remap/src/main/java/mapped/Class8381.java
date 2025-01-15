// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import java.util.Iterator;
import com.google.gson.JsonArray;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.CommandDispatcher;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import java.util.function.Supplier;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class8381
{
    private static final Logger field34361;
    private static final Map<Class<?>, Class6219<?>> field34362;
    private static final Map<Class1932, Class6219<?>> field34363;
    
    public static <T extends ArgumentType<?>> void method27930(final String s, final Class<T> clazz, final Class6672<T> class6672) {
        final Class1932 obj = new Class1932(s);
        if (Class8381.field34362.containsKey(clazz)) {
            throw new IllegalArgumentException("Class " + clazz.getName() + " already has a serializer!");
        }
        if (!Class8381.field34363.containsKey(obj)) {
            final Class6219 class6673 = new Class6219(clazz, class6672, obj, null);
            Class8381.field34362.put(clazz, class6673);
            Class8381.field34363.put(obj, class6673);
            return;
        }
        throw new IllegalArgumentException("'" + obj + "' is already a registered serializer!");
    }
    
    public static void method27931() {
        Class7126.method21868();
        method27930("entity", (Class<ArgumentType>)Class6886.class, (Class6672<ArgumentType>)new Class6677());
        method27930("game_profile", (Class<ArgumentType>)Class8740.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8740::method30191));
        method27930("block_pos", (Class<ArgumentType>)Class8330.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8330::method27767));
        method27930("column_pos", (Class<ArgumentType>)Class7734.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7734::method24682));
        method27930("vec3", (Class<ArgumentType>)Class7555.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7555::method23719));
        method27930("vec2", (Class<ArgumentType>)Class8930.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8930::method31491));
        method27930("block_state", (Class<ArgumentType>)Class8450.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8450::method28195));
        method27930("block_predicate", (Class<ArgumentType>)Class8808.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8808::method30732));
        method27930("item_stack", (Class<ArgumentType>)Class6767.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class6767::method20638));
        method27930("item_predicate", (Class<ArgumentType>)Class9508.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9508::method35422));
        method27930("color", (Class<ArgumentType>)Class6066.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class6066::method18116));
        method27930("component", (Class<ArgumentType>)Class9502.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9502::method35390));
        method27930("message", (Class<ArgumentType>)Class8695.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8695::method29806));
        method27930("nbt_compound_tag", (Class<ArgumentType>)Class7418.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7418::method22831));
        method27930("nbt_tag", (Class<ArgumentType>)Class9136.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9136::method33309));
        method27930("nbt_path", (Class<ArgumentType>)Class8258.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8258::method27403));
        method27930("objective", (Class<ArgumentType>)Class8717.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8717::method29933));
        method27930("objective_criteria", (Class<ArgumentType>)Class9286.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9286::method34274));
        method27930("operation", (Class<ArgumentType>)Class6662.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class6662::method20250));
        method27930("particle", (Class<ArgumentType>)Class7384.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7384::method22672));
        method27930("rotation", (Class<ArgumentType>)Class8919.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8919::method31444));
        method27930("scoreboard_slot", (Class<ArgumentType>)Class7675.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7675::method24361));
        method27930("score_holder", (Class<ArgumentType>)Class7456.class, (Class6672<ArgumentType>)new Class6680());
        method27930("swizzle", (Class<ArgumentType>)Class8148.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8148::method26843));
        method27930("team", (Class<ArgumentType>)Class7725.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7725::method24662));
        method27930("item_slot", (Class<ArgumentType>)Class8631.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8631::method29295));
        method27930("resource_location", (Class<ArgumentType>)Class7000.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class7000::method21429));
        method27930("mob_effect", (Class<ArgumentType>)Class6877.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class6877::method21044));
        method27930("function", (Class<ArgumentType>)Class9179.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9179::method33537));
        method27930("entity_anchor", (Class<ArgumentType>)Class8316.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8316::method27606));
        method27930("int_range", (Class<ArgumentType>)Class6808.class, (Class6672<ArgumentType>)new Class6669());
        method27930("float_range", (Class<ArgumentType>)Class6806.class, (Class6672<ArgumentType>)new Class6671());
        method27930("item_enchantment", (Class<ArgumentType>)Class9162.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9162::method33443));
        method27930("entity_summon", (Class<ArgumentType>)Class8605.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8605::method29180));
        method27930("dimension", (Class<ArgumentType>)Class9437.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class9437::method35067));
        method27930("time", (Class<ArgumentType>)Class8590.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8590::method29089));
        if (Class9528.field41021) {
            method27930("test_argument", (Class<ArgumentType>)Class8487.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8487::method28341));
            method27930("test_class", (Class<ArgumentType>)Class8894.class, new Class6674<ArgumentType>((Supplier<ArgumentType>)Class8894::method31306));
        }
    }
    
    @Nullable
    private static Class6219<?> method27932(final Class1932 class1932) {
        return Class8381.field34363.get(class1932);
    }
    
    @Nullable
    private static Class6219<?> method27933(final ArgumentType<?> argumentType) {
        return Class8381.field34362.get(argumentType.getClass());
    }
    
    public static <T extends ArgumentType<?>> void method27934(final PacketBuffer class8654, final T t) {
        final Class6219<?> method27933 = method27933(t);
        if (method27933 != null) {
            class8654.method29517(method27933.field25072);
            method27933.field25071.method20301(t, class8654);
        }
        else {
            Class8381.field34361.error("Could not serialize {} ({}) - will not be sent to client!", (Object)t, (Object)t.getClass());
            class8654.method29517(new Class1932(""));
        }
    }
    
    @Nullable
    public static ArgumentType<?> method27935(final PacketBuffer class8654) {
        final Class1932 method29516 = class8654.method29516();
        final Class6219<?> method29517 = method27932(method29516);
        if (method29517 != null) {
            return (ArgumentType<?>)method29517.field25071.method20297(class8654);
        }
        Class8381.field34361.error("Could not deserialize {}", (Object)method29516);
        return null;
    }
    
    private static <T extends ArgumentType<?>> void method27936(final JsonObject jsonObject, final T t) {
        final Class6219<?> method27933 = method27933(t);
        if (method27933 != null) {
            jsonObject.addProperty("type", "argument");
            jsonObject.addProperty("parser", method27933.field25072.toString());
            final JsonObject jsonObject2 = new JsonObject();
            method27933.field25071.method20300(t, jsonObject2);
            if (jsonObject2.size() > 0) {
                jsonObject.add("properties", (JsonElement)jsonObject2);
            }
        }
        else {
            Class8381.field34361.error("Could not serialize argument {} ({})!", (Object)t, (Object)t.getClass());
            jsonObject.addProperty("type", "unknown");
        }
    }
    
    public static <S> JsonObject method27937(final CommandDispatcher<S> commandDispatcher, final CommandNode<S> commandNode) {
        final JsonObject jsonObject = new JsonObject();
        if (!(commandNode instanceof RootCommandNode)) {
            if (!(commandNode instanceof LiteralCommandNode)) {
                if (!(commandNode instanceof ArgumentCommandNode)) {
                    Class8381.field34361.error("Could not serialize node {} ({})!", (Object)commandNode, (Object)commandNode.getClass());
                    jsonObject.addProperty("type", "unknown");
                }
                else {
                    method27936(jsonObject, ((ArgumentCommandNode)commandNode).getType());
                }
            }
            else {
                jsonObject.addProperty("type", "literal");
            }
        }
        else {
            jsonObject.addProperty("type", "root");
        }
        final JsonObject jsonObject2 = new JsonObject();
        for (final CommandNode commandNode2 : commandNode.getChildren()) {
            jsonObject2.add(commandNode2.getName(), (JsonElement)method27937((com.mojang.brigadier.CommandDispatcher<Object>)commandDispatcher, (com.mojang.brigadier.tree.CommandNode<Object>)commandNode2));
        }
        if (jsonObject2.size() > 0) {
            jsonObject.add("children", (JsonElement)jsonObject2);
        }
        if (commandNode.getCommand() != null) {
            jsonObject.addProperty("executable", Boolean.valueOf(true));
        }
        if (commandNode.getRedirect() != null) {
            final Collection path = commandDispatcher.getPath(commandNode.getRedirect());
            if (!path.isEmpty()) {
                final JsonArray jsonArray = new JsonArray();
                final Iterator iterator2 = path.iterator();
                while (iterator2.hasNext()) {
                    jsonArray.add((String)iterator2.next());
                }
                jsonObject.add("redirect", (JsonElement)jsonArray);
            }
        }
        return jsonObject;
    }
    
    static {
        field34361 = LogManager.getLogger();
        field34362 = Maps.newHashMap();
        field34363 = Maps.newHashMap();
    }
}
