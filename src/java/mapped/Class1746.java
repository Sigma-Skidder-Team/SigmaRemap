package mapped;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Class1746 implements Class1737 {
   private final Class4916 field9464;
   private Class8575 field9465;
   private long field9466;
   public final Class8871 field9467;

   public Class1746(Class8871 var1) {
      this.field9467 = var1;
      this.field9464 = new Class4916();
      this.field9465 = new Class8575(this.field9467.field40069.getChannel());
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (this.field9465 == null) {
         throw new IllegalStateException("closed");
      } else {
         long var7;
         byte var9;
         synchronized (this.field9467) {
            while (true) {
               var7 = this.field9467.field40073;
               if (this.field9466 == this.field9467.field40073) {
                  if (this.field9467.field40074) {
                     return -1L;
                  }

                  if (this.field9467.field40070 != null) {
                     this.field9464.method15218(this.field9467);
                     continue;
                  }

                  this.field9467.field40070 = Thread.currentThread();
                  var9 = 1;
                  break;
               }

               long var10 = var7 - this.field9467.field40076.method7582();
               if (this.field9466 >= var10) {
                  long var12 = Math.min(var2, var7 - this.field9466);
                  this.field9467.field40076.method7589(var1, this.field9466 - var10, var12);
                  this.field9466 += var12;
                  return var12;
               }

               var9 = 2;
               break;
            }
         }

         if (var9 == 2) {
            long var38 = Math.min(var2, var7 - this.field9466);
            this.field9465.method30646(32L + this.field9466, var1, var38);
            this.field9466 += var38;
            return var38;
         } else {
            long var17;
            try {
               long var15 = this.field9467.field40071.method7633(this.field9467.field40072, this.field9467.field40077);
               if (var15 != -1L) {
                  var17 = Math.min(var15, var2);
                  this.field9467.field40072.method7589(var1, 0L, var17);
                  this.field9466 += var17;
                  this.field9465.method30645(32L + var7, this.field9467.field40072.clone(), var15);
                  synchronized (this.field9467) {
                     this.field9467.field40076.method7540(this.field9467.field40072, var15);
                     if (this.field9467.field40076.method7582() > this.field9467.field40077) {
                        this.field9467.field40076.method7627(this.field9467.field40076.method7582() - this.field9467.field40077);
                     }

                     this.field9467.field40073 += var15;
                  }

                  return var17;
               }

               this.field9467.method32275(var7);
               var17 = -1L;
            } finally {
               synchronized (this.field9467) {
                  this.field9467.field40070 = null;
                  this.field9467.notifyAll();
               }
            }

            return var17;
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9464;
   }

   @Override
   public void close() throws IOException {
      if (this.field9465 != null) {
         this.field9465 = null;
         RandomAccessFile var3 = null;
         synchronized (this.field9467) {
            this.field9467.field40078--;
            if (this.field9467.field40078 == 0) {
               var3 = this.field9467.field40069;
               this.field9467.field40069 = null;
            }
         }

         if (var3 != null) {
            Class9474.method36535(var3);
         }
      }
   }
}
