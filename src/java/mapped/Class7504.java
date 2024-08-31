package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextProperties;

public class Class7504 implements Class7502 {
   private static String[] field32224;
   private final List<String> field32225;

   public Class7504(ItemStack var1) {
      this.field32225 = method24463(var1);
   }

   private static List<String> method24463(ItemStack var0) {
      CompoundNBT var3 = var0.method32142();
      return (List<String>)(var3 == null ? ImmutableList.of() : Class870.method2696(var3));
   }

   @Override
   public int method24459() {
      return this.field32225.size();
   }

   @Override
   public ITextProperties method24460(int var1) {
      return ITextProperties.func_240652_a_(this.field32225.get(var1));
   }
}
