package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.TranslationTextComponent;

public class class_744 {
   public static void method_3378(CommandDispatcher<class_9155> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)class_465.method_2231("gamemode").requires(var0x -> var0x.method_40314(2));

      for (GameType var7 : GameType.values()) {
         if (var7 != GameType.NOT_SET) {
            var3.then(
               ((LiteralArgumentBuilder)class_465.method_2231(var7.getName())
                     .executes(var1 -> method_3379(var1, Collections.<class_9359>singleton(((class_9155)var1.getSource()).method_42179()), var7)))
                  .then(
                     class_465.method_2236("target", class_5601.method_25409())
                        .executes(var1 -> method_3379(var1, class_5601.method_25412(var1, "target"), var7))
                  )
            );
         }
      }

      var0.register(var3);
   }

   private static void method_3380(class_9155 var0, class_9359 var1, GameType var2) {
      TranslationTextComponent var5 = new TranslationTextComponent("gameMode." + var2.getName());
      if (var0.method_42200() != var1) {
         if (var0.method_42198().method_29537().method_1285(class_291.field_1057)) {
            var1.method_26286(new TranslationTextComponent("gameMode.changed", var5), Util.NIL_UUID);
         }

         var0.method_42196(new TranslationTextComponent("commands.gamemode.success.other", var1.method_19839(), var5), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.gamemode.success.self", var5), true);
      }
   }

   private static int method_3379(CommandContext<class_9155> var0, Collection<class_9359> var1, GameType var2) {
      int var5 = 0;

      for (class_9359 var7 : var1) {
         if (var7.field_47807.method_39517() != var2) {
            var7.method_3155(var2);
            method_3380((class_9155)var0.getSource(), var7, var2);
            var5++;
         }
      }

      return var5;
   }
}
