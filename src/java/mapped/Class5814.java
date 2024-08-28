package mapped;

public class Class5814 extends Class5812 {
   private static String[] field25481;
   private final Class920 field25482;

   public Class5814(int var1, Class974 var2) {
      this(var1, var2, new Class927(27));
   }

   public Class5814(int var1, Class974 var2, Class920 var3) {
      super(Class8298.field35667, var1);
      method18122(var3, 27);
      this.field25482 = var3;
      var3.method3631(var2.field5444);
      byte var6 = 3;
      byte var7 = 9;

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.method18124(new Class5861(var3, var9 + var8 * 9, 8 + var9 * 18, 18 + var8 * 18));
         }
      }

      for (int var10 = 0; var10 < 3; var10++) {
         for (int var12 = 0; var12 < 9; var12++) {
            this.method18124(new Class5839(var2, var12 + var10 * 9 + 9, 8 + var12 * 18, 84 + var10 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.method18124(new Class5839(var2, var11, 8 + var11 * 18, 142));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25482.method3623(var1);
   }

   @Override
   public Class8848 method18112(PlayerEntity var1, int var2) {
      Class8848 var5 = Class8848.field39973;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         Class8848 var7 = var6.method18265();
         var5 = var7.method32126();
         if (var2 >= this.field25482.method3629()) {
            if (!this.method18142(var7, 0, this.field25482.method3629(), false)) {
               return Class8848.field39973;
            }
         } else if (!this.method18142(var7, this.field25482.method3629(), this.field25468.size(), true)) {
            return Class8848.field39973;
         }

         if (!var7.method32105()) {
            var6.method18268();
         } else {
            var6.method18267(Class8848.field39973);
         }
      }

      return var5;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25482.method3632(var1);
   }
}
