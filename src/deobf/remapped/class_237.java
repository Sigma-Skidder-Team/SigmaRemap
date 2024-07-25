package remapped;

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

public class class_237 implements ArgumentType<Integer> {
   private static final Collection<String> field_792 = Arrays.<String>asList("container.5", "12", field_794[6]);
   private static final DynamicCommandExceptionType field_795 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("slot.unknown", var0));
   private static final Map<String, Integer> field_793 = Util.<Map<String, Integer>>method_44659(Maps.newHashMap(), var0 -> {
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
      var0.put("armor.head", 100 + class_6943.field_35704.method_31767());
      var0.put("armor.chest", 100 + class_6943.field_35708.method_31767());
      var0.put("armor.legs", 100 + class_6943.field_35698.method_31767());
      var0.put("armor.feet", 100 + class_6943.field_35700.method_31767());
      var0.put("horse.saddle", 400);
      var0.put("horse.armor", 401);
      var0.put("horse.chest", 499);
   });

   public static class_237 method_1011() {
      return new class_237();
   }

   public static int method_1013(CommandContext<class_9155> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      if (field_793.containsKey(var4)) {
         return field_793.get(var4);
      } else {
         throw field_795.create(var4);
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40319(field_793.keySet(), var2);
   }

   public Collection<String> getExamples() {
      return field_792;
   }
}
