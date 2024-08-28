package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class Class5646 {
   public static final Codec<Class5646> field24984 = Registry.field16136.dispatchStable(Class5646::method17790, Function.identity());
   public final Class1685 field24985;
   public final Class1685 field24986;
   private final Class9763 field24987;
   private final long field24988;
   private final List<Class7481> field24989 = Lists.newArrayList();

   public Class5646(Class1685 var1, Class9763 var2) {
      this(var1, var1, var2, 0L);
   }

   public Class5646(Class1685 var1, Class1685 var2, Class9763 var3, long var4) {
      this.field24985 = var1;
      this.field24986 = var2;
      this.field24987 = var3;
      this.field24988 = var4;
   }

   private void method17817() {
      if (this.field24989.isEmpty()) {
         Class9245 var3 = this.field24987.method38382();
         if (var3 != null && var3.method34769() != 0) {
            ArrayList var4 = Lists.newArrayList();

            for (Biome var6 : this.field24985.method7201()) {
               if (var6.method32507().method24277(Structure.field18067)) {
                  var4.add(var6);
               }
            }

            int var19 = var3.method34767();
            int var20 = var3.method34769();
            int var7 = var3.method34768();
            Random var8 = new Random();
            var8.setSeed(this.field24988);
            double var9 = var8.nextDouble() * Math.PI * 2.0;
            int var11 = 0;
            int var12 = 0;

            for (int var13 = 0; var13 < var20; var13++) {
               double var14 = (double)(4 * var19 + var19 * var12 * 6) + (var8.nextDouble() - 0.5) * (double)var19 * 2.5;
               int var16 = (int)Math.round(Math.cos(var9) * var14);
               int var17 = (int)Math.round(Math.sin(var9) * var14);
               BlockPos var18 = this.field24985.method7203((var16 << 4) + 8, 0, (var17 << 4) + 8, 112, var4::contains, var8);
               if (var18 != null) {
                  var16 = var18.method8304() >> 4;
                  var17 = var18.method8306() >> 4;
               }

               this.field24989.add(new Class7481(var16, var17));
               var9 += (Math.PI * 2) / (double)var7;
               if (++var11 == var7) {
                  var12++;
                  var11 = 0;
                  var7 += 2 * var7 / (var12 + 1);
                  var7 = Math.min(var7, var20 - var13);
                  var9 += var8.nextDouble() * Math.PI * 2.0;
               }
            }
         }
      }
   }

   public abstract Codec<? extends Class5646> method17790();

   public abstract Class5646 method17791(long var1);

   public void method17818(Registry<Biome> var1, Class1670 var2) {
      Class7481 var5 = var2.method7072();
      ((Class1672)var2).method7110(new Class1684(var1, var5, this.field24986));
   }

   public void method17819(long var1, Class6668 var3, Class1670 var4, Class97 var5) {
      Class6668 var8 = var3.method20322(this.field24985);
      Class2420 var9 = new Class2420();
      byte var10 = 8;
      Class7481 var11 = var4.method7072();
      int var12 = var11.field32174;
      int var13 = var11.field32175;
      Class7478 var14 = this.field24985.method7005(var11.field32174 << 2, 0, var11.field32175 << 2).method32507();
      BitSet var15 = ((Class1672)var4).method7117(var5);

      for (int var16 = var12 - 8; var16 <= var12 + 8; var16++) {
         for (int var17 = var13 - 8; var17 <= var13 + 8; var17++) {
            List<Supplier<Class6815<?>>> var18 = var14.method24276(var5);
            ListIterator<Supplier<Class6815<?>>> var19 = var18.listIterator();

            while (var19.hasNext()) {
               int var20 = var19.nextIndex();
               Class6815<?> var21 = var19.next().get();
               var9.method10373(var1 + (long)var20, var16, var17);
               if (var21.method20776(var9, var16, var17)) {
                  var21.method20777(var4, var8::method20323, var9, this.method17807(), var16, var17, var12, var13, var15);
               }
            }
         }
      }
   }

   @Nullable
   public BlockPos method17820(ServerWorld var1, Structure<?> var2, BlockPos var3, int var4, boolean var5) {
      if (this.field24985.method7205(var2)) {
         if (var2 != Structure.field18067) {
            Class8483 var16 = this.field24987.method38381(var2);
            return var16 != null ? var2.method11369(var1, var1.method6893(), var3, var4, var5, var1.method6967(), var16) : null;
         } else {
            this.method17817();
            BlockPos var8 = null;
            double var9 = Double.MAX_VALUE;
            Mutable var11 = new Mutable();

            for (Class7481 var13 : this.field24989) {
               var11.method8372((var13.field32174 << 4) + 8, 32, (var13.field32175 << 4) + 8);
               double var14 = var11.method8318(var3);
               if (var8 != null) {
                  if (var14 < var9) {
                     var8 = new BlockPos(var11);
                     var9 = var14;
                  }
               } else {
                  var8 = new BlockPos(var11);
                  var9 = var14;
               }
            }

            return var8;
         }
      } else {
         return null;
      }
   }

   public void method17821(Class1691 var1, Class7480 var2) {
      int var5 = var1.method7241();
      int var6 = var1.method7242();
      int var7 = var5 * 16;
      int var8 = var6 * 16;
      BlockPos var9 = new BlockPos(var7, 0, var8);
      Biome var10 = this.field24985.method7005((var5 << 2) + 2, 2, (var6 << 2) + 2);
      Class2420 var11 = new Class2420();
      long var12 = var11.method10371(var1.method6967(), var7, var8);

      try {
         var10.method32508(var2, this, var1, var12, var11, var9);
      } catch (Exception var16) {
         Class4526 var15 = Class4526.method14413(var16, "Biome decoration");
         var15.method14410("Generation").method32807("CenterX", var5).method32807("CenterZ", var6).method32807("Seed", var12).method32807("Biome", var10);
         throw new Class2506(var15);
      }
   }

   public abstract void method17801(Class1691 var1, Class1670 var2);

   public void method17809(Class1691 var1) {
   }

   public Class9763 method17822() {
      return this.field24987;
   }

   public int method17823() {
      return 64;
   }

   public Class1685 method17824() {
      return this.field24986;
   }

   public int method17806() {
      return 256;
   }

   public List<Class6692> method17808(Biome var1, Class7480 var2, Class179 var3, BlockPos var4) {
      return var1.method32499().method31968(var3);
   }

   public void method17825(Class8904 var1, Class7480 var2, Class1670 var3, Class8761 var4, long var5) {
      Class7481 var9 = var3.method7072();
      Biome var10 = this.field24985.method7005((var9.field32174 << 2) + 2, 0, (var9.field32175 << 2) + 2);
      this.method17826(Class9438.field43844, var1, var2, var3, var4, var5, var9, var10);

      for (Supplier var12 : var10.method32507().method24278()) {
         this.method17826((Class9300<?, ?>)var12.get(), var1, var2, var3, var4, var5, var9, var10);
      }
   }

   private void method17826(Class9300<?, ?> var1, Class8904 var2, Class7480 var3, Class1670 var4, Class8761 var5, long var6, Class7481 var8, Biome var9) {
      Class5444 var12 = var3.method24341(Class2002.method8391(var4.method7072(), 0), var1.field43174, var4);
      int var13 = var12 == null ? 0 : var12.method17123();
      Class8483 var14 = this.field24987.method38381(var1.field43174);
      if (var14 != null) {
         Class5444 var15 = var1.method35098(var2, this, this.field24985, var5, var6, var8, var9, var13, var14);
         var3.method24342(Class2002.method8391(var4.method7072(), 0), var1.field43174, var15, var4);
      }
   }

   public void method17827(Class1658 var1, Class7480 var2, Class1670 var3) {
      byte var6 = 8;
      int var7 = var3.method7072().field32174;
      int var8 = var3.method7072().field32175;
      int var9 = var7 << 4;
      int var10 = var8 << 4;
      Class2002 var11 = Class2002.method8391(var3.method7072(), 0);

      for (int var12 = var7 - 8; var12 <= var7 + 8; var12++) {
         for (int var13 = var8 - 8; var13 <= var8 + 8; var13++) {
            long var14 = Class7481.method24353(var12, var13);

            for (Class5444 var17 : var1.method6824(var12, var13).method7074().values()) {
               try {
                  if (var17 != Class5444.field24194 && var17.method17110().method38391(var9, var10, var9 + 15, var10 + 15)) {
                     var2.method24343(var11, var17.method17125(), var14, var3);
                     Class7393.method23619(var1, var17);
                  }
               } catch (Exception var21) {
                  Class4526 var19 = Class4526.method14413(var21, "Generating structure reference");
                  Class8965 var20 = var19.method14410("Structure");
                  var20.method32806("Id", () -> Registry.field16114.method9181(var17.method17125()).toString());
                  var20.method32806("Name", () -> var17.method17125().method11373());
                  var20.method32806("Class", () -> var17.method17125().getClass().getCanonicalName());
                  throw new Class2506(var19);
               }
            }
         }
      }
   }

   public abstract void method17803(Class1660 var1, Class7480 var2, Class1670 var3);

   public int method17807() {
      return 63;
   }

   public abstract int method17797(int var1, int var2, Class101 var3);

   public abstract Class1665 method17798(int var1, int var2);

   public int method17828(int var1, int var2, Class101 var3) {
      return this.method17797(var1, var2, var3);
   }

   public int method17829(int var1, int var2, Class101 var3) {
      return this.method17797(var1, var2, var3) - 1;
   }

   public boolean method17830(Class7481 var1) {
      this.method17817();
      return this.field24989.contains(var1);
   }

   static {
      Registry.<Codec<? extends Class5646>>method9194(Registry.field16136, "noise", Class5645.field24963);
      Registry.<Codec<? extends Class5646>>method9194(Registry.field16136, "flat", Class5648.field24998);
      Registry.<Codec<? extends Class5646>>method9194(Registry.field16136, "debug", Class5647.field24991);
   }
}
