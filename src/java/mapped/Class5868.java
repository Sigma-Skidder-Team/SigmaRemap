package mapped;

public class Class5868 extends Class5839 {
   private static String[] field25641;
   private final Class988 field25642;
   private final PlayerEntity field25643;
   private int field25644;
   private final Class1060 field25645;

   public Class5868(PlayerEntity var1, Class1060 var2, Class988 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field25643 = var1;
      this.field25645 = var2;
      this.field25642 = var3;
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return false;
   }

   @Override
   public Class8848 method18272(int var1) {
      if (this.method18266()) {
         this.field25644 = this.field25644 + Math.min(var1, this.method18265().method32179());
      }

      return super.method18272(var1);
   }

   @Override
   public void method18261(Class8848 var1, int var2) {
      this.field25644 += var2;
      this.method18263(var1);
   }

   @Override
   public void method18263(Class8848 var1) {
      var1.method32136(this.field25643.field5024, this.field25643, this.field25644);
      this.field25644 = 0;
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      this.method18263(var2);
      Class9346 var5 = this.field25642.method4067();
      if (var5 != null) {
         Class8848 var6 = this.field25642.method3618(0);
         Class8848 var7 = this.field25642.method3618(1);
         if (var5.method35389(var6, var7) || var5.method35389(var7, var6)) {
            this.field25645.method4745(var5);
            var1.method2911(Class8876.field40140);
            this.field25642.method3621(0, var6);
            this.field25642.method3621(1, var7);
         }

         this.field25645.method4744(this.field25645.method4721() + var5.method35381());
      }

      return var2;
   }
}
