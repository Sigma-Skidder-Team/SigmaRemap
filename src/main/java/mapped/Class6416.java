package mapped;

import java.io.IOException;

public class Class6416 implements Class6415 {
   public final Class8475 field28246;

   public Class6416(Class8475 var1) {
      this.field28246 = var1;
   }

   @Override
   public void method19539() throws IOException {
      if (!(Class8475.method29928(this.field28246) instanceof Class5936)) {
         if (Class8475.method29937(this.field28246)
            || Class8475.method29944(this.field28246) > Class8475.method29945(this.field28246) && Class8475.method29946(this.field28246)
            || Class8475.method29947(this.field28246)) {
            this.field28246.method29917();
         }

         if (!Class8475.method29937(this.field28246) && Class8475.method29948(this.field28246)) {
            Class8475.method29939(this.field28246).method36683(new Class6423(this.field28246));
            Class8475.method29940(this.field28246, false, true, true);
         } else {
            this.field28246.method29916("?", true, false, false);
            Class8475.method29939(this.field28246).method36683(new Class6432(this.field28246));
            Class8475.method29940(this.field28246, false, true, false);
         }
      } else {
         Class8475.method29941(this.field28246, (Integer)Class8475.method29942(this.field28246).method36684());
         Class8475.method29943(this.field28246);
         this.field28246.method29916("}", false, false, false);
         Class8475.method29929(this.field28246, (Class6415)Class8475.method29939(this.field28246).method36684());
      }
   }
}
