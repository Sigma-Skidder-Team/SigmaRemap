package mapped;

import java.util.ArrayList;

public class Class9808 {
   private static String[] field45838;
   public Class4536[] field45839;
   public ArrayList field45840;
   public final Class9365 field45841;

   public Class9808(Class9365 var1, Class9365 var2, int var3) {
      this.field45841 = var1;
      this.field45839 = new Class4536[var3];
      this.field45840 = new ArrayList();

      for (int var6 = 0; var6 < this.field45839.length; var6++) {
         this.field45839[var6] = var1.method35473(var2);
      }

      this.method38684(var2);
   }

   public void method38684(Class9365 var1) {
      this.field45840.clear();

      for (int var4 = 0; var4 < this.field45839.length; var4++) {
         this.field45840.add(this.field45839[var4]);
      }
   }
}
