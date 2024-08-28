package mapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class9205 {
   public final Class6981 field42385;
   private final Class7358 field42386;
   private final Map<String, Class7255> field42387;
   private final Set<Class7255> field42388;

   public Class9205(Class6981 var1, Class7358 var2) {
      this.field42385 = var1;
      this.field42386 = var2;
      this.field42387 = new HashMap<String, Class7255>();
      this.field42388 = new HashSet<Class7255>();
   }

   public boolean method34495() {
      if (this.field42385.method21551(Class78.field180)) {
         this.field42385.method21553();
      }

      return !this.field42385.method21551(Class78.field179);
   }

   public Class7255 method34496() {
      this.field42385.method21553();
      Class7255 var3 = this.method34498(null);
      this.field42385.method21553();
      this.field42387.clear();
      this.field42388.clear();
      return var3;
   }

   public Class7255 method34497() {
      this.field42385.method21553();
      Class7255 var3 = null;
      if (!this.field42385.method21551(Class78.field179)) {
         var3 = this.method34496();
      }

      if (this.field42385.method21551(Class78.field179)) {
         this.field42385.method21553();
         return var3;
      } else {
         Class5931 var4 = this.field42385.method21553();
         throw new Class2484("expected a single document in the stream", var3.method22782(), "but found another document", var4.method18438());
      }
   }

   private Class7255 method34498(Class7255 var1) {
      if (var1 != null) {
         this.field42388.add(var1);
      }

      Class7255 var6;
      if (!this.field42385.method21551(Class78.field171)) {
         Class5928 var4 = (Class5928)this.field42385.method21552();
         String var5 = var4.method18432();
         if (!this.field42385.method21551(Class78.field176)) {
            if (!this.field42385.method21551(Class78.field178)) {
               var6 = this.method34501(var5);
            } else {
               var6 = this.method34500(var5);
            }
         } else {
            var6 = this.method34499(var5);
         }
      } else {
         Class5929 var7 = (Class5929)this.field42385.method21553();
         String var8 = var7.method18432();
         if (!this.field42387.containsKey(var8)) {
            throw new Class2484(null, null, "found undefined alias " + var8, var7.method18438());
         }

         var6 = this.field42387.get(var8);
         if (this.field42388.remove(var6)) {
            var6.method22786(true);
         }
      }

      this.field42388.remove(var1);
      return var6;
   }

   public Class7255 method34499(String var1) {
      Class5930 var4 = (Class5930)this.field42385.method21553();
      String var5 = var4.method18433();
      boolean var6 = false;
      Class9757 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new Class9757(var5);
      } else {
         var7 = this.field42386.method23355(Class2048.field13364, var4.method18435(), var4.method18436().method26091());
         var6 = true;
      }

      Class7256 var8 = new Class7256(var7, var6, var4.method18435(), var4.method18438(), var4.method18439(), var4.method18434());
      if (var1 != null) {
         this.field42387.put(var1, var8);
      }

      return var8;
   }

   public Class7255 method34500(String var1) {
      Class5927 var4 = (Class5927)this.field42385.method21553();
      String var5 = var4.method18426();
      boolean var6 = false;
      Class9757 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new Class9757(var5);
      } else {
         var7 = this.field42386.method23355(Class2048.field13365, null, var4.method18427());
         var6 = true;
      }

      ArrayList var8 = new ArrayList();
      Class7252 var9 = new Class7252(var7, var6, var8, var4.method18438(), null, var4.method18428());
      if (var1 != null) {
         this.field42387.put(var1, var9);
      }

      while (!this.field42385.method21551(Class78.field177)) {
         var8.add(this.method34498(var9));
      }

      Class5931 var10 = this.field42385.method21553();
      var9.method22774(var10.method18439());
      return var9;
   }

   public Class7255 method34501(String var1) {
      Class5939 var4 = (Class5939)this.field42385.method21553();
      String var5 = var4.method18426();
      boolean var6 = false;
      Class9757 var7;
      if (var5 != null && !var5.equals("!")) {
         var7 = new Class9757(var5);
      } else {
         var7 = this.field42386.method23355(Class2048.field13366, null, var4.method18427());
         var6 = true;
      }

      ArrayList var8 = new ArrayList();
      Class7254 var9 = new Class7254(var7, var6, var8, var4.method18438(), null, var4.method18428());
      if (var1 != null) {
         this.field42387.put(var1, var9);
      }

      while (!this.field42385.method21551(Class78.field174)) {
         this.method34502(var8, var9);
      }

      Class5931 var10 = this.field42385.method21553();
      var9.method22774(var10.method18439());
      return var9;
   }

   public void method34502(List<Class9460> var1, Class7254 var2) {
      Class7255 var5 = this.method34503(var2);
      if (var5.method22780().equals(Class9757.field45632)) {
         var2.method22778(true);
      }

      Class7255 var6 = this.method34504(var2);
      var1.add(new Class9460(var5, var6));
   }

   public Class7255 method34503(Class7254 var1) {
      return this.method34498(var1);
   }

   public Class7255 method34504(Class7254 var1) {
      return this.method34498(var1);
   }
}
