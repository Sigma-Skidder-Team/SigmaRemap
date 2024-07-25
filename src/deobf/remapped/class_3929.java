package remapped;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import org.jetbrains.annotations.Nullable;

public class class_3929 {
   public static final int field_19094 = 4096;
   public static final int field_19096 = 2048;
   private final IntList field_19088;
   private final Int2IntMap field_19092;
   private final int[] field_19095 = new int[4096];
   private class_2962 field_19093 = new class_2962(4096);
   private class_2962 field_19091;
   private int field_19090;

   public class_3929() {
      this.field_19088 = new IntArrayList();
      this.field_19092 = new Int2IntOpenHashMap();
      this.field_19092.defaultReturnValue(-1);
   }

   public class_3929(int var1) {
      this.field_19088 = new IntArrayList(var1);
      this.field_19092 = new Int2IntOpenHashMap(var1);
      this.field_19092.defaultReturnValue(-1);
   }

   public void method_18190(int var1, int var2, int var3, int var4, int var5) {
      this.method_18181(method_18169(var1, var2, var3), var4 << 4 | var5 & 15);
   }

   public void method_18182(int var1, int var2, int var3, int var4) {
      this.method_18181(method_18169(var1, var2, var3), var4);
   }

   public int method_18180(int var1, int var2, int var3) {
      return this.method_18186(var1, var2, var3) >> 4;
   }

   public int method_18175(int var1, int var2, int var3) {
      return this.method_18186(var1, var2, var3) & 15;
   }

   public int method_18186(int var1, int var2, int var3) {
      int var6 = this.field_19095[method_18169(var1, var2, var3)];
      return this.field_19088.getInt(var6);
   }

   public int method_18185(int var1) {
      int var4 = this.field_19095[var1];
      return this.field_19088.getInt(var4);
   }

   public void method_18189(int var1, int var2, int var3) {
      this.method_18181(var1, var2 << 4 | var3 & 15);
   }

   public void method_18165(int var1, int var2) {
      this.field_19095[var1] = var2;
   }

   public int method_18192(int var1) {
      return this.field_19095[var1];
   }

   public int method_18193() {
      return this.field_19088.size();
   }

   public int method_18168(int var1) {
      if (var1 >= 0 && var1 < this.field_19088.size()) {
         return this.field_19088.getInt(var1);
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method_18167(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field_19088.size()) {
         int var5 = this.field_19088.set(var1, var2);
         if (var5 != var2) {
            this.field_19092.put(var2, var1);
            if (this.field_19092.get(var5) == var1) {
               this.field_19092.remove(var5);

               for (int var6 = 0; var6 < this.field_19088.size(); var6++) {
                  if (this.field_19088.getInt(var6) == var5) {
                     this.field_19092.put(var5, var6);
                     break;
                  }
               }
            }
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public void method_18172(int var1, int var2) {
      int var5 = this.field_19092.remove(var1);
      if (var5 != -1) {
         this.field_19092.put(var2, var5);

         for (int var6 = 0; var6 < this.field_19088.size(); var6++) {
            if (this.field_19088.getInt(var6) == var1) {
               this.field_19088.set(var6, var2);
            }
         }
      }
   }

   public void method_18187(int var1) {
      this.field_19092.put(var1, this.field_19088.size());
      this.field_19088.add(var1);
   }

   public void method_18171() {
      this.field_19088.clear();
      this.field_19092.clear();
   }

   public void method_18181(int var1, int var2) {
      int var5 = this.field_19092.get(var2);
      if (var5 == -1) {
         var5 = this.field_19088.size();
         this.field_19088.add(var2);
         this.field_19092.put(var2, var5);
      }

      this.field_19095[var1] = var5;
   }

   public void method_18184(byte[] var1) {
      if (var1.length == 2048) {
         if (this.field_19093 != null) {
            this.field_19093.method_13551(var1);
         } else {
            this.field_19093 = new class_2962(var1);
         }
      } else {
         throw new IllegalArgumentException("Data length != 2048");
      }
   }

   public void method_18173(byte[] var1) {
      if (var1.length == 2048) {
         if (this.field_19091 != null) {
            this.field_19091.method_13551(var1);
         } else {
            this.field_19091 = new class_2962(var1);
         }
      } else {
         throw new IllegalArgumentException("Data length != 2048");
      }
   }

   @Nullable
   public byte[] method_18162() {
      return this.field_19093 != null ? this.field_19093.method_13543() : null;
   }

   @Nullable
   public class_2962 method_18179() {
      return this.field_19093;
   }

   @Nullable
   public byte[] method_18174() {
      return this.field_19091 != null ? this.field_19091.method_13543() : null;
   }

   @Nullable
   public class_2962 method_18166() {
      return this.field_19091;
   }

   public void method_18164(ByteBuf var1) {
      if (this.field_19093 == null) {
         this.field_19093 = new class_2962(4096);
      }

      var1.readBytes(this.field_19093.method_13543());
   }

   public void method_18163(ByteBuf var1) {
      if (this.field_19091 == null) {
         this.field_19091 = new class_2962(4096);
      }

      var1.readBytes(this.field_19091.method_13543());
   }

   public static int method_18169(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   public void method_18170(ByteBuf var1) {
      var1.writeBytes(this.field_19093.method_13543());
   }

   public void method_18191(ByteBuf var1) {
      var1.writeBytes(this.field_19091.method_13543());
   }

   public boolean method_18178() {
      return this.field_19091 != null;
   }

   public boolean method_18183() {
      return this.field_19093 != null;
   }

   public int method_18176() {
      return this.field_19090;
   }

   public void method_18188(int var1) {
      this.field_19090 = var1;
   }
}
