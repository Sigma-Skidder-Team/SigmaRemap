package mapped;

public class Class2689 extends Class2595 {
   private static String[] field17116;
   private final PandaEntity field17117;
   private int field17118;

   public Class2689(PandaEntity var1) {
      this.field17117 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17118 < this.field17117.ticksExisted
         && this.field17117.method5210()
         && this.field17117.method5230()
         && PandaEntity.method5234(this.field17117).nextInt(400) == 1;
   }

   @Override
   public boolean method10806() {
      return !this.field17117.isInWater() && (this.field17117.method5210() || PandaEntity.method5235(this.field17117).nextInt(600) != 1)
         ? PandaEntity.method5236(this.field17117).nextInt(2000) != 1
         : false;
   }

   @Override
   public void method10804() {
      this.field17117.method5192(true);
      this.field17118 = 0;
   }

   @Override
   public void method10807() {
      this.field17117.method5192(false);
      this.field17118 = this.field17117.ticksExisted + 200;
   }
}
