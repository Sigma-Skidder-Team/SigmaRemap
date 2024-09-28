package mapped;

public class Class3236 extends Class3237 implements Class3235 {
   private static String[] field18676;
   private final Class112 field18677;

   public Class3236(Class112 var1, Properties var2) {
      super(var2);
      this.field18677 = var1;
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field18680, Boolean.valueOf(false))
            .with(field18681, Boolean.valueOf(false))
            .with(field18682, Boolean.valueOf(false))
            .with(field18683, Boolean.valueOf(false))
            .with(field18684, Boolean.valueOf(false))
      );
   }

   @Override
   public Class112 method11637() {
      return this.field18677;
   }
}
