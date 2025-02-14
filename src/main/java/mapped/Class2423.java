package mapped;

import java.io.Serializable;
import java.util.ArrayList;

public class Class2423 implements Serializable {
   private static final long field16429 = 1L;
   private ArrayList field16430 = new ArrayList();

   public int method10376() {
      return this.field16430.size();
   }

   public Class2425 method10377(int var1) {
      return (Class2425)this.field16430.get(var1);
   }

   public int method10378(int var1) {
      return Class2425.method10389(this.method10377(var1));
   }

   public int method10379(int var1) {
      return Class2425.method10390(this.method10377(var1));
   }

   public void method10380(int var1, int var2) {
      this.field16430.add(new Class2425(this, var1, var2));
   }

   public void method10381(int var1, int var2) {
      this.field16430.add(0, new Class2425(this, var1, var2));
   }

   public boolean method10382(int var1, int var2) {
      return this.field16430.contains(new Class2425(this, var1, var2));
   }
}
