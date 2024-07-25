package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4235 implements ArgumentType<class_9257> {
   private static final Collection<String> field_20555 = Arrays.<String>asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType field_20556 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.nbtpath.node.invalid"));
   public static final DynamicCommandExceptionType field_20554 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.nbtpath.nothing_found", var0)
   );

   public static class_4235 method_19750() {
      return new class_4235();
   }

   public static class_9257 method_19748(CommandContext<class_9155> var0, String var1) {
      return (class_9257)var0.getArgument(var1, class_9257.class);
   }

   public class_9257 parse(StringReader var1) throws CommandSyntaxException {
      ArrayList var4 = Lists.newArrayList();
      int var5 = var1.getCursor();
      Object2IntOpenHashMap var6 = new Object2IntOpenHashMap();
      boolean var7 = true;

      while (var1.canRead() && var1.peek() != ' ') {
         class_4885 var8 = method_19755(var1, var7);
         var4.add(var8);
         var6.put(var8, var1.getCursor() - var5);
         var7 = false;
         if (var1.canRead()) {
            char var9 = var1.peek();
            if (var9 != ' ' && var9 != '[' && var9 != '{') {
               var1.expect('.');
            }
         }
      }

      return new class_9257(var1.getString().substring(var5, var1.getCursor()), var4.<class_4885>toArray(new class_4885[0]), var6);
   }

   private static class_4885 method_19755(StringReader var0, boolean var1) throws CommandSyntaxException {
      switch (var0.peek()) {
         case '"':
            String var4 = var0.readString();
            return method_19753(var0, var4);
         case '[':
            var0.skip();
            char var5 = var0.peek();
            if (var5 == '{') {
               CompoundNBT var9 = new class_2392(var0).method_10905();
               var0.expect(']');
               return new class_8867(var9);
            } else {
               if (var5 == ']') {
                  var0.skip();
                  return class_7043.field_36380;
               }

               int var8 = var0.readInt();
               var0.expect(']');
               return new class_4344(var8);
            }
         case '{':
            if (!var1) {
               throw field_20556.createWithContext(var0);
            }

            CompoundNBT var6 = new class_2392(var0).method_10905();
            return new class_5183(var6);
         default:
            String var7 = method_19752(var0);
            return method_19753(var0, var7);
      }
   }

   private static class_4885 method_19753(StringReader var0, String var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '{') {
         CompoundNBT var4 = new class_2392(var0).method_10905();
         return new class_6861(var1, var4);
      } else {
         return new class_6333(var1);
      }
   }

   private static String method_19752(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();

      while (var0.canRead() && method_19751(var0.peek())) {
         var0.skip();
      }

      if (var0.getCursor() != var3) {
         return var0.getString().substring(var3, var0.getCursor());
      } else {
         throw field_20556.createWithContext(var0);
      }
   }

   public Collection<String> getExamples() {
      return field_20555;
   }

   private static boolean method_19751(char var0) {
      return var0 != ' ' && var0 != '"' && var0 != '[' && var0 != ']' && var0 != '.' && var0 != '{' && var0 != '}';
   }

   private static Predicate<class_8406> method_19747(CompoundNBT var0) {
      return var1 -> class_4338.method_20182(var0, var1, true);
   }
}
