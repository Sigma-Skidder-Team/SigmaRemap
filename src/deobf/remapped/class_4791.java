package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_4791 {
   private final class_6041 field_23961;
   private final List<class_7641> field_23960;
   private class_8566 field_23963;
   private class_8566 field_23957;
   private class_8566[] field_23962;
   private class_910 field_23966;
   private class_1961 field_23965;
   private class_7641 field_23959;
   private class_5111 field_23964;

   public class_4791(InputStream var1) throws IOException {
      this.field_23961 = new class_6041(var1);
      this.field_23960 = new ArrayList<class_7641>();
      this.method_22091();
   }

   public class_4791(RandomAccessFile var1) throws IOException {
      this.field_23961 = new class_6041(var1);
      this.field_23960 = new ArrayList<class_7641>();
      this.method_22091();
   }

   private void method_22091() throws IOException {
      class_7641 var3 = null;
      boolean var4 = false;

      while (this.field_23961.method_27535()) {
         var3 = class_645.method_2969(null, this.field_23961);
         if (this.field_23960.isEmpty() && var3.method_34615() != 1718909296L) {
            throw new class_2920("no MP4 signature found");
         }

         this.field_23960.add(var3);
         long var5 = var3.method_34615();
         if (var5 != 1718909296L) {
            if (var5 != 1836019574L) {
               if (var5 != 1885628782L) {
                  if (var5 == 1835295092L) {
                     if (var4) {
                        break;
                     }

                     if (!this.field_23961.method_27523()) {
                        throw new class_2920("movie box at end of file, need random access");
                     }
                  }
               } else if (this.field_23965 == null) {
                  this.field_23965 = (class_1961)var3;
               }
            } else {
               if (this.field_23964 == null) {
                  this.field_23959 = var3;
               }

               var4 = true;
            }
         } else if (this.field_23966 == null) {
            this.field_23966 = (class_910)var3;
         }
      }
   }

   public class_8566 method_22097() {
      if (this.field_23963 == null) {
         this.field_23963 = class_8566.method_39407(this.field_23966.method_3896());
      }

      return this.field_23963;
   }

   public class_8566 method_22096() {
      if (this.field_23957 == null) {
         this.field_23957 = class_8566.method_39407(this.field_23966.method_3896());
      }

      return this.field_23957;
   }

   public class_8566[] method_22092() {
      if (this.field_23962 == null) {
         String[] var3 = this.field_23966.method_3897();
         this.field_23962 = new class_8566[var3.length];

         for (int var4 = 0; var4 < var3.length; var4++) {
            this.field_23962[var4] = class_8566.method_39407(var3[var4]);
         }
      }

      return this.field_23962;
   }

   public class_5111 method_22093() {
      if (this.field_23959 != null) {
         if (this.field_23964 == null) {
            this.field_23964 = new class_5111(this.field_23959, this.field_23961);
         }

         return this.field_23964;
      } else {
         return null;
      }
   }

   public List<class_7641> method_22094() {
      return Collections.<class_7641>unmodifiableList(this.field_23960);
   }

   static {
      Logger var4 = Logger.getLogger("MP4 API");

      for (Handler var10 : var4.getHandlers()) {
         var4.removeHandler(var10);
      }

      var4.setLevel(Level.WARNING);
      ConsoleHandler var11 = new ConsoleHandler();
      var11.setLevel(Level.ALL);
      var4.addHandler(var11);
   }
}
