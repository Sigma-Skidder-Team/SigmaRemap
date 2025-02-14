package mapped;

import java.util.ArrayList;
import java.util.Map;

public class Class8594 {
   private static String[] field38674;
   private Class8943[] field38675;
   private Class1882[] field38676;

   public Class8594(Class8943[] var1, Map<String, Class1878> var2) {
      this.field38675 = var1;
      ArrayList<Class1882> var5 = new ArrayList();

      for (String var7 : var2.keySet()) {
         Class1878 var8 = (Class1878)var2.get(var7);
         if (var8 instanceof Class1882) {
            Class1882 var9 = (Class1882)var8;
            var5.add(var9);
         }
      }

      this.field38676 = var5.toArray(new Class1882[var5.size()]);
   }

   public void method30739(int var1) {
      for (int var4 = 0; var4 < this.field38675.length; var4++) {
         Class8943 var5 = this.field38675[var4];
         var5.method32674(var1);
      }
   }

   public void method30740() {
      this.method30741();

      for (int var3 = 0; var3 < this.field38675.length; var3++) {
         Class8943 var4 = this.field38675[var3];
         var4.method32675();
      }
   }

   private void method30741() {
      for (int var3 = 0; var3 < this.field38676.length; var3++) {
         Class1882 var4 = this.field38676[var3];
         var4.method8141();
      }
   }

   public void method30742() {
      for (int var3 = 0; var3 < this.field38675.length; var3++) {
         Class8943 var4 = this.field38675[var3];
         var4.method32676();
      }
   }
}
