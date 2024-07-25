package remapped;

import java.lang.reflect.InvocationTargetException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class class_4233 {
   private static String[] field_20542;
   private static final MinecraftClient field_20543 = MinecraftClient.getInstance();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void method_19731(int var0) {
      if (SigmaMainClass.getInstance().method_3312() != class_6015.field_30642) {
         if (var0 != -1) {
            for (class_3158 var5 : SigmaMainClass.getInstance().getModuleManager().method_835().method_382(var0)) {
               if (var5 != null && var5.method_14561()) {
                  switch (var5.method_14566()) {
                     case field_25372:
                        var5.method_14560().method_41999();
                        break;
                     case field_25373:
                        try {
                           Screen var6 = var5.method_14559()
                              .getDeclaredConstructor(ITextComponent.class)
                              .newInstance(new StringTextComponent(class_6763.field_34911.get(var5.method_14559())));
                           if (SigmaMainClass.getInstance().method_3299().method_31008(var6)) {
                              field_20543.method_8609(var6);
                           }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | InstantiationException var7) {
                           var7.printStackTrace();
                        }
                  }
               }
            }
         }
      }
   }

   public static void method_19733(int var0) {
      class_307 var3 = new class_307(var0);
      SigmaMainClass.getInstance().getEventManager().call(var3);
   }
}
