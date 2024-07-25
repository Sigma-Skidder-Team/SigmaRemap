package remapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5411 {
   public static void method_24622(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("banlist")
                     .requires(var0x -> var0x.method_40314(3)))
                  .executes(
                     var0x -> {
                        class_8704 var3 = ((class_9155)var0x.getSource()).method_42177().method_1600();
                        return method_24621(
                           (class_9155)var0x.getSource(),
                           Lists.newArrayList(Iterables.concat(var3.method_39988().method_19919(), var3.method_39952().method_19919()))
                        );
                     }
                  ))
               .then(
                  class_465.method_2231("ips")
                     .executes(
                        var0x -> method_24621(
                              (class_9155)var0x.getSource(), ((class_9155)var0x.getSource()).method_42177().method_1600().method_39952().method_19919()
                           )
                     )
               ))
            .then(
               class_465.method_2231("players")
                  .executes(
                     var0x -> method_24621(
                           (class_9155)var0x.getSource(), ((class_9155)var0x.getSource()).method_42177().method_1600().method_39988().method_19919()
                        )
                  )
            )
      );
   }

   private static int method_24621(class_9155 var0, Collection<? extends class_4424<?>> var1) {
      if (!var1.isEmpty()) {
         var0.method_42196(new TranslationTextComponent("commands.banlist.list", var1.size()), false);

         for (class_4424 var5 : var1) {
            var0.method_42196(new TranslationTextComponent("commands.banlist.entry", var5.method_20565(), var5.method_20566(), var5.method_20564()), false);
         }
      } else {
         var0.method_42196(new TranslationTextComponent("commands.banlist.none"), false);
      }

      return var1.size();
   }
}
