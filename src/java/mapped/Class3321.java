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
   private static final Map<Class112, Class3321> field18830 = Maps.newEnumMap(Class112.class);
   private final Class112 field18831;

   public Class3321(Class112 var1, Properties var2) {
      super(var2);
      this.field18831 = var1;
      field18830.put(var1, this);
   }

   @Override
   public ActionResultType method11716(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      if (var3 instanceof Class1019) {
         Class1019 var7 = (Class1019)var3;
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

   public Class112 method11876() {
      return this.field18831;
   }

   public static Class3321 method11877(Class112 var0) {
      return field18830.get(var0);
   }
}
