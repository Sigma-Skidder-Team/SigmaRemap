package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2445 {
   private static final SimpleCommandExceptionType field_12147 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.team.add.duplicate"));
   private static final DynamicCommandExceptionType field_12146 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.team.add.longName", var0)
   );
   private static final SimpleCommandExceptionType field_12141 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType field_12136 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.name.unchanged")
   );
   private static final SimpleCommandExceptionType field_12144 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.color.unchanged")
   );
   private static final SimpleCommandExceptionType field_12137 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.friendlyfire.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType field_12140 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.friendlyfire.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType field_12145 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType field_12139 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType field_12142 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.nametagVisibility.unchanged")
   );
   private static final SimpleCommandExceptionType field_12143 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.deathMessageVisibility.unchanged")
   );
   private static final SimpleCommandExceptionType field_12138 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.collisionRule.unchanged")
   );

   public static void method_11171(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                    "team"
                                 )
                                 .requires(var0x -> var0x.method_40314(2)))
                              .then(
                                 ((LiteralArgumentBuilder)class_465.method_2231("list").executes(var0x -> method_11173((class_9155)var0x.getSource())))
                                    .then(
                                       class_465.method_2236("team", class_6868.method_31509())
                                          .executes(var0x -> method_11180((class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team")))
                                    )
                              ))
                           .then(
                              class_465.method_2231("add")
                                 .then(
                                    ((RequiredArgumentBuilder)class_465.method_2236("team", StringArgumentType.word())
                                          .executes(var0x -> method_11174((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "team"))))
                                       .then(
                                          class_465.method_2236("displayName", class_3352.method_15361())
                                             .executes(
                                                var0x -> method_11175(
                                                      (class_9155)var0x.getSource(),
                                                      StringArgumentType.getString(var0x, "team"),
                                                      class_3352.method_15360(var0x, "displayName")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("remove")
                              .then(
                                 class_465.method_2236("team", class_6868.method_31509())
                                    .executes(var0x -> method_11168((class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team")))
                              )
                        ))
                     .then(
                        class_465.method_2231("empty")
                           .then(
                              class_465.method_2236("team", class_6868.method_31509())
                                 .executes(var0x -> method_11179((class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team")))
                           )
                     ))
                  .then(
                     class_465.method_2231("join")
                        .then(
                           ((RequiredArgumentBuilder)class_465.method_2236("team", class_6868.method_31509())
                                 .executes(
                                    var0x -> method_11165(
                                          (class_9155)var0x.getSource(),
                                          class_6868.method_31511(var0x, "team"),
                                          Collections.<String>singleton(((class_9155)var0x.getSource()).method_42178().method_37206())
                                       )
                                 ))
                              .then(
                                 class_465.method_2236("members", class_2282.method_10523())
                                    .suggests(class_2282.field_11406)
                                    .executes(
                                       var0x -> method_11165(
                                             (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_2282.method_10525(var0x, "members")
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("leave")
                     .then(
                        class_465.method_2236("members", class_2282.method_10523())
                           .suggests(class_2282.field_11406)
                           .executes(var0x -> method_11162((class_9155)var0x.getSource(), class_2282.method_10525(var0x, "members")))
                     )
               ))
            .then(
               class_465.method_2231("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                   "team", class_6868.method_31509()
                                                )
                                                .then(
                                                   class_465.method_2231("displayName")
                                                      .then(
                                                         class_465.method_2236("displayName", class_3352.method_15361())
                                                            .executes(
                                                               var0x -> method_11178(
                                                                     (class_9155)var0x.getSource(),
                                                                     class_6868.method_31511(var0x, "team"),
                                                                     class_3352.method_15360(var0x, "displayName")
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("color")
                                                   .then(
                                                      class_465.method_2236("value", class_2215.method_10243())
                                                         .executes(
                                                            var0x -> method_11167(
                                                                  (class_9155)var0x.getSource(),
                                                                  class_6868.method_31511(var0x, "team"),
                                                                  class_2215.method_10242(var0x, "value")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("friendlyFire")
                                                .then(
                                                   class_465.method_2236("allowed", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> method_11176(
                                                               (class_9155)var0x.getSource(),
                                                               class_6868.method_31511(var0x, "team"),
                                                               BoolArgumentType.getBool(var0x, "allowed")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("seeFriendlyInvisibles")
                                             .then(
                                                class_465.method_2236("allowed", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> method_11166(
                                                            (class_9155)var0x.getSource(),
                                                            class_6868.method_31511(var0x, "team"),
                                                            BoolArgumentType.getBool(var0x, "allowed")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("nametagVisibility")
                                                   .then(
                                                      class_465.method_2231("never")
                                                         .executes(
                                                            var0x -> method_11169(
                                                                  (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5326
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2231("hideForOtherTeams")
                                                      .executes(
                                                         var0x -> method_11169(
                                                               (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5327
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("hideForOwnTeam")
                                                   .executes(
                                                      var0x -> method_11169(
                                                            (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5328
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("always")
                                                .executes(
                                                   var0x -> method_11169(
                                                         (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5325
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("deathMessageVisibility")
                                                .then(
                                                   class_465.method_2231("never")
                                                      .executes(
                                                         var0x -> method_11163(
                                                               (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5326
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class_465.method_2231("hideForOtherTeams")
                                                   .executes(
                                                      var0x -> method_11163(
                                                            (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5327
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("hideForOwnTeam")
                                                .executes(
                                                   var0x -> method_11163(
                                                         (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5328
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("always")
                                             .executes(
                                                var0x -> method_11163(
                                                      (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_1014.field_5325
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("collisionRule")
                                             .then(
                                                class_465.method_2231("never")
                                                   .executes(
                                                      var0x -> method_11164(
                                                            (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_5006.field_25900
                                                         )
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2231("pushOwnTeam")
                                                .executes(
                                                   var0x -> method_11164(
                                                         (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_5006.field_25896
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("pushOtherTeams")
                                             .executes(
                                                var0x -> method_11164(
                                                      (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_5006.field_25898
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("always")
                                          .executes(
                                             var0x -> method_11164(
                                                   (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_5006.field_25901
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("prefix")
                                 .then(
                                    class_465.method_2236("prefix", class_3352.method_15361())
                                       .executes(
                                          var0x -> method_11177(
                                                (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_3352.method_15360(var0x, "prefix")
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("suffix")
                              .then(
                                 class_465.method_2236("suffix", class_3352.method_15361())
                                    .executes(
                                       var0x -> method_11172(
                                             (class_9155)var0x.getSource(), class_6868.method_31511(var0x, "team"), class_3352.method_15360(var0x, "suffix")
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_11162(class_9155 var0, Collection<String> var1) {
      class_2917 var4 = var0.method_42177().method_1655();

      for (String var6 : var1) {
         var4.method_4861(var6);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.team.leave.success.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.team.leave.success.single", var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method_11165(class_9155 var0, class_3903 var1, Collection<String> var2) {
      class_2917 var5 = var0.method_42177().method_1655();

      for (String var7 : var2) {
         var5.method_4842(var7, var1);
      }

      if (var2.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.team.join.success.multiple", var2.size(), var1.method_18069()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.team.join.success.single", var2.iterator().next(), var1.method_18069()), true);
      }

      return var2.size();
   }

   private static int method_11169(class_9155 var0, class_3903 var1, class_1014 var2) throws CommandSyntaxException {
      if (var1.method_23379() != var2) {
         var1.method_18061(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.nametagVisibility.success", var1.method_18069(), var2.method_4497()), true);
         return 0;
      } else {
         throw field_12142.create();
      }
   }

   private static int method_11163(class_9155 var0, class_3903 var1, class_1014 var2) throws CommandSyntaxException {
      if (var1.method_23374() != var2) {
         var1.method_18057(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.deathMessageVisibility.success", var1.method_18069(), var2.method_4497()), true);
         return 0;
      } else {
         throw field_12143.create();
      }
   }

   private static int method_11164(class_9155 var0, class_3903 var1, class_5006 var2) throws CommandSyntaxException {
      if (var1.method_23382() != var2) {
         var1.method_18071(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.collisionRule.success", var1.method_18069(), var2.method_23048()), true);
         return 0;
      } else {
         throw field_12138.create();
      }
   }

   private static int method_11166(class_9155 var0, class_3903 var1, boolean var2) throws CommandSyntaxException {
      if (var1.method_23377() != var2) {
         var1.method_18070(var2);
         var0.method_42196(
            new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles." + (!var2 ? "disabled" : "enabled"), var1.method_18069()), true
         );
         return 0;
      } else if (!var2) {
         throw field_12139.create();
      } else {
         throw field_12145.create();
      }
   }

   private static int method_11176(class_9155 var0, class_3903 var1, boolean var2) throws CommandSyntaxException {
      if (var1.method_23376() != var2) {
         var1.method_18062(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.friendlyfire." + (!var2 ? "disabled" : "enabled"), var1.method_18069()), true);
         return 0;
      } else if (!var2) {
         throw field_12140.create();
      } else {
         throw field_12137.create();
      }
   }

   private static int method_11178(class_9155 var0, class_3903 var1, ITextComponent var2) throws CommandSyntaxException {
      if (!var1.method_18066().equals(var2)) {
         var1.method_18059(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.name.success", var1.method_18069()), true);
         return 0;
      } else {
         throw field_12136.create();
      }
   }

   private static int method_11167(class_9155 var0, class_3903 var1, TextFormatting var2) throws CommandSyntaxException {
      if (var1.method_23381() != var2) {
         var1.method_18060(var2);
         var0.method_42196(new TranslationTextComponent("commands.team.option.color.success", var1.method_18069(), var2.getFriendlyName()), true);
         return 0;
      } else {
         throw field_12144.create();
      }
   }

   private static int method_11179(class_9155 var0, class_3903 var1) throws CommandSyntaxException {
      class_2917 var4 = var0.method_42177().method_1655();
      ArrayList var5 = Lists.newArrayList(var1.method_23378());
      if (var5.isEmpty()) {
         throw field_12141.create();
      } else {
         for (String var7 : var5) {
            var4.method_4860(var7, var1);
         }

         var0.method_42196(new TranslationTextComponent("commands.team.empty.success", var5.size(), var1.method_18069()), true);
         return var5.size();
      }
   }

   private static int method_11168(class_9155 var0, class_3903 var1) {
      class_2917 var4 = var0.method_42177().method_1655();
      var4.method_4835(var1);
      var0.method_42196(new TranslationTextComponent("commands.team.remove.success", var1.method_18069()), true);
      return var4.method_4841().size();
   }

   private static int method_11174(class_9155 var0, String var1) throws CommandSyntaxException {
      return method_11175(var0, var1, new StringTextComponent(var1));
   }

   private static int method_11175(class_9155 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      class_2917 var5 = var0.method_42177().method_1655();
      if (var5.method_4850(var1) == null) {
         if (var1.length() <= 16) {
            class_3903 var6 = var5.method_4865(var1);
            var6.method_18059(var2);
            var0.method_42196(new TranslationTextComponent("commands.team.add.success", var6.method_18069()), true);
            return var5.method_4841().size();
         } else {
            throw field_12146.create(16);
         }
      } else {
         throw field_12147.create();
      }
   }

   private static int method_11180(class_9155 var0, class_3903 var1) {
      Collection var4 = var1.method_23378();
      if (!var4.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent("commands.team.list.members.success", var1.method_18069(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
            false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.team.list.members.empty", var1.method_18069()), false);
      }

      return var4.size();
   }

   private static int method_11173(class_9155 var0) {
      Collection var3 = var0.method_42177().method_1655().method_4841();
      if (!var3.isEmpty()) {
         var0.method_42196(
            new TranslationTextComponent("commands.team.list.teams.success", var3.size(), TextComponentUtils.func_240649_b_(var3, class_3903::method_18069)),
            false
         );
      } else {
         var0.method_42196(new TranslationTextComponent("commands.team.list.teams.empty"), false);
      }

      return var3.size();
   }

   private static int method_11177(class_9155 var0, class_3903 var1, ITextComponent var2) {
      var1.method_18064(var2);
      var0.method_42196(new TranslationTextComponent("commands.team.option.prefix.success", var2), false);
      return 1;
   }

   private static int method_11172(class_9155 var0, class_3903 var1, ITextComponent var2) {
      var1.method_18068(var2);
      var0.method_42196(new TranslationTextComponent("commands.team.option.suffix.success", var2), false);
      return 1;
   }
}
