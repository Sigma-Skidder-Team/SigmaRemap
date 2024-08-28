package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.sound.sampled.AudioFormat;

public class Class1777 extends Class1774 {
   private final Class7356 field9607;
   private final Class6542 field9608;
   private final Class8210 field9609;
   private AudioFormat field9610;
   private byte[] field9611;

   public Class1777(InputStream var1, AudioFormat var2, long var3) throws IOException {
      super(var1, var2, var3);
      Class8490 var7 = new Class8490(var1);
      Class8583 var8 = var7.method30073();
      List var9 = var8.method30674(Class2267.field14741);
      if (!var9.isEmpty()) {
         this.field9607 = (Class7356)var9.get(0);
         this.field9608 = new Class6542(this.field9607.method23320());
         this.field9609 = new Class8210();
      } else {
         throw new IOException("movie does not contain any AAC track");
      }
   }

   @Override
   public AudioFormat getFormat() {
      if (this.field9610 == null) {
         this.method7754();
         this.field9610 = new AudioFormat((float)this.field9609.method28524(), this.field9609.method28526(), this.field9609.method28525(), true, true);
         this.field9611 = this.field9609.method28523();
      }

      return this.field9610;
   }

   @Override
   public void method7753() {
      if (this.field9611 != null) {
         this.field9600.method21047(this.field9611);
         this.field9611 = null;
      } else {
         this.method7754();
         if (this.field9600.method21040()) {
            this.field9600.method21047(this.field9609.method28523());
         }
      }
   }

   private void method7754() {
      if (!this.field9607.method23323()) {
         this.field9600.method21039();
      } else {
         try {
            Class1994 var3 = this.field9607.method23324();
            if (var3 == null) {
               this.field9600.method21039();
            } else {
               this.field9608.method19888(var3.method8282(), this.field9609);
            }
         } catch (IOException var4) {
            this.field9600.method21039();
         }
      }
   }
}
