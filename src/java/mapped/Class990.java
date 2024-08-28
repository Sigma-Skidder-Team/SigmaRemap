package mapped;

public class Class990 implements Class920 {
   private static String[] field5474;
   private final Class920 field5475;
   private final Class920 field5476;

   public Class990(Class920 var1, Class920 var2) {
      if (var1 == null) {
         var1 = var2;
      }

      if (var2 == null) {
         var2 = var1;
      }

      this.field5475 = var1;
      this.field5476 = var2;
   }

   @Override
   public int method3629() {
      return this.field5475.method3629() + this.field5476.method3629();
   }

   @Override
   public boolean method3617() {
      return this.field5475.method3617() && this.field5476.method3617();
   }

   public boolean method4070(Class920 var1) {
      return this.field5475 == var1 || this.field5476 == var1;
   }

   @Override
   public Class8848 method3618(int var1) {
      return var1 < this.field5475.method3629() ? this.field5475.method3618(var1) : this.field5476.method3618(var1 - this.field5475.method3629());
   }

   @Override
   public Class8848 method3619(int var1, int var2) {
      return var1 < this.field5475.method3629() ? this.field5475.method3619(var1, var2) : this.field5476.method3619(var1 - this.field5475.method3629(), var2);
   }

   @Override
   public Class8848 method3620(int var1) {
      return var1 < this.field5475.method3629() ? this.field5475.method3620(var1) : this.field5476.method3620(var1 - this.field5475.method3629());
   }

   @Override
   public void method3621(int var1, Class8848 var2) {
      if (var1 < this.field5475.method3629()) {
         this.field5475.method3621(var1, var2);
      } else {
         this.field5476.method3621(var1 - this.field5475.method3629(), var2);
      }
   }

   @Override
   public int method3630() {
      return this.field5475.method3630();
   }

   @Override
   public void method3622() {
      this.field5475.method3622();
      this.field5476.method3622();
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5475.method3623(var1) && this.field5476.method3623(var1);
   }

   @Override
   public void method3631(PlayerEntity var1) {
      this.field5475.method3631(var1);
      this.field5476.method3631(var1);
   }

   @Override
   public void method3632(PlayerEntity var1) {
      this.field5475.method3632(var1);
      this.field5476.method3632(var1);
   }

   @Override
   public boolean method3633(int var1, Class8848 var2) {
      return var1 < this.field5475.method3629() ? this.field5475.method3633(var1, var2) : this.field5476.method3633(var1 - this.field5475.method3629(), var2);
   }

   @Override
   public void method3625() {
      this.field5475.method3625();
      this.field5476.method3625();
   }
}
