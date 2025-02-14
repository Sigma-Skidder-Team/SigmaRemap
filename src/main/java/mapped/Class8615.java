package mapped;

import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.HashSet;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8615 {
   private static final SimpleCommandExceptionType field38741 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType field38742 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.tag.remove.failed"));

   public static void method30863(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("tag").requires(var0x -> var0x.method20129(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder) Commands.method18840("targets", Class8700.method31347())
                        .then(
                           Commands.method18839("add")
                              .then(
                                 Commands.method18840("name", StringArgumentType.word())
                                    .executes(
                                       var0x -> method30865(
                                             (CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"), StringArgumentType.getString(var0x, "name")
                                          )
                                    )
                              )
                        ))
                     .then(
                        Commands.method18839("remove")
                           .then(
                              Commands.method18840("name", StringArgumentType.word())
                                 .suggests((var0x, var1) -> ISuggestionProvider.suggest(method30864(Class8700.method31348(var0x, "targets")), var1))
                                 .executes(
                                    var0x -> method30866(
                                          (CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"), StringArgumentType.getString(var0x, "name")
                                       )
                                 )
                           )
                     ))
                  .then(Commands.method18839("list").executes(var0x -> method30867((CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"))))
            )
      );
   }

   private static Collection<String> method30864(Collection<? extends Entity> var0) {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : var0) {
         var3.addAll(var5.getTags());
      }

      return var3;
   }

   private static int method30865(CommandSource var0, Collection<? extends Entity> var1, String var2) throws CommandSyntaxException {
      int var5 = 0;

      for (Entity var7 : var1) {
         if (var7.addTag(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.add.success.multiple", var2, var1.size()), true);
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.add.success.single", var2, ((Entity)var1.iterator().next()).getDisplayName()), true);
         }

         return var5;
      } else {
         throw field38741.create();
      }
   }

   private static int method30866(CommandSource var0, Collection<? extends Entity> var1, String var2) throws CommandSyntaxException {
      int var5 = 0;

      for (Entity var7 : var1) {
         if (var7.removeTag(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.remove.success.multiple", var2, var1.size()), true);
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.remove.success.single", var2, ((Entity)var1.iterator().next()).getDisplayName()), true);
         }

         return var5;
      } else {
         throw field38742.create();
      }
   }

   private static int method30867(CommandSource var0, Collection<? extends Entity> var1) {
      HashSet var4 = Sets.newHashSet();

      for (Entity var6 : var1) {
         var4.addAll(var6.getTags());
      }

      if (var1.size() != 1) {
         if (!var4.isEmpty()) {
            var0.sendFeedback(
               new TranslationTextComponent("commands.tag.list.multiple.success", var1.size(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
               false
            );
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.list.multiple.empty", var1.size()), false);
         }
      } else {
         Entity var7 = (Entity)var1.iterator().next();
         if (!var4.isEmpty()) {
            var0.sendFeedback(
               new TranslationTextComponent("commands.tag.list.single.success", var7.getDisplayName(), var4.size(), TextComponentUtils.makeGreenSortedList(var4)),
               false
            );
         } else {
            var0.sendFeedback(new TranslationTextComponent("commands.tag.list.single.empty", var7.getDisplayName()), false);
         }
      }

      return var4.size();
   }
}
