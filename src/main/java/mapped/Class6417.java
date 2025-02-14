package mapped;

import java.io.IOException;

public class Class6417 implements Class6415 {
   private boolean field28247;
   public final Class8475 field28248;

   public Class6417(Class8475 var1, boolean var2) {
      this.field28248 = var1;
      this.field28247 = var2;
   }

   @Override
   public void method19539() throws IOException {
      if (!this.field28247 && Class8475.method29928(this.field28248) instanceof Class5935) {
         Class8475.method29941(this.field28248, (Integer)Class8475.method29942(this.field28248).method36684());
         Class8475.method29929(this.field28248, (Class6415)Class8475.method29939(this.field28248).method36684());
      } else {
         this.field28248.method29917();
         Class8475.method29950(this.field28248, Class8475.method29949(this.field28248));
         this.field28248.method29916("-", true, false, true);
         Class8475.method29939(this.field28248).method36683(new Class6417(this.field28248, false));
         Class8475.method29940(this.field28248, false, false, false);
      }
   }
}
