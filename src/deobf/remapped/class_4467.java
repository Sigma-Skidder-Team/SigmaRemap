package remapped;

import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.io.IOException;
import java.util.function.BiConsumer;

public class class_4467 implements Packet<class_392> {
   private static String[] field_21784;
   public class_6979 field_21788;
   public short[] field_21787;
   public class_2522[] field_21786;
   public boolean field_21785;

   public class_4467() {
   }

   public class_4467(class_6979 var1, ShortSet var2, class_1315 var3, boolean var4) {
      this.field_21788 = var1;
      this.field_21785 = var4;
      this.method_20728(var2.size());
      int var7 = 0;

      for (ShortIterator var8 = var2.iterator(); var8.hasNext(); var7++) {
         short var9 = (Short)var8.next();
         this.field_21787[var7] = var9;
         this.field_21786[var7] = var3.method_5999(class_6979.method_31912(var9), class_6979.method_31890(var9), class_6979.method_31911(var9));
      }
   }

   private void method_20728(int var1) {
      this.field_21787 = new short[var1];
      this.field_21786 = new class_2522[var1];
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_21788 = class_6979.method_31920(var1.readLong());
      this.field_21785 = var1.readBoolean();
      int var4 = var1.method_37778();
      this.method_20728(var4);

      for (int var5 = 0; var5 < this.field_21787.length; var5++) {
         long var6 = var1.method_37781();
         this.field_21787[var5] = (short)((int)(var6 & 4095L));
         this.field_21786[var5] = class_6414.field_32758.method_14040((int)(var6 >>> 12));
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeLong(this.field_21788.method_31925());
      var1.writeBoolean(this.field_21785);
      var1.method_37743(this.field_21787.length);

      for (int var4 = 0; var4 < this.field_21787.length; var4++) {
         var1.method_37752((long)(class_6414.method_29285(this.field_21786[var4]) << 12 | this.field_21787[var4]));
      }
   }

   public void method_20731(class_392 var1) {
      var1.method_1932(this);
   }

   public void method_20730(BiConsumer<BlockPos, class_2522> var1) {
      class_2921 var4 = new class_2921();

      for (int var5 = 0; var5 < this.field_21787.length; var5++) {
         short var6 = this.field_21787[var5];
         var4.method_13362(this.field_21788.method_31896(var6), this.field_21788.method_31897(var6), this.field_21788.method_31907(var6));
         var1.accept(var4, this.field_21786[var5]);
      }
   }

   public boolean method_20732() {
      return this.field_21785;
   }
}
