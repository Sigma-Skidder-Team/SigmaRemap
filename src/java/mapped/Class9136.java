package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9136 {
   private static final SimpleCommandExceptionType field41985 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.alreadyOff"));

   public static void method34112(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("save-off").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
            Class6619 var3 = (Class6619)var0x.getSource();
            boolean var4 = false;

            for (ServerWorld var6 : var3.method20177().method1320()) {
               if (var6 != null && !var6.field9047) {
                  var6.field9047 = true;
                  var4 = true;
               }
            }

            if (var4) {
               var3.method20179(new TranslationTextComponent("commands.save.disabled"), true);
               return 1;
            } else {
               throw field41985.create();
            }
         })
      );
   }
}
