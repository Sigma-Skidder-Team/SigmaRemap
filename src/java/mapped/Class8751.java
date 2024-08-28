package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8751 {
   public static void method31569(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("setworldspawn")
                  .requires(var0x -> var0x.method20129(2)))
               .executes(var0x -> method31570((Class6619)var0x.getSource(), new BlockPos(((Class6619)var0x.getSource()).method20171()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("pos", Class6849.method20826())
                     .executes(var0x -> method31570((Class6619)var0x.getSource(), Class6849.method20828(var0x, "pos"), 0.0F)))
                  .then(
                     Class6099.method18840("angle", Class9076.method33816())
                        .executes(
                           var0x -> method31570((Class6619)var0x.getSource(), Class6849.method20828(var0x, "pos"), Class9076.method33817(var0x, "angle"))
                        )
                  )
            )
      );
   }

   private static int method31570(Class6619 var0, BlockPos var1, float var2) {
      var0.method20172().method6946(var1, var2);
      var0.method20179(new TranslationTextComponent("commands.setworldspawn.success", var1.method8304(), var1.getY(), var1.method8306(), var2), true);
      return 1;
   }
}
