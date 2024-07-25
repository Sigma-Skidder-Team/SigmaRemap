package remapped;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import net.sourceforge.jaad.aac.AACException;

public class class_8405 implements class_3471 {
   private final class_6616 field_42999;
   private final class_940 field_43003;
   private final class_5346 field_43001;
   private class_7390 field_43002;
   private class_7991 field_43000;

   public static boolean method_38702(class_8296 var0) {
      return var0.method_38271();
   }

   public class_8405(byte[] var1) throws AACException {
      this.field_42999 = class_6616.method_30409(var1);
      if (this.field_42999 != null) {
         if (method_38702(this.field_42999.method_30415())) {
            this.field_43003 = new class_940(this.field_42999);
            this.field_43001 = new class_5346(this.field_42999.method_30429(), this.field_42999.method_30410().method_31522());
            this.field_43002 = new class_7390();
            field_17021.log(Level.FINE, "profile: {0}", this.field_42999.method_30415());
            field_17021.log(Level.FINE, "sf: {0}", this.field_42999.method_30420().method_41132());
            field_17021.log(Level.FINE, "channels: {0}", this.field_42999.method_30410().method_31520());
         } else {
            throw new class_5060("unsupported profile: " + this.field_42999.method_30415().method_38272());
         }
      } else {
         throw new IllegalArgumentException("illegal MP4 decoder specific info");
      }
   }

   public class_6616 method_38705() {
      return this.field_42999;
   }

   public void method_38703(byte[] var1, class_3885 var2) throws AACException {
      if (var1 != null) {
         this.field_43002.method_33654(var1);
      }

      try {
         this.method_38701(var2);
      } catch (class_5060 var6) {
         if (!var6.method_23320()) {
            throw var6;
         }

         field_17021.warning("unexpected end of frame");
      }
   }

   private void method_38701(class_3885 var1) throws AACException {
      if (class_7991.method_36265(this.field_43002)) {
         this.field_43000 = class_7991.method_36267(this.field_43002);
         class_6828 var4 = this.field_43000.method_36266();
         this.field_42999.method_30408(var4.method_31318());
         this.field_42999.method_30426(var4.method_31316());
         this.field_42999.method_30427(class_6871.method_31523(var4.method_31317()));
      }

      if (!method_38702(this.field_42999.method_30415())) {
         throw new class_5060("unsupported profile: " + this.field_42999.method_30415().method_38272());
      } else {
         this.field_43003.method_4066();

         try {
            this.field_43003.method_4061(this.field_43002);
            this.field_43003.method_4072(this.field_43001);
            this.field_43003.method_4073(var1);
         } catch (class_5060 var5) {
            var1.method_17965(new byte[0], 0, 0, 0, 0);
            throw var5;
         } catch (Exception var6) {
            var1.method_17965(new byte[0], 0, 0, 0, 0);
            throw new class_5060(var6);
         }
      }
   }

   static {
      for (Handler var9 : field_17021.getHandlers()) {
         field_17021.removeHandler(var9);
      }

      field_17021.setLevel(Level.WARNING);
      ConsoleHandler var10 = new ConsoleHandler();
      var10.setLevel(Level.ALL);
      field_17021.addHandler(var10);
   }
}
