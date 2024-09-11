package mapped;

import io.netty.buffer.ByteBuf;

import java.io.IOException;

public class Class3068 implements Class2982 {
   public final Class4012 field18235;

   public Class3068(Class4012 var1) {
      this.field18235 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      var1.method30578();
      Class5419 var4 = ViaVersion3.getInstance().method34424().<Class5419>method31084(Class5419.class);
      if (var4.method17015()) {
         for (Object var7 : var4.method17013(var1, var1.method30580().<Class6051>method22438(Class6051.class))) {
            if (!(var7 instanceof Class8563)) {
               throw new IOException("transformMapChunkBulk returned the wrong object type");
            }

            Class8563 var8 = (Class8563)var7;
            ByteBuf var9 = var1.method30580().method22464().alloc().buffer();

            try {
               var8.method30587(-1);
               var8.method30563(var9);
               Class8563 var10 = new Class8563(33, var9, var1.method30580());
               var10.method30568(Class6363.class, false, true);
            } finally {
               var9.release();
            }
         }
      }
   }
}
