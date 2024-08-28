package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class Class4914 implements ArgumentType<Integer> {
   private static final Collection<String> field22778 = Arrays.<String>asList("container.5", "12", "weapon");
   private static final DynamicCommandExceptionType field22779 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("slot.unknown", var0));
   private static final Map<String, Integer> field22780 = Util.<Map<String, Integer>>method38508(Maps.newHashMap(), var0 -> {
      for (int var3 = 0; var3 < 54; var3++) {
         var0.put("container." + var3, var3);
      }

      for (int var4 = 0; var4 < 9; var4++) {
         var0.put("hotbar." + var4, var4);
      }

      for (int var5 = 0; var5 < 27; var5++) {
         var0.put("inventory." + var5, 9 + var5);
      }

      for (int var6 = 0; var6 < 27; var6++) {
         var0.put("enderchest." + var6, 200 + var6);
      }

      for (int var7 = 0; var7 < 8; var7++) {
         var0.put("villager." + var7, 300 + var7);
      }

      for (int var8 = 0; var8 < 15; var8++) {
         var0.put("horse." + var8, 500 + var8);
      }

      var0.put("weapon", 98);
      var0.put("weapon.mainhand", 98);
      var0.put("weapon.offhand", 99);
      var0.put("armor.head", 100 + Class2106.field13736.method8773());
      var0.put("armor.chest", 100 + Class2106.field13735.method8773());
      var0.put("armor.legs", 100 + Class2106.field13734.method8773());
      var0.put("armor.feet", 100 + Class2106.field13733.method8773());
      var0.put("horse.saddle", 400);
      var0.put("horse.armor", 401);
      var0.put("horse.chest", 499);
   });

   public static Class4914 method15195() {
      return new Class4914();
   }

   public static int method15196(CommandContext<Class6619> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (field22780.containsKey(var4)) {
         return field22780.get(var4);
      } else {
         throw field22779.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20147(field22780.keySet(), var2);
   }

   public Collection<String> getExamples() {
      return field22778;
   }
}
