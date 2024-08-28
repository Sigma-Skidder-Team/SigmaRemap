package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Class6443 {
   public static final int field28296 = 1;
   public static final int field28297 = 2;
   public static final int field28298 = 3;
   public static final int field28299 = 4;
   public static final int field28300 = 5;
   public static final int field28301 = 6;
   public static final int field28302 = 14;
   public static final int field28303 = 16;
   public int field28304;
   public int field28305;
   public long field28306;
   private List<Class6443> field28307 = new ArrayList<Class6443>();

   public static Class6443 method19559(Class8827 var0) throws IOException {
      int var3 = var0.method31861();
      int var4 = 1;
      int var5 = 0;
      int var6 = 0;

      do {
         var6 = var0.method31861();
         var5 <<= 7;
         var5 |= var6 & 127;
         var4++;
      } while ((var6 & 128) == 128);

      Class6443 var7 = method19560(var3);
      var7.field28304 = var3;
      var7.field28305 = var5;
      var7.field28306 = var0.method31871();
      var7.method19555(var0);
      long var8 = (long)var5 - (var0.method31871() - var7.field28306);
      if (var8 > 0L) {
         Logger.getLogger("MP4 Boxes").log(Level.INFO, "Descriptor: bytes left: {0}, offset: {1}", new Long[]{var8, var0.method31871()});
         var0.method31870(var8);
      }

      var7.field28305 += var4;
      return var7;
   }

   private static Class6443 method19560(int var0) {
      Object var3;
      switch (var0) {
         case 1:
            var3 = new Class6442();
            break;
         case 2:
         case 16:
            var3 = new Class6445();
            break;
         case 3:
            var3 = new Class6444();
            break;
         case 4:
            var3 = new Class6446();
            break;
         case 5:
            var3 = new Class6449();
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
            var3 = new Class6447();
      }

      return (Class6443)var3;
   }

   public abstract void method19555(Class8827 var1) throws IOException;

   public void method19561(Class8827 var1) throws IOException {
      while ((long)this.field28305 - (var1.method31871() - this.field28306) > 0L) {
         Class6443 var4 = method19559(var1);
         this.field28307.add(var4);
      }
   }

   public List<Class6443> method19562() {
      return Collections.<Class6443>unmodifiableList(this.field28307);
   }

   public int method19563() {
      return this.field28304;
   }

   public int method19564() {
      return this.field28305;
   }
}
