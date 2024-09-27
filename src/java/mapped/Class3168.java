package mapped;

public class Class3168 implements Class2982 {
   private static String[] field18411;
   public final Class3842 field18412;

   public Class3168(Class3842 var1) {
      this.field18412 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30555(BruhMotha.field22526, 0);
      int var5 = var1.<Integer>method30555(BruhMotha.field22526, 1);
      Class7161 var6 = var1.method30580();
      Class6949[] var7 = var1.<Class6949[]>method30555(BruhMotha.field22564, 0);

      for (Class6949 var11 : var7) {
         int var12 = Class7795.method25886(var11.method21452());
         Class9695 var13 = new Class9695(var11.method21448() + var4 * 16, var11.method21454(), var11.method21450() + var5 * 16);
         if (ViaVersion3.method27612().method21925()) {
            Class9322.method35225(var6, var13.method37962(), var13.method37963(), var13.method37964(), var12);
         }

         var11.method21453(Class7795.method25888(var1.method30580(), var13, var12));
      }

      if (ViaVersion3.method27612().method21925()) {
         for (Class6949 var21 : var7) {
            int var23 = var21.method21452();
            Class9695 var26 = new Class9695(var21.method21448() + var4 * 16, var21.method21454(), var21.method21450() + var5 * 16);
            Class4147 var14 = Class9322.method35233(var23);
            if (var14 != null) {
               var23 = var14.method12839(var6, var26, var23);
               var21.method21453(var23);
            }
         }

         var1.method30568(Class6380.class, true, true);
         var1.method30578();

         for (Class6949 var22 : var7) {
            Class9695 var25 = new Class9695(var22.method21448() + var4 * 16, var22.method21454(), var22.method21450() + var5 * 16);
            Class9322.method35222(var6, var25);
         }
      }
   }
}
