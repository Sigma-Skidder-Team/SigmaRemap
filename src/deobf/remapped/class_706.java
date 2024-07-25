package remapped;

import java.util.ArrayList;

public class class_706 {
   private static String[] field_3883;
   private final int field_3881;
   private final class_9129[] field_3882;

   private class_706(class_8025 var1, int var2) {
      this.field_3884 = var1;
      this.field_3881 = var2;
      int var5 = class_8025.method_36456(var1).method_40382()[var2];
      ArrayList var6 = new ArrayList();

      for (int var7 = 0; var7 < 9; var7++) {
         if ((var5 >> 8 - var7 & 1) == 1) {
            var6.add(class_9129.values()[var7]);
         }
      }

      this.field_3882 = var6.<class_9129>toArray(new class_9129[var6.size()]);
   }

   public int method_3260() {
      return class_8025.method_36456(this.field_3884).method_40377()[this.field_3881];
   }

   public int method_3258() {
      return class_8025.method_36456(this.field_3884).method_40375()[this.field_3881];
   }

   public int method_3263() {
      return class_8025.method_36456(this.field_3884).method_40380()[this.field_3881];
   }

   public int method_3261() {
      return class_8025.method_36456(this.field_3884).method_40376()[this.field_3881];
   }

   public boolean method_3259() {
      return class_8025.method_36456(this.field_3884).method_40378()[this.field_3881];
   }

   public class_9129[] method_3262() {
      return this.field_3882;
   }
}
