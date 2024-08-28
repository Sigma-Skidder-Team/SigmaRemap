package mapped;

public class Class5841 extends Class5839 {
   private static String[] field25583;
   public final Class5823 field25584;

   public Class5841(Class5823 var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25584 = var1;
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return false;
   }

   @Override
   public boolean method18273(PlayerEntity var1) {
      return this.field25584.method18189(var1, this.method18266());
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      return this.field25584.method18190(var1, var2);
   }
}
