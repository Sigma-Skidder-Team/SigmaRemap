package mapped;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;

import java.util.List;

public class WorldBorder {
   private static String[] field32257;
   private final List<Class7047> field32258 = Lists.newArrayList();
   private double field32259 = 0.2;
   private double field32260 = 5.0;
   private int field32261 = 15;
   private int field32262 = 5;
   private double field32263;
   private double field32264;
   private int worldSize = 29999984;
   private WorldBorderIBorderInfo field32266 = new StationaryBorderInfo(this, 6.0E7);
   public static final Class7235 field32267 = new Class7235(0.0, 0.0, 0.2, 5.0, 5, 15, 6.0E7, 0L, 0.0);

   public boolean contains(BlockPos var1) {
      return (double)(var1.getX() + 1) > this.method24530()
         && (double)var1.getX() < this.method24532()
         && (double)(var1.getZ() + 1) > this.method24531()
         && (double)var1.getZ() < this.method24533();
   }

   public boolean method24524(ChunkPos var1) {
      return (double)var1.getXEnd() > this.method24530()
         && (double)var1.getX() < this.method24532()
         && (double)var1.getZEnd() > this.method24531()
         && (double)var1.getZ() < this.method24533();
   }

   public boolean method24525(AxisAlignedBB var1) {
      return var1.maxX > this.method24530()
         && var1.minX < this.method24532()
         && var1.maxZ > this.method24531()
         && var1.minZ < this.method24533();
   }

   public double method24526(Entity var1) {
      return this.method24528(var1.getPosX(), var1.getPosZ());
   }

   public VoxelShape getShape() {
      return this.field32266.getShape();
   }

   public double method24528(double var1, double var3) {
      double var7 = var3 - this.method24531();
      double var9 = this.method24533() - var3;
      double var11 = var1 - this.method24530();
      double var13 = this.method24532() - var1;
      double var15 = Math.min(var11, var13);
      var15 = Math.min(var15, var7);
      return Math.min(var15, var9);
   }

   public BorderStatus method24529() {
      return this.field32266.getStatus();
   }

   public double method24530() {
      return this.field32266.getMinX();
   }

   public double method24531() {
      return this.field32266.getMinZ();
   }

   public double method24532() {
      return this.field32266.getMaxX();
   }

   public double method24533() {
      return this.field32266.getMaxZ();
   }

   public double getCenterX() {
      return this.field32263;
   }

   public double getCenterZ() {
      return this.field32264;
   }

   public void method24536(double var1, double var3) {
      this.field32263 = var1;
      this.field32264 = var3;
      this.field32266.onCenterChanged();

      for (Class7047 var8 : this.method24542()) {
         var8.method21951(this, var1, var3);
      }
   }

   public double method24537() {
      return this.field32266.getSize();
   }

   public long method24538() {
      return this.field32266.getTimeUntilTarget();
   }

   public double method24539() {
      return this.field32266.getTargetSize();
   }

   public void method24540(double var1) {
      this.field32266 = new StationaryBorderInfo(this, var1);

      for (Class7047 var6 : this.method24542()) {
         var6.method21949(this, var1);
      }
   }

   public void method24541(double var1, double var3, long var5) {
      this.field32266 = (WorldBorderIBorderInfo)(var1 != var3 ? new Class8118(this, var1, var3, var5) : new StationaryBorderInfo(this, var3));

      for (Class7047 var10 : this.method24542()) {
         var10.method21950(this, var1, var3, var5);
      }
   }

   public List<Class7047> method24542() {
      return Lists.newArrayList(this.field32258);
   }

   public void method24543(Class7047 var1) {
      this.field32258.add(var1);
   }

   public void method24544(int var1) {
      this.worldSize = var1;
      this.field32266.onSizeChanged();
   }

   public int method24545() {
      return this.worldSize;
   }

   public double method24546() {
      return this.field32260;
   }

   public void method24547(double var1) {
      this.field32260 = var1;

      for (Class7047 var6 : this.method24542()) {
         var6.method21955(this, var1);
      }
   }

   public double method24548() {
      return this.field32259;
   }

   public void method24549(double var1) {
      this.field32259 = var1;

      for (Class7047 var6 : this.method24542()) {
         var6.method21954(this, var1);
      }
   }

   public double method24550() {
      return this.field32266.getResizeSpeed();
   }

   public int method24551() {
      return this.field32261;
   }

   public void method24552(int var1) {
      this.field32261 = var1;

      for (Class7047 var5 : this.method24542()) {
         var5.method21952(this, var1);
      }
   }

   public int method24553() {
      return this.field32262;
   }

   public void method24554(int var1) {
      this.field32262 = var1;

      for (Class7047 var5 : this.method24542()) {
         var5.method21953(this, var1);
      }
   }

   public void method24555() {
      this.field32266 = this.field32266.tick();
   }

   public Class7235 method24556() {
      return new Class7235(this);
   }

   public void method24557(Class7235 var1) {
      this.method24536(var1.method22710(), var1.method22711());
      this.method24549(var1.method22712());
      this.method24547(var1.method22713());
      this.method24554(var1.method22714());
      this.method24552(var1.method22715());
      if (var1.method22717() <= 0L) {
         this.method24540(var1.method22716());
      } else {
         this.method24541(var1.method22716(), var1.method22718(), var1.method22717());
      }
   }

   // $VF: synthetic method
   public static int getWorldBorderSize(WorldBorder worldBorder) {
      return worldBorder.worldSize;
   }
}
