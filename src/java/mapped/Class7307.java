package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;

public class Class7307 {
   private static String[] field31326;
   private final int field31327;
   private final Object2IntOpenHashMap<Class179> field31328;
   private final Class7672 field31329;
   private final Object2IntMap<Class179> field31330;
   private BlockPos field31331;
   private EntityType<?> field31332;
   private double field31333;

   public Class7307(int var1, Object2IntOpenHashMap<Class179> var2, Class7672 var3) {
      this.field31327 = var1;
      this.field31328 = var2;
      this.field31329 = var3;
      this.field31330 = Object2IntMaps.unmodifiable(var2);
   }

   private boolean method23088(EntityType<?> var1, BlockPos var2, IChunk var3) {
      this.field31331 = var2;
      this.field31332 = var1;
      Class7763 var6 = Class8170.method28437(var2, var3).method32499().method31969(var1);
      if (var6 != null) {
         double var7 = var6.method25733();
         this.field31333 = var7;
         double var9 = this.field31329.method25205(var2, var7);
         return var9 <= var6.method25732();
      } else {
         this.field31333 = 0.0;
         return true;
      }
   }

   private void method23089(MobEntity var1, IChunk var2) {
      EntityType var5 = var1.getType();
      BlockPos var6 = var1.getPosition();
      double var8;
      if (var6.equals(this.field31331) && var5 == this.field31332) {
         var8 = this.field31333;
      } else {
         Class7763 var7 = Class8170.method28437(var6, var2).method32499().method31969(var5);
         if (var7 == null) {
            var8 = 0.0;
         } else {
            var8 = var7.method25733();
         }
      }

      this.field31329.method25204(var6, var8);
      this.field31328.addTo(var5.method33209(), 1);
   }

   public int method23090() {
      return this.field31327;
   }

   public Object2IntMap<Class179> method23091() {
      return this.field31330;
   }

   private boolean method23092(Class179 var1) {
      int var4 = var1.method519() * this.field31327 / Class8170.method28438();
      return this.field31328.getInt(var1) < var4;
   }

   // $VF: synthetic method
   public static boolean method23093(Class7307 var0, Class179 var1) {
      return var0.method23092(var1);
   }

   // $VF: synthetic method
   public static void method23094(Class7307 var0, MobEntity var1, IChunk var2) {
      var0.method23089(var1, var2);
   }

   // $VF: synthetic method
   public static boolean method23095(Class7307 var0, EntityType var1, BlockPos var2, IChunk var3) {
      return var0.method23088(var1, var2, var3);
   }
}
