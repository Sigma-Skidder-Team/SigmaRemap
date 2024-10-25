package mapped;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class Decoder implements Class6515 {
   private final Class6516 field28898;
   private final Class6536 field28899;
   private final Class6518 field28900;
   private Class9189 field28901;
   private Class9340 field28902;

   public static boolean method19886(Class1955 var0) {
      return var0.method8217();
   }

   public Decoder(byte[] var1) throws AACException {
      this.field28898 = Class6516.method19755(var1);
      if (this.field28898 != null) {
         if (method19886(this.field28898.method19744())) {
            this.field28899 = new Class6536(this.field28898);
            this.field28900 = new Class6518(this.field28898.method19742(), this.field28898.method19733().method575());
            this.field28901 = new Class9189();
            field28529.log(Level.FINE, "profile: {0}", this.field28898.method19744());
            field28529.log(Level.FINE, "sf: {0}", this.field28898.method19746().method9033());
            field28529.log(Level.FINE, "channels: {0}", this.field28898.method19733().method576());
         } else {
            throw new AACException("unsupported profile: " + this.field28898.method19744().method8216());
         }
      } else {
         throw new IllegalArgumentException("illegal MP4 decoder specific info");
      }
   }

   public Class6516 method19887() {
      return this.field28898;
   }

   public void decodeFrame(byte[] frame, SampleBuffer var2) throws AACException {
      if (frame != null) {
         this.field28901.setData(frame);
      }

      try {
         this.decode(var2);
      } catch (AACException var6) {
         if (!var6.method10466()) {
            throw var6;
         }

         field28529.warning("unexpected end of frame");
      }
   }

   private void decode(SampleBuffer var1) throws AACException {
      if (Class9340.method35345(this.field28901)) {
         this.field28902 = Class9340.method35346(this.field28901);
         Class6525 var4 = this.field28902.method35348();
         this.field28898.method19745(var4.method19784());
         this.field28898.method19747(var4.method19785());
         this.field28898.method19734(Class188.method574(var4.method19786()));
      }

      if (!method19886(this.field28898.method19744())) {
         throw new AACException("unsupported profile: " + this.field28898.method19744().method8216());
      } else {
         this.field28899.method19844();

         try {
            this.field28899.method19845(this.field28901);
            this.field28899.method19852(this.field28900);
            this.field28899.method19857(var1);
         } catch (AACException var5) {
            var1.method28532(new byte[0], 0, 0, 0, 0);
            throw var5;
         } catch (Exception var6) {
            var1.method28532(new byte[0], 0, 0, 0, 0);
            throw new AACException(var6);
         }
      }
   }

   static {
      for (Handler var9 : field28529.getHandlers()) {
         field28529.removeHandler(var9);
      }

      field28529.setLevel(Level.WARNING);
      ConsoleHandler var10 = new ConsoleHandler();
      var10.setLevel(Level.ALL);
      field28529.addHandler(var10);
   }
}
