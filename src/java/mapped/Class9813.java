package mapped;

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

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.resources.ResourcePackInfo;
import net.minecraft.resources.ResourcePackList;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9813 {
   private static final DynamicCommandExceptionType field45859 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.unknown", var0)
   );
   private static final DynamicCommandExceptionType field45860 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.enable.failed", var0)
   );
   private static final DynamicCommandExceptionType field45861 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.datapack.disable.failed", var0)
   );
   private static final SuggestionProvider<CommandSource> field45862 = (var0, var1) -> ISuggestionProvider.suggest(
         ((CommandSource)var0.getSource()).getServer().method1402().func_232621_d_().stream().<String>map(StringArgumentType::escapeIfRequired), var1
      );
   private static final SuggestionProvider<CommandSource> field45863 = (var0, var1) -> {
      ResourcePackList var4 = ((CommandSource)var0.getSource()).getServer().method1402();
      Collection var5 = var4.func_232621_d_();
      return ISuggestionProvider.suggest(var4.method1267().stream().filter(var1x -> !var5.contains(var1x)).<String>map(StringArgumentType::escapeIfRequired), var1);
   };

   public static void method38700(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("datapack")
                     .requires(var0x -> var0x.method20129(2)))
                  .then(
                     Commands.method18839("enable")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840(
                                             "name", StringArgumentType.string()
                                          )
                                          .suggests(field45863)
                                          .executes(
                                             var0x -> method38701(
                                                   (CommandSource)var0x.getSource(),
                                                   method38706(var0x, "name", true),
                                                   (var0xx, var1) -> var1.method7954().method8249(var0xx, var1, var0xxx -> var0xxx, false)
                                                )
                                          ))
                                       .then(
                                          Commands.method18839("after")
                                             .then(
                                                Commands.method18840("existing", StringArgumentType.string())
                                                   .suggests(field45862)
                                                   .executes(
                                                      var0x -> method38701(
                                                            (CommandSource)var0x.getSource(),
                                                            method38706(var0x, "name", true),
                                                            (var1, var2) -> var1.add(var1.indexOf(method38706(var0x, "existing", false)) + 1, var2)
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       Commands.method18839("before")
                                          .then(
                                             Commands.method18840("existing", StringArgumentType.string())
                                                .suggests(field45862)
                                                .executes(
                                                   var0x -> method38701(
                                                         (CommandSource)var0x.getSource(),
                                                         method38706(var0x, "name", true),
                                                         (var1, var2) -> var1.add(var1.indexOf(method38706(var0x, "existing", false)), var2)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Commands.method18839("last")
                                       .executes(var0x -> method38701((CommandSource)var0x.getSource(), method38706(var0x, "name", true), List::add))
                                 ))
                              .then(
                                 Commands.method18839("first")
                                    .executes(
                                       var0x -> method38701(
                                             (CommandSource)var0x.getSource(), method38706(var0x, "name", true), (var0xx, var1) -> var0xx.add(0, var1)
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  Commands.method18839("disable")
                     .then(
                        Commands.method18840("name", StringArgumentType.string())
                           .suggests(field45862)
                           .executes(var0x -> method38702((CommandSource)var0x.getSource(), method38706(var0x, "name", false)))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("list").executes(var0x -> method38703((CommandSource)var0x.getSource())))
                     .then(Commands.method18839("available").executes(var0x -> method38704((CommandSource)var0x.getSource()))))
                  .then(Commands.method18839("enabled").executes(var0x -> method38705((CommandSource)var0x.getSource())))
            )
      );
   }

   private static int method38701(CommandSource var0, ResourcePackInfo var1, Class8750 var2) throws CommandSyntaxException {
      ResourcePackList var5 = var0.getServer().method1402();
      ArrayList<ResourcePackInfo> var6 = Lists.newArrayList(var5.getEnabledPacks());
      var2.method31568(var6, var1);
      var0.sendFeedback(new TranslationTextComponent("commands.datapack.modify.enable", var1.method7948(true)), true);
      Class9482.method36605(var6.stream().<String>map(ResourcePackInfo::getName).collect(Collectors.<String>toList()), var0);
      return var6.size();
   }

   private static int method38702(CommandSource var0, ResourcePackInfo var1) {
      ResourcePackList var4 = var0.getServer().method1402();
      ArrayList<ResourcePackInfo> var5 = Lists.newArrayList(var4.getEnabledPacks());
      var5.remove(var1);
      var0.sendFeedback(new TranslationTextComponent("commands.datapack.modify.disable", var1.method7948(true)), true);
      Class9482.method36605(var5.stream().<String>map(ResourcePackInfo::getName).collect(Collectors.<String>toList()), var0);
      return var5.size();
   }

   private static int method38703(CommandSource var0) {
      return method38705(var0) + method38704(var0);
   }

   private static int method38704(CommandSource var0) {
      ResourcePackList var3 = var0.getServer().method1402();
      var3.reloadPacksFromFinders();
      Collection<ResourcePackInfo> var4 = var3.getEnabledPacks();
      Collection<ResourcePackInfo> var5 = var3.method1268();
      List<ResourcePackInfo> var6 = var5.stream().filter(var1 -> !var4.contains(var1)).collect(Collectors.toList());
      if (!var6.isEmpty()) {
         var0.sendFeedback(
            new TranslationTextComponent(
               "commands.datapack.list.available.success", var6.size(), TextComponentUtils.func_240649_b_(var6, var0x -> var0x.method7948(false))
            ),
            false
         );
      } else {
         var0.sendFeedback(new TranslationTextComponent("commands.datapack.list.available.none"), false);
      }

      return var6.size();
   }

   private static int method38705(CommandSource var0) {
      ResourcePackList var3 = var0.getServer().method1402();
      var3.reloadPacksFromFinders();
      Collection<ResourcePackInfo> var4 = var3.getEnabledPacks();
      if (!var4.isEmpty()) {
         var0.sendFeedback(
            new TranslationTextComponent(
               "commands.datapack.list.enabled.success", var4.size(), TextComponentUtils.func_240649_b_(var4, var0x -> var0x.method7948(true))
            ),
            false
         );
      } else {
         var0.sendFeedback(new TranslationTextComponent("commands.datapack.list.enabled.none"), false);
      }

      return var4.size();
   }

   private static ResourcePackInfo method38706(CommandContext<CommandSource> var0, String var1, boolean var2) throws CommandSyntaxException {
      String var5 = StringArgumentType.getString(var0, var1);
      ResourcePackList var6 = ((CommandSource)var0.getSource()).getServer().method1402();
      ResourcePackInfo var7 = var6.getPackInfo(var5);
      if (var7 != null) {
         boolean var8 = var6.getEnabledPacks().contains(var7);
         if (var2 && var8) {
            throw field45860.create(var5);
         } else if (!var2 && !var8) {
            throw field45861.create(var5);
         } else {
            return var7;
         }
      } else {
         throw field45859.create(var5);
      }
   }
}
