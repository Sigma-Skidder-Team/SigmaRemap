package mapped;

import java.util.ArrayList;

public class Class7685 implements Class7686 {
   private static String[] field32915;
   private ArrayList field32916;
   private boolean field32917;
   private int field32918;
   private int field32919;
   public final Class6134 field32920;

   public Class7685(Class6134 var1, ArrayList var2, int var3, int var4) {
      this.field32920 = var1;
      this.field32916 = var2;
      this.field32918 = var3;
      this.field32919 = var4;
      this.field32917 = false;
   }

   public void method25296(ArrayList var1) {
      this.field32916 = var1;
   }

   public ArrayList method25297() {
      return this.field32916;
   }

   @Override
   public float method25298(float var1) {
      Class2532 var4 = (Class2532)this.field32916.get(0);

      for (int var5 = 1; var5 < this.field32916.size(); var5++) {
         Class2532 var6 = (Class2532)this.field32916.get(var5);
         if (var1 >= var4.method10683() && var1 <= var6.method10683()) {
            float var7 = (var1 - var4.method10683()) / (var6.method10683() - var4.method10683());
            return var4.method10684() + var7 * (var6.method10684() - var4.method10684());
         }

         var4 = var6;
      }

      return 0.0F;
   }

   public boolean method25299() {
      return this.field32917;
   }

   public void method25300(boolean var1) {
      this.field32917 = var1;
   }

   public int method25301() {
      return this.field32919;
   }

   public void method25302(int var1) {
      this.field32919 = var1;
   }

   public int method25303() {
      return this.field32918;
   }

   public void method25304(int var1) {
      this.field32918 = var1;
   }
}
