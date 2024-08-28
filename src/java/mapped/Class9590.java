package mapped;

import java.util.ArrayList;
import java.util.HashSet;

public class Class9590 {
   private int field44863;
   private int field44864;
   private Class9727[] field44865;

   public Class9590(int var1, int var2, Class9727[] var3) {
      this.field44863 = var1;
      this.field44864 = var2;
      this.field44865 = var3;
   }

   public Class9590(int var1, Class9727[] var2) {
      this.field44863 = var1;
      this.field44865 = var2;
   }

   public int method37236() {
      return this.field44863;
   }

   public int method37237() {
      return this.field44864;
   }

   public Class9727[] method37238() {
      return this.field44865;
   }

   public boolean method37239(int var1, int var2) {
      for (int var5 = 0; var5 < this.field44865.length; var5++) {
         Class9727 var6 = this.field44865[var5];
         if (var6.method38106(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public int[] method37240() {
      HashSet<Integer> var3 = new HashSet();

      for (int var4 = 0; var4 < this.field44865.length; var4++) {
         Class9727 var5 = this.field44865[var4];
         int var6 = var5.method38103();
         var3.add(var6);
      }

      Integer[] var7 = var3.toArray(new Integer[var3.size()]);
      return Class7944.method26976(var7);
   }

   public Class9727[] method37241(int var1) {
      ArrayList<Class9727> var4 = new ArrayList();

      for (int var5 = 0; var5 < this.field44865.length; var5++) {
         Class9727 var6 = this.field44865[var5];
         if (var6.method38103() == var1) {
            var4.add(var6);
         }
      }

      return var4.toArray(new Class9727[var4.size()]);
   }

   @Override
   public String toString() {
      return "block." + this.field44863 + ":" + this.field44864 + "=" + Class7944.method26854(this.field44865);
   }
}
