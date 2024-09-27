package mapped;

public class Class2987 implements Class2982 {
   private static String[] field18102;
   public final Class3917 field18103;

   public Class2987(Class3917 var1) {
      this.field18103 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(BruhMotha.field22544, 0);
      if (ViaVersion3.method27612().method21896()) {
         Class6055 var5 = var1.method30580().<Class6055>method22438(Class6055.class);
         if (var5.method18741(var4)) {
            Double var6 = var1.<Double>method30555(BruhMotha.field22528, 1);
            var6 = var6 - ViaVersion3.method27612().method21900();
            var1.method30558(BruhMotha.field22528, 1, var6);
         }
      }
   }
}
