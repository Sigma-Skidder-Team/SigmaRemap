package mapped;

public class Class2705 extends HurtByTargetGoal {
   private static String[] field17178;

   public Class2705(LlamaEntity var1) {
      super(var1);
   }

   @Override
   public boolean method10806() {
      if (this.field17153 instanceof LlamaEntity) {
         LlamaEntity var3 = (LlamaEntity)this.field17153;
         if (LlamaEntity.method4918(var3)) {
            LlamaEntity.method4919(var3, false);
            return false;
         }
      }

      return super.method10806();
   }
}
