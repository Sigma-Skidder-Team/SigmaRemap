package mapped;

import com.google.common.base.MoreObjects;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class Class9764 {
   public int field45678;
   public int field45679;
   public int field45680;
   public int field45681;
   public int field45682;
   public int field45683;

   public Class9764() {
   }

   public Class9764(int[] var1) {
      if (var1.length == 6) {
         this.field45678 = var1[0];
         this.field45679 = var1[1];
         this.field45680 = var1[2];
         this.field45681 = var1[3];
         this.field45682 = var1[4];
         this.field45683 = var1[5];
      }
   }

   public static Class9764 method38386() {
      return new Class9764(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static Class9764 method38387() {
      return new Class9764(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public static Class9764 method38388(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Direction var9) {
      switch (Class8403.field36060[var9.ordinal()]) {
         case 1:
            return new Class9764(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case 2:
            return new Class9764(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case 3:
            return new Class9764(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case 4:
            return new Class9764(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         default:
            return new Class9764(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public static Class9764 method38389(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new Class9764(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public Class9764(Class9764 var1) {
      this.field45678 = var1.field45678;
      this.field45679 = var1.field45679;
      this.field45680 = var1.field45680;
      this.field45681 = var1.field45681;
      this.field45682 = var1.field45682;
      this.field45683 = var1.field45683;
   }

   public Class9764(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field45678 = var1;
      this.field45679 = var2;
      this.field45680 = var3;
      this.field45681 = var4;
      this.field45682 = var5;
      this.field45683 = var6;
   }

   public Class9764(Class1998 var1, Class1998 var2) {
      this.field45678 = Math.min(var1.getX(), var2.getX());
      this.field45679 = Math.min(var1.getY(), var2.getY());
      this.field45680 = Math.min(var1.getZ(), var2.getZ());
      this.field45681 = Math.max(var1.getX(), var2.getX());
      this.field45682 = Math.max(var1.getY(), var2.getY());
      this.field45683 = Math.max(var1.getZ(), var2.getZ());
   }

   public Class9764(int var1, int var2, int var3, int var4) {
      this.field45678 = var1;
      this.field45680 = var2;
      this.field45681 = var3;
      this.field45683 = var4;
      this.field45679 = 1;
      this.field45682 = 512;
   }

   public boolean method38390(Class9764 var1) {
      return this.field45681 >= var1.field45678
         && this.field45678 <= var1.field45681
         && this.field45683 >= var1.field45680
         && this.field45680 <= var1.field45683
         && this.field45682 >= var1.field45679
         && this.field45679 <= var1.field45682;
   }

   public boolean method38391(int var1, int var2, int var3, int var4) {
      return this.field45681 >= var1 && this.field45678 <= var3 && this.field45683 >= var2 && this.field45680 <= var4;
   }

   public void method38392(Class9764 var1) {
      this.field45678 = Math.min(this.field45678, var1.field45678);
      this.field45679 = Math.min(this.field45679, var1.field45679);
      this.field45680 = Math.min(this.field45680, var1.field45680);
      this.field45681 = Math.max(this.field45681, var1.field45681);
      this.field45682 = Math.max(this.field45682, var1.field45682);
      this.field45683 = Math.max(this.field45683, var1.field45683);
   }

   public void method38393(int var1, int var2, int var3) {
      this.field45678 += var1;
      this.field45679 += var2;
      this.field45680 += var3;
      this.field45681 += var1;
      this.field45682 += var2;
      this.field45683 += var3;
   }

   public Class9764 method38394(int var1, int var2, int var3) {
      return new Class9764(
         this.field45678 + var1, this.field45679 + var2, this.field45680 + var3, this.field45681 + var1, this.field45682 + var2, this.field45683 + var3
      );
   }

   public void method38395(Class1998 var1) {
      this.method38393(var1.getX(), var1.getY(), var1.getZ());
   }

   public boolean method38396(Class1998 var1) {
      return var1.getX() >= this.field45678
         && var1.getX() <= this.field45681
         && var1.getZ() >= this.field45680
         && var1.getZ() <= this.field45683
         && var1.getY() >= this.field45679
         && var1.getY() <= this.field45682;
   }

   public Class1998 method38397() {
      return new Class1998(this.field45681 - this.field45678, this.field45682 - this.field45679, this.field45683 - this.field45680);
   }

   public int method38398() {
      return this.field45681 - this.field45678 + 1;
   }

   public int method38399() {
      return this.field45682 - this.field45679 + 1;
   }

   public int method38400() {
      return this.field45683 - this.field45680 + 1;
   }

   public Class1998 method38401() {
      return new BlockPos(
         this.field45678 + (this.field45681 - this.field45678 + 1) / 2,
         this.field45679 + (this.field45682 - this.field45679 + 1) / 2,
         this.field45680 + (this.field45683 - this.field45680 + 1) / 2
      );
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("x0", this.field45678)
         .add("y0", this.field45679)
         .add("z0", this.field45680)
         .add("x1", this.field45681)
         .add("y1", this.field45682)
         .add("z1", this.field45683)
         .toString();
   }

   public Class28 method38402() {
      return new Class28(new int[]{this.field45678, this.field45679, this.field45680, this.field45681, this.field45682, this.field45683});
   }
}
