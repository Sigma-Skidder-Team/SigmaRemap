package remapped;

import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.text.ITextComponent;

public abstract class class_9331<T extends class_4088> extends class_2208<T> {
   public boolean field_47639;

   public class_9331(T var1, class_7051 var2, ITextComponent var3) {
      super((T)var1, var2, var3);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.method_43081();
   }

   public void method_43081() {
      if (!this.field_943.field_9632.method_26503().isEmpty()) {
         this.field_10984 = 160 + (this.field_941 - this.field_10981 - 200) / 2;
         this.field_47639 = true;
      } else {
         this.field_10984 = (this.field_941 - this.field_10981) / 2;
         this.field_47639 = false;
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      super.method_6767(var1, var2, var3, var4);
      if (this.field_47639) {
         this.method_43080(var1);
      }
   }

   private void method_43080(class_7966 var1) {
      int var4 = this.field_10984 - 124;
      Collection var5 = this.field_943.field_9632.method_26503();
      if (!var5.isEmpty()) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         int var6 = 33;
         if (var5.size() > 5) {
            var6 = 132 / (var5.size() - 1);
         }

         List var7 = Ordering.natural().sortedCopy(var5);
         this.method_43078(var1, var4, var6, var7);
         this.method_43079(var1, var4, var6, var7);
         this.method_43082(var1, var4, var6, var7);
      }
   }

   private void method_43078(class_7966 var1, int var2, int var3, Iterable<class_2250> var4) {
      this.field_943.method_8577().method_35674(field_10969);
      int var7 = this.field_10962;

      for (class_2250 var9 : var4) {
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_9781(var1, var2, var7, 0, 166, 140, 32);
         var7 += var3;
      }
   }

   private void method_43079(class_7966 var1, int var2, int var3, Iterable<class_2250> var4) {
      class_3944 var7 = this.field_943.method_8551();
      int var8 = this.field_10962;

      for (class_2250 var10 : var4) {
         class_1425 var11 = var10.method_10339();
         class_5155 var12 = var7.method_18228(var11);
         this.field_943.method_8577().method_35674(var12.method_23608().method_38519());
         method_9782(var1, var2 + 6, var8 + 7, this.method_9777(), 18, 18, var12);
         var8 += var3;
      }
   }

   private void method_43082(class_7966 var1, int var2, int var3, Iterable<class_2250> var4) {
      int var7 = this.field_10962;

      for (class_2250 var9 : var4) {
         String var10 = class_6956.method_31803(var9.method_10339().method_6540());
         if (var9.method_10333() >= 1 && var9.method_10333() <= 9) {
            var10 = var10 + ' ' + class_6956.method_31803("enchantment.level." + (var9.method_10333() + 1));
         }

         this.field_948.method_45390(var1, var10, (float)(var2 + 10 + 18), (float)(var7 + 6), 16777215);
         String var11 = class_1493.method_6889(var9, 1.0F);
         this.field_948.method_45390(var1, var11, (float)(var2 + 10 + 18), (float)(var7 + 6 + 10), 8355711);
         var7 += var3;
      }
   }
}
