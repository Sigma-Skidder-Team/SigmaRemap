package remapped;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class class_4808 implements Packet<class_392> {
   private int field_24062;
   private int field_24058;
   private int field_24057;
   private CompoundNBT field_24059;
   private int[] field_24055;
   private byte[] field_24060;
   public List<CompoundNBT> field_24064;
   public boolean field_24063;
   private Map<String, Object> field_24056;

   public class_4808() {
   }

   public class_4808(class_2654 var1, int var2) {
      class_2034 var5 = var1.method_27352();
      this.field_24062 = var5.field_10328;
      this.field_24058 = var5.field_10327;
      this.field_24063 = var2 == 65535;
      this.field_24059 = new CompoundNBT();

      for (Entry var7 : var1.method_27354()) {
         if (((class_3801)var7.getKey()).method_17677()) {
            this.field_24059.put(((class_3801)var7.getKey()).method_17676(), new class_1129(((class_2131)var7.getValue()).method_9954()));
         }
      }

      if (this.field_24063) {
         this.field_24055 = var1.method_27356().method_2643();
      }

      this.field_24060 = new byte[this.method_22142(var1, var2)];
      this.field_24057 = this.method_22148(new class_8248(this.method_22145()), var1, var2);
      this.field_24064 = Lists.newArrayList();

      for (Entry var14 : var1.method_12004().entrySet()) {
         class_1331 var8 = (class_1331)var14.getKey();
         class_3757 var9 = (class_3757)var14.getValue();
         int var10 = var8.method_12165() >> 4;
         if (this.method_22141() || (var2 & 1 << var10) != 0) {
            CompoundNBT var11 = var9.method_17414();
            this.field_24064.add(var11);
         }
      }

      this.field_24056 = new HashMap<String, Object>();
      class_6215 var13 = class_6907.method_31649(var1);
      this.field_24056.put("ChunkDataOF", var13);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_24062 = var1.readInt();
      this.field_24058 = var1.readInt();
      this.field_24063 = var1.readBoolean();
      this.field_24057 = var1.method_37778();
      this.field_24059 = var1.method_37775();
      if (this.field_24063) {
         this.field_24055 = var1.method_37763(class_546.field_3277);
      }

      int var4 = var1.method_37778();
      if (var4 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.field_24060 = new byte[var4];
         var1.readBytes(this.field_24060);
         int var5 = var1.method_37778();
         this.field_24064 = Lists.newArrayList();

         for (int var6 = 0; var6 < var5; var6++) {
            this.field_24064.add(var1.method_37775());
         }
      }
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.writeInt(this.field_24062);
      var1.writeInt(this.field_24058);
      var1.writeBoolean(this.field_24063);
      var1.method_37743(this.field_24057);
      var1.method_37749(this.field_24059);
      if (this.field_24055 != null) {
         var1.method_37777(this.field_24055);
      }

      var1.method_37743(this.field_24060.length);
      var1.writeBytes(this.field_24060);
      var1.method_37743(this.field_24064.size());

      for (CompoundNBT var5 : this.field_24064) {
         var1.method_37749(var5);
      }
   }

   public void method_22150(class_392 var1) {
      var1.method_1923(this);
   }

   public class_8248 method_22147() {
      return new class_8248(Unpooled.wrappedBuffer(this.field_24060), this.field_24056);
   }

   private ByteBuf method_22145() {
      ByteBuf var3 = Unpooled.wrappedBuffer(this.field_24060);
      var3.writerIndex(0);
      return var3;
   }

   public int method_22148(class_8248 var1, class_2654 var2, int var3) {
      int var6 = 0;
      class_1315[] var7 = var2.method_27349();
      int var8 = 0;

      for (int var9 = var7.length; var8 < var9; var8++) {
         class_1315 var10 = var7[var8];
         if (var10 != class_2654.field_13073 && (!this.method_22141() || !var10.method_6002()) && (var3 & 1 << var8) != 0) {
            var6 |= 1 << var8;
            var10.method_5998(var1);
         }
      }

      return var6;
   }

   public int method_22142(class_2654 var1, int var2) {
      int var5 = 0;
      class_1315[] var6 = var1.method_27349();
      int var7 = 0;

      for (int var8 = var6.length; var7 < var8; var7++) {
         class_1315 var9 = var6[var7];
         if (var9 != class_2654.field_13073 && (!this.method_22141() || !var9.method_6002()) && (var2 & 1 << var7) != 0) {
            var5 += var9.method_6004();
         }
      }

      return var5;
   }

   public int method_22149() {
      return this.field_24062;
   }

   public int method_22151() {
      return this.field_24058;
   }

   public int method_22152() {
      return this.field_24057;
   }

   public boolean method_22141() {
      return this.field_24063;
   }

   public CompoundNBT method_22146() {
      return this.field_24059;
   }

   public List<CompoundNBT> method_22143() {
      return this.field_24064;
   }

   @Nullable
   public int[] method_22144() {
      return this.field_24055;
   }
}
