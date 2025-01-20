package com.mentalfrostbyte.jello.event;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.priority.*;
import com.mentalfrostbyte.jello.module.Module;
import mapped.Class5631;

import java.lang.reflect.Method;
import java.util.*;
import java.util.Map.Entry;

public class EventManager {

    // Event list and module event mappings
    public final Map<Class<? extends Event>, MethodWrapper[]> eventHandlers = new HashMap<>();
    public final Map<Class<? extends Module>, Map<Class<? extends Event>, List<MethodWrapper>>> moduleEventHandlers = new HashMap<>();

    public boolean isEventMethod(Method method) {
        return method.isAnnotationPresent(EventTarget.class) &&
                method.getParameterCount() == 1 &&
                Event.class.isAssignableFrom(method.getParameterTypes()[0]);
    }

    public MethodWrapper[] sortHandlersByPriority(MethodWrapper[] handlers) {
        List<MethodWrapper> sortedHandlers = new ArrayList<>();

        for (Priority priority : Priority.values()) {
            for (MethodWrapper handler : handlers) {
                if (handler.getPriority() == priority) {
                    sortedHandlers.add(handler);
                }
            }
        }

        return sortedHandlers.toArray(new MethodWrapper[0]);
    }

    public boolean containsHandler(MethodWrapper[] handlers, MethodWrapper handler) {
        for (MethodWrapper existingHandler : handlers) {
            if (existingHandler.equals(handler)) {
                return true;
            }
        }

        return false;
    }

    public boolean shouldRegisterHandler(MethodWrapper[] handlers, Class<?> declaringClass, MethodWrapper handler) {
        try {
            Method method = handler.getParent().getClass().getMethod(handler.getMethod().getName(), handler.getMethod().getParameterTypes());
            return !this.containsHandler(handlers, handler) && (method.getDeclaringClass() == declaringClass || !this.isEventMethod(method));
        } catch (NoSuchMethodException e) {
            return true;
        } catch (SecurityException e) {
            return false;
        }
    }

    public Priority getMethodPriority(Method method) {
        if (method.isAnnotationPresent(HigestPriority.class)) {
            return Priority.HIGHEST;
        } else if (method.isAnnotationPresent(HigherPriority.class)) {
            return Priority.HIGHER;
        } else if (method.isAnnotationPresent(LowerPriority.class)) {
            return Priority.LOWER;
        } else {
            return !method.isAnnotationPresent(LowestPriority.class) ? Priority.DEFAULT : Priority.LOWEST;
        }
    }

    public void subscribe(Module module) {
        Map<Class<? extends Event>, List<MethodWrapper>> moduleHandlers = this.moduleEventHandlers.get(module.getClass());
        if (moduleHandlers != null) {
            for (Entry<Class<? extends Event>, List<MethodWrapper>> entry : moduleHandlers.entrySet()) {
                Class<? extends Event> eventType = entry.getKey();
                Set<MethodWrapper> handlers = new LinkedHashSet<>(entry.getValue());
                MethodWrapper[] existingHandlers = this.eventHandlers.getOrDefault(eventType, new MethodWrapper[0]);
                handlers.addAll(Arrays.asList(existingHandlers));
                this.eventHandlers.put(eventType, this.sortHandlersByPriority(handlers.toArray(existingHandlers)));
            }
        }
    }

    public void unsubscribe(Module module) {
        Map<Class<? extends Event>, List<MethodWrapper>> moduleHandlers = this.moduleEventHandlers.get(module.getClass());
        if (moduleHandlers != null) {
            for (Entry<Class<? extends Event>, List<MethodWrapper>> entry : moduleHandlers.entrySet()) {
                Class<? extends Event> eventType = entry.getKey();
                List<MethodWrapper> handlersToRemove = entry.getValue();
                Set<MethodWrapper> existingHandlers = new LinkedHashSet<>(Arrays.asList(this.eventHandlers.getOrDefault(eventType, new MethodWrapper[0])));
                existingHandlers.removeAll(handlersToRemove);
                this.eventHandlers.put(eventType, existingHandlers.toArray(new MethodWrapper[0]));
            }
        }

        this.cleanEventHandlers();
    }

    public void register(Object listener) {
        if (listener != null) {
            for (Class<?> moduleClass = listener.getClass(); moduleClass != null; moduleClass = moduleClass.getSuperclass()) {
                for (Method method : moduleClass.getDeclaredMethods()) {
                    if (this.isEventMethod(method)) {
                        method.setAccessible(true);
                        Priority priority = this.getMethodPriority(method);
                        Class<? extends Event> eventType = (Class<? extends Event>) method.getParameterTypes()[0];
                        MethodWrapper[] handlers = this.eventHandlers.computeIfAbsent(eventType, k -> new MethodWrapper[0]);

                        MethodWrapper handler = new MethodWrapper(listener, method, priority);
                        if (this.shouldRegisterHandler(handlers, moduleClass, handler)) {
                            boolean shouldExcludeMethod = Module.class.isAssignableFrom(moduleClass) && !method.isAnnotationPresent(Class5631.class);
                            if (!shouldExcludeMethod) {
                                handlers = Arrays.copyOf(handlers, handlers.length + 1);
                                handlers[handlers.length - 1] = handler;
                                this.eventHandlers.put(eventType, this.sortHandlersByPriority(handlers));
                            } else if (handler.getTrue()) { //IF THIS IS SET TO FALSE MODULES WONT FUNCTION!!!
                                Map<Class<? extends Event>, List<MethodWrapper>> moduleHandlers = this.moduleEventHandlers.getOrDefault(moduleClass, new HashMap<Class<? extends Event>, List<MethodWrapper>>());
                                List<MethodWrapper> handlerList = moduleHandlers.computeIfAbsent(eventType, k -> new ArrayList<>());

                                handlerList.add(handler);
                                moduleHandlers.put(eventType, handlerList);
                                this.moduleEventHandlers.put((Class<? extends Module>) moduleClass, moduleHandlers);
                            }
                        }
                    }
                }
            }
        }
    }

    public void cleanEventHandlers() {
        this.eventHandlers.values().removeIf(handlers -> handlers.length == 0);
    }

    public void call(Event event) {
        if (event != null) {
            MethodWrapper[] handlers = this.eventHandlers.get(event.getClass());
            if (handlers != null) {
                int handlerLength = handlers.length;

                try {
                    for (int i = 0; i < handlerLength; i++) {
                        MethodWrapper handler = handlers[i];
                        if (handler.getReflection() != null) {
                            handler.getReflection().method31519(handler.getParent(), event);
                        } else {
                            System.out.println("null ->  " + handler.getParent());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Client.getInstance().getLogger().error("An unhandled exception occured in an event handler's function");
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
