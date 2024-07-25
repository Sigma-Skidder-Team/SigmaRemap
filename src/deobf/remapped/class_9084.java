package remapped;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.BooleanControl;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.FloatControl.Type;
import javax.swing.JPanel;

public class class_9084 extends JPanel {
   private static final long field_46525 = 1L;
   private static final Logger field_46521 = Logger.getLogger(class_9084.class.getName());
   private static final Random field_46527 = new Random();
   private List<Object> field_46529 = new ArrayList<Object>();
   private transient boolean field_46530 = false;
   private transient boolean field_46532 = true;
   private transient boolean field_46531 = true;
   private transient volatile int field_46520 = 50;
   private transient volatile boolean field_46533 = false;
   private transient volatile boolean field_46528 = true;
   private transient volatile Thread field_46522 = null;
   private transient volatile int field_46523 = 0;
   private transient volatile SourceDataLine field_46524 = null;

   public class_9084() {
      this.method_41821();
   }

   public class_9084(File var1) {
      this.add(var1);
      this.method_41821();
   }

   public class_9084(File... var1) {
      for (File var7 : var1) {
         this.add(var7);
      }

      this.method_41821();
   }

   public class_9084(URL var1) {
      this.add(var1);
      this.method_41821();
   }

   public class_9084(InputStream var1) {
      this.add(var1);
      this.method_41821();
   }

   public class_9084(URL... var1) {
      for (URL var7 : var1) {
         this.add(var7);
      }

      this.method_41821();
   }

   private void method_41821() {
      new class_5680().method_388(this);
   }

   public class_9084 add(File var1, boolean var2) {
      if (var1.isFile()) {
         if (var1.getName().endsWith(".mp3")) {
            synchronized (this) {
               this.field_46529.add(var1);
            }
         }
      } else {
         if (!var1.isDirectory()) {
            throw new IllegalArgumentException("WTF is this? ( " + var1 + " )");
         }

         File[] var5 = var1.listFiles();

         for (File var9 : var5) {
            if (var9.isFile() || var2) {
               this.add(var9, var2);
            }
         }
      }

      return this;
   }

   public class_9084 add(File var1) {
      this.add(var1, true);
      return this;
   }

   public class_9084 add(URL var1) {
      synchronized (this) {
         this.field_46529.add(var1);
         return this;
      }
   }

   public class_9084 method_41817(InputStream var1) {
      synchronized (this) {
         this.field_46529.clear();
         this.field_46529.add(var1);
         return this;
      }
   }

   public class_9084 add(InputStream var1) {
      synchronized (this) {
         this.field_46529.add(var1);
         return this;
      }
   }

   public void method_41832(class_125 var1) {
      this.removeAll();
      var1.method_388(this);
      this.revalidate();
      this.repaint();
   }

   public boolean method_41843() {
      return this.field_46531;
   }

   public void method_41836() {
      synchronized (this) {
         if (this.field_46530) {
            this.field_46530 = false;
            this.notifyAll();
            return;
         }
      }

      this.field_46531 = false;
      this.method_41842();
      if (this.field_46529.size() != 0) {
         synchronized (this) {
            this.field_46532 = false;
         }

         if (this.field_46522 == null) {
            this.field_46522 = new class_1102(this);
            this.field_46522.start();
         }
      }
   }

   public boolean method_41837() {
      synchronized (this) {
         return !this.field_46530 && !this.field_46532;
      }
   }

   public void method_41833() {
      if (this.method_41837()) {
         synchronized (this) {
            this.field_46530 = true;
            this.notifyAll();
         }
      }
   }

   public boolean method_41834() {
      synchronized (this) {
         return this.field_46530;
      }
   }

   public void method_41842() {
      synchronized (this) {
         this.field_46530 = false;
         this.field_46532 = true;
         this.notifyAll();
      }

      if (this.field_46522 != null) {
         try {
            this.field_46522.join();
         } catch (InterruptedException var5) {
            field_46521.log(Level.SEVERE, "join() failed", (Throwable)var5);
         }
      }
   }

   public boolean method_41824() {
      synchronized (this) {
         return this.field_46532;
      }
   }

   public void method_41838() {
      this.method_41819(1);
   }

   public void method_41849() {
      this.method_41819(-1);
   }

   private void method_41819(int var1) {
      if (this.field_46529.size() != 0) {
         boolean var4 = this.method_41837();
         if (!this.field_46533) {
            this.field_46523 += var1;
            if (this.field_46523 <= this.field_46529.size() - 1) {
               if (this.field_46523 < 0) {
                  if (!this.field_46528) {
                     this.field_46523 = 0;
                     var4 = false;
                  } else {
                     this.field_46523 = this.field_46529.size() - 1;
                  }
               }
            } else if (!this.field_46528) {
               this.field_46523 = this.field_46529.size() - 1;
               var4 = false;
            } else {
               this.field_46523 = 0;
            }
         } else {
            this.field_46523 = field_46527.nextInt(this.field_46529.size());
         }

         this.method_41842();
         if (var4) {
            this.method_41836();
         }
      }
   }

   public class_9084 method_41847(int var1) {
      if (var1 >= 0 && var1 <= 100) {
         this.field_46520 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("Wrong value for volume, must be in interval [0..100].");
      }
   }

   public int method_41828() {
      return this.field_46520;
   }

   public class_9084 method_41846(boolean var1) {
      this.field_46533 = var1;
      return this;
   }

   public boolean method_41835() {
      return this.field_46533;
   }

   public class_9084 method_41840(boolean var1) {
      this.field_46528 = var1;
      return this;
   }

   public boolean method_41844() {
      return this.field_46528;
   }

   private void method_41848(SourceDataLine var1, int var2) {
      try {
         FloatControl var5 = (FloatControl)var1.getControl(Type.MASTER_GAIN);
         BooleanControl var6 = (BooleanControl)var1.getControl(javax.sound.sampled.BooleanControl.Type.MUTE);
         if (var2 == 0) {
            var6.setValue(true);
         } else {
            var6.setValue(false);
            var5.setValue((float)(Math.log((double)var2 / 100.0) / Math.log(10.0) * 20.0));
         }
      } catch (Exception var7) {
         field_46521.log(Level.WARNING, "unable to set the volume to the provided source", (Throwable)var7);
      }
   }

   public int method_41839() {
      int var3 = 0;
      if (this.field_46524 != null) {
         var3 = (int)(this.field_46524.getMicrosecondPosition() / 1000L);
      }

      return var3;
   }

   private byte[] method_41831(short[] var1, int var2, int var3) {
      byte[] var6 = new byte[var3 * 2];
      int var7 = 0;

      while (var3-- > 0) {
         short var8 = var1[var2++];
         var6[var7++] = (byte)var8;
         var6[var7++] = (byte)(var8 >>> 8);
      }

      return var6;
   }

   private void readObject(ObjectInputStream var1) throws ClassNotFoundException, IOException {
      var1.defaultReadObject();
   }

   public void method_41823() {
      if (this.field_46524 != null) {
         this.field_46522 = new class_513(this);
         this.field_46522.start();
      }
   }
}
