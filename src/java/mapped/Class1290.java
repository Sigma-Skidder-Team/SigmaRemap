package mapped;

public class Class1290 extends Class1286<Class1166> {
   public final Class824 field6854;

   public Class1290(Class824 var1) {
      super(Class824.method2427(var1) + 10, Class824.method2431(12) + 20, Class824.method2432(1), Class824.method2433(12) + 20, 13);
      this.field6854 = var1;
   }

   public void method6116(Class6114 var1) {
      Class824 var10003 = this.field6854;
      this.field6854.getClass();
      this.method6030(new Class1166(var10003, var1));
   }

   @Override
   public int method6022() {
      return (int)((double)this.field6785 * 1.0);
   }

   @Override
   public boolean method6057() {
      return this.field6854.method5533() == this;
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0 && var1 < (double)this.method6048() && var3 >= (double)this.field6787 && var3 <= (double)this.field6788) {
         int var8 = Class824.method2425(this.field6854);
         int var9 = Class824.method2425(this.field6854) + Class824.method2427(this.field6854);
         int var10 = (int)Math.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044() - 4;
         int var11 = var10 / this.field6783;
         if (var1 >= (double)var8 && var1 <= (double)var9 && var11 >= 0 && var10 >= 0 && var11 < this.method6031()) {
            this.method6109(var11);
            this.method6110(var10, var11, var1, var3, this.field6785);
         }

         return true;
      } else {
         return super.method1958(var1, var3, var5);
      }
   }

   @Override
   public void method6110(int var1, int var2, double var3, double var5, int var7) {
      if (var2 >= 0 && var2 <= Class824.method2434(this.field6854).field27450.size() && Class824.method2435(this.field6854) != Class2162.field14182) {
         if (Class824.method2435(this.field6854) != Class2162.field14180) {
            if (Class824.method2435(this.field6854) == Class2162.field14181) {
               Class824.method2438(this.field6854, var2);
            }
         } else if (!Class824.method2434(this.field6854).field27450.get(var2).method18879()) {
            Class824.method2437(this.field6854, var2);
         } else {
            Class824.method2436(this.field6854, var2);
         }
      }
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         Class9229.method34711(Class9088.method33883("narrator.select", Class824.method2434(this.field6854).field27450.get(var1).method18875()));
      }

      this.method6117(var1);
   }

   public void method6117(int var1) {
      Class824.method2439(this.field6854, var1);
      Class824.method2440(this.field6854);
   }

   public void method6024(Class1166 var1) {
      super.method6024(var1);
      Class824.method2439(this.field6854, this.method2468().indexOf(var1));
      Class824.method2440(this.field6854);
   }

   @Override
   public void method6039(Class9332 var1) {
      this.field6854.method2469(var1);
   }

   @Override
   public int method6048() {
      return Class824.method2425(this.field6854) + this.field6785 - 5;
   }

   @Override
   public int method6036() {
      return this.method6031() * 13;
   }
}
