package mapped;

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

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8651 {
   private static final Logger field38986 = LogManager.getLogger();
   private static final Map<Class<?>, Class8678<?>> field38987 = Maps.newHashMap();
   private static final Map<ResourceLocation, Class8678<?>> field38988 = Maps.newHashMap();

   public static <T extends ArgumentType<?>> void method31095(String var0, Class<T> var1, Class2586<T> var2) {
      ResourceLocation var5 = new ResourceLocation(var0);
      if (!field38987.containsKey(var1)) {
         if (!field38988.containsKey(var5)) {
            Class8678 var6 = new Class8678(var1, var2, var5);
            field38987.put(var1, var6);
            field38988.put(var5, var6);
         } else {
            throw new IllegalArgumentException("'" + var5 + "' is already a registered serializer!");
         }
      } else {
         throw new IllegalArgumentException("Class " + var1.getName() + " already has a serializer!");
      }
   }

   public static void method31096() {
      Class6397.method19493();
      method31095("entity", Class8700.class, new Class2585());
      method31095("game_profile", Class7713.class, new Class2591(Class7713::method25483));
      method31095("block_pos", Class6849.class, new Class2591(Class6849::method20826));
      method31095("column_pos", Class8693.class, new Class2591(Class8693::method31319));
      method31095("vec3", Class6851.class, new Class2591(Class6851::method20857));
      method31095("vec2", Class7347.class, new Class2591(Class7347::method23292));
      method31095("block_state", Class7971.class, new Class2591(Class7971::method27103));
      method31095("block_predicate", Class7505.class, new Class2591(Class7505::method24464));
      method31095("item_stack", Class8722.class, new Class2591(Class8722::method31481));
      method31095("item_predicate", Class7584.class, new Class2591(Class7584::method24822));
      method31095("color", Class7561.class, new Class2591(Class7561::method24747));
      method31095("component", Class8010.class, new Class2591(Class8010::method27395));
      method31095("message", Class7026.class, new Class2591(Class7026::method21755));
      method31095("nbt_compound_tag", Class9770.class, new Class2591(Class9770::method38432));
      method31095("nbt_tag", Class8780.class, new Class2591(Class8780::method31660));
      method31095("nbt_path", Class8320.class, new Class2591(Class8320::method29128));
      method31095("objective", Class9263.class, new Class2591(Class9263::method34860));
      method31095("objective_criteria", Class8371.class, new Class2591(Class8371::method29322));
      method31095("operation", Class6888.class, new Class2591(Class6888::method21028));
      method31095("particle", Class8050.class, new Class2591(Class8050::method27648));
      method31095("angle", Class9076.class, new Class2591(Class9076::method33816));
      method31095("rotation", Class7918.class, new Class2591(Class7918::method26558));
      method31095("scoreboard_slot", Class9639.class, new Class2591(Class9639::method37566));
      method31095("score_holder", Class7591.class, new Class2589());
      method31095("swizzle", Class9560.class, new Class2591(Class9560::method37040));
      method31095("team", Class9062.class, new Class2591(Class9062::method33746));
      method31095("item_slot", Class4914.class, new Class2591(Class4914::method15195));
      method31095("resource_location", Class8303.class, new Class2591(Class8303::method29031));
      method31095("mob_effect", Class9468.class, new Class2591(Class9468::method36510));
      method31095("function", Class7566.class, new Class2591(Class7566::method24766));
      method31095("entity_anchor", Class9188.class, new Class2591(Class9188::method34388));
      method31095("int_range", Class8592.class, new Class2591(Class8591::method30736));
      method31095("float_range", Class8590.class, new Class2591(Class8591::method30737));
      method31095("item_enchantment", Class9534.class, new Class2591(Class9534::method36862));
      method31095("entity_summon", Class7822.class, new Class2591(Class7822::method26155));
      method31095("dimension", Class9082.class, new Class2591(Class9082::method33872));
      method31095("time", Class8127.class, new Class2591(Class8127::method28154));
      method31095("uuid", Class9728.class, new Class2591(Class9728::method38110));
      if (SharedConstants.developmentMode) {
         method31095("test_argument", Class9418.class, new Class2591(Class9418::method36138));
         method31095("test_class", Class9210.class, new Class2591(Class9210::method34510));
      }
   }

   @Nullable
   private static Class8678<?> method31097(ResourceLocation var0) {
      return field38988.get(var0);
   }

   @Nullable
   private static Class8678<?> method31098(ArgumentType<?> var0) {
      return field38987.get(var0.getClass());
   }

   public static <T extends ArgumentType<?>> void method31099(PacketBuffer var0, T var1) {
      Class8678 var4 = method31098(var1);
      if (var4 != null) {
         var0.writeResourceLocation(var4.field39148);
         var4.field39147.method10796((T)var1, var0);
      } else {
         field38986.error("Could not serialize {} ({}) - will not be sent to client!", var1, var1.getClass());
         var0.writeResourceLocation(new ResourceLocation(""));
      }
   }

   @Nullable
   public static ArgumentType<?> method31100(PacketBuffer var0) {
      ResourceLocation var3 = var0.readResourceLocation();
      Class8678<?> var4 = method31097(var3);
      if (var4 != null) {
         return var4.field39147.method10795(var0);
      } else {
         field38986.error("Could not deserialize {}", var3);
         return null;
      }
   }

   private static <T extends ArgumentType<?>> void method31101(JsonObject var0, T var1) {
      Class8678 var4 = method31098(var1);
      if (var4 != null) {
         var0.addProperty("type", "argument");
         var0.addProperty("parser", var4.field39148.toString());
         JsonObject var5 = new JsonObject();
         var4.field39147.method10794((T)var1, var5);
         if (var5.size() > 0) {
            var0.add("properties", var5);
         }
      } else {
         field38986.error("Could not serialize argument {} ({})!", var1, var1.getClass());
         var0.addProperty("type", "unknown");
      }
   }

   public static <S> JsonObject method31102(CommandDispatcher<S> var0, CommandNode<S> var1) {
      JsonObject var4 = new JsonObject();
      if (!(var1 instanceof RootCommandNode)) {
         if (!(var1 instanceof LiteralCommandNode)) {
            if (!(var1 instanceof ArgumentCommandNode)) {
               field38986.error("Could not serialize node {} ({})!", var1, var1.getClass());
               var4.addProperty("type", "unknown");
            } else {
               method31101(var4, ((ArgumentCommandNode)var1).getType());
            }
         } else {
            var4.addProperty("type", "literal");
         }
      } else {
         var4.addProperty("type", "root");
      }

      JsonObject var5 = new JsonObject();

      for (CommandNode var7 : var1.getChildren()) {
         var5.add(var7.getName(), method31102(var0, var7));
      }

      if (var5.size() > 0) {
         var4.add("children", var5);
      }

      if (var1.getCommand() != null) {
         var4.addProperty("executable", true);
      }

      if (var1.getRedirect() != null) {
         Collection<String> var10 = var0.getPath(var1.getRedirect());
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

   public static boolean method31103(ArgumentType<?> var0) {
      return method31098(var0) != null;
   }

   public static <T> Set<ArgumentType<?>> method31104(CommandNode<T> var0) {
      Set var3 = Sets.newIdentityHashSet();
      HashSet var4 = Sets.newHashSet();
      method31105(var0, var4, var3);
      return var4;
   }

   private static <T> void method31105(CommandNode<T> var0, Set<ArgumentType<?>> var1, Set<CommandNode<T>> var2) {
      if (var2.add(var0)) {
         if (var0 instanceof ArgumentCommandNode) {
            var1.add(((ArgumentCommandNode)var0).getType());
         }

         var0.getChildren().forEach(var2x -> method31105(var2x, var1, var2));
         CommandNode var5 = var0.getRedirect();
         if (var5 != null) {
            method31105(var5, var1, var2);
         }
      }
   }
}
