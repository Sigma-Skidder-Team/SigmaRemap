package mapped;

public class Class3123 implements Class2982 {
   public final Class3879 field18330;

   public Class3123(Class3879 var1) {
      this.field18330 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6049 var4 = var1.method30580().<Class6049>method22438(Class6049.class);
      if (var4.method18733() != null && var4.method18733().equals("minecraft:brewing_stand")) {
         Class9738[] var5 = var1.<Class9738[]>method30555(BruhMotha.field22562, 0);
         Class9738[] var6 = new Class9738[var5.length + 1];

         for (int var7 = 0; var7 < var6.length; var7++) {
            if (var7 <= 4) {
               if (var7 != 4) {
                  var6[var7] = var5[var7];
               }
            } else {
               var6[var7] = var5[var7 - 1];
            }
         }

         var1.method30558(BruhMotha.field22562, 0, var6);
      }
   }
}
