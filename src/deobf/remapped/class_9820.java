package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public final class class_9820 implements AutoCloseable {
   private final Long2ObjectLinkedOpenHashMap<class_1209> field_49760 = new Long2ObjectLinkedOpenHashMap();
   private final File field_49761;
   private final boolean field_49759;

   public class_9820(File var1, boolean var2) {
      this.field_49761 = var1;
      this.field_49759 = var2;
   }

   private class_1209 method_45248(class_2034 var1) throws IOException {
      long var4 = class_2034.method_9540(var1.method_9537(), var1.method_9544());
      class_1209 var6 = (class_1209)this.field_49760.getAndMoveToFirst(var4);
      if (var6 == null) {
         if (this.field_49760.size() >= 256) {
            ((class_1209)this.field_49760.removeLast()).close();
         }

         if (!this.field_49761.exists()) {
            this.field_49761.mkdirs();
         }

         File var7 = new File(this.field_49761, "r." + var1.method_9537() + "." + var1.method_9544() + ".mca");
         class_1209 var8 = new class_1209(var7, this.field_49761, this.field_49759);
         this.field_49760.putAndMoveToFirst(var4, var8);
         return var8;
      } else {
         return var6;
      }
   }

   @Nullable
   public CompoundNBT method_45249(class_2034 var1) throws IOException {
      class_1209 var4 = this.method_45248(var1);

      CompoundNBT var7;
      try (DataInputStream var5 = var4.method_5344(var1)) {
         if (var5 == null) {
            Object var9 = null;
            return (CompoundNBT)var9;
         }

         var7 = class_5957.method_27220(var5);
      }

      return var7;
   }

   public void method_45250(class_2034 var1, CompoundNBT var2) throws IOException {
      class_1209 var5 = this.method_45248(var1);

      try (DataOutputStream var6 = var5.method_5353(var1)) {
         class_5957.method_27224(var2, var6);
      }
   }

   @Override
   public void close() throws IOException {
      class_1405 var3 = new class_1405();
      ObjectIterator var4 = this.field_49760.values().iterator();

      while (var4.hasNext()) {
         class_1209 var5 = (class_1209)var4.next();

         try {
            var5.close();
         } catch (IOException var7) {
            var3.method_6485(var7);
         }
      }

      var3.method_6483();
   }

   public void method_45247() throws IOException {
      ObjectIterator var3 = this.field_49760.values().iterator();

      while (var3.hasNext()) {
         class_1209 var4 = (class_1209)var3.next();
         var4.method_5355();
      }
   }
}
