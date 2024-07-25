package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Date;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4861 {
   private static final SimpleCommandExceptionType field_24211 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.ban.failed"));

   public static void method_22359(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("ban").requires(var0x -> var0x.method_40314(3)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("targets", class_2490.method_11397())
                     .executes(var0x -> method_22360((class_9155)var0x.getSource(), class_2490.method_11399(var0x, "targets"), (ITextComponent)null)))
                  .then(
                     class_465.method_2236("reason", class_1282.method_5728())
                        .executes(
                           var0x -> method_22360(
                                 (class_9155)var0x.getSource(), class_2490.method_11399(var0x, "targets"), class_1282.method_5729(var0x, "reason")
                              )
                        )
                  )
            )
      );
   }

   private static int method_22360(class_9155 var0, Collection<GameProfile> var1, ITextComponent var2) throws CommandSyntaxException {
      class_161 var5 = var0.method_42177().method_1600().method_39988();
      int var6 = 0;

      for (GameProfile var8 : var1) {
         if (!var5.method_653(var8)) {
            class_937 var9 = new class_937(var8, (Date)null, var0.method_42176(), (Date)null, var2 != null ? var2.getString() : null);
            var5.method_19928(var9);
            var6++;
            var0.method_42196(new TranslationTextComponent("commands.ban.success", TextComponentUtils.getDisplayName(var8), var9.method_20564()), true);
            class_9359 var10 = var0.method_42177().method_1600().method_39982(var8.getId());
            if (var10 != null) {
               var10.field_47794.method_4161(new TranslationTextComponent("multiplayer.disconnect.banned"));
            }
         }
      }

      if (var6 != 0) {
         return var6;
      } else {
         throw field_24211.create();
      }
   }
}
