package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Class8583 {
   private static String[] field38611;
   private final Class8827 field38612;
   private final Class5078 field38613;
   private final List<Class7354> field38614;
   private final Class9011 field38615;
   private final List<Class6399> field38616;

   public Class8583(Class5066 var1, Class8827 var2) {
      this.field38612 = var2;
      this.field38613 = (Class5078)var1.method15438(1836476516L);
      List var5 = var1.method15440(1953653099L);
      this.field38614 = new ArrayList<Class7354>(var5.size());

      for (int var6 = 0; var6 < var5.size(); var6++) {
         Class7354 var7 = this.method30671((Class5066)var5.get(var6));
         if (var7 != null) {
            this.field38614.add(var7);
         }
      }

      this.field38615 = new Class9011();
      if (!var1.method15437(1835365473L)) {
         if (var1.method15437(1969517665L)) {
            Class5066 var10 = var1.method15438(1969517665L);
            if (var10.method15437(1835365473L)) {
               this.field38615.method33301(var10, var10.method15438(1835365473L));
            }
         }
      } else {
         this.field38615.method33301(null, var1.method15438(1835365473L));
      }

      this.field38616 = new ArrayList<Class6399>();
      if (var1.method15437(1768977007L)) {
         Class5066 var11 = var1.method15438(1768977007L);

         for (Class5066 var9 : var11.method15440(1936289382L)) {
            this.field38616.add(Class6399.method19498(var9));
         }
      }
   }

   private Class7354 method30671(Class5066 var1) {
      Class5007 var4 = (Class5007)var1.method15438(1835297121L).method15438(1751411826L);
      Object var5;
      switch ((int)var4.method15359()) {
         case 1936684398:
            var5 = new Class7356(var1, this.field38612);
            break;
         case 1986618469:
            var5 = new Class7355(var1, this.field38612);
            break;
         default:
            var5 = null;
      }

      return (Class7354)var5;
   }

   public List<Class7354> method30672() {
      return Collections.<Class7354>unmodifiableList(this.field38614);
   }

   public List<Class7354> method30673(Class2169 var1) {
      ArrayList var4 = new ArrayList();

      for (Class7354 var6 : this.field38614) {
         if (var6.method23310().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Class7354>unmodifiableList(var4);
   }

   public List<Class7354> method30674(Class2268 var1) {
      ArrayList var4 = new ArrayList();

      for (Class7354 var6 : this.field38614) {
         if (var6.method23311().equals(var1)) {
            var4.add(var6);
         }
      }

      return Collections.<Class7354>unmodifiableList(var4);
   }

   public boolean method30675() {
      return this.field38615.method33307();
   }

   public Class9011 method30676() {
      return this.field38615;
   }

   public List<Class6399> method30677() {
      return Collections.<Class6399>unmodifiableList(this.field38616);
   }

   public Date method30678() {
      return Class9362.method35458(this.field38613.method15520());
   }

   public Date method30679() {
      return Class9362.method35458(this.field38613.method15521());
   }

   public double method30680() {
      return (double)this.field38613.method15523() / (double)this.field38613.method15522();
   }

   public boolean method30681() {
      for (Class7354 var4 : this.field38614) {
         if (var4.method23323()) {
            return true;
         }
      }

      return false;
   }

   public Class1994 method30682() throws IOException {
      Class7354 var3 = null;

      for (Class7354 var5 : this.field38614) {
         if (var5.method23323() && (var3 == null || var5.method23327() < var3.method23327())) {
            var3 = var5;
         }
      }

      return var3 != null ? var3.method23324() : null;
   }
}
