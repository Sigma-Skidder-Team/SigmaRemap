package net.sourceforge.jaad.spi.javasound;

import mapped.Trigger;

public class CircularBuffer {
   private static String[] field29854;
   private static final int field29855 = 327670;
   private final byte[] field29856;
   private final Trigger field29857;
   private long field29858;
   private long field29859;
   private boolean field29860;

   public CircularBuffer(Trigger var1) {
      this.field29857 = var1;
      this.field29856 = new byte[327670];
      this.field29858 = 0L;
      this.field29859 = 0L;
      this.field29860 = true;
   }

   public void method21039() {
      this.field29860 = false;
   }

   public boolean method21040() {
      return this.field29860;
   }

   public int method21041() {
      return (int)(this.field29859 - this.field29858);
   }

   public int method21042() {
      return 327670 - this.method21041();
   }

   private int method21043() {
      return (int)(this.field29858 % 327670L);
   }

   private int method21044() {
      return (int)(this.field29859 % 327670L);
   }

   public int method21045(byte[] var1) {
      return this.method21046(var1, 0, var1.length);
   }

   public int method21046(byte[] var1, int var2, int var3) {
      if (!this.method21040()) {
         if (this.method21041() <= 0) {
            return -1;
         }

         var3 = Math.min(var3, this.method21041());
      }

      synchronized (this) {
         if (this.field29857 != null && this.method21041() < var3) {
            this.field29857.execute();
         }

         var3 = Math.min(this.method21041(), var3);
         int var7 = var3;

         while (var7 > 0) {
            while (this.method21041() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }

            int var8 = Math.min(this.method21041(), var7);

            while (var8 > 0) {
               int var9 = Math.min(var8, 327670 - this.method21043());
               System.arraycopy(this.field29856, this.method21043(), var1, var2, var9);
               this.field29858 += (long)var9;
               var2 += var9;
               var8 -= var9;
               var7 -= var9;
            }

            this.notifyAll();
         }

         return var3;
      }
   }

   public int method21047(byte[] var1) {
      return this.method21048(var1, 0, var1.length);
   }

   public int method21048(byte[] var1, int var2, int var3) {
      synchronized (this) {
         int var7 = var3;

         while (var7 > 0) {
            while (this.method21042() == 0) {
               try {
                  this.wait();
               } catch (InterruptedException var11) {
               }
            }

            int var8 = Math.min(this.method21042(), var7);

            while (var8 > 0) {
               int var9 = Math.min(var8, 327670 - this.method21044());
               System.arraycopy(var1, var2, this.field29856, this.method21044(), var9);
               this.field29859 += (long)var9;
               var2 += var9;
               var8 -= var9;
               var7 -= var9;
            }

            this.notifyAll();
         }

         return var3;
      }
   }
}
