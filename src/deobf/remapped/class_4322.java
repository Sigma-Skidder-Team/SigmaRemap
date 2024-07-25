package remapped;

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

public class class_4322 {
   public static final Pattern field_21030 = Pattern.compile(
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
   );
   private static final SimpleCommandExceptionType field_21031 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.banip.invalid"));
   private static final SimpleCommandExceptionType field_21032 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.banip.failed"));

   public static void method_20113(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("ban-ip").requires(var0x -> var0x.method_40314(3)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("target", StringArgumentType.word())
                     .executes(var0x -> method_20111((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "target"), (ITextComponent)null)))
                  .then(
                     class_465.method_2236("reason", class_1282.method_5728())
                        .executes(
                           var0x -> method_20111(
                                 (class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "target"), class_1282.method_5729(var0x, "reason")
                              )
                        )
                  )
            )
      );
   }

   private static int method_20111(class_9155 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      Matcher var5 = field_21030.matcher(var1);
      if (!var5.matches()) {
         class_9359 var6 = var0.method_42177().method_1600().method_39993(var1);
         if (var6 == null) {
            throw field_21031.create();
         } else {
            return method_20114(var0, var6.method_43255(), var2);
         }
      } else {
         return method_20114(var0, var1, var2);
      }
   }

   private static int method_20114(class_9155 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      class_9065 var5 = var0.method_42177().method_1600().method_39952();
      if (var5.method_41615(var1)) {
         throw field_21032.create();
      } else {
         List var6 = var0.method_42177().method_1600().method_39985(var1);
         class_4513 var7 = new class_4513(var1, (Date)null, var0.method_42176(), (Date)null, var2 != null ? var2.getString() : null);
         var5.method_19928(var7);
         var0.method_42196(new TranslationTextComponent("commands.banip.success", var1, var7.method_20564()), true);
         if (!var6.isEmpty()) {
            var0.method_42196(new TranslationTextComponent("commands.banip.info", var6.size(), class_4550.method_21101(var6)), true);
         }

         for (class_9359 var9 : var6) {
            var9.field_47794.method_4161(new TranslationTextComponent("multiplayer.disconnect.ip_banned"));
         }

         return var6.size();
      }
   }
}
