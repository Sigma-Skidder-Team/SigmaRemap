package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;



public class Class7386 extends Image {
   private int field31595;
   private int field31596;
   private int field31597 = 0;
   private Image[][] field31598;
   private int field31599;
   private Image field31600;

   public Class7386(URL var1, int var2, int var3) throws Class2451, IOException {
      this(new Image(var1.openStream(), var1.toString(), false), var2, var3);
   }

   public Class7386(Image var1, int var2, int var3) {
      super(var1);
      this.field31600 = var1;
      this.field31595 = var2;
      this.field31596 = var3;
      this.method23502();
   }

   public Class7386(Image var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.field31600 = var1;
      this.field31595 = var2;
      this.field31596 = var3;
      this.field31599 = var4;
      this.field31597 = var5;
      this.method23502();
   }

   public Class7386(Image var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0);
   }

   public Class7386(String var1, int var2, int var3, int var4) throws Class2451 {
      this(var1, var2, var3, null, var4);
   }

   public Class7386(String var1, int var2, int var3) throws Class2451 {
      this(var1, var2, var3, null);
   }

   public Class7386(String var1, int var2, int var3, Color var4) throws Class2451 {
      this(var1, var2, var3, var4, 0);
   }

   public Class7386(String var1, int var2, int var3, Color var4, int var5) throws Class2451 {
      super(var1, false, 2, var4);
      this.field31600 = this;
      this.field31595 = var2;
      this.field31596 = var3;
      this.field31599 = var5;
   }

   public Class7386(String var1, InputStream var2, int var3, int var4) throws Class2451 {
      super(var2, var1, false);
      this.field31600 = this;
      this.field31595 = var3;
      this.field31596 = var4;
   }

   @Override
   public void method23502() {
      if (this.field31598 == null) {
         int var3 = (this.method23558() - this.field31597 * 2 - this.field31595) / (this.field31595 + this.field31599) + 1;
         int var4 = (this.method23559() - this.field31597 * 2 - this.field31596) / (this.field31596 + this.field31599) + 1;
         if ((this.method23559() - this.field31596) % (this.field31596 + this.field31599) != 0) {
            var4++;
         }

         this.field31598 = new Image[var3][var4];

         for (int var5 = 0; var5 < var3; var5++) {
            for (int var6 = 0; var6 < var4; var6++) {
               this.field31598[var5][var6] = this.method23504(var5, var6);
            }
         }
      }
   }

   public Image method23503(int var1, int var2) {
      this.method23524();
      if (var1 < 0 || var1 >= this.field31598.length) {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      } else if (var2 >= 0 && var2 < this.field31598[0].length) {
         return this.field31598[var1][var2];
      } else {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      }
   }

   public Image method23504(int var1, int var2) {
      this.field31600.method23524();
      this.method23502();
      if (var1 < 0 || var1 >= this.field31598.length) {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      } else if (var2 >= 0 && var2 < this.field31598[0].length) {
         return this.field31600
            .method23551(
               var1 * (this.field31595 + this.field31599) + this.field31597,
               var2 * (this.field31596 + this.field31599) + this.field31597,
               this.field31595,
               this.field31596
            );
      } else {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      }
   }

   public int method23505() {
      this.field31600.method23524();
      this.method23502();
      return this.field31598.length;
   }

   public int method23506() {
      this.field31600.method23524();
      this.method23502();
      return this.field31598[0].length;
   }

   public void method23507(int var1, int var2, int var3, int var4) {
      this.field31598[var3][var4].method23529((float)var1, (float)var2, (float)this.field31595, (float)this.field31596);
   }

   @Override
   public void method23508() {
      if (this.field31600 != this) {
         this.field31600.method23508();
      } else {
         super.method23508();
      }
   }

   @Override
   public void method23509() {
      if (this.field31600 != this) {
         this.field31600.method23509();
      } else {
         super.method23509();
      }
   }

   @Override
   public void method23510(Texture var1) {
      if (this.field31600 != this) {
         this.field31600.method23510(var1);
      } else {
         super.method23510(var1);
      }
   }
}
