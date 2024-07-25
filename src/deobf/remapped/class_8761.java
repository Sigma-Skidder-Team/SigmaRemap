package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class class_8761 {
   private static String[] field_44854;
   private final List<ConcurrentLinkedQueue<class_156>> field_44855 = ImmutableList.of(
      new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue(), new ConcurrentLinkedQueue()
   );
   private volatile int field_44853;
   private volatile int field_44857;
   private volatile int field_44856;

   public class_8761() {
      this.field_44853 = this.field_44857 = this.field_44856 + 1;
   }
}
