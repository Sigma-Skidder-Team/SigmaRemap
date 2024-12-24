package mapped;

import net.minecraft.item.Items;
import net.minecraft.util.Hand;

public class Class2599 extends Class2598 {
   private static String[] field16836;
   private final DrownedEntity field16837;

   public Class2599(Class1022 var1, double var2, int var4, float var5) {
      super(var1, var2, var4, var5);
      this.field16837 = (DrownedEntity)var1;
   }

   @Override
   public boolean method10803() {
      return super.method10803() && this.field16837.getHeldItemMainhand().getItem() == Items.TRIDENT;
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16837.method4304(true);
      this.field16837.setActiveHand(Hand.MAIN_HAND);
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16837.resetActiveHand();
      this.field16837.method4304(false);
   }
}
