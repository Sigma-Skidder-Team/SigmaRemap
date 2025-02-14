package net.minecraft.command.impl;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

import mapped.Class8010;
import mapped.Class8700;
import mapped.Commands;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.command.arguments.ResourceLocationArgument;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.server.CustomServerBossInfo;
import net.minecraft.server.CustomServerBossInfoManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.BossInfo;

public class BossBarCommand {
   private static final DynamicCommandExceptionType BOSS_BAR_ID_TAKEN = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.bossbar.create.failed", var0)
   );
   private static final DynamicCommandExceptionType field30498 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.bossbar.unknown", var0)
   );
   private static final SimpleCommandExceptionType field30499 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.players.unchanged")
   );
   private static final SimpleCommandExceptionType field30500 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.name.unchanged")
   );
   private static final SimpleCommandExceptionType field30501 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.color.unchanged")
   );
   private static final SimpleCommandExceptionType field30502 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.style.unchanged")
   );
   private static final SimpleCommandExceptionType field30503 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.value.unchanged")
   );
   private static final SimpleCommandExceptionType field30504 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.max.unchanged")
   );
   private static final SimpleCommandExceptionType field30505 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.visibility.unchanged.hidden")
   );
   private static final SimpleCommandExceptionType field30506 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.bossbar.set.visibility.unchanged.visible")
   );
   public static final SuggestionProvider<CommandSource> SUGGESTIONS_PROVIDER = (p_201404_0_, p_201404_1_) ->
   {
      return ISuggestionProvider.suggestIterable(p_201404_0_.getSource().getServer().getCustomBossEvents().getIDs(), p_201404_1_);
   };

   public static void register(CommandDispatcher<CommandSource> var0) {
      var0.register(
              (LiteralArgumentBuilder<CommandSource>) (((((Commands.method18839(
                                   "bossbar"
                                )
                                .requires(var0x -> var0x.method20129(2)))
                             .then(
                                Commands.method18839("add")
                                   .then(
                                      Commands.method18840("id", ResourceLocationArgument.method29031())
                                         .then(
                                            Commands.method18840("name", Class8010.method27395())
                                               .executes(
                                                  var0x -> method22029(
                                                        (CommandSource)var0x.getSource(), ResourceLocationArgument.getResourceLocation(var0x, "id"), Class8010.method27394(var0x, "name")
                                                     )
                                               )
                                         )
                                   )
                             ))
                          .then(
                             Commands.method18839("remove")
                                .then(
                                   Commands.method18840("id", ResourceLocationArgument.method29031())
                                      .suggests(SUGGESTIONS_PROVIDER)
                                      .executes(var0x -> removeBossbar((CommandSource)var0x.getSource(), getBossbar(var0x)))
                                )
                          ))
                       .then(Commands.method18839("list").executes(var0x -> listBars((CommandSource)var0x.getSource()))))
                    .then(
                       Commands.method18839("set")
                          .then(
                             ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Commands.method18840(
                                                     "id", ResourceLocationArgument.method29031()
                                                  )
                                                  .suggests(SUGGESTIONS_PROVIDER)
                                                  .then(
                                                     Commands.method18839("name")
                                                        .then(
                                                           Commands.method18840("name", Class8010.method27395())
                                                              .executes(
                                                                 var0x -> method22026(
                                                                       (CommandSource)var0x.getSource(), getBossbar(var0x), Class8010.method27394(var0x, "name")
                                                                    )
                                                              )
                                                        )
                                                  ))
                                               .then(
                                                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.method18839(
                                                                          "color"
                                                                       )
                                                                       .then(
                                                                          Commands.method18839("pink")
                                                                             .executes(
                                                                                var0x -> method22024(
                                                                                      (CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.PINK
                                                                                   )
                                                                             )
                                                                       ))
                                                                    .then(
                                                                       Commands.method18839("blue")
                                                                          .executes(
                                                                             var0x -> method22024(
                                                                                   (CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.BLUE
                                                                                )
                                                                          )
                                                                    ))
                                                                 .then(
                                                                    Commands.method18839("red")
                                                                       .executes(
                                                                          var0x -> method22024(
                                                                                (CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.RED
                                                                             )
                                                                       )
                                                                 ))
                                                              .then(
                                                                 Commands.method18839("green")
                                                                    .executes(
                                                                       var0x -> method22024((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.GREEN)
                                                                    )
                                                              ))
                                                           .then(
                                                              Commands.method18839("yellow")
                                                                 .executes(
                                                                    var0x -> method22024((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.YELLOW)
                                                                 )
                                                           ))
                                                        .then(
                                                           Commands.method18839("purple")
                                                              .executes(var0x -> method22024((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.PURPLE))
                                                        ))
                                                     .then(
                                                        Commands.method18839("white")
                                                           .executes(var0x -> method22024((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Color.WHITE))
                                                     )
                                               ))
                                            .then(
                                               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.method18839(
                                                                 "style"
                                                              )
                                                              .then(
                                                                 Commands.method18839("progress")
                                                                    .executes(
                                                                       var0x -> method22025((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Overlay.PROGRESS)
                                                                    )
                                                              ))
                                                           .then(
                                                              Commands.method18839("notched_6")
                                                                 .executes(
                                                                    var0x -> method22025((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Overlay.NOTCHED_6)
                                                                 )
                                                           ))
                                                        .then(
                                                           Commands.method18839("notched_10")
                                                              .executes(var0x -> method22025((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Overlay.NOTCHED_10))
                                                        ))
                                                     .then(
                                                        Commands.method18839("notched_12")
                                                           .executes(var0x -> method22025((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Overlay.NOTCHED_12))
                                                     ))
                                                  .then(
                                                     Commands.method18839("notched_20")
                                                        .executes(var0x -> method22025((CommandSource)var0x.getSource(), getBossbar(var0x), BossInfo.Overlay.NOTCHED_20))
                                                  )
                                            ))
                                         .then(
                                            Commands.method18839("value")
                                               .then(
                                                  Commands.method18840("value", IntegerArgumentType.integer(0))
                                                     .executes(
                                                        var0x -> method22022(
                                                              (CommandSource)var0x.getSource(), getBossbar(var0x), IntegerArgumentType.getInteger(var0x, "value")
                                                           )
                                                     )
                                               )
                                         ))
                                      .then(
                                         Commands.method18839("max")
                                            .then(
                                               Commands.method18840("max", IntegerArgumentType.integer(1))
                                                  .executes(
                                                     var0x -> method22023(
                                                           (CommandSource)var0x.getSource(), getBossbar(var0x), IntegerArgumentType.getInteger(var0x, "max")
                                                        )
                                                  )
                                            )
                                      ))
                                   .then(
                                      Commands.method18839("visible")
                                         .then(
                                            Commands.method18840("visible", BoolArgumentType.bool())
                                               .executes(
                                                  var0x -> method22021((CommandSource)var0x.getSource(), getBossbar(var0x), BoolArgumentType.getBool(var0x, "visible"))
                                               )
                                         )
                                   ))
                                .then(
                                   ((LiteralArgumentBuilder)Commands.method18839("players")
                                         .executes(var0x -> method22027((CommandSource)var0x.getSource(), getBossbar(var0x), Collections.<ServerPlayerEntity>emptyList())))
                                      .then(
                                         Commands.method18840("targets", Class8700.method31353())
                                            .executes(
                                               var0x -> method22027((CommandSource)var0x.getSource(), getBossbar(var0x), Class8700.method31350(var0x, "targets"))
                                            )
                                      )
                                )
                          )
                    ))
                 .then(
                    Commands.method18839("get")
                       .then(
                          ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Commands.method18840("id", ResourceLocationArgument.method29031())
                                      .suggests(SUGGESTIONS_PROVIDER)
                                      .then(Commands.method18839("value").executes(var0x -> method22017((CommandSource)var0x.getSource(), getBossbar(var0x)))))
                                   .then(Commands.method18839("max").executes(var0x -> method22018((CommandSource)var0x.getSource(), getBossbar(var0x)))))
                                .then(Commands.method18839("visible").executes(var0x -> method22019((CommandSource)var0x.getSource(), getBossbar(var0x)))))
                             .then(Commands.method18839("players").executes(var0x -> method22020((CommandSource)var0x.getSource(), getBossbar(var0x))))
                       )
                 )
      );
   }

   private static int method22017(CommandSource var0, CustomServerBossInfo var1) {
      var0.sendFeedback(new TranslationTextComponent("commands.bossbar.get.value", var1.getFormattedName(), var1.getValue()), true);
      return var1.getValue();
   }

   private static int method22018(CommandSource var0, CustomServerBossInfo var1) {
      var0.sendFeedback(new TranslationTextComponent("commands.bossbar.get.max", var1.getFormattedName(), var1.getMax()), true);
      return var1.getMax();
   }

   private static int method22019(CommandSource var0, CustomServerBossInfo var1) {
      if (!var1.isVisible()) {
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.get.visible.hidden", var1.getFormattedName()), true);
         return 0;
      } else {
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.get.visible.visible", var1.getFormattedName()), true);
         return 1;
      }
   }

   private static int method22020(CommandSource var0, CustomServerBossInfo var1) {
      if (!var1.getPlayers().isEmpty()) {
         var0.sendFeedback(
            new TranslationTextComponent(
               "commands.bossbar.get.players.some",
               var1.getFormattedName(),
               var1.getPlayers().size(),
               TextComponentUtils.func_240649_b_(var1.getPlayers(), PlayerEntity::getDisplayName)
            ),
            true
         );
      } else {
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.get.players.none", var1.getFormattedName()), true);
      }

      return var1.getPlayers().size();
   }

   private static int method22021(CommandSource var0, CustomServerBossInfo var1, boolean var2) throws CommandSyntaxException {
      if (var1.isVisible() != var2) {
         var1.setVisible(var2);
         if (!var2) {
            var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.visible.success.hidden", var1.getFormattedName()), true);
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.visible.success.visible", var1.getFormattedName()), true);
         }

         return 0;
      } else if (!var2) {
         throw field30505.create();
      } else {
         throw field30506.create();
      }
   }

   private static int method22022(CommandSource var0, CustomServerBossInfo var1, int var2) throws CommandSyntaxException {
      if (var1.getValue() != var2) {
         var1.setValue(var2);
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.value.success", var1.getFormattedName(), var2), true);
         return var2;
      } else {
         throw field30503.create();
      }
   }

   private static int method22023(CommandSource var0, CustomServerBossInfo var1, int var2) throws CommandSyntaxException {
      if (var1.getMax() != var2) {
         var1.setMax(var2);
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.max.success", var1.getFormattedName(), var2), true);
         return var2;
      } else {
         throw field30504.create();
      }
   }

   private static int method22024(CommandSource var0, CustomServerBossInfo var1, BossInfo.Color var2) throws CommandSyntaxException {
      if (!var1.getColor().equals(var2)) {
         var1.setColor(var2);
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.color.success", var1.getFormattedName()), true);
         return 0;
      } else {
         throw field30501.create();
      }
   }

   private static int method22025(CommandSource var0, CustomServerBossInfo var1, BossInfo.Overlay var2) throws CommandSyntaxException {
      if (!var1.getOverlay().equals(var2)) {
         var1.setOverlay(var2);
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.style.success", var1.getFormattedName()), true);
         return 0;
      } else {
         throw field30502.create();
      }
   }

   private static int method22026(CommandSource var0, CustomServerBossInfo var1, ITextComponent var2) throws CommandSyntaxException {
      IFormattableTextComponent var5 = TextComponentUtils.func_240645_a_(var0, var2, (Entity)null, 0);
      if (!var1.getName().equals(var5)) {
         var1.setName(var5);
         var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.name.success", var1.getFormattedName()), true);
         return 0;
      } else {
         throw field30500.create();
      }
   }

   private static int method22027(CommandSource var0, CustomServerBossInfo var1, Collection<ServerPlayerEntity> var2) throws CommandSyntaxException {
      boolean var5 = var1.setPlayers(var2);
      if (var5) {
         if (!var1.getPlayers().isEmpty()) {
            var0.sendFeedback(
               new TranslationTextComponent(
                  "commands.bossbar.set.players.success.some", var1.getFormattedName(), var2.size(), TextComponentUtils.func_240649_b_(var2, PlayerEntity::getDisplayName)
               ),
               true
            );
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.bossbar.set.players.success.none", var1.getFormattedName()), true);
         }

         return var1.getPlayers().size();
      } else {
         throw field30499.create();
      }
   }

   private static int listBars(CommandSource source)
   {
      Collection<CustomServerBossInfo> collection = source.getServer().getCustomBossEvents().getBossbars();

      if (collection.isEmpty())
      {
         source.sendFeedback(new TranslationTextComponent("commands.bossbar.list.bars.none"), false);
      }
      else
      {
         source.sendFeedback(new TranslationTextComponent("commands.bossbar.list.bars.some", collection.size(), TextComponentUtils.func_240649_b_(collection, CustomServerBossInfo::getFormattedName)), false);
      }

      return collection.size();
   }

   private static int method22029(CommandSource source, ResourceLocation id, ITextComponent displayName) throws CommandSyntaxException {
      CustomServerBossInfoManager customserverbossinfomanager = source.getServer().getCustomBossEvents();

      if (customserverbossinfomanager.get(id) != null)
      {
         throw BOSS_BAR_ID_TAKEN.create(id.toString());
      }
      else
      {
         CustomServerBossInfo customserverbossinfo = customserverbossinfomanager.add(id, TextComponentUtils.func_240645_a_(source, displayName, (Entity)null, 0));
         source.sendFeedback(new TranslationTextComponent("commands.bossbar.create.success", customserverbossinfo.getFormattedName()), true);
         return customserverbossinfomanager.getBossbars().size();
      }
   }

   private static int removeBossbar(CommandSource source, CustomServerBossInfo bossbar)
   {
      CustomServerBossInfoManager customserverbossinfomanager = source.getServer().getCustomBossEvents();
      bossbar.removeAllPlayers();
      customserverbossinfomanager.remove(bossbar);
      source.sendFeedback(new TranslationTextComponent("commands.bossbar.remove.success", bossbar.getFormattedName()), true);
      return customserverbossinfomanager.getBossbars().size();
   }

   public static CustomServerBossInfo getBossbar(CommandContext<CommandSource> source) throws CommandSyntaxException
   {
      ResourceLocation resourcelocation = ResourceLocationArgument.getResourceLocation(source, "id");
      CustomServerBossInfo customserverbossinfo = source.getSource().getServer().getCustomBossEvents().get(resourcelocation);

      if (customserverbossinfo == null)
      {
         throw field30498.create(resourcelocation.toString());
      }
      else
      {
         return customserverbossinfo;
      }
   }
}
