// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import java.io.InputStream;
import java.util.Iterator;
import java.util.HashMap;
import com.google.gson.Gson;
import java.io.IOException;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.Map;

public class Class1789 extends Class1776<Map<ResourceLocation, List<Class1737>>>
{
    public final /* synthetic */ Class1903 field9905;
    
    public Class1789(final Class1903 field9905) {
        this.field9905 = field9905;
    }
    
    public Map<ResourceLocation, List<Class1737>> method6375(final Class6582 class6582, final IProfiler class6583) {
        class6583.method15295();
        final Gson create = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        final HashMap hashMap = Maps.newHashMap();
        for (final ResourceLocation class6584 : class6582.method19936("font", s -> s.endsWith(".json"))) {
            final String method7797 = class6584.method7797();
            final ResourceLocation key = new ResourceLocation(class6584.method7798(), method7797.substring("font/".length(), method7797.length() - ".json".length()));
            final List list = (List)hashMap.computeIfAbsent(key, p0 -> Lists.newArrayList((Object[])new Class1737[] { new Class1739() }));
            class6583.method15298(key::toString);
            try {
                for (final Class1671 class6585 : class6582.method19935(class6584)) {
                    class6583.method15298(class6585::method5889);
                    try (final InputStream method7798 = class6585.method5887();
                         final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(method7798, StandardCharsets.UTF_8))) {
                        class6583.startSection("reading");
                        final JsonArray method7799 = Class9583.method35917(Class9583.method35928(create, bufferedReader, JsonObject.class), "providers");
                        class6583.method15300("parsing");
                        for (int i = method7799.size() - 1; i >= 0; --i) {
                            final JsonObject method7800 = Class9583.method35913(method7799.get(i), "providers[" + i + "]");
                            try {
                                final String method7801 = Class9583.method35895(method7800, "type");
                                final Class2030 method7802 = Class2030.method8086(method7801);
                                if (!Class1903.method7380(this.field9905) || method7802 == Class2030.field11570 || !key.equals(Minecraft.field4624)) {
                                    class6583.startSection(method7801);
                                    list.add(method7802.method8087(method7800).method25276(class6582));
                                    class6583.endSection();
                                }
                            }
                            catch (final RuntimeException ex) {
                                Class1903.method7381().warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", (Object)key, (Object)class6585.method5889(), (Object)ex.getMessage());
                            }
                        }
                        class6583.endSection();
                    }
                    catch (final RuntimeException ex2) {
                        Class1903.method7381().warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", (Object)key, (Object)class6585.method5889(), (Object)ex2.getMessage());
                    }
                    class6583.endSection();
                }
            }
            catch (final IOException ex3) {
                Class1903.method7381().warn("Unable to load font '{}' in fonts.json: {}", (Object)key, (Object)ex3.getMessage());
            }
            class6583.startSection("caching");
            for (char c = '\0'; c < '\uffff'; ++c) {
                if (c != ' ') {
                    final Iterator iterator3 = Lists.reverse(list).iterator();
                    while (iterator3.hasNext()) {
                        if (((Class1737)iterator3.next()).method6150(c) != null) {
                            break;
                        }
                    }
                }
            }
            class6583.endSection();
            class6583.endSection();
        }
        class6583.method15296();
        return hashMap;
    }
    
    public void method6377(final Map<ResourceLocation, List<Class1737>> p0, final Class6582 p1, final IProfiler p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface mapped/Class5028.method15295:()V
        //     6: aload_3        
        //     7: ldc_w           "reloading"
        //    10: invokeinterface mapped/Class5028.method15297:(Ljava/lang/String;)V
        //    15: aload_0        
        //    16: getfield        mapped/Class1789.field9905:Lmapped/Class1903;
        //    19: invokestatic    mapped/Class1903.method7382:(Lmapped/Class1903;)Ljava/util/Map;
        //    22: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    27: invokeinterface java/util/Set.stream:()Ljava/util/stream/Stream;
        //    32: aload_1        
        //    33: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //    38: invokeinterface java/util/Set.stream:()Ljava/util/stream/Stream;
        //    43: invokestatic    java/util/stream/Stream.concat:(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;
        //    46: invokeinterface java/util/stream/Stream.distinct:()Ljava/util/stream/Stream;
        //    51: aload_0        
        //    52: aload_1        
        //    53: invokedynamic   BootstrapMethod #4, accept:(Lmapped/Class1789;Ljava/util/Map;)Ljava/util/function/Consumer;
        //    58: invokeinterface java/util/stream/Stream.forEach:(Ljava/util/function/Consumer;)V
        //    63: aload_3        
        //    64: invokeinterface mapped/Class5028.method15299:()V
        //    69: aload_3        
        //    70: invokeinterface mapped/Class5028.method15296:()V
        //    75: return         
        //    Signature:
        //  (Ljava/util/Map<Lmapped/Class1932;Ljava/util/List<Lmapped/Class1737;>;>;Lmapped/Class6582;Lmapped/Class5028;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Could not infer any expression.
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:382)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:344)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public String method5848() {
        return "FontManager";
    }
}
