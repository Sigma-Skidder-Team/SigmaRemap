package mapped;

import com.google.common.collect.Lists;
import java.util.Collection;

public class Class7879 {
   private static String[] field33819;
   public static final Class7879 field33820 = new Class7879();
   private final Collection<Class8262> field33821 = Lists.newCopyOnWriteArrayList();

   public void method26415(Class8262 var1) {
      this.field33821.add(var1);
   }

   public void method26416() {
      this.field33821.clear();
   }

   public void method26417() {
      this.field33821.forEach(Class8262::method28804);
      this.field33821.removeIf(Class8262::method28812);
   }
}
