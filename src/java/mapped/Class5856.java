package mapped;

public class Class5856 extends Class5839 {
   private static String[] field25612;
   private final Class926 field25613;
   private final PlayerEntity field25614;
   private int field25615;

   public Class5856(PlayerEntity var1, Class926 var2, Class920 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field25614 = var1;
      this.field25613 = var2;
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return false;
   }

   @Override
   public Class8848 method18272(int var1) {
      if (this.method18266()) {
         this.field25615 = this.field25615 + Math.min(var1, this.method18265().method32179());
      }

      return super.method18272(var1);
   }

   @Override
   public void method18261(Class8848 var1, int var2) {
      this.field25615 += var2;
      this.method18263(var1);
   }

   @Override
   public void method18262(int var1) {
      this.field25615 += var1;
   }

   @Override
   public void method18263(Class8848 var1) {
      if (this.field25615 > 0) {
         var1.method32136(this.field25614.field5024, this.field25614, this.field25615);
      }

      if (this.field25578 instanceof Class923) {
         ((Class923)this.field25578).method3638(this.field25614);
      }

      this.field25615 = 0;
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      this.method18263(var2);
      Class25 var5 = var1.field5024.method6816().method1034(Class7207.field30935, this.field25613, var1.field5024);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         Class8848 var7 = this.field25613.method3618(var6);
         Class8848 var8 = (Class8848)var5.get(var6);
         if (!var7.method32105()) {
            this.field25613.method3619(var6, 1);
            var7 = this.field25613.method3618(var6);
         }

         if (!var8.method32105()) {
            if (!var7.method32105()) {
               if (Class8848.method32130(var7, var8) && Class8848.method32127(var7, var8)) {
                  var8.method32181(var7.method32179());
                  this.field25613.method3621(var6, var8);
               } else if (!this.field25614.field4902.method4045(var8)) {
                  this.field25614.method2882(var8, false);
               }
            } else {
               this.field25613.method3621(var6, var8);
            }
         }
      }

      return var2;
   }
}
