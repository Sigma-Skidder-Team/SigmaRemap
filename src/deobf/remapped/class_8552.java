package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8552 {
   private static final Logger field_43756 = LogManager.getLogger();

   public static void method_39342(Collection<String> var0, class_9155 var1) {
      var1.method_42177().method_1645(var0).exceptionally(var1x -> {
         field_43756.warn("Failed to execute reload", var1x);
         var1.method_42175(new TranslationTextComponent("commands.reload.failure"));
         return null;
      });
   }

   private static Collection<String> method_39340(class_6354 var0, class_5684 var1, Collection<String> var2) {
      var0.method_29122();
      ArrayList var5 = Lists.newArrayList(var2);
      List var6 = var1.method_25697().method_12753();

      for (String var8 : var0.method_29118()) {
         if (!var6.contains(var8) && !var5.contains(var8)) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public static void method_39341(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("reload").requires(var0x -> var0x.method_40314(2))).executes(var0x -> {
            class_9155 var3 = (class_9155)var0x.getSource();
            class_341 var4 = var3.method_42177();
            class_6354 var5 = var4.method_1747();
            class_5684 var6 = var4.method_1601();
            Collection var7 = var5.method_29123();
            Collection var8 = method_39340(var5, var6, var7);
            var3.method_42196(new TranslationTextComponent("commands.reload.success"), true);
            method_39342(var8, var3);
            return 0;
         })
      );
   }
}
