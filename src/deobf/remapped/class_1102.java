package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class class_1102 extends Thread {
   public class_1102(class_9084 var1) {
      this.field_6331 = var1;
   }

   @Override
   public void run() {
      Object var3 = null;

      try {
         Object var5;
         synchronized (this.field_6331) {
            var5 = class_9084.access$100(this.field_6331).get(class_9084.access$000(this.field_6331));
         }

         if (var5 instanceof File) {
            var3 = new FileInputStream((File)var5);
         } else if (var5 instanceof URL) {
            var3 = ((URL)var5).openStream();
         } else {
            if (!(var5 instanceof InputStream)) {
               throw new IOException("this is impossible; how come the play list contains this kind of object? :: " + var5.getClass());
            }

            var3 = (InputStream)var5;
         }

         class_8212 var35 = new class_8212((InputStream)var3);
         class_909 var6 = new class_909();

         while (true) {
            synchronized (this.field_6331) {
               if (class_9084.access$200(this.field_6331)) {
                  break;
               }

               if (class_9084.access$300(this.field_6331)) {
                  if (class_9084.method_41830(this.field_6331) != null) {
                  }

                  try {
                     this.field_6331.wait();
                  } catch (InterruptedException var29) {
                     class_9084.method_41845().log(Level.SEVERE, "wait() failed", (Throwable)var29);
                  }
                  continue;
               }
            }

            try {
               class_1915 var38 = var35.method_37592();
               if (var38 == null) {
                  class_9084.method_41820(this.field_6331, true);
                  Thread.sleep(214L);
                  class_9084.method_41818(this.field_6331, true);
                  break;
               }

               if (class_9084.method_41830(this.field_6331) == null) {
                  int var8 = var38.method_8707();
                  int var9 = var38.method_8685() == 3 ? 1 : 2;
                  AudioFormat var10 = new AudioFormat((float)var8, 16, var9, true, false);
                  Line var11 = AudioSystem.getLine(new Info(SourceDataLine.class, var10));
                  class_9084.method_41827(this.field_6331, (SourceDataLine)var11);
                  class_9084.method_41830(this.field_6331).open(var10);
                  if (var11 != null) {
                     class_9084.method_41830(this.field_6331).start();
                  }

                  class_9084.method_41822(this.field_6331, class_9084.method_41830(this.field_6331), class_9084.method_41816(this.field_6331));
               }

               class_904 var39 = (class_904)var6.method_3883(var38, var35);
               short[] var40 = var39.method_3869();
               byte var41 = 0;
               int var42 = var39.method_3871();
               if (class_9084.method_41830(this.field_6331) != null) {
                  class_9084.method_41830(this.field_6331).write(class_9084.method_41841(this.field_6331, var40, var41, var42), 0, var42 * 2);
               }

               var35.method_37604();
            } catch (Exception var31) {
               break;
            }
         }

         try {
            var35.method_37601();
         } catch (Exception var28) {
            class_9084.method_41845().log(Level.WARNING, "error closing the sound stream", (Throwable)var28);
         }
      } catch (IOException var33) {
         class_9084.method_41845().log(Level.SEVERE, "unable to open the input stream", (Throwable)var33);
      } finally {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Exception var26) {
               class_9084.method_41845().log(Level.WARNING, "error closing the input stream", (Throwable)var26);
            }
         }
      }

      boolean var37;
      synchronized (this.field_6331) {
         var37 = !class_9084.access$200(this.field_6331);
         class_9084.method_41825(this.field_6331, false);
         class_9084.method_41820(this.field_6331, true);
      }

      class_9084.method_41829(this.field_6331, null);
      if (var37) {
         this.field_6331.method_41838();
      }
   }
}
