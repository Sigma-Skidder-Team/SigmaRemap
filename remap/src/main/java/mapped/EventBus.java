// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;

import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {
    public final Map<Class<? extends CancellableEvent>, EventHandler[]> handlersByEvent;
    public final Map<Class<? extends Module>, Map<Class<? extends CancellableEvent>, List<EventHandler>>> moduleHandlers;
    public int registrationCount;
    public long initTimestamp;

    public EventBus() {
        this.handlersByEvent = new HashMap<>();
        this.moduleHandlers = new HashMap<>();
        this.registrationCount = 0;
        this.initTimestamp = System.currentTimeMillis();
    }

    public boolean isValidEventHandler(Method method) {
        return method.isAnnotationPresent(EventListener.class)
                && method.getParameterCount() == 1
                && CancellableEvent.class.isAssignableFrom(method.getParameterTypes()[0]);
    }

    public EventHandler[] sortHandlersByPriority(EventHandler[] handlers) {
        List<EventHandler> sorted = new ArrayList<>();
        for (EventPriority priority : EventPriority.values()) {
            for (EventHandler handler : handlers) {
                if (handler.getPriority() == priority) {
                    sorted.add(handler);
                }
            }
        }
        return sorted.toArray(new EventHandler[0]);
    }

    public boolean containsHandler(EventHandler[] array, EventHandler handler) {
        for (EventHandler existing : array) {
            if (existing.equals(handler)) {
                return true;
            }
        }
        return false;
    }

    public boolean shouldAddHandler(EventHandler[] existingHandlers, Class<?> clazz, EventHandler newHandler) {
        try {
            Method method = newHandler.getListenerInstance().getClass()
                    .getMethod(newHandler.getHandlerMethod().getName(), newHandler.getHandlerMethod().getParameterTypes());
            return !containsHandler(existingHandlers, newHandler)
                    && (method.getDeclaringClass() == clazz || !isValidEventHandler(method));
        } catch (NoSuchMethodException e) {
            return true;
        } catch (SecurityException e) {
            e.printStackTrace();
            return false;
        }
    }

    public EventPriority getPriority(Method method) {
        if (method.isAnnotationPresent(HighestPriority.class)) {
            return EventPriority.HIGHEST_PRIORITY;
        }
        if (method.isAnnotationPresent(HigherPriority.class)) {
            return EventPriority.HIGHER_PRIORITY;
        }
        if (method.isAnnotationPresent(LowerPriority.class)) {
            return EventPriority.LOWER_PRIORITY;
        }
        if (!method.isAnnotationPresent(LowestPriority.class)) {
            return EventPriority.LOWEST_PRIORITY;
        }
        return EventPriority.DEFAULT_PRIORITY;
    }

    public void register(Module module) {
        Map<Class<? extends CancellableEvent>, List<EventHandler>> moduleMap = moduleHandlers.get(module.getClass());
        if (moduleMap != null) {
            for (Map.Entry<Class<? extends CancellableEvent>, List<EventHandler>> entry : moduleMap.entrySet()) {
                Class<? extends CancellableEvent> eventClass = entry.getKey();
                LinkedHashSet<EventHandler> combined = new LinkedHashSet<>(entry.getValue());
                combined.addAll(Arrays.asList(handlersByEvent.getOrDefault(eventClass, new EventHandler[0])));
                handlersByEvent.put(eventClass, sortHandlersByPriority(combined.toArray(new EventHandler[0])));
            }
        }
    }

    public void unregister(Module module) {
        Map<Class<? extends CancellableEvent>, List<EventHandler>> moduleMap = moduleHandlers.get(module.getClass());
        if (moduleMap != null) {
            for (Map.Entry<Class<? extends CancellableEvent>, List<EventHandler>> entry : moduleMap.entrySet()) {
                Class<? extends CancellableEvent> eventClass = entry.getKey();
                LinkedHashSet<EventHandler> set = new LinkedHashSet<>(Arrays.asList(
                        handlersByEvent.getOrDefault(eventClass, new EventHandler[0])
                ));
                set.removeAll(entry.getValue());
                handlersByEvent.put(eventClass, set.toArray(new EventHandler[0]));
            }
        }
        cleanEmptyHandlers();
    }

    public void registerInstance(Object instance) {
        if (instance == null) return;

        for (Class<?> clazz = instance.getClass(); clazz != null; clazz = clazz.getSuperclass()) {
            for (Method method : clazz.getDeclaredMethods()) {
                if (isValidEventHandler(method)) {
                    method.setAccessible(true);
                    EventPriority priority = getPriority(method);
                    Class<?> eventType = method.getParameterTypes()[0];

                    EventHandler[] existing = handlersByEvent.get(eventType);
                    if (existing == null) {
                        handlersByEvent.put((Class<? extends CancellableEvent>) eventType, existing = new EventHandler[0]);
                    }

                    EventHandler handler = new EventHandler(instance, clazz, method, priority);
                    if (shouldAddHandler(existing, clazz, handler)) {
                        if (!Module.class.isAssignableFrom(clazz) || method.isAnnotationPresent(Class6754.class)) {
                            EventHandler[] newHandlers = Arrays.copyOf(existing, existing.length + 1);
                            newHandlers[newHandlers.length - 1] = handler;
                            handlersByEvent.put((Class<? extends CancellableEvent>) eventType, sortHandlersByPriority(newHandlers));
                        } else if (!handler.isFromNCPPhase()) {
                            Map<Class<? extends CancellableEvent>, List<EventHandler>> map = moduleHandlers
                                    .getOrDefault(clazz, new HashMap<>());
                            List<EventHandler> list = map.get(eventType);
                            if (list == null) {
                                map.put((Class<? extends CancellableEvent>) eventType, list = new ArrayList<>());
                            }
                            list.add(handler);
                            map.put((Class<? extends CancellableEvent>) eventType, list);
                            moduleHandlers.put((Class<? extends Module>) clazz, map);
                        } else {
                            DeferredEventRegistry.pendingRegistrations.add(instance);
                        }
                    }
                }
            }
        }
        cleanEmptyHandlers();
    }

    public void cleanEmptyHandlers() {
        Iterator<EventHandler[]> iterator = handlersByEvent.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length == 0) {
                iterator.remove();
            }
        }
    }

    public void post(CancellableEvent event) {
        if (event == null) return;
        EventHandler[] array = handlersByEvent.get(event.getClass());
        if (array == null) return;
        try {
            for (EventHandler handler : array) {
                handler.getInvoker().invoke(handler.getListenerInstance(), event);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            Client.getInstance().getLogger().error("An unhandled exception occurred in an event handler's function");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
