package mapped;

public class Class3148 implements Class2982 {
   private static String[] field18372;
   public final Class3774 field18373;

   public Class3148(Class3774 var1) {
      this.field18373 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30559(BruhMotha.field22544);
      if (ViaVersion3.method27612().setLeftHandedHandling() && var4 == 0) {
         var1.method30558(BruhMotha.field22522, 0, (short)(var1.<Short>method30555(BruhMotha.field22522, 0).intValue() | 128));
      }

      var1.method30583(Class6363.class, true, true);
      var1.method30578();
      ViaVersion3.getInstance().method34424().<Class5407>method31084(Class5407.class).method16993(var1.method30580(), var4);
   }
}
