package mapped;

public final class Class4022 extends Class3758 {
   private static String[] field20343;
   public final Class6357 field20344;

   public Class4022(Class6357 var1) {
      this.field20344 = var1;
   }

   @Override
   public void method12725() {
      this.map(BruhMotha.field22526);
      this.method12733(var0 -> {
         short var3 = var0.<Short>method30559(BruhMotha.field22522);
         var0.method30560(BruhMotha.field22524, false);
         var3 = (short)(var3 & -9);
         var0.method30560(BruhMotha.field22522, var3);
      });
      this.map(BruhMotha.field22518);
      this.map(BruhMotha.field22540);
      this.method12733(var1 -> {
         var1.<Class72>method30559(BruhMotha.field22555);
         var1.method30560(BruhMotha.field22555, this.field20344.method19376().method18557());
         String var4 = var1.<String>method30559(BruhMotha.field22539);
         var1.method30560(BruhMotha.field22555, Class9316.method35207(var4));
      });
      this.map(BruhMotha.field22539);
      this.map(BruhMotha.field22530);
      this.method12727(BruhMotha.field22522, BruhMotha.field22544);
      this.method12733(
         var0 -> var0.method30580()
               .<Class6035>method22438(Class6035.class)
               .method18666(var0.<Integer>method30555(BruhMotha.field22526, 0), Class1874.field10888)
      );
   }
}
