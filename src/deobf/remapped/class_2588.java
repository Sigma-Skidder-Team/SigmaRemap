package remapped;

import java.util.Collection;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2588 extends class_2451 {
   public class_2588(class_317 var1) {
      super(var1);
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return true;
   }

   @Override
   public boolean method_11203(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4) {
      if (!var2.field_33055) {
         this.method_11756(var4, var1, var2, var3, false, var4.method_26617(Hand.MAIN_HAND));
      }

      return false;
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      PlayerEntity var4 = var1.method_21868();
      World var5 = var1.method_21862();
      if (!var5.field_33055 && var4 != null) {
         BlockPos var6 = var1.method_21858();
         this.method_11756(var4, var5.method_28262(var6), var5, var6, true, var1.method_21867());
      }

      return class_6910.method_31659(var5.field_33055);
   }

   private void method_11756(PlayerEntity var1, class_2522 var2, class_9379 var3, BlockPos var4, boolean var5, ItemStack var6) {
      if (var1.method_3184()) {
         class_6414 var9 = var2.method_8360();
         class_8021 var10 = var9.method_29306();
         Collection var11 = var10.method_36444();
         String var12 = class_8669.field_44462.method_39797(var9).toString();
         if (!var11.isEmpty()) {
            CompoundNBT var13 = var6.method_27978("DebugProperty");
            String var14 = var13.method_25965(var12);
            class_5019 var15 = var10.method_36440(var14);
            if (!var5) {
               var15 = method_11760(var11, var15, var1.method_3236());
               String var16 = var15.method_23109();
               var13.method_25941(var12, var16);
               method_11757(var1, new TranslationTextComponent(this.method_11216() + ".select", var16, method_11759(var2, var15)));
            } else {
               if (var15 == null) {
                  var15 = (class_5019)var11.iterator().next();
               }

               class_2522 var18 = method_11758(var2, var15, var1.method_3236());
               var3.method_7513(var4, var18, 18);
               method_11757(var1, new TranslationTextComponent(this.method_11216() + ".update", var15.method_23109(), method_11759(var18, var15)));
            }
         } else {
            method_11757(var1, new TranslationTextComponent(this.method_11216() + ".empty", var12));
         }
      }
   }

   private static <T extends Comparable<T>> class_2522 method_11758(class_2522 var0, class_5019<T> var1, boolean var2) {
      return var0.method_10308(var1, method_11760(var1.method_23105(), var0.<Comparable>method_10313(var1), var2));
   }

   private static <T> T method_11760(Iterable<T> var0, T var1, boolean var2) {
      return !var2 ? Util.<T>method_44694(var0, (T)var1) : Util.<T>method_44656(var0, (T)var1);
   }

   private static void method_11757(PlayerEntity var0, ITextComponent var1) {
      ((class_9359)var0).method_43265(var1, ChatType.GAME_INFO, Util.NIL_UUID);
   }

   private static <T extends Comparable<T>> String method_11759(class_2522 var0, class_5019<T> var1) {
      return var1.method_23110(var0.<T>method_10313(var1));
   }
}
