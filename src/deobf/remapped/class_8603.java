package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8603 implements class_2274 {
   private static final ITextComponent field_44057 = new TranslationTextComponent(
      "tutorial.move.title",
      class_8827.method_40532("forward"),
      class_8827.method_40532("left"),
      class_8827.method_40532("back"),
      class_8827.method_40532("right")
   );
   private static final ITextComponent field_44060 = new TranslationTextComponent("tutorial.move.description", class_8827.method_40532("jump"));
   private static final ITextComponent field_44061 = new TranslationTextComponent("tutorial.look.title");
   private static final ITextComponent field_44050 = new TranslationTextComponent("tutorial.look.description");
   private final class_8827 field_44059;
   private class_2297 field_44058;
   private class_2297 field_44051;
   private int field_44052;
   private int field_44056;
   private int field_44048;
   private boolean field_44053;
   private boolean field_44054;
   private int field_44049 = -1;
   private int field_44062 = -1;

   public class_8603(class_8827 var1) {
      this.field_44059 = var1;
   }

   public void 錌圭훔곻瀧쿨() {
      this.field_44052++;
      if (this.field_44053) {
         this.field_44056++;
         this.field_44053 = false;
      }

      if (this.field_44054) {
         this.field_44048++;
         this.field_44054 = false;
      }

      if (this.field_44049 == -1 && this.field_44056 > 40) {
         if (this.field_44058 != null) {
            this.field_44058.method_10566();
            this.field_44058 = null;
         }

         this.field_44049 = this.field_44052;
      }

      if (this.field_44062 == -1 && this.field_44048 > 40) {
         if (this.field_44051 != null) {
            this.field_44051.method_10566();
            this.field_44051 = null;
         }

         this.field_44062 = this.field_44052;
      }

      if (this.field_44049 != -1 && this.field_44062 != -1) {
         if (this.field_44059.method_40539() != GameType.SURVIVAL) {
            this.field_44059.method_40538(class_6240.field_31929);
         } else {
            this.field_44059.method_40538(class_6240.field_31930);
         }
      }

      if (this.field_44058 != null) {
         this.field_44058.method_10565((float)this.field_44056 / 40.0F);
      }

      if (this.field_44051 != null) {
         this.field_44051.method_10565((float)this.field_44048 / 40.0F);
      }

      if (this.field_44052 >= 100) {
         if (this.field_44049 == -1 && this.field_44058 == null) {
            this.field_44058 = new class_2297(class_7856.field_39816, field_44057, field_44060, true);
            this.field_44059.method_40530().method_8519().method_42329(this.field_44058);
         } else if (this.field_44049 != -1 && this.field_44052 - this.field_44049 >= 20 && this.field_44062 == -1 && this.field_44051 == null) {
            this.field_44051 = new class_2297(class_7856.field_39814, field_44061, field_44050, true);
            this.field_44059.method_40530().method_8519().method_42329(this.field_44051);
         }
      }
   }

   public void 湗鏟퉧Ⱋ놣驋() {
      if (this.field_44058 != null) {
         this.field_44058.method_10566();
         this.field_44058 = null;
      }

      if (this.field_44051 != null) {
         this.field_44051.method_10566();
         this.field_44051 = null;
      }
   }

   public void 竬葫霥鼒䡸䂷(MovementInput var1) {
      if (var1.field_45288 || var1.field_45290 || var1.field_45283 || var1.field_45286 || var1.field_45284) {
         this.field_44053 = true;
      }
   }

   public void 顸낛鶊室陂ၝ(double var1, double var3) {
      if (Math.abs(var1) > 0.01 || Math.abs(var3) > 0.01) {
         this.field_44054 = true;
      }
   }
}
