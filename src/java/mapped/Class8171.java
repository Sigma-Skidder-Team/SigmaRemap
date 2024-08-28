package mapped;

import java.util.List;

public class Class8171 implements Class8173 {
   private static String[] field35152;
   public final int field35153;
   public final int field35154;
   public final boolean field35155;
   public boolean field35156;
   public final int field35157;
   public final Class8225[] field35158;
   public int[] field35159;
   public Class72 field35160;
   public final List<Class72> field35161;

   public Class8171(int var1, int var2, boolean var3, boolean var4, int var5, Class8225[] var6, int[] var7, Class72 var8, List<Class72> var9) {
      this.field35153 = var1;
      this.field35154 = var2;
      this.field35155 = var3;
      this.field35156 = var4;
      this.field35157 = var5;
      this.field35158 = var6;
      this.field35159 = var7;
      this.field35160 = var8;
      this.field35161 = var9;
   }

   public Class8171(int var1, int var2, boolean var3, boolean var4, int var5, Class8225[] var6, int[] var7, List<Class72> var8) {
      this(var1, var2, var3, var4, var5, var6, var7, null, var8);
   }

   @Override
   public boolean method28439() {
      return this.field35159 != null;
   }

   @Override
   public int method28440() {
      return this.field35153;
   }

   @Override
   public int method28441() {
      return this.field35154;
   }

   @Override
   public boolean method28442() {
      return this.field35155;
   }

   @Override
   public boolean method28443() {
      return this.field35156;
   }

   @Override
   public void method28444(boolean var1) {
      this.field35156 = var1;
   }

   @Override
   public int method28445() {
      return this.field35157;
   }

   @Override
   public Class8225[] method28446() {
      return this.field35158;
   }

   @Override
   public int[] method28447() {
      return this.field35159;
   }

   @Override
   public void method28448(int[] var1) {
      this.field35159 = var1;
   }

   @Override
   public Class72 method28449() {
      return this.field35160;
   }

   @Override
   public void method28450(Class72 var1) {
      this.field35160 = var1;
   }

   @Override
   public List<Class72> method28451() {
      return this.field35161;
   }
}
