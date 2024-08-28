package mapped;

import java.io.IOException;
import java.util.List;

public final class Class4867 extends Class4864 {
   private static final Class7450 field22685 = Class7450.method24082("application/x-www-form-urlencoded");
   private final List<String> field22686;
   private final List<String> field22687;

   public Class4867(List<String> var1, List<String> var2) {
      this.field22686 = Class9474.<String>method36540(var1);
      this.field22687 = Class9474.<String>method36540(var2);
   }

   public int method15022() {
      return this.field22686.size();
   }

   public String method15023(int var1) {
      return this.field22686.get(var1);
   }

   public String method15024(int var1) {
      return Class7284.method22971(this.method15023(var1), true);
   }

   public String method15025(int var1) {
      return this.field22687.get(var1);
   }

   public String method15026(int var1) {
      return Class7284.method22971(this.method15025(var1), true);
   }

   @Override
   public Class7450 method15007() {
      return field22685;
   }

   @Override
   public long method15008() {
      return this.method15027(null, true);
   }

   @Override
   public void method15009(Class1733 var1) throws IOException {
      this.method15027(var1, false);
   }

   private long method15027(Class1733 var1, boolean var2) {
      long var5 = 0L;
      Class1734 var7;
      if (!var2) {
         var7 = var1.method7559();
      } else {
         var7 = new Class1734();
      }

      int var8 = 0;

      for (int var9 = this.field22686.size(); var8 < var9; var8++) {
         if (var8 > 0) {
            var7.method7570(38);
         }

         var7.method7566(this.field22686.get(var8));
         var7.method7570(61);
         var7.method7566(this.field22687.get(var8));
      }

      if (var2) {
         var5 = var7.method7582();
         var7.method7626();
      }

      return var5;
   }
}
