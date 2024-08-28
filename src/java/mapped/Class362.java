package mapped;

import com.mentalfrostbyte.jello.sound.Sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.Line;
import javax.sound.sampled.SourceDataLine;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;

public class Class362 extends Thread {
   public final Sound field1599;

   public Class362(Sound var1) {
      this.field1599 = var1;
   }

   @Override
   public void run() {
      InputStream var3 = null;

      try {
         Object var5;
         synchronized (this.field1599) {
            var5 = Sound.access$100(this.field1599).get(Sound.access$000(this.field1599));
         }

         if (var5 instanceof File) {
            var3 = new FileInputStream((File)var5);
         } else if (var5 instanceof URL) {
            var3 = ((URL)var5).openStream();
         } else {
            if (!(var5 instanceof InputStream)) {
               throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + var5.getClass());
            }

            var3 = (InputStream) var5;
         }

         Class2443 var35 = new Class2443(var3);
         Class2440 var6 = new Class2440();

         while (true) {
            synchronized (this.field1599) {
               if (Sound.access$200(this.field1599)) {
                  break;
               }

               if (Sound.access$300(this.field1599)) {
                  if (Sound.method10540(this.field1599) != null) {
                  }

                  try {
                     this.field1599.wait();
                  } catch (InterruptedException var29) {
                     Sound.method10541().log(Level.SEVERE, "wait() failed", (Throwable)var29);
                  }
                  continue;
               }
            }

            try {
               Class7413 var38 = var35.method10437();
               if (var38 == null) {
                  Sound.method10542(this.field1599, true);
                  Thread.sleep(214L);
                  Sound.method10543(this.field1599, true);
                  break;
               }

               if (Sound.method10540(this.field1599) == null) {
                  int var8 = var38.method23665();
                  int var9 = var38.method23666() == 3 ? 1 : 2;
                  AudioFormat var10 = new AudioFormat((float)var8, 16, var9, true, false);
                  Line var11 = AudioSystem.getLine(new Info(SourceDataLine.class, var10));
                  Sound.method10544(this.field1599, (SourceDataLine)var11);
                  Sound.method10540(this.field1599).open(var10);
                  if (var11 != null) {
                     Sound.method10540(this.field1599).start();
                  }

                  Sound.method10546(this.field1599, Sound.method10540(this.field1599), Sound.method10545(this.field1599));
               }

               Class6747 var39 = (Class6747)var6.method10423(var38, var35);
               short[] var40 = var39.method20563();
               byte var41 = 0;
               int var42 = var39.method20564();
               if (Sound.method10540(this.field1599) != null) {
                  Sound.method10540(this.field1599).write(Sound.method10547(this.field1599, var40, var41, var42), 0, var42 * 2);
               }

               var35.method10441();
            } catch (Exception var31) {
               break;
            }
         }

         try {
            var35.method10436();
         } catch (Exception var28) {
            Sound.method10541().log(Level.WARNING, "error closing the sound stream", (Throwable)var28);
         }
      } catch (IOException var33) {
         Sound.method10541().log(Level.SEVERE, "unable to open the input stream", (Throwable)var33);
      } finally {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Exception var26) {
               Sound.method10541().log(Level.WARNING, "error closing the input stream", (Throwable)var26);
            }
         }
      }

      boolean var37;
      synchronized (this.field1599) {
         var37 = !Sound.access$200(this.field1599);
         Sound.method10548(this.field1599, false);
         Sound.method10542(this.field1599, true);
      }

      Sound.method10549(this.field1599, null);
      if (var37) {
         this.field1599.method10527();
      }
   }
}
