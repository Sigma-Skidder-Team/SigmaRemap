package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class class_1237 {
   public static final int field_6835 = 1;
   public static final int field_6825 = 2;
   public static final int field_6826 = 3;
   public static final int field_6834 = 4;
   public static final int field_6833 = 5;
   public static final int field_6832 = 6;
   public static final int field_6827 = 14;
   public static final int field_6824 = 16;
   public int field_6831;
   public int field_6828;
   public long field_6829;
   private List<class_1237> field_6830 = new ArrayList<class_1237>();

   public static class_1237 method_5492(class_6041 var0) throws IOException {
      int var3 = var0.method_27531();
      int var4 = 1;
      int var5 = 0;
      int var6 = 0;

      do {
         var6 = var0.method_27531();
         var5 <<= 7;
         var5 |= var6 & 127;
         var4++;
      } while ((var6 & 128) == 128);

      class_1237 var7 = method_5494(var3);
      var7.field_6831 = var3;
      var7.field_6828 = var5;
      var7.field_6829 = var0.method_27526();
      var7.method_5498(var0);
      long var8 = (long)var5 - (var0.method_27526() - var7.field_6829);
      if (var8 > 0L) {
         Logger.getLogger("MP4 Boxes").log(Level.INFO, "Descriptor: bytes left: {0}, offset: {1}", new Long[]{var8, var0.method_27526()});
         var0.method_27527(var8);
      }

      var7.field_6828 += var4;
      return var7;
   }

   private static class_1237 method_5494(int var0) {
      Object var3;
      switch (var0) {
         case 1:
            var3 = new class_653();
            break;
         case 2:
         case 16:
            var3 = new class_2796();
            break;
         case 3:
            var3 = new class_4920();
            break;
         case 4:
            var3 = new class_3100();
            break;
         case 5:
            var3 = new class_9849();
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         default:
            Logger.getLogger("MP4 Boxes").log(Level.INFO, "Unknown descriptor type: {0}", var0);
            var3 = new class_4209();
      }

      return (class_1237)var3;
   }

   public abstract void method_5498(class_6041 var1) throws IOException;

   public void method_5493(class_6041 var1) throws IOException {
      while ((long)this.field_6828 - (var1.method_27526() - this.field_6829) > 0L) {
         class_1237 var4 = method_5492(var1);
         this.field_6830.add(var4);
      }
   }

   public List<class_1237> method_5495() {
      return Collections.<class_1237>unmodifiableList(this.field_6830);
   }

   public int method_5497() {
      return this.field_6831;
   }

   public int method_5491() {
      return this.field_6828;
   }
}
