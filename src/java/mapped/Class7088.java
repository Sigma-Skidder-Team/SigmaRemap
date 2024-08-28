package mapped;

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
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7088 {
   private static final DynamicCommandExceptionType field30497 = new DynamicCommandExceptionType(
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
   public static final SuggestionProvider<Class6619> field30507 = (var0, var1) -> Class6618.method20141(
         ((Class6619)var0.getSource()).method20177().method1414().method29603(), var1
      );

   public static void method22016(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                              "bossbar"
                           )
                           .requires(var0x -> var0x.method20129(2)))
                        .then(
                           Class6099.method18839("add")
                              .then(
                                 Class6099.method18840("id", Class8303.method29031())
                                    .then(
                                       Class6099.method18840("name", Class8010.method27395())
                                          .executes(
                                             var0x -> method22029(
                                                   (Class6619)var0x.getSource(), Class8303.method29036(var0x, "id"), Class8010.method27394(var0x, "name")
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        Class6099.method18839("remove")
                           .then(
                              Class6099.method18840("id", Class8303.method29031())
                                 .suggests(field30507)
                                 .executes(var0x -> method22030((Class6619)var0x.getSource(), method22031(var0x)))
                           )
                     ))
                  .then(Class6099.method18839("list").executes(var0x -> method22028((Class6619)var0x.getSource()))))
               .then(
                  Class6099.method18839("set")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                                "id", Class8303.method29031()
                                             )
                                             .suggests(field30507)
                                             .then(
                                                Class6099.method18839("name")
                                                   .then(
                                                      Class6099.method18840("name", Class8010.method27395())
                                                         .executes(
                                                            var0x -> method22026(
                                                                  (Class6619)var0x.getSource(), method22031(var0x), Class8010.method27394(var0x, "name")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                                                     "color"
                                                                  )
                                                                  .then(
                                                                     Class6099.method18839("pink")
                                                                        .executes(
                                                                           var0x -> method22024(
                                                                                 (Class6619)var0x.getSource(), method22031(var0x), Class2303.field15720
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  Class6099.method18839("blue")
                                                                     .executes(
                                                                        var0x -> method22024(
                                                                              (Class6619)var0x.getSource(), method22031(var0x), Class2303.field15721
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               Class6099.method18839("red")
                                                                  .executes(
                                                                     var0x -> method22024(
                                                                           (Class6619)var0x.getSource(), method22031(var0x), Class2303.field15722
                                                                        )
                                                                  )
                                                            ))
                                                         .then(
                                                            Class6099.method18839("green")
                                                               .executes(
                                                                  var0x -> method22024((Class6619)var0x.getSource(), method22031(var0x), Class2303.field15723)
                                                               )
                                                         ))
                                                      .then(
                                                         Class6099.method18839("yellow")
                                                            .executes(
                                                               var0x -> method22024((Class6619)var0x.getSource(), method22031(var0x), Class2303.field15724)
                                                            )
                                                      ))
                                                   .then(
                                                      Class6099.method18839("purple")
                                                         .executes(var0x -> method22024((Class6619)var0x.getSource(), method22031(var0x), Class2303.field15725))
                                                   ))
                                                .then(
                                                   Class6099.method18839("white")
                                                      .executes(var0x -> method22024((Class6619)var0x.getSource(), method22031(var0x), Class2303.field15726))
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                                            "style"
                                                         )
                                                         .then(
                                                            Class6099.method18839("progress")
                                                               .executes(
                                                                  var0x -> method22025((Class6619)var0x.getSource(), method22031(var0x), Class2300.field15703)
                                                               )
                                                         ))
                                                      .then(
                                                         Class6099.method18839("notched_6")
                                                            .executes(
                                                               var0x -> method22025((Class6619)var0x.getSource(), method22031(var0x), Class2300.field15704)
                                                            )
                                                      ))
                                                   .then(
                                                      Class6099.method18839("notched_10")
                                                         .executes(var0x -> method22025((Class6619)var0x.getSource(), method22031(var0x), Class2300.field15705))
                                                   ))
                                                .then(
                                                   Class6099.method18839("notched_12")
                                                      .executes(var0x -> method22025((Class6619)var0x.getSource(), method22031(var0x), Class2300.field15706))
                                                ))
                                             .then(
                                                Class6099.method18839("notched_20")
                                                   .executes(var0x -> method22025((Class6619)var0x.getSource(), method22031(var0x), Class2300.field15707))
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("value")
                                          .then(
                                             Class6099.method18840("value", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> method22022(
                                                         (Class6619)var0x.getSource(), method22031(var0x), IntegerArgumentType.getInteger(var0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("max")
                                       .then(
                                          Class6099.method18840("max", IntegerArgumentType.integer(1))
                                             .executes(
                                                var0x -> method22023(
                                                      (Class6619)var0x.getSource(), method22031(var0x), IntegerArgumentType.getInteger(var0x, "max")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("visible")
                                    .then(
                                       Class6099.method18840("visible", BoolArgumentType.bool())
                                          .executes(
                                             var0x -> method22021((Class6619)var0x.getSource(), method22031(var0x), BoolArgumentType.getBool(var0x, "visible"))
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)Class6099.method18839("players")
                                    .executes(var0x -> method22027((Class6619)var0x.getSource(), method22031(var0x), Collections.<Class878>emptyList())))
                                 .then(
                                    Class6099.method18840("targets", Class8700.method31353())
                                       .executes(
                                          var0x -> method22027((Class6619)var0x.getSource(), method22031(var0x), Class8700.method31350(var0x, "targets"))
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Class6099.method18839("get")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("id", Class8303.method29031())
                                 .suggests(field30507)
                                 .then(Class6099.method18839("value").executes(var0x -> method22017((Class6619)var0x.getSource(), method22031(var0x)))))
                              .then(Class6099.method18839("max").executes(var0x -> method22018((Class6619)var0x.getSource(), method22031(var0x)))))
                           .then(Class6099.method18839("visible").executes(var0x -> method22019((Class6619)var0x.getSource(), method22031(var0x)))))
                        .then(Class6099.method18839("players").executes(var0x -> method22020((Class6619)var0x.getSource(), method22031(var0x))))
                  )
            )
      );
   }

   private static int method22017(Class6619 var0, Class3623 var1) {
      var0.method20179(new TranslationTextComponent("commands.bossbar.get.value", var1.method12271(), var1.method12267()), true);
      return var1.method12267();
   }

   private static int method22018(Class6619 var0, Class3623 var1) {
      var0.method20179(new TranslationTextComponent("commands.bossbar.get.max", var1.method12271(), var1.method12268()), true);
      return var1.method12268();
   }

   private static int method22019(Class6619 var0, Class3623 var1) {
      if (!var1.method12286()) {
         var0.method20179(new TranslationTextComponent("commands.bossbar.get.visible.hidden", var1.method12271()), true);
         return 0;
      } else {
         var0.method20179(new TranslationTextComponent("commands.bossbar.get.visible.visible", var1.method12271()), true);
         return 1;
      }
   }

   private static int method22020(Class6619 var0, Class3623 var1) {
      if (!var1.method12288().isEmpty()) {
         var0.method20179(
            new TranslationTextComponent(
               "commands.bossbar.get.players.some",
               var1.method12271(),
               var1.method12288().size(),
               TextComponentUtils.func_240649_b_(var1.method12288(), PlayerEntity::getDisplayName)
            ),
            true
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.bossbar.get.players.none", var1.method12271()), true);
      }

      return var1.method12288().size();
   }

   private static int method22021(Class6619 var0, Class3623 var1, boolean var2) throws CommandSyntaxException {
      if (var1.method12286() != var2) {
         var1.method12287(var2);
         if (!var2) {
            var0.method20179(new TranslationTextComponent("commands.bossbar.set.visible.success.hidden", var1.method12271()), true);
         } else {
            var0.method20179(new TranslationTextComponent("commands.bossbar.set.visible.success.visible", var1.method12271()), true);
         }

         return 0;
      } else if (!var2) {
         throw field30505.create();
      } else {
         throw field30506.create();
      }
   }

   private static int method22022(Class6619 var0, Class3623 var1, int var2) throws CommandSyntaxException {
      if (var1.method12267() != var2) {
         var1.method12269(var2);
         var0.method20179(new TranslationTextComponent("commands.bossbar.set.value.success", var1.method12271(), var2), true);
         return var2;
      } else {
         throw field30503.create();
      }
   }

   private static int method22023(Class6619 var0, Class3623 var1, int var2) throws CommandSyntaxException {
      if (var1.method12268() != var2) {
         var1.method12270(var2);
         var0.method20179(new TranslationTextComponent("commands.bossbar.set.max.success", var1.method12271(), var2), true);
         return var2;
      } else {
         throw field30504.create();
      }
   }

   private static int method22024(Class6619 var0, Class3623 var1, Class2303 var2) throws CommandSyntaxException {
      if (!var1.method12292().equals(var2)) {
         var1.method12279(var2);
         var0.method20179(new TranslationTextComponent("commands.bossbar.set.color.success", var1.method12271()), true);
         return 0;
      } else {
         throw field30501.create();
      }
   }

   private static int method22025(Class6619 var0, Class3623 var1, Class2300 var2) throws CommandSyntaxException {
      if (!var1.method12293().equals(var2)) {
         var1.method12280(var2);
         var0.method20179(new TranslationTextComponent("commands.bossbar.set.style.success", var1.method12271()), true);
         return 0;
      } else {
         throw field30502.create();
      }
   }

   private static int method22026(Class6619 var0, Class3623 var1, ITextComponent var2) throws CommandSyntaxException {
      IFormattableTextComponent var5 = TextComponentUtils.func_240645_a_(var0, var2, (Entity)null, 0);
      if (!var1.method12290().equals(var5)) {
         var1.method12284(var5);
         var0.method20179(new TranslationTextComponent("commands.bossbar.set.name.success", var1.method12271()), true);
         return 0;
      } else {
         throw field30500.create();
      }
   }

   private static int method22027(Class6619 var0, Class3623 var1, Collection<Class878> var2) throws CommandSyntaxException {
      boolean var5 = var1.method12272(var2);
      if (var5) {
         if (!var1.method12288().isEmpty()) {
            var0.method20179(
               new TranslationTextComponent(
                  "commands.bossbar.set.players.success.some", var1.method12271(), var2.size(), TextComponentUtils.func_240649_b_(var2, PlayerEntity::getDisplayName)
               ),
               true
            );
         } else {
            var0.method20179(new TranslationTextComponent("commands.bossbar.set.players.success.none", var1.method12271()), true);
         }

         return var1.method12288().size();
      } else {
         throw field30499.create();
      }
   }

   private static int method22028(Class6619 var0) {
      Collection var3 = var0.method20177().method1414().method29604();
      if (!var3.isEmpty()) {
         var0.method20179(
            new TranslationTextComponent("commands.bossbar.list.bars.some", var3.size(), TextComponentUtils.func_240649_b_(var3, Class3623::method12271)),
            false
         );
      } else {
         var0.method20179(new TranslationTextComponent("commands.bossbar.list.bars.none"), false);
      }

      return var3.size();
   }

   private static int method22029(Class6619 var0, ResourceLocation var1, ITextComponent var2) throws CommandSyntaxException {
      Class8426 var5 = var0.method20177().method1414();
      if (var5.method29600(var1) == null) {
         Class3623 var6 = var5.method29601(var1, TextComponentUtils.func_240645_a_(var0, var2, (Entity)null, 0));
         var0.method20179(new TranslationTextComponent("commands.bossbar.create.success", var6.method12271()), true);
         return var5.method29604().size();
      } else {
         throw field30497.create(var1.toString());
      }
   }

   private static int method22030(Class6619 var0, Class3623 var1) {
      Class8426 var4 = var0.method20177().method1414();
      var1.method12266();
      var4.method29602(var1);
      var0.method20179(new TranslationTextComponent("commands.bossbar.remove.success", var1.method12271()), true);
      return var4.method29604().size();
   }

   public static Class3623 method22031(CommandContext<Class6619> var0) throws CommandSyntaxException {
      ResourceLocation var3 = Class8303.method29036(var0, "id");
      Class3623 var4 = ((Class6619)var0.getSource()).method20177().method1414().method29600(var3);
      if (var4 != null) {
         return var4;
      } else {
         throw field30498.create(var3.toString());
      }
   }
}
