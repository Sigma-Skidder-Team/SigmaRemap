package mapped;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class Class3590 implements Comparator<Class6589> {
   public Class3590() {
   }

   public int compare(Class6589 var1, Class6589 var2) {
      Class8218 var5 = var1.method19976();
      Class8218 var6 = var2.method19976();
      return ComparisonChain.start()
         .compareTrueFirst(var1.method19967() != Class1894.field11105, var2.method19967() != Class1894.field11105)
         .compare(var5 == null ? "" : var5.method28567(), var6 == null ? "" : var6.method28567())
         .compare(var1.method19966().getName(), var2.method19966().getName(), String::compareToIgnoreCase)
         .result();
   }
}
