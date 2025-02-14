package mapped;

import com.google.common.collect.Lists;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;

import net.minecraft.util.math.MathHelper;
import org.lwjgl.BufferUtils;

public class Class8516 {
   private static String[] field38213;
   private final List<ByteBuffer> field38214 = Lists.newArrayList();
   private final int field38215;
   private int field38216;
   private ByteBuffer field38217;

   public Class8516(int var1) {
      this.field38215 = var1 + 1 & -2;
      this.method30162();
   }

   private void method30162() {
      this.field38217 = BufferUtils.createByteBuffer(this.field38215);
   }

   public void method30163(float var1) {
      if (this.field38217.remaining() == 0) {
         ((Buffer)this.field38217).flip();
         this.field38214.add(this.field38217);
         this.method30162();
      }

      int var4 = MathHelper.clamp((int)(var1 * 32767.5F - 0.5F), -32768, 32767);
      this.field38217.putShort((short)var4);
      this.field38216 += 2;
   }

   public ByteBuffer method30164() {
      ((Buffer)this.field38217).flip();
      if (!this.field38214.isEmpty()) {
         ByteBuffer var3 = BufferUtils.createByteBuffer(this.field38216);
         this.field38214.forEach(var3::put);
         var3.put(this.field38217);
         ((Buffer)var3).flip();
         return var3;
      } else {
         return this.field38217;
      }
   }

   // $VF: synthetic method
   public static int method30165(Class8516 var0) {
      return var0.field38216;
   }
}
