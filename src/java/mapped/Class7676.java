package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7676 {
   private static final SimpleCommandExceptionType field32884 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType field32885 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType field32886 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType field32887 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.whitelist.remove.failed"));

   public static void method25217(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                 "whitelist"
                              )
                              .requires(var0x -> var0x.method20129(3)))
                           .then(Class6099.method18839("on").executes(var0x -> method25221((Class6619)var0x.getSource()))))
                        .then(Class6099.method18839("off").executes(var0x -> method25222((Class6619)var0x.getSource()))))
                     .then(Class6099.method18839("list").executes(var0x -> method25223((Class6619)var0x.getSource()))))
                  .then(
                     Class6099.method18839("add")
                        .then(
                           Class6099.method18840("targets", Class7713.method25483())
                              .suggests(
                                 (var0x, var1) -> {
                                    Class6395 var4 = ((Class6619)var0x.getSource()).method20177().method1367();
                                    return Class6618.method20148(
                                       var4.method19488()
                                          .stream()
                                          .filter(var1x -> !var4.method19468().method14448(var1x.method2906()))
                                          .<String>map(var0xx -> var0xx.method2906().getName()),
                                       var1
                                    );
                                 }
                              )
                              .executes(var0x -> method25219((Class6619)var0x.getSource(), Class7713.method25482(var0x, "targets")))
                        )
                  ))
               .then(
                  Class6099.method18839("remove")
                     .then(
                        Class6099.method18840("targets", Class7713.method25483())
                           .suggests((var0x, var1) -> Class6618.method20149(((Class6619)var0x.getSource()).method20177().method1367().method19469(), var1))
                           .executes(var0x -> method25220((Class6619)var0x.getSource(), Class7713.method25482(var0x, "targets")))
                     )
               ))
            .then(Class6099.method18839("reload").executes(var0x -> method25218((Class6619)var0x.getSource())))
      );
   }

   private static int method25218(Class6619 var0) {
      var0.method20177().method1367().method19432();
      var0.method20179(new TranslationTextComponent("commands.whitelist.reloaded"), true);
      var0.method20177().method1401(var0);
      return 1;
   }

   private static int method25219(Class6619 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class4531 var4 = var0.method20177().method1367().method19468();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (!var4.method14448(var7)) {
            Class6791 var8 = new Class6791(var7);
            var4.method14436(var8);
            var0.method20179(new TranslationTextComponent("commands.whitelist.add.success", TextComponentUtils.getDisplayName(var7)), true);
            var5++;
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field32886.create();
      }
   }

   private static int method25220(Class6619 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      Class4531 var4 = var0.method20177().method1367().method19468();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (var4.method14448(var7)) {
            Class6791 var8 = new Class6791(var7);
            var4.method14439(var8);
            var0.method20179(new TranslationTextComponent("commands.whitelist.remove.success", TextComponentUtils.getDisplayName(var7)), true);
            var5++;
         }
      }

      if (var5 != 0) {
         var0.method20177().method1401(var0);
         return var5;
      } else {
         throw field32887.create();
      }
   }

   private static int method25221(Class6619 var0) throws CommandSyntaxException {
      Class6395 var3 = var0.method20177().method1367();
      if (!var3.method19476()) {
         var3.method19429(true);
         var0.method20179(new TranslationTextComponent("commands.whitelist.enabled"), true);
         var0.method20177().method1401(var0);
         return 1;
      } else {
         throw field32884.create();
      }
   }

   private static int method25222(Class6619 var0) throws CommandSyntaxException {
      Class6395 var3 = var0.method20177().method1367();
      if (var3.method19476()) {
         var3.method19429(false);
         var0.method20179(new TranslationTextComponent("commands.whitelist.disabled"), true);
         return 1;
      } else {
         throw field32885.create();
      }
   }

   private static int method25223(Class6619 var0) {
      String[] var3 = var0.method20177().method1367().method19469();
      if (var3.length != 0) {
         var0.method20179(new TranslationTextComponent("commands.whitelist.list", var3.length, String.join(", ", var3)), false);
      } else {
         var0.method20179(new TranslationTextComponent("commands.whitelist.none"), false);
      }

      return var3.length;
   }
}
