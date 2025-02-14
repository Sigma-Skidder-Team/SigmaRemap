package mapped;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.*;

public class Class2513 implements Serializable {
   private static final long field16629 = -6024911025449780478L;
   private Throwable field16630;
   private List<Class2298> field16631;
   private List<Object[]> field16632;
   private Map<String, Object> field16633;

   public Class2513(Throwable var1) {
      this.field16630 = var1;
      this.field16631 = new ArrayList<Class2298>();
      this.field16632 = new ArrayList<Object[]>();
      this.field16633 = new HashMap<String, Object>();
   }

   public Throwable method10499() {
      return this.field16630;
   }

   public void method10500(Class2298 var1, Object... var2) {
      this.field16631.add(var1);
      this.field16632.add(Class8380.method29374(var2));
   }

   public void method10501(String var1, Object var2) {
      this.field16633.put(var1, var2);
   }

   public Object method10502(String var1) {
      return this.field16633.get(var1);
   }

   public Set<String> method10503() {
      return this.field16633.keySet();
   }

   public String method10504() {
      return this.method10506(Locale.US);
   }

   public String method10505() {
      return this.method10506(Locale.getDefault());
   }

   public String method10506(Locale var1) {
      return this.method10508(var1, ": ");
   }

   public String method10507(Locale var1, String var2) {
      return this.method10508(var1, var2);
   }

   private String method10508(Locale var1, String var2) {
      StringBuilder var5 = new StringBuilder();
      int var6 = 0;
      int var7 = this.field16631.size();

      for (int var8 = 0; var8 < var7; var8++) {
         Class2298 var9 = this.field16631.get(var8);
         Object[] var10 = this.field16632.get(var8);
         MessageFormat var11 = new MessageFormat(var9.method9063(var1), var1);
         var5.append(var11.format(var10));
         if (++var6 < var7) {
            var5.append(var2);
         }
      }

      return var5.toString();
   }

   private void method10509(ObjectOutputStream var1) throws IOException {
      var1.writeObject(this.field16630);
      this.method10511(var1);
      this.method10513(var1);
   }

   private void method10510(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      this.field16630 = (Throwable)var1.readObject();
      this.method10512(var1);
      this.method10514(var1);
   }

   private void method10511(ObjectOutputStream var1) throws IOException {
      int var4 = this.field16631.size();
      var1.writeInt(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         Class2298 var6 = this.field16631.get(var5);
         var1.writeObject(var6);
         Object[] var7 = this.field16632.get(var5);
         int var8 = var7.length;
         var1.writeInt(var8);

         for (int var9 = 0; var9 < var8; var9++) {
            if (!(var7[var9] instanceof Serializable)) {
               var1.writeObject(this.method10515(var7[var9]));
            } else {
               var1.writeObject(var7[var9]);
            }
         }
      }
   }

   private void method10512(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      int var4 = var1.readInt();
      this.field16631 = new ArrayList<Class2298>(var4);
      this.field16632 = new ArrayList<Object[]>(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         Class2298 var6 = (Class2298)var1.readObject();
         this.field16631.add(var6);
         int var7 = var1.readInt();
         Object[] var8 = new Object[var7];

         for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var1.readObject();
         }

         this.field16632.add(var8);
      }
   }

   private void method10513(ObjectOutputStream var1) throws IOException {
      int var4 = this.field16633.keySet().size();
      var1.writeInt(var4);

      for (String var6 : this.field16633.keySet()) {
         var1.writeObject(var6);
         Object var7 = this.field16633.get(var6);
         if (!(var7 instanceof Serializable)) {
            var1.writeObject(this.method10515(var7));
         } else {
            var1.writeObject(var7);
         }
      }
   }

   private void method10514(ObjectInputStream var1) throws IOException, ClassNotFoundException {
      int var4 = var1.readInt();
      this.field16633 = new HashMap<String, Object>();

      for (int var5 = 0; var5 < var4; var5++) {
         String var6 = (String)var1.readObject();
         Object var7 = var1.readObject();
         this.field16633.put(var6, var7);
      }
   }

   private String method10515(Object var1) {
      return "[Object could not be serialized: " + var1.getClass().getName() + "]";
   }
}
