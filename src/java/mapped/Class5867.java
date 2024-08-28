package mapped;

public class Class5867 extends Class5839 {
   private static String[] field25638;
   public final Class8786 field25639;
   public final Class5836 field25640;

   public Class5867(Class5836 var1, Class920 var2, int var3, int var4, int var5, Class8786 var6) {
      super(var2, var3, var4, var5);
      this.field25640 = var1;
      this.field25639 = var6;
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return false;
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      this.field25640.field25468.get(0).method18272(1);
      this.field25640.field25468.get(1).method18272(1);
      var2.method32107().method11725(var2, var1.field5024, var1);
      this.field25639.method31716((var1x, var2x) -> {
         long var5 = var1x.method6783();
         if (Class5836.method18242(this.field25640) != var5) {
            var1x.method6742((PlayerEntity)null, var2x, Class6067.field27179, Class2266.field14732, 1.0F, 1.0F);
            Class5836.method18243(this.field25640, var5);
         }
      });
      return super.method18264(var1, var2);
   }
}
