package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

import net.minecraft.entity.Entity;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9450 {
   public static void method36331(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("kill").requires(var0x -> var0x.method20129(2)))
               .executes(var0x -> method36332((Class6619)var0x.getSource(), ImmutableList.of(((Class6619)var0x.getSource()).method20174()))))
            .then(
               Class6099.method18840("targets", Class8700.method31347())
                  .executes(var0x -> method36332((Class6619)var0x.getSource(), Class8700.method31348(var0x, "targets")))
            )
      );
   }

   private static int method36332(Class6619 var0, Collection<? extends Entity> var1) {
      for (Entity var5 : var1) {
         var5.onKillCommand();
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.kill.success.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.kill.success.single", ((Entity)var1.iterator().next()).getDisplayName()), true);
      }

      return var1.size();
   }
}
