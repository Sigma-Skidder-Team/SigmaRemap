package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5398 {
   private static final Logger field_27562 = LogManager.getLogger();
   private static final Map<Class<?>, class_5511<?>> field_27561 = Maps.newHashMap();
   private static final Map<Identifier, class_5511<?>> field_27560 = Maps.newHashMap();

   public static <T extends ArgumentType<?>> void method_24581(String var0, Class<T> var1, class_5590<T> var2) {
      Identifier var5 = new Identifier(var0);
      if (!field_27561.containsKey(var1)) {
         if (!field_27560.containsKey(var5)) {
            class_5511 var6 = new class_5511(var1, var2, var5, null);
            field_27561.put(var1, var6);
            field_27560.put(var5, var6);
         } else {
            throw new IllegalArgumentException("'" + var5 + "' is already a registered serializer!");
         }
      } else {
         throw new IllegalArgumentException("Class " + var1.getName() + " already has a serializer!");
      }
   }

   public static void method_24580() {
      class_621.method_2899();
      method_24581("entity", class_5601.class, new class_58());
      method_24581("game_profile", class_2490.class, new class_383(class_2490::method_11397));
      method_24581("block_pos", class_1024.class, new class_383(class_1024::method_4522));
      method_24581("column_pos", class_5565.class, new class_383(class_5565::method_25275));
      method_24581("vec3", class_1029.class, new class_383(class_1029::method_4556));
      method_24581("vec2", class_1843.class, new class_383(class_1843::method_8148));
      method_24581("block_state", class_3190.class, new class_383(class_3190::method_14683));
      method_24581("block_predicate", class_2061.class, new class_383(class_2061::method_9620));
      method_24581("item_stack", class_5663.class, new class_383(class_5663::method_25627));
      method_24581("item_predicate", class_2268.class, new class_383(class_2268::method_10470));
      method_24581("color", class_2215.class, new class_383(class_2215::method_10243));
      method_24581("component", class_3352.class, new class_383(class_3352::method_15361));
      method_24581("message", class_1282.class, new class_383(class_1282::method_5728));
      method_24581("nbt_compound_tag", class_9646.class, new class_383(class_9646::method_44519));
      method_24581("nbt_tag", class_5874.class, new class_383(class_5874::method_26749));
      method_24581("nbt_path", class_4235.class, new class_383(class_4235::method_19750));
      method_24581("objective", class_7728.class, new class_383(class_7728::method_34976));
      method_24581("objective_criteria", class_4385.class, new class_383(class_4385::method_20444));
      method_24581("operation", class_1103.class, new class_383(class_1103::method_4906));
      method_24581("particle", class_3469.class, new class_383(class_3469::method_15951));
      method_24581("angle", class_6919.class, new class_383(class_6919::method_31676));
      method_24581("rotation", class_3030.class, new class_383(class_3030::method_13831));
      method_24581("scoreboard_slot", class_9161.class, new class_383(class_9161::method_42209));
      method_24581("score_holder", class_2282.class, new class_620());
      method_24581("swizzle", class_8834.class, new class_383(class_8834::method_40633));
      method_24581("team", class_6868.class, new class_383(class_6868::method_31509));
      method_24581("item_slot", class_237.class, new class_383(class_237::method_1011));
      method_24581("resource_location", class_4195.class, new class_383(class_4195::method_19515));
      method_24581("mob_effect", class_8493.class, new class_383(class_8493::method_39144));
      method_24581("function", class_2222.class, new class_383(class_2222::method_10260));
      method_24581("entity_anchor", class_7386.class, new class_383(class_7386::method_33644));
      method_24581("int_range", class_6640.class, new class_383(class_5303::method_24233));
      method_24581("float_range", class_5132.class, new class_383(class_5303::method_24234));
      method_24581("item_enchantment", class_8755.class, new class_383(class_8755::method_40199));
      method_24581("entity_summon", class_2819.class, new class_383(class_2819::method_12842));
      method_24581("dimension", class_6937.class, new class_383(class_6937::method_31737));
      method_24581("time", class_3678.class, new class_383(class_3678::method_17084));
      method_24581("uuid", class_9492.class, new class_383(class_9492::method_43845));
      if (class_7665.field_38958) {
         method_24581("test_argument", class_8298.class, new class_383(class_8298::method_38282));
         method_24581("test_class", class_7479.class, new class_383(class_7479::method_34001));
      }
   }

   @Nullable
   private static class_5511<?> method_24585(Identifier var0) {
      return field_27560.get(var0);
   }

   @Nullable
   private static class_5511<?> method_24584(ArgumentType<?> var0) {
      return field_27561.get(var0.getClass());
   }

   public static <T extends ArgumentType<?>> void method_24577(class_8248 var0, T var1) {
      class_5511 var4 = method_24584(var1);
      if (var4 != null) {
         var0.method_37780(var4.field_28065);
         var4.field_28066.method_25391((T)var1, var0);
      } else {
         field_27562.error("Could not serialize {} ({}) - will not be sent to client!", var1, var1.getClass());
         var0.method_37780(new Identifier(""));
      }
   }

   @Nullable
   public static ArgumentType<?> method_24574(class_8248 var0) {
      Identifier var3 = var0.method_37768();
      class_5511 var4 = method_24585(var3);
      if (var4 != null) {
         return var4.field_28066.method_25389(var0);
      } else {
         field_27562.error("Could not deserialize {}", var3);
         return null;
      }
   }

   private static <T extends ArgumentType<?>> void method_24575(JsonObject var0, T var1) {
      class_5511 var4 = method_24584(var1);
      if (var4 != null) {
         var0.addProperty("type", "argument");
         var0.addProperty("parser", var4.field_28065.toString());
         JsonObject var5 = new JsonObject();
         var4.field_28066.method_25390((T)var1, var5);
         if (var5.size() > 0) {
            var0.add("properties", var5);
         }
      } else {
         field_27562.error("Could not serialize argument {} ({})!", var1, var1.getClass());
         var0.addProperty("type", "unknown");
      }
   }

   public static <S> JsonObject method_24576(CommandDispatcher<S> var0, CommandNode<S> var1) {
      JsonObject var4 = new JsonObject();
      if (!(var1 instanceof RootCommandNode)) {
         if (!(var1 instanceof LiteralCommandNode)) {
            if (!(var1 instanceof ArgumentCommandNode)) {
               field_27562.error("Could not serialize node {} ({})!", var1, var1.getClass());
               var4.addProperty("type", "unknown");
            } else {
               method_24575(var4, ((ArgumentCommandNode)var1).getType());
            }
         } else {
            var4.addProperty("type", "literal");
         }
      } else {
         var4.addProperty("type", "root");
      }

      JsonObject var5 = new JsonObject();

      for (CommandNode var7 : var1.getChildren()) {
         var5.add(var7.getName(), method_24576(var0, var7));
      }

      if (var5.size() > 0) {
         var4.add("children", var5);
      }

      if (var1.getCommand() != null) {
         var4.addProperty("executable", true);
      }

      if (var1.getRedirect() != null) {
         Collection var10 = var0.getPath(var1.getRedirect());
         if (!var10.isEmpty()) {
            JsonArray var11 = new JsonArray();

            for (String var9 : var10) {
               var11.add(var9);
            }

            var4.add("redirect", var11);
         }
      }

      return var4;
   }

   public static boolean method_24579(ArgumentType<?> var0) {
      return method_24584(var0) != null;
   }

   public static <T> Set<ArgumentType<?>> method_24578(CommandNode<T> var0) {
      Set var3 = Sets.newIdentityHashSet();
      HashSet var4 = Sets.newHashSet();
      method_24582(var0, var4, var3);
      return var4;
   }

   private static <T> void method_24582(CommandNode<T> var0, Set<ArgumentType<?>> var1, Set<CommandNode<T>> var2) {
      if (var2.add(var0)) {
         if (var0 instanceof ArgumentCommandNode) {
            var1.add(((ArgumentCommandNode)var0).getType());
         }

         var0.getChildren().forEach(var2x -> method_24582(var2x, var1, var2));
         CommandNode var5 = var0.getRedirect();
         if (var5 != null) {
            method_24582(var5, var1, var2);
         }
      }
   }
}
