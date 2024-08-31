package mapped;

public class Class1289 extends Class1286<Class1168> {
   public final Class807 field6853;

   public Class1289(Class807 var1) {
      super(var1.width - 150, var1.height, 32, var1.height - 15, 36);
      this.field6853 = var1;
   }

   public void method6114(Class6122 var1) {
      Class807 var10003 = this.field6853;
      this.field6853.getClass();
      this.method6030(new Class1168(var10003, var1));
   }

   @Override
   public int method6022() {
      return (int)((double)this.field6785 * 0.93);
   }

   @Override
   public boolean method6057() {
      return this.field6853.method5533() == this;
   }

   @Override
   public int method6036() {
      return this.method6031() * 36;
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6853.renderBackground(var1);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0) {
         if (var1 < (double)this.method6048() && var3 >= (double)this.field6787 && var3 <= (double)this.field6788) {
            int var8 = this.field6785 / 2 - 92;
            int var9 = this.field6785;
            int var10 = (int)Math.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044();
            int var11 = var10 / this.field6783;
            if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method6031()) {
               this.method6109(var11);
               this.method6110(var10, var11, var1, var3, this.field6785);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int method6048() {
      return this.field6785 - 5;
   }

   @Override
   public void method6110(int var1, int var2, double var3, double var5, int var7) {
      int var10 = this.field6785 - 35;
      int var11 = var2 * this.field6783 + 36 - (int)this.method6044();
      int var12 = var10 + 10;
      int var13 = var11 - 3;
      if (var3 >= (double)var10 && var3 <= (double)(var10 + 9) && var5 >= (double)var11 && var5 <= (double)(var11 + 9)) {
         if (!((Class6122)Class807.method2189(this.field6853).get(var2)).field27415.isEmpty()) {
            Class807.method2192(this.field6853, -1);
            Class807.method2193((int)this.method6044());
            this.field6782.displayGuiScreen(new Class803(this.field6853, (Class6122)Class807.method2189(this.field6853).get(var2)));
         }
      } else if (var3 >= (double)var12 && var3 < (double)(var12 + 13) && var5 >= (double)var13 && var5 < (double)(var13 + 15)) {
         Class807.method2193((int)this.method6044());
         Class807.method2194(this.field6853, var2);
      }
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         Class9229.method34711(I18n.format("narrator.select", ((Class6122)Class807.method2189(this.field6853).get(var1)).field27411.toString()));
      }

      this.method6115(var1);
   }

   public void method6115(int var1) {
      Class807.method2192(this.field6853, var1);
      Class807.method2195(this.field6853);
   }

   public void method6024(Class1168 var1) {
      super.method6024(var1);
      Class807.method2192(this.field6853, this.method2468().indexOf(var1));
      Class807.method2195(this.field6853);
   }
}
