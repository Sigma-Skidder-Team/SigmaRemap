package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8658 {
   public static void method31159(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("banlist")
                     .requires(var0x -> var0x.method20129(3)))
                  .executes(
                     var0x -> {
                        Class6395 var3 = ((Class6619)var0x.getSource()).method20177().getPlayerList();
                        return method31160(
                           (Class6619)var0x.getSource(),
                           Lists.newArrayList(Iterables.concat(var3.method19461().method14443(), var3.method19462().method14443()))
                        );
                     }
                  ))
               .then(
                  Class6099.method18839("ips")
                     .executes(
                        var0x -> method31160(
                              (Class6619)var0x.getSource(), ((Class6619)var0x.getSource()).method20177().getPlayerList().method19462().method14443()
                           )
                     )
               ))
            .then(
               Class6099.method18839("players")
                  .executes(
                     var0x -> method31160((Class6619)var0x.getSource(), ((Class6619)var0x.getSource()).method20177().getPlayerList().method19461().method14443())
                  )
            )
      );
   }

   private static int method31160(Class6619 var0, Collection<? extends Class6787<?>> var1) {
      if (!var1.isEmpty()) {
         var0.method20179(new TranslationTextComponent("commands.banlist.list", var1.size()), false);

         for (Class6787 var5 : var1) {
            var0.method20179(new TranslationTextComponent("commands.banlist.entry", var5.method20679(), var5.method20681(), var5.method20683()), false);
         }
      } else {
         var0.method20179(new TranslationTextComponent("commands.banlist.none"), false);
      }

      return var1.size();
   }
}
