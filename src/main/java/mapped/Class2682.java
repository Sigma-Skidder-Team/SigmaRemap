package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class2682 extends TemptGoal {
   private static String[] field17093;
   private PlayerEntity field17094;
   private final CatEntity field17095;

   public Class2682(CatEntity var1, double var2, Ingredient var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.field17095 = var1;
   }

   @Override
   public void method10805() {
      super.method10805();
      if (this.field17094 == null && this.field17079.getRNG().nextInt(600) == 0) {
         this.field17094 = this.field17086;
      } else if (this.field17079.getRNG().nextInt(500) == 0) {
         this.field17094 = null;
      }
   }

   @Override
   public boolean method10899() {
      return this.field17094 != null && this.field17094.equals(this.field17086) ? false : super.method10899();
   }

   @Override
   public boolean method10803() {
      return super.method10803() && !this.field17095.method4393();
   }
}
