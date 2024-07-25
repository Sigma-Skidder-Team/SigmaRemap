package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8436 {
   public static void method_38813(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("kill").requires(var0x -> var0x.method_40314(2)))
               .executes(var0x -> method_38814((class_9155)var0x.getSource(), ImmutableList.of(((class_9155)var0x.getSource()).method_42178()))))
            .then(
               class_465.method_2236("targets", class_5601.method_25407())
                  .executes(var0x -> method_38814((class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets")))
            )
      );
   }

   private static int method_38814(class_9155 var0, Collection<? extends Entity> var1) {
      for (Entity var5 : var1) {
         var5.method_37250();
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.kill.success.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.kill.success.single", ((Entity)var1.iterator().next()).method_19839()), true);
      }

      return var1.size();
   }
}
