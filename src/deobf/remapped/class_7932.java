package remapped;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7932 extends class_3757 implements class_9875, class_3745 {
   public int field_40571;
   public float field_40575;
   public float field_40574;
   public float field_40565;
   public float field_40568;
   public float field_40572;
   public float field_40573;
   public float field_40570;
   public float field_40567;
   public float field_40564;
   private static final Random field_40566 = new Random();
   private ITextComponent field_40576;

   public class_7932() {
      super(class_133.field_384);
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      if (this.method_45507()) {
         var1.method_25941("CustomName", ITextComponent$class_40.toJson(this.field_40576));
      }

      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      if (var2.method_25939("CustomName", 8)) {
         this.field_40576 = ITextComponent$class_40.func_240643_a_(var2.method_25965("CustomName"));
      }
   }

   @Override
   public void method_17353() {
      this.field_40573 = this.field_40572;
      this.field_40567 = this.field_40570;
      class_704 var3 = this.field_18364
         .method_25857(
            (double)this.field_18358.method_12173() + 0.5,
            (double)this.field_18358.method_12165() + 0.5,
            (double)this.field_18358.method_12185() + 0.5,
            3.0,
            false
         );
      if (var3 == null) {
         this.field_40564 += 0.02F;
         this.field_40572 -= 0.1F;
      } else {
         double var4 = var3.method_37302() - ((double)this.field_18358.method_12173() + 0.5);
         double var6 = var3.method_37156() - ((double)this.field_18358.method_12185() + 0.5);
         this.field_40564 = (float)class_9299.method_42821(var6, var4);
         this.field_40572 += 0.1F;
         if (this.field_40572 < 0.5F || field_40566.nextInt(40) == 0) {
            float var8 = this.field_40565;

            while (true) {
               this.field_40565 = this.field_40565 + (float)(field_40566.nextInt(4) - field_40566.nextInt(4));
               if (var8 == this.field_40565) {
                  continue;
               }
            }
         }
      }

      while (this.field_40570 >= (float) Math.PI) {
         this.field_40570 -= (float) (Math.PI * 2);
      }

      while (this.field_40570 < (float) -Math.PI) {
         this.field_40570 += (float) (Math.PI * 2);
      }

      while (this.field_40564 >= (float) Math.PI) {
         this.field_40564 -= (float) (Math.PI * 2);
      }

      while (this.field_40564 < (float) -Math.PI) {
         this.field_40564 += (float) (Math.PI * 2);
      }

      float var9 = this.field_40564 - this.field_40570;

      while (var9 >= (float) Math.PI) {
         var9 -= (float) (Math.PI * 2);
      }

      while (var9 < (float) -Math.PI) {
         var9 += (float) (Math.PI * 2);
      }

      this.field_40570 += var9 * 0.4F;
      this.field_40572 = class_9299.method_42828(this.field_40572, 0.0F, 1.0F);
      this.field_40571++;
      this.field_40574 = this.field_40575;
      float var10 = (this.field_40565 - this.field_40575) * 0.4F;
      float var11 = 0.2F;
      var10 = class_9299.method_42828(var10, -0.2F, 0.2F);
      this.field_40568 = this.field_40568 + (var10 - this.field_40568) * 0.9F;
      this.field_40575 = this.field_40575 + this.field_40568;
   }

   @Override
   public ITextComponent method_45509() {
      return (ITextComponent)(this.field_40576 == null ? new TranslationTextComponent("container.enchant") : this.field_40576);
   }

   public void method_35860(ITextComponent var1) {
      this.field_40576 = var1;
   }

   @Nullable
   @Override
   public ITextComponent method_45508() {
      return this.field_40576;
   }
}
