package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9482 {
   private static final Logger field44075 = LogManager.getLogger();

   public static void method36605(Collection<String> var0, Class6619 var1) {
      var1.method20177().method1398(var0).exceptionally(var1x -> {
         field44075.warn("Failed to execute reload", var1x);
         var1.method20181(new TranslationTextComponent("commands.reload.failure"));
         return null;
      });
   }

   private static Collection<String> method36606(Class313 var0, Class6611 var1, Collection<String> var2) {
      var0.method1262();
      ArrayList var5 = Lists.newArrayList(var2);
      List var6 = var1.method20091().method26105();

      for (String var8 : var0.method1267()) {
         if (!var6.contains(var8) && !var5.contains(var8)) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public static void method36607(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("reload").requires(var0x -> var0x.method20129(2))).executes(var0x -> {
            Class6619 var3 = (Class6619)var0x.getSource();
            Class314 var4 = var3.method20177();
            Class313 var5 = var4.method1402();
            Class6611 var6 = var4.method1436();
            Collection var7 = var5.method1269();
            Collection var8 = method36606(var5, var6, var7);
            var3.method20179(new TranslationTextComponent("commands.reload.success"), true);
            method36605(var8, var3);
            return 0;
         })
      );
   }
}
