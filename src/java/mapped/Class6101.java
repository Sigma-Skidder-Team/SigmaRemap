package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6101 {
   private static final Logger field27347 = LogManager.getLogger();
   private final BlockPos field27348;
   private final ServerWorld field27349;
   private final Class7879 field27350;
   private final int field27351;
   private final List<Class8262> field27352 = Lists.newArrayList();
   private final Map<Class8262, BlockPos> field27353 = Maps.newHashMap();
   private final List<Pair<Class8363, Collection<Class8262>>> field27354 = Lists.newArrayList();
   private Class9494 field27355;
   private int field27356 = 0;
   private BlockPos.Mutable field27357;

   public Class6101(Collection<Class8363> var1, BlockPos var2, Rotation var3, ServerWorld var4, Class7879 var5, int var6) {
      this.field27357 = var2.method8354();
      this.field27348 = var2;
      this.field27349 = var4;
      this.field27350 = var5;
      this.field27351 = var6;
      var1.forEach(var3x -> {
         ArrayList var6x = Lists.newArrayList();

         for (Class4871 var8 : var3x.method29302()) {
            Class8262 var9 = new Class8262(var8, var3, var4);
            var6x.add(var9);
            this.field27352.add(var9);
         }

         this.field27354.add(Pair.of(var3x, var6x));
      });
   }

   public List<Class8262> method18856() {
      return this.field27352;
   }

   public void method18857() {
      this.method18858(0);
   }

   private void method18858(int var1) {
      this.field27356 = var1;
      this.field27355 = new Class9494();
      if (var1 < this.field27354.size()) {
         Pair<Class8363, Collection<Class8262>> var4 = this.field27354.get(this.field27356);
         Class8363 var5 = var4.getFirst();
         Collection<Class8262> var6 = var4.getSecond();
         this.method18860(var6);
         var5.method29303(this.field27349);
         String var7 = var5.method29301();
         field27347.info("Running test batch '" + var7 + "' (" + var6.size() + " tests)...");
         var6.forEach(var1x -> {
            this.field27355.method36669(var1x);
            this.field27355.method36670(new Class8404(this));
            BlockPos var4x = this.field27353.get(var1x);
            Class7440.method24029(var1x, var4x, this.field27350);
         });
      }
   }

   private void method18859(Class8262 var1) {
      if (this.field27355.method36678()) {
         this.method18858(this.field27356 + 1);
      }
   }

   private void method18860(Collection<Class8262> var1) {
      int var4 = 0;
      AxisAlignedBB var5 = new AxisAlignedBB(this.field27357);

      for (Class8262 var7 : var1) {
         BlockPos var8 = new BlockPos(this.field27357);
         Class964 var9 = Class7803.method26056(var7.method28820(), var8, var7.method28821(), 2, this.field27349, true);
         AxisAlignedBB var10 = Class7803.method26052(var9);
         var7.method28802(var9.getPos());
         this.field27353.put(var7, new BlockPos(this.field27357));
         var5 = var5.union(var10);
         this.field27357.method8381((int)var10.getXSize() + 5, 0, 0);
         if (var4++ % this.field27351 == this.field27351 - 1) {
            this.field27357.method8381(0, 0, (int)var5.getZSize() + 6);
            this.field27357.setX(this.field27348.getX());
            var5 = new AxisAlignedBB(this.field27357);
         }
      }
   }

   // $VF: synthetic method
   public static void method18863(Class6101 var0, Class8262 var1) {
      var0.method18859(var1);
   }
}
