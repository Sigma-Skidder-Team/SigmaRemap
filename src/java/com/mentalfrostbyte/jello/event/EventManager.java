package com.mentalfrostbyte.jello.event;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.priority.*;
import com.mentalfrostbyte.jello.module.Module;
import mapped.Class5631;
import mapped.Class6715;

import java.lang.reflect.Method;
import java.util.*;
import java.util.Map.Entry;

public class EventManager {
    public final Map<Class<? extends Event>, MethodWrapper[]> field31401 = new HashMap<Class<? extends Event>, MethodWrapper[]>();
    public final Map<Class<? extends Module>, Map<Class<? extends Event>, List<MethodWrapper>>> field31402 = new HashMap<>();
    public int field31403 = 0;
    public long field31404 = System.currentTimeMillis();

    public boolean isEventMethod(Method var1) {
        return var1.isAnnotationPresent(EventTarget.class) && var1.getParameterCount() == 1 && Event.class.isAssignableFrom(var1.getParameterTypes()[0]);
    }

    public MethodWrapper[] filterByPriority(MethodWrapper[] var1) {
        List<MethodWrapper> var4 = new ArrayList<>();

        for (Priority var8 : Priority.values()) {
            for (MethodWrapper var12 : var1) {
                if (var12.method29026() == var8) {
                    var4.add(var12);
                }
            }
        }

        return var4.toArray(new MethodWrapper[0]);
    }

    public boolean method23210(MethodWrapper[] var1, MethodWrapper var2) {
        for (MethodWrapper var8 : var1) {
            if (var8.equals(var2)) {
                return true;
            }
        }

        return false;
    }

    public boolean method23211(MethodWrapper[] var1, Class<?> var2, MethodWrapper var3) {
        try {
            Method var6 = var3.method29022().getClass().getMethod(var3.method29025().getName(), var3.method29025().getParameterTypes());
            return !this.method23210(var1, var3) && (var6.getDeclaringClass() == var2 || !this.isEventMethod(var6));
        } catch (NoSuchMethodException var7) {
            return true;
        } catch (SecurityException var8) {
            var8.printStackTrace();
            return false;
        }
    }

    public Priority getMethodPriority(Method var1) {
        if (!var1.isAnnotationPresent(HigestPriority.class)) {
            if (!var1.isAnnotationPresent(HigherPriority.class)) {
                if (!var1.isAnnotationPresent(LowerPriority.class)) {
                    return !var1.isAnnotationPresent(LowestPriority.class) ? Priority.DEFAULT : Priority.LOWEST;
                } else {
                    return Priority.LOWER;
                }
            } else {
                return Priority.HIGHER;
            }
        } else {
            return Priority.HIGHEST;
        }
    }

    public void subscribe(Module var1) {
        Map<Class<? extends Event>, List<MethodWrapper>> var4 = this.field31402.get(var1.getClass());
        if (var4 != null) {
            for (Entry<Class<? extends Event>, List<MethodWrapper>> var6 : var4.entrySet()) {
                Class<? extends Event> var7 = var6.getKey();
                Set<MethodWrapper> var8 = new LinkedHashSet<>(var6.getValue());
                MethodWrapper[] var9 = this.field31401.getOrDefault(var7, new MethodWrapper[0]);
                var8.addAll(Arrays.asList(var9));
                this.field31401.put(var7, this.filterByPriority(var8.toArray(var9)));
            }
        }
    }

    public void unsubscribe(Module var1) {
        Map<Class<? extends Event>, List<MethodWrapper>> var4 = this.field31402.get(var1.getClass());
        if (var4 != null) {
            for (Entry<Class<? extends Event>, List<MethodWrapper>> var6 : var4.entrySet()) {
                Class<? extends Event> var7 = var6.getKey();
                List<MethodWrapper> var8 = var6.getValue();
                Set<MethodWrapper> var9 = new LinkedHashSet<>(Arrays.asList(this.field31401.getOrDefault(var7,
                        new MethodWrapper[0])));
                var9.removeAll(var8);
                this.field31401.put(var7, var9.toArray(new MethodWrapper[0]));
            }
        }

        this.method23217();
    }

    public void register(Object var1) {
        if (var1 != null) {
            boolean var4 = false;

            for (Class<?> var5 = var1.getClass(); var5 != null; var5 = var5.getSuperclass()) {
                for (Method var9 : var5.getDeclaredMethods()) {
                    if (this.isEventMethod(var9)) {
                        var9.setAccessible(true);
                        Priority var10 = this.getMethodPriority(var9);
                        Class<? extends Event> var11 = (Class<? extends Event>) var9.getParameterTypes()[0];
                        MethodWrapper[] var12 = this.field31401.computeIfAbsent(var11, k -> new MethodWrapper[0]);

                        MethodWrapper var13 = new MethodWrapper(var1, var5, var9, var10);
                        if (this.method23211(var12, var5, var13)) {
                            boolean var14 = Module.class.isAssignableFrom(var5) && !var9.isAnnotationPresent(Class5631.class);
                            if (!var14) {
                                var12 = Arrays.copyOf(var12, var12.length + 1);
                                var12[var12.length - 1] = var13;
                                this.field31401.put(var11, this.filterByPriority(var12));
                                var4 = true;
                            } else if (!var13.method29027()) {
                                Map<Class<? extends Event>, List<MethodWrapper>> var15 = this.field31402.getOrDefault(var5, new HashMap<Class<? extends Event>, List<MethodWrapper>>());
                                List<MethodWrapper> var16 = var15.computeIfAbsent(var11, k -> new ArrayList<>());

                                var16.add(var13);
                                var15.put(var11, var16);
                                this.field31402.put((Class<? extends Module>) var5, var15);
                            } else {
                                Class6715.field29433.add(var1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void method23216(Object var1) {
    }

    public void method23217() {
        this.field31401.values().removeIf(var4 -> var4.length == 0);
    }

    public void call(Event var1) {
        if (var1 != null) {
            MethodWrapper[] var4 = this.field31401.get(var1.getClass());
            if (var4 != null) {
                int var5 = var4.length;

                try {
                    for (int var6 = 0; var6 < var5; var6++) {
                        MethodWrapper var7 = var4[var6];
                        var7.method29024().method31519(var7.method29022(), var1);
                    }
                } catch (Exception var8) {
                    var8.printStackTrace();
                    Client.getInstance().getLogger().error("An unhandled exception occured in an event handler's function");
                } catch (Throwable var9) {
                    var9.printStackTrace();
                }
            }
        }
    }
}
