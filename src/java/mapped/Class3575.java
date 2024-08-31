package mapped;

import com.google.common.collect.ComparisonChain;
import com.mojang.realmsclient.dto.RealmsServer;

import java.util.Comparator;

public class Class3575 implements Comparator<RealmsServer> {
   private static String[] field19514;
   private final String field19515;

   public Class3575(String var1) {
      this.field19515 = var1;
   }

   public int compare(RealmsServer var1, RealmsServer var2) {
      return ComparisonChain.start()
         .compareTrueFirst(var1.field27447 == Class2261.field14708, var2.field27447 == Class2261.field14708)
         .compareTrueFirst(var1.field27453, var2.field27453)
         .compareTrueFirst(var1.field27448.equals(this.field19515), var2.field27448.equals(this.field19515))
         .compareFalseFirst(var1.field27452, var2.field27452)
         .compareTrueFirst(var1.field27447 == Class2261.field14707, var2.field27447 == Class2261.field14707)
         .compare(var1.field27443, var2.field27443)
         .result();
   }
}
