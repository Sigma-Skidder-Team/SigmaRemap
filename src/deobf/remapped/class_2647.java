package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2647 implements class_2274 {
   private static final ITextComponent field_13034 = new TranslationTextComponent("tutorial.punch_tree.title");
   private static final ITextComponent field_13035 = new TranslationTextComponent("tutorial.punch_tree.description", class_8827.method_40532("attack"));
   private final class_8827 field_13033;
   private class_2297 field_13036;
   private int field_13038;
   private int field_13037;

   public class_2647(class_8827 var1) {
      this.field_13033 = var1;
   }

   public void 錌圭훔곻瀧쿨() {
      this.field_13038++;
      if (this.field_13033.method_40539() == class_4666.field_22764) {
         if (this.field_13038 == 1) {
            class_5989 var3 = this.field_13033.method_40530().field_9632;
            if (var3 != null) {
               if (var3.field_3853.method_32418(class_391.field_1638)) {
                  this.field_13033.method_40538(class_6240.field_31934);
                  return;
               }

               if (class_8174.method_37476(var3)) {
                  this.field_13033.method_40538(class_6240.field_31934);
                  return;
               }
            }
         }

         if ((this.field_13038 >= 600 || this.field_13037 > 3) && this.field_13036 == null) {
            this.field_13036 = new class_2297(class_7856.field_39812, field_13034, field_13035, true);
            this.field_13033.method_40530().method_8519().method_42329(this.field_13036);
         }
      } else {
         this.field_13033.method_40538(class_6240.field_31929);
      }
   }

   public void 湗鏟퉧Ⱋ놣驋() {
      if (this.field_13036 != null) {
         this.field_13036.method_10566();
         this.field_13036 = null;
      }
   }

   public void 樽햖콵侃值ᙽ(class_174 var1, class_1331 var2, class_2522 var3, float var4) {
      boolean var7 = var3.method_8349(class_2351.field_11730);
      if (var7 && var4 > 0.0F) {
         if (this.field_13036 != null) {
            this.field_13036.method_10565(var4);
         }

         if (var4 >= 1.0F) {
            this.field_13033.method_40538(class_6240.field_31933);
         }
      } else if (this.field_13036 == null) {
         if (var7) {
            this.field_13037++;
         }
      } else {
         this.field_13036.method_10565(0.0F);
      }
   }

   public void 샱瀳筕筕渺䎰(class_6098 var1) {
      if (class_391.field_1638.method_10609(var1.method_27960())) {
         this.field_13033.method_40538(class_6240.field_31934);
      }
   }
}
