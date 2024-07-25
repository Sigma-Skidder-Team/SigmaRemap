package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public interface class_8169 extends AutoCloseable {
   InputStream method_37465(String var1) throws IOException;

   InputStream method_37466(class_3168 var1, Identifier var2) throws IOException;

   Collection<Identifier> method_37464(class_3168 var1, String var2, String var3, int var4, Predicate<String> var5);

   boolean method_37467(class_3168 var1, Identifier var2);

   Set<String> method_37468(class_3168 var1);

   @Nullable
   <T> T method_37469(class_6146<T> var1) throws IOException;

   String method_37470();

   @Override
   void close();
}
