package mapped;

import java.util.Collection;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3339 extends Class3257 {
   public Class3339(Class5643 var1) {
      super(var1);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }

   @Override
   public boolean method11706(Class7380 var1, World var2, BlockPos var3, PlayerEntity var4) {
      if (!var2.field9020) {
         this.method11886(var4, var1, var2, var3, false, var4.getHeldItem(Hand.field182));
      }

      return false;
   }

   @Override
   public ActionResultType method11707(Class5911 var1) {
      PlayerEntity var4 = var1.method18358();
      World var5 = var1.method18360();
      if (!var5.field9020 && var4 != null) {
         BlockPos var6 = var1.method18345();
         this.method11886(var4, var5.method6738(var6), var5, var6, true, var1.method18357());
      }

      return ActionResultType.method9002(var5.field9020);
   }

   private void method11886(PlayerEntity var1, Class7380 var2, Class1660 var3, BlockPos var4, boolean var5, ItemStack var6) {
      if (var1.method2979()) {
         Block var9 = var2.method23383();
         Class9348 var10 = var9.method11577();
         Collection var11 = var10.method35395();
         String var12 = Class2348.field16072.method9181(var9).toString();
         if (!var11.isEmpty()) {
            Class39 var13 = var6.method32144("DebugProperty");
            String var14 = var13.method126(var12);
            Class8550 var15 = var10.method35396(var14);
            if (!var5) {
               var15 = method11888(var11, var15, var1.method2851());
               String var16 = var15.method30472();
               var13.method109(var12, var16);
               method11889(var1, new TranslationTextComponent(this.method11719() + ".select", var16, method11890(var2, var15)));
            } else {
               if (var15 == null) {
                  var15 = (Class8550)var11.iterator().next();
               }

               Class7380 var18 = method11887(var2, var15, var1.method2851());
               var3.method6725(var4, var18, 18);
               method11889(var1, new TranslationTextComponent(this.method11719() + ".update", var15.method30472(), method11890(var18, var15)));
            }
         } else {
            method11889(var1, new TranslationTextComponent(this.method11719() + ".empty", var12));
         }
      }
   }

   private static <T extends Comparable<T>> Class7380 method11887(Class7380 var0, Class8550<T> var1, boolean var2) {
      return var0.method23465(var1, method11888(var1.method30474(), var0.method23463(var1), var2));
   }

   private static <T> T method11888(Iterable<T> var0, T var1, boolean var2) {
      return !var2 ? Util.<T>method38505(var0, (T)var1) : Util.<T>method38506(var0, (T)var1);
   }

   private static void method11889(PlayerEntity var0, ITextComponent var1) {
      ((Class878)var0).method2802(var1, ChatType.GAME_INFO, Util.field45724);
   }

   private static <T extends Comparable<T>> String method11890(Class7380 var0, Class8550<T> var1) {
      return var1.method30475(var0.<T>method23463(var1));
   }
}
