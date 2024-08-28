package mapped;

import java.util.HashMap;
import java.util.Map;

public enum Class1983 {
   field12944((byte)0, (byte)0, (byte)-1, Class2284.field15119),
   field12945((byte)0, (byte)0, (byte)1, Class2284.field15119),
   field12946((byte)1, (byte)0, (byte)0, Class2284.field15117),
   field12947((byte)-1, (byte)0, (byte)0, Class2284.field15117),
   field12948((byte)0, (byte)1, (byte)0, Class2284.field15118),
   field12949((byte)0, (byte)-1, (byte)0, Class2284.field15118);

   private static final Map<Class1983, Class1983> field12950 = new HashMap<Class1983, Class1983>();
   private final byte field12951;
   private final byte field12952;
   private final byte field12953;
   private final Class2284 field12954;
   private static final Class1983[] field12955 = new Class1983[]{field12944, field12945, field12946, field12947, field12948, field12949};

   private Class1983(byte var3, byte var4, byte var5, Class2284 var6) {
      this.field12951 = var3;
      this.field12952 = var4;
      this.field12953 = var5;
      this.field12954 = var6;
   }

   public Class1983 method8265() {
      return field12950.get(this);
   }

   public byte method8266() {
      return this.field12951;
   }

   public byte method8267() {
      return this.field12952;
   }

   public byte method8268() {
      return this.field12953;
   }

   public Class2284 method8269() {
      return this.field12954;
   }

   static {
      field12950.put(field12944, field12945);
      field12950.put(field12945, field12944);
      field12950.put(field12946, field12947);
      field12950.put(field12947, field12946);
      field12950.put(field12948, field12949);
      field12950.put(field12949, field12948);
   }
}
