package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.UUID;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1239 {
   private static final SuggestionProvider<class_9155> field_6840 = (var0, var1) -> class_8773.method_40324(class_8669.field_44403.method_39805(), var1);
   private static final DynamicCommandExceptionType field_6838 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.attribute.failed.entity", var0)
   );
   private static final Dynamic2CommandExceptionType field_6839 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.attribute.failed.no_attribute", var0, var1)
   );
   private static final Dynamic3CommandExceptionType field_6841 = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new TranslationTextComponent("commands.attribute.failed.no_modifier", var1, var0, var2)
   );
   private static final Dynamic3CommandExceptionType field_6842 = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> new TranslationTextComponent("commands.attribute.failed.modifier_already_present", var2, var1, var0)
   );

   public static void method_5526(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("attribute").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("target", class_5601.method_25411())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("attribute", class_4195.method_19515())
                              .suggests(field_6840)
                              .then(
                                 ((LiteralArgumentBuilder)class_465.method_2231("get")
                                       .executes(
                                          var0x -> method_5530(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25413(var0x, "target"),
                                                class_4195.method_19514(var0x, "attribute"),
                                                1.0
                                             )
                                       ))
                                    .then(
                                       class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var0x -> method_5530(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25413(var0x, "target"),
                                                   class_4195.method_19514(var0x, "attribute"),
                                                   DoubleArgumentType.getDouble(var0x, "scale")
                                                )
                                          )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class_465.method_2231("base")
                                    .then(
                                       class_465.method_2231("set")
                                          .then(
                                             class_465.method_2236("value", DoubleArgumentType.doubleArg())
                                                .executes(
                                                   var0x -> method_5525(
                                                         (class_9155)var0x.getSource(),
                                                         class_5601.method_25413(var0x, "target"),
                                                         class_4195.method_19514(var0x, "attribute"),
                                                         DoubleArgumentType.getDouble(var0x, "value")
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    ((LiteralArgumentBuilder)class_465.method_2231("get")
                                          .executes(
                                             var0x -> method_5524(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25413(var0x, "target"),
                                                   class_4195.method_19514(var0x, "attribute"),
                                                   1.0
                                                )
                                          ))
                                       .then(
                                          class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                             .executes(
                                                var0x -> method_5524(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25413(var0x, "target"),
                                                      class_4195.method_19514(var0x, "attribute"),
                                                      DoubleArgumentType.getDouble(var0x, "scale")
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("modifier")
                                    .then(
                                       class_465.method_2231("add")
                                          .then(
                                             class_465.method_2236("uuid", class_9492.method_43845())
                                                .then(
                                                   class_465.method_2236("name", StringArgumentType.string())
                                                      .then(
                                                         ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                                     "value", DoubleArgumentType.doubleArg()
                                                                  )
                                                                  .then(
                                                                     class_465.method_2231("add")
                                                                        .executes(
                                                                           var0x -> method_5520(
                                                                                 (class_9155)var0x.getSource(),
                                                                                 class_5601.method_25413(var0x, "target"),
                                                                                 class_4195.method_19514(var0x, "attribute"),
                                                                                 class_9492.method_43846(var0x, "uuid"),
                                                                                 StringArgumentType.getString(var0x, "name"),
                                                                                 DoubleArgumentType.getDouble(var0x, "value"),
                                                                                 class_9342.field_47679
                                                                              )
                                                                        )
                                                                  ))
                                                               .then(
                                                                  class_465.method_2231("multiply")
                                                                     .executes(
                                                                        var0x -> method_5520(
                                                                              (class_9155)var0x.getSource(),
                                                                              class_5601.method_25413(var0x, "target"),
                                                                              class_4195.method_19514(var0x, "attribute"),
                                                                              class_9492.method_43846(var0x, "uuid"),
                                                                              StringArgumentType.getString(var0x, "name"),
                                                                              DoubleArgumentType.getDouble(var0x, "value"),
                                                                              class_9342.field_47677
                                                                           )
                                                                     )
                                                               ))
                                                            .then(
                                                               class_465.method_2231("multiply_base")
                                                                  .executes(
                                                                     var0x -> method_5520(
                                                                           (class_9155)var0x.getSource(),
                                                                           class_5601.method_25413(var0x, "target"),
                                                                           class_4195.method_19514(var0x, "attribute"),
                                                                           class_9492.method_43846(var0x, "uuid"),
                                                                           StringArgumentType.getString(var0x, "name"),
                                                                           DoubleArgumentType.getDouble(var0x, "value"),
                                                                           class_9342.field_47678
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("remove")
                                       .then(
                                          class_465.method_2236("uuid", class_9492.method_43845())
                                             .executes(
                                                var0x -> method_5529(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25413(var0x, "target"),
                                                      class_4195.method_19514(var0x, "attribute"),
                                                      class_9492.method_43846(var0x, "uuid")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("value")
                                    .then(
                                       class_465.method_2231("get")
                                          .then(
                                             ((RequiredArgumentBuilder)class_465.method_2236("uuid", class_9492.method_43845())
                                                   .executes(
                                                      var0x -> method_5523(
                                                            (class_9155)var0x.getSource(),
                                                            class_5601.method_25413(var0x, "target"),
                                                            class_4195.method_19514(var0x, "attribute"),
                                                            class_9492.method_43846(var0x, "uuid"),
                                                            1.0
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2236("scale", DoubleArgumentType.doubleArg())
                                                      .executes(
                                                         var0x -> method_5523(
                                                               (class_9155)var0x.getSource(),
                                                               class_5601.method_25413(var0x, "target"),
                                                               class_4195.method_19514(var0x, "attribute"),
                                                               class_9492.method_43846(var0x, "uuid"),
                                                               DoubleArgumentType.getDouble(var0x, "scale")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static class_9747 method_5527(Entity var0, class_225 var1) throws CommandSyntaxException {
      class_9747 var4 = method_5522(var0).method_26590().method_30808(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw field_6839.create(var0.method_45509(), new TranslationTextComponent(var1.method_952()));
      }
   }

   private static LivingEntity method_5522(Entity var0) throws CommandSyntaxException {
      if (var0 instanceof LivingEntity) {
         return (LivingEntity)var0;
      } else {
         throw field_6838.create(var0.method_45509());
      }
   }

   private static LivingEntity method_5521(Entity var0, class_225 var1) throws CommandSyntaxException {
      LivingEntity var4 = method_5522(var0);
      if (var4.method_26590().method_30801(var1)) {
         return var4;
      } else {
         throw field_6839.create(var0.method_45509(), new TranslationTextComponent(var1.method_952()));
      }
   }

   private static int method_5530(class_9155 var0, Entity var1, class_225 var2, double var3) throws CommandSyntaxException {
      LivingEntity var7 = method_5521(var1, var2);
      double var8 = var7.method_26575(var2);
      var0.method_42196(
         new TranslationTextComponent("commands.attribute.value.get.success", new TranslationTextComponent(var2.method_952()), var1.method_45509(), var8),
         false
      );
      return (int)(var8 * var3);
   }

   private static int method_5524(class_9155 var0, Entity var1, class_225 var2, double var3) throws CommandSyntaxException {
      LivingEntity var7 = method_5521(var1, var2);
      double var8 = var7.method_26419(var2);
      var0.method_42196(
         new TranslationTextComponent("commands.attribute.base_value.get.success", new TranslationTextComponent(var2.method_952()), var1.method_45509(), var8),
         false
      );
      return (int)(var8 * var3);
   }

   private static int method_5523(class_9155 var0, Entity var1, class_225 var2, UUID var3, double var4) throws CommandSyntaxException {
      LivingEntity var8 = method_5521(var1, var2);
      class_6711 var9 = var8.method_26590();
      if (var9.method_30810(var2, var3)) {
         double var10 = var9.method_30806(var2, var3);
         var0.method_42196(
            new TranslationTextComponent(
               "commands.attribute.modifier.value.get.success", var3, new TranslationTextComponent(var2.method_952()), var1.method_45509(), var10
            ),
            false
         );
         return (int)(var10 * var4);
      } else {
         throw field_6841.create(var1.method_45509(), new TranslationTextComponent(var2.method_952()), var3);
      }
   }

   private static int method_5525(class_9155 var0, Entity var1, class_225 var2, double var3) throws CommandSyntaxException {
      method_5527(var1, var2).method_45006(var3);
      var0.method_42196(
         new TranslationTextComponent("commands.attribute.base_value.set.success", new TranslationTextComponent(var2.method_952()), var1.method_45509(), var3),
         false
      );
      return 1;
   }

   private static int method_5520(class_9155 var0, Entity var1, class_225 var2, UUID var3, String var4, double var5, class_9342 var7) throws CommandSyntaxException {
      class_9747 var10 = method_5527(var1, var2);
      class_9343 var11 = new class_9343(var3, var4, var5, var7);
      if (!var10.method_45007(var11)) {
         var10.method_45005(var11);
         var0.method_42196(
            new TranslationTextComponent("commands.attribute.modifier.add.success", var3, new TranslationTextComponent(var2.method_952()), var1.method_45509()),
            false
         );
         return 1;
      } else {
         throw field_6842.create(var1.method_45509(), new TranslationTextComponent(var2.method_952()), var3);
      }
   }

   private static int method_5529(class_9155 var0, Entity var1, class_225 var2, UUID var3) throws CommandSyntaxException {
      class_9747 var6 = method_5527(var1, var2);
      if (!var6.method_45008(var3)) {
         throw field_6841.create(var1.method_45509(), new TranslationTextComponent(var2.method_952()), var3);
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.attribute.modifier.remove.success", var3, new TranslationTextComponent(var2.method_952()), var1.method_45509()
            ),
            false
         );
         return 1;
      }
   }
}
