package mapped;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface Sink extends Closeable, Flushable {
   void method7540(Class1734 var1, long var2) throws IOException;

   @Override
   void flush() throws IOException;

   Class4916 method7541();

   @Override
   void close() throws IOException;
}
