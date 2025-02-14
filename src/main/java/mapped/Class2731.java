package mapped;

import com.google.common.collect.Sets;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.EnumSet;
import java.util.Set;

public class Class2731 extends Class2595 {
   private static String[] field17242;
   private static final EntityPredicate field17243 = new EntityPredicate().method30203(10.0).method30205().method30204();
   private final TurtleEntity field17244;
   private final double field17245;
   private PlayerEntity field17246;
   private int field17247;
   private final Set<Item> field17248;

   public Class2731(TurtleEntity var1, double var2, Item var4) {
      this.field17244 = var1;
      this.field17245 = var2;
      this.field17248 = Sets.newHashSet(new Item[]{var4});
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      if (this.field17247 <= 0) {
         this.field17246 = this.field17244.world.method7188(field17243, this.field17244);
         return this.field17246 == null ? false : this.method10942(this.field17246.getHeldItemMainhand()) || this.method10942(this.field17246.getHeldItemOffhand());
      } else {
         this.field17247--;
         return false;
      }
   }

   private boolean method10942(ItemStack var1) {
      return this.field17248.contains(var1.getItem());
   }

   @Override
   public boolean method10806() {
      return this.method10803();
   }

   @Override
   public void method10807() {
      this.field17246 = null;
      this.field17244.method4230().method21666();
      this.field17247 = 100;
   }

   @Override
   public void method10805() {
      this.field17244.method4227().method28040(this.field17246, (float)(this.field17244.method4260() + 20), (float)this.field17244.method4259());
      if (!(this.field17244.getDistanceSq(this.field17246) < 6.25)) {
         this.field17244.method4230().method21655(this.field17246, this.field17245);
      } else {
         this.field17244.method4230().method21666();
      }
   }
}
