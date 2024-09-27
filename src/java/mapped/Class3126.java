package mapped;

public class Class3126 implements Class2982 {
   private static String[] field18334;
   public final Class3767 field18335;

   public Class3126(Class3767 var1) {
      this.field18335 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(BruhMotha.field22544, 0);
      if (ViaVersion3.method27612().method21896()) {
         Class6057 var5 = var1.method30580().<Class6057>method22438(Class6057.class);
         if (var5.method18759().contains(var4)) {
            Double var6 = var1.<Double>method30555(BruhMotha.field22528, 1);
            var6 = var6 + ViaVersion3.method27612().method21900();
            var1.method30558(BruhMotha.field22528, 1, var6);
         }
      }
   }
}
