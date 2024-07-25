package remapped;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class class_6219 {
   private static final int field_31766 = 1;
   private static final int field_31764 = 2;
   public static final class_9091 field_31772 = class_9091.method_41889("OkHttp cache v1\n");
   public static final class_9091 field_31770 = class_9091.method_41889("OkHttp DIRTY :(\n");
   private static final long field_31771 = 32L;
   public RandomAccessFile field_31773;
   public Thread field_31768;
   public class_5322 field_31767;
   public final class_7059 field_31758 = new class_7059();
   public long field_31761;
   public boolean field_31762;
   private final class_9091 field_31763;
   public final class_7059 field_31759 = new class_7059();
   public final long field_31769;
   public int field_31765;

   private class_6219(RandomAccessFile var1, class_5322 var2, long var3, class_9091 var5, long var6) {
      this.field_31773 = var1;
      this.field_31767 = var2;
      this.field_31762 = var2 == null;
      this.field_31761 = var3;
      this.field_31763 = var5;
      this.field_31769 = var6;
   }

   public static class_6219 method_28440(File var0, class_5322 var1, class_9091 var2, long var3) throws IOException {
      RandomAccessFile var7 = new RandomAccessFile(var0, "rw");
      class_6219 var8 = new class_6219(var7, var1, 0L, var2, var3);
      var7.setLength(0L);
      var8.method_28441(field_31770, -1L, -1L);
      return var8;
   }

   public static class_6219 method_28435(File var0) throws IOException {
      RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
      class_5085 var4 = new class_5085(var3.getChannel());
      class_7059 var5 = new class_7059();
      var4.method_23371(0L, var5, 32L);
      class_9091 var6 = var5.method_36587((long)field_31772.method_41902());
      if (var6.equals(field_31772)) {
         long var7 = var5.method_36594();
         long var9 = var5.method_36594();
         class_7059 var11 = new class_7059();
         var4.method_23371(32L + var7, var11, var9);
         class_9091 var12 = var11.method_36586();
         return new class_6219(var3, null, var7, var12, 0L);
      } else {
         throw new IOException("unreadable cache file");
      }
   }

   private void method_28441(class_9091 var1, long var2, long var4) throws IOException {
      class_7059 var8 = new class_7059();
      var8.method_32487(var1);
      var8.method_32457(var2);
      var8.method_32457(var4);
      if (var8.method_32468() == 32L) {
         class_5085 var9 = new class_5085(this.field_31773.getChannel());
         var9.method_23372(0L, var8, 32L);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method_28437(long var1) throws IOException {
      class_7059 var5 = new class_7059();
      var5.method_32487(this.field_31763);
      class_5085 var6 = new class_5085(this.field_31773.getChannel());
      var6.method_23372(32L + var1, var5, (long)this.field_31763.method_41902());
   }

   public void method_28442(long var1) throws IOException {
      this.method_28437(var1);
      this.field_31773.getChannel().force(false);
      this.method_28441(field_31772, var1, (long)this.field_31763.method_41902());
      this.field_31773.getChannel().force(false);
      synchronized (this) {
         this.field_31762 = true;
      }

      class_8515.method_39200(this.field_31767);
      this.field_31767 = null;
   }

   public boolean method_28438() {
      return this.field_31773 == null;
   }

   public class_9091 method_28434() {
      return this.field_31763;
   }

   public class_5322 method_28439() {
      synchronized (this) {
         if (this.field_31773 == null) {
            return null;
         }

         this.field_31765++;
      }

      return new class_2179(this);
   }
}
