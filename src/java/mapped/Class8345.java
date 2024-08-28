package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8345 {
   public static final Pattern field35870 = Pattern.compile(
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
   );
   private static final SimpleCommandExceptionType field35871 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.banip.invalid"));
   private static final SimpleCommandExceptionType field35872 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.banip.failed"));

   public static void method29252(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("ban-ip").requires(var0x -> var0x.method20129(3)))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("target", StringArgumentType.word())
                     .executes(var0x -> method29253((Class6619)var0x.getSource(), StringArgumentType.getString(var0x, "target"), (ITextComponent)null)))
                  .then(
                     Class6099.method18840("reason", Class7026.method21755())
                        .executes(
                           var0x -> method29253(
                                 (Class6619)var0x.getSource(), StringArgumentType.getString(var0x, "target"), Class7026.method21756(var0x, "reason")
                              )
                        )
                  )
            )
      );
   }

   private static int method29253(Class6619 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      Matcher var5 = field35870.matcher(var1);
      if (!var5.matches()) {
         Class878 var6 = var0.method20177().getPlayerList().method19465(var1);
         if (var6 == null) {
            throw field35871.create();
         } else {
            return method29254(var0, var6.method2803(), var2);
         }
      } else {
         return method29254(var0, var1, var2);
      }
   }

   private static int method29254(Class6619 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      Class4532 var5 = var0.method20177().getPlayerList().method19462();
      if (var5.method14450(var1)) {
         throw field35872.create();
      } else {
         List<Class878> var6 = var0.method20177().getPlayerList().method19477(var1);
         Class6788 var7 = new Class6788(var1, (Date)null, var0.method20170(), (Date)null, var2 != null ? var2.getString() : null);
         var5.method14436(var7);
         var0.method20179(new TranslationTextComponent("commands.banip.success", var1, var7.method20683()), true);
         if (!var6.isEmpty()) {
            var0.method20179(new TranslationTextComponent("commands.banip.info", var6.size(), Class8429.method29623(var6)), true);
         }

         for (Class878 var9 : var6) {
            var9.field4855.disconnect(new TranslationTextComponent("multiplayer.disconnect.ip_banned"));
         }

         return var6.size();
      }
   }
}
