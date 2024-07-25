package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_530 {
   public static final SuggestionProvider<class_9155> field_3226 = (var0, var1) -> {
      class_1626 var4 = ((class_9155)var0.getSource()).method_42177().method_1642();
      class_8773.method_40325(var4.method_7244(), var1, "#");
      return class_8773.method_40324(var4.method_7247(), var1);
   };

   public static void method_2575(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("function").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("name", class_2222.method_10260())
                  .suggests(field_3226)
                  .executes(var0x -> method_2577((class_9155)var0x.getSource(), class_2222.method_10256(var0x, "name")))
            )
      );
   }

   private static int method_2577(class_9155 var0, Collection<class_2581> var1) {
      int var4 = 0;

      for (class_2581 var6 : var1) {
         var4 += var0.method_42177().method_1642().method_7251(var6, var0.method_42185().method_42191(2));
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.function.success.multiple", var4, var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.function.success.single", var4, ((class_2581)var1.iterator().next()).method_11746()), true);
      }

      return var4;
   }
}
