package remapped;

import java.util.EnumSet;

public class class_7261 extends class_3599 {
   private static String[] field_37200;
   private final class_4612 field_37201;

   public class_7261(class_4612 var1) {
      this.field_37201 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564, class_1891.field_9560));
   }

   @Override
   public boolean method_16795() {
      return this.field_37201.method_37229() < 140;
   }

   @Override
   public boolean method_16799() {
      return this.method_16795();
   }

   @Override
   public boolean method_16801() {
      return false;
   }

   @Override
   public void method_16796() {
      this.method_33184();
   }

   private void method_33184() {
      Iterable var3 = class_1331.method_6075(
         class_9299.method_42847(this.field_37201.method_37302() - 1.0),
         class_9299.method_42847(this.field_37201.method_37309()),
         class_9299.method_42847(this.field_37201.method_37156() - 1.0),
         class_9299.method_42847(this.field_37201.method_37302() + 1.0),
         class_9299.method_42847(this.field_37201.method_37309() + 8.0),
         class_9299.method_42847(this.field_37201.method_37156() + 1.0)
      );
      class_1331 var4 = null;

      for (class_1331 var6 : var3) {
         if (this.method_33185(this.field_37201.field_41768, var6)) {
            var4 = var6;
            break;
         }
      }

      if (var4 == null) {
         var4 = new class_1331(this.field_37201.method_37302(), this.field_37201.method_37309() + 8.0, this.field_37201.method_37156());
      }

      this.field_37201.method_26927().method_5595((double)var4.method_12173(), (double)(var4.method_12165() + 1), (double)var4.method_12185(), 1.0);
   }

   @Override
   public void method_16794() {
      this.method_33184();
      this.field_37201
         .method_37092(0.02F, new class_1343((double)this.field_37201.field_29676, (double)this.field_37201.field_29651, (double)this.field_37201.field_29673));
      this.field_37201.method_37226(class_7412.field_37839, this.field_37201.method_37098());
   }

   private boolean method_33185(class_4924 var1, class_1331 var2) {
      class_2522 var5 = var1.method_28262(var2);
      return (var1.method_28258(var2).method_22001() || var5.method_8350(class_4783.field_23269)) && var5.method_8319(var1, var2, class_2929.field_14271);
   }
}
