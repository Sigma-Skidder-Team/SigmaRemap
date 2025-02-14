package mapped;

import java.util.HashMap;

public class Class9616 {
   private HashMap<Integer, Class8255> field44952 = new HashMap<Integer, Class8255>();
   private byte field44953 = 100;
   private String field44954 = "";

   public HashMap<Integer, Class8255> method37429() {
      return this.field44952;
   }

   public void method37430(HashMap<Integer, Class8255> var1) {
      this.field44952 = var1;
   }

   public String method37431() {
      return this.field44954;
   }

   public void method37432(String var1) {
      this.field44954 = var1;
   }

   public Class8255 method37433(int var1) {
      return this.field44952.get(var1);
   }

   public void method37434(int var1, Class8255 var2) {
      this.field44952.put(var1, var2);
   }

   public byte method37435() {
      return this.field44953;
   }

   public void method37436(byte var1) {
      this.field44953 = var1;
   }
}
