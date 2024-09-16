package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class Class170 implements Predicate<Class9632> {
   private static String[] field547;
   private final ITag<Block> field548;
   private final CompoundNBT field549;
   private final Map<String, String> field550;

   public Class170(ITag<Block> var1, Map<String, String> var2, CompoundNBT var3) {
      this.field548 = var1;
      this.field550 = var2;
      this.field549 = var3;
   }

   public boolean test(Class9632 var1) {
      BlockState var4 = var1.method37548();
      if (!var4.method23446(this.field548)) {
         return false;
      } else {
         for (Entry var6 : this.field550.entrySet()) {
            Class8550 var7 = var4.getBlock().getStateContainer().method35396((String)var6.getKey());
            if (var7 == null) {
               return false;
            }

            Comparable var8 = (Comparable)var7.method30476((String)var6.getValue()).orElse(null);
            if (var8 == null) {
               return false;
            }

            if (var4.method23463(var7) != var8) {
               return false;
            }
         }

         if (this.field549 == null) {
            return true;
         } else {
            TileEntity var9 = var1.method37549();
            return var9 != null && Class8354.method29280(this.field549, var9.write(new CompoundNBT()), true);
         }
      }
   }
}
