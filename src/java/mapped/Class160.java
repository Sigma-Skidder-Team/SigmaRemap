package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Class160 implements ILootCondition {
   private static String[] field519;
   private final Map<String, Class6872> field520;
   private final Class2063 field521;

   public Class160(Map<String, Class6872> var1, Class2063 var2) {
      this.field520 = ImmutableMap.copyOf(var1);
      this.field521 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38601;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(this.field521.method8717());
   }

   public boolean test(LootContext var1) {
      Entity var4 = var1.method26081(this.field521.method8717());
      if (var4 == null) {
         return false;
      } else {
         Class6886 var5 = var4.world.method6805();

         for (Entry var7 : this.field520.entrySet()) {
            if (!this.method483(var4, var5, (String)var7.getKey(), (Class6872)var7.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method483(Entity var1, Class6886 var2, String var3, Class6872 var4) {
      Class8375 var7 = var2.method20976(var3);
      if (var7 != null) {
         String var8 = var1.method2956();
         return var2.method20979(var8, var7) ? var4.method20925(var2.method20980(var8, var7).method36050()) : false;
      } else {
         return false;
      }
   }

   // $VF: synthetic method
   public static Map<String, Class6872> method484(Class160 var0) {
      return var0.field520;
   }

   // $VF: synthetic method
   public static Class2063 method485(Class160 var0) {
      return var0.field521;
   }
}
