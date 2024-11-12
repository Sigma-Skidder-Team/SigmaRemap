package mapped;

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

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3f;
import net.optifine.Config;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class BufferBuilder extends Class5424 implements Class5426 {
   private static final Logger field24103 = LogManager.getLogger();
   private ByteBuffer field24113;
   private final List<Class9105> field24114 = Lists.newArrayList();
   private int field24115 = 0;
   private int field24116 = 0;
   private int field24117 = 0;
   private int field24118 = 0;
   private int field24119;
   private VertexFormatElement field24120;
   private int field24121;
   private int field24122;
   private VertexFormat field24123;
   private boolean field24124;
   private boolean field24125;
   private boolean field24126;
   private RenderType field24127 = null;
   private boolean[] field24128 = new boolean[256];
   private TextureAtlasSprite[] field24129 = null;
   private TextureAtlasSprite[] field24130 = null;
   private TextureAtlasSprite field24131 = null;
   public Class7698 field24132;
   public Class8391 field24133 = null;
   public BitSet field24134 = null;
   public BitSet field24135 = new BitSet();
   private ByteBuffer field24136;
   private Vector3f field24137 = new Vector3f();
   private float[] field24138 = new float[4];
   private int[] field24139 = new int[4];
   private IntBuffer field24140;
   private FloatBuffer field24141;
   private Class7735 field24142;

   public BufferBuilder(int var1) {
      this.field24113 = GLAllocation.method22266(var1 * 4);
      this.field24140 = this.field24113.asIntBuffer();
      this.field24141 = this.field24113.asFloatBuffer();
      Class7698.method25373(this);
   }

   public void method17055() {
      this.method17056(this.field24123.getSize());
   }

   private void method17056(int var1) {
      if (this.field24117 + var1 > this.field24113.capacity()) {
         int var4 = this.field24113.capacity();
         int var5 = var4 + method17057(var1);
         field24103.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", var4, var5);
         ByteBuffer var6 = GLAllocation.method22266(var5);
         ((Buffer)this.field24113).position(0);
         var6.put(this.field24113);
         ((Buffer)var6).rewind();
         this.field24113 = var6;
         this.field24140 = this.field24113.asIntBuffer();
         this.field24141 = this.field24113.asFloatBuffer();
         if (this.field24129 != null) {
            TextureAtlasSprite[] var7 = this.field24129;
            int var8 = this.method17078();
            this.field24129 = new TextureAtlasSprite[var8];
            System.arraycopy(var7, 0, this.field24129, 0, Math.min(var7.length, this.field24129.length));
            this.field24130 = null;
         }
      }
   }

   private static int method17057(int var0) {
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

   public void method17058(float var1, float var2, float var3) {
      ((Buffer)this.field24113).clear();
      FloatBuffer var6 = this.field24113.asFloatBuffer();
      FloatBuffer var7 = var6.slice();
      int var8 = this.field24119 / 4;
      float[] var9 = new float[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = method17061(var6, var1, var2, var3, this.field24123.method26215(), this.field24116 / 4 + var10 * this.field24123.getSize());
      }

      int[] var17 = new int[var8];
      int var11 = 0;

      while (var11 < var17.length) {
         var17[var11] = var11++;
      }

      IntArrays.mergeSort(var17, (var1x, var2x) -> Floats.compare(var9[var2x], var9[var1x]));
      BitSet var18 = new BitSet();
      FloatBuffer var12 = GLAllocation.createDirectFloatBuffer(this.field24123.method26215() * 4);

      for (int var13 = var18.nextClearBit(0); var13 < var17.length; var13 = var18.nextClearBit(var13 + 1)) {
         int var14 = var17[var13];
         if (var14 != var13) {
            this.method17059(var6, var14);
            ((Buffer)var12).clear();
            var12.put(var6);
            int var15 = var14;

            for (int var16 = var17[var14]; var15 != var13; var16 = var17[var16]) {
               this.method17059(var6, var16);
               ((Buffer)var7).clear();
               ((Buffer)var7).position(var6.position());
               ((Buffer)var7).limit(var6.limit());
               this.method17059(var6, var15);
               var6.put(var7);
               var18.set(var15);
               var15 = var16;
            }

            this.method17059(var6, var13);
            ((Buffer)var12).flip();
            var6.put(var12);
         }

         var18.set(var13);
      }

      if (this.field24129 != null) {
         TextureAtlasSprite[] var19 = new TextureAtlasSprite[this.field24119 / 4];
         int var20 = this.field24123.getSize() / 4 * 4;

         for (int var21 = 0; var21 < var17.length; var21++) {
            int var22 = var17[var21];
            var19[var21] = this.field24129[var22];
         }

         System.arraycopy(var19, 0, this.field24129, 0, var19.length);
      }
   }

   private void method17059(FloatBuffer var1, int var2) {
      int var5 = this.field24123.method26215() * 4;
      ((Buffer)var1).limit(this.field24116 / 4 + (var2 + 1) * var5);
      ((Buffer)var1).position(this.field24116 / 4 + var2 * var5);
   }

   public Class9244 method17060() {
      ((Buffer)this.field24113).limit(this.field24117);
      ((Buffer)this.field24113).position(this.field24116);
      ByteBuffer var3 = ByteBuffer.allocate(this.field24119 * this.field24123.getSize());
      var3.put(this.field24113);
      ((Buffer)this.field24113).clear();
      Object var4 = null;
      if (this.field24129 != null) {
         int var5 = this.field24119 / 4;
         var4 = new TextureAtlasSprite[var5];
         System.arraycopy(this.field24129, 0, var4, 0, var5);
      }

      return new Class9244(var3, this.field24123, this.field24129);
   }

   private static float method17061(FloatBuffer var0, float var1, float var2, float var3, int var4, int var5) {
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

   public void method17062(Class9244 var1) {
      ((Buffer)Class9244.method34764(var1)).clear();
      int var4 = Class9244.method34764(var1).capacity();
      this.method17056(var4);
      ((Buffer)this.field24113).limit(this.field24113.capacity());
      ((Buffer)this.field24113).position(this.field24116);
      this.field24113.put(Class9244.method34764(var1));
      ((Buffer)this.field24113).clear();
      VertexFormat var5 = Class9244.method34765(var1);
      this.method17064(var5);
      this.field24119 = var4 / var5.getSize();
      this.field24117 = this.field24116 + this.field24119 * var5.getSize();
      if (Class9244.method34766(var1) == null) {
         if (this.field24129 != null) {
            this.field24130 = this.field24129;
         }

         this.field24129 = null;
      } else {
         if (this.field24129 == null) {
            this.field24129 = this.field24130;
         }

         if (this.field24129 == null || this.field24129.length < this.method17078()) {
            this.field24129 = new TextureAtlasSprite[this.method17078()];
         }

         TextureAtlasSprite[] var6 = Class9244.method34766(var1);
         System.arraycopy(var6, 0, this.field24129, 0, var6.length);
      }
   }

   public void begin(int var1, VertexFormat var2) {
      if (!this.field24126) {
         this.field24126 = true;
         this.field24122 = var1;
         this.method17064(var2);
         this.field24120 = (VertexFormatElement)var2.method26217().get(0);
         this.field24121 = 0;
         ((Buffer)this.field24113).clear();
         if (Config.isShaders()) {
            Class7698.method25379(this);
         }

         if (!Config.method26894()) {
            if (this.field24129 != null) {
               this.field24130 = this.field24129;
            }

            this.field24129 = null;
         } else if (this.field24127 != null) {
            if (this.field24129 == null) {
               this.field24129 = this.field24130;
            }

            if (this.field24129 == null || this.field24129.length < this.method17078()) {
               this.field24129 = new TextureAtlasSprite[this.method17078()];
            }
         }

         if (!SmartAnimations.isActive()) {
            if (this.field24134 != null) {
               this.field24134 = null;
            }
         } else {
            if (this.field24134 == null) {
               this.field24134 = this.field24135;
            }

            this.field24134.clear();
         }
      } else {
         throw new IllegalStateException("Already building!");
      }
   }

   @Override
   public IVertexBuilder tex(float var1, float var2) {
      if (this.field24131 != null && this.field24129 != null) {
         var1 = this.field24131.method7486(var1);
         var2 = this.field24131.method7487(var2);
         this.field24129[this.field24119 / 4] = this.field24131;
      }

      return Class5426.super.tex(var1, var2);
   }

   private void method17064(VertexFormat var1) {
      if (this.field24123 != var1) {
         this.field24123 = var1;
         boolean var4 = var1 == DefaultVertexFormats.ENTITY;
         boolean var5 = var1 == DefaultVertexFormats.BLOCK;
         this.field24124 = var4 || var5;
         this.field24125 = var4;
      }
   }

   public void finishDrawing() {
      if (this.field24126) {
         this.field24126 = false;
         this.field24114.add(new Class9105(this.field24123, this.field24119, this.field24122));
         this.field24116 = this.field24116 + this.field24119 * this.field24123.getSize();
         this.field24119 = 0;
         this.field24120 = null;
         this.field24121 = 0;
      } else {
         throw new IllegalStateException("Not building!");
      }
   }

   @Override
   public void method17066(int var1, byte var2) {
      this.field24113.put(this.field24117 + var1, var2);
   }

   @Override
   public void method17067(int var1, short var2) {
      this.field24113.putShort(this.field24117 + var1, var2);
   }

   @Override
   public void method17068(int var1, float var2) {
      this.field24113.putFloat(this.field24117 + var1, var2);
   }

   @Override
   public void endVertex() {
      if (this.field24121 == 0) {
         this.field24119++;
         this.method17055();
         if (Config.isShaders()) {
            Class7698.method25381(this);
         }
      } else {
         throw new IllegalStateException("Not filled all elements of the vertex");
      }
   }

   @Override
   public void method17069() {
      ImmutableList var3 = this.field24123.method26217();
      this.field24121 = (this.field24121 + 1) % var3.size();
      this.field24117 = this.field24117 + this.field24120.method28519();
      VertexFormatElement var4 = (VertexFormatElement)var3.get(this.field24121);
      this.field24120 = var4;
      if (var4.method28517() == Class2142.field14022) {
         this.method17069();
      }

      if (this.field24108 && this.field24120.method28517() == Class2142.field14020) {
         Class5426.super.color(this.field24109, this.field24110, this.field24111, this.field24112);
      }
   }

   @Override
   public IVertexBuilder color(int var1, int var2, int var3, int var4) {
      if (!this.field24108) {
         return Class5426.super.color(var1, var2, var3, var4);
      } else {
         throw new IllegalStateException();
      }
   }

   @Override
   public void method17032(
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
      if (!this.field24108) {
         if (!this.field24124) {
            super.method17032(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
         } else {
            this.method17068(0, var1);
            this.method17068(4, var2);
            this.method17068(8, var3);
            this.method17066(12, (byte)((int)(var4 * 255.0F)));
            this.method17066(13, (byte)((int)(var5 * 255.0F)));
            this.method17066(14, (byte)((int)(var6 * 255.0F)));
            this.method17066(15, (byte)((int)(var7 * 255.0F)));
            this.method17068(16, var8);
            this.method17068(20, var9);
            byte var17;
            if (!this.field24125) {
               var17 = 24;
            } else {
               this.method17067(24, (short)(var10 & 65535));
               this.method17067(26, (short)(var10 >> 16 & 65535));
               var17 = 28;
            }

            this.method17067(var17 + 0, (short)(var11 & 65535));
            this.method17067(var17 + 2, (short)(var11 >> 16 & 65535));
            this.method17066(var17 + 4, Class5426.method17094(var12));
            this.method17066(var17 + 5, Class5426.method17094(var13));
            this.method17066(var17 + 6, Class5426.method17094(var14));
            this.field24117 = this.field24117 + this.field24123.getSize();
            this.endVertex();
         }
      } else {
         throw new IllegalStateException();
      }
   }

   public Pair<Class9105, ByteBuffer> method17070() {
      Class9105 var3 = this.field24114.get(this.field24115++);
      ((Buffer)this.field24113).position(this.field24118);
      this.field24118 = this.field24118 + var3.method33952() * var3.method33951().getSize();
      ((Buffer)this.field24113).limit(this.field24118);
      if (this.field24115 == this.field24114.size() && this.field24119 == 0) {
         this.reset();
      }

      ByteBuffer var4 = this.field24113.slice();
      var4.order(this.field24113.order());
      ((Buffer)this.field24113).clear();
      if (Class9105.method33954(var3) == 7 && Config.method26989()) {
         if (this.field24136 == null) {
            this.field24136 = GLAllocation.method22266(this.field24113.capacity() * 2);
         }

         if (this.field24136.capacity() < this.field24113.capacity() * 2) {
            this.field24136 = GLAllocation.method22266(this.field24113.capacity() * 2);
         }

         VertexFormat var5 = var3.method33951();
         int var6 = var3.method33952();
         method17079(var4, var5, var6, this.field24136);
         int var7 = var6 * 6 / 4;
         Class9105 var8 = new Class9105(var5, var7, 4);
         return Pair.of(var8, this.field24136);
      } else {
         return Pair.of(var3, var4);
      }
   }

   public void reset() {
      if (this.field24116 != this.field24118) {
         field24103.warn("Bytes mismatch " + this.field24116 + " " + this.field24118);
      }

      this.method17072();
   }

   public void method17072() {
      this.field24116 = 0;
      this.field24118 = 0;
      this.field24117 = 0;
      this.field24114.clear();
      this.field24115 = 0;
      this.field24131 = null;
   }

   @Override
   public VertexFormatElement method17073() {
      if (this.field24120 != null) {
         return this.field24120;
      } else {
         throw new IllegalStateException("BufferBuilder not started");
      }
   }

   public boolean method17074() {
      return this.field24126;
   }

   @Override
   public void method17042(TextureAtlasSprite var1) {
      if (this.field24134 != null && var1 != null && var1.method7496() && var1.method7477() >= 0) {
         this.field24134.set(var1.method7477());
      }

      if (this.field24129 != null) {
         int var4 = this.field24119 / 4;
         this.field24129[var4 - 1] = var1;
      }
   }

   @Override
   public void method17043(TextureAtlasSprite var1) {
      if (this.field24134 != null && var1 != null && var1.method7496() && var1.method7477() >= 0) {
         this.field24134.set(var1.method7477());
      }

      if (this.field24129 != null) {
         this.field24131 = var1;
      }
   }

   @Override
   public boolean method17024() {
      return this.field24129 != null;
   }

   public void method17075() {
      if (this.field24129 != null) {
         int var3 = Config.getTextureMap().method1109();
         if (this.field24128.length <= var3) {
            this.field24128 = new boolean[var3 + 1];
         }

         Arrays.fill(this.field24128, false);
         int var4 = 0;
         int var5 = -1;
         int var6 = this.field24119 / 4;

         for (int var7 = 0; var7 < var6; var7++) {
            TextureAtlasSprite var8 = this.field24129[var7];
            if (var8 != null) {
               int var9 = var8.method7475();
               if (!this.field24128[var9]) {
                  if (var8 != Class8684.field39187) {
                     var7 = this.method17076(var8, var7) - 1;
                     var4++;
                     if (this.field24127 != Class9025.field41291) {
                        this.field24128[var9] = true;
                     }
                  } else if (var5 < 0) {
                     var5 = var7;
                  }
               }
            }
         }

         if (var5 >= 0) {
            this.method17076(Class8684.field39187, var5);
            var4++;
         }

         if (var4 <= 0) {
         }
      }
   }

   private int method17076(TextureAtlasSprite var1, int var2) {
      GL11.glBindTexture(3553, var1.field9344);
      int var5 = -1;
      int var6 = -1;
      int var7 = this.field24119 / 4;

      for (int var8 = var2; var8 < var7; var8++) {
         TextureAtlasSprite var9 = this.field24129[var8];
         if (var9 != var1) {
            if (var6 >= 0) {
               this.method17077(var6, var8);
               if (this.field24127 == Class9025.field41291) {
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
         this.method17077(var6, var7);
      }

      if (var5 < 0) {
         var5 = var7;
      }

      return var5;
   }

   private void method17077(int var1, int var2) {
      int var5 = var2 - var1;
      if (var5 > 0) {
         int var6 = var1 * 4;
         int var7 = var5 * 4;
         GL11.glDrawArrays(this.field24122, var6, var7);
      }
   }

   @Override
   public void method17044(RenderType var1) {
      this.field24127 = var1;
      if (var1 == null) {
         if (this.field24129 != null) {
            this.field24130 = this.field24129;
         }

         this.field24129 = null;
         this.field24131 = null;
      }
   }

   private int method17078() {
      return this.field24113.capacity() / this.field24123.getSize();
   }

   @Override
   public Class8391 method17022(BlockState var1, BlockPos var2) {
      if (this.field24133 != null) {
         this.field24133.reset(var1, var2);
         return this.field24133;
      } else {
         this.field24133 = new Class8391(var1, var2);
         return this.field24133;
      }
   }

   @Override
   public RenderType method17023() {
      return this.field24127;
   }

   private static void method17079(ByteBuffer var0, VertexFormat var1, int var2, ByteBuffer var3) {
      int var6 = var1.getSize();
      int var7 = var0.limit();
      ((Buffer)var0).rewind();
      ((Buffer)var3).clear();

      for (int var8 = 0; var8 < var2; var8 += 4) {
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

   public int method17080() {
      return this.field24122;
   }

   public int method17081() {
      return this.field24119;
   }

   @Override
   public Vector3f method17045(Vector3f var1) {
      this.field24137.method25275(var1.method25269(), var1.method25270(), var1.method25271());
      return this.field24137;
   }

   @Override
   public Vector3f method17046(float var1, float var2, float var3) {
      this.field24137.method25275(var1, var2, var3);
      return this.field24137;
   }

   @Override
   public float[] method17047(float var1, float var2, float var3, float var4) {
      this.field24138[0] = var1;
      this.field24138[1] = var2;
      this.field24138[2] = var3;
      this.field24138[3] = var4;
      return this.field24138;
   }

   @Override
   public int[] method17048(int var1, int var2, int var3, int var4) {
      this.field24139[0] = var1;
      this.field24139[1] = var2;
      this.field24139[2] = var3;
      this.field24139[3] = var4;
      return this.field24139;
   }

   public ByteBuffer method17082() {
      return this.field24113;
   }

   public FloatBuffer method17083() {
      return this.field24141;
   }

   public IntBuffer method17084() {
      return this.field24140;
   }

   public int method17085() {
      return this.field24119 * this.field24123.method26215();
   }

   @Override
   public Class7735 method17049() {
      return this.field24142;
   }

   public void method17086(Class7735 var1) {
      this.field24142 = var1;
   }

   public void method17087(float var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9, int var10, int var11) {
      if (this.field24123.getSize() == DefaultVertexFormats.POSITION_COLOR_TEX_LIGHTMAP.getSize()) {
         this.method17068(0, var1);
         this.method17068(4, var2);
         this.method17068(8, var3);
         this.method17066(12, (byte)var4);
         this.method17066(13, (byte)var5);
         this.method17066(14, (byte)var6);
         this.method17066(15, (byte)var7);
         this.method17068(16, var8);
         this.method17068(20, var9);
         this.method17067(24, (short)var10);
         this.method17067(26, (short)var11);
         this.field24117 = this.field24117 + this.field24123.getSize();
         this.endVertex();
      } else {
         throw new IllegalStateException("Invalid text vertex format: " + this.field24123);
      }
   }

   public void method17088(ByteBuffer var1) {
      if (Config.isShaders()) {
         Class7698.method25383(this, var1);
      }

      this.method17056(var1.limit() + this.field24123.getSize());
      ((Buffer)this.field24113).position(this.field24119 * this.field24123.getSize());
      this.field24113.put(var1);
      this.field24119 = this.field24119 + var1.limit() / this.field24123.getSize();
      this.field24117 = this.field24117 + var1.limit();
      if (Config.isShaders()) {
         Class7698.method25384(this);
      }
   }

   public VertexFormat method17089() {
      return this.field24123;
   }

   public int method17090() {
      return this.field24116;
   }

   public int method17091() {
      return this.field24116 / 4;
   }
}
