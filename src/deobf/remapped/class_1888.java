package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.newdawn.slick.SlickException;

public class class_1888 extends class_8112 {
   private int field_9552;
   private int field_9553;
   private int field_9558 = 0;
   private class_8112[][] field_9554;
   private int field_9555;
   private class_8112 field_9556;

   public class_1888(URL var1, int var2, int var3) throws SlickException, IOException {
      this(new class_8112(var1.openStream(), var1.toString(), false), var2, var3);
   }

   public class_1888(class_8112 var1, int var2, int var3) {
      super(var1);
      this.field_9556 = var1;
      this.field_9552 = var2;
      this.field_9553 = var3;
      this.method_36868();
   }

   public class_1888(class_8112 var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.field_9556 = var1;
      this.field_9552 = var2;
      this.field_9553 = var3;
      this.field_9555 = var4;
      this.field_9558 = var5;
      this.method_36868();
   }

   public class_1888(class_8112 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0);
   }

   public class_1888(String var1, int var2, int var3, int var4) throws SlickException {
      this(var1, var2, var3, null, var4);
   }

   public class_1888(String var1, int var2, int var3) throws SlickException {
      this(var1, var2, var3, null);
   }

   public class_1888(String var1, int var2, int var3, class_8709 var4) throws SlickException {
      this(var1, var2, var3, var4, 0);
   }

   public class_1888(String var1, int var2, int var3, class_8709 var4, int var5) throws SlickException {
      super(var1, false, 2, var4);
      this.field_9556 = this;
      this.field_9552 = var2;
      this.field_9553 = var3;
      this.field_9555 = var5;
   }

   public class_1888(String var1, InputStream var2, int var3, int var4) throws SlickException {
      super(var2, var1, false);
      this.field_9556 = this;
      this.field_9552 = var3;
      this.field_9553 = var4;
   }

   @Override
   public void method_36868() {
      if (this.field_9554 == null) {
         int var3 = (this.method_36877() - this.field_9558 * 2 - this.field_9552) / (this.field_9552 + this.field_9555) + 1;
         int var4 = (this.method_36856() - this.field_9558 * 2 - this.field_9553) / (this.field_9553 + this.field_9555) + 1;
         if ((this.method_36856() - this.field_9553) % (this.field_9553 + this.field_9555) != 0) {
            var4++;
         }

         this.field_9554 = new class_8112[var3][var4];

         for (int var5 = 0; var5 < var3; var5++) {
            for (int var6 = 0; var6 < var4; var6++) {
               this.field_9554[var5][var6] = this.method_8424(var5, var6);
            }
         }
      }
   }

   public class_8112 method_8423(int var1, int var2) {
      this.method_36895();
      if (var1 < 0 || var1 >= this.field_9554.length) {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      } else if (var2 >= 0 && var2 < this.field_9554[0].length) {
         return this.field_9554[var1][var2];
      } else {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      }
   }

   public class_8112 method_8424(int var1, int var2) {
      this.field_9556.method_36895();
      this.method_36868();
      if (var1 < 0 || var1 >= this.field_9554.length) {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      } else if (var2 >= 0 && var2 < this.field_9554[0].length) {
         return this.field_9556
            .method_36858(
               var1 * (this.field_9552 + this.field_9555) + this.field_9558,
               var2 * (this.field_9553 + this.field_9555) + this.field_9558,
               this.field_9552,
               this.field_9553
            );
      } else {
         throw new RuntimeException("SubImage out of sheet bounds: " + var1 + "," + var2);
      }
   }

   public int method_8427() {
      this.field_9556.method_36895();
      this.method_36868();
      return this.field_9554.length;
   }

   public int method_8425() {
      this.field_9556.method_36895();
      this.method_36868();
      return this.field_9554[0].length;
   }

   public void method_8426(int var1, int var2, int var3, int var4) {
      this.field_9554[var3][var4].method_36903((float)var1, (float)var2, (float)this.field_9552, (float)this.field_9553);
   }

   @Override
   public void method_36878() {
      if (this.field_9556 != this) {
         this.field_9556.method_36878();
      } else {
         super.method_36878();
      }
   }

   @Override
   public void method_36880() {
      if (this.field_9556 != this) {
         this.field_9556.method_36880();
      } else {
         super.method_36880();
      }
   }

   @Override
   public void method_36845(class_8343 var1) {
      if (this.field_9556 != this) {
         this.field_9556.method_36845(var1);
      } else {
         super.method_36845(var1);
      }
   }
}
