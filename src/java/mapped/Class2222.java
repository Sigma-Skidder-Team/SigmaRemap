package mapped;

public enum Class2222 {
   field14510((var0, var1, var2, var3) -> var2),
   field14511(
      (var0, var1, var2, var3) -> var1.method8304() != var0.field45678
               && var1.method8304() != var0.field45681
               && var1.getY() != var0.field45679
               && var1.getY() != var0.field45682
               && var1.method8306() != var0.field45680
               && var1.method8306() != var0.field45683
            ? null
            : var2
   ),
   field14512(
      (var0, var1, var2, var3) -> var1.method8304() != var0.field45678
               && var1.method8304() != var0.field45681
               && var1.getY() != var0.field45679
               && var1.getY() != var0.field45682
               && var1.method8306() != var0.field45680
               && var1.method8306() != var0.field45683
            ? Class8031.method27552()
            : var2
   ),
   field14513((var0, var1, var2, var3) -> {
      var3.method7179(var1, true);
      return var2;
   });

   public final Class7847 field14514;
   private static final Class2222[] field14515 = new Class2222[]{field14510, field14511, field14512, field14513};

   private Class2222(Class7847 var3) {
      this.field14514 = var3;
   }
}
