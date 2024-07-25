package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9576 {
   public static void method_44252(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("title").requires(var0x -> var0x.method_40314(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                    "targets", class_5601.method_25409()
                                 )
                                 .then(
                                    class_465.method_2231("clear")
                                       .executes(var0x -> method_44256((class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets")))
                                 ))
                              .then(
                                 class_465.method_2231("reset")
                                    .executes(var0x -> method_44255((class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets")))
                              ))
                           .then(
                              class_465.method_2231("title")
                                 .then(
                                    class_465.method_2236("title", class_3352.method_15361())
                                       .executes(
                                          var0x -> method_44251(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25412(var0x, "targets"),
                                                class_3352.method_15360(var0x, "title"),
                                                class_7357.field_37609
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("subtitle")
                              .then(
                                 class_465.method_2236("title", class_3352.method_15361())
                                    .executes(
                                       var0x -> method_44251(
                                             (class_9155)var0x.getSource(),
                                             class_5601.method_25412(var0x, "targets"),
                                             class_3352.method_15360(var0x, "title"),
                                             class_7357.field_37607
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("actionbar")
                           .then(
                              class_465.method_2236("title", class_3352.method_15361())
                                 .executes(
                                    var0x -> method_44251(
                                          (class_9155)var0x.getSource(),
                                          class_5601.method_25412(var0x, "targets"),
                                          class_3352.method_15360(var0x, "title"),
                                          class_7357.field_37610
                                       )
                                 )
                           )
                     ))
                  .then(
                     class_465.method_2231("times")
                        .then(
                           class_465.method_2236("fadeIn", IntegerArgumentType.integer(0))
                              .then(
                                 class_465.method_2236("stay", IntegerArgumentType.integer(0))
                                    .then(
                                       class_465.method_2236("fadeOut", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> method_44254(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger(var0x, "stay"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_44256(class_9155 var0, Collection<class_9359> var1) {
      class_3299 var4 = new class_3299(class_7357.field_37606, (ITextComponent)null);

      for (class_9359 var6 : var1) {
         var6.field_47794.method_4156(var4);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.title.cleared.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.title.cleared.single", ((class_9359)var1.iterator().next()).method_19839()), true);
      }

      return var1.size();
   }

   private static int method_44255(class_9155 var0, Collection<class_9359> var1) {
      class_3299 var4 = new class_3299(class_7357.field_37603, (ITextComponent)null);

      for (class_9359 var6 : var1) {
         var6.field_47794.method_4156(var4);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.title.reset.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.title.reset.single", ((class_9359)var1.iterator().next()).method_19839()), true);
      }

      return var1.size();
   }

   private static int method_44251(class_9155 var0, Collection<class_9359> var1, ITextComponent var2, class_7357 var3) throws CommandSyntaxException {
      for (class_9359 var7 : var1) {
         var7.field_47794.method_4156(new class_3299(var3, TextComponentUtils.func_240645_a_(var0, var2, var7, 0)));
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".multiple", var1.size()), true);
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".single", ((class_9359)var1.iterator().next()).method_19839()
            ),
            true
         );
      }

      return var1.size();
   }

   private static int method_44254(class_9155 var0, Collection<class_9359> var1, int var2, int var3, int var4) {
      class_3299 var7 = new class_3299(var2, var3, var4);

      for (class_9359 var9 : var1) {
         var9.field_47794.method_4156(var7);
      }

      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.title.times.multiple", var1.size()), true);
      } else {
         var0.method_42196(new TranslationTextComponent("commands.title.times.single", ((class_9359)var1.iterator().next()).method_19839()), true);
      }

      return var1.size();
   }
}
