package remapped;

import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5227 {
   private static final SimpleCommandExceptionType field_26819 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType field_26821 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.tag.remove.failed"));

   public static void method_23924(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("tag").requires(var0x -> var0x.method_40314(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25407())
                        .then(
                           class_465.method_2231("add")
                              .then(
                                 class_465.method_2236("name", StringArgumentType.word())
                                    .executes(
                                       var0x -> method_23921(
                                             (class_9155)var0x.getSource(),
                                             class_5601.method_25410(var0x, "targets"),
                                             StringArgumentType.getString(var0x, "name")
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("remove")
                           .then(
                              class_465.method_2236("name", StringArgumentType.word())
                                 .suggests((var0x, var1) -> class_8773.method_40319(method_23920(class_5601.method_25410(var0x, "targets")), var1))
                                 .executes(
                                    var0x -> method_23925(
                                          (class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"), StringArgumentType.getString(var0x, "name")
                                       )
                                 )
                           )
                     ))
                  .then(class_465.method_2231("list").executes(var0x -> method_23923((class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"))))
            )
      );
   }

   private static Collection<String> method_23920(Collection<? extends class_8145> var0) {
      HashSet var3 = Sets.newHashSet();

      for (class_8145 var5 : var0) {
         var3.addAll(var5.method_37293());
      }

      return var3;
   }

   private static int method_23921(class_9155 var0, Collection<? extends class_8145> var1, String var2) throws CommandSyntaxException {
      int var5 = 0;

      for (class_8145 var7 : var1) {
         if (var7.method_37292(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.tag.add.success.multiple", var2, var1.size()), true);
         } else {
            var0.method_42196(new TranslationTextComponent("commands.tag.add.success.single", var2, ((class_8145)var1.iterator().next()).method_19839()), true);
         }

         return var5;
      } else {
         throw field_26819.create();
      }
   }

   private static int method_23925(class_9155 var0, Collection<? extends class_8145> var1, String var2) throws CommandSyntaxException {
      int var5 = 0;

      for (class_8145 var7 : var1) {
         if (var7.method_37238(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.tag.remove.success.multiple", var2, var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent("commands.tag.remove.success.single", var2, ((class_8145)var1.iterator().next()).method_19839()), true
            );
         }

         return var5;
      } else {
         throw field_26821.create();
      }
   }

   private static int method_23923(class_9155 var0, Collection<? extends class_8145> var1) {
      HashSet var4 = Sets.newHashSet();

      for (class_8145 var6 : var1) {
         var4.addAll(var6.method_37293());
      }

      if (var1.size() != 1) {
         if (!var4.isEmpty()) {
            var0.method_42196(
               new TranslationTextComponent("commands.tag.list.multiple.success", var1.size(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
               false
            );
         } else {
            var0.method_42196(new TranslationTextComponent("commands.tag.list.multiple.empty", var1.size()), false);
         }
      } else {
         class_8145 var7 = (class_8145)var1.iterator().next();
         if (!var4.isEmpty()) {
            var0.method_42196(
               new TranslationTextComponent("commands.tag.list.single.success", var7.method_19839(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
               false
            );
         } else {
            var0.method_42196(new TranslationTextComponent("commands.tag.list.single.empty", var7.method_19839()), false);
         }
      }

      return var4.size();
   }
}
