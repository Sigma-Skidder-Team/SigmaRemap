package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrays;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class class_9633 extends class_7690 implements class_5359 {
   private static final Logger field_49065 = LogManager.getLogger();
   private ByteBuffer field_49080;
   private final List<class_7025> field_49085 = Lists.newArrayList();
   private int field_49064 = 0;
   private int field_49083 = 0;
   private int field_49088 = 0;
   private int field_49070 = 0;
   private int field_49069;
   private class_3884 field_49067;
   private int field_49076;
   private int field_49077;
   private class_2868 field_49074;
   private boolean field_49072;
   private boolean field_49066;
   private boolean field_49068;
   private RenderLayer field_49079 = null;
   private boolean[] field_49081 = new boolean[256];
   private class_5155[] field_49075 = null;
   private class_5155[] field_49089 = null;
   private class_5155 field_49071 = null;
   public class_2448 field_49082;
   public class_4460 field_49073 = null;
   public BitSet field_49059 = null;
   public BitSet field_49058 = new BitSet();
   private ByteBuffer field_49061;
   private class_2426 field_49060 = new class_2426();
   private float[] field_49084 = new float[4];
   private int[] field_49063 = new int[4];
   private IntBuffer field_49078;
   private FloatBuffer field_49087;
   private class_3758 field_49062;

   public class_9633(int var1) {
      this.field_49080 = class_1423.method_6528(var1 * 4);
      this.field_49078 = this.field_49080.asIntBuffer();
      this.field_49087 = this.field_49080.asFloatBuffer();
      class_2448.method_11188(this);
   }

   public void method_44475() {
      this.method_44476(this.field_49074.method_13168());
   }

   private void method_44476(int var1) {
      if (this.field_49088 + var1 > this.field_49080.capacity()) {
         int var4 = this.field_49080.capacity();
         int var5 = var4 + method_44456(var1);
         field_49065.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", var4, var5);
         ByteBuffer var6 = class_1423.method_6528(var5);
         ((Buffer)this.field_49080).position(0);
         var6.put(this.field_49080);
         ((Buffer)var6).rewind();
         this.field_49080 = var6;
         this.field_49078 = this.field_49080.asIntBuffer();
         this.field_49087 = this.field_49080.asFloatBuffer();
         if (this.field_49075 != null) {
            class_5155[] var7 = this.field_49075;
            int var8 = this.method_44467();
            this.field_49075 = new class_5155[var8];
            System.arraycopy(var7, 0, this.field_49075, 0, Math.min(var7.length, this.field_49075.length));
            this.field_49089 = null;
         }
      }
   }

   private static int method_44456(int var0) {
      int var3 = 2097152;
      if (var0 != 0) {
         if (var0 < 0) {
            var3 *= -1;
         }

         int var4 = var0 % var3;
         return var4 != 0 ? var0 + var3 - var4 : var0;
      } else {
         return var3;
      }
   }

   public void method_44482(float var1, float var2, float var3) {
      ((Buffer)this.field_49080).clear();
      FloatBuffer var6 = this.field_49080.asFloatBuffer();
      FloatBuffer var7 = var6.slice();
      int var8 = this.field_49069 / 4;
      float[] var9 = new float[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = method_44483(var6, var1, var2, var3, this.field_49074.method_13180(), this.field_49083 / 4 + var10 * this.field_49074.method_13168());
      }

      int[] var17 = new int[var8];
      int var11 = 0;

      while (var11 < var17.length) {
         var17[var11] = var11++;
      }

      IntArrays.mergeSort(var17, (var1x, var2x) -> Floats.compare(var9[var2x], var9[var1x]));
      BitSet var18 = new BitSet();
      FloatBuffer var12 = class_1423.method_6529(this.field_49074.method_13180() * 4);

      for (int var13 = var18.nextClearBit(0); var13 < var17.length; var13 = var18.nextClearBit(var13 + 1)) {
         int var14 = var17[var13];
         if (var14 != var13) {
            this.method_44461(var6, var14);
            ((Buffer)var12).clear();
            var12.put(var6);
            int var15 = var14;

            for (int var16 = var17[var14]; var15 != var13; var16 = var17[var16]) {
               this.method_44461(var6, var16);
               ((Buffer)var7).clear();
               ((Buffer)var7).position(var6.position());
               ((Buffer)var7).limit(var6.limit());
               this.method_44461(var6, var15);
               var6.put(var7);
               var18.set(var15);
               var15 = var16;
            }

            this.method_44461(var6, var13);
            ((Buffer)var12).flip();
            var6.put(var12);
         }

         var18.set(var13);
      }

      if (this.field_49075 != null) {
         class_5155[] var19 = new class_5155[this.field_49069 / 4];
         int var20 = this.field_49074.method_13168() / 4 * 4;

         for (int var21 = 0; var21 < var17.length; var21++) {
            int var22 = var17[var21];
            var19[var21] = this.field_49075[var22];
         }

         System.arraycopy(var19, 0, this.field_49075, 0, var19.length);
      }
   }

   private void method_44461(FloatBuffer var1, int var2) {
      int var5 = this.field_49074.method_13180() * 4;
      ((Buffer)var1).limit(this.field_49083 / 4 + (var2 + 1) * var5);
      ((Buffer)var1).position(this.field_49083 / 4 + var2 * var5);
   }

   public class_7649 method_44484() {
      ((Buffer)this.field_49080).limit(this.field_49088);
      ((Buffer)this.field_49080).position(this.field_49083);
      ByteBuffer var3 = ByteBuffer.allocate(this.field_49069 * this.field_49074.method_13168());
      var3.put(this.field_49080);
      ((Buffer)this.field_49080).clear();
      Object var4 = null;
      if (this.field_49075 != null) {
         int var5 = this.field_49069 / 4;
         var4 = new class_5155[var5];
         System.arraycopy(this.field_49075, 0, var4, 0, var5);
      }

      return new class_7649(var3, this.field_49074, this.field_49075);
   }

   private static float method_44483(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
      float var8 = var0.get(var5 + var4 * 0 + 0);
      float var9 = var0.get(var5 + var4 * 0 + 1);
      float var10 = var0.get(var5 + var4 * 0 + 2);
      float var11 = var0.get(var5 + var4 * 1 + 0);
      float var12 = var0.get(var5 + var4 * 1 + 1);
      float var13 = var0.get(var5 + var4 * 1 + 2);
      float var14 = var0.get(var5 + var4 * 2 + 0);
      float var15 = var0.get(var5 + var4 * 2 + 1);
      float var16 = var0.get(var5 + var4 * 2 + 2);
      float var17 = var0.get(var5 + var4 * 3 + 0);
      float var18 = var0.get(var5 + var4 * 3 + 1);
      float var19 = var0.get(var5 + var4 * 3 + 2);
      float var20 = (var8 + var11 + var14 + var17) * 0.25F - var1;
      float var21 = (var9 + var12 + var15 + var18) * 0.25F - var2;
      float var22 = (var10 + var13 + var16 + var19) * 0.25F - var3;
      return var20 * var20 + var21 * var21 + var22 * var22;
   }

   public void method_44477(class_7649 var1) {
      ((Buffer)class_7649.method_34648(var1)).clear();
      int var4 = class_7649.method_34648(var1).capacity();
      this.method_44476(var4);
      ((Buffer)this.field_49080).limit(this.field_49080.capacity());
      ((Buffer)this.field_49080).position(this.field_49083);
      this.field_49080.put(class_7649.method_34648(var1));
      ((Buffer)this.field_49080).clear();
      class_2868 var5 = class_7649.method_34646(var1);
      this.method_44479(var5);
      this.field_49069 = var4 / var5.method_13168();
      this.field_49088 = this.field_49083 + this.field_49069 * var5.method_13168();
      if (class_7649.method_34645(var1) == null) {
         if (this.field_49075 != null) {
            this.field_49089 = this.field_49075;
         }

         this.field_49075 = null;
      } else {
         if (this.field_49075 == null) {
            this.field_49075 = this.field_49089;
         }

         if (this.field_49075 == null || this.field_49075.length < this.method_44467()) {
            this.field_49075 = new class_5155[this.method_44467()];
         }

         class_5155[] var6 = class_7649.method_34645(var1);
         System.arraycopy(var6, 0, this.field_49075, 0, var6.length);
      }
   }

   public void method_44471(int var1, class_2868 var2) {
      if (!this.field_49068) {
         this.field_49068 = true;
         this.field_49077 = var1;
         this.method_44479(var2);
         this.field_49067 = (class_3884)var2.method_13174().get(0);
         this.field_49076 = 0;
         ((Buffer)this.field_49080).clear();
         if (Config.method_14424()) {
            class_2448.method_11199(this);
         }

         if (!Config.method_14405()) {
            if (this.field_49075 != null) {
               this.field_49089 = this.field_49075;
            }

            this.field_49075 = null;
         } else if (this.field_49079 != null) {
            if (this.field_49075 == null) {
               this.field_49075 = this.field_49089;
            }

            if (this.field_49075 == null || this.field_49075.length < this.method_44467()) {
               this.field_49075 = new class_5155[this.method_44467()];
            }
         }

         if (!class_153.method_611()) {
            if (this.field_49059 != null) {
               this.field_49059 = null;
            }
         } else {
            if (this.field_49059 == null) {
               this.field_49059 = this.field_49058;
            }

            this.field_49059.clear();
         }
      } else {
         throw new IllegalStateException("Already building!");
      }
   }

   @Override
   public class_7907 method_35745(float var1, float var2) {
      if (this.field_49071 != null && this.field_49075 != null) {
         var1 = this.field_49071.method_23592(var1);
         var2 = this.field_49071.method_23626(var2);
         this.field_49075[this.field_49069 / 4] = this.field_49071;
      }

      return class_5359.super.method_35745(var1, var2);
   }

   private void method_44479(class_2868 var1) {
      if (this.field_49074 != var1) {
         this.field_49074 = var1;
         boolean var4 = var1 == class_7985.field_40906;
         boolean var5 = var1 == class_7985.field_40918;
         this.field_49072 = var4 || var5;
         this.field_49066 = var4;
      }
   }

   public void method_44487() {
      if (this.field_49068) {
         this.field_49068 = false;
         this.field_49085.add(new class_7025(this.field_49074, this.field_49069, this.field_49077, null));
         this.field_49083 = this.field_49083 + this.field_49069 * this.field_49074.method_13168();
         this.field_49069 = 0;
         this.field_49067 = null;
         this.field_49076 = 0;
      } else {
         throw new IllegalStateException("Not building!");
      }
   }

   @Override
   public void method_24460(int var1, byte var2) {
      this.field_49080.put(this.field_49088 + var1, var2);
   }

   @Override
   public void method_24463(int var1, short var2) {
      this.field_49080.putShort(this.field_49088 + var1, var2);
   }

   @Override
   public void method_24458(int var1, float var2) {
      this.field_49080.putFloat(this.field_49088 + var1, var2);
   }

   @Override
   public void method_35735() {
      if (this.field_49076 == 0) {
         this.field_49069++;
         this.method_44475();
         if (Config.method_14424()) {
            class_2448.method_11198(this);
         }
      } else {
         throw new IllegalStateException("Not filled all elements of the vertex");
      }
   }

   @Override
   public void method_24457() {
      ImmutableList var3 = this.field_49074.method_13174();
      this.field_49076 = (this.field_49076 + 1) % var3.size();
      this.field_49088 = this.field_49088 + this.field_49067.method_17961();
      class_3884 var4 = (class_3884)var3.get(this.field_49076);
      this.field_49067 = var4;
      if (var4.method_17959() == class_9783.field_49654) {
         this.method_24457();
      }

      if (this.field_39058 && this.field_49067.method_17959() == class_9783.field_49652) {
         class_5359.super.method_35743(this.field_39056, this.field_39059, this.field_39057, this.field_39055);
      }
   }

   @Override
   public class_7907 method_35743(int var1, int var2, int var3, int var4) {
      if (!this.field_39058) {
         return class_5359.super.method_35743(var1, var2, var3, var4);
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void method_35744(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      if (!this.field_39058) {
         if (!this.field_49072) {
            super.method_35744(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         } else {
            this.method_24458(0, var1);
            this.method_24458(4, var2);
            this.method_24458(8, var3);
            this.method_24460(12, (byte)((int)(var4 * 255.0F)));
            this.method_24460(13, (byte)((int)(var5 * 255.0F)));
            this.method_24460(14, (byte)((int)(var6 * 255.0F)));
            this.method_24460(15, (byte)((int)(var7 * 255.0F)));
            this.method_24458(16, var8);
            this.method_24458(20, var9);
            byte var17;
            if (!this.field_49066) {
               var17 = 24;
            } else {
               this.method_24463(24, (short)(var10 & 65535));
               this.method_24463(26, (short)(var10 >> 16 & 65535));
               var17 = 28;
            }

            this.method_24463(var17 + 0, (short)(var11 & 65535));
            this.method_24463(var17 + 2, (short)(var11 >> 16 & 65535));
            this.method_24460(var17 + 4, class_5359.method_24459(var12));
            this.method_24460(var17 + 5, class_5359.method_24459(var13));
            this.method_24460(var17 + 6, class_5359.method_24459(var14));
            this.field_49088 = this.field_49088 + this.field_49074.method_13168();
            this.method_35735();
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public Pair<class_7025, ByteBuffer> method_44462() {
      class_7025 var3 = this.field_49085.get(this.field_49064++);
      ((Buffer)this.field_49080).position(this.field_49070);
      this.field_49070 = this.field_49070 + var3.method_32052() * var3.method_32048().method_13168();
      ((Buffer)this.field_49080).limit(this.field_49070);
      if (this.field_49064 == this.field_49085.size() && this.field_49069 == 0) {
         this.method_44463();
      }

      ByteBuffer var4 = this.field_49080.slice();
      var4.order(this.field_49080.order());
      ((Buffer)this.field_49080).clear();
      if (class_7025.method_32049(var3) == 7 && Config.method_14236()) {
         if (this.field_49061 == null) {
            this.field_49061 = class_1423.method_6528(this.field_49080.capacity() * 2);
         }

         if (this.field_49061.capacity() < this.field_49080.capacity() * 2) {
            this.field_49061 = class_1423.method_6528(this.field_49080.capacity() * 2);
         }

         class_2868 var5 = var3.method_32048();
         int var6 = var3.method_32052();
         method_44473(var4, var5, var6, this.field_49061);
         int var7 = var6 * 6 / 4;
         class_7025 var8 = new class_7025(var5, var7, 4, null);
         return Pair.of(var8, this.field_49061);
      } else {
         return Pair.of(var3, var4);
      }
   }

   public void method_44463() {
      if (this.field_49083 != this.field_49070) {
         field_49065.warn("Bytes mismatch " + this.field_49083 + " " + this.field_49070);
      }

      this.method_44460();
   }

   public void method_44460() {
      this.field_49083 = 0;
      this.field_49070 = 0;
      this.field_49088 = 0;
      this.field_49085.clear();
      this.field_49064 = 0;
      this.field_49071 = null;
   }

   @Override
   public class_3884 method_24462() {
      if (this.field_49067 != null) {
         return this.field_49067;
      } else {
         throw new IllegalStateException("BufferBuilder not started");
      }
   }

   public boolean method_44474() {
      return this.field_49068;
   }

   @Override
   public void method_35734(class_5155 var1) {
      if (this.field_49059 != null && var1 != null && var1.method_23596() && var1.method_23612() >= 0) {
         this.field_49059.set(var1.method_23612());
      }

      if (this.field_49075 != null) {
         int var4 = this.field_49069 / 4;
         this.field_49075[var4 - 1] = var1;
      }
   }

   @Override
   public void method_35752(class_5155 var1) {
      if (this.field_49059 != null && var1 != null && var1.method_23596() && var1.method_23612() >= 0) {
         this.field_49059.set(var1.method_23612());
      }

      if (this.field_49075 != null) {
         this.field_49071 = var1;
      }
   }

   @Override
   public boolean method_35740() {
      return this.field_49075 != null;
   }

   public void method_44485() {
      if (this.field_49075 != null) {
         int var3 = Config.method_14295().method_38525();
         if (this.field_49081.length <= var3) {
            this.field_49081 = new boolean[var3 + 1];
         }

         Arrays.fill(this.field_49081, false);
         int var4 = 0;
         int var5 = -1;
         int var6 = this.field_49069 / 4;

         for (int var7 = 0; var7 < var6; var7++) {
            class_5155 var8 = this.field_49075[var7];
            if (var8 != null) {
               int var9 = var8.method_23624();
               if (!this.field_49081[var9]) {
                  if (var8 != class_5525.field_28130) {
                     var7 = this.method_44468(var8, var7) - 1;
                     var4++;
                     if (this.field_49079 != class_6727.field_34740) {
                        this.field_49081[var9] = true;
                     }
                  } else if (var5 < 0) {
                     var5 = var7;
                  }
               }
            }
         }

         if (var5 >= 0) {
            this.method_44468(class_5525.field_28130, var5);
            var4++;
         }

         if (var4 <= 0) {
         }
      }
   }

   private int method_44468(class_5155 var1, int var2) {
      GL11.glBindTexture(3553, var1.field_26559);
      int var5 = -1;
      int var6 = -1;
      int var7 = this.field_49069 / 4;

      for (int var8 = var2; var8 < var7; var8++) {
         class_5155 var9 = this.field_49075[var8];
         if (var9 != var1) {
            if (var6 >= 0) {
               this.method_44486(var6, var8);
               if (this.field_49079 == class_6727.field_34740) {
                  return var8;
               }

               var6 = -1;
               if (var5 < 0) {
                  var5 = var8;
               }
            }
         } else if (var6 < 0) {
            var6 = var8;
         }
      }

      if (var6 >= 0) {
         this.method_44486(var6, var7);
      }

      if (var5 < 0) {
         var5 = var7;
      }

      return var5;
   }

   private void method_44486(int var1, int var2) {
      int var5 = var2 - var1;
      if (var5 > 0) {
         int var6 = var1 * 4;
         int var7 = var5 * 4;
         GL11.glDrawArrays(this.field_49077, var6, var7);
      }
   }

   @Override
   public void method_35736(RenderLayer var1) {
      this.field_49079 = var1;
      if (var1 == null) {
         if (this.field_49075 != null) {
            this.field_49089 = this.field_49075;
         }

         this.field_49075 = null;
         this.field_49071 = null;
      }
   }

   private int method_44467() {
      return this.field_49080.capacity() / this.field_49074.method_13168();
   }

   @Override
   public class_4460 method_35749(class_2522 var1, BlockPos var2) {
      if (this.field_49073 != null) {
         this.field_49073.method_20678(var1, var2);
         return this.field_49073;
      } else {
         this.field_49073 = new class_4460(var1, var2);
         return this.field_49073;
      }
   }

   @Override
   public RenderLayer method_35760() {
      return this.field_49079;
   }

   private static void method_44473(ByteBuffer var0, class_2868 var1, int var2, ByteBuffer var3) {
      int var6 = var1.method_13168();
      int var7 = var0.limit();
      ((Buffer)var0).rewind();
      ((Buffer)var3).clear();

      for (byte var8 = 0; var8 < var2; var8 += 4) {
         ((Buffer)var0).limit((var8 + 3) * var6);
         ((Buffer)var0).position(var8 * var6);
         var3.put(var0);
         ((Buffer)var0).limit((var8 + 1) * var6);
         ((Buffer)var0).position(var8 * var6);
         var3.put(var0);
         ((Buffer)var0).limit((var8 + 2 + 2) * var6);
         ((Buffer)var0).position((var8 + 2) * var6);
         var3.put(var0);
      }

      ((Buffer)var0).limit(var7);
      ((Buffer)var0).rewind();
      ((Buffer)var3).flip();
   }

   public int method_44472() {
      return this.field_49077;
   }

   public int method_44478() {
      return this.field_49069;
   }

   @Override
   public class_2426 method_35754(class_2426 var1) {
      this.field_49060.method_11065(var1.method_11057(), var1.method_11061(), var1.method_11055());
      return this.field_49060;
   }

   @Override
   public class_2426 method_35753(float var1, float var2, float var3) {
      this.field_49060.method_11065(var1, var2, var3);
      return this.field_49060;
   }

   @Override
   public float[] method_35746(float var1, float var2, float var3, float var4) {
      this.field_49084[0] = var1;
      this.field_49084[1] = var2;
      this.field_49084[2] = var3;
      this.field_49084[3] = var4;
      return this.field_49084;
   }

   @Override
   public int[] method_35739(int var1, int var2, int var3, int var4) {
      this.field_49063[0] = var1;
      this.field_49063[1] = var2;
      this.field_49063[2] = var3;
      this.field_49063[3] = var4;
      return this.field_49063;
   }

   public ByteBuffer method_44465() {
      return this.field_49080;
   }

   public FloatBuffer method_44464() {
      return this.field_49087;
   }

   public IntBuffer method_44469() {
      return this.field_49078;
   }

   public int method_44457() {
      return this.field_49069 * this.field_49074.method_13180();
   }

   @Override
   public class_3758 method_35733() {
      return this.field_49062;
   }

   public void method_44470(class_3758 var1) {
      this.field_49062 = var1;
   }

   public void method_44481(float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      if (this.field_49074.method_13168() == class_7985.field_40904.method_13168()) {
         this.method_24458(0, var1);
         this.method_24458(4, var2);
         this.method_24458(8, var3);
         this.method_24460(12, (byte)var4);
         this.method_24460(13, (byte)var5);
         this.method_24460(14, (byte)var6);
         this.method_24460(15, (byte)var7);
         this.method_24458(16, var8);
         this.method_24458(20, var9);
         this.method_24463(24, (short)var10);
         this.method_24463(26, (short)var11);
         this.field_49088 = this.field_49088 + this.field_49074.method_13168();
         this.method_35735();
      } else {
         throw new IllegalStateException("Invalid text vertex format: " + this.field_49074);
      }
   }

   public void method_44480(ByteBuffer var1) {
      if (Config.method_14424()) {
         class_2448.method_11196(this, var1);
      }

      this.method_44476(var1.limit() + this.field_49074.method_13168());
      ((Buffer)this.field_49080).position(this.field_49069 * this.field_49074.method_13168());
      this.field_49080.put(var1);
      this.field_49069 = this.field_49069 + var1.limit() / this.field_49074.method_13168();
      this.field_49088 = this.field_49088 + var1.limit();
      if (Config.method_14424()) {
         class_2448.method_11187(this);
      }
   }

   public class_2868 method_44458() {
      return this.field_49074;
   }

   public int method_44459() {
      return this.field_49083;
   }

   public int method_44466() {
      return this.field_49083 / 4;
   }
}
