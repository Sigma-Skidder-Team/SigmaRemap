package mapped;

import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class Class1135 extends Screen {
   private static String[] field6191;
   public final Screen field6192;
   public final GameSettings field6193;

   public Class1135(Screen var1, GameSettings var2, ITextComponent var3) {
      super(var3);
      this.field6192 = var1;
      this.field6193 = var2;
   }

   @Override
   public void onClose() {
      this.mc.gameSettings.saveOptions();
   }

   @Override
   public void method1945() {
      this.mc.displayGuiScreen(this.field6192);
   }

   @Nullable
   public static List<Class9125> method5458(Class1296 var0, int var1, int var2) {
      Optional var5 = var0.method6133((double)var1, (double)var2);
      if (var5.isPresent() && var5.get() instanceof Class1233) {
         Optional var6 = ((Class1233)var5.get()).method5810();
         return (List<Class9125>)var6.orElse((List)null);
      } else {
         return null;
      }
   }
}
