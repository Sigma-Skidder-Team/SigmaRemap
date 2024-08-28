package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7508 {
   public static void method24477(CommandDispatcher<Class6619> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)Class6099.method18839("msg")
            .then(
               Class6099.method18840("targets", Class8700.method31353())
                  .then(
                     Class6099.method18840("message", Class7026.method21755())
                        .executes(
                           var0x -> method24478((Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets"), Class7026.method21756(var0x, "message"))
                        )
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)Class6099.method18839("tell").redirect(var3));
      var0.register((LiteralArgumentBuilder)Class6099.method18839("w").redirect(var3));
   }

   private static int method24478(Class6619 var0, Collection<ServerPlayerEntity> var1, ITextComponent var2) {
      UUID var5 = var0.method20173() != null ? var0.method20173().getUniqueID() : Util.DUMMY_UUID;
      Entity var6 = var0.method20173();
      Consumer var7;
      if (!(var6 instanceof ServerPlayerEntity)) {
         var7 = var2x -> var0.method20179(
               new TranslationTextComponent("commands.message.display.outgoing", var2x, var2)
                  .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
               false
            );
      } else {
         ServerPlayerEntity var8 = (ServerPlayerEntity)var6;
         var7 = var2x -> var8.sendMessage(
               new TranslationTextComponent("commands.message.display.outgoing", var2x, var2)
                  .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
               var8.getUniqueID()
            );
      }

      for (ServerPlayerEntity var9 : var1) {
         var7.accept(var9.getDisplayName());
         var9.sendMessage(
            new TranslationTextComponent("commands.message.display.incoming", var0.method20169(), var2)
               .mergeStyle(new TextFormatting[]{TextFormatting.GRAY, TextFormatting.ITALIC}),
            var5
         );
      }

      return var1.size();
   }
}
