package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class6510 {
   private static String[] field28494;
   private final int field28495;
   private final Class2123[] field28496;
   public final Class8308 field28497;

   public Class6510(Class8308 var1, int var2) {
      this.field28497 = var1;
      this.field28495 = var2;
      int var5 = Class8308.method29067(var1).method15494()[var2];
      List<Class2123> var6 = new ArrayList();

      for (int var7 = 0; var7 < 9; var7++) {
         if ((var5 >> 8 - var7 & 1) == 1) {
            var6.add(Class2123.values()[var7]);
         }
      }

      this.field28496 = var6.toArray(new Class2123[var6.size()]);
   }

   public int method19708() {
      return Class8308.method29067(this.field28497).method15488()[this.field28495];
   }

   public int method19709() {
      return Class8308.method29067(this.field28497).method15489()[this.field28495];
   }

   public int method19710() {
      return Class8308.method29067(this.field28497).method15490()[this.field28495];
   }

   public int method19711() {
      return Class8308.method29067(this.field28497).method15491()[this.field28495];
   }

   public boolean method19712() {
      return Class8308.method29067(this.field28497).method15492()[this.field28495];
   }

   public Class2123[] method19713() {
      return this.field28496;
   }
}
