package mapped;

public class Class2681 extends TemptGoal {
   private static String[] field17091;
   private final OcelotEntity field17092;

   public Class2681(OcelotEntity var1, double var2, Ingredient var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.field17092 = var1;
   }

   @Override
   public boolean method10899() {
      return super.method10899() && !OcelotEntity.method5079(this.field17092);
   }
}
