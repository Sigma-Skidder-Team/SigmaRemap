package remapped;

import com.google.common.collect.Lists;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

public class class_4915 {
   private static String[] field_25436;
   private final List<ByteBuffer> field_25432 = Lists.newArrayList();
   private final int field_25435;
   private int field_25433;
   private ByteBuffer field_25434;

   public class_4915(int var1) {
      this.field_25435 = var1 + 1 & -2;
      this.method_22511();
   }

   private void method_22511() {
      this.field_25434 = BufferUtils.createByteBuffer(this.field_25435);
   }

   public void method_22508(float var1) {
      if (this.field_25434.remaining() == 0) {
         ((Buffer)this.field_25434).flip();
         this.field_25432.add(this.field_25434);
         this.method_22511();
      }

      int var4 = MathHelper.clamp((int)(var1 * 32767.5F - 0.5F), -32768, 32767);
      this.field_25434.putShort((short)var4);
      this.field_25433 += 2;
   }

   public ByteBuffer method_22509() {
      ((Buffer)this.field_25434).flip();
      if (!this.field_25432.isEmpty()) {
         ByteBuffer var3 = BufferUtils.createByteBuffer(this.field_25433);
         this.field_25432.forEach(var3::put);
         var3.put(this.field_25434);
         ((Buffer)var3).flip();
         return var3;
      } else {
         return this.field_25434;
      }
   }
}
