package remapped;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import org.apache.commons.lang3.reflect.FieldUtils;

public class PacketDumperModule extends Module {
   public FileWriter field_49040;

   public PacketDumperModule() {
      super(Category.MISC, "Packet dumper", "Dumps packets sent to and fro from the client and server");

      try {
         File var3 = new File(SigmaMainClass.method_3328().method_3334() + "/latest_packets.txt");
         if (!var3.exists()) {
            var3.createNewFile();
         }

         this.field_49040 = new FileWriter(var3);
      } catch (IOException var4) {
         var4.printStackTrace();
      }
   }

   private String method_44433(Field var1, Object var2) throws IllegalArgumentException, IllegalAccessException {
      var1.setAccessible(true);
      if (var1.getType() != int.class) {
         if (var1.getType() != boolean.class) {
            if (var1.getType() != float.class) {
               if (var1.getType() != double.class) {
                  if (var1.getType() != long.class) {
                     if (var1.getType() != char.class) {
                        if (var1.getType() != byte.class) {
                           if (var1.getType() != short.class) {
                              return var1.get(var2) != null ? var1.get(var2).toString() : "null";
                           } else {
                              return Short.toString(var1.getShort(var2));
                           }
                        } else {
                           return Byte.toString(var1.getByte(var2));
                        }
                     } else {
                        return Character.toString(var1.getChar(var2));
                     }
                  } else {
                     return Long.toString(var1.getLong(var2));
                  }
               } else {
                  return Double.toString(var1.getDouble(var2));
               }
            } else {
               return Float.toString(var1.getFloat(var2));
            }
         } else {
            return Boolean.toString(var1.getBoolean(var2));
         }
      } else {
         return Integer.toString(var1.getInt(var2));
      }
   }

   private void method_44432(class_6310 var1, boolean var2) {
      try {
         this.field_49040.write((var2 ? "-->" : "<--") + "\t" + var1.getClass().getSimpleName() + "\n");

         for (Field var8 : FieldUtils.getAllFields(var1.getClass())) {
            try {
               this.field_49040.write("\t\t" + var8.getName() + "=" + this.method_44433(var8, var1) + "\n");
            } catch (Exception var10) {
               var10.printStackTrace();
            }
         }
      } catch (IOException var11) {
         var11.printStackTrace();
      }
   }

   @EventListen
   private void method_44435(class_2157 var1) {
      if (this.method_42015()) {
         this.method_44432(var1.method_10047(), true);
      }
   }

   @EventListen
   private void method_44431(class_139 var1) {
      if (this.method_42015()) {
         this.method_44432(var1.method_557(), false);
      }
   }

   @EventListen
   private void method_44434(class_4975 var1) {
      try {
         this.field_49040.close();
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }
}
