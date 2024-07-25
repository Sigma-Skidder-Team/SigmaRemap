package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1700 implements class_2274 {
   private static final ITextComponent field_8790 = new TranslationTextComponent("tutorial.craft_planks.title");
   private static final ITextComponent field_8786 = new TranslationTextComponent("tutorial.craft_planks.description");
   private final class_8827 field_8787;
   private class_2297 field_8789;
   private int field_8791;

   public class_1700(class_8827 var1) {
      this.field_8787 = var1;
   }

   public void 錌圭훔곻瀧쿨() {
      this.field_8791++;
      if (this.field_8787.method_40539() == GameType.SURVIVAL) {
         if (this.field_8791 == 1) {
            class_5989 var3 = this.field_8787.method_40530().thePlayer;
            if (var3 != null) {
               if (var3.inventory.method_32418(class_391.field_1605)) {
                  this.field_8787.method_40538(class_6240.field_31929);
                  return;
               }

               if (method_7631(var3, class_391.field_1605)) {
                  this.field_8787.method_40538(class_6240.field_31929);
                  return;
               }
            }
         }

         if (this.field_8791 >= 1200 && this.field_8789 == null) {
            this.field_8789 = new class_2297(class_7856.field_39813, field_8790, field_8786, false);
            this.field_8787.method_40530().method_8519().method_42329(this.field_8789);
         }
      } else {
         this.field_8787.method_40538(class_6240.field_31929);
      }
   }

   public void 湗鏟퉧Ⱋ놣驋() {
      if (this.field_8789 != null) {
         this.field_8789.method_10566();
         this.field_8789 = null;
      }
   }

   public void 샱瀳筕筕渺䎰(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      if (class_391.field_1605.method_10609(var4)) {
         this.field_8787.method_40538(class_6240.field_31929);
      }
   }

   public static boolean method_7631(class_5989 var0, class_2307<class_2451> var1) {
      for (class_2451 var5 : var1.method_10608()) {
         if (var0.method_27331().method_19276(class_6234.field_31839.method_43790(var5)) > 0) {
            return true;
         }
      }

      return false;
   }
}
