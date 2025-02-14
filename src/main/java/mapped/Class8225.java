package mapped;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import org.jetbrains.annotations.Nullable;

public class Class8225 {
   public static final int field35325 = 4096;
   public static final int field35326 = 2048;
   private final IntList field35327;
   private final Int2IntMap field35328;
   private final int[] field35329 = new int[4096];
   private Class7873 field35330 = new Class7873(4096);
   private Class7873 field35331;
   private int field35332;

   public Class8225() {
      this.field35327 = new IntArrayList();
      this.field35328 = new Int2IntOpenHashMap();
      this.field35328.defaultReturnValue(-1);
   }

   public Class8225(int var1) {
      this.field35327 = new IntArrayList(var1);
      this.field35328 = new Int2IntOpenHashMap(var1);
      this.field35328.defaultReturnValue(-1);
   }

   public void method28622(int var1, int var2, int var3, int var4, int var5) {
      this.method28637(method28646(var1, var2, var3), var4 << 4 | var5 & 15);
   }

   public void method28623(int var1, int var2, int var3, int var4) {
      this.method28637(method28646(var1, var2, var3), var4);
   }

   public int method28624(int var1, int var2, int var3) {
      return this.method28626(var1, var2, var3) >> 4;
   }

   public int method28625(int var1, int var2, int var3) {
      return this.method28626(var1, var2, var3) & 15;
   }

   public int method28626(int var1, int var2, int var3) {
      int var6 = this.field35329[method28646(var1, var2, var3)];
      return this.field35327.getInt(var6);
   }

   public int method28627(int var1) {
      int var4 = this.field35329[var1];
      return this.field35327.getInt(var4);
   }

   public void method28628(int var1, int var2, int var3) {
      this.method28637(var1, var2 << 4 | var3 & 15);
   }

   public void method28629(int var1, int var2) {
      this.field35329[var1] = var2;
   }

   public int method28630(int var1) {
      return this.field35329[var1];
   }

   public int method28631() {
      return this.field35327.size();
   }

   public int method28632(int var1) {
      if (var1 >= 0 && var1 < this.field35327.size()) {
         return this.field35327.getInt(var1);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method28633(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field35327.size()) {
         int var5 = this.field35327.set(var1, var2);
         if (var5 != var2) {
            this.field35328.put(var2, var1);
            if (this.field35328.get(var5) == var1) {
               this.field35328.remove(var5);

               for (int var6 = 0; var6 < this.field35327.size(); var6++) {
                  if (this.field35327.getInt(var6) == var5) {
                     this.field35328.put(var5, var6);
                     break;
                  }
               }
            }
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method28634(int var1, int var2) {
      int var5 = this.field35328.remove(var1);
      if (var5 != -1) {
         this.field35328.put(var2, var5);

         for (int var6 = 0; var6 < this.field35327.size(); var6++) {
            if (this.field35327.getInt(var6) == var1) {
               this.field35327.set(var6, var2);
            }
         }
      }
   }

   public void method28635(int var1) {
      this.field35328.put(var1, this.field35327.size());
      this.field35327.add(var1);
   }

   public void method28636() {
      this.field35327.clear();
      this.field35328.clear();
   }

   public void method28637(int var1, int var2) {
      int var5 = this.field35328.get(var2);
      if (var5 == -1) {
         var5 = this.field35327.size();
         this.field35327.add(var2);
         this.field35328.put(var2, var5);
      }

      this.field35329[var1] = var5;
   }

   public void method28638(byte[] var1) {
      if (var1.length == 2048) {
         if (this.field35330 != null) {
            this.field35330.method26410(var1);
         } else {
            this.field35330 = new Class7873(var1);
         }
      } else {
         throw new IllegalArgumentException("Data length != 2048");
      }
   }

   public void method28639(byte[] var1) {
      if (var1.length == 2048) {
         if (this.field35331 != null) {
            this.field35331.method26410(var1);
         } else {
            this.field35331 = new Class7873(var1);
         }
      } else {
         throw new IllegalArgumentException("Data length != 2048");
      }
   }

   @Nullable
   public byte[] method28640() {
      return this.field35330 != null ? this.field35330.method26409() : null;
   }

   @Nullable
   public Class7873 method28641() {
      return this.field35330;
   }

   @Nullable
   public byte[] method28642() {
      return this.field35331 != null ? this.field35331.method26409() : null;
   }

   @Nullable
   public Class7873 method28643() {
      return this.field35331;
   }

   public void method28644(ByteBuf var1) {
      if (this.field35330 == null) {
         this.field35330 = new Class7873(4096);
      }

      var1.readBytes(this.field35330.method26409());
   }

   public void method28645(ByteBuf var1) {
      if (this.field35331 == null) {
         this.field35331 = new Class7873(4096);
      }

      var1.readBytes(this.field35331.method26409());
   }

   public static int method28646(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   public void method28647(ByteBuf var1) {
      var1.writeBytes(this.field35330.method26409());
   }

   public void method28648(ByteBuf var1) {
      var1.writeBytes(this.field35331.method26409());
   }

   public boolean method28649() {
      return this.field35331 != null;
   }

   public boolean method28650() {
      return this.field35330 != null;
   }

   public int method28651() {
      return this.field35332;
   }

   public void method28652(int var1) {
      this.field35332 = var1;
   }
}
