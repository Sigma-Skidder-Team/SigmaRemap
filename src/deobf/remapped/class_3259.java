package remapped;

import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_3259 extends Screen {
   private static String[] field_16163;

   public final Screen field_16162;
   public final GameOptions field_16164;

   public class_3259(Screen var1, GameOptions var2, ITextComponent var3) {
      super(var3);
      this.field_16162 = var1;
      this.field_16164 = var2;
   }

   @Override
   public void method_1162() {
      this.field_943.gameOptions.method_40873();
   }

   @Override
   public void method_1156() {
      this.field_943.method_8609(this.field_16162);
   }

   @Nullable
   public static List<class_7107> method_14872(class_2825 var0, int var1, int var2) {
      Optional var5 = var0.method_12855((double)var1, (double)var2);
      if (var5.isPresent() && var5.get() instanceof class_938) {
         Optional var6 = ((class_938)var5.get()).method_4059();
         return (List<class_7107>)var6.orElse((List)null);
      } else {
         return null;
      }
   }
}
