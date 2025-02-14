package mapped;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class Class6629 implements Class6627 {
   private static String[] field29160;
   private Class2292 field29161;
   private int field29162;
   private int field29163;

   public Class6629(
      Class2292 var1, Class2273 var2, int var3, int var4, int var5, Class2098 var6, Class2306 var7, ByteBuffer var8, int var9, boolean var10, boolean var11
   ) {
      this.field29161 = var1;
      this.field29162 = var9;
      this.field29163 = GL11.glGenTextures();
      GL11.glBindTexture(this.method20209(), this.field29163);
      Class8684.method31292();
      int var14 = var11 ? '脯' : 10497;
      int var15 = var10 ? 9729 : 9728;
      switch (Class9480.field44070[var1.ordinal()]) {
         case 1:
            GL11.glTexImage1D(3552, 0, var2.method8999(), var3, 0, var6.method8760(), var7.method9076(), var8);
            GL11.glTexParameteri(3552, 10242, var14);
            GL11.glTexParameteri(3552, 10240, var15);
            GL11.glTexParameteri(3552, 10241, var15);
            break;
         case 2:
            GL11.glTexImage2D(3553, 0, var2.method8999(), var3, var4, 0, var6.method8760(), var7.method9076(), var8);
            GL11.glTexParameteri(3553, 10242, var14);
            GL11.glTexParameteri(3553, 10243, var14);
            GL11.glTexParameteri(3553, 10240, var15);
            GL11.glTexParameteri(3553, 10241, var15);
            break;
         case 3:
            GL20.glTexImage3D(32879, 0, var2.method8999(), var3, var4, var5, 0, var6.method8760(), var7.method9076(), var8);
            GL11.glTexParameteri(32879, 10242, var14);
            GL11.glTexParameteri(32879, 10243, var14);
            GL11.glTexParameteri(32879, 32882, var14);
            GL11.glTexParameteri(32879, 10240, var15);
            GL11.glTexParameteri(32879, 10241, var15);
            break;
         case 4:
            GL11.glTexImage2D(34037, 0, var2.method8999(), var3, var4, 0, var6.method8760(), var7.method9076(), var8);
            GL11.glTexParameteri(34037, 10242, var14);
            GL11.glTexParameteri(34037, 10243, var14);
            GL11.glTexParameteri(34037, 10240, var15);
            GL11.glTexParameteri(34037, 10241, var15);
      }

      GL11.glBindTexture(this.method20209(), 0);
   }

   @Override
   public int method20209() {
      return this.field29161.method9041();
   }

   @Override
   public int method20207() {
      return this.field29163;
   }

   @Override
   public int method20208() {
      return this.field29162;
   }

   @Override
   public void method20203() {
      if (this.field29163 > 0) {
         GL11.glDeleteTextures(this.field29163);
         this.field29163 = 0;
      }
   }
}
