package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Matcher;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9141 {
   private static final SimpleCommandExceptionType field42009 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType field42010 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.pardonip.failed"));

   public static void method34130(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("pardon-ip").requires(var0x -> var0x.method20129(3)))
            .then(
               Class6099.method18840("target", StringArgumentType.word())
                  .suggests((var0x, var1) -> Class6618.method20149(((Class6619)var0x.getSource()).method20177().method1367().method19462().method14432(), var1))
                  .executes(var0x -> method34131((Class6619)var0x.getSource(), StringArgumentType.getString(var0x, "target")))
            )
      );
   }

   private static int method34131(Class6619 var0, String var1) throws CommandSyntaxException {
      Matcher var4 = Class8345.field35870.matcher(var1);
      if (var4.matches()) {
         Class4532 var5 = var0.method20177().method1367().method19462();
         if (var5.method14450(var1)) {
            var5.method14438(var1);
            var0.method20179(new TranslationTextComponent("commands.pardonip.success", var1), true);
            return 1;
         } else {
            throw field42010.create();
         }
      } else {
         throw field42009.create();
      }
   }
}
