package mapped;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class8871 {
   private static final int field40064 = 1;
   private static final int field40065 = 2;
   public static final Class2003 field40066 = Class2003.method8433("OkHttp cache v1\n");
   public static final Class2003 field40067 = Class2003.method8433("OkHttp DIRTY :(\n");
   private static final long field40068 = 32L;
   public RandomAccessFile field40069;
   public Thread field40070;
   public Class1737 field40071;
   public final Class1734 field40072 = new Class1734();
   public long field40073;
   public boolean field40074;
   private final Class2003 field40075;
   public final Class1734 field40076 = new Class1734();
   public final long field40077;
   public int field40078;

   private Class8871(RandomAccessFile var1, Class1737 var2, long var3, Class2003 var5, long var6) {
      this.field40069 = var1;
      this.field40071 = var2;
      this.field40074 = var2 == null;
      this.field40073 = var3;
      this.field40075 = var5;
      this.field40077 = var6;
   }

   public static Class8871 method32271(File var0, Class1737 var1, Class2003 var2, long var3) throws IOException {
      RandomAccessFile var7 = new RandomAccessFile(var0, "rw");
      Class8871 var8 = new Class8871(var7, var1, 0L, var2, var3);
      var7.setLength(0L);
      var8.method32273(field40067, -1L, -1L);
      return var8;
   }

   public static Class8871 method32272(File var0) throws IOException {
      RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
      Class8575 var4 = new Class8575(var3.getChannel());
      Class1734 var5 = new Class1734();
      var4.method30646(0L, var5, 32L);
      Class2003 var6 = var5.method7607((long)field40066.method8458());
      if (var6.equals(field40066)) {
         long var7 = var5.method7600();
         long var9 = var5.method7600();
         Class1734 var11 = new Class1734();
         var4.method30646(32L + var7, var11, var9);
         Class2003 var12 = var11.method7606();
         return new Class8871(var3, null, var7, var12, 0L);
      } else {
         throw new IOException("unreadable cache file");
      }
   }

   private void method32273(Class2003 var1, long var2, long var4) throws IOException {
      Class1734 var8 = new Class1734();
      var8.method7562(var1);
      var8.method7575(var2);
      var8.method7575(var4);
      if (var8.method7582() == 32L) {
         Class8575 var9 = new Class8575(this.field40069.getChannel());
         var9.method30645(0L, var8, 32L);
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method32274(long var1) throws IOException {
      Class1734 var5 = new Class1734();
      var5.method7562(this.field40075);
      Class8575 var6 = new Class8575(this.field40069.getChannel());
      var6.method30645(32L + var1, var5, (long)this.field40075.method8458());
   }

   public void method32275(long var1) throws IOException {
      this.method32274(var1);
      this.field40069.getChannel().force(false);
      this.method32273(field40066, var1, (long)this.field40075.method8458());
      this.field40069.getChannel().force(false);
      synchronized (this) {
         this.field40074 = true;
      }

      Class9474.method36535(this.field40071);
      this.field40071 = null;
   }

   public boolean method32276() {
      return this.field40069 == null;
   }

   public Class2003 method32277() {
      return this.field40075;
   }

   public Class1737 method32278() {
      synchronized (this) {
         if (this.field40069 == null) {
            return null;
         }

         this.field40078++;
      }

      return new Class1746(this);
   }
}
