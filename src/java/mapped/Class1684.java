package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1684 implements Class1683 {
   private static final Logger field9151 = LogManager.getLogger();
   private static final int field9152 = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
   private static final int field9153 = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
   public static final int field9154 = 1 << field9152 + field9152 + field9153;
   public static final int field9155 = (1 << field9152) - 1;
   public static final int field9156 = (1 << field9153) - 1;
   private final Class2347<Biome> field9157;
   private final Biome[] field9158;

   public Class1684(Class2347<Biome> var1, Biome[] var2) {
      this.field9157 = var1;
      this.field9158 = var2;
   }

   private Class1684(Class2347<Biome> var1) {
      this(var1, new Biome[field9154]);
   }

   public Class1684(Class2347<Biome> var1, int[] var2) {
      this(var1);

      for (int var5 = 0; var5 < this.field9158.length; var5++) {
         int var6 = var2[var5];
         Biome var7 = (Biome)var1.method9172(var6);
         if (var7 != null) {
            this.field9158[var5] = var7;
         } else {
            field9151.warn("Received invalid biome id: " + var6);
            this.field9158[var5] = (Biome)var1.method9172(0);
         }
      }
   }

   public Class1684(Class2347<Biome> var1, Class7481 var2, Class1685 var3) {
      this(var1);
      int var6 = var2.method24356() >> 2;
      int var7 = var2.method24357() >> 2;

      for (int var8 = 0; var8 < this.field9158.length; var8++) {
         int var9 = var8 & field9155;
         int var10 = var8 >> field9152 + field9152 & field9156;
         int var11 = var8 >> field9152 & field9155;
         this.field9158[var8] = var3.method7005(var6 + var9, var10, var7 + var11);
      }
   }

   public Class1684(Class2347<Biome> var1, Class7481 var2, Class1685 var3, int[] var4) {
      this(var1);
      int var7 = var2.method24356() >> 2;
      int var8 = var2.method24357() >> 2;
      if (var4 == null) {
         for (int var9 = 0; var9 < this.field9158.length; var9++) {
            int var10 = var9 & field9155;
            int var11 = var9 >> field9152 + field9152 & field9156;
            int var12 = var9 >> field9152 & field9155;
            this.field9158[var9] = var3.method7005(var7 + var10, var11, var8 + var12);
         }
      } else {
         for (int var13 = 0; var13 < var4.length; var13++) {
            this.field9158[var13] = (Biome)var1.method9172(var4[var13]);
            if (this.field9158[var13] == null) {
               int var14 = var13 & field9155;
               int var15 = var13 >> field9152 + field9152 & field9156;
               int var16 = var13 >> field9152 & field9155;
               this.field9158[var13] = var3.method7005(var7 + var14, var15, var8 + var16);
            }
         }
      }
   }

   public int[] method7198() {
      int[] var3 = new int[this.field9158.length];

      for (int var4 = 0; var4 < this.field9158.length; var4++) {
         var3[var4] = this.field9157.method9171(this.field9158[var4]);
      }

      return var3;
   }

   @Override
   public Biome method7005(int var1, int var2, int var3) {
      int var6 = var1 & field9155;
      int var7 = MathHelper.method37775(var2, 0, field9156);
      int var8 = var3 & field9155;
      return this.field9158[var7 << field9152 + field9152 | var8 << field9152 | var6];
   }
}
