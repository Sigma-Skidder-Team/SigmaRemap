package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2414 {
   private static final SimpleCommandExceptionType field_12012 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType field_12010 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType field_12014 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType field_12011 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.whitelist.remove.failed")
   );

   public static void method_11001(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                 "whitelist"
                              )
                              .requires(var0x -> var0x.method_40314(3)))
                           .then(class_465.method_2231("on").executes(var0x -> method_11000((class_9155)var0x.getSource()))))
                        .then(class_465.method_2231("off").executes(var0x -> method_10996((class_9155)var0x.getSource()))))
                     .then(class_465.method_2231("list").executes(var0x -> method_11002((class_9155)var0x.getSource()))))
                  .then(
                     class_465.method_2231("add")
                        .then(
                           class_465.method_2236("targets", class_2490.method_11397())
                              .suggests(
                                 (var0x, var1) -> {
                                    class_8704 var4 = ((class_9155)var0x.getSource()).method_42177().method_1600();
                                    return class_8773.method_40320(
                                       var4.method_39951()
                                          .stream()
                                          .filter(var1x -> !var4.method_39979().method_25718(var1x.method_3247()))
                                          .<String>map(var0xx -> var0xx.method_3247().getName()),
                                       var1
                                    );
                                 }
                              )
                              .executes(var0x -> method_10998((class_9155)var0x.getSource(), class_2490.method_11399(var0x, "targets")))
                        )
                  ))
               .then(
                  class_465.method_2231("remove")
                     .then(
                        class_465.method_2236("targets", class_2490.method_11397())
                           .suggests(
                              (var0x, var1) -> class_8773.method_40321(((class_9155)var0x.getSource()).method_42177().method_1600().method_39994(), var1)
                           )
                           .executes(var0x -> method_10997((class_9155)var0x.getSource(), class_2490.method_11399(var0x, "targets")))
                     )
               ))
            .then(class_465.method_2231("reload").executes(var0x -> method_10999((class_9155)var0x.getSource())))
      );
   }

   private static int method_10999(class_9155 var0) {
      var0.method_42177().method_1600().method_39969();
      var0.method_42196(new TranslationTextComponent("commands.whitelist.reloaded"), true);
      var0.method_42177().method_1694(var0);
      return 1;
   }

   private static int method_10998(class_9155 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      class_5686 var4 = var0.method_42177().method_1600().method_39979();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (!var4.method_25718(var7)) {
            class_5090 var8 = new class_5090(var7);
            var4.method_19928(var8);
            var0.method_42196(new TranslationTextComponent("commands.whitelist.add.success", TextComponentUtils.getDisplayName(var7)), true);
            var5++;
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field_12014.create();
      }
   }

   private static int method_10997(class_9155 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      class_5686 var4 = var0.method_42177().method_1600().method_39979();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (var4.method_25718(var7)) {
            class_5090 var8 = new class_5090(var7);
            var4.method_19926(var8);
            var0.method_42196(new TranslationTextComponent("commands.whitelist.remove.success", TextComponentUtils.getDisplayName(var7)), true);
            var5++;
         }
      }

      if (var5 != 0) {
         var0.method_42177().method_1694(var0);
         return var5;
      } else {
         throw field_12011.create();
      }
   }

   private static int method_11000(class_9155 var0) throws CommandSyntaxException {
      class_8704 var3 = var0.method_42177().method_1600();
      if (!var3.method_39997()) {
         var3.method_39956(true);
         var0.method_42196(new TranslationTextComponent("commands.whitelist.enabled"), true);
         var0.method_42177().method_1694(var0);
         return 1;
      } else {
         throw field_12012.create();
      }
   }

   private static int method_10996(class_9155 var0) throws CommandSyntaxException {
      class_8704 var3 = var0.method_42177().method_1600();
      if (var3.method_39997()) {
         var3.method_39956(false);
         var0.method_42196(new TranslationTextComponent("commands.whitelist.disabled"), true);
         return 1;
      } else {
         throw field_12010.create();
      }
   }

   private static int method_11002(class_9155 var0) {
      String[] var3 = var0.method_42177().method_1600().method_39994();
      if (var3.length != 0) {
         var0.method_42196(new TranslationTextComponent("commands.whitelist.list", var3.length, String.join(", ", var3)), false);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.whitelist.none"), false);
      }

      return var3.length;
   }
}
