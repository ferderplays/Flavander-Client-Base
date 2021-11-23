package net.ferderplays.FlavenderCB.modules;

import net.ferderplays.FlavenderCB.fcb;
import net.ferderplays.FlavenderCB.modules.*;

public class module extends fcb {
    public static String module;
    public static boolean toggled;
    public static int keyBind;

    public module(String name, int key) {
        this.keyBind = key;

    }

    public boolean isEnabled() {
        return toggled;
    }

    public int getKey() {
        return keyBind;
    }

    public void toggle() {
        toggled = !toggled;
        if (toggled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {
        this.getKey();
        this.module.setEnabled(toggle());
    }

    public void onDisable() {

    }
}