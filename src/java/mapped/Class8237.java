package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Class8237 {
   private final List<Class8350> field35360 = new ArrayList<Class8350>();
   private final Class1735 field35361;
   private final int field35362;
   private int field35363;
   public Class8350[] field35364 = new Class8350[8];
   public int field35365 = this.field35364.length - 1;
   public int field35366 = 0;
   public int field35367 = 0;

   public Class8237(int var1, Class1737 var2) {
      this(var1, var1, var2);
   }

   public Class8237(int var1, int var2, Class1737 var3) {
      this.field35362 = var1;
      this.field35363 = var2;
      this.field35361 = Class7001.method21696(var3);
   }

   public int method28673() {
      return this.field35363;
   }

   private void method28674() {
      if (this.field35363 < this.field35367) {
         if (this.field35363 != 0) {
            this.method28676(this.field35367 - this.field35363);
         } else {
            this.method28675();
         }
      }
   }

   private void method28675() {
      Arrays.fill(this.field35364, null);
      this.field35365 = this.field35364.length - 1;
      this.field35366 = 0;
      this.field35367 = 0;
   }

   private int method28676(int var1) {
      int var4 = 0;
      if (var1 > 0) {
         for (int var5 = this.field35364.length - 1; var5 >= this.field35365 && var1 > 0; var5--) {
            var1 -= this.field35364[var5].field35888;
            this.field35367 = this.field35367 - this.field35364[var5].field35888;
            this.field35366--;
            var4++;
         }

         System.arraycopy(this.field35364, this.field35365 + 1, this.field35364, this.field35365 + 1 + var4, this.field35366);
         this.field35365 += var4;
      }

      return var4;
   }

   public void method28677() throws IOException {
      while (!this.field35361.method7583()) {
         int var3 = this.field35361.method7596() & 255;
         if (var3 == 128) {
            throw new IOException("index == 0");
         }

         if ((var3 & 128) != 128) {
            if (var3 != 64) {
               if ((var3 & 64) != 64) {
                  if ((var3 & 32) != 32) {
                     if (var3 != 16 && var3 != 0) {
                        int var6 = this.method28689(var3, 15);
                        this.method28681(var6 - 1);
                     } else {
                        this.method28682();
                     }
                  } else {
                     this.field35363 = this.method28689(var3, 31);
                     if (this.field35363 < 0 || this.field35363 > this.field35362) {
                        throw new IOException("Invalid dynamic table size update " + this.field35363);
                     }

                     this.method28674();
                  }
               } else {
                  int var5 = this.method28689(var3, 63);
                  this.method28683(var5 - 1);
               }
            } else {
               this.method28684();
            }
         } else {
            int var4 = this.method28689(var3, 127);
            this.method28679(var4 - 1);
         }
      }
   }

   public List<Class8350> method28678() {
      ArrayList var3 = new ArrayList<Class8350>(this.field35360);
      this.field35360.clear();
      return var3;
   }

   private void method28679(int var1) throws IOException {
      if (!this.method28686(var1)) {
         int var4 = this.method28680(var1 - Class9739.field45480.length);
         if (var4 < 0 || var4 > this.field35364.length - 1) {
            throw new IOException("Header index too large " + (var1 + 1));
         }

         this.field35360.add(this.field35364[var4]);
      } else {
         Class8350 var5 = Class9739.field45480[var1];
         this.field35360.add(var5);
      }
   }

   private int method28680(int var1) {
      return this.field35365 + 1 + var1;
   }

   private void method28681(int var1) throws IOException {
      Class2003 var4 = this.method28685(var1);
      Class2003 var5 = this.method28690();
      this.field35360.add(new Class8350(var4, var5));
   }

   private void method28682() throws IOException {
      Class2003 var3 = Class9739.method38170(this.method28690());
      Class2003 var4 = this.method28690();
      this.field35360.add(new Class8350(var3, var4));
   }

   private void method28683(int var1) throws IOException {
      Class2003 var4 = this.method28685(var1);
      Class2003 var5 = this.method28690();
      this.method28687(-1, new Class8350(var4, var5));
   }

   private void method28684() throws IOException {
      Class2003 var3 = Class9739.method38170(this.method28690());
      Class2003 var4 = this.method28690();
      this.method28687(-1, new Class8350(var3, var4));
   }

   private Class2003 method28685(int var1) {
      return !this.method28686(var1) ? this.field35364[this.method28680(var1 - Class9739.field45480.length)].field35886 : Class9739.field45480[var1].field35886;
   }

   private boolean method28686(int var1) {
      return var1 >= 0 && var1 <= Class9739.field45480.length - 1;
   }

   private void method28687(int var1, Class8350 var2) {
      this.field35360.add(var2);
      int var5 = var2.field35888;
      if (var1 != -1) {
         var5 -= this.field35364[this.method28680(var1)].field35888;
      }

      if (var5 <= this.field35363) {
         int var6 = this.field35367 + var5 - this.field35363;
         int var7 = this.method28676(var6);
         if (var1 != -1) {
            var1 += this.method28680(var1) + var7;
            this.field35364[var1] = var2;
         } else {
            if (this.field35366 + 1 > this.field35364.length) {
               Class8350[] var8 = new Class8350[this.field35364.length * 2];
               System.arraycopy(this.field35364, 0, var8, this.field35364.length, this.field35364.length);
               this.field35365 = this.field35364.length - 1;
               this.field35364 = var8;
            }

            var1 = this.field35365--;
            this.field35364[var1] = var2;
            this.field35366++;
         }

         this.field35367 += var5;
      } else {
         this.method28675();
      }
   }

   private int method28688() throws IOException {
      return this.field35361.method7596() & 0xFF;
   }

   public int method28689(int var1, int var2) throws IOException {
      int var5 = var1 & var2;
      if (var5 >= var2) {
         byte var7 = 0;
         int var8 = this.method28688();
         return var2 + (var8 << var7);
      } else {
         return var5;
      }
   }

   public Class2003 method28690() throws IOException {
      int var3 = this.method28688();
      boolean var4 = (var3 & 128) == 128;
      int var5 = this.method28689(var3, 127);
      return !var4 ? this.field35361.method7607((long)var5) : Class2003.method8430(Class6985.method21600().method21603(this.field35361.method7622((long)var5)));
   }
}
