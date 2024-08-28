package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9145 {
   public static void method34158(CommandDispatcher<Class6619> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)Class6099.method18839("defaultgamemode").requires(var0x -> var0x.method20129(2));

      for (Class1894 var7 : Class1894.values()) {
         if (var7 != Class1894.field11101) {
            var3.then(Class6099.method18839(var7.method8153()).executes(var1 -> method34159((Class6619)var1.getSource(), var7)));
         }
      }

      var0.register(var3);
   }

   private static int method34159(Class6619 var0, Class1894 var1) {
      int var4 = 0;
      MinecraftServer var5 = var0.method20177();
      var5.method1370(var1);
      if (var5.method1380()) {
         for (ServerPlayerEntity var7 : var5.getPlayerList().method19488()) {
            if (var7.field4857.method33863() != var1) {
               var7.method2799(var1);
               var4++;
            }
         }
      }

      var0.method20179(new TranslationTextComponent("commands.defaultgamemode.success", var1.method8154()), true);
      return var4;
   }
}
