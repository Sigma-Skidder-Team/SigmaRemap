package mapped;

public class Class2705 extends HurtByTargetGoal {
   private static String[] field17178;

   public Class2705(Class1064 var1) {
      super(var1);
   }

   @Override
   public boolean method10806() {
      if (this.field17153 instanceof Class1064) {
         Class1064 var3 = (Class1064)this.field17153;
         if (Class1064.method4918(var3)) {
            Class1064.method4919(var3, false);
            return false;
         }
      }

      return super.method10806();
   }
}
