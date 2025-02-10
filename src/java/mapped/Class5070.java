package mapped;

import java.io.IOException;

public class Class5070 extends Class5041 {
   public static final String field23094 = "isom";
   public static final String field23095 = "iso2";
   public static final String field23096 = "iso3";
   public static final String field23097 = "mp41";
   public static final String field23098 = "mp42";
   public static final String field23099 = "mmp4";
   public static final String field23100 = "qm  ";
   public static final String field23101 = "avc1";
   public static final String field23102 = "M4A ";
   public static final String field23103 = "M4B ";
   public static final String field23104 = "M4P ";
   public static final String field23105 = "mp71";
   public String field23106;
   public String field23107;
   public String[] field23108;

   public Class5070() {
      super("File Type Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.field23106 = var1.readString(4);
      this.field23107 = var1.readString(4);
      this.field23108 = new String[(int)this.method15430(var1) / 4];

      for (int var4 = 0; var4 < this.field23108.length; var4++) {
         this.field23108[var4] = var1.readString(4);
      }
   }

   public String method15504() {
      return this.field23106;
   }

   public String method15505() {
      return this.field23107;
   }

   public String[] method15506() {
      return this.field23108;
   }
}
