package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import net.minecraft.entity.Entity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public class Class8238 {
   private final List<Class7176> field35368;
   private Class7176[] field35369 = new Class7176[0];
   private Class7176[] field35370 = new Class7176[0];
   private Set<Class7175> field35371;
   private int field35372;
   private final BlockPos field35373;
   private final float field35374;
   private final boolean field35375;

   public Class8238(List<Class7176> var1, BlockPos var2, boolean var3) {
      this.field35368 = var1;
      this.field35373 = var2;
      this.field35374 = !var1.isEmpty() ? this.field35368.get(this.field35368.size() - 1).method22530(this.field35373) : Float.MAX_VALUE;
      this.field35375 = var3;
   }

   public void method28691() {
      this.field35372++;
   }

   public boolean method28692() {
      return this.field35372 <= 0;
   }

   public boolean method28693() {
      return this.field35372 >= this.field35368.size();
   }

   @Nullable
   public Class7176 method28694() {
      return this.field35368.isEmpty() ? null : this.field35368.get(this.field35368.size() - 1);
   }

   public Class7176 method28695(int var1) {
      return this.field35368.get(var1);
   }

   public void method28696(int var1) {
      if (this.field35368.size() > var1) {
         this.field35368.subList(var1, this.field35368.size()).clear();
      }
   }

   public void method28697(int var1, Class7176 var2) {
      this.field35368.set(var1, var2);
   }

   public int method28698() {
      return this.field35368.size();
   }

   public int method28699() {
      return this.field35372;
   }

   public void method28700(int var1) {
      this.field35372 = var1;
   }

   public Vector3d method28701(Entity var1, int var2) {
      Class7176 var5 = this.field35368.get(var2);
      double var6 = (double)var5.field30847 + (double)((int)(var1.getWidth() + 1.0F)) * 0.5;
      double var8 = (double)var5.field30848;
      double var10 = (double)var5.field30849 + (double)((int)(var1.getWidth() + 1.0F)) * 0.5;
      return new Vector3d(var6, var8, var10);
   }

   public BlockPos method28702(int var1) {
      return this.field35368.get(var1).method22531();
   }

   public Vector3d method28703(Entity var1) {
      return this.method28701(var1, this.field35372);
   }

   public BlockPos method28704() {
      return this.field35368.get(this.field35372).method22531();
   }

   public Class7176 method28705() {
      return this.field35368.get(this.field35372);
   }

   @Nullable
   public Class7176 method28706() {
      return this.field35372 <= 0 ? null : this.field35368.get(this.field35372 - 1);
   }

   public boolean method28707(Class8238 var1) {
      if (var1 == null) {
         return false;
      } else if (var1.field35368.size() != this.field35368.size()) {
         return false;
      } else {
         for (int var4 = 0; var4 < this.field35368.size(); var4++) {
            Class7176 var5 = this.field35368.get(var4);
            Class7176 var6 = var1.field35368.get(var4);
            if (var5.field30847 != var6.field30847 || var5.field30848 != var6.field30848 || var5.field30849 != var6.field30849) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method28708() {
      return this.field35375;
   }

   public Class7176[] method28709() {
      return this.field35369;
   }

   public Class7176[] method28710() {
      return this.field35370;
   }

   public static Class8238 method28711(PacketBuffer var0) {
      boolean var3 = var0.readBoolean();
      int var4 = var0.readInt();
      int var5 = var0.readInt();
      HashSet var6 = Sets.newHashSet();

      for (int var7 = 0; var7 < var5; var7++) {
         var6.add(Class7175.method22524(var0));
      }

      BlockPos var13 = new BlockPos(var0.readInt(), var0.readInt(), var0.readInt());
      ArrayList var8 = Lists.newArrayList();
      int var9 = var0.readInt();

      for (int var10 = 0; var10 < var9; var10++) {
         var8.add(Class7176.method22533(var0));
      }

      Class7176[] var14 = new Class7176[var0.readInt()];

      for (int var11 = 0; var11 < var14.length; var11++) {
         var14[var11] = Class7176.method22533(var0);
      }

      Class7176[] var15 = new Class7176[var0.readInt()];

      for (int var12 = 0; var12 < var15.length; var12++) {
         var15[var12] = Class7176.method22533(var0);
      }

      Class8238 var16 = new Class8238(var8, var13, var3);
      var16.field35369 = var14;
      var16.field35370 = var15;
      var16.field35371 = var6;
      var16.field35372 = var4;
      return var16;
   }

   @Override
   public String toString() {
      return "Path(length=" + this.field35368.size() + ")";
   }

   public BlockPos method28712() {
      return this.field35373;
   }

   public float method28713() {
      return this.field35374;
   }
}
