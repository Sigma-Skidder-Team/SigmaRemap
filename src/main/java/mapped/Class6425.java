package mapped;

import java.io.IOException;

public class Class6425 implements Class6415 {
   private boolean field28259;
   public final Class8475 field28260;

   public Class6425(Class8475 var1, boolean var2) {
      this.field28260 = var1;
      this.field28259 = var2;
   }

   @Override
   public void method19539() throws IOException {
      if (!this.field28259 && Class8475.method29928(this.field28260) instanceof Class5936) {
         Class8475.method29941(this.field28260, (Integer)Class8475.method29942(this.field28260).method36684());
         Class8475.method29929(this.field28260, (Class6415)Class8475.method29939(this.field28260).method36684());
      } else {
         this.field28260.method29917();
         if (!Class8475.method29948(this.field28260)) {
            this.field28260.method29916("?", true, false, true);
            Class8475.method29939(this.field28260).method36683(new Class6420(this.field28260));
            Class8475.method29940(this.field28260, false, true, false);
         } else {
            Class8475.method29939(this.field28260).method36683(new Class6424(this.field28260));
            Class8475.method29940(this.field28260, false, true, true);
         }
      }
   }
}
