package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;
import java.util.Set;

public class Class141 extends Class128 {
   private static final Logger field471 = LogManager.getLogger();
   public static final Class2961<?> field472 = Class2961.field18072;
   public static final Class2223 field473 = Class2223.field14524;
   private final Class2961<?> field474;
   private final Class2223 field475;
   private final byte field476;
   private final int field477;
   private final boolean field478;

   public Class141(Class122[] var1, Class2961<?> var2, Class2223 var3, byte var4, int var5, boolean var6) {
      super(var1);
      this.field474 = var2;
      this.field475 = var3;
      this.field476 = var4;
      this.field477 = var5;
      this.field478 = var6;
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38627;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44335);
   }

   @Override
   public ItemStack method371(ItemStack var1, Class7812 var2) {
      if (var1.method32107() == Class8514.field38056) {
         Vector3d var5 = var2.<Vector3d>method26081(Class9525.field44335);
         if (var5 != null) {
            ServerWorld var6 = var2.method26090();
            BlockPos var7 = var6.method6943(this.field474, new BlockPos(var5), this.field477, this.field478);
            if (var7 != null) {
               ItemStack var8 = Class3316.method11859(var6, var7.method8304(), var7.method8306(), this.field476, true, true);
               Class3316.method11868(var6, var8);
               Class7529.method24595(var8, var7, "+", this.field475);
               var8.method32150(new TranslationTextComponent("filled_map." + this.field474.method11373().toLowerCase(Locale.ROOT)));
               return var8;
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static Class5881 method423() {
      return new Class5881();
   }

   // $VF: synthetic method
   public static Class2961 method424(Class141 var0) {
      return var0.field474;
   }

   // $VF: synthetic method
   public static Class2223 method425(Class141 var0) {
      return var0.field475;
   }

   // $VF: synthetic method
   public static byte method426(Class141 var0) {
      return var0.field476;
   }

   // $VF: synthetic method
   public static int method427(Class141 var0) {
      return var0.field477;
   }

   // $VF: synthetic method
   public static boolean method428(Class141 var0) {
      return var0.field478;
   }

   // $VF: synthetic method
   public static Logger method429() {
      return field471;
   }
}
