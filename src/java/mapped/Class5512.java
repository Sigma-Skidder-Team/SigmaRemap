package mapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class Class5512 implements Packet<Class5116> {
   private List<Class4843<?>> field24461;

   public Class5512() {
   }

   public Class5512(Collection<Class4843<?>> var1) {
      this.field24461 = Lists.newArrayList(var1);
   }

   public void method17180(Class5116 var1) {
      var1.method15771(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24461 = Lists.newArrayList();
      int var4 = var1.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         this.field24461.add(method17332(var1));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24461.size());

      for (Class4843 var5 : this.field24461) {
         method17333(var5, var1);
      }
   }

   public List<Class4843<?>> method17331() {
      return this.field24461;
   }

   public static Class4843<?> method17332(PacketBuffer var0) {
      ResourceLocation var3 = var0.method35731();
      ResourceLocation var4 = var0.method35731();
      return Class2348.field16086.method9187(var3).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + var3)).method19699(var4, var0);
   }

   public static <T extends Class4843<?>> void method17333(T var0, PacketBuffer var1) {
      var1.method35732(Class2348.field16086.method9181(var0.method14961()));
      var1.method35732(var0.method14964());
      ((Class6504<T>)var0.method14961()).method19698(var1, var0);
   }
}
