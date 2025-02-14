package mapped;

import java.io.IOException;
import java.util.List;

public final class Class4865 extends Class4864 {
   public static final Class7450 field22669 = Class7450.method24082("multipart/mixed");
   public static final Class7450 field22670 = Class7450.method24082("multipart/alternative");
   public static final Class7450 field22671 = Class7450.method24082("multipart/digest");
   public static final Class7450 field22672 = Class7450.method24082("multipart/parallel");
   public static final Class7450 field22673 = Class7450.method24082("multipart/form-data");
   private static final byte[] field22674 = new byte[]{58, 32};
   private static final byte[] field22675 = new byte[]{13, 10};
   private static final byte[] field22676 = new byte[]{45, 45};
   private final Class2003 field22677;
   private final Class7450 field22678;
   private final Class7450 field22679;
   private final List<Class8126> field22680;
   private long field22681 = -1L;

   public Class4865(Class2003 var1, Class7450 var2, List<Class8126> var3) {
      this.field22677 = var1;
      this.field22678 = var2;
      this.field22679 = Class7450.method24082(var2 + "; boundary=" + var1.method8435());
      this.field22680 = Class9474.<Class8126>method36540(var3);
   }

   public Class7450 method15015() {
      return this.field22678;
   }

   public String method15016() {
      return this.field22677.method8435();
   }

   public int method15017() {
      return this.field22680.size();
   }

   public List<Class8126> method15018() {
      return this.field22680;
   }

   public Class8126 method15019(int var1) {
      return this.field22680.get(var1);
   }

   @Override
   public Class7450 method15007() {
      return this.field22679;
   }

   @Override
   public long method15008() throws IOException {
      long var3 = this.field22681;
      return var3 == -1L ? (this.field22681 = this.method15020(null, true)) : var3;
   }

   @Override
   public void method15009(Class1733 var1) throws IOException {
      this.method15020(var1, false);
   }

   private long method15020(Class1733 var1, boolean var2) throws IOException {
      long var5 = 0L;
      Class1734 var7 = null;
      if (var2) {
         var1 = var7 = new Class1734();
      }

      int var8 = 0;

      for (int var9 = this.field22680.size(); var8 < var9; var8++) {
         Class8126 var10 = this.field22680.get(var8);
         Class9371 var11 = var10.field34949;
         Class4864 var12 = var10.field34950;
         ((Class1733)var1).method7561(field22676);
         ((Class1733)var1).method7560(this.field22677);
         ((Class1733)var1).method7561(field22675);
         if (var11 != null) {
            int var13 = 0;

            for (int var16 = var11.method35546(); var13 < var16; var13++) {
               ((Class1733)var1).method7565(var11.method35547(var13)).method7561(field22674).method7565(var11.method35548(var13)).method7561(field22675);
            }
         }

         Class7450 var17 = var12.method15007();
         if (var17 != null) {
            ((Class1733)var1).method7565("Content-Type: ").method7565(var17.toString()).method7561(field22675);
         }

         long var14 = var12.method15008();
         if (var14 == -1L) {
            if (var2) {
               var7.method7626();
               return -1L;
            }
         } else {
            ((Class1733)var1).method7565("Content-Length: ").method7577(var14).method7561(field22675);
         }

         ((Class1733)var1).method7561(field22675);
         if (!var2) {
            var12.method15009((Class1733)var1);
         } else {
            var5 += var14;
         }

         ((Class1733)var1).method7561(field22675);
      }

      ((Class1733)var1).method7561(field22676);
      ((Class1733)var1).method7560(this.field22677);
      ((Class1733)var1).method7561(field22676);
      ((Class1733)var1).method7561(field22675);
      if (var2) {
         var5 += var7.method7582();
         var7.method7626();
      }

      return var5;
   }

   public static StringBuilder method15021(StringBuilder var0, String var1) {
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
