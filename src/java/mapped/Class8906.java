// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Class8906
{
    private static boolean field37444;
    private static Map<Class7499, Class4703> field37445;
    private static Map<Class5412, Class4158> field37446;
    
    public static void method31381() {
        final Map<Class7499, Class4703> method31382 = method31382();
        final Map<Class5412, Class4158> method31383 = method31383();
        if (method31382 != null) {
            if (method31383 != null) {
                Class8906.field37444 = false;
                method31382.clear();
                method31383.clear();
                method31382.putAll(Class8906.field37445);
                method31383.putAll(Class8906.field37446);
                if (Class8571.method29005()) {
                    final Class1932[] method31384 = method31384();
                    for (int i = 0; i < method31384.length; ++i) {
                        final Class1932 class1932 = method31384[i];
                        Class8571.method28847("CustomEntityModel: " + class1932.method7797());
                        final Class9559 method31385 = method31385(class1932);
                        if (method31385 != null) {
                            final Class8651<Class7499, Class5412> method31386 = method31385.method35767();
                            if (!(method31385 instanceof Class4703)) {
                                if (!(method31385 instanceof Class4158)) {
                                    Class8571.method28848("Unknown renderer type: " + ((Class4703<?>)method31385).getClass().getName());
                                }
                                else {
                                    method31383.put(method31386.method29437().get(), (Class4158<?>)method31385);
                                }
                            }
                            else {
                                method31382.put(method31386.method29436().get(), (Class4703<?>)method31385);
                            }
                            Class8906.field37444 = true;
                        }
                    }
                }
            }
            else {
                Class8571.method28848("Tile entity render map not found, custom entity models are DISABLED.");
            }
        }
        else {
            Class8571.method28848("Entity render map not found, custom entity models are DISABLED.");
        }
    }
    
    private static Map<Class7499, Class4703> method31382() {
        final Map<Class7499, Class4703> method28719 = Class869.method5277().method5306().method28719();
        if (method28719 != null) {
            if (Class8906.field37445 == null) {
                Class8906.field37445 = new HashMap<Class7499, Class4703>(method28719);
            }
            return method28719;
        }
        return null;
    }
    
    private static Map<Class5412, Class4158> method31383() {
        final Map<Class5412<?>, Class4158<?>> m = Class9550.field41126.field41125;
        if (Class8906.field37446 == null) {
            Class8906.field37446 = new HashMap<Class5412, Class4158>(m);
        }
        return (Map<Class5412, Class4158>)m;
    }
    
    private static Class1932[] method31384() {
        final String str = "optifine/cem/";
        final String str2 = ".jem";
        final ArrayList list = new ArrayList();
        final String[] method28191 = Class8447.method28191();
        for (int i = 0; i < method28191.length; ++i) {
            final Class1932 class1932 = new Class1932(str + method28191[i] + str2);
            if (Class8571.method28900(class1932)) {
                list.add(class1932);
            }
        }
        return (Class1932[])list.toArray(new Class1932[list.size()]);
    }
    
    private static Class9559 method31385(final Class1932 class1932) {
        try {
            return method31386(Class6904.method21259(class1932), class1932.method7797());
        }
        catch (final IOException ex) {
            Class8571.method28850("" + ex.getClass().getName() + ": " + ex.getMessage());
            return null;
        }
        catch (final JsonParseException ex2) {
            Class8571.method28850("" + ex2.getClass().getName() + ": " + ex2.getMessage());
            return null;
        }
        catch (final Exception ex3) {
            ex3.printStackTrace();
            return null;
        }
    }
    
    private static Class9559 method31386(final JsonObject jsonObject, final String s) {
        final Class9208 method21251 = Class6904.method21251(jsonObject, s);
        final String method21252 = method21251.method33680();
        final Class5509 method21253 = Class8447.method28190(method21252);
        method31390(method21253, "Entity not found: " + method21252);
        final Class8651<Class7499, Class5412> method21254 = method21253.method16815();
        method31390(method21254, "Entity type not found: " + method21252);
        final Class9559 method21255 = method31387(method21253, method21251);
        if (method21255 != null) {
            method21255.method35768(method21254);
            return method21255;
        }
        return null;
    }
    
    private static Class9559 method31387(final Class5509 class5509, final Class9208 class5510) {
        final Class1932 method33682 = class5510.method33682();
        final Class7856[] method33683 = class5510.method33683();
        float n = class5510.method33684();
        if (n < 0.0f) {
            n = class5509.method16818();
        }
        final Class5901 method33684 = class5509.method16811();
        if (method33684 == null) {
            return null;
        }
        if (!method31388(class5509, method33684, method33683, new Class5109(class5509, method33684, method33683))) {
            return null;
        }
        final Class9559 method33685 = class5509.method16814(method33684, n);
        if (method33685 != null) {
            if (method33682 != null) {
                method33685.method35770(method33682);
            }
            return method33685;
        }
        throw new JsonParseException("Entity renderer is null, model: " + class5509.method16816() + ", adapter: " + class5509.getClass().getName());
    }
    
    private static boolean method31388(final Class5509 class5509, final Class5901 class5510, final Class7856[] array, final Class5109 class5511) {
        for (int i = 0; i < array.length; ++i) {
            if (!method31389(class5509, class5510, array[i], class5511)) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean method31389(final Class5509 class5509, final Class5901 obj, final Class7856 class5510, final Class5109 class5511) {
        final String method25408 = class5510.method25408();
        final Class6300 method25409 = class5509.method16812(obj, method25408);
        if (method25409 != null) {
            if (!class5510.method25409()) {
                if (method25409.field25188 != null) {
                    method25409.field25188.clear();
                }
                if (method25409.field25190 != null) {
                    method25409.field25190.clear();
                }
                if (method25409.field25189 != null) {
                    final Class6300[] method25410 = class5509.method16819(obj);
                    final Set<Object> setFromMap = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
                    setFromMap.addAll(Arrays.asList(method25410));
                    final Iterator<Class6300> iterator = ((List<Class6300>)method25409.field25189).iterator();
                    while (iterator.hasNext()) {
                        if (setFromMap.contains(iterator.next())) {
                            continue;
                        }
                        iterator.remove();
                    }
                }
            }
            method25409.method18633(class5510.method25407());
            final Class8473 method25411 = class5510.method25410();
            if (method25411 != null) {
                class5511.method16009(class5510.method25407());
                class5511.method16008(method25409);
                if (!method25411.method28281(class5511)) {
                    return false;
                }
                class5510.method25407().method18658(method25411);
            }
            return true;
        }
        Class8571.method28848("Model part not found: " + method25408 + ", model: " + obj);
        return false;
    }
    
    private static void method31390(final Object o, final String s) {
        if (o != null) {
            return;
        }
        throw new JsonParseException(s);
    }
    
    public static boolean method31391() {
        return Class8906.field37444;
    }
    
    static {
        Class8906.field37444 = false;
        Class8906.field37445 = null;
        Class8906.field37446 = null;
    }
}
