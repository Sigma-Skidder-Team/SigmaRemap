package mapped;

public class Class5820 extends Class5812 {
   private static String[] field25497;
   public final Class25<Class8848> field25498 = Class25.<Class8848>method67();

   public Class5820(PlayerEntity var1) {
      super((Class8298<?>)null, 0);
      Class974 var4 = var1.field4902;

      for (int var5 = 0; var5 < 5; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.method18124(new Class5846(Class861.method2660(), var5 * 9 + var6, 9 + var6 * 18, 18 + var5 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.method18124(new Class5839(var4, var7, 9 + var7 * 18, 112));
      }

      this.method18176(0.0F);
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return true;
   }

   public void method18176(float var1) {
      int var4 = (this.field25498.size() + 9 - 1) / 9 - 5;
      int var5 = (int)((double)(var1 * (float)var4) + 0.5);
      if (var5 < 0) {
         var5 = 0;
      }

      for (int var6 = 0; var6 < 5; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            int var8 = var7 + (var6 + var5) * 9;
            if (var8 >= 0 && var8 < this.field25498.size()) {
               Class861.method2660().method3621(var7 + var6 * 9, this.field25498.get(var8));
            } else {
               Class861.method2660().method3621(var7 + var6 * 9, Class8848.field39973);
            }
         }
      }
   }

   public boolean method18177() {
      return this.field25498.size() > 45;
   }

   @Override
   public Class8848 method18112(PlayerEntity var1, int var2) {
      if (var2 >= this.field25468.size() - 9 && var2 < this.field25468.size()) {
         Class5839 var5 = this.field25468.get(var2);
         if (var5 != null && var5.method18266()) {
            var5.method18267(Class8848.field39973);
         }
      }

      return Class8848.field39973;
   }

   @Override
   public boolean method18111(Class8848 var1, Class5839 var2) {
      return var2.field25578 != Class861.method2660();
   }

   @Override
   public boolean method18150(Class5839 var1) {
      return var1.field25578 != Class861.method2660();
   }
}
