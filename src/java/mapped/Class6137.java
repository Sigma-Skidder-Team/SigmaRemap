package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ResultConsumer;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntFunction;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6137 {
   private static final Dynamic2CommandExceptionType field27531 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.execute.blocks.toobig", var0, var1)
   );
   private static final SimpleCommandExceptionType field27532 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.execute.conditional.fail")
   );
   private static final DynamicCommandExceptionType field27533 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.execute.conditional.fail_count", var0)
   );
   private static final BinaryOperator<ResultConsumer<Class6619>> field27534 = (var0, var1) -> (var2, var3, var4) -> {
         var0.onCommandComplete(var2, var3, var4);
         var1.onCommandComplete(var2, var3, var4);
      };
   private static final SuggestionProvider<Class6619> field27535 = (var0, var1) -> {
      Class283 var4 = ((Class6619)var0.getSource()).method20177().method1412();
      return Class6618.method20141(var4.method1053(), var1);
   };

   public static void method18958(CommandDispatcher<Class6619> var0) {
      LiteralCommandNode var3 = var0.register((LiteralArgumentBuilder)Class6099.method18839("execute").requires(var0x -> var0x.method20129(2)));
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                                   "execute"
                                                )
                                                .requires(var0x -> var0x.method20129(2)))
                                             .then(Class6099.method18839("run").redirect(var0.getRoot())))
                                          .then(method18963(var3, Class6099.method18839("if"), true)))
                                       .then(method18963(var3, Class6099.method18839("unless"), false)))
                                    .then(Class6099.method18839("as").then(Class6099.method18840("targets", Class8700.method31347()).fork(var3, var0x -> {
                                       ArrayList var3x = Lists.newArrayList();

                                       for (Entity var5 : Class8700.method31349(var0x, "targets")) {
                                          var3x.add(((Class6619)var0x.getSource()).method20157(var5));
                                       }

                                       return var3x;
                                    }))))
                                 .then(
                                    Class6099.method18839("at")
                                       .then(
                                          Class6099.method18840("targets", Class8700.method31347())
                                             .fork(
                                                var3,
                                                var0x -> {
                                                   ArrayList var3x = Lists.newArrayList();

                                                   for (Entity var5 : Class8700.method31349(var0x, "targets")) {
                                                      var3x.add(
                                                         ((Class6619)var0x.getSource())
                                                            .method20166((ServerWorld)var5.field5024)
                                                            .method20158(var5.getPositionVec())
                                                            .method20159(var5.method3321())
                                                      );
                                                   }

                                                   return var3x;
                                                }
                                             )
                                       )
                                 ))
                              .then(
                                 ((LiteralArgumentBuilder)Class6099.method18839("store").then(method18959(var3, Class6099.method18839("result"), true)))
                                    .then(method18959(var3, Class6099.method18839("success"), false))
                              ))
                           .then(
                              ((LiteralArgumentBuilder)Class6099.method18839("positioned")
                                    .then(
                                       Class6099.method18840("pos", Class6851.method20857())
                                          .redirect(
                                             var3,
                                             var0x -> ((Class6619)var0x.getSource())
                                                   .method20158(Class6851.method20859(var0x, "pos"))
                                                   .method20165(Class2062.field13441)
                                          )
                                    ))
                                 .then(Class6099.method18839("as").then(Class6099.method18840("targets", Class8700.method31347()).fork(var3, var0x -> {
                                    ArrayList var3x = Lists.newArrayList();

                                    for (Entity var5 : Class8700.method31349(var0x, "targets")) {
                                       var3x.add(((Class6619)var0x.getSource()).method20158(var5.getPositionVec()));
                                    }

                                    return var3x;
                                 })))
                           ))
                        .then(
                           ((LiteralArgumentBuilder)Class6099.method18839("rotated")
                                 .then(
                                    Class6099.method18840("rot", Class7918.method26558())
                                       .redirect(
                                          var3,
                                          var0x -> ((Class6619)var0x.getSource())
                                                .method20159(Class7918.method26559(var0x, "rot").method23229((Class6619)var0x.getSource()))
                                       )
                                 ))
                              .then(Class6099.method18839("as").then(Class6099.method18840("targets", Class8700.method31347()).fork(var3, var0x -> {
                                 ArrayList var3x = Lists.newArrayList();

                                 for (Entity var5 : Class8700.method31349(var0x, "targets")) {
                                    var3x.add(((Class6619)var0x.getSource()).method20159(var5.method3321()));
                                 }

                                 return var3x;
                              })))
                        ))
                     .then(
                        ((LiteralArgumentBuilder)Class6099.method18839("facing")
                              .then(
                                 Class6099.method18839("entity")
                                    .then(
                                       Class6099.method18840("targets", Class8700.method31347())
                                          .then(Class6099.method18840("anchor", Class9188.method34388()).fork(var3, var0x -> {
                                             ArrayList var3x = Lists.newArrayList();
                                             Class2062 var4 = Class9188.method34387(var0x, "anchor");

                                             for (Entity var6 : Class8700.method31349(var0x, "targets")) {
                                                var3x.add(((Class6619)var0x.getSource()).method20167(var6, var4));
                                             }

                                             return var3x;
                                          }))
                                    )
                              ))
                           .then(
                              Class6099.method18840("pos", Class6851.method20857())
                                 .redirect(var3, var0x -> ((Class6619)var0x.getSource()).method20168(Class6851.method20859(var0x, "pos")))
                           )
                     ))
                  .then(
                     Class6099.method18839("align")
                        .then(
                           Class6099.method18840("axes", Class9560.method37040())
                              .redirect(
                                 var3,
                                 var0x -> ((Class6619)var0x.getSource())
                                       .method20158(((Class6619)var0x.getSource()).method20171().method11355(Class9560.method37041(var0x, "axes")))
                              )
                        )
                  ))
               .then(
                  Class6099.method18839("anchored")
                     .then(
                        Class6099.method18840("anchor", Class9188.method34388())
                           .redirect(var3, var0x -> ((Class6619)var0x.getSource()).method20165(Class9188.method34387(var0x, "anchor")))
                     )
               ))
            .then(
               Class6099.method18839("in")
                  .then(
                     Class6099.method18840("dimension", Class9082.method33872())
                        .redirect(var3, var0x -> ((Class6619)var0x.getSource()).method20166(Class9082.method33873(var0x, "dimension")))
                  )
            )
      );
   }

   private static ArgumentBuilder<Class6619, ?> method18959(LiteralCommandNode<Class6619> var0, LiteralArgumentBuilder<Class6619> var1, boolean var2) {
      var1.then(
         Class6099.method18839("score")
            .then(
               Class6099.method18840("targets", Class7591.method24863())
                  .suggests(Class7591.field32590)
                  .then(
                     Class6099.method18840("objective", Class9263.method34860())
                        .redirect(
                           var0,
                           var1x -> method18960(
                                 (Class6619)var1x.getSource(), Class7591.method24860(var1x, "targets"), Class9263.method34861(var1x, "objective"), var2
                              )
                        )
                  )
            )
      );
      var1.then(
         Class6099.method18839("bossbar")
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("id", Class8303.method29031())
                     .suggests(Class7088.field30507)
                     .then(
                        Class6099.method18839("value")
                           .redirect(var0, var1x -> method18961((Class6619)var1x.getSource(), Class7088.method22031(var1x), true, var2))
                     ))
                  .then(
                     Class6099.method18839("max").redirect(var0, var1x -> method18961((Class6619)var1x.getSource(), Class7088.method22031(var1x), false, var2))
                  )
            )
      );

      for (Class8196 var6 : Class8158.field35113) {
         var6.method28504(
            var1,
            var3 -> var3.then(
                  ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                       "path", Class8320.method29128()
                                    )
                                    .then(
                                       Class6099.method18839("int")
                                          .then(
                                             Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                                .redirect(
                                                   var0,
                                                   var2xx -> method18962(
                                                         (Class6619)var2xx.getSource(),
                                                         var6.method28503(var2xx),
                                                         Class8320.method29129(var2xx, "path"),
                                                         var1xxx -> Class36.method95((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                         var2
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("float")
                                       .then(
                                          Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                             .redirect(
                                                var0,
                                                var2xx -> method18962(
                                                      (Class6619)var2xx.getSource(),
                                                      var6.method28503(var2xx),
                                                      Class8320.method29129(var2xx, "path"),
                                                      var1xxx -> Class32.method90((float)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                      var2
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("short")
                                    .then(
                                       Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                          .redirect(
                                             var0,
                                             var2xx -> method18962(
                                                   (Class6619)var2xx.getSource(),
                                                   var6.method28503(var2xx),
                                                   Class8320.method29129(var2xx, "path"),
                                                   var1xxx -> Class37.method96((short)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                                   var2
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("long")
                                 .then(
                                    Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                       .redirect(
                                          var0,
                                          var2xx -> method18962(
                                                (Class6619)var2xx.getSource(),
                                                var6.method28503(var2xx),
                                                Class8320.method29129(var2xx, "path"),
                                                var1xxx -> Class35.method94((long)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale"))),
                                                var2
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("double")
                              .then(
                                 Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                    .redirect(
                                       var0,
                                       var2xx -> method18962(
                                             (Class6619)var2xx.getSource(),
                                             var6.method28503(var2xx),
                                             Class8320.method29129(var2xx, "path"),
                                             var1xxx -> Class34.method93((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")),
                                             var2
                                          )
                                    )
                              )
                        ))
                     .then(
                        Class6099.method18839("byte")
                           .then(
                              Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                 .redirect(
                                    var0,
                                    var2xx -> method18962(
                                          (Class6619)var2xx.getSource(),
                                          var6.method28503(var2xx),
                                          Class8320.method29129(var2xx, "path"),
                                          var1xxx -> Class33.method91((byte)((int)((double)var1xxx * DoubleArgumentType.getDouble(var2xx, "scale")))),
                                          var2
                                       )
                                 )
                           )
                     )
               )
         );
      }

      return var1;
   }

   private static Class6619 method18960(Class6619 var0, Collection<String> var1, Class8375 var2, boolean var3) {
      Class6887 var6 = var0.method20177().method1409();
      return var0.method20161((var4, var5, var6x) -> {
         for (String var10 : var1) {
            Class9411 var11 = var6.method20980(var10, var2);
            int var12 = !var3 ? (!var5 ? 0 : 1) : var6x;
            var11.method36052(var12);
         }
      }, field27534);
   }

   private static Class6619 method18961(Class6619 var0, Class3623 var1, boolean var2, boolean var3) {
      return var0.method20161((var3x, var4, var5) -> {
         int var8 = !var3 ? (!var4 ? 0 : 1) : var5;
         if (!var2) {
            var1.method12270(var8);
         } else {
            var1.method12269(var8);
         }
      }, field27534);
   }

   private static Class6619 method18962(Class6619 var0, Class7151 var1, Class9670 var2, IntFunction<Class30> var3, boolean var4) {
      return var0.method20161((var4x, var5, var6) -> {
         try {
            Class39 var9 = var1.method22312();
            int var10 = var4 ? var6 : (var5 ? 1 : 0);
            var2.method37730(var9, () -> (Class30)var3.apply(var10));
            var1.method22311(var9);
         } catch (CommandSyntaxException var11) {
         }
      }, field27534);
   }

   private static ArgumentBuilder<Class6619, ?> method18963(CommandNode<Class6619> var0, LiteralArgumentBuilder<Class6619> var1, boolean var2) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                     Class6099.method18839("block")
                        .then(
                           Class6099.method18840("pos", Class6849.method20826())
                              .then(
                                 method18970(
                                    var0,
                                    Class6099.method18840("block", Class7505.method24464()),
                                    var2,
                                    var0x -> Class7505.method24465(var0x, "block")
                                          .test(new Class9632(((Class6619)var0x.getSource()).method20172(), Class6849.method20827(var0x, "pos"), true))
                                 )
                              )
                        )
                  ))
                  .then(
                     Class6099.method18839("score")
                        .then(
                           Class6099.method18840("target", Class7591.method24862())
                              .suggests(Class7591.field32590)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                                      "targetObjective", Class9263.method34860()
                                                   )
                                                   .then(
                                                      Class6099.method18839("=")
                                                         .then(
                                                            Class6099.method18840("source", Class7591.method24862())
                                                               .suggests(Class7591.field32590)
                                                               .then(
                                                                  method18970(
                                                                     var0,
                                                                     Class6099.method18840("sourceObjective", Class9263.method34860()),
                                                                     var2,
                                                                     var0x -> method18966(var0x, Integer::equals)
                                                                  )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18839("<")
                                                      .then(
                                                         Class6099.method18840("source", Class7591.method24862())
                                                            .suggests(Class7591.field32590)
                                                            .then(
                                                               method18970(
                                                                  var0,
                                                                  Class6099.method18840("sourceObjective", Class9263.method34860()),
                                                                  var2,
                                                                  var0x -> method18966(var0x, (var0xx, var1x) -> var0xx < var1x)
                                                               )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                Class6099.method18839("<=")
                                                   .then(
                                                      Class6099.method18840("source", Class7591.method24862())
                                                         .suggests(Class7591.field32590)
                                                         .then(
                                                            method18970(
                                                               var0,
                                                               Class6099.method18840("sourceObjective", Class9263.method34860()),
                                                               var2,
                                                               var0x -> method18966(var0x, (var0xx, var1x) -> var0xx <= var1x)
                                                            )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18839(">")
                                                .then(
                                                   Class6099.method18840("source", Class7591.method24862())
                                                      .suggests(Class7591.field32590)
                                                      .then(
                                                         method18970(
                                                            var0,
                                                            Class6099.method18840("sourceObjective", Class9263.method34860()),
                                                            var2,
                                                            var0x -> method18966(var0x, (var0xx, var1x) -> var0xx > var1x)
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839(">=")
                                             .then(
                                                Class6099.method18840("source", Class7591.method24862())
                                                   .suggests(Class7591.field32590)
                                                   .then(
                                                      method18970(
                                                         var0,
                                                         Class6099.method18840("sourceObjective", Class9263.method34860()),
                                                         var2,
                                                         var0x -> method18966(var0x, (var0xx, var1x) -> var0xx >= var1x)
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("matches")
                                          .then(
                                             method18970(
                                                var0,
                                                Class6099.method18840("range", Class8591.method30736()),
                                                var2,
                                                var0x -> method18967(var0x, Class8592.method30738(var0x, "range"))
                                             )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  Class6099.method18839("blocks")
                     .then(
                        Class6099.method18840("start", Class6849.method20826())
                           .then(
                              Class6099.method18840("end", Class6849.method20826())
                                 .then(
                                    ((RequiredArgumentBuilder)Class6099.method18840("destination", Class6849.method20826())
                                          .then(method18971(var0, Class6099.method18839("all"), var2, false)))
                                       .then(method18971(var0, Class6099.method18839("masked"), var2, true))
                                 )
                           )
                     )
               ))
            .then(
               Class6099.method18839("entity")
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("entities", Class8700.method31347())
                           .fork(var0, var1x -> method18969(var1x, var2, !Class8700.method31349(var1x, "entities").isEmpty())))
                        .executes(method18964(var2, var0x -> Class8700.method31349(var0x, "entities").size()))
                  )
            ))
         .then(
            Class6099.method18839("predicate")
               .then(
                  method18970(
                     var0,
                     Class6099.method18840("predicate", Class8303.method29031()).suggests(field27535),
                     var2,
                     var0x -> method18968((Class6619)var0x.getSource(), Class8303.method29034(var0x, "predicate"))
                  )
               )
         );

      for (Class8196 var6 : Class8158.field35114) {
         var1.then(
            var6.method28504(
               Class6099.method18839("data"),
               var3 -> var3.then(
                     ((RequiredArgumentBuilder)Class6099.method18840("path", Class8320.method29128())
                           .fork(var0, var2xx -> method18969(var2xx, var2, method18965(var6.method28503(var2xx), Class8320.method29129(var2xx, "path")) > 0)))
                        .executes(method18964(var2, var1xx -> method18965(var6.method28503(var1xx), Class8320.method29129(var1xx, "path"))))
                  )
            )
         );
      }

      return var1;
   }

   private static Command<Class6619> method18964(boolean var0, Class9575 var1) {
      return !var0 ? var1x -> {
         int var4 = var1.method37178(var1x);
         if (var4 != 0) {
            throw field27533.create(var4);
         } else {
            ((Class6619)var1x.getSource()).method20179(new TranslationTextComponent("commands.execute.conditional.pass"), false);
            return 1;
         }
      } : var1x -> {
         int var4 = var1.method37178(var1x);
         if (var4 <= 0) {
            throw field27532.create();
         } else {
            ((Class6619)var1x.getSource()).method20179(new TranslationTextComponent("commands.execute.conditional.pass_count", var4), false);
            return var4;
         }
      };
   }

   private static int method18965(Class7151 var0, Class9670 var1) throws CommandSyntaxException {
      return var1.method37726(var0.method22312());
   }

   private static boolean method18966(CommandContext<Class6619> var0, BiPredicate<Integer, Integer> var1) throws CommandSyntaxException {
      String var4 = Class7591.method24858(var0, "target");
      Class8375 var5 = Class9263.method34861(var0, "targetObjective");
      String var6 = Class7591.method24858(var0, "source");
      Class8375 var7 = Class9263.method34861(var0, "sourceObjective");
      Class6887 var8 = ((Class6619)var0.getSource()).method20177().method1409();
      if (var8.method20979(var4, var5) && var8.method20979(var6, var7)) {
         Class9411 var9 = var8.method20980(var4, var5);
         Class9411 var10 = var8.method20980(var6, var7);
         return var1.test(var9.method36050(), var10.method36050());
      } else {
         return false;
      }
   }

   private static boolean method18967(CommandContext<Class6619> var0, Class8840 var1) throws CommandSyntaxException {
      String var4 = Class7591.method24858(var0, "target");
      Class8375 var5 = Class9263.method34861(var0, "targetObjective");
      Class6887 var6 = ((Class6619)var0.getSource()).method20177().method1409();
      return var6.method20979(var4, var5) ? var1.method32015(var6.method20980(var4, var5).method36050()) : false;
   }

   private static boolean method18968(Class6619 var0, ILootCondition var1) {
      ServerWorld var4 = var0.method20172();
      Class9464 var5 = new Class9464(var4).method36454(Class9525.field44335, var0.method20171()).method36455(Class9525.field44330, var0.method20173());
      return var1.test(var5.method36460(Class8524.field38283));
   }

   private static Collection<Class6619> method18969(CommandContext<Class6619> var0, boolean var1, boolean var2) {
      return (Collection<Class6619>)(var2 != var1 ? Collections.<Class6619>emptyList() : Collections.<Class6619>singleton((Class6619)var0.getSource()));
   }

   private static ArgumentBuilder<Class6619, ?> method18970(CommandNode<Class6619> var0, ArgumentBuilder<Class6619, ?> var1, boolean var2, Class6600 var3) {
      return var1.fork(var0, var2x -> method18969(var2x, var2, var3.method20000(var2x))).executes(var2x -> {
         if (var2 != var3.method20000(var2x)) {
            throw field27532.create();
         } else {
            ((Class6619)var2x.getSource()).method20179(new TranslationTextComponent("commands.execute.conditional.pass"), false);
            return 1;
         }
      });
   }

   private static ArgumentBuilder<Class6619, ?> method18971(CommandNode<Class6619> var0, ArgumentBuilder<Class6619, ?> var1, boolean var2, boolean var3) {
      return var1.fork(var0, var2x -> method18969(var2x, var2, method18974(var2x, var3).isPresent()))
         .executes(!var2 ? var1x -> method18973(var1x, var3) : var1x -> method18972(var1x, var3));
   }

   private static int method18972(CommandContext<Class6619> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var4 = method18974(var0, var1);
      if (!var4.isPresent()) {
         throw field27532.create();
      } else {
         ((Class6619)var0.getSource()).method20179(new TranslationTextComponent("commands.execute.conditional.pass_count", var4.getAsInt()), false);
         return var4.getAsInt();
      }
   }

   private static int method18973(CommandContext<Class6619> var0, boolean var1) throws CommandSyntaxException {
      OptionalInt var4 = method18974(var0, var1);
      if (!var4.isPresent()) {
         ((Class6619)var0.getSource()).method20179(new TranslationTextComponent("commands.execute.conditional.pass"), false);
         return 1;
      } else {
         throw field27533.create(var4.getAsInt());
      }
   }

   private static OptionalInt method18974(CommandContext<Class6619> var0, boolean var1) throws CommandSyntaxException {
      return method18975(
         ((Class6619)var0.getSource()).method20172(),
         Class6849.method20827(var0, "start"),
         Class6849.method20827(var0, "end"),
         Class6849.method20827(var0, "destination"),
         var1
      );
   }

   private static OptionalInt method18975(ServerWorld var0, BlockPos var1, BlockPos var2, BlockPos var3, boolean var4) throws CommandSyntaxException {
      Class9764 var7 = new Class9764(var1, var2);
      Class9764 var8 = new Class9764(var3, var3.method8337(var7.method38397()));
      BlockPos var9 = new BlockPos(var8.field45678 - var7.field45678, var8.field45679 - var7.field45679, var8.field45680 - var7.field45680);
      int var10 = var7.method38398() * var7.method38399() * var7.method38400();
      if (var10 > 32768) {
         throw field27531.create(32768, var10);
      } else {
         int var11 = 0;

         for (int var12 = var7.field45680; var12 <= var7.field45683; var12++) {
            for (int var13 = var7.field45679; var13 <= var7.field45682; var13++) {
               for (int var14 = var7.field45678; var14 <= var7.field45681; var14++) {
                  BlockPos var15 = new BlockPos(var14, var13, var12);
                  BlockPos var16 = var15.method8337(var9);
                  Class7380 var17 = var0.method6738(var15);
                  if (!var4 || !var17.method23448(Blocks.AIR)) {
                     if (var17 != var0.method6738(var16)) {
                        return OptionalInt.empty();
                     }

                     Class944 var18 = var0.method6759(var15);
                     Class944 var19 = var0.method6759(var16);
                     if (var18 != null) {
                        if (var19 == null) {
                           return OptionalInt.empty();
                        }

                        Class39 var20 = var18.method3646(new Class39());
                        var20.method133("x");
                        var20.method133("y");
                        var20.method133("z");
                        Class39 var21 = var19.method3646(new Class39());
                        var21.method133("x");
                        var21.method133("y");
                        var21.method133("z");
                        if (!var20.equals(var21)) {
                           return OptionalInt.empty();
                        }
                     }

                     var11++;
                  }
               }
            }
         }

         return OptionalInt.of(var11);
      }
   }
}
