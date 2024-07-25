package remapped;

import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class class_8346 extends class_3757 implements class_6867, class_4259, class_9875 {
   private class_3186 field_42749 = class_3186.field_15912;
   private ITextComponent field_42748;

   public class_8346(class_133<?> var1) {
      super(var1);
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      this.field_42749 = class_3186.method_14664(var2);
      if (var2.method_25939("CustomName", 8)) {
         this.field_42748 = ITextComponent$class_40.func_240643_a_(var2.method_25965("CustomName"));
      }
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      this.field_42749.method_14666(var1);
      if (this.field_42748 != null) {
         var1.method_25941("CustomName", ITextComponent$class_40.toJson(this.field_42748));
      }

      return var1;
   }

   public void method_38432(ITextComponent var1) {
      this.field_42748 = var1;
   }

   @Override
   public ITextComponent method_45509() {
      return this.field_42748 == null ? this.method_38433() : this.field_42748;
   }

   @Override
   public ITextComponent method_19839() {
      return this.method_45509();
   }

   @Nullable
   @Override
   public ITextComponent method_45508() {
      return this.field_42748;
   }

   public abstract ITextComponent method_38433();

   public boolean method_38430(class_704 var1) {
      return method_38434(var1, this.field_42749, this.method_19839());
   }

   public static boolean method_38434(class_704 var0, class_3186 var1, ITextComponent var2) {
      if (!var0.method_37221() && !var1.method_14663(var0.method_26446())) {
         var0.method_3251(new TranslationTextComponent("container.isLocked", var2), true);
         var0.method_3172(class_463.field_2206, class_562.field_3322, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public class_4088 method_11419(int var1, class_7051 var2, class_704 var3) {
      return !this.method_38430(var3) ? null : this.method_38431(var1, var2);
   }

   public abstract class_4088 method_38431(int var1, class_7051 var2);
}
