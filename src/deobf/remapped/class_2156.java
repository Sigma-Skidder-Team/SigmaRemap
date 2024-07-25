package remapped;

import java.util.Optional;
import java.util.Random;

public abstract class class_2156 extends class_8844 implements class_3978 {
   public class_2156(class_3073 var1, class_240 var2, class_4190 var3, boolean var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == this.field_45228.method_1046() && !var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      class_6408 var9 = this.method_40682();
      if (var2 == this.field_45228) {
         class_6414 var10 = var3.method_8360();
         if (var10 != this && var10 != var9) {
            return var9.method_40685(var4);
         }
      }

      if (this.field_45227) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_6098 method_29276(class_6163 var1, class_1331 var2, class_2522 var3) {
      return new class_6098(this.method_40682());
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      Optional var7 = this.method_10045(var1, var2, var3);
      return var7.isPresent() && this.method_40682().method_29241(var1.method_28262(((class_1331)var7.get()).method_6098(this.field_45228)));
   }

   @Override
   public boolean method_18357(class_6486 var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      Optional var7 = this.method_10045(var1, var3, var4);
      if (var7.isPresent()) {
         class_2522 var8 = var1.method_28262((class_1331)var7.get());
         ((class_6408)var8.method_8360()).method_18359(var1, var2, (class_1331)var7.get(), var8);
      }
   }

   private Optional<class_1331> method_10045(class_6163 var1, class_1331 var2, class_2522 var3) {
      class_1331 var6 = var2;

      class_6414 var7;
      do {
         var6 = var6.method_6098(this.field_45228);
         var7 = var1.method_28262(var6).method_8360();
      } while (var7 == var3.method_8360());

      return var7 != this.method_40682() ? Optional.<class_1331>empty() : Optional.<class_1331>of(var6);
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      boolean var5 = super.method_10781(var1, var2);
      return var5 && var2.method_21867().method_27960() == this.method_40682().method_10803() ? false : var5;
   }

   @Override
   public class_6414 method_40683() {
      return this;
   }
}
