package mapped;

public class Class2722 extends Class2699 {
   private static String[] field17208;
   private final EntityPredicate field17209;
   public final VexEntity field17210;

   public Class2722(VexEntity var1, CreatureEntity var2) {
      super(var2, false);
      this.field17210 = var1;
      this.field17209 = new EntityPredicate().method30206().method30208();
   }

   @Override
   public boolean method10803() {
      return VexEntity.method5282(this.field17210) != null
         && VexEntity.method5282(this.field17210).getAttackTarget() != null
         && this.method10915(VexEntity.method5282(this.field17210).getAttackTarget(), this.field17209);
   }

   @Override
   public void startExecuting() {
      this.field17210.setAttackTarget(VexEntity.method5282(this.field17210).getAttackTarget());
      super.startExecuting();
   }
}
