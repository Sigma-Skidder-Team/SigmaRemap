package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5762 {
   public static void method_26057(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("setworldspawn")
                  .requires(var0x -> var0x.method_40314(2)))
               .executes(var0x -> method_26058((class_9155)var0x.getSource(), new BlockPos(((class_9155)var0x.getSource()).method_42192()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("pos", class_1024.method_4522())
                     .executes(var0x -> method_26058((class_9155)var0x.getSource(), class_1024.method_4520(var0x, "pos"), 0.0F)))
                  .then(
                     class_465.method_2236("angle", class_6919.method_31676())
                        .executes(
                           var0x -> method_26058((class_9155)var0x.getSource(), class_1024.method_4520(var0x, "pos"), class_6919.method_31675(var0x, "angle"))
                        )
                  )
            )
      );
   }

   private static int method_26058(class_9155 var0, BlockPos var1, float var2) {
      var0.method_42198().method_28941(var1, var2);
      var0.method_42196(
         new TranslationTextComponent("commands.setworldspawn.success", var1.getX(), var1.method_12165(), var1.method_12185(), var2), true
      );
      return 1;
   }
}
