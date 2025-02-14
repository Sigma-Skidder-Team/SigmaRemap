package net.minecraft.server.dedicated;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanConstructorInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanOperationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

import mapped.Class9401;
import mapped.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ServerInfoMBean implements DynamicMBean {
   private static final Logger field41931 = LogManager.getLogger();
   private final MinecraftServer field41932;
   private final MBeanInfo field41933;
   private final Map<String, Class9401> field41934 = Stream.<Class9401>of(
         new Class9401("tickTimes", this::method34054, "Historical tick times (ms)", long[].class),
         new Class9401("averageTickTime", this::method34053, "Current average tick time (ms)", long.class)
      )
      .collect(Collectors.toMap(var0 -> Class9401.method35742(var0), Function.<Class9401>identity()));

   private ServerInfoMBean(MinecraftServer var1) {
      this.field41932 = var1;
      MBeanAttributeInfo[] var4 = this.field41934
         .values()
         .stream()
         .<MBeanAttributeInfo>map(var0 -> Class9401.method35743(var0))
         .<MBeanAttributeInfo>toArray(MBeanAttributeInfo[]::new);
      this.field41933 = new MBeanInfo(
         ServerInfoMBean.class.getSimpleName(),
         "metrics for dedicated server",
         var4,
         (MBeanConstructorInfo[])null,
         (MBeanOperationInfo[])null,
         new MBeanNotificationInfo[0]
      );
   }

   public static void func_233490_a_(MinecraftServer var0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new ServerInfoMBean(var0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException | InstanceAlreadyExistsException var4) {
         field41931.warn("Failed to initialise server as JMX bean", var4);
      }
   }

   private float method34053() {
      return this.field41932.method1417();
   }

   private long[] method34054() {
      return this.field41932.tickTimeArray;
   }

   @Nullable
   @Override
   public Object getAttribute(String var1) {
      Class9401 var4 = this.field41934.get(var1);
      return var4 != null ? Class9401.method35741(var4).get() : null;
   }

   @Override
   public void setAttribute(Attribute var1) {
   }

   @Override
   public AttributeList getAttributes(String[] var1) {
      List var4 = Arrays.<String>stream(var1)
         .<Class9401>map(this.field41934::get)
         .filter(Objects::nonNull)
         .<Attribute>map(var0 -> new Attribute(Class9401.method35742(var0), Class9401.method35741(var0).get()))
         .collect(Collectors.toList());
      return new AttributeList(var4);
   }

   @Override
   public AttributeList setAttributes(AttributeList var1) {
      return new AttributeList();
   }

   @Nullable
   @Override
   public Object invoke(String var1, Object[] var2, String[] var3) {
      return null;
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.field41933;
   }
}
