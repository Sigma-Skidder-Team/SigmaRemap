package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9270 {
   private List<Class7906> field42642 = new ArrayList<Class7906>();
   private Class7906 field42643 = this.method34908("", Class2140.field14007, true);

   public Class7906 method34907(String var1, Class2140 var2, Class7906 var3) {
      int var6 = this.field42642.size();
      Class7906 var7 = new Class7906(var6, var1, var2, var3);
      this.field42642.add(var7);
      return var7;
   }

   private Class7906 method34908(String var1, Class2140 var2, boolean var3) {
      int var6 = this.field42642.size();
      Class7906 var7 = new Class7906(var6, var1, var2, var3);
      this.field42642.add(var7);
      return var7;
   }

   public Class7906 method34909(String var1, Class7906 var2) {
      return this.method34907(var1, Class2140.field14009, var2);
   }

   public Class7906 method34910(String var1) {
      return this.method34907(var1, Class2140.field14011, this.field42643);
   }

   public Class7906 method34911(String var1) {
      return this.method34907(var1, Class2140.field14010, this.field42643);
   }

   public Class7906 method34912(String var1, Class7906 var2) {
      return this.method34907(var1, Class2140.field14008, var2);
   }

   public Class7906 method34913(String var1) {
      return this.method34908(var1, Class2140.field14007, true);
   }

   public Class7906[] method34914(String var1, int var2) {
      Class7906[] var5 = new Class7906[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 != 0 ? var1 + var6 : var1;
         var5[var6] = this.method34910(var7);
      }

      return var5;
   }

   public Class7906[] method34915(String var1, int var2) {
      Class7906[] var5 = new Class7906[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         String var7 = var6 != 0 ? var1 + var6 : var1;
         var5[var6] = this.method34911(var7);
      }

      return var5;
   }

   public Class7906 method34916() {
      return this.field42643;
   }

   public int method34917() {
      return this.field42642.size();
   }

   public Class7906 method34918(String var1) {
      if (var1 == null) {
         return null;
      } else {
         for (int var4 = 0; var4 < this.field42642.size(); var4++) {
            Class7906 var5 = this.field42642.get(var4);
            String var6 = var5.method26482();
            if (var6.equals(var1)) {
               return var5;
            }
         }

         return null;
      }
   }

   public String[] method34919() {
      String[] var3 = new String[this.field42642.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = this.field42642.get(var4).method26482();
      }

      return var3;
   }

   public Class7906[] method34920() {
      return this.field42642.<Class7906>toArray(new Class7906[this.field42642.size()]);
   }

   public Class7906[] method34921(Class7906 var1, Class7906 var2) {
      int var5 = var1.method26481();
      int var6 = var2.method26481();
      if (var5 > var6) {
         int var7 = var5;
         var5 = var6;
         var6 = var7;
      }

      Class7906[] var9 = new Class7906[var6 - var5 + 1];

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = this.field42642.get(var5 + var8);
      }

      return var9;
   }

   @Override
   public String toString() {
      return this.field42642.toString();
   }
}
