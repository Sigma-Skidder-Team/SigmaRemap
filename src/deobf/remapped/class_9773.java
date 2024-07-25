package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9773 {
   private static final DynamicCommandExceptionType field_49616 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.unknown", var0)
   );
   private static final DynamicCommandExceptionType field_49615 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.enable.failed", var0)
   );
   private static final DynamicCommandExceptionType field_49614 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.disable.failed", var0)
   );
   private static final SuggestionProvider<class_9155> field_49618 = (var0, var1) -> class_8773.method_40320(
         ((class_9155)var0.getSource()).method_42177().method_1747().method_29123().stream().<String>map(StringArgumentType::escapeIfRequired), var1
      );
   private static final SuggestionProvider<class_9155> field_49619 = (var0, var1) -> {
      class_6354 var4 = ((class_9155)var0.getSource()).method_42177().method_1747();
      Collection var5 = var4.method_29123();
      return class_8773.method_40320(
         var4.method_29118().stream().filter(var1x -> !var5.contains(var1x)).<String>map(StringArgumentType::escapeIfRequired), var1
      );
   };

   public static void method_45103(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("datapack")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     class_465.method_2231("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(field_49619)
                                          .executes(
                                             var0x -> method_45106(
                                                   (class_9155)var0x.getSource(),
                                                   method_45105(var0x, "name", true),
                                                   (var0xx, var1) -> var1.method_25031().method_5149(var0xx, var1, var0xxx -> var0xxx, false)
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("after")
                                             .then(
                                                class_465.method_2236("existing", StringArgumentType.string())
                                                   .suggests(field_49618)
                                                   .executes(
                                                      var0x -> method_45106(
                                                            (class_9155)var0x.getSource(),
                                                            method_45105(var0x, "name", true),
                                                            (var1, var2) -> var1.add(var1.indexOf(method_45105(var0x, "existing", false)) + 1, var2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("before")
                                          .then(
                                             class_465.method_2236("existing", StringArgumentType.string())
                                                .suggests(field_49618)
                                                .executes(
                                                   var0x -> method_45106(
                                                         (class_9155)var0x.getSource(),
                                                         method_45105(var0x, "name", true),
                                                         (var1, var2) -> var1.add(var1.indexOf(method_45105(var0x, "existing", false)), var2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("last")
                                       .executes(var0x -> method_45106((class_9155)var0x.getSource(), method_45105(var0x, "name", true), List::add))
                                 ))
                              .then(
                                 class_465.method_2231("first")
                                    .executes(
                                       var0x -> method_45106(
                                             (class_9155)var0x.getSource(), method_45105(var0x, "name", true), (var0xx, var1) -> var0xx.add(0, var1)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("disable")
                     .then(
                        class_465.method_2236("name", StringArgumentType.string())
                           .suggests(field_49618)
                           .executes(var0x -> method_45108((class_9155)var0x.getSource(), method_45105(var0x, "name", false)))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("list").executes(var0x -> method_45107((class_9155)var0x.getSource())))
                     .then(class_465.method_2231("available").executes(var0x -> method_45110((class_9155)var0x.getSource()))))
                  .then(class_465.method_2231("enabled").executes(var0x -> method_45109((class_9155)var0x.getSource())))
            )
      );
   }

   private static int method_45106(class_9155 var0, class_5522 var1, class_5756 var2) throws CommandSyntaxException {
      class_6354 var5 = var0.method_42177().method_1747();
      ArrayList var6 = Lists.newArrayList(var5.method_29125());
      var2.method_26044(var6, var1);
      var0.method_42196(new TranslationTextComponent("commands.datapack.modify.enable", var1.method_25030(true)), true);
      class_8552.method_39342(var6.stream().<String>map(class_5522::method_25023).collect(Collectors.<String>toList()), var0);
      return var6.size();
   }

   private static int method_45108(class_9155 var0, class_5522 var1) {
      class_6354 var4 = var0.method_42177().method_1747();
      ArrayList var5 = Lists.newArrayList(var4.method_29125());
      var5.remove(var1);
      var0.method_42196(new TranslationTextComponent("commands.datapack.modify.disable", var1.method_25030(true)), true);
      class_8552.method_39342(var5.stream().<String>map(class_5522::method_25023).collect(Collectors.<String>toList()), var0);
      return var5.size();
   }

   private static int method_45107(class_9155 var0) {
      return method_45109(var0) + method_45110(var0);
   }

   private static int method_45110(class_9155 var0) {
      class_6354 var3 = var0.method_42177().method_1747();
      var3.method_29122();
      Collection var4 = var3.method_29125();
      Collection var5 = var3.method_29117();
      List var6 = var5.stream().filter(var1 -> !var4.contains(var1)).collect(Collectors.toList());
      if (!var6.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.datapack.list.available.success", var6.size(), TextComponentUtils.func_240649_b_(var6, var0x -> var0x.method_25030(false))
            ),
            false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.datapack.list.available.none"), false);
      }

      return var6.size();
   }

   private static int method_45109(class_9155 var0) {
      class_6354 var3 = var0.method_42177().method_1747();
      var3.method_29122();
      Collection var4 = var3.method_29125();
      if (!var4.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.datapack.list.enabled.success", var4.size(), TextComponentUtils.func_240649_b_(var4, var0x -> var0x.method_25030(true))
            ),
            false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.datapack.list.enabled.none"), false);
      }

      return var4.size();
   }

   private static class_5522 method_45105(CommandContext<class_9155> var0, String var1, boolean var2) throws CommandSyntaxException {
      String var5 = StringArgumentType.getString(var0, var1);
      class_6354 var6 = ((class_9155)var0.getSource()).method_42177().method_1747();
      class_5522 var7 = var6.method_29120(var5);
      if (var7 != null) {
         boolean var8 = var6.method_29125().contains(var7);
         if (var2 && var8) {
            throw field_49615.create(var5);
         } else if (!var2 && !var8) {
            throw field_49614.create(var5);
         } else {
            return var7;
         }
      } else {
         throw field_49616.create(var5);
      }
   }
}
