package remapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class class_3076 implements class_9328 {
   private static final class_9091 field_15123 = class_9091.method_41889("connection");
   private static final class_9091 field_15132 = class_9091.method_41889("host");
   private static final class_9091 field_15121 = class_9091.method_41889("keep-alive");
   private static final class_9091 field_15126 = class_9091.method_41889("proxy-connection");
   private static final class_9091 field_15131 = class_9091.method_41889("transfer-encoding");
   private static final class_9091 field_15129 = class_9091.method_41889("te");
   private static final class_9091 field_15127 = class_9091.method_41889("encoding");
   private static final class_9091 field_15120 = class_9091.method_41889("upgrade");
   private static final List<class_9091> field_15130 = class_8515.<class_9091>method_39211(
      field_15123,
      field_15132,
      field_15121,
      field_15126,
      field_15129,
      field_15131,
      field_15127,
      field_15120,
      class_4331.field_21060,
      class_4331.field_21061,
      class_4331.field_21069,
      class_4331.field_21068
   );
   private static final List<class_9091> field_15128 = class_8515.<class_9091>method_39211(
      field_15123, field_15132, field_15121, field_15126, field_15129, field_15131, field_15127, field_15120
   );
   private final class_8075 field_15125;
   public final class_327 field_15119;
   private final class_2695 field_15124;
   private class_9388 field_15118;

   public class_3076(class_8075 var1, class_327 var2, class_2695 var3) {
      this.field_15125 = var1;
      this.field_15119 = var2;
      this.field_15124 = var3;
   }

   @Override
   public class_4131 method_43067(class_3918 var1, long var2) {
      return this.field_15118.method_43418();
   }

   @Override
   public void method_43066(class_3918 var1) throws IOException {
      if (this.field_15118 == null) {
         boolean var4 = var1.method_18133() != null;
         List var5 = method_14101(var1);
         this.field_15118 = this.field_15124.method_12113(var5, var4);
         this.field_15118.method_43417().method_1070((long)this.field_15125.method_36671(), TimeUnit.MILLISECONDS);
         this.field_15118.method_43412().method_1070((long)this.field_15125.method_36657(), TimeUnit.MILLISECONDS);
      }
   }

   @Override
   public void method_43069() throws IOException {
      this.field_15124.method_12127();
   }

   @Override
   public void method_43064() throws IOException {
      this.field_15118.method_43418().close();
   }

   @Override
   public class_7775 method_43068(boolean var1) throws IOException {
      List var4 = this.field_15118.method_43407();
      class_7775 var5 = method_14100(var4);
      return var1 && class_1850.field_9389.method_8181(var5) == 100 ? null : var5;
   }

   public static List<class_4331> method_14101(class_3918 var0) {
      class_8121 var3 = var0.method_18138();
      ArrayList var4 = new ArrayList(var3.method_36948() + 4);
      var4.add(new class_4331(class_4331.field_21060, var0.method_18137()));
      var4.add(new class_4331(class_4331.field_21061, class_5947.method_27188(var0.method_18136())));
      String var5 = var0.method_18135("Host");
      if (var5 != null) {
         var4.add(new class_4331(class_4331.field_21068, var5));
      }

      var4.add(new class_4331(class_4331.field_21069, var0.method_18136().method_7488()));
      int var6 = 0;

      for (int var7 = var3.method_36948(); var6 < var7; var6++) {
         class_9091 var8 = class_9091.method_41889(var3.method_36954(var6).toLowerCase(Locale.US));
         if (!field_15130.contains(var8)) {
            var4.add(new class_4331(var8, var3.method_36953(var6)));
         }
      }

      return var4;
   }

   public static class_7775 method_14100(List<class_4331> var0) throws IOException {
      class_9669 var3 = null;
      class_7414 var4 = new class_7414();
      int var5 = 0;

      for (int var6 = var0.size(); var5 < var6; var5++) {
         class_4331 var7 = (class_4331)var0.get(var5);
         if (var7 != null) {
            class_9091 var8 = var7.field_21066;
            String var9 = var7.field_21065.method_41869();
            if (!var8.equals(class_4331.field_21064)) {
               if (!field_15128.contains(var8)) {
                  class_1850.field_9389.method_8187(var4, var8.method_41869(), var9);
               }
            } else {
               var3 = class_9669.method_44716("HTTP/1.1 " + var9);
            }
         } else if (var3 != null && var3.field_49248 == 100) {
            var3 = null;
            var4 = new class_7414();
         }
      }

      if (var3 != null) {
         return new class_7775()
            .method_35269(class_7976.field_40849)
            .method_35267(var3.field_49248)
            .method_35281(var3.field_49252)
            .method_35271(var4.method_33781());
      } else {
         throw new ProtocolException("Expected ':status' header not present");
      }
   }

   @Override
   public class_8856 method_43063(class_7839 var1) throws IOException {
      class_8100 var4 = new class_8100(this, this.field_15118.method_43408());
      return new class_2536(var1.method_35479(), class_1259.method_5671(var4));
   }

   @Override
   public void method_43065() {
      if (this.field_15118 != null) {
         this.field_15118.method_43426(class_1692.field_8762);
      }
   }
}
