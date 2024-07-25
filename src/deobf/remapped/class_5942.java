package remapped;

import java.io.IOException;
import java.util.List;

public final class class_5942 extends class_9001 {
   public static final class_1972 field_30316 = class_1972.method_9069("multipart/mixed");
   public static final class_1972 field_30315 = class_1972.method_9069("multipart/alternative");
   public static final class_1972 field_30312 = class_1972.method_9069("multipart/digest");
   public static final class_1972 field_30317 = class_1972.method_9069("multipart/parallel");
   public static final class_1972 field_30308 = class_1972.method_9069("multipart/form-data");
   private static final byte[] field_30304 = new byte[]{58, 32};
   private static final byte[] field_30310 = new byte[]{13, 10};
   private static final byte[] field_30309 = new byte[]{45, 45};
   private final class_9091 field_30314;
   private final class_1972 field_30307;
   private final class_1972 field_30313;
   private final List<class_3677> field_30306;
   private long field_30305 = -1L;

   public class_5942(class_9091 var1, class_1972 var2, List<class_3677> var3) {
      this.field_30314 = var1;
      this.field_30307 = var2;
      this.field_30313 = class_1972.method_9069(var2 + "; boundary=" + var1.method_41869());
      this.field_30306 = class_8515.<class_3677>method_39210(var3);
   }

   public class_1972 method_27177() {
      return this.field_30307;
   }

   public String method_27178() {
      return this.field_30314.method_41869();
   }

   public int method_27179() {
      return this.field_30306.size();
   }

   public List<class_3677> method_27175() {
      return this.field_30306;
   }

   public class_3677 method_27174(int var1) {
      return this.field_30306.get(var1);
   }

   @Override
   public class_1972 method_41290() {
      return this.field_30313;
   }

   @Override
   public long method_41288() throws IOException {
      long var3 = this.field_30305;
      return var3 == -1L ? (this.field_30305 = this.method_27173(null, true)) : var3;
   }

   @Override
   public void method_41289(class_3947 var1) throws IOException {
      this.method_27173(var1, false);
   }

   private long method_27173(class_3947 var1, boolean var2) throws IOException {
      long var5 = 0L;
      class_7059 var7 = null;
      if (var2) {
         var1 = var7 = new class_7059();
      }

      int var8 = 0;

      for (int var9 = this.field_30306.size(); var8 < var9; var8++) {
         class_3677 var10 = this.field_30306.get(var8);
         class_8121 var11 = var10.field_17932;
         class_9001 var12 = var10.field_17934;
         ((class_3947)var1).method_18248(field_30309);
         ((class_3947)var1).method_18247(this.field_30314);
         ((class_3947)var1).method_18248(field_30310);
         if (var11 != null) {
            int var13 = 0;

            for (int var16 = var11.method_36948(); var13 < var16; var13++) {
               ((class_3947)var1).method_18250(var11.method_36954(var13))
                  .method_18248(field_30304)
                  .method_18250(var11.method_36953(var13))
                  .method_18248(field_30310);
            }
         }

         class_1972 var17 = var12.method_41290();
         if (var17 != null) {
            ((class_3947)var1).method_18250("Content-Type: ").method_18250(var17.toString()).method_18248(field_30310);
         }

         long var14 = var12.method_41288();
         if (var14 == -1L) {
            if (var2) {
               var7.method_32455();
               return -1L;
            }
         } else {
            ((class_3947)var1).method_18250("Content-Length: ").method_18238(var14).method_18248(field_30310);
         }

         ((class_3947)var1).method_18248(field_30310);
         if (!var2) {
            var12.method_41289((class_3947)var1);
         } else {
            var5 += var14;
         }

         ((class_3947)var1).method_18248(field_30310);
      }

      ((class_3947)var1).method_18248(field_30309);
      ((class_3947)var1).method_18247(this.field_30314);
      ((class_3947)var1).method_18248(field_30309);
      ((class_3947)var1).method_18248(field_30310);
      if (var2) {
         var5 += var7.method_32468();
         var7.method_32455();
      }

      return var5;
   }

   public static StringBuilder method_27176(StringBuilder var0, String var1) {
      var0.append('"');
      int var4 = 0;

      for (int var5 = var1.length(); var4 < var5; var4++) {
         char var6 = var1.charAt(var4);
         switch (var6) {
            case '\n':
               var0.append("%0A");
               break;
            case '\r':
               var0.append("%0D");
               break;
            case '"':
               var0.append("%22");
               break;
            default:
               var0.append(var6);
         }
      }

      var0.append('"');
      return var0;
   }
}
