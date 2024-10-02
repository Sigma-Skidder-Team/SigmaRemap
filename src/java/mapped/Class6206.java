package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6206 {
   public static final SuggestionProvider<CommandSource> field27688 = (var0, var1) -> {
      FunctionManager var4 = ((CommandSource)var0.getSource()).method20177().method1397();
      Class6618.method20140(var4.method22832(), var1, "#");
      return Class6618.method20141(var4.method22831(), var1);
   };

   public static void method19111(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("function").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("name", Class7566.method24766())
                  .suggests(field27688)
                  .executes(var0x -> method19112((CommandSource)var0x.getSource(), Class7566.method24769(var0x, "name")))
            )
      );
   }

   private static int method19112(CommandSource var0, Collection<Class7744> var1) {
      int var4 = 0;

      for (Class7744 var6 : var1) {
         var4 += var0.method20177().method1397().method22825(var6, var0.method20162().method20164(2));
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.function.success.multiple", var4, var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.function.success.single", var4, ((Class7744)var1.iterator().next()).method25652()), true);
      }

      return var4;
   }
}
