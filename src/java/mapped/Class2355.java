package mapped;

import java.util.Iterator;

public class Class2355 implements Iterable<Class5931> {
   private static String[] field16167;
   private Iterator<Class5931> field16168;

   public Class2355(Iterator<Class5931> var1) {
      this.field16168 = var1;
   }

   @Override
   public Iterator<Class5931> iterator() {
      return this.field16168;
   }
}
