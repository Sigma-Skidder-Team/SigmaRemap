package mapped;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import com.mentalfrostbyte.jello.Client;
import org.lwjgl.BufferUtils;

public class Class8444 {
   private static String[] field36183;
   public Class1674 field36184;
   public ByteBuffer field36185;
   public boolean field36186;

   public Class8444(Class1674 var1) {
      this.field36184 = var1;
      this.field36185 = BufferUtils.createByteBuffer(768);
      this.method29695();
   }

   public void method29695() {
      this.field36185 = BufferUtils.createByteBuffer(768);
      int var3 = this.field36184.method7072().field32174 * 16;
      int var4 = this.field36184.method7072().field32175 * 16;

      for (int var5 = 0; var5 < 16; var5++) {
         for (int var6 = 0; var6 < 16; var6++) {
            BlockPos var7 = new BlockPos(var3 + var5, 64, var4 + var6);
            int var8 = Client.getInstance()
               .getWaypointsManager()
               .method30006(
                  new BlockPos(var7.method8304(), this.field36184.method7070(Class101.field296).method24579(var5, var6) - 1, var7.method8306()), true
               );
            this.field36185.put((byte)(var8 >> 16 & 0xFF));
            this.field36185.put((byte)(var8 >> 8 & 0xFF));
            this.field36185.put((byte)(var8 & 0xFF));
         }
      }

      ((Buffer)this.field36185).flip();
      this.field36186 = this.method29697();
   }

   public void method29696() {
      if (!this.field36186 && this.method29697()) {
         this.method29695();
      }
   }

   private boolean method29697() {
      Class1674 var3 = Class5274.method16504().world.method6824(this.field36184.method7072().field32174, this.field36184.method7072().field32175 + 1);
      Class1674 var4 = Class5274.method16505().world.method6824(this.field36184.method7072().field32174, this.field36184.method7072().field32175 - 1);
      return var3 != null && var3.field9115 && var4 != null && var4.field9115;
   }

   public boolean method29698(Class1674 var1) {
      return var1.method7072().field32174 == this.field36184.method7072().field32174 && var1.method7072().field32175 == this.field36184.method7072().field32175;
   }
}
