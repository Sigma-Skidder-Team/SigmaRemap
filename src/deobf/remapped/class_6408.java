package remapped;

import java.util.Random;

public abstract class class_6408 extends class_8844 implements class_3978 {
   public static final class_7044 field_32703 = class_6023.field_30703;
   private final double field_32704;

   public class_6408(class_3073 var1, class_240 var2, class_4190 var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.field_32704 = var5;
      this.method_29284(this.field_32751.method_36446().method_10308(field_32703, Integer.valueOf(0)));
   }

   @Override
   public class_2522 method_40685(class_9379 var1) {
      return this.method_29260().method_10308(field_32703, Integer.valueOf(var1.method_43360().nextInt(25)));
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_32703) < 25;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var1.<Integer>method_10313(field_32703) < 25 && var4.nextDouble() < this.field_32704) {
         class_1331 var7 = var3.method_6098(this.field_45228);
         if (this.method_29241(var2.method_28262(var7))) {
            var2.method_29594(var7, var1.method_10317(field_32703));
         }
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == this.field_45228.method_1046() && !var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      if (var2 != this.field_45228 || !var3.method_8350(this) && !var3.method_8350(this.method_40683())) {
         if (this.field_45227) {
            var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return this.method_40683().method_29260();
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_32703);
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      return this.method_29241(var1.method_28262(var2.method_6098(this.field_45228)));
   }

   @Override
   public boolean method_18357(class_6486 var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      class_1331 var7 = var3.method_6098(this.field_45228);
      int var8 = Math.min(var4.<Integer>method_10313(field_32703) + 1, 25);
      int var9 = this.method_29242(var2);

      for (int var10 = 0; var10 < var9 && this.method_29241(var1.method_28262(var7)); var10++) {
         var1.method_29594(var7, var4.method_10308(field_32703, Integer.valueOf(var8)));
         var7 = var7.method_6098(this.field_45228);
         var8 = Math.min(var8 + 1, 25);
      }
   }

   public abstract int method_29242(Random var1);

   public abstract boolean method_29241(class_2522 var1);

   @Override
   public class_6408 method_40682() {
      return this;
   }
}
