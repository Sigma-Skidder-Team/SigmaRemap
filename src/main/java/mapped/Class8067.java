package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class Class8067 {
   private static String[] field34638;
   private final Style field34639;
   private final String field34640;
   private final ITextComponent field34641;
   private final int field34642;
   private final int field34643;

   public Class8067(Style var1, String var2, int var3, int var4) {
      this.field34639 = var1;
      this.field34640 = var2;
      this.field34642 = var3;
      this.field34643 = var4;
      this.field34641 = new StringTextComponent(var2).setStyle(var1);
   }

   // $VF: synthetic method
   public static ITextComponent method27765(Class8067 var0) {
      return var0.field34641;
   }

   // $VF: synthetic method
   public static int method27766(Class8067 var0) {
      return var0.field34642;
   }

   // $VF: synthetic method
   public static int method27767(Class8067 var0) {
      return var0.field34643;
   }

   // $VF: synthetic method
   public static String method27768(Class8067 var0) {
      return var0.field34640;
   }

   // $VF: synthetic method
   public static Style method27769(Class8067 var0) {
      return var0.field34639;
   }
}
