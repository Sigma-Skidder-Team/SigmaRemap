package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7697 {
   private static final SimpleCommandExceptionType field32945 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.team.add.duplicate"));
   private static final DynamicCommandExceptionType field32946 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.team.add.longName", var0)
   );
   private static final SimpleCommandExceptionType field32947 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.team.empty.unchanged"));
   private static final SimpleCommandExceptionType field32948 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.name.unchanged")
   );
   private static final SimpleCommandExceptionType field32949 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.color.unchanged")
   );
   private static final SimpleCommandExceptionType field32950 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.friendlyfire.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType field32951 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.friendlyfire.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType field32952 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles.alreadyEnabled")
   );
   private static final SimpleCommandExceptionType field32953 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles.alreadyDisabled")
   );
   private static final SimpleCommandExceptionType field32954 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.nametagVisibility.unchanged")
   );
   private static final SimpleCommandExceptionType field32955 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.deathMessageVisibility.unchanged")
   );
   private static final SimpleCommandExceptionType field32956 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.team.option.collisionRule.unchanged")
   );

   public static void method25326(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                    "team"
                                 )
                                 .requires(var0x -> var0x.method20129(2)))
                              .then(
                                 ((LiteralArgumentBuilder)Class6099.method18839("list").executes(var0x -> method25341((Class6619)var0x.getSource())))
                                    .then(
                                       Class6099.method18840("team", Class9062.method33746())
                                          .executes(var0x -> method25340((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team")))
                                    )
                              ))
                           .then(
                              Class6099.method18839("add")
                                 .then(
                                    ((RequiredArgumentBuilder)Class6099.method18840("team", StringArgumentType.word())
                                          .executes(var0x -> method25338((Class6619)var0x.getSource(), StringArgumentType.getString(var0x, "team"))))
                                       .then(
                                          Class6099.method18840("displayName", Class8010.method27395())
                                             .executes(
                                                var0x -> method25339(
                                                      (Class6619)var0x.getSource(),
                                                      StringArgumentType.getString(var0x, "team"),
                                                      Class8010.method27394(var0x, "displayName")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("remove")
                              .then(
                                 Class6099.method18840("team", Class9062.method33746())
                                    .executes(var0x -> method25337((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team")))
                              )
                        ))
                     .then(
                        Class6099.method18839("empty")
                           .then(
                              Class6099.method18840("team", Class9062.method33746())
                                 .executes(var0x -> method25336((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team")))
                           )
                     ))
                  .then(
                     Class6099.method18839("join")
                        .then(
                           ((RequiredArgumentBuilder)Class6099.method18840("team", Class9062.method33746())
                                 .executes(
                                    var0x -> method25328(
                                          (Class6619)var0x.getSource(),
                                          Class9062.method33747(var0x, "team"),
                                          Collections.<String>singleton(((Class6619)var0x.getSource()).method20174().method2956())
                                       )
                                 ))
                              .then(
                                 Class6099.method18840("members", Class7591.method24863())
                                    .suggests(Class7591.field32590)
                                    .executes(
                                       var0x -> method25328(
                                             (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Class7591.method24860(var0x, "members")
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  Class6099.method18839("leave")
                     .then(
                        Class6099.method18840("members", Class7591.method24863())
                           .suggests(Class7591.field32590)
                           .executes(var0x -> method25327((Class6619)var0x.getSource(), Class7591.method24860(var0x, "members")))
                     )
               ))
            .then(
               Class6099.method18839("modify")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                                   "team", Class9062.method33746()
                                                )
                                                .then(
                                                   Class6099.method18839("displayName")
                                                      .then(
                                                         Class6099.method18840("displayName", Class8010.method27395())
                                                            .executes(
                                                               var0x -> method25334(
                                                                     (Class6619)var0x.getSource(),
                                                                     Class9062.method33747(var0x, "team"),
                                                                     Class8010.method27394(var0x, "displayName")
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                Class6099.method18839("color")
                                                   .then(
                                                      Class6099.method18840("value", Class7561.method24747())
                                                         .executes(
                                                            var0x -> method25335(
                                                                  (Class6619)var0x.getSource(),
                                                                  Class9062.method33747(var0x, "team"),
                                                                  Class7561.method24748(var0x, "value")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18839("friendlyFire")
                                                .then(
                                                   Class6099.method18840("allowed", BoolArgumentType.bool())
                                                      .executes(
                                                         var0x -> method25333(
                                                               (Class6619)var0x.getSource(),
                                                               Class9062.method33747(var0x, "team"),
                                                               BoolArgumentType.getBool(var0x, "allowed")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("seeFriendlyInvisibles")
                                             .then(
                                                Class6099.method18840("allowed", BoolArgumentType.bool())
                                                   .executes(
                                                      var0x -> method25332(
                                                            (Class6619)var0x.getSource(),
                                                            Class9062.method33747(var0x, "team"),
                                                            BoolArgumentType.getBool(var0x, "allowed")
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("nametagVisibility")
                                                   .then(
                                                      Class6099.method18839("never")
                                                         .executes(
                                                            var0x -> method25329(
                                                                  (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.NEVER
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18839("hideForOtherTeams")
                                                      .executes(
                                                         var0x -> method25329(
                                                               (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.HIDE_FOR_OTHER_TEAMS
                                                            )
                                                      )
                                                ))
                                             .then(
                                                Class6099.method18839("hideForOwnTeam")
                                                   .executes(
                                                      var0x -> method25329(
                                                            (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.HIDE_FOR_OWN_TEAM
                                                         )
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18839("always")
                                                .executes(
                                                   var0x -> method25329(
                                                         (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.ALWAYS
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("deathMessageVisibility")
                                                .then(
                                                   Class6099.method18839("never")
                                                      .executes(
                                                         var0x -> method25330(
                                                               (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.NEVER
                                                            )
                                                      )
                                                ))
                                             .then(
                                                Class6099.method18839("hideForOtherTeams")
                                                   .executes(
                                                      var0x -> method25330(
                                                            (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.HIDE_FOR_OTHER_TEAMS
                                                         )
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18839("hideForOwnTeam")
                                                .executes(
                                                   var0x -> method25330(
                                                         (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.HIDE_FOR_OWN_TEAM
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("always")
                                             .executes(
                                                var0x -> method25330((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.Visible.ALWAYS)
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("collisionRule")
                                             .then(
                                                Class6099.method18839("never")
                                                   .executes(
                                                      var0x -> method25331(
                                                            (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.CollisionRule.NEVER
                                                         )
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18839("pushOwnTeam")
                                                .executes(
                                                   var0x -> method25331(
                                                         (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.CollisionRule.PUSH_OWN_TEAM
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("pushOtherTeams")
                                             .executes(
                                                var0x -> method25331((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.CollisionRule.PUSH_OTHER_TEAMS)
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("always")
                                          .executes(
                                             var0x -> method25331((Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Team.CollisionRule.ALWAYS)
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("prefix")
                                 .then(
                                    Class6099.method18840("prefix", Class8010.method27395())
                                       .executes(
                                          var0x -> method25342(
                                                (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Class8010.method27394(var0x, "prefix")
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("suffix")
                              .then(
                                 Class6099.method18840("suffix", Class8010.method27395())
                                    .executes(
                                       var0x -> method25343(
                                             (Class6619)var0x.getSource(), Class9062.method33747(var0x, "team"), Class8010.method27394(var0x, "suffix")
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method25327(Class6619 var0, Collection<String> var1) {
      Class6887 var4 = var0.method20177().method1409();

      for (String var6 : var1) {
         var4.method20994(var6);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.team.leave.success.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.team.leave.success.single", var1.iterator().next()), true);
      }

      return var1.size();
   }

   private static int method25328(Class6619 var0, ScorePlayerTeam var1, Collection<String> var2) {
      Class6887 var5 = var0.method20177().method1409();

      for (String var7 : var2) {
         var5.method20993(var7, var1);
      }

      if (var2.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.team.join.success.multiple", var2.size(), var1.method28569()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.team.join.success.single", var2.iterator().next(), var1.method28569()), true);
      }

      return var2.size();
   }

   private static int method25329(Class6619 var0, ScorePlayerTeam var1, Team.Visible var2) throws CommandSyntaxException {
      if (var1.method28582() != var2) {
         var1.method28584(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.nametagVisibility.success", var1.method28569(), var2.getDisplayName()), true);
         return 0;
      } else {
         throw field32954.create();
      }
   }

   private static int method25330(Class6619 var0, ScorePlayerTeam var1, Team.Visible var2) throws CommandSyntaxException {
      if (var1.method28583() != var2) {
         var1.method28585(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.deathMessageVisibility.success", var1.method28569(), var2.getDisplayName()), true);
         return 0;
      } else {
         throw field32955.create();
      }
   }

   private static int method25331(Class6619 var0, ScorePlayerTeam var1, Team.CollisionRule var2) throws CommandSyntaxException {
      if (var1.method28586() != var2) {
         var1.method28587(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.collisionRule.success", var1.method28569(), var2.getDisplayName()), true);
         return 0;
      } else {
         throw field32956.create();
      }
   }

   private static int method25332(Class6619 var0, ScorePlayerTeam var1, boolean var2) throws CommandSyntaxException {
      if (var1.method28580() != var2) {
         var1.method28581(var2);
         var0.method20179(
            new TranslationTextComponent("commands.team.option.seeFriendlyInvisibles." + (!var2 ? "disabled" : "enabled"), var1.method28569()), true
         );
         return 0;
      } else if (!var2) {
         throw field32953.create();
      } else {
         throw field32952.create();
      }
   }

   private static int method25333(Class6619 var0, ScorePlayerTeam var1, boolean var2) throws CommandSyntaxException {
      if (var1.method28578() != var2) {
         var1.method28579(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.friendlyfire." + (!var2 ? "disabled" : "enabled"), var1.method28569()), true);
         return 0;
      } else if (!var2) {
         throw field32951.create();
      } else {
         throw field32950.create();
      }
   }

   private static int method25334(Class6619 var0, ScorePlayerTeam var1, ITextComponent var2) throws CommandSyntaxException {
      if (!var1.method28568().equals(var2)) {
         var1.method28570(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.name.success", var1.method28569()), true);
         return 0;
      } else {
         throw field32948.create();
      }
   }

   private static int method25335(Class6619 var0, ScorePlayerTeam var1, TextFormatting var2) throws CommandSyntaxException {
      if (var1.getColor() != var2) {
         var1.method28590(var2);
         var0.method20179(new TranslationTextComponent("commands.team.option.color.success", var1.method28569(), var2.getFriendlyName()), true);
         return 0;
      } else {
         throw field32949.create();
      }
   }

   private static int method25336(Class6619 var0, ScorePlayerTeam var1) throws CommandSyntaxException {
      Class6887 var4 = var0.method20177().method1409();
      List<String> var5 = Lists.newArrayList(var1.method28575());
      if (var5.isEmpty()) {
         throw field32947.create();
      } else {
         for (String var7 : var5) {
            var4.method20995(var7, var1);
         }

         var0.method20179(new TranslationTextComponent("commands.team.empty.success", var5.size(), var1.method28569()), true);
         return var5.size();
      }
   }

   private static int method25337(Class6619 var0, ScorePlayerTeam var1) {
      Class6887 var4 = var0.method20177().method1409();
      var4.method20992(var1);
      var0.method20179(new TranslationTextComponent("commands.team.remove.success", var1.method28569()), true);
      return var4.method20997().size();
   }

   private static int method25338(Class6619 var0, String var1) throws CommandSyntaxException {
      return method25339(var0, var1, new StringTextComponent(var1));
   }

   private static int method25339(Class6619 var0, String var1, ITextComponent var2) throws CommandSyntaxException {
      Class6887 var5 = var0.method20177().method1409();
      if (var5.method20990(var1) == null) {
         if (var1.length() <= 16) {
            ScorePlayerTeam var6 = var5.method20991(var1);
            var6.method28570(var2);
            var0.method20179(new TranslationTextComponent("commands.team.add.success", var6.method28569()), true);
            return var5.method20997().size();
         } else {
            throw field32946.create(16);
         }
      } else {
         throw field32945.create();
      }
   }

   private static int method25340(Class6619 var0, ScorePlayerTeam var1) {
      Collection var4 = var1.method28575();
      if (!var4.isEmpty()) {
         var0.method20179(
            new TranslationTextComponent("commands.team.list.members.success", var1.method28569(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
            false
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.team.list.members.empty", var1.method28569()), false);
      }

      return var4.size();
   }

   private static int method25341(Class6619 var0) {
      Collection var3 = var0.method20177().method1409().method20997();
      if (!var3.isEmpty()) {
         var0.method20179(
            new TranslationTextComponent("commands.team.list.teams.success", var3.size(), TextComponentUtils.func_240649_b_(var3, ScorePlayerTeam::method28569)),
            false
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.team.list.teams.empty"), false);
      }

      return var3.size();
   }

   private static int method25342(Class6619 var0, ScorePlayerTeam var1, ITextComponent var2) {
      var1.method28571(var2);
      var0.method20179(new TranslationTextComponent("commands.team.option.prefix.success", var2), false);
      return 1;
   }

   private static int method25343(Class6619 var0, ScorePlayerTeam var1, ITextComponent var2) {
      var1.method28573(var2);
      var0.method20179(new TranslationTextComponent("commands.team.option.suffix.success", var2), false);
      return 1;
   }
}
