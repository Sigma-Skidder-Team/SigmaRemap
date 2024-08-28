package mapped;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class Class7931 implements Class7932 {
   private static final Class2003 field33990 = Class2003.method8433("connection");
   private static final Class2003 field33991 = Class2003.method8433("host");
   private static final Class2003 field33992 = Class2003.method8433("keep-alive");
   private static final Class2003 field33993 = Class2003.method8433("proxy-connection");
   private static final Class2003 field33994 = Class2003.method8433("transfer-encoding");
   private static final Class2003 field33995 = Class2003.method8433("te");
   private static final Class2003 field33996 = Class2003.method8433("encoding");
   private static final Class2003 field33997 = Class2003.method8433("upgrade");
   private static final List<Class2003> field33998 = Class9474.<Class2003>method36541(
      field33990,
      field33991,
      field33992,
      field33993,
      field33995,
      field33994,
      field33996,
      field33997,
      Class8350.field35882,
      Class8350.field35883,
      Class8350.field35884,
      Class8350.field35885
   );
   private static final List<Class2003> field33999 = Class9474.<Class2003>method36541(
      field33990, field33991, field33992, field33993, field33995, field33994, field33996, field33997
   );
   private final Class2391 field34000;
   public final Class5751 field34001;
   private final Class1767 field34002;
   private Class9698 field34003;

   public Class7931(Class2391 var1, Class5751 var2, Class1767 var3) {
      this.field34000 = var1;
      this.field34001 = var2;
      this.field34002 = var3;
   }

   @Override
   public Class1716 method26665(Class8223 var1, long var2) {
      return this.field34003.method37987();
   }

   @Override
   public void method26666(Class8223 var1) throws IOException {
      if (this.field34003 == null) {
         boolean var4 = var1.method28617() != null;
         List var5 = method26670(var1);
         this.field34003 = this.field34002.method7711(var5, var4);
         this.field34003.method37984().method15209((long)this.field34000.method9803(), TimeUnit.MILLISECONDS);
         this.field34003.method37985().method15209((long)this.field34000.method9804(), TimeUnit.MILLISECONDS);
      }
   }

   @Override
   public void method26667() throws IOException {
      this.field34002.method7723();
   }

   @Override
   public void method26668() throws IOException {
      this.field34003.method37987().close();
   }

   @Override
   public Class9279 method26669(boolean var1) throws IOException {
      List var4 = this.field34003.method37981();
      Class9279 var5 = method26671(var4);
      return var1 && Class6605.field29047.method20023(var5) == 100 ? null : var5;
   }

   public static List<Class8350> method26670(Class8223 var0) {
      Class9371 var3 = var0.method28614();
      ArrayList var4 = new ArrayList(var3.method35546() + 4);
      var4.add(new Class8350(Class8350.field35882, var0.method28613()));
      var4.add(new Class8350(Class8350.field35883, Class8797.method31761(var0.method28612())));
      String var5 = var0.method28615("Host");
      if (var5 != null) {
         var4.add(new Class8350(Class8350.field35885, var5));
      }

      var4.add(new Class8350(Class8350.field35884, var0.method28612().method22936()));
      int var6 = 0;

      for (int var7 = var3.method35546(); var6 < var7; var6++) {
         Class2003 var8 = Class2003.method8433(var3.method35547(var6).toLowerCase(Locale.US));
         if (!field33998.contains(var8)) {
            var4.add(new Class8350(var8, var3.method35548(var6)));
         }
      }

      return var4;
   }

   public static Class9279 method26671(List<Class8350> var0) throws IOException {
      Class9776 var3 = null;
      Class9192 var4 = new Class9192();
      int var5 = 0;

      for (int var6 = var0.size(); var5 < var6; var5++) {
         Class8350 var7 = (Class8350)var0.get(var5);
         if (var7 != null) {
            Class2003 var8 = var7.field35886;
            String var9 = var7.field35887.method8435();
            if (!var8.equals(Class8350.field35881)) {
               if (!field33999.contains(var8)) {
                  Class6605.field29047.method20015(var4, var8.method8435(), var9);
               }
            } else {
               var3 = Class9776.method38545("HTTP/1.1 " + var9);
            }
         } else if (var3 != null && var3.field45731 == 100) {
            var3 = null;
            var4 = new Class9192();
         }
      }

      if (var3 != null) {
         return new Class9279().method34978(Class2201.field14388).method34979(var3.field45731).method34980(var3.field45732).method34985(var4.method34442());
      } else {
         throw new ProtocolException("Expected ':status' header not present");
      }
   }

   @Override
   public Class1793 method26672(Class1797 var1) throws IOException {
      Class1743 var4 = new Class1743(this, this.field34003.method37986());
      return new Class1796(var1.method7853(), Class7001.method21696(var4));
   }

   @Override
   public void method26673() {
      if (this.field34003 != null) {
         this.field34003.method37989(Class2077.field13532);
      }
   }
}
