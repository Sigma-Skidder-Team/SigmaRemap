package remapped;

import io.netty.buffer.ByteBuf;
import java.io.IOException;

public class class_8935 implements class_857 {
   public class_8935(class_8505 var1) {
      this.field_45782 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      var1.method_23245();
      class_7627 var4 = class_3446.method_15883().method_33743().<class_7627>method_24490(class_7627.class);
      if (var4.method_34574()) {
         for (Object var7 : var4.method_34575(var1, var1.method_23255().<class_7291>method_6746(class_7291.class))) {
            if (!(var7 instanceof class_5051)) {
               throw new IOException("transformMapChunkBulk returned the wrong object type");
            }

            class_5051 var8 = (class_5051)var7;
            ByteBuf var9 = var1.method_23255().method_6733().alloc().buffer();

            try {
               var8.method_23253(-1);
               var8.method_23254(var9);
               class_5051 var10 = new class_5051(33, var9, var1.method_23255());
               var10.method_23235(class_6890.class, false, true);
            } finally {
               var9.release();
            }
         }
      }
   }
}
