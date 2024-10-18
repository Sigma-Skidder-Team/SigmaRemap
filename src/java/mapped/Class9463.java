package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.util.Util;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Class9463 {
   private Mirror field43962 = Mirror.field13614;
   private Rotation field43963 = Rotation.NONE;
   private BlockPos field43964 = BlockPos.ZERO;
   private boolean field43965;
   private ChunkPos field43966;
   private MutableBoundingBox field43967;
   private boolean field43968 = true;
   private Random field43969;
   private int field43970;
   private final List<Class7092> field43971 = Lists.newArrayList();
   private boolean field43972;
   private boolean field43973;

   public Class9463 method36424() {
      Class9463 var3 = new Class9463();
      var3.field43962 = this.field43962;
      var3.field43963 = this.field43963;
      var3.field43964 = this.field43964;
      var3.field43965 = this.field43965;
      var3.field43966 = this.field43966;
      var3.field43967 = this.field43967;
      var3.field43968 = this.field43968;
      var3.field43969 = this.field43969;
      var3.field43970 = this.field43970;
      var3.field43971.addAll(this.field43971);
      var3.field43972 = this.field43972;
      var3.field43973 = this.field43973;
      return var3;
   }

   public Class9463 method36425(Mirror var1) {
      this.field43962 = var1;
      return this;
   }

   public Class9463 method36426(Rotation var1) {
      this.field43963 = var1;
      return this;
   }

   public Class9463 method36427(BlockPos var1) {
      this.field43964 = var1;
      return this;
   }

   public Class9463 method36428(boolean var1) {
      this.field43965 = var1;
      return this;
   }

   public Class9463 method36429(ChunkPos var1) {
      this.field43966 = var1;
      return this;
   }

   public Class9463 method36430(MutableBoundingBox var1) {
      this.field43967 = var1;
      return this;
   }

   public Class9463 method36431(Random var1) {
      this.field43969 = var1;
      return this;
   }

   public Class9463 method36432(boolean var1) {
      this.field43972 = var1;
      return this;
   }

   public Class9463 method36433() {
      this.field43971.clear();
      return this;
   }

   public Class9463 method36434(Class7092 var1) {
      this.field43971.add(var1);
      return this;
   }

   public Class9463 method36435(Class7092 var1) {
      this.field43971.remove(var1);
      return this;
   }

   public Mirror method36436() {
      return this.field43962;
   }

   public Rotation method36437() {
      return this.field43963;
   }

   public BlockPos method36438() {
      return this.field43964;
   }

   public Random method36439(BlockPos var1) {
      if (this.field43969 == null) {
         return var1 != null ? new Random(MathHelper.method37809(var1)) : new Random(Util.milliTime());
      } else {
         return this.field43969;
      }
   }

   public boolean method36440() {
      return this.field43965;
   }

   @Nullable
   public MutableBoundingBox method36441() {
      if (this.field43967 == null && this.field43966 != null) {
         this.method36444();
      }

      return this.field43967;
   }

   public boolean method36442() {
      return this.field43972;
   }

   public List<Class7092> method36443() {
      return this.field43971;
   }

   public void method36444() {
      if (this.field43966 != null) {
         this.field43967 = this.method36447(this.field43966);
      }
   }

   public boolean method36445() {
      return this.field43968;
   }

   public Class7285 method36446(List<Class7285> var1, BlockPos var2) {
      int var5 = var1.size();
      if (var5 != 0) {
         return (Class7285)var1.get(this.method36439(var2).nextInt(var5));
      } else {
         throw new IllegalStateException("No palettes");
      }
   }

   @Nullable
   private MutableBoundingBox method36447(ChunkPos var1) {
      if (var1 != null) {
         int var4 = var1.x * 16;
         int var5 = var1.z * 16;
         return new MutableBoundingBox(var4, 0, var5, var4 + 16 - 1, 255, var5 + 16 - 1);
      } else {
         return this.field43967;
      }
   }

   public Class9463 method36448(boolean var1) {
      this.field43973 = var1;
      return this;
   }

   public boolean method36449() {
      return this.field43973;
   }
}
