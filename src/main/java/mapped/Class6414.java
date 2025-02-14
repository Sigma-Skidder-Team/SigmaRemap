package mapped;

import java.io.IOException;

public class Class6414 implements Class6415 {
   public final Class8475 field28245;

   public Class6414(Class8475 var1) {
      this.field28245 = var1;
   }

   @Override
   public void method19539() throws IOException {
      if (!(Class8475.method29928(this.field28245) instanceof Class5936)) {
         this.field28245.method29916(",", false, false, false);
         if (Class8475.method29937(this.field28245)
            || Class8475.method29944(this.field28245) > Class8475.method29945(this.field28245) && Class8475.method29946(this.field28245)
            || Class8475.method29947(this.field28245)) {
            this.field28245.method29917();
         }

         if (!Class8475.method29937(this.field28245) && Class8475.method29948(this.field28245)) {
            Class8475.method29939(this.field28245).method36683(new Class6423(this.field28245));
            Class8475.method29940(this.field28245, false, true, true);
         } else {
            this.field28245.method29916("?", true, false, false);
            Class8475.method29939(this.field28245).method36683(new Class6432(this.field28245));
            Class8475.method29940(this.field28245, false, true, false);
         }
      } else {
         Class8475.method29941(this.field28245, (Integer)Class8475.method29942(this.field28245).method36684());
         Class8475.method29943(this.field28245);
         if (Class8475.method29937(this.field28245)) {
            this.field28245.method29916(",", false, false, false);
            this.field28245.method29917();
         }

         if (Class8475.method29947(this.field28245)) {
            this.field28245.method29917();
         }

         this.field28245.method29916("}", false, false, false);
         Class8475.method29929(this.field28245, (Class6415)Class8475.method29939(this.field28245).method36684());
      }
   }
}
