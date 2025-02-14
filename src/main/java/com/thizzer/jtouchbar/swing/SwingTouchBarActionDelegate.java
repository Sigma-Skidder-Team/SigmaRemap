package com.thizzer.jtouchbar.swing;

import com.thizzer.jtouchbar.item.view.TouchBarButton;
import com.thizzer.jtouchbar.item.view.TouchBarView;
import com.thizzer.jtouchbar.item.view.action.TouchBarViewAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Objects;

public class SwingTouchBarActionDelegate implements TouchBarViewAction {
    private static final String PROPERTY_NAME_ENABLED = "enabled";
    private final Action action;
    private final PropertyChangeListener propertyChangeListener;

    public SwingTouchBarActionDelegate(Action action, TouchBarButton touchBarButton) {
        Objects.requireNonNull(action, "action");
        Objects.requireNonNull(touchBarButton, "touchBarButton");
        this.action = action;
        this.propertyChangeListener = event -> {
            if ("enabled".equals(event.getPropertyName())) {
                touchBarButton.fireActionStateChanged();
            }
        };
        this.action.addPropertyChangeListener(this.propertyChangeListener);
    }

    public void destroy() {
        this.action.removePropertyChangeListener(this.propertyChangeListener);
    }

    public boolean isOnEDT() {
        return SwingUtilities.isEventDispatchThread();
    }

    public ActionEvent getActionEvent() {
        return new ActionEvent(this, 0, null);
    }

    @Override
    public void onCall(TouchBarView view) {
        if (this.isOnEDT()) {
            this.callAction();
        } else {
            SwingUtilities.invokeLater(this::callAction);
        }
    }

    private void callAction() {
        this.action.actionPerformed(this.getActionEvent());
    }

    @Override
    public boolean isEnabled() {
        return this.action.isEnabled();
    }
}
