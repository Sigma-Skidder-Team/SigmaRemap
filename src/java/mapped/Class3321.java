package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;

import java.util.Map;

public class Class3321 extends Item {
   private static String[] field18829;
   private static final Map<DyeColor, Class3321> field18830 = Maps.newEnumMap(DyeColor.class);
   private final DyeColor field18831;

   public Class3321(DyeColor var1, Properties var2) {
      super(var2);
      this.field18831 = var1;
      field18830.put(var1, this);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      if (var3 instanceof SheepEntity) {
         SheepEntity var7 = (SheepEntity)var3;
         if (var7.isAlive() && !var7.method4519() && var7.method4517() != this.field18831) {
            if (!var2.world.isRemote) {
               var7.method4518(this.field18831);
               var1.shrink(1);
            }

            return ActionResultType.method9002(var2.world.isRemote);
         }
      }

      return ActionResultType.field14820;
   }

   public DyeColor method11876() {
      return this.field18831;
   }

   public static Class3321 method11877(DyeColor var0) {
      return field18830.get(var0);
   }
}
