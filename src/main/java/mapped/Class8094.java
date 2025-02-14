package mapped;

public class Class8094 extends Class8092 {
   private static String[] field34811;
   public final BeeEntity field34821;

   public Class8094(BeeEntity var1, MobEntity var2) {
      super(var2);
      this.field34821 = var1;
   }

   @Override
   public void method28037() {
      if (!this.field34821.method4369()) {
         super.method28037();
      }
   }

   @Override
   public boolean method28038() {
      return !Class2663.method10870(BeeEntity.method4451(this.field34821));
   }
}
