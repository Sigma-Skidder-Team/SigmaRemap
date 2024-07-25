package remapped;

import com.mojang.datafixers.util.Either;

public class class_4056 implements class_1361 {
   public class_4056(class_916 var1, int var2, int var3, int var4, int var5, Either var6) {
      this.field_19761 = var1;
      this.field_19760 = var2;
      this.field_19757 = var3;
      this.field_19762 = var4;
      this.field_19759 = var5;
      this.field_19763 = var6;
   }

   @Override
   public String toString() {
      return "Unloaded "
         + new class_2034(this.field_19760 + this.field_19757 % (this.field_19762 * 2 + 1), this.field_19759 + this.field_19757 / (this.field_19762 * 2 + 1))
         + " "
         + ((class_1361)this.field_19763.right().get()).toString();
   }
}
