package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

import net.minecraft.client.util.Util;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6587 {
   public static void method19960(CommandDispatcher<Class6619> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)Class6099.method18839("gamemode").requires(var0x -> var0x.method20129(2));

      for (Class1894 var7 : Class1894.values()) {
         if (var7 != Class1894.field11101) {
            var3.then(
               ((LiteralArgumentBuilder)Class6099.method18839(var7.method8153())
                     .executes(var1 -> method19962(var1, Collections.<ServerPlayerEntity>singleton(((Class6619)var1.getSource()).method20175()), var7)))
                  .then(
                     Class6099.method18840("target", Class8700.method31353()).executes(var1 -> method19962(var1, Class8700.method31354(var1, "target"), var7))
                  )
            );
         }
      }

      var0.register(var3);
   }

   private static void method19961(Class6619 var0, ServerPlayerEntity var1, Class1894 var2) {
      TranslationTextComponent var5 = new TranslationTextComponent("gameMode." + var2.method8153());
      if (var0.method20173() != var1) {
         if (var0.method20172().method6789().method17135(Class5462.field24236)) {
            var1.sendMessage(new TranslationTextComponent("gameMode.changed", var5), Util.DUMMY_UUID);
         }

         var0.method20179(new TranslationTextComponent("commands.gamemode.success.other", var1.getDisplayName(), var5), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.gamemode.success.self", var5), true);
      }
   }

   private static int method19962(CommandContext<Class6619> var0, Collection<ServerPlayerEntity> var1, Class1894 var2) {
      int var5 = 0;

      for (ServerPlayerEntity var7 : var1) {
         if (var7.field4857.method33863() != var2) {
            var7.method2799(var2);
            method19961((Class6619)var0.getSource(), var7, var2);
            var5++;
         }
      }

      return var5;
   }
}
